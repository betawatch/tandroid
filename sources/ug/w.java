package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ w(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                b0Var.dismiss();
                AndroidUtilities.runOnUIThread(new u(b0Var, 2), 220L);
                break;
            case 1:
                b0 b0Var2 = this.b;
                b0Var2.q0.b(false);
                j.j(b0Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                b0 b0Var3 = this.b;
                b0Var3.n0 = b0Var3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                b0Var3.a0(true, true);
                b0Var3.Z(true);
                break;
            case 3:
                b0 b0Var4 = this.b;
                b0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new u(b0Var4, 1), 220L);
                break;
            case 4:
                b0 b0Var5 = this.b;
                b0Var5.q0.b(false);
                j.j(b0Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                b0 b0Var6 = this.b;
                ArrayList arrayList = b0Var6.f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                b0Var6.a0(true, true);
                break;
            default:
                b0 b0Var7 = this.b;
                b0Var7.q0.b(false);
                j.j(b0Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
