from flask import Flask

flask = Flask(__name__)

@flask.route("/")
def hello():
    return "This is an awesome project as a Devops Engineer!"

if __name__ == "__main__":
    flask.run(host='0.0.0.0', port=5000)
