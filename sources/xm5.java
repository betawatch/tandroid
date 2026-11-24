// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
