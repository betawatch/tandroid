package ug;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
