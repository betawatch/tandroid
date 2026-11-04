package xg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Wallet.f2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m0 extends sj0 {
    public final /* synthetic */ q0 c;

    public m0(q0 q0Var) {
        this.c = q0Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 3;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.R1.size() + 3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i10 = 1;
        if (i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                return 3;
            }
        }
        return i10;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        q0 q0Var = this.c;
        int i11 = 3;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) q0Var.R1.get(i3 - 3);
            bh.p pVar = (bh.p) view;
            pVar.setBoost(tL_myBoost);
            pVar.c(q0Var.Q1.contains(tL_myBoost), false);
            return;
        }
        if (i10 == 2) {
            n4 n4Var = (n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(bd.M0(2131753295, null));
            return;
        }
        if (i10 == 0) {
            p0 p0Var = (p0) view;
            q0Var.U1 = p0Var;
            TLRPC.Chat chat = q0Var.S1;
            s70 s70Var = p0Var.e;
            try {
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.G((int) hp.s1(h10.t0).s0, "BoostingReassignBoostTextPluralWithLink", chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(bd.M0(2131753320, "BoostingReassignBoostTextLink"), k6.Uc, 2, new e2(q0Var, i11), null);
                int indexOf = TextUtils.indexOf(X2, "%3$s");
                X2.replace(indexOf, indexOf + 4, (CharSequence) S2);
                s70Var.setText(X2, TextView.BufferType.EDITABLE);
                s70Var.post(new f2(p0Var, indexOf, 11));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = viewGroup.getContext();
        q0 q0Var = this.c;
        if (i3 == 0) {
            p0 p0Var = new p0(context);
            p0Var.a(q0Var.Q1, q0Var.S1);
            view = p0Var;
        } else if (i3 != 1) {
            view = i3 != 2 ? i3 != 3 ? new View(context) : new bh.p(context, true, false, q0Var.J0, true) : new n4(context, 22);
        } else {
            int i10 = k6.a7;
            view = new x6(context, k6.x0(null, i10, false), 0);
            r6.i(i10, view, null);
        }
        return p1.p(view, view, -1, -2);
    }
}
