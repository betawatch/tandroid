// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xm5 extends em5 {
    @Override // fm5
    public final /* bridge */ /* synthetic */ fm5 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final ym5 g() {
        int i = this.b;
        if (i == 0) {
            int i2 = ym5.c;
            return d69.s;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            ym5 p = ym5.p(i, objArr);
            this.b = p.size();
            this.c = true;
            return p;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = ym5.c;
        return new tia(obj);
    }
}
