package zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f1 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new f1());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        g1 g1Var = (g1) view;
        int i7 = r31Var.d;
        ArrayList arrayList = (ArrayList) r31Var.G;
        int i10 = r31Var.z;
        c20 c20Var = (c20) r31Var.H;
        c61 c61Var = g1Var.a;
        ArrayList arrayList2 = g1Var.d;
        boolean z10 = g1Var.r == i7;
        g1Var.r = i7;
        if (arrayList2.size() != arrayList.size()) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i12 < arrayList.size() ? (CharSequence) arrayList.get(i12) : null;
                if (charSequence == null) {
                    c61Var.removeView((View) arrayList2.remove(i11));
                    i11--;
                } else {
                    ((TextView) arrayList2.get(i11)).setText(charSequence);
                }
                i12++;
                i11++;
            }
            while (i12 < arrayList.size()) {
                w70 w70Var = new w70(g1Var.getContext(), null);
                w70Var.setGravity(17);
                w70Var.setText((CharSequence) arrayList.get(i12));
                w70Var.setTypeface(org.telegram.messenger.g0.o());
                r6.W(w70Var, r6.q(k6.b6, k6.c6), null);
                w70Var.setTextSize(1, 14.0f);
                w70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                w70Var.setEllipsize(TextUtils.TruncateAt.END);
                w70Var.setSingleLine();
                w70Var.setMaxLines(1);
                ka.b(w70Var, 0.075f, 1.4f);
                c61Var.addView(w70Var, ha.o(-2, 26));
                arrayList2.add(w70Var);
                i12++;
            }
        }
        g1Var.b = i10;
        if (!z10) {
            g1Var.c.e(true, i10);
        }
        c61Var.invalidate();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((TextView) arrayList2.get(i13)).setOnClickListener(new org.telegram.ui.Components.c0(c20Var, i13, 1));
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.z == r31Var2.z && r31Var.H == r31Var2.H && e(r31Var, r31Var2);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new g1(context);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            ArrayList arrayList = (ArrayList) r31Var.G;
            ArrayList arrayList2 = (ArrayList) r31Var2.G;
            if (arrayList == arrayList2) {
                return true;
            }
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) arrayList2.get(i7))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
