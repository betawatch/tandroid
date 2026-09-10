package sg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ v(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                a0 a0Var = this.b;
                a0Var.dismiss();
                AndroidUtilities.runOnUIThread(new t(a0Var, 2), 220L);
                break;
            case 1:
                a0 a0Var2 = this.b;
                a0Var2.q0.b(false);
                i.j(a0Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                a0 a0Var3 = this.b;
                a0Var3.n0 = a0Var3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                a0Var3.a0(true, true);
                a0Var3.Z(true);
                break;
            case 3:
                a0 a0Var4 = this.b;
                a0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new t(a0Var4, 1), 220L);
                break;
            case 4:
                a0 a0Var5 = this.b;
                a0Var5.q0.b(false);
                i.j(a0Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                a0 a0Var6 = this.b;
                ArrayList arrayList = a0Var6.f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                a0Var6.a0(true, true);
                break;
            default:
                a0 a0Var7 = this.b;
                a0Var7.q0.b(false);
                i.j(a0Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
