// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class vie {
    public static final void a(va1 va1Var, zw2 zw2Var, boolean z) {
        Object r = va1Var.r();
        Throwable f = va1Var.f(r);
        Object ge9Var = f != null ? new ge9(f) : va1Var.g(r);
        if (!z) {
            zw2Var.resumeWith(ge9Var);
            return;
        }
        zw2Var.getClass();
        yo3 yo3Var = (yo3) zw2Var;
        ax2 ax2Var = yo3Var.e;
        Object obj = yo3Var.h;
        mx2 context = ax2Var.getContext();
        Object c = xhd.c(context, obj);
        x8c c2 = c != xhd.a ? g4e.c(ax2Var, context, c) : null;
        try {
            ax2Var.resumeWith(ge9Var);
            if (c2 == null || c2.S()) {
                xhd.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.S()) {
                xhd.a(context, c);
            }
            throw th;
        }
    }
}
