package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q {
    public final r a;
    public final Surface b;
    public volatile boolean d;
    public volatile p e;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile boolean c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int k = -1;
    public float l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.a = rVar;
        this.b = surface;
        this.g = i7;
        this.f = i7;
    }
}
