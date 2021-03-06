/*
 * Copyright (C) 2016 chengchang
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
package sshwind.guessword;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import com.sshwind.*;
import java.util.List;

/**
 *
 * @author chengchang
 */
@ManagedBean
public class ParamBean implements Serializable{

    private String wordTemplate;
    private String availableLetters;
    
    private List<Word> result;

    public ParamBean(){
        wordTemplate = "*****";
        availableLetters = "";
    }
    
    /**
     * @return the wordTemplate
     */
    public String getWordTemplate() {
        return wordTemplate;
    }

    /**
     * @param wordTemplate the wordTemplate to set
     */
    public void setWordTemplate(String wordTemplate) {
        this.wordTemplate = wordTemplate;
    }

    /**
     * @return the availableLetters
     */
    public String getAvailableLetters() {
        return availableLetters;
    }

    /**
     * @param availableLetters the availableLetters to set
     */
    public void setAvailableLetters(String availableLetters) {
        this.availableLetters = availableLetters;
    }
    
    public void search(){
        setResult(GuessWord.listWords(wordTemplate, availableLetters));
    }

    /**
     * @return the result
     */
    public List<Word> getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(List<Word> result) {
        this.result = result;
    }
}
