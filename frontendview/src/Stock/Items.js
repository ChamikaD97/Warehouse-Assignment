import React, { useState, useEffect } from "react";
import "./items.css";
import axios from "axios";
import ListItemData from './updateDelete';


function Items() {
  const [ItemData, setItemData] = useState([]);
  const [Item_Name, setItemName] = useState("");

  async function getStore() {
    var rest = axios.get("http://localhost:8090/GetStoreItems");
    var data = (await rest).data;

    setItemData(data);
  }

  useEffect(() => {
    getStore();
  }, []);




  const addItem = () => {
    const data = {
      item_Id: 0,
      item_Name: Item_Name,
    };
    axios.post("http://localhost:8090/AddStoreItems", data).then((response) => {
      if (response.data.error) {
        console.log(response.data.error);
        alert(response.data.error);
      } else {
      }
    });
  };
   

  return (
    <>
      <div className="Items">
        <h1>Items</h1>
        <input
          className="addItems"
          onChange={(event) => {
            setItemName(event.target.value);
          }}
        ></input>
        <button className="add" onClick={addItem}>Add</button>
      
       
        <table className="table">
          <tr>
            <th>Item Id</th>
            <th>Item Name</th>
          </tr>
        {ItemData.map(ListItemData)}
        </table>
      </div>
    </>
  );
}

export default Items;
