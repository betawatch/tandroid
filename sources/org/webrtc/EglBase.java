package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public interface EglBase {
    public static final int[] CONFIG_PIXEL_BUFFER;
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER;
    public static final int[] CONFIG_PLAIN;
    public static final int[] CONFIG_RECORDABLE;
    public static final int[] CONFIG_RGBA;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static class ConfigBuilder {
        private boolean hasAlphaChannel;
        private boolean isRecordable;
        private int openGlesVersion = 2;
        private boolean supportsPixelBuffer;

        public int[] createConfigAttributes() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(12324);
            arrayList.add(8);
            arrayList.add(12323);
            arrayList.add(8);
            arrayList.add(12322);
            arrayList.add(8);
            if (this.hasAlphaChannel) {
                arrayList.add(12321);
                arrayList.add(8);
            }
            int i = this.openGlesVersion;
            if (i == 2 || i == 3) {
                arrayList.add(12352);
                arrayList.add(Integer.valueOf(this.openGlesVersion == 3 ? 64 : 4));
            }
            if (this.supportsPixelBuffer) {
                arrayList.add(12339);
                arrayList.add(1);
            }
            if (this.isRecordable) {
                arrayList.add(Integer.valueOf(EglBase.EGL_RECORDABLE_ANDROID));
                arrayList.add(1);
            }
            arrayList.add(12344);
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            return iArr;
        }

        public ConfigBuilder setHasAlphaChannel(boolean z) {
            this.hasAlphaChannel = z;
            return this;
        }

        public ConfigBuilder setIsRecordable(boolean z) {
            this.isRecordable = z;
            return this;
        }

        public ConfigBuilder setOpenGlesVersion(int i) {
            if (i < 1 || i > 3) {
                w26.j(tb4.n(i, "OpenGL ES version ", " not supported"));
                return null;
            }
            this.openGlesVersion = i;
            return this;
        }

        public ConfigBuilder setSupportsPixelBuffer(boolean z) {
            this.supportsPixelBuffer = z;
            return this;
        }
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    static {
        int i = c.a;
        CONFIG_PLAIN = new ConfigBuilder().createConfigAttributes();
        CONFIG_RGBA = new ConfigBuilder().setHasAlphaChannel(true).createConfigAttributes();
        CONFIG_PIXEL_BUFFER = new ConfigBuilder().setSupportsPixelBuffer(true).createConfigAttributes();
        CONFIG_PIXEL_RGBA_BUFFER = new ConfigBuilder().setHasAlphaChannel(true).setSupportsPixelBuffer(true).createConfigAttributes();
        CONFIG_RECORDABLE = new ConfigBuilder().setIsRecordable(true).createConfigAttributes();
    }

    void createBackgroundSurface(SurfaceTexture surfaceTexture);

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasBackgroundSurface();

    boolean hasSurface();

    void makeBackgroundCurrent();

    void makeCurrent();

    void release();

    void releaseSurface(boolean z);

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers(long j, boolean z);

    void swapBuffers(boolean z);
}
