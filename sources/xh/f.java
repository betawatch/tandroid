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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.hq0;
import s4.b1;
import sg.k1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class f extends hm0 {
    public final /* synthetic */ k c;

    public f(k kVar) {
        this.c = kVar;
    }

    @Override // org.telegram.ui.Components.hm0
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
        j5 j5Var = f5Var.d;
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
            j5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
            return;
        }
        long j10 = tL_chatInviteImporter.approved_by;
        if (j10 == 0) {
            j5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
            return;
        }
        TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
        if (user2 != null) {
            j5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
        } else {
            j5Var.l("", false);
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
            n2 n2Var = kVar.g;
            hq0 hq0Var = new hq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
            if (kVar.B) {
                hq0Var.setBackgroundColor(h6.w0(h6.d6, n2Var.getResourceProvider()));
            }
            hq0Var.f(h6.d6, h6.a7, -1);
            hq0Var.setViewType(15);
            hq0Var.setMemberRequestButton(z10);
            hq0Var.setIsSingleCell(true);
            hq0Var.setItemsCount(1);
            hq0Var.setTag(-33024);
            view = hq0Var;
        }
        return new sl0(view);
    }
}
