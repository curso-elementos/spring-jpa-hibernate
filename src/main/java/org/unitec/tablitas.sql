/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  rapid
 * Created: 11/06/2016
 */

CREATE TABLE MENSAJE (ID_MENSAJE INTEGER, PRIMARY KEY AUTO_INCREMENT, TITULO VARCHAR(80), CUERPO VARCHAR(200));
--La misma tabla pero en Oracle
CREATE TABLE MENSAJE(ID_MENSAJE INTEGER, TITULO VARCHAR2(80), CUERPO VARCHAR2(200),
CONSTRAINT PK_MENSAJE PRIMARY KEY (ID_MENSAJE));

select * from mensaje