// default package

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qy6 extends n39 {
    public final /* synthetic */ xy6 c;

    public qy6(xy6 xy6Var) {
        this.c = xy6Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 0;
    }

    public final void E(List list) {
        xy6 xy6Var = this.c;
        ArrayList arrayList = xy6Var.c;
        boolean isEmpty = arrayList.isEmpty();
        int i = 0;
        while (i < list.size()) {
            long j = ((TLRPC.TL_chatInviteImporter) list.get(i)).user_id;
            int i2 = i + 1;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((TLRPC.TL_chatInviteImporter) list.get(i2)).user_id == j) {
                    list.remove(i);
                    i--;
                    break;
                }
                i2++;
            }
            i++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            p(!xy6Var.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override // w39
    public final int b() {
        xy6 xy6Var = this.c;
        return ((xy6Var.c.isEmpty() || !xy6Var.x) ? 0 : 1) + xy6Var.c.size() + (!xy6Var.B ? 1 : 0);
    }

    @Override // w39
    public final int d(int i) {
        xy6 xy6Var = this.c;
        if (i != 0 || xy6Var.B) {
            return (i == b() + (-1) && !xy6Var.c.isEmpty() && xy6Var.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        xy6 xy6Var = this.c;
        ArrayList arrayList = xy6Var.c;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        ly6 ly6Var = (ly6) view;
        int i3 = i - (!xy6Var.B ? 1 : 0);
        LongSparseArray longSparseArray = xy6Var.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i3);
        boolean z = i3 != arrayList.size() - 1 || xy6Var.x;
        jia jiaVar = ly6Var.d;
        ly6Var.e = tL_chatInviteImporter;
        ly6Var.f = z;
        ly6Var.setWillNotDraw(!z);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        pb0 pb0Var = ly6Var.a;
        pb0Var.q(user);
        ly6Var.b.f(user, pb0Var);
        ly6Var.c.l(l7c.q(user), false);
        String s = k96.s(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            jiaVar.l(k96.M0(2131748877, null), false);
            return;
        }
        long j = tL_chatInviteImporter.approved_by;
        if (j == 0) {
            jiaVar.l(k96.a0("RequestedToJoinAt", null, 2131745967, s), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j);
        if (user2 != null) {
            jiaVar.l(k96.a0("AddedBy", null, 2131754358, l7c.k(user2, true), s), false);
        } else {
            jiaVar.l("", false);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        xy6 xy6Var = this.c;
        boolean z = xy6Var.a;
        if (i != 1) {
            byte b = 2;
            if (i == 2) {
                d62 d62Var = new d62(viewGroup.getContext(), (byte) 12);
                d62Var.setTag(-33024);
                view = d62Var;
            } else if (i == 3) {
                view = new View(viewGroup.getContext());
            } else if (i != 4) {
                view = new ly6(viewGroup.getContext(), xy6Var, z);
            } else {
                d dVar = xy6Var.g;
                xk2 xk2Var = new xk2(dVar.getParentActivity(), dVar.getResourceProvider(), b);
                if (xy6Var.B) {
                    zkb.h(bkb.c6, dVar.getResourceProvider(), xk2Var);
                }
                xk2Var.e(bkb.c6, bkb.Z6, -1);
                xk2Var.setViewType(15);
                xk2Var.setMemberRequestButton(z);
                xk2Var.setIsSingleCell(true);
                xk2Var.setItemsCount(1);
                xk2Var.setTag(-33024);
                view = xk2Var;
            }
        } else {
            view = new View(viewGroup.getContext());
        }
        return new y29(view);
    }
}
