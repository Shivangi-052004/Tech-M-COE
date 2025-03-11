import React, { useState } from "react";
import Child from "./Child";

const Parent = () => {
    const [data] = useState([
      { id: 1, title: "Self-Defense Awareness", body: "Learning basic self-defense techniques can help women stay prepared and confident in unsafe situations." },
      { id: 2, title: "Importance of Emergency Contacts", body: "Keeping emergency numbers saved and easily accessible can be a lifesaver in case of distress or danger." },
      { id: 3, title: "Safe Use of Technology", body: "Be cautious while sharing personal information online and always verify unknown contacts before interacting with them." },
      { id: 4, title: "Public Transport Safety", body: "Always be aware of your surroundings, avoid isolated places, and share ride details with a trusted person while traveling alone." },
      { id: 5, title: "Legal Rights and Helplines", body: "Knowing laws related to women's safety, such as harassment protection and helpline numbers, can help in seeking immediate support." }
    ]);
  

  const [formData, setFormData] = useState("");

  // Handle Form Input Change
  const handleChange = (e) => {
    setFormData(e.target.value);
  };

  // Handle Form Submission
  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Your response is recorded: ${formData}`);
    setFormData("");
  };

  return (
    <div className="container mt-4">
      <h2 className="text-primary">Say which is your favorite fact</h2>

      {/* Display English Content */}
      <ul className="list-group">
        {data.map((item) => (
          <Child key={item.id} title={item.title} body={item.body} />
        ))}
      </ul>

      {/* Form Handling */}
      <form onSubmit={handleSubmit} className="mt-4">
        <input 
          type="text"
          className="form-control mb-2"
          placeholder="Enter something..."
          value={formData}
          onChange={handleChange}
        />
        <button type="submit" className="btn btn-success">Submit</button>
      </form>
    </div>
  );
};

export default Parent;
