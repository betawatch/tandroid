// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class q7c {
    public static final ow5 a = new ow5("UNDEFINED", (byte) 1);
    public static final ow5 b = new ow5("REUSABLE_CLAIMED", (byte) 1);

    public static void a(int i, Object obj) {
        if (obj == null || b(i, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(qd4.y(obj.getClass().getName(), " cannot be cast to ", uh9.k(i, "kotlin.jvm.functions.Function")));
        ur5.d(classCastException, q7c.class.getName());
        throw classCastException;
    }

    public static boolean b(int i, Object obj) {
        if (obj instanceof js4) {
            if ((obj instanceof ss4 ? ((ss4) obj).getArity() : obj instanceof sr4 ? 0 : obj instanceof ur4 ? 1 : obj instanceof is4 ? 2 : obj instanceof ks4 ? 3 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static final void c(zw2 zw2Var, Object obj) {
        if (!(zw2Var instanceof yo3)) {
            zw2Var.resumeWith(obj);
            return;
        }
        yo3 yo3Var = (yo3) zw2Var;
        px2 px2Var = yo3Var.d;
        ax2 ax2Var = yo3Var.e;
        Throwable a2 = he9.a(obj);
        Object yp2Var = a2 == null ? obj : new yp2(a2, false);
        if (px2Var.d(ax2Var.getContext())) {
            yo3Var.f = yp2Var;
            yo3Var.c = 1;
            px2Var.c(ax2Var.getContext(), yo3Var);
            return;
        }
        z44 a3 = crb.a();
        if (a3.c >= 4294967296L) {
            yo3Var.f = yp2Var;
            yo3Var.c = 1;
            ls lsVar = a3.e;
            if (lsVar == null) {
                lsVar = new ls();
                a3.e = lsVar;
            }
            lsVar.addLast(yo3Var);
            return;
        }
        a3.g(true);
        try {
            ev5 ev5Var = (ev5) ax2Var.getContext().get(qf5.c);
            if (ev5Var == null || ev5Var.isActive()) {
                Object obj2 = yo3Var.h;
                mx2 context = ax2Var.getContext();
                Object c = xhd.c(context, obj2);
                x8c c2 = c != xhd.a ? g4e.c(ax2Var, context, c) : null;
                try {
                    ax2Var.resumeWith(obj);
                } finally {
                    if (c2 == null || c2.S()) {
                        xhd.a(context, c);
                    }
                }
            } else {
                yo3Var.resumeWith(ixe.a(ev5Var.getCancellationException()));
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
