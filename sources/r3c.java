// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class r3c {
    public static final lo5 a = new lo5("UNDEFINED");
    public static final lo5 b = new lo5("REUSABLE_CLAIMED");

    public static void a(int i, Object obj) {
        if (obj == null || b(i, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(tb4.y(obj.getClass().getName(), " cannot be cast to ", de9.k(i, "kotlin.jvm.functions.Function")));
        rp5.d(classCastException, r3c.class.getName());
        throw classCastException;
    }

    public static boolean b(int i, Object obj) {
        if (obj instanceof fq4) {
            if ((obj instanceof oq4 ? ((oq4) obj).getArity() : obj instanceof op4 ? 0 : obj instanceof qp4 ? 1 : obj instanceof eq4 ? 2 : obj instanceof gq4 ? 3 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static final void c(fw2 fw2Var, Object obj) {
        if (!(fw2Var instanceof ho3)) {
            fw2Var.resumeWith(obj);
            return;
        }
        ho3 ho3Var = (ho3) fw2Var;
        vw2 vw2Var = ho3Var.d;
        gw2 gw2Var = ho3Var.e;
        Throwable a2 = ta9.a(obj);
        Object fp2Var = a2 == null ? obj : new fp2(a2, false);
        if (vw2Var.d(gw2Var.getContext())) {
            ho3Var.f = fp2Var;
            ho3Var.c = 1;
            vw2Var.c(gw2Var.getContext(), ho3Var);
            return;
        }
        d44 a3 = dnb.a();
        if (a3.c >= 4294967296L) {
            ho3Var.f = fp2Var;
            ho3Var.c = 1;
            ks ksVar = a3.e;
            if (ksVar == null) {
                ksVar = new ks();
                a3.e = ksVar;
            }
            ksVar.addLast(ho3Var);
            return;
        }
        a3.g(true);
        try {
            bt5 bt5Var = (bt5) gw2Var.getContext().get(pd5.c);
            if (bt5Var == null || bt5Var.isActive()) {
                Object obj2 = ho3Var.h;
                sw2 context = gw2Var.getContext();
                Object c = edd.c(context, obj2);
                y4c c2 = c != edd.a ? qzd.c(gw2Var, context, c) : null;
                try {
                    gw2Var.resumeWith(obj);
                } finally {
                    if (c2 == null || c2.S()) {
                        edd.a(context, c);
                    }
                }
            } else {
                ho3Var.resumeWith(qse.a(bt5Var.getCancellationException()));
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
