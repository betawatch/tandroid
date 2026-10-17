package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ t(y yVar, int i10) {
        this.a = i10;
        this.b = yVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                y yVar = this.b;
                yVar.dismiss();
                AndroidUtilities.runOnUIThread(new r(yVar, 2), 220L);
                break;
            case 1:
                y yVar2 = this.b;
                yVar2.q0.b(false);
                h.j(yVar2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                y yVar3 = this.b;
                yVar3.n0 = yVar3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                yVar3.b0(true, true);
                yVar3.a0(true);
                break;
            case 3:
                y yVar4 = this.b;
                yVar4.dismiss();
                AndroidUtilities.runOnUIThread(new r(yVar4, 1), 220L);
                break;
            case 4:
                y yVar5 = this.b;
                yVar5.q0.b(false);
                h.j(yVar5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                y yVar6 = this.b;
                ArrayList arrayList = yVar6.f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                yVar6.b0(true, true);
                break;
            default:
                y yVar7 = this.b;
                yVar7.q0.b(false);
                h.j(yVar7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
