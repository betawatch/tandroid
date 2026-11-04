package zh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import gi.q2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.u8;
import u4.d1;
import vg.g1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends sj0 {
    public final /* synthetic */ k c;

    public f(k kVar) {
        this.c = kVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(d1 d1Var) {
        return d1Var.f == 0;
    }

    public final void E(List list) {
        k kVar = this.c;
        ArrayList arrayList = kVar.c;
        boolean isEmpty = arrayList.isEmpty();
        int i3 = 0;
        while (i3 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i3)).user_id;
            int i10 = i3 + 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id == j10) {
                    list.remove(i3);
                    i3--;
                    break;
                }
                i10++;
            }
            i3++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            o(!kVar.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override // u4.h0
    public final int b() {
        k kVar = this.c;
        return ((kVar.c.isEmpty() || !kVar.x) ? 0 : 1) + kVar.c.size() + (!kVar.B ? 1 : 0);
    }

    @Override // u4.h0
    public final int d(int i3) {
        k kVar = this.c;
        if (i3 != 0 || kVar.B) {
            return (i3 == b() + (-1) && !kVar.c.isEmpty() && kVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // u4.h0
    public final void t(d1 d1Var, int i3) {
        k kVar = this.c;
        ArrayList arrayList = kVar.c;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        e5 e5Var = (e5) view;
        int i11 = i3 - (!kVar.B ? 1 : 0);
        LongSparseArray longSparseArray = kVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
        boolean z10 = i11 != arrayList.size() - 1 || kVar.x;
        k5 k5Var = e5Var.d;
        e5Var.e = tL_chatInviteImporter;
        e5Var.f = z10;
        e5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        u8 u8Var = e5Var.a;
        u8Var.r(user);
        e5Var.b.e(user, u8Var);
        e5Var.c.l(l10.p(user), false);
        String s6 = bd.s(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            k5Var.l(bd.M0(2131749077, null), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            k5Var.l(bd.a0("RequestedToJoinAt", null, 2131746170, s6), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            k5Var.l(bd.a0("AddedBy", null, 2131754361, l10.j(user2, true), s6), false);
        } else {
            k5Var.l("", false);
        }
    }

    @Override // u4.h0
    public final d1 x(ViewGroup viewGroup, int i3) {
        View view;
        k kVar = this.c;
        boolean z10 = kVar.a;
        if (i3 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i3 == 2) {
            g1 g1Var = new g1(viewGroup.getContext(), 1);
            g1Var.setTag(-33024);
            view = g1Var;
        } else if (i3 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i3 != 4) {
            view = new e5(viewGroup.getContext(), kVar, z10);
        } else {
            d2 d2Var = kVar.g;
            q2 q2Var = new q2(2, d2Var.getParentActivity(), d2Var.getResourceProvider());
            if (kVar.B) {
                r6.i(k6.d6, q2Var, d2Var.getResourceProvider());
            }
            q2Var.e(k6.d6, k6.a7, -1);
            q2Var.setViewType(15);
            q2Var.setMemberRequestButton(z10);
            q2Var.setIsSingleCell(true);
            q2Var.setItemsCount(1);
            q2Var.setTag(-33024);
            view = q2Var;
        }
        return new bj0(view);
    }
}
