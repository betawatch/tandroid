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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.xq0;
import rg.j1;
import s4.d1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g extends pm0 {
    public final /* synthetic */ l c;

    public g(l lVar) {
        this.c = lVar;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(d1 d1Var) {
        return d1Var.f == 0;
    }

    public final void E(List list) {
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
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
            s(!lVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override // s4.i0
    public final int h() {
        l lVar = this.c;
        return ((lVar.c.isEmpty() || !lVar.x) ? 0 : 1) + lVar.c.size() + (!lVar.B ? 1 : 0);
    }

    @Override // s4.i0
    public final int j(int i10) {
        l lVar = this.c;
        if (i10 != 0 || lVar.B) {
            return (i10 == h() + (-1) && !lVar.c.isEmpty() && lVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // s4.i0
    public final void v(d1 d1Var, int i10) {
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 != 0) {
            if (i11 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        g5 g5Var = (g5) view;
        int i12 = i10 - (!lVar.B ? 1 : 0);
        LongSparseArray longSparseArray = lVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z10 = i12 != arrayList.size() - 1 || lVar.x;
        j5 j5Var = g5Var.d;
        g5Var.e = tL_chatInviteImporter;
        g5Var.f = z10;
        g5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        j9 j9Var = g5Var.a;
        j9Var.r(user);
        g5Var.b.e(user, j9Var);
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

    @Override // s4.i0
    public final d1 x(ViewGroup viewGroup, int i10) {
        View view;
        l lVar = this.c;
        boolean z10 = lVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            j1 j1Var = new j1(viewGroup.getContext(), 1);
            j1Var.setTag(-33024);
            view = j1Var;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new g5(viewGroup.getContext(), lVar, z10);
        } else {
            n2 n2Var = lVar.g;
            xq0 xq0Var = new xq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
            if (lVar.B) {
                xq0Var.setBackgroundColor(i6.w0(i6.d6, n2Var.getResourceProvider()));
            }
            xq0Var.f(i6.d6, i6.a7, -1);
            xq0Var.setViewType(15);
            xq0Var.setMemberRequestButton(z10);
            xq0Var.setIsSingleCell(true);
            xq0Var.setItemsCount(1);
            xq0Var.setTag(-33024);
            view = xq0Var;
        }
        return new am0(view);
    }
}
