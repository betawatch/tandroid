// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tn0 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ao0 b;

    public /* synthetic */ tn0(ao0 ao0Var, byte b) {
        this.a = b;
        this.b = ao0Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        ao0 ao0Var = this.b;
        switch (b) {
            case 0:
                ao0Var.dismiss();
                gl.d3(new rn0(ao0Var, (byte) 2), 220L);
                break;
            case 1:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                ao0Var.i2 = ao0Var.T1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                ao0Var.f1(true, true);
                ao0Var.e1(true);
                break;
            case 3:
                ao0Var.dismiss();
                gl.d3(new rn0(ao0Var, b2), 220L);
                break;
            case 4:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                ArrayList arrayList = ao0Var.a2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                ao0Var.f1(true, true);
                break;
            default:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
