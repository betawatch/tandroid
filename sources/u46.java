// default package

import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class u46 implements Comparable {
    public final Object a;
    public int b;
    public final a9c c;
    public final a9c d;
    public final b9c e;
    public final a9c f;
    public boolean h = false;

    public u46(int i, Object obj, boolean z) {
        this.a = obj;
        this.b = i;
        this.d = new a9c(z ? 1.0f : 0.0f);
        this.c = new a9c(i);
        this.e = new b9c();
        this.f = new a9c(0.0f);
        a(false);
    }

    public final void a(boolean z) {
        this.c.c(z);
        this.d.c(z);
        this.e.c(z);
        this.f.c(z);
        Object obj = this.a;
        if (obj instanceof b9c) {
            ((b9c) obj).c(z);
        }
    }

    public final RectF b() {
        b9c b9cVar = this.e;
        RectF rectF = b9cVar.e;
        rectF.set(b9cVar.a.a, b9cVar.b.a, b9cVar.c.a, b9cVar.d.a);
        return rectF;
    }

    public final float c() {
        return moe.a(this.d.a, 0.0f, 1.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((u46) obj).b);
    }
}
