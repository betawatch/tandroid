// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xe2 implements qob {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i22 b;
    public final /* synthetic */ zh1 c;

    public /* synthetic */ xe2(i22 i22Var, zh1 zh1Var, byte b) {
        this.a = b;
        this.b = i22Var;
        this.c = zh1Var;
    }

    @Override // qob
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        zh1 zh1Var = this.c;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                i22Var.H();
                zh1Var.a(wallPaper);
                break;
            default:
                i22Var.H();
                zh1Var.a(wallPaper);
                break;
        }
    }
}
