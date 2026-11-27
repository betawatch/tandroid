// default package

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x07 extends c79 {
    public final /* synthetic */ e17 c;

    public x07(e17 e17Var) {
        this.c = e17Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 0;
    }

    public final void E(List list) {
        e17 e17Var = this.c;
        ArrayList arrayList = e17Var.c;
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
            p(!e17Var.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override // j79
    public final int b() {
        e17 e17Var = this.c;
        return ((e17Var.c.isEmpty() || !e17Var.x) ? 0 : 1) + e17Var.c.size() + (!e17Var.B ? 1 : 0);
    }

    @Override // j79
    public final int d(int i) {
        e17 e17Var = this.c;
        if (i != 0 || e17Var.B) {
            return (i == b() + (-1) && !e17Var.c.isEmpty() && e17Var.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        e17 e17Var = this.c;
        ArrayList arrayList = e17Var.c;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            if (i2 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        s07 s07Var = (s07) view;
        int i3 = i - (!e17Var.B ? 1 : 0);
        LongSparseArray longSparseArray = e17Var.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i3);
        boolean z = i3 != arrayList.size() - 1 || e17Var.x;
        ema emaVar = s07Var.d;
        s07Var.e = tL_chatInviteImporter;
        s07Var.f = z;
        s07Var.setWillNotDraw(!z);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        rb0 rb0Var = s07Var.a;
        rb0Var.q(user);
        s07Var.b.f(user, rb0Var);
        s07Var.c.l(lbc.r(user), false);
        String s = ob6.s(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            emaVar.l(ob6.M0(2131748823, null), false);
            return;
        }
        long j = tL_chatInviteImporter.approved_by;
        if (j == 0) {
            emaVar.l(ob6.a0("RequestedToJoinAt", null, 2131745887, s), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j);
        if (user2 != null) {
            emaVar.l(ob6.a0("AddedBy", null, 2131754354, lbc.k(user2, true), s), false);
        } else {
            emaVar.l("", false);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        e17 e17Var = this.c;
        boolean z = e17Var.a;
        if (i != 1) {
            byte b = 2;
            if (i == 2) {
                t62 t62Var = new t62(viewGroup.getContext(), (byte) 12);
                t62Var.setTag(-33024);
                view = t62Var;
            } else if (i == 3) {
                view = new View(viewGroup.getContext());
            } else if (i != 4) {
                view = new s07(viewGroup.getContext(), e17Var, z);
            } else {
                e eVar = e17Var.g;
                rl2 rl2Var = new rl2(eVar.getParentActivity(), eVar.getResourceProvider(), b);
                if (e17Var.B) {
                    yob.h(aob.d6, eVar.getResourceProvider(), rl2Var);
                }
                rl2Var.e(aob.d6, aob.a7, -1);
                rl2Var.setViewType(15);
                rl2Var.setMemberRequestButton(z);
                rl2Var.setIsSingleCell(true);
                rl2Var.setItemsCount(1);
                rl2Var.setTag(-33024);
                view = rl2Var;
            }
        } else {
            view = new View(viewGroup.getContext());
        }
        return new n69(view);
    }
}
