// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ppd {
    public static ad3 a(ax2 ax2Var, eq4 eq4Var) {
        ad3 ad3Var = new ad3(qzd.b(ax2Var, z14.a), true);
        ad3Var.R(dx2.a, ad3Var, eq4Var);
        return ad3Var;
    }

    public static xma b(ax2 ax2Var, eq4 eq4Var) {
        xma xmaVar = new xma(qzd.b(ax2Var, z14.a), true);
        xmaVar.R(dx2.a, xmaVar, eq4Var);
        return xmaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(sw2 sw2Var, eq4 eq4Var, fw2 fw2Var) {
        Unsafe unsafe;
        long j;
        sw2 context = fw2Var.getContext();
        sw2 plus = !((Boolean) sw2Var.fold(Boolean.FALSE, new dm2((byte) 2))).booleanValue() ? context.plus(sw2Var) : qzd.a(context, sw2Var, false);
        nle.a(plus);
        if (plus == context) {
            rq9 rq9Var = new rq9(fw2Var, plus);
            return dxe.a(rq9Var, rq9Var, eq4Var);
        }
        vi2 vi2Var = vi2.b;
        if (rp5.a(plus.get(vi2Var), context.get(vi2Var))) {
            y4c y4cVar = new y4c(fw2Var, plus);
            sw2 sw2Var2 = y4cVar.d;
            Object c = edd.c(sw2Var2, null);
            try {
                return dxe.a(y4cVar, y4cVar, eq4Var);
            } finally {
                edd.a(sw2Var2, c);
            }
        }
        io3 io3Var = new io3(fw2Var, plus);
        try {
            r3c.c(dle.a(((of0) eq4Var).create(io3Var, io3Var)), g5c.a);
            do {
                unsafe = ex.a;
                j = io3.f;
                int intVolatile = unsafe.getIntVolatile(io3Var, j);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        sc8.j("Already suspended");
                        return null;
                    }
                    Object a = fad.a(io3Var.v());
                    if (a instanceof fp2) {
                        throw ((fp2) a).a;
                    }
                    return a;
                }
            } while (!unsafe.compareAndSwapInt(io3Var, j, 0, 1));
            return bx2.a;
        } catch (Throwable th) {
            io3Var.resumeWith(new sa9(th));
            throw th;
        }
    }
}
