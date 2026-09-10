package vh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.xq0;
import s4.c1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i extends ul0 {
    public final /* synthetic */ p c;

    public i(p pVar) {
        this.c = pVar;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(c1 c1Var) {
        return c1Var.f == 0;
    }

    public final void E(List list) {
        p pVar = this.c;
        ArrayList arrayList = pVar.c;
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
            s(!pVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override // s4.h0
    public final int h() {
        p pVar = this.c;
        return ((pVar.c.isEmpty() || !pVar.x) ? 0 : 1) + pVar.c.size() + (!pVar.B ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        p pVar = this.c;
        if (i10 != 0 || pVar.B) {
            return (i10 == h() + (-1) && !pVar.c.isEmpty() && pVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(c1 c1Var, int i10) {
        p pVar = this.c;
        ArrayList arrayList = pVar.c;
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
        int i12 = i10 - (!pVar.B ? 1 : 0);
        LongSparseArray longSparseArray = pVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z10 = i12 != arrayList.size() - 1 || pVar.x;
        l5 l5Var = g5Var.d;
        g5Var.e = tL_chatInviteImporter;
        g5Var.f = z10;
        g5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        g9 g9Var = g5Var.a;
        g9Var.r(user);
        g5Var.b.e(user, g9Var);
        g5Var.c.l(UserObject.getUserName(user), false);
        String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            l5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j3 = tL_chatInviteImporter.approved_by;
        if (j3 == 0) {
            l5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
        if (user2 != null) {
            l5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            l5Var.l("", false);
        }
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        View view;
        p pVar = this.c;
        boolean z10 = pVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            h hVar = new h(viewGroup.getContext(), 0);
            hVar.setTag(-33024);
            view = hVar;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new g5(viewGroup.getContext(), pVar, z10);
        } else {
            p2 p2Var = pVar.g;
            xq0 xq0Var = new xq0(p2Var.getParentActivity(), 1, p2Var.getResourceProvider());
            if (pVar.B) {
                xq0Var.setBackgroundColor(j6.v0(j6.d6, p2Var.getResourceProvider()));
            }
            xq0Var.f(j6.d6, j6.a7, -1);
            xq0Var.setViewType(15);
            xq0Var.setMemberRequestButton(z10);
            xq0Var.setIsSingleCell(true);
            xq0Var.setItemsCount(1);
            xq0Var.setTag(-33024);
            view = xq0Var;
        }
        return new fl0(view);
    }
}
