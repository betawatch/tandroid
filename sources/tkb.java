// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tkb {
    public int a;
    public int b = -1;
    public byte c;
    public float d;
    public WeakReference e;
    public wjb f;
    public int g;
    public PorterDuff.Mode h;
    public PorterDuffColorFilter i;
    public WeakReference j;
    public boolean k;
    public byte l;
    public boolean m;
    public wkb n;
    public xkb o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        return weakReference != null && weakReference.get() == null;
    }

    public final int b() {
        int i = this.a;
        int i2 = this.b;
        byte b = this.c;
        float f = this.d;
        wjb wjbVar = this.f;
        if (wjbVar == null) {
            WeakReference weakReference = this.e;
            wjbVar = weakReference != null ? (wjb) weakReference.get() : null;
        }
        return zkb.P(i, i2, b, f, wjbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i, int i2, int i3, float f, wjb wjbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        if (wjbVar == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = wjbVar.getClass();
        if (cls.isSynthetic() || cls.getName().contains("$$Lambda") || cls.getName().contains("$$ExternalSynthetic")) {
            this.e = null;
            this.f = wjbVar;
        } else {
            this.e = new WeakReference(wjbVar);
            this.f = null;
        }
    }
}
