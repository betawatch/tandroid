package xh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.dc1;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class o1 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new o1());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        p1 p1Var = (p1) view;
        int i10 = j51Var.d;
        ArrayList arrayList = (ArrayList) j51Var.G;
        int i11 = j51Var.z;
        Utilities.Callback callback = (Utilities.Callback) j51Var.H;
        dc1 dc1Var = p1Var.a;
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
                    dc1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                c90 c90Var = new c90(p1Var.getContext(), null);
                c90Var.setGravity(17);
                c90Var.setText((CharSequence) arrayList.get(i13));
                c90Var.setTypeface(AndroidUtilities.bold());
                c90Var.setTextColor(j6.v(j6.w0(null, j6.b6, false), j6.w0(null, j6.c6, false)));
                c90Var.setTextSize(1, 14.0f);
                c90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                c90Var.setEllipsize(TextUtils.TruncateAt.END);
                c90Var.setSingleLine();
                c90Var.setMaxLines(1);
                z5.b(c90Var, 0.075f, 1.4f);
                dc1Var.addView(c90Var, x5.n(-2, 26));
                arrayList2.add(c90Var);
                i13++;
            }
        }
        p1Var.b = i11;
        if (!z11) {
            p1Var.c.d(i11, true);
        }
        dc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return j51Var.z == j51Var2.z && j51Var.H == j51Var2.H && equals(j51Var, j51Var2);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new p1(context);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            ArrayList arrayList = (ArrayList) j51Var.G;
            ArrayList arrayList2 = (ArrayList) j51Var2.G;
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
