package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class s {
    public final t a;
    public final Surface b;
    public volatile boolean d;
    public volatile r e;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile boolean c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int k = -1;
    public float l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.a = tVar;
        this.b = surface;
        this.g = i10;
        this.f = i10;
    }
}
