// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zh1 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vi1 b;

    public /* synthetic */ zh1(vi1 vi1Var, byte b) {
        this.a = b;
        this.b = vi1Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        vi1 vi1Var = this.b;
        switch (b) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                vi1Var.F = wallPaper;
                vi1Var.G = wallPaper;
                vi1Var.H = wallPaper;
                vi1Var.e1(false);
                vi1Var.h1(false);
                gm.d3(new ai1(vi1Var, (byte) 1), 350L);
                break;
            case 1:
                vi1Var.X0((vh1) obj);
                break;
            default:
                vi1Var.d1((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
