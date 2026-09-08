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
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.xq0;
import s4.c1;
import sg.m1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        f5 f5Var = (f5) view;
        int i12 = i10 - (!nVar.B ? 1 : 0);
        LongSparseArray longSparseArray = nVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z10 = i12 != arrayList.size() - 1 || nVar.x;
        j5 j5Var = f5Var.d;
        f5Var.e = tL_chatInviteImporter;
        f5Var.f = z10;
        f5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        i9 i9Var = f5Var.a;
        i9Var.r(user);
        f5Var.b.e(user, i9Var);
        f5Var.c.l(UserObject.getUserName(user), false);
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
            m1 m1Var = new m1(viewGroup.getContext(), 1);
            m1Var.setTag(-33024);
            view = m1Var;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new f5(viewGroup.getContext(), nVar, z10);
        } else {
            n2 n2Var = nVar.g;
            xq0 xq0Var = new xq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
            if (nVar.B) {
                xq0Var.setBackgroundColor(j6.v0(j6.d6, n2Var.getResourceProvider()));
            }
            xq0Var.f(j6.d6, j6.a7, -1);
            xq0Var.setViewType(15);
            xq0Var.setMemberRequestButton(z10);
            xq0Var.setIsSingleCell(true);
            xq0Var.setItemsCount(1);
            xq0Var.setTag(-33024);
            view = xq0Var;
        }
        return new vk0(view);
    }
}
