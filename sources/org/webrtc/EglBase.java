package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import j3.r0;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = e.a().createConfigAttributes();
    public static final int[] CONFIG_RGBA = e.a().setHasAlphaChannel(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_BUFFER = e.a().setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = e.a().setHasAlphaChannel(true).setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_RECORDABLE = e.a().setIsRecordable(true).createConfigAttributes();

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            int i9 = this.openGlesVersion;
            if (i9 == 2 || i9 == 3) {
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
            }
            return iArr;
        }

        public ConfigBuilder setHasAlphaChannel(boolean z10) {
            this.hasAlphaChannel = z10;
            return this;
        }

        public ConfigBuilder setIsRecordable(boolean z10) {
            this.isRecordable = z10;
            return this;
        }

        public ConfigBuilder setOpenGlesVersion(int i9) {
            if (i9 < 1 || i9 > 3) {
                throw new IllegalArgumentException(r0.m(i9, "OpenGL ES version ", " not supported"));
            }
            this.openGlesVersion = i9;
            return this;
        }

        public ConfigBuilder setSupportsPixelBuffer(boolean z10) {
            this.supportsPixelBuffer = z10;
            return this;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    void createBackgroundSurface(SurfaceTexture surfaceTexture);

    void createDummyPbufferSurface();

    void createPbufferSurface(int i9, int i10);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasBackgroundSurface();

    boolean hasSurface();

    void makeBackgroundCurrent();

    void makeCurrent();

    void release();

    void releaseSurface(boolean z10);

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers(long j10, boolean z10);

    void swapBuffers(boolean z10);
}
