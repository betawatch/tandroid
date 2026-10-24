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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.iq0;
import s4.b1;
import sg.k1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class f extends lm0 {
    public final /* synthetic */ k c;

    public f(k kVar) {
        this.c = kVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(b1 b1Var) {
        return b1Var.f == 0;
    }

    public final void E(List list) {
        k kVar = this.c;
        ArrayList arrayList = kVar.c;
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
            s(!kVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override // s4.g0
    public final int h() {
        k kVar = this.c;
        return ((kVar.c.isEmpty() || !kVar.x) ? 0 : 1) + kVar.c.size() + (!kVar.B ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        k kVar = this.c;
        if (i10 != 0 || kVar.B) {
            return (i10 == h() + (-1) && !kVar.c.isEmpty() && kVar.x) ? 4 : 0;
        }
        return 2;
    }

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        k kVar = this.c;
        ArrayList arrayList = kVar.c;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            if (i11 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        f5 f5Var = (f5) view;
        int i12 = i10 - (!kVar.B ? 1 : 0);
        LongSparseArray longSparseArray = kVar.d;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
        boolean z10 = i12 != arrayList.size() - 1 || kVar.x;
        n5 n5Var = f5Var.d;
        f5Var.e = tL_chatInviteImporter;
        f5Var.f = z10;
        f5Var.setWillNotDraw(!z10);
        TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
        h9 h9Var = f5Var.a;
        h9Var.r(user);
        f5Var.b.e(user, h9Var);
        f5Var.c.l(UserObject.getUserName(user), false);
        String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
        if (tL_chatInviteImporter.via_chatlist) {
            n5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            n5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            n5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            n5Var.l("", false);
        }
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        View view;
        k kVar = this.c;
        boolean z10 = kVar.a;
        if (i10 == 1) {
            view = new View(viewGroup.getContext());
        } else if (i10 == 2) {
            k1 k1Var = new k1(viewGroup.getContext(), 1);
            k1Var.setTag(-33024);
            view = k1Var;
        } else if (i10 == 3) {
            view = new View(viewGroup.getContext());
        } else if (i10 != 4) {
            view = new f5(viewGroup.getContext(), kVar, z10);
        } else {
            o2 o2Var = kVar.g;
            iq0 iq0Var = new iq0(o2Var.getParentActivity(), 1, o2Var.getResourceProvider());
            if (kVar.B) {
                r6.i(k6.d6, iq0Var, o2Var.getResourceProvider());
            }
            iq0Var.e(k6.d6, k6.a7, -1);
            iq0Var.setViewType(15);
            iq0Var.setMemberRequestButton(z10);
            iq0Var.setIsSingleCell(true);
            iq0Var.setItemsCount(1);
            iq0Var.setTag(-33024);
            view = iq0Var;
        }
        return new wl0(view);
    }
}
