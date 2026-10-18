package yh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.sa1;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m1 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new m1());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        n1 n1Var = (n1) view;
        int i10 = f61Var.d;
        ArrayList arrayList = (ArrayList) f61Var.G;
        int i11 = f61Var.z;
        Utilities.Callback callback = (Utilities.Callback) f61Var.H;
        sa1 sa1Var = n1Var.a;
        ArrayList arrayList2 = n1Var.d;
        boolean z11 = n1Var.r == i10;
        n1Var.r = i10;
        if (arrayList2.size() != arrayList.size()) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                CharSequence charSequence = i13 < arrayList.size() ? (CharSequence) arrayList.get(i13) : null;
                if (charSequence == null) {
                    sa1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                x90 x90Var = new x90(n1Var.getContext(), null);
                x90Var.setGravity(17);
                x90Var.setText((CharSequence) arrayList.get(i13));
                x90Var.setTypeface(AndroidUtilities.bold());
                x90Var.setTextColor(h6.v(h6.x0(null, h6.b6, false), h6.x0(null, h6.c6, false)));
                x90Var.setTextSize(1, 14.0f);
                x90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                x90Var.setEllipsize(TextUtils.TruncateAt.END);
                x90Var.setSingleLine();
                x90Var.setMaxLines(1);
                b6.b(x90Var, 0.075f, 1.4f);
                sa1Var.addView(x90Var, z5.n(-2, 26));
                arrayList2.add(x90Var);
                i13++;
            }
        }
        n1Var.b = i11;
        if (!z11) {
            n1Var.c.d(i11, true);
        }
        sa1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        return f61Var.z == f61Var2.z && f61Var.H == f61Var2.H && equals(f61Var, f61Var2);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new n1(context);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.d == f61Var2.d) {
            ArrayList arrayList = (ArrayList) f61Var.G;
            ArrayList arrayList2 = (ArrayList) f61Var2.G;
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
