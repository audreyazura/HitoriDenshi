/*
 * Copyright (C) 2021 audreyazura
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

module hitoridenshi
{
    requires albanlafuente.physicstools;
    requires com.github.kilian;
    requires java.logging;
    requires net.opentsdb.tools;
    requires nu.studer.java.util;
    requires org.nevec.rjm;
    
    requires javafx.controls;
    requires javafx.fxml;
    
    opens hitoridenshi.guimanager to javafx.fxml;
    
    exports hitoridenshi.guimanager to javafx.graphics;
}
