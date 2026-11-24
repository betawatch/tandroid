// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r53 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x53 b;

    public /* synthetic */ r53(x53 x53Var, byte b) {
        this.a = b;
        this.b = x53Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x53 x53Var = this.b;
        switch (b) {
            case 0:
                x53Var.a.invalidate();
                break;
            default:
                su suVar = x53Var.c;
                if (suVar.getParent() != null) {
                    if (x53Var.d) {
                        gm.B2(suVar);
                    } else {
                        try {
                            x53Var.b.removeView(suVar);
                        } catch (Exception unused) {
                        }
                    }
                    pp8 pp8Var = x53Var.p;
                    if (pp8Var != null) {
                        pp8Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
