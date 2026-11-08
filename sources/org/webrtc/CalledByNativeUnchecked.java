package org.webrtc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface CalledByNativeUnchecked {
    String value() default "";
}
