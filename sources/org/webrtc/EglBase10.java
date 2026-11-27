package org.webrtc;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public interface EglBase10 extends EglBase {

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public interface Context extends EglBase.Context {
        EGLContext getRawContext();
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public interface EglConnection extends EglBase.EglConnection {
        EGLConfig getConfig();

        EGLContext getContext();

        EGLDisplay getDisplay();

        EGL10 getEgl();
    }
}
