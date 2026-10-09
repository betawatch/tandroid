package xh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.dc1;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class p1 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new p1());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        q1 q1Var = (q1) view;
        int i10 = p61Var.d;
        ArrayList arrayList = (ArrayList) p61Var.G;
        int i11 = p61Var.z;
        Utilities.Callback callback = (Utilities.Callback) p61Var.H;
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
                ea0 ea0Var = new ea0(q1Var.getContext(), null);
                ea0Var.setGravity(17);
                ea0Var.setText((CharSequence) arrayList.get(i13));
                ea0Var.setTypeface(AndroidUtilities.bold());
                ea0Var.setTextColor(i6.v(i6.x0(null, i6.b6, false), i6.x0(null, i6.c6, false)));
                ea0Var.setTextSize(1, 14.0f);
                ea0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                ea0Var.setEllipsize(TextUtils.TruncateAt.END);
                ea0Var.setSingleLine();
                ea0Var.setMaxLines(1);
                z5.b(ea0Var, 0.075f, 1.4f);
                dc1Var.addView(ea0Var, x5.n(-2, 26));
                arrayList2.add(ea0Var);
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

    @Override // org.telegram.ui.Components.o61
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        return p61Var.z == p61Var2.z && p61Var.H == p61Var2.H && equals(p61Var, p61Var2);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new q1(context);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d) {
            ArrayList arrayList = (ArrayList) p61Var.G;
            ArrayList arrayList2 = (ArrayList) p61Var2.G;
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
