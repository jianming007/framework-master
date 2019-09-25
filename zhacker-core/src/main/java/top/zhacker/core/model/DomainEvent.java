//   Copyright 2012,2013 Vaughn Vernon
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package top.zhacker.core.model;

import java.util.Date;

/***
 * 领域事件接口
 */
public interface DomainEvent {
    /** 获取事件版本*/
    default int getEventVersion(){
        return eventVersion();
    }
    /** 时间*/
    default Date getOccurredOn(){
        return occurredOn();
    }

    default int eventVersion() {
        return getEventVersion();
    }

    default Date occurredOn() {
        return getOccurredOn();
    }
}
