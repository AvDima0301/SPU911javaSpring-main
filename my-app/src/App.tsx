import React from 'react';
import { Routes, Route } from "react-router-dom";
//import logo from './logo.svg';
import './App.css';
import HomePage from './components/Home';
import DefaultLayout from './components/containers/DefaultLayout';

function App() {
  return (
    <>
      <Routes>    {/*creating a set of route*/}
        <Route path="/" element={<DefaultLayout/>}>   {/*creating obj with dafault component*/}
          <Route index element={<HomePage />} />    {/*creating obj with Home component*/}
        </Route>
      </Routes>
    </>
  );
}

export default App;
