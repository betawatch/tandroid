package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.r20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.s71;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j1 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new j1());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        k1 k1Var = (k1) view;
        int i10 = b51Var.d;
        ArrayList arrayList = (ArrayList) b51Var.G;
        int i11 = b51Var.z;
        r20 r20Var = (r20) b51Var.H;
        s71 s71Var = k1Var.a;
        ArrayList arrayList2 = k1Var.d;
        boolean z11 = k1Var.r == i10;
        k1Var.r = i10;
        if (arrayList2.size() != arrayList.size()) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i13 < arrayList.size() ? (CharSequence) arrayList.get(i13) : null;
                if (charSequence == null) {
                    s71Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                p80 p80Var = new p80(k1Var.getContext(), null);
                p80Var.setGravity(17);
                p80Var.setText((CharSequence) arrayList.get(i13));
                p80Var.setTypeface(org.telegram.messenger.i0.o());
                a7.W(p80Var, a7.q(t6.b6, t6.c6), null);
                p80Var.setTextSize(1, 14.0f);
                p80Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                p80Var.setSingleLine();
                p80Var.setMaxLines(1);
                e6.b(p80Var, 0.075f, 1.4f);
                s71Var.addView(p80Var, b6.o(-2, 26));
                arrayList2.add(p80Var);
                i13++;
            }
        }
        k1Var.b = i11;
        if (!z11) {
            k1Var.c.e(true, i11);
        }
        s71Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.c0(i14, 1, r20Var));
        }
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean c(b51 b51Var, b51 b51Var2) {
        return b51Var.z == b51Var2.z && b51Var.H == b51Var2.H && e(b51Var, b51Var2);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new k1(context);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d) {
            ArrayList arrayList = (ArrayList) b51Var.G;
            ArrayList arrayList2 = (ArrayList) b51Var2.G;
            if (arrayList == arrayList2) {
                return true;
            }
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
