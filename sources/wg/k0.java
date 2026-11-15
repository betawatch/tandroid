package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.nb1;
import v4.e1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k0 extends tj0 {
    public final /* synthetic */ o0 c;

    public k0(o0 o0Var) {
        this.c = o0Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(e1 e1Var) {
        return e1Var.f == 3;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.U1.size() + 3;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                return 3;
            }
        }
        return i10;
    }

    @Override // v4.h0
    public final void t(e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        o0 o0Var = this.c;
        int i11 = 3;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) o0Var.U1.get(i7 - 3);
            ah.r rVar = (ah.r) view;
            rVar.setBoost(tL_myBoost);
            rVar.c(o0Var.T1.contains(tL_myBoost), false);
            return;
        }
        if (i10 == 2) {
            n4 n4Var = (n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(hd.M0(2131753295, null));
            return;
        }
        if (i10 == 0) {
            n0 n0Var = (n0) view;
            o0Var.X1 = n0Var;
            TLRPC.Chat chat = o0Var.V1;
            z70 z70Var = n0Var.e;
            try {
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.G((int) np.s1(m10.t0).s0, "BoostingReassignBoostTextPluralWithLink", chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(hd.M0(2131753320, "BoostingReassignBoostTextLink"), j6.Xc, 2, new f2(o0Var, i11), null);
                int indexOf = TextUtils.indexOf(X2, "%3$s");
                X2.replace(indexOf, indexOf + 4, (CharSequence) S2);
                z70Var.setText(X2, TextView.BufferType.EDITABLE);
                z70Var.post(new nb1(n0Var, indexOf, 13));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override // v4.h0
    public final e1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        o0 o0Var = this.c;
        if (i7 == 0) {
            n0 n0Var = new n0(context);
            n0Var.a(o0Var.T1, o0Var.V1);
            view = n0Var;
        } else if (i7 != 1) {
            view = i7 != 2 ? i7 != 3 ? new View(context) : new ah.r(context, true, false, o0Var.J0, true) : new n4(context, 22);
        } else {
            int i10 = j6.a7;
            view = new x6(context, j6.x0(null, i10, false), 0);
            q6.h(i10, view, null);
        }
        return i5.c.q(view, view, -1, -2);
    }
}
