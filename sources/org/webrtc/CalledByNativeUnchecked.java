package org.webrtc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface CalledByNativeUnchecked {
    String value() default "";
}
