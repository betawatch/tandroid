package org.webrtc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Priority {
    public static final int HIGH = 3;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int VERY_LOW = 0;
}
