const getallpro = async (req, res) => {
  res.status("200").json([
    {
      number: 1,
      name: "John",
      gender: "male",
    },
    {
      number: 2,
      name: "Ashley",
      gender: "female",
    },
  ]);
};

const getallprotest = async (req, res) => {
  res.status("200").json([
    {
      number: 1,
      name: "shubham",
      gender: "male",
    },
    {
      number: 2,
      name: "nicole",
      gender: "female",
    },
  ]);
};

module.exports = { getallpro, getallprotest };
