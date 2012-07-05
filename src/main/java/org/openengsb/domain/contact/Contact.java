/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.domain.contact;

import java.util.Date;
import java.util.List;

import org.openengsb.core.api.Constants;
import org.openengsb.core.api.model.annotation.Model;
import org.openengsb.core.api.model.annotation.OpenEngSBModelId;
import org.openengsb.labs.delegation.service.Provide;

/**
 * Represents a contact with all their necessary informations
 */
@Provide(context = { Constants.DELEGATION_CONTEXT_MODELS })
@Model
public class Contact {
    @OpenEngSBModelId
    private String id;
    private String name;
    private List<InformationTypeWithValue<String>> mails;
    private List<InformationTypeWithValue<String>> homepages;
    private List<InformationTypeWithValue<String>> telephones;
    private List<InformationTypeWithValue<Location>> locations;
    private List<InformationTypeWithValue<Date>> dates;
    private String comment;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<InformationTypeWithValue<String>> getMails() {
        return mails;
    }
    public void setMails(List<InformationTypeWithValue<String>> mails) {
        this.mails = mails;
    }
    public List<InformationTypeWithValue<String>> getHomepages() {
        return homepages;
    }
    public void setHomepages(List<InformationTypeWithValue<String>> homepages) {
        this.homepages = homepages;
    }
    public List<InformationTypeWithValue<String>> getTelephones() {
        return telephones;
    }
    public void setTelephones(List<InformationTypeWithValue<String>> telephones) {
        this.telephones = telephones;
    }
    public List<InformationTypeWithValue<Location>> getLocations() {
        return locations;
    }
    public void setLocations(List<InformationTypeWithValue<Location>> locations) {
        this.locations = locations;
    }
    public List<InformationTypeWithValue<Date>> getDates() {
        return dates;
    }
    public void setDates(List<InformationTypeWithValue<Date>> dates) {
        this.dates = dates;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
