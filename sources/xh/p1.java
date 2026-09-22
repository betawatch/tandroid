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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.dc1;
import w7.a6;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class p1 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new p1());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        q1 q1Var = (q1) view;
        int i10 = y51Var.d;
        ArrayList arrayList = (ArrayList) y51Var.G;
        int i11 = y51Var.z;
        Utilities.Callback callback = (Utilities.Callback) y51Var.H;
        dc1 dc1Var = q1Var.a;
        ArrayList arrayList2 = q1Var.d;
        boolean z11 = q1Var.r == i10;
        q1Var.r = i10;
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
                n90 n90Var = new n90(q1Var.getContext(), null);
                n90Var.setGravity(17);
                n90Var.setText((CharSequence) arrayList.get(i13));
                n90Var.setTypeface(AndroidUtilities.bold());
                n90Var.setTextColor(j6.v(j6.w0(null, j6.b6, false), j6.w0(null, j6.c6, false)));
                n90Var.setTextSize(1, 14.0f);
                n90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n90Var.setEllipsize(TextUtils.TruncateAt.END);
                n90Var.setSingleLine();
                n90Var.setMaxLines(1);
                a6.b(n90Var, 0.075f, 1.4f);
                dc1Var.addView(n90Var, y5.n(-2, 26));
                arrayList2.add(n90Var);
                i13++;
            }
        }
        q1Var.b = i11;
        if (!z11) {
            q1Var.c.d(i11, true);
        }
        dc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        return y51Var.z == y51Var2.z && y51Var.H == y51Var2.H && equals(y51Var, y51Var2);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new q1(context);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d) {
            ArrayList arrayList = (ArrayList) y51Var.G;
            ArrayList arrayList2 = (ArrayList) y51Var2.G;
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
