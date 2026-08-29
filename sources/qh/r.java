package qh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ r(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        i0 i0Var = this.b;
        switch (i10) {
            case 0:
                i0Var.U((ArrayList) obj, true);
                break;
            case 1:
                i0.o(i0Var, (TLRPC.TL_error) obj2);
                break;
            case 2:
                i0.n(i0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                int i11 = i0.R;
                i0Var.U((ArrayList) obj, false);
                break;
            case 4:
                i0.A(i0Var, (ArrayList) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                o0 o0Var = i0Var.I;
                arrayList.add(w41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(w41.D(0, AndroidUtilities.dp(48.0f)));
                int i12 = 2;
                if (ChatObject.canBlockUsers(i0Var.f)) {
                    arrayList.add(w41.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new t(i0Var, i12)), true)));
                } else {
                    arrayList.add(w41.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(w41.j(2, i0Var.H));
                arrayList.add(w41.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", o0Var.l, new Object[0])));
                o0Var.c(arrayList);
                break;
        }
    }
}
