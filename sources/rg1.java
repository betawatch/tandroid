// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rg1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nh1 b;

    public /* synthetic */ rg1(nh1 nh1Var, byte b) {
        this.a = b;
        this.b = nh1Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        nh1 nh1Var = this.b;
        switch (b) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                nh1Var.F = wallPaper;
                nh1Var.G = wallPaper;
                nh1Var.H = wallPaper;
                nh1Var.d1(false);
                nh1Var.g1(false);
                gl.e3(new sg1(nh1Var, (byte) 1), 350L);
                break;
            case 1:
                nh1Var.W0((ng1) obj);
                break;
            default:
                nh1Var.c1((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
