package wg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public q(r rVar, Surface surface, int i3) {
        this.a = rVar;
        this.b = surface;
        this.g = i3;
        this.f = i3;
    }
}
