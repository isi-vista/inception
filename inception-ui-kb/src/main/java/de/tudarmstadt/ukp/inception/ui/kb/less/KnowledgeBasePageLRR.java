/*
 * Copyright 2017
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.inception.ui.kb.less;

import de.agilecoders.wicket.less.LessResourceReference;

public class KnowledgeBasePageLRR extends LessResourceReference {

    private static final long serialVersionUID = -5906752913389722261L;
    private static final KnowledgeBasePageLRR INSTANCE = new KnowledgeBasePageLRR();

    /**
     * Gets the instance of the resource reference
     *
     * @return the single instance of the resource reference
     */
    public static KnowledgeBasePageLRR get() {
        return INSTANCE;
    }

    /**
     * Private constructor
     */
    private KnowledgeBasePageLRR() {
        super(KnowledgeBasePageLRR.class, "inception-ui-kbp.less");
    }
}
