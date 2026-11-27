package org.webrtc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface VideoFrameBufferType {
    public static final int I010 = 5;
    public static final int I210 = 6;
    public static final int I410 = 7;
    public static final int I420 = 1;
    public static final int I420A = 2;
    public static final int I422 = 3;
    public static final int I444 = 4;
    public static final int NATIVE = 0;
    public static final int NV12 = 8;
}
