package zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y31;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e1 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new e1());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        f1 f1Var = (f1) view;
        int i7 = y31Var.d;
        ArrayList arrayList = (ArrayList) y31Var.G;
        int i10 = y31Var.z;
        c20 c20Var = (c20) y31Var.H;
        d61 d61Var = f1Var.a;
        ArrayList arrayList2 = f1Var.d;
        boolean z10 = f1Var.r == i7;
        f1Var.r = i7;
        if (arrayList2.size() != arrayList.size()) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i12 < arrayList.size() ? (CharSequence) arrayList.get(i12) : null;
                if (charSequence == null) {
                    d61Var.removeView((View) arrayList2.remove(i11));
                    i11--;
                } else {
                    ((TextView) arrayList2.get(i11)).setText(charSequence);
                }
                i12++;
                i11++;
            }
            while (i12 < arrayList.size()) {
                x70 x70Var = new x70(f1Var.getContext(), null);
                x70Var.setGravity(17);
                x70Var.setText((CharSequence) arrayList.get(i12));
                x70Var.setTypeface(org.telegram.messenger.g0.o());
                s6.V(x70Var, s6.p(l6.b6, l6.c6), null);
                x70Var.setTextSize(1, 14.0f);
                x70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                x70Var.setEllipsize(TextUtils.TruncateAt.END);
                x70Var.setSingleLine();
                x70Var.setMaxLines(1);
                ka.b(x70Var, 0.075f, 1.4f);
                d61Var.addView(x70Var, ha.o(-2, 26));
                arrayList2.add(x70Var);
                i12++;
            }
        }
        f1Var.b = i10;
        if (!z10) {
            f1Var.c.e(true, i10);
        }
        d61Var.invalidate();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((TextView) arrayList2.get(i13)).setOnClickListener(new org.telegram.ui.Components.c0(c20Var, i13, 1));
        }
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean c(y31 y31Var, y31 y31Var2) {
        return y31Var.z == y31Var2.z && y31Var.H == y31Var2.H && e(y31Var, y31Var2);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new f1(context);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            ArrayList arrayList = (ArrayList) y31Var.G;
            ArrayList arrayList2 = (ArrayList) y31Var2.G;
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
