package ug;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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

    public r(s sVar, Surface surface, int i10) {
        this.a = sVar;
        this.b = surface;
        this.g = i10;
        this.f = i10;
    }
}
