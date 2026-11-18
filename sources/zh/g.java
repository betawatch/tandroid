package zh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import hi.r2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kj0;
import v4.f1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g extends bk0 {
    public final /* synthetic */ l c;

    public g(l lVar) {
        this.c = lVar;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(f1 f1Var) {
        return f1Var.f == 0;
    }

    public final void E(List list) {
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = 0;
        while (i7 < list.size()) {
            long j3 = ((TLRPC.TL_chatInviteImporter) list.get(i7)).user_id;
            int i10 = i7 + 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id == j3) {
                    list.remove(i7);
                    i7--;
                    break;
                }
                i10++;
            }
            i7++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            o(!lVar.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override // v4.i0
    public final int b() {
        l lVar = this.c;
        return ((lVar.c.isEmpty() || !lVar.x) ? 0 : 1) + lVar.c.size() + (!lVar.B ? 1 : 0);
    }

    @Override // v4.i0
    public final int d(int i7) {
        l lVar = this.c;
        if (i7 != 0 || lVar.B) {
            return (i7 == b() + (-1) && !lVar.c.isEmpty() && lVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // v4.i0
    public final void t(f1 f1Var, int i7) {
        l lVar = this.c;
        ArrayList arrayList = lVar.c;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 0) {
            if (i10 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        g5 g5Var = (g5) view;
        int i11 = i7 - (!lVar.B ? 1 : 0);
        LongSparseArray longSparseArray = lVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
        boolean z10 = i11 != arrayList.size() - 1 || lVar.x;
        n5 n5Var = g5Var.d;
        g5Var.e = tL_chatInviteImporter;
        g5Var.f = z10;
        g5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        b9 b9Var = g5Var.a;
        b9Var.r(user);
        g5Var.b.f(user, b9Var);
        g5Var.c.l(o10.q(user), false);
        String s5 = gd.s(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            n5Var.l(gd.M0(2131748877, null), false);
            return;
        }
        long j3 = tL_chatInviteImporter.approved_by;
        if (j3 == 0) {
            n5Var.l(gd.a0("RequestedToJoinAt", null, 2131745965, s5), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
        if (user2 != null) {
            n5Var.l(gd.a0("AddedBy", null, 2131754359, o10.k(user2, true), s5), false);
        } else {
            n5Var.l("", false);
        }
    }

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
        View view;
        l lVar = this.c;
        boolean z10 = lVar.a;
        if (i7 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i7 == 2) {
            f fVar = new f(viewGroup.getContext(), 0);
            fVar.setTag(-33024);
            view = fVar;
        } else if (i7 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i7 != 4) {
            view = new g5(viewGroup.getContext(), lVar, z10);
        } else {
            h2 h2Var = lVar.g;
            r2 r2Var = new r2(3, h2Var.getParentActivity(), h2Var.getResourceProvider());
            if (lVar.B) {
                u6.h(n6.d6, r2Var, h2Var.getResourceProvider());
            }
            r2Var.e(n6.d6, n6.a7, -1);
            r2Var.setViewType(15);
            r2Var.setMemberRequestButton(z10);
            r2Var.setIsSingleCell(true);
            r2Var.setItemsCount(1);
            r2Var.setTag(-33024);
            view = r2Var;
        }
        return new kj0(view);
    }
}
