// default package

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rrc {
    public final src a;
    public final Surface b;
    public volatile boolean d;
    public volatile qrc e;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile boolean c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int k = -1;
    public float l = -1.0f;

    public rrc(src srcVar, Surface surface, int i) {
        this.a = srcVar;
        this.b = surface;
        this.g = i;
        this.f = i;
    }
}
