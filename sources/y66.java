// default package

import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y66 implements Comparable {
    public final Object a;
    public int b;
    public final adc c;
    public final adc d;
    public final bdc e;
    public final adc f;
    public boolean h = false;

    public y66(int i, Object obj, boolean z) {
        this.a = obj;
        this.b = i;
        this.d = new adc(z ? 1.0f : 0.0f);
        this.c = new adc(i);
        this.e = new bdc();
        this.f = new adc(0.0f);
        a(false);
    }

    public final void a(boolean z) {
        this.c.c(z);
        this.d.c(z);
        this.e.c(z);
        this.f.c(z);
        Object obj = this.a;
        if (obj instanceof bdc) {
            ((bdc) obj).c(z);
        }
    }

    public final RectF b() {
        bdc bdcVar = this.e;
        RectF rectF = bdcVar.e;
        rectF.set(bdcVar.a.a, bdcVar.b.a, bdcVar.c.a, bdcVar.d.a);
        return rectF;
    }

    public final float c() {
        return ete.a(this.d.a, 0.0f, 1.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((y66) obj).b);
    }
}
