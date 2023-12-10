import React, { Component } from "react";
import data from "./bookdata";

class Counter extends Component {
  constructor(props) {
    super(props);

    this.state = {
      val: 1,
      val1: 100,
      id: 1001,
      name: "suman kumar",
      data: [],
      book1: [],
    };
    this.counterChange = this.counterChange.bind(this);
  }

  render() {
    return (
      <div className="container mt-5">
        <div className="row">
          <div className="col">
            <div className="border border-primary p-5">
              <p>Array is {this.state.data.join(", ")}</p>
              <button
                type="button"
                className="btn btn-primary mr-2"
                onClick={this.addData}
              >
                Add data
              </button>
              <button
                type="button"
                className="btn btn-danger"
                onClick={this.removeData}
              >
                Remove data
              </button>
            </div>
          </div>
        </div>

        <div className="row mt-3">
          <div className="col">
            <div className="border border-primary p-5">
              <p>Count is {this.state.val}</p>
              <button
                type="button"
                className="btn btn-primary"
                onClick={this.counterChange}
              >
                Increment
              </button>
            </div>
          </div>
          <div className="col">
            <div className="border border-primary p-5">
              <p>Count is {this.state.val1}</p>
              <button
                type="button"
                className="btn btn-primary"
                onClick={this.counterChange1}
              >
                Decrement
              </button>
            </div>
          </div>
        </div>

        <div className="row mt-3">
          <div className="col">
            <div className="border border-primary p-5">
              <p>ID is {this.state.id}</p>
              <p>Name is {this.state.name}</p>
              <button
                type="button"
                className="btn btn-primary"
                onClick={this.dataChange}
              >
                Change Above Data
              </button>
            </div>
          </div>
        </div>

        <div className="row mt-3">
          <div className="col">
            <div className="border border-primary p-5">
              <div>
                <h2>Employee Book</h2>
                <table className="table table-striped">
                  <thead>
                    <tr>
                      <th>ISBN</th>
                      <th>Name</th>
                      <th>Cost</th>
                    </tr>
                  </thead>
                  <tbody>
                    {this.state.book1.map((a, index) => (
                      <tr key={index}>
                        <td>{a.isbn}</td>
                        <td>{a.name}</td>
                        <td>{a.cost}</td>
                      </tr>
                    ))}
                  </tbody>
                </table>
              </div>
              <button
                type="button"
                className="btn btn-primary"
                onClick={this.bookData}
              >
                Show Employee Data
              </button>
            </div>
          </div>
        </div>
      </div>
    );
  }

  dataChange = () => {
    this.setState({
      id: 70001,
      name: "parahlad kumar",
    });
  };
  counterChange = () => {
    this.setState({
      val: this.state.val + 1,
    });
  };
  counterChange1 = () => {
    this.setState({
      val1: this.state.val1 - 1,
    });
  };

  bookData = () => {
    this.setState({
      book1: data,
    });
  };

  addData = () => {
    var item = "hello ";
    var dataarray = this.state.data.slice();
    dataarray.push(item);
    this.setState({
      data: dataarray,
    });
  };
  bookData1 = () => {
    this.setState({
      book1: [],
    });
  };
  removeData = () => {
    var dataarray = this.state.data.slice();
    dataarray.pop();
    this.setState({
      data: dataarray,
    });
  };
}
export default Counter;
