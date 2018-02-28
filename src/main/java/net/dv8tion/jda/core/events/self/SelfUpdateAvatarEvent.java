/*
 *     Copyright 2015-2018 Austin Keener & Michael Ritter & Florian Spieß
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.core.events.self;

import net.dv8tion.jda.core.JDA;

/**
 * Indicates that the avatar of the current user changed.
 *
 * <p>Can be used to retrieve the old avatar.
 */
public class SelfUpdateAvatarEvent extends GenericSelfUpdateEvent
{
    private final String oldAvatarId;

    public SelfUpdateAvatarEvent(JDA api, long responseNumber, String oldAvatarId)
    {
        super(api, responseNumber);
        this.oldAvatarId = oldAvatarId;
    }

    /**
     * The old avatar id
     *
     * @return The old avatar id
     */
    public String getOldAvatarId()
    {
        return oldAvatarId;
    }

    /**
     * The old avatar url
     *
     * @return  The old avatar url
     */
    public String getOldAvatarUrl()
    {
        return oldAvatarId == null ? null : "https://cdn.discordapp.com/avatars/" + getSelfUser().getId() + "/" + oldAvatarId + (oldAvatarId.startsWith("a_") ? ".gif" : ".png");
    }
}
