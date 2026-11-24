// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class umb {
    public int a;
    public int b = -1;
    public byte c;
    public float d;
    public WeakReference e;
    public ylb f;
    public int g;
    public PorterDuff.Mode h;
    public PorterDuffColorFilter i;
    public WeakReference j;
    public boolean k;
    public byte l;
    public boolean m;
    public xmb n;
    public ymb o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i = this.a;
        int i2 = this.b;
        byte b = this.c;
        float f = this.d;
        ylb ylbVar = this.f;
        if (ylbVar == null) {
            WeakReference weakReference = this.e;
            ylbVar = weakReference != null ? (ylb) weakReference.get() : null;
        }
        return anb.P(i, i2, b, f, ylbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, int i2, int i3, float f, ylb ylbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        if (ylbVar == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = ylbVar.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = ylbVar;
        } else {
            this.e = new WeakReference(ylbVar);
            this.f = null;
        }
    }
}
