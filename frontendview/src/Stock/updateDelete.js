import React, { useState, useEffect } from "react";
import axios from "axios";

function ListItemData(props) {
  let itemName;

  function removeItem() {
    console.log(props.item_Id);
    axios
      .post("http://localhost:8090/DeleteItems", { item_Id: props.item_Id })
      .then((response) => {
        if (response.data.error) {
          console.log(response.data.error);
          alert(response.data.error);
        } else {
        }
      });
  }

  function updateDatabase() {
    console.log(props.item_Id);
    axios
      .put("http://localhost:8090/UpdateItems", {
        item_Id: props.item_Id,
        item_Name: itemName,
      })
      .then((response) => {
        if (response.data.error) {
          console.log(response.data.error);
          alert(response.data.error);
        } else {
        }
      });
  }
  return (
    <tr>
      <td className="id">{props.item_Id}</td>
      <td className="name">{props.item_Name}</td>
      <td>
        <button className="delete" onClick={removeItem}>Delete</button>
        </td>
        <td>
        <input
          className="addItems"
          onChange={(event) => {
            itemName = event.target.value;
          }}
        ></input>
      </td>
      <td>
        <button className="update" onClick={updateDatabase}>Update</button>
      </td>
      
    </tr>
  );
}

export default ListItemData;
