// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q19 extends n39 {
    public final /* synthetic */ u19 c;

    public q19(u19 u19Var) {
        this.c = u19Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 3;
    }

    @Override // w39
    public final int b() {
        return this.c.T1.size() + 3;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        u19 u19Var = this.c;
        if (i2 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) u19Var.T1.get(i - 3);
            kz9 kz9Var = (kz9) view;
            kz9Var.setBoost(tL_myBoost);
            kz9Var.c(u19Var.S1.contains(tL_myBoost), false);
            return;
        }
        if (i2 == 2) {
            ld5 ld5Var = (ld5) view;
            ld5Var.setTextSize(15.0f);
            ld5Var.setPadding(0, 0, 0, gl.L(2.0f));
            ld5Var.setText(k96.M0(2131753292, null));
            return;
        }
        if (i2 == 0) {
            t19 t19Var = (t19) view;
            u19Var.W1 = t19Var;
            TLRPC.Chat chat = u19Var.U1;
            l46 l46Var = t19Var.e;
            try {
                SpannableStringBuilder T2 = gl.T2(k96.G(on0.b(), "BoostingReassignBoostTextPluralWithLink", chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder O2 = gl.O2(k96.M0(2131753317, "BoostingReassignBoostTextLink"), bkb.Wc, 2, new rw0(u19Var, (byte) 4), null);
                int indexOf = TextUtils.indexOf(T2, "%3$s");
                T2.replace(indexOf, indexOf + 4, (CharSequence) O2);
                l46Var.setText(T2, TextView.BufferType.EDITABLE);
                l46Var.post(new on7(t19Var, indexOf, (byte) 10));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        u19 u19Var = this.c;
        if (i == 0) {
            t19 t19Var = new t19(context);
            t19Var.a(u19Var.S1, u19Var.U1);
            view = t19Var;
        } else if (i != 1) {
            view = i != 2 ? i != 3 ? new View(context) : new kz9(context, true, false, u19Var.J0, true) : new ld5(context, 22);
        } else {
            int i2 = bkb.Z6;
            view = new b9a(context, bkb.w0(null, i2, false), 0);
            zkb.h(i2, null, view);
        }
        return ls6.h(view, view, -1, -2);
    }
}
