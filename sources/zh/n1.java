package zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n1 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new n1());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        o1 o1Var = (o1) view;
        int i10 = u61Var.d;
        ArrayList arrayList = (ArrayList) u61Var.G;
        int i11 = u61Var.z;
        Utilities.Callback callback = (Utilities.Callback) u61Var.H;
        za1 za1Var = o1Var.a;
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
                    za1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                aa0 aa0Var = new aa0(o1Var.getContext(), null);
                aa0Var.setGravity(17);
                aa0Var.setText((CharSequence) arrayList.get(i13));
                aa0Var.setTypeface(AndroidUtilities.bold());
                f7.W(aa0Var, f7.q(y6.b6, y6.c6), null);
                aa0Var.setTextSize(1, 14.0f);
                aa0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                aa0Var.setEllipsize(TextUtils.TruncateAt.END);
                aa0Var.setSingleLine();
                aa0Var.setMaxLines(1);
                kb1.c(aa0Var, 0.075f, 1.4f);
                za1Var.addView(aa0Var, kb1.r(-2, 26));
                arrayList2.add(aa0Var);
                i13++;
            }
        }
        o1Var.b = i11;
        if (!z11) {
            o1Var.c.d(i11, true);
        }
        za1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        return u61Var.z == u61Var2.z && u61Var.H == u61Var2.H && equals(u61Var, u61Var2);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new o1(context);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            ArrayList arrayList = (ArrayList) u61Var.G;
            ArrayList arrayList2 = (ArrayList) u61Var2.G;
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
