package xh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.br0;
import s4.b1;
import sg.k1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class g extends lm0 {
    public final /* synthetic */ l c;

    public g(l lVar) {
        this.c = lVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(b1 b1Var) {
        return b1Var.f == 0;
    }

    public final void E(List list) {
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = 0;
        while (i10 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id;
            int i11 = i10 + 1;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((TLRPC.TL_chatInviteImporter) list.get(i11)).user_id == j10) {
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

    @Override // s4.g0
    public final int h() {
        l lVar = this.c;
        return ((lVar.c.isEmpty() || !lVar.x) ? 0 : 1) + lVar.c.size() + (!lVar.B ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        l lVar = this.c;
        if (i10 != 0 || lVar.B) {
            return (i10 == h() + (-1) && !lVar.c.isEmpty() && lVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
        int i11 = b1Var.f;
        View view = b1Var.a;
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
        h5 h5Var = g5Var.d;
        g5Var.e = tL_chatInviteImporter;
        g5Var.f = z10;
        g5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        k9 k9Var = g5Var.a;
        k9Var.r(user);
        g5Var.b.e(user, k9Var);
        g5Var.c.l(UserObject.getUserName(user), false);
        String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            h5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            h5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            h5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            h5Var.l("", false);
        }
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        View view;
        l lVar = this.c;
        boolean z10 = lVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            k1 k1Var = new k1(viewGroup.getContext(), 1);
            k1Var.setTag(-33024);
            view = k1Var;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new g5(viewGroup.getContext(), lVar, z10);
        } else {
            m2 m2Var = lVar.g;
            br0 br0Var = new br0(m2Var.getParentActivity(), 1, m2Var.getResourceProvider());
            if (lVar.B) {
                br0Var.setBackgroundColor(g6.w0(g6.d6, m2Var.getResourceProvider()));
            }
            br0Var.f(g6.d6, g6.a7, -1);
            br0Var.setViewType(15);
            br0Var.setMemberRequestButton(z10);
            br0Var.setIsSingleCell(true);
            br0Var.setItemsCount(1);
            br0Var.setTag(-33024);
            view = br0Var;
        }
        return new wl0(view);
    }
}
