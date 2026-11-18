package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
