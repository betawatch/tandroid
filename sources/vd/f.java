package vd;

import android.graphics.RectF;
import i7.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements Comparable {
    public final Object a;
    public int b;
    public final l c;
    public final l d;
    public final m e;
    public final l f;
    public boolean h = false;

    public f(int i10, Object obj, boolean z10) {
        this.a = obj;
        this.b = i10;
        this.d = new l(z10 ? 1.0f : 0.0f);
        this.c = new l(i10);
        this.e = new m();
        this.f = new l(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f.c(z10);
        Object obj = this.a;
        if (obj instanceof m) {
            ((m) obj).c(z10);
        }
    }

    public final RectF b() {
        m mVar = this.e;
        RectF rectF = mVar.e;
        rectF.set(mVar.a.a, mVar.b.a, mVar.c.a, mVar.d.a);
        return rectF;
    }

    public final float c() {
        return w.a(this.d.a, 0.0f, 1.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((f) obj).b);
    }
}
