package te;

import android.graphics.RectF;
import c8.j9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e implements Comparable {
    public final Object a;
    public int b;
    public final k c;
    public final k d;
    public final l e;
    public final k f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z9) {
        this.a = obj;
        this.b = i7;
        this.d = new k(z9 ? 1.0f : 0.0f);
        this.c = new k(i7);
        this.e = new l();
        this.f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z9) {
        this.c.c(z9);
        this.d.c(z9);
        this.e.c(z9);
        this.f.c(z9);
        Object obj = this.a;
        if (obj instanceof l) {
            ((l) obj).c(z9);
        }
    }

    public final RectF b() {
        l lVar = this.e;
        RectF rectF = lVar.e;
        rectF.set(lVar.a.a, lVar.b.a, lVar.c.a, lVar.d.a);
        return rectF;
    }

    public final float c() {
        return j9.a(this.d.a, 0.0f, 1.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((e) obj).b);
    }
}
