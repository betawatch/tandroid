package wh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.sq0;
import rg.k1;
import s4.c1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class g extends yl0 {
    public final /* synthetic */ n c;

    public g(n nVar) {
        this.c = nVar;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(c1 c1Var) {
        return c1Var.f == 0;
    }

    public final void E(List list) {
        n nVar = this.c;
        ArrayList arrayList = nVar.c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = 0;
        while (i10 < list.size()) {
            long j3 = ((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id;
            int i11 = i10 + 1;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((TLRPC.TL_chatInviteImporter) list.get(i11)).user_id == j3) {
                    list.remove(i10);
                    i10--;
                    break;
                }
                i11++;
            }
            i10++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            s(!nVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override // s4.h0
    public final int h() {
        n nVar = this.c;
        return ((nVar.c.isEmpty() || !nVar.x) ? 0 : 1) + nVar.c.size() + (!nVar.B ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        n nVar = this.c;
        if (i10 != 0 || nVar.B) {
            return (i10 == h() + (-1) && !nVar.c.isEmpty() && nVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(c1 c1Var, int i10) {
        n nVar = this.c;
        ArrayList arrayList = nVar.c;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        g5 g5Var = (g5) view;
        int i12 = i10 - (!nVar.B ? 1 : 0);
        LongSparseArray longSparseArray = nVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z10 = i12 != arrayList.size() - 1 || nVar.x;
        i5 i5Var = g5Var.d;
        g5Var.e = tL_chatInviteImporter;
        g5Var.f = z10;
        g5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        h9 h9Var = g5Var.a;
        h9Var.r(user);
        g5Var.b.e(user, h9Var);
        g5Var.c.l(UserObject.getUserName(user), false);
        String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            i5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j3 = tL_chatInviteImporter.approved_by;
        if (j3 == 0) {
            i5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
        if (user2 != null) {
            i5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            i5Var.l("", false);
        }
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        View view;
        n nVar = this.c;
        boolean z10 = nVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            k1 k1Var = new k1(viewGroup.getContext(), 1);
            k1Var.setTag(-33024);
            view = k1Var;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new g5(viewGroup.getContext(), nVar, z10);
        } else {
            n2 n2Var = nVar.g;
            sq0 sq0Var = new sq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
            if (nVar.B) {
                sq0Var.setBackgroundColor(i6.v0(i6.d6, n2Var.getResourceProvider()));
            }
            sq0Var.f(i6.d6, i6.a7, -1);
            sq0Var.setViewType(15);
            sq0Var.setMemberRequestButton(z10);
            sq0Var.setIsSingleCell(true);
            sq0Var.setItemsCount(1);
            sq0Var.setTag(-33024);
            view = sq0Var;
        }
        return new il0(view);
    }
}
