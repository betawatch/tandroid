// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j67 b;

    public /* synthetic */ u57(j67 j67Var, byte b) {
        this.a = b;
        this.b = j67Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        j67 j67Var = this.b;
        switch (b) {
            case 0:
                j67Var.l();
                break;
            case 1:
                j67Var.getClass();
                qna.f(false);
                qna qnaVar = j67Var.i0;
                if (qnaVar != null) {
                    qnaVar.b(j67Var.F);
                }
                gm.c3(new u57(j67Var, b2));
                break;
            case 2:
                qna.f(false);
                qna qnaVar2 = j67Var.i0;
                if (qnaVar2 != null) {
                    qnaVar2.b(j67Var.F);
                }
                gm.c3(new u57(j67Var, (byte) 3));
                break;
            default:
                j67Var.k();
                break;
        }
    }
}
