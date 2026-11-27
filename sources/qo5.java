// default package

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class qo5 extends ig0 implements Serializable {
    public final transient o99 e;
    public final transient int f;

    public qo5(o99 o99Var, int i) {
        this.e = o99Var;
        this.f = i;
    }

    @Override // r3
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // r3
    public final Collection e() {
        return new vo5(this);
    }

    @Override // r3
    public final Collection g() {
        return (jo5) super.g();
    }

    @Override // r3
    public final Iterator h() {
        return new uo5(this);
    }

    @Override // r3
    public final Collection i(Object obj) {
        po5 po5Var = (po5) this.e.get(obj);
        if (po5Var != null) {
            return po5Var;
        }
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // r3
    public final Set j() {
        o99 o99Var = this.e;
        bp5 bp5Var = o99Var.b;
        if (bp5Var != null) {
            return bp5Var;
        }
        m99 d = o99Var.d();
        o99Var.b = d;
        return d;
    }

    @Override // r3
    public final boolean k(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // r3
    public final int l() {
        return this.f;
    }

    @Override // r3
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public to5 a() {
        return this.e;
    }
}
