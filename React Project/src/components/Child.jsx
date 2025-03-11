import React from "react";

const Child = ({ title, body }) => {
  return (
    <li className="list-group-item">
      <h5>{title}</h5>
      <p>{body}</p>
    </li>
  );
};

export default Child;
