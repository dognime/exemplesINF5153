/* Copyright 2015 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.jberger.patterns.abstfactory.abstractfactory;

class ChromeTextField implements TextField {

    private String classProperty = "";
    private String id = "";
    private String name = "";
    private String placeholder = "";
    
    public ChromeTextField(String name, String placeholder) {
        this.name = name;
        this.placeholder = placeholder;
    }
    
    @Override
    public void setClass(String value) {
        classProperty = value;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getAsHTML() {
        return "<chrome:input type='text' name='" + name + "' placeholder='" + placeholder + "'" + printId() + printClass() + ">";
    }
    
    private String printId() {
        if (id.length() > 0) {
            return " id='" + id + "'";
        } else {
            return "";
        }
    }
    
    private String printClass() {
        if (classProperty.length() > 0) {
            return " class='" + classProperty + "'";
        } else {
            return "";
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }
}