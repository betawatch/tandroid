package td;

import android.graphics.RectF;
import g7.n;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements Comparable {
    public final Object a;
    public int b;
    public final k c;
    public final k d;
    public final l e;
    public final k f;
    public boolean h = false;

    public e(int i9, Object obj, boolean z10) {
        this.a = obj;
        this.b = i9;
        this.d = new k(z10 ? 1.0f : 0.0f);
        this.c = new k(i9);
        this.e = new l();
        this.f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.c.c(z10);
        this.d.c(z10);
        this.e.c(z10);
        this.f.c(z10);
        Object obj = this.a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.e;
        RectF rectF = lVar.e;
        rectF.set(lVar.a.a, lVar.b.a, lVar.c.a, lVar.d.a);
        return rectF;
    }

    public final float c() {
        return n.a(this.d.a, 0.0f, 1.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((e) obj).b);
    }
}
