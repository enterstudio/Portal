/*
 *   Copyright 2010, Maarten Billemont
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.lyndir.lhunath.portal.apps.model;

import java.io.Serializable;


/**
 * <h2>{@link SourceProvider}<br> <sub>Providers of project development locations.</sub></h2>
 *
 * <p> [description / usage]. </p>
 *
 * <p> <i>Feb 3, 2010</i> </p>
 *
 * @author lhunath
 */
public interface SourceProvider extends Serializable {

    String getTitle();

    String getHomepage(App app);

    String findSnapshotLinkFor(AppVersion version);

    String findTreeLinkFor(AppVersion version);
}
