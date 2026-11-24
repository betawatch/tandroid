// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class r5c {
    public static final du2 a = new du2("UNDEFINED", (byte) 2);
    public static final du2 b = new du2("REUSABLE_CLAIMED", (byte) 2);

    public static void a(int i, Object obj) {
        if (obj == null || b(i, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(kt6.o(obj.getClass().getName(), " cannot be cast to ", hg9.j(i, "kotlin.jvm.functions.Function")));
        rr5.d(classCastException, r5c.class.getName());
        throw classCastException;
    }

    public static boolean b(int i, Object obj) {
        if (obj instanceof gs4) {
            if ((obj instanceof ps4 ? ((ps4) obj).getArity() : obj instanceof pr4 ? 0 : obj instanceof rr4 ? 1 : obj instanceof fs4 ? 2 : obj instanceof hs4 ? 3 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static final void c(px2 px2Var, Object obj) {
        if (!(px2Var instanceof rp3)) {
            px2Var.resumeWith(obj);
            return;
        }
        rp3 rp3Var = (rp3) px2Var;
        fy2 fy2Var = rp3Var.d;
        qx2 qx2Var = rp3Var.e;
        Throwable a2 = tc9.a(obj);
        Object qq2Var = a2 == null ? obj : new qq2(a2, false);
        if (fy2Var.d(qx2Var.getContext())) {
            rp3Var.f = qq2Var;
            rp3Var.c = 1;
            fy2Var.c(qx2Var.getContext(), rp3Var);
            return;
        }
        o54 a3 = epb.a();
        if (a3.c >= 4294967296L) {
            rp3Var.f = qq2Var;
            rp3Var.c = 1;
            lt ltVar = a3.e;
            if (ltVar == null) {
                ltVar = new lt();
                a3.e = ltVar;
            }
            ltVar.addLast(rp3Var);
            return;
        }
        a3.g(true);
        try {
            av5 av5Var = (av5) qx2Var.getContext().get(nf5.c);
            if (av5Var == null || av5Var.isActive()) {
                Object obj2 = rp3Var.h;
                cy2 context = qx2Var.getContext();
                Object c = gfd.c(context, obj2);
                y6c c2 = c != gfd.a ? t1e.c(qx2Var, context, c) : null;
                try {
                    qx2Var.resumeWith(obj);
                } finally {
                    if (c2 == null || c2.S()) {
                        gfd.a(context, c);
                    }
                }
            } else {
                rp3Var.resumeWith(tue.a(av5Var.getCancellationException()));
            }
            while (a3.i()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
