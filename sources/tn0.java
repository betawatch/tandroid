// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ao0 b;

    public /* synthetic */ tn0(ao0 ao0Var, byte b) {
        this.a = b;
        this.b = ao0Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        ao0 ao0Var = this.b;
        switch (b) {
            case 0:
                ao0Var.dismiss();
                hl.d3(new rn0(ao0Var, (byte) 2), 220L);
                break;
            case 1:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                ao0Var.i2 = ao0Var.T1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                ao0Var.g1(true, true);
                ao0Var.f1(true);
                break;
            case 3:
                ao0Var.dismiss();
                hl.d3(new rn0(ao0Var, b2), 220L);
                break;
            case 4:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                ArrayList arrayList = ao0Var.a2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                ao0Var.g1(true, true);
                break;
            default:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
