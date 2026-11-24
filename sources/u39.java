// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u39 extends q59 {
    public final /* synthetic */ y39 c;

    public u39(y39 y39Var) {
        this.c = y39Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 3;
    }

    @Override // y59
    public final int b() {
        return this.c.T1.size() + 3;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        y39 y39Var = this.c;
        if (i2 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) y39Var.T1.get(i - 3);
            m1a m1aVar = (m1a) view;
            m1aVar.setBoost(tL_myBoost);
            m1aVar.c(y39Var.S1.contains(tL_myBoost), false);
            return;
        }
        if (i2 == 2) {
            jf5 jf5Var = (jf5) view;
            jf5Var.setTextSize(15.0f);
            jf5Var.setPadding(0, 0, 0, gm.L(2.0f));
            jf5Var.setText(jb6.M0(2131753260, null));
            return;
        }
        if (i2 == 0) {
            x39 x39Var = (x39) view;
            y39Var.W1 = x39Var;
            TLRPC.Chat chat = y39Var.U1;
            l66 l66Var = x39Var.e;
            try {
                SpannableStringBuilder S2 = gm.S2(jb6.G(oo0.b(), "BoostingReassignBoostTextPluralWithLink", chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder N2 = gm.N2(jb6.M0(2131753285, "BoostingReassignBoostTextLink"), cmb.Wc, 2, new zx0(y39Var, (byte) 4), null);
                int indexOf = TextUtils.indexOf(S2, "%3$s");
                S2.replace(indexOf, indexOf + 4, (CharSequence) N2);
                l66Var.setText(S2, TextView.BufferType.EDITABLE);
                l66Var.post(new ge7(x39Var, indexOf, (byte) 12));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        y39 y39Var = this.c;
        if (i == 0) {
            x39 x39Var = new x39(context);
            x39Var.a(y39Var.S1, y39Var.U1);
            view = x39Var;
        } else if (i != 1) {
            view = i != 2 ? i != 3 ? new View(context) : new m1a(context, true, false, y39Var.J0, true) : new jf5(context, 22);
        } else {
            int i2 = cmb.Z6;
            view = new bba(context, cmb.w0(null, i2, false), 0);
            anb.h(i2, null, view);
        }
        return kt6.h(view, view, -1, -2);
    }
}
