package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r {
    public final s a;
    public final Surface b;
    public volatile boolean d;
    public volatile q e;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile boolean c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int k = -1;
    public float l = -1.0f;

    public r(s sVar, Surface surface, int i7) {
        this.a = sVar;
        this.b = surface;
        this.g = i7;
        this.f = i7;
    }
}
