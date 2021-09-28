# Eventos y Listeners en JAVA :coffee:
Los **eventos** son las acciones que puede realizar el usuario, al realizar un evento se produce una serie de acciones. Por ejemplo, si el usuario pulsa un boton llamado "*Salir*" se cerrará la aplicacion, otro ejemplo seria para la validación de datos puestos en un campo de texto.

## ActionListener
Se produce al hacer click en un componente, también si se pulsa Enter teniendo el foco en el componente.

```java
public void actionPerformed(ActionEvent e)
```

## KeyListener
Se produce al pulsar una tecla, según el método cambiara la forma de pulsar la tecla

```java
public void keyTyped(KeyEvent e) // Se usa al pulsar y soltar una tecla.
```

```java
public void keyPressed(KeyEvent e) // Se usa al pulsar una tecla.
```

```java
public void keyReleased(KeyEvent e) // Se usa al soltar una tecla.
```

## FocusListener
Se produce cuando un componente gana o pierte el enfoque, es decir, si se selecciona o deselecciona
```java
public void focusGained(FocusEvent e) // Se usa al recibir el enfoque.
```
```java
public void focusLost(FocusEvent e) // Se usa al perder el enfoque.
```

## MouseListener
Se produce cuando realizamos una acción con el ratón
```java
public void mouseClicked(MosueEvent e) // Se usa cuando se hace click y se suelta el mouse.
```

```java
public void mouseEntered(MosueEvent e) // Se usa cuando el puntero del mouse entra a un componente.
```

```java
public void mouseExited(MosueEvent e) // Se usa cuando el puntero del mouse sale de un componente.
```

```java
public void mousePressed(MosueEvent e) // Se usa cuando se presiona un botón.
```

```java
public void mouseReleased(MosueEvent e) // Se usa cuando se "suelta" el botón.
```

## MouseMotionListener
Se produce con el movimiento del mouse
```java
public void mouseDragged(MosueEvent e) // Se usa cuando se hace click y se arrastra un componente.
```

```java
public void mouseMoved(MosueEvent e) // Se usa cuando se mueve el puntero de mouse sobre un elemento.
```

---

# Añadir un nuevo evento:
```java
componente.add<tipo de evento>( new < tipo de evento >(){ 
    métodos del evento 
    } )
```

```java
boton1.addActionListener(new ActionListener(){
   public void actionPerformed (){
      //Acciones
   }
});
```