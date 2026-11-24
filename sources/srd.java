// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class srd {
    public static me3 a(ky2 ky2Var, fs4 fs4Var) {
        me3 me3Var = new me3(t1e.b(ky2Var, k34.a), true);
        me3Var.R(ny2.a, me3Var, fs4Var);
        return me3Var;
    }

    public static yoa b(ky2 ky2Var, fs4 fs4Var) {
        yoa yoaVar = new yoa(t1e.b(ky2Var, k34.a), true);
        yoaVar.R(ny2.a, yoaVar, fs4Var);
        return yoaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(cy2 cy2Var, fs4 fs4Var, px2 px2Var) {
        Unsafe unsafe;
        long j;
        cy2 context = px2Var.getContext();
        cy2 plus = !((Boolean) cy2Var.fold(Boolean.FALSE, new qn2((byte) 2))).booleanValue() ? context.plus(cy2Var) : t1e.a(context, cy2Var, false);
        pne.a(plus);
        if (plus == context) {
            ss9 ss9Var = new ss9(px2Var, plus);
            return fze.a(ss9Var, ss9Var, fs4Var);
        }
        jk2 jk2Var = jk2.b;
        if (rr5.a(plus.get(jk2Var), context.get(jk2Var))) {
            y6c y6cVar = new y6c(px2Var, plus);
            cy2 cy2Var2 = y6cVar.d;
            Object c = gfd.c(cy2Var2, null);
            try {
                return fze.a(y6cVar, y6cVar, fs4Var);
            } finally {
                gfd.a(cy2Var2, c);
            }
        }
        sp3 sp3Var = new sp3(px2Var, plus);
        try {
            r5c.c(fne.a(((og0) fs4Var).create(sp3Var, sp3Var)), g7c.a);
            do {
                unsafe = fy.a;
                j = sp3.f;
                int intVolatile = unsafe.getIntVolatile(sp3Var, j);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        dq9.m("Already suspended");
                        return null;
                    }
                    Object a = hcd.a(sp3Var.v());
                    if (a instanceof qq2) {
                        throw ((qq2) a).a;
                    }
                    return a;
                }
            } while (!unsafe.compareAndSwapInt(sp3Var, j, 0, 1));
            return ly2.a;
        } catch (Throwable th) {
            sp3Var.resumeWith(new sc9(th));
            throw th;
        }
    }
}
