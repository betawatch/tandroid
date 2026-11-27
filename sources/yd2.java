// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yd2 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oe2 b;

    public /* synthetic */ yd2(oe2 oe2Var, byte b) {
        this.a = b;
        this.b = oe2Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        oe2 oe2Var = this.b;
        switch (b) {
            case 0:
                oe2Var.Y1 = (TL_stories.TL_premium_boostsStatus) obj;
                oe2Var.X1 = true;
                oe2Var.V0(true);
                oe2Var.W1 = false;
                break;
            default:
                wg1 wg1Var = (wg1) obj;
                if (oe2Var.getContext() != null) {
                    zu1 zu1Var = oe2Var.u1;
                    l46 l46Var = new l46(22, oe2Var.a, oe2Var.J0, oe2Var.getContext(), zu1Var);
                    l46Var.s1(wg1Var);
                    l46Var.r1(oe2Var.Y1, true);
                    l46Var.t1(oe2Var.u1.a());
                    l46Var.L2 = new xd2(oe2Var, (byte) 2);
                    l46Var.show();
                    break;
                }
                break;
        }
    }
}
