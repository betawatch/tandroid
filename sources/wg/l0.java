package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.ao0;
import v4.f1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l0 extends dk0 {
    public final /* synthetic */ p0 c;

    public l0(p0 p0Var) {
        this.c = p0Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(f1 f1Var) {
        return f1Var.f == 3;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.U1.size() + 3;
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final void t(f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        p0 p0Var = this.c;
        int i11 = 3;
        if (i10 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) p0Var.U1.get(i7 - 3);
            ah.r rVar = (ah.r) view;
            rVar.setBoost(tL_myBoost);
            rVar.c(p0Var.T1.contains(tL_myBoost), false);
            return;
        }
        if (i10 == 2) {
            o4 o4Var = (o4) view;
            o4Var.setTextSize(15.0f);
            o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            o4Var.setText(gd.N0(2131753292, null));
            return;
        }
        if (i10 == 0) {
            o0 o0Var = (o0) view;
            p0Var.X1 = o0Var;
            TLRPC.Chat chat = p0Var.V1;
            j80 j80Var = o0Var.e;
            try {
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.G((int) mp.u1(i10.t0).s0, "BoostingReassignBoostTextPluralWithLink", chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(gd.N0(2131753317, "BoostingReassignBoostTextLink"), n6.Xc, 2, new h2(p0Var, i11), null);
                int indexOf = TextUtils.indexOf(W2, "%3$s");
                W2.replace(indexOf, indexOf + 4, (CharSequence) R2);
                j80Var.setText(W2, TextView.BufferType.EDITABLE);
                j80Var.post(new ao0(o0Var, indexOf, 18));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        p0 p0Var = this.c;
        if (i7 == 0) {
            o0 o0Var = new o0(context);
            o0Var.a(p0Var.T1, p0Var.V1);
            view = o0Var;
        } else if (i7 != 1) {
            view = i7 != 2 ? i7 != 3 ? new View(context) : new ah.r(context, true, false, p0Var.J0, true) : new o4(context, 22);
        } else {
            int i10 = n6.a7;
            view = new y6(context, n6.x0(null, i10, false), 0);
            u6.h(i10, view, null);
        }
        return i5.c.q(view, view, -1, -2);
    }
}
