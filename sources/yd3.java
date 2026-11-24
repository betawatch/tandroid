// default package

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface yd3 {
    int objectTypeIndication() default -1;

    int[] tags();
}
