/*
 * Cardinal-Components-API
 * Copyright (C) 2019-2020 OnyxStudios
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 */
package nerdhub.cardinal.components.api.component;

import nerdhub.cardinal.components.api.ComponentType;
import net.minecraft.class_5217;
import org.jetbrains.annotations.ApiStatus;

import javax.annotation.Nullable;

/**
 * A component factory for {@linkplain class_5217 world saves}.
 *
 * <p>When invoked, the factory can return either a {@link Component} of the right type, or {@code null}.
 * If the factory method returns {@code null}, the save properties object will not support that type of component
 * (cf. {@link ComponentProvider#hasComponent(ComponentType)}).
 *
 * @since 2.4.0
 */
@ApiStatus.Experimental
public interface LevelComponentFactory<C extends Component> {
    @Nullable
    C createForSave(class_5217 properties);
}
