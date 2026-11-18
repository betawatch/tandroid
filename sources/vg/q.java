package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
