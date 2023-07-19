const mongoose = require("mongoose");

uri =
  "mongodb+srv://shubham:aD0myrj5cSx3oQd8@shubham.bgytfc6.mongodb.net/shubham?retryWrites=true&w=majority";

const connectDB = () => {
  console.log("heloo");
  return mongoose.connect(uri, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  });
};

module.exports = connectDB;
