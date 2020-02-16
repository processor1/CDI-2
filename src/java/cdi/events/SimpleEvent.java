/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi.events;

import javax.enterprise.event.Event;

/**
 *
 * @author Mobile Apps
 */
public class SimpleEvent {
    
    
    Event<String> event;
    
    public void fireSimpleEvent(String string){
        event.fire(string);
    }
}
