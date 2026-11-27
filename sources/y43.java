// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
