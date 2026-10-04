package xh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.xb1;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class o1 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new o1());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        p1 p1Var = (p1) view;
        int i10 = g61Var.d;
        ArrayList arrayList = (ArrayList) g61Var.G;
        int i11 = g61Var.z;
        Utilities.Callback callback = (Utilities.Callback) g61Var.H;
        xb1 xb1Var = p1Var.a;
        ArrayList arrayList2 = p1Var.d;
        boolean z11 = p1Var.r == i10;
        p1Var.r = i10;
        if (arrayList2.size() != arrayList.size()) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i13 < arrayList.size() ? (CharSequence) arrayList.get(i13) : null;
                if (charSequence == null) {
                    xb1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                q90 q90Var = new q90(p1Var.getContext(), null);
                q90Var.setGravity(17);
                q90Var.setText((CharSequence) arrayList.get(i13));
                q90Var.setTypeface(AndroidUtilities.bold());
                q90Var.setTextColor(i6.v(i6.w0(null, i6.b6, false), i6.w0(null, i6.c6, false)));
                q90Var.setTextSize(1, 14.0f);
                q90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                q90Var.setEllipsize(TextUtils.TruncateAt.END);
                q90Var.setSingleLine();
                q90Var.setMaxLines(1);
                b6.b(q90Var, 0.075f, 1.4f);
                xb1Var.addView(q90Var, z5.n(-2, 26));
                arrayList2.add(q90Var);
                i13++;
            }
        }
        p1Var.b = i11;
        if (!z11) {
            p1Var.c.d(i11, true);
        }
        xb1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return g61Var.z == g61Var2.z && g61Var.H == g61Var2.H && equals(g61Var, g61Var2);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new p1(context);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            ArrayList arrayList = (ArrayList) g61Var.G;
            ArrayList arrayList2 = (ArrayList) g61Var2.G;
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
