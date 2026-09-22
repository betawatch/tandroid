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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.wq0;
import rg.i1;
import s4.c1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class g extends kl0 {
    public final /* synthetic */ n c;

    public g(n nVar) {
        this.c = nVar;
    }

    @Override // org.telegram.ui.Components.kl0
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
        j5 j5Var = g5Var.d;
        g5Var.e = tL_chatInviteImporter;
        g5Var.f = z10;
        g5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        f9 f9Var = g5Var.a;
        f9Var.r(user);
        g5Var.b.e(user, f9Var);
        g5Var.c.l(UserObject.getUserName(user), false);
        String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            j5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j3 = tL_chatInviteImporter.approved_by;
        if (j3 == 0) {
            j5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
        if (user2 != null) {
            j5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            j5Var.l("", false);
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
            i1 i1Var = new i1(viewGroup.getContext(), 1);
            i1Var.setTag(-33024);
            view = i1Var;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new g5(viewGroup.getContext(), nVar, z10);
        } else {
            n2 n2Var = nVar.g;
            wq0 wq0Var = new wq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
            if (nVar.B) {
                wq0Var.setBackgroundColor(i6.v0(i6.d6, n2Var.getResourceProvider()));
            }
            wq0Var.f(i6.d6, i6.a7, -1);
            wq0Var.setViewType(15);
            wq0Var.setMemberRequestButton(z10);
            wq0Var.setIsSingleCell(true);
            wq0Var.setItemsCount(1);
            wq0Var.setTag(-33024);
            view = wq0Var;
        }
        return new vk0(view);
    }
}
