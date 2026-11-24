// default package

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q07 extends q59 {
    public final /* synthetic */ x07 c;

    public q07(x07 x07Var) {
        this.c = x07Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
    }

    public final void E(List list) {
        x07 x07Var = this.c;
        ArrayList arrayList = x07Var.c;
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
            p(!x07Var.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override // y59
    public final int b() {
        x07 x07Var = this.c;
        return ((x07Var.c.isEmpty() || !x07Var.x) ? 0 : 1) + x07Var.c.size() + (!x07Var.B ? 1 : 0);
    }

    @Override // y59
    public final int d(int i) {
        x07 x07Var = this.c;
        if (i != 0 || x07Var.B) {
            return (i == b() + (-1) && !x07Var.c.isEmpty() && x07Var.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        x07 x07Var = this.c;
        ArrayList arrayList = x07Var.c;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        l07 l07Var = (l07) view;
        int i3 = i - (!x07Var.B ? 1 : 0);
        LongSparseArray longSparseArray = x07Var.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i3);
        boolean z = i3 != arrayList.size() - 1 || x07Var.x;
        lka lkaVar = l07Var.d;
        l07Var.e = tL_chatInviteImporter;
        l07Var.f = z;
        l07Var.setWillNotDraw(!z);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        pc0 pc0Var = l07Var.a;
        pc0Var.q(user);
        l07Var.b.f(user, pc0Var);
        l07Var.c.l(m9c.r(user), false);
        String s = jb6.s(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            lkaVar.l(jb6.M0(2131748826, null), false);
            return;
        }
        long j = tL_chatInviteImporter.approved_by;
        if (j == 0) {
            lkaVar.l(jb6.a0("RequestedToJoinAt", null, 2131745893, s), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j);
        if (user2 != null) {
            lkaVar.l(jb6.a0("AddedBy", null, 2131754358, m9c.k(user2, true), s), false);
        } else {
            lkaVar.l("", false);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        x07 x07Var = this.c;
        boolean z = x07Var.a;
        if (i != 1) {
            byte b = 2;
            if (i == 2) {
                o72 o72Var = new o72(viewGroup.getContext(), (byte) 12);
                o72Var.setTag(-33024);
                view = o72Var;
            } else if (i == 3) {
                view = new View(viewGroup.getContext());
            } else if (i != 4) {
                view = new l07(viewGroup.getContext(), x07Var, z);
            } else {
                d dVar = x07Var.g;
                jm2 jm2Var = new jm2(dVar.getParentActivity(), dVar.getResourceProvider(), b);
                if (x07Var.B) {
                    anb.h(cmb.c6, dVar.getResourceProvider(), jm2Var);
                }
                jm2Var.e(cmb.c6, cmb.Z6, -1);
                jm2Var.setViewType(15);
                jm2Var.setMemberRequestButton(z);
                jm2Var.setIsSingleCell(true);
                jm2Var.setItemsCount(1);
                jm2Var.setTag(-33024);
                view = jm2Var;
            }
        } else {
            view = new View(viewGroup.getContext());
        }
        return new b59(view);
    }
}
