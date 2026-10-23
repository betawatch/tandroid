package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ u(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                z zVar = this.b;
                zVar.dismiss();
                AndroidUtilities.runOnUIThread(new s(zVar, 2), 220L);
                break;
            case 1:
                z zVar2 = this.b;
                zVar2.q0.b(false);
                i.j(zVar2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                z zVar3 = this.b;
                zVar3.n0 = zVar3.Y.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                zVar3.b0(true, true);
                zVar3.a0(true);
                break;
            case 3:
                z zVar4 = this.b;
                zVar4.dismiss();
                AndroidUtilities.runOnUIThread(new s(zVar4, 1), 220L);
                break;
            case 4:
                z zVar5 = this.b;
                zVar5.q0.b(false);
                i.j(zVar5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                z zVar6 = this.b;
                ArrayList arrayList = zVar6.f0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                zVar6.b0(true, true);
                break;
            default:
                z zVar7 = this.b;
                zVar7.q0.b(false);
                i.j(zVar7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
