package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Wallet.f2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m0 extends oj0 {
    public final /* synthetic */ q0 c;

    public m0(q0 q0Var) {
        this.c = q0Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 3;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.T1.size() + 3;
    }

    @Override // v4.g0
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

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        q0 q0Var = this.c;
        int i11 = 3;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) q0Var.T1.get(i7 - 3);
            ah.r rVar = (ah.r) view;
            rVar.setBoost(tL_myBoost);
            rVar.c(q0Var.S1.contains(tL_myBoost), false);
            return;
        }
        if (i10 == 2) {
            n4 n4Var = (n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(id.M0(2131753295, null));
            return;
        }
        if (i10 == 0) {
            p0 p0Var = (p0) view;
            q0Var.W1 = p0Var;
            TLRPC.Chat chat = q0Var.U1;
            w70 w70Var = p0Var.e;
            try {
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.G((int) qp.s1(p10.s0).r0, "BoostingReassignBoostTextPluralWithLink", chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(id.M0(2131753320, "BoostingReassignBoostTextLink"), m6.Uc, 2, new g2(q0Var, i11), null);
                int indexOf = TextUtils.indexOf(X2, "%3$s");
                X2.replace(indexOf, indexOf + 4, (CharSequence) S2);
                w70Var.setText(X2, TextView.BufferType.EDITABLE);
                w70Var.post(new f2(p0Var, indexOf, 10));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        q0 q0Var = this.c;
        if (i7 == 0) {
            p0 p0Var = new p0(context);
            p0Var.a(q0Var.S1, q0Var.U1);
            view = p0Var;
        } else if (i7 != 1) {
            view = i7 != 2 ? i7 != 3 ? new View(context) : new ah.r(context, true, false, q0Var.I0, true) : new n4(context, 22);
        } else {
            int i10 = m6.a7;
            view = new y6(context, m6.x0(null, i10, false), 0);
            t6.h(i10, view, null);
        }
        return jg.g.r(view, view, -1, -2);
    }
}
