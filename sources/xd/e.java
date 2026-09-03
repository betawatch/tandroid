package xd;

import android.graphics.RectF;
import k7.n;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e implements Comparable {
    public final Object a;
    public int b;
    public final k c;
    public final k d;
    public final l e;
    public final k f;
    public boolean h = false;

    public e(int i10, Object obj, boolean z4) {
        this.a = obj;
        this.b = i10;
        this.d = new k(z4 ? 1.0f : 0.0f);
        this.c = new k(i10);
        this.e = new l();
        this.f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z4) {
        this.c.c(z4);
        this.d.c(z4);
        this.e.c(z4);
        this.f.c(z4);
        Object obj = this.a;
        if (obj instanceof l) {
            ((l) obj).c(z4);
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
