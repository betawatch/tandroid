// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class to0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ to0(ap0 ap0Var, byte b) {
        this.a = b;
        this.b = ap0Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        ap0 ap0Var = this.b;
        switch (b) {
            case 0:
                ap0Var.dismiss();
                gm.d3(new ro0(ap0Var, (byte) 2), 220L);
                break;
            case 1:
                ap0Var.l2.b(false);
                yn0.j(ap0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                ap0Var.i2 = ap0Var.T1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                ap0Var.f1(true, true);
                ap0Var.e1(true);
                break;
            case 3:
                ap0Var.dismiss();
                gm.d3(new ro0(ap0Var, b2), 220L);
                break;
            case 4:
                ap0Var.l2.b(false);
                yn0.j(ap0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                ArrayList arrayList = ap0Var.a2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                ap0Var.f1(true, true);
                break;
            default:
                ap0Var.l2.b(false);
                yn0.j(ap0Var.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
