/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidtest;

import java.util.List;

/**
 *
 * @author MIDO
 */
public interface PyramidCSVDAOInt {
     public List<Pyramid> readPyramidsFromCSV(String fileName);
     
}
