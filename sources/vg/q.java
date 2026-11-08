package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
