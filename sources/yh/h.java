package yh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import fi.s2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xi0;
import v4.d1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h extends oj0 {
    public final /* synthetic */ m c;

    public h(m mVar) {
        this.c = mVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(d1 d1Var) {
        return d1Var.f == 0;
    }

    public final void E(List list) {
        m mVar = this.c;
        ArrayList arrayList = mVar.c;
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
            o(!mVar.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override // v4.g0
    public final int b() {
        m mVar = this.c;
        return ((mVar.c.isEmpty() || !mVar.x) ? 0 : 1) + mVar.c.size() + (!mVar.B ? 1 : 0);
    }

    @Override // v4.g0
    public final int d(int i7) {
        m mVar = this.c;
        if (i7 != 0 || mVar.B) {
            return (i7 == b() + (-1) && !mVar.c.isEmpty() && mVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // v4.g0
    public final void t(d1 d1Var, int i7) {
        m mVar = this.c;
        ArrayList arrayList = mVar.c;
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
        int i11 = i7 - (!mVar.B ? 1 : 0);
        LongSparseArray longSparseArray = mVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
        boolean z9 = i11 != arrayList.size() - 1 || mVar.x;
        k5 k5Var = e5Var.d;
        e5Var.e = tL_chatInviteImporter;
        e5Var.f = z9;
        e5Var.setWillNotDraw(!z9);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        w8 w8Var = e5Var.a;
        w8Var.r(user);
        e5Var.b.e(user, w8Var);
        e5Var.c.l(t10.p(user), false);
        String s5 = hd.s(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            k5Var.l(hd.M0(2131749068, null), false);
            return;
        }
        long j3 = tL_chatInviteImporter.approved_by;
        if (j3 == 0) {
            k5Var.l(hd.a0("RequestedToJoinAt", null, 2131746161, s5), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
        if (user2 != null) {
            k5Var.l(hd.a0("AddedBy", null, 2131754361, t10.j(user2, true), s5), false);
        } else {
            k5Var.l("", false);
        }
    }

    @Override // v4.g0
    public final d1 x(ViewGroup viewGroup, int i7) {
        View view;
        m mVar = this.c;
        boolean z9 = mVar.a;
        if (i7 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i7 == 2) {
            g gVar = new g(viewGroup.getContext(), 0);
            gVar.setTag(-33024);
            view = gVar;
        } else if (i7 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i7 != 4) {
            view = new e5(viewGroup.getContext(), mVar, z9);
        } else {
            f2 f2Var = mVar.g;
            s2 s2Var = new s2(2, f2Var.getParentActivity(), f2Var.getResourceProvider());
            if (mVar.B) {
                r6.i(k6.d6, s2Var, f2Var.getResourceProvider());
            }
            s2Var.e(k6.d6, k6.a7, -1);
            s2Var.setViewType(15);
            s2Var.setMemberRequestButton(z9);
            s2Var.setIsSingleCell(true);
            s2Var.setItemsCount(1);
            s2Var.setTag(-33024);
            view = s2Var;
        }
        return new xi0(view);
    }
}
