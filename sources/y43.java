// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class y43 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e53 b;

    public /* synthetic */ y43(e53 e53Var, byte b) {
        this.a = b;
        this.b = e53Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e53 e53Var = this.b;
        switch (b) {
            case 0:
                e53Var.a.invalidate();
                break;
            default:
                tt ttVar = e53Var.c;
                if (ttVar.getParent() != null) {
                    if (e53Var.d) {
                        hl.B2(ttVar);
                    } else {
                        try {
                            e53Var.b.removeView(ttVar);
                        } catch (Exception unused) {
                        }
                    }
                    uk8 uk8Var = e53Var.p;
                    if (uk8Var != null) {
                        uk8Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
