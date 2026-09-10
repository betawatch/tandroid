package wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.gc1;
import w7.a6;
import w7.c6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n1 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new n1());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        o1 o1Var = (o1) view;
        int i10 = v51Var.d;
        ArrayList arrayList = (ArrayList) v51Var.G;
        int i11 = v51Var.z;
        Utilities.Callback callback = (Utilities.Callback) v51Var.H;
        gc1 gc1Var = o1Var.a;
        ArrayList arrayList2 = o1Var.d;
        boolean z11 = o1Var.r == i10;
        o1Var.r = i10;
        if (arrayList2.size() != arrayList.size()) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i13 < arrayList.size() ? (CharSequence) arrayList.get(i13) : null;
                if (charSequence == null) {
                    gc1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                m90 m90Var = new m90(o1Var.getContext(), null);
                m90Var.setGravity(17);
                m90Var.setText((CharSequence) arrayList.get(i13));
                m90Var.setTypeface(AndroidUtilities.bold());
                m90Var.setTextColor(j6.v(j6.w0(null, j6.b6, false), j6.w0(null, j6.c6, false)));
                m90Var.setTextSize(1, 14.0f);
                m90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                m90Var.setEllipsize(TextUtils.TruncateAt.END);
                m90Var.setSingleLine();
                m90Var.setMaxLines(1);
                c6.b(m90Var, 0.075f, 1.4f);
                gc1Var.addView(m90Var, a6.n(-2, 26));
                arrayList2.add(m90Var);
                i13++;
            }
        }
        o1Var.b = i11;
        if (!z11) {
            o1Var.c.d(i11, true);
        }
        gc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.c0(i14, 1, callback));
        }
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return v51Var.z == v51Var2.z && v51Var.H == v51Var2.H && equals(v51Var, v51Var2);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new o1(context);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d) {
            ArrayList arrayList = (ArrayList) v51Var.G;
            ArrayList arrayList2 = (ArrayList) v51Var2.G;
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
