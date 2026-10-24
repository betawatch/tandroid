package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class y71 extends org.telegram.ui.Components.l61 {
    static {
        org.telegram.ui.Components.l61.setup(new y71());
    }

    public static org.telegram.ui.Components.m61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(y71.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        long j10 = m61Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        z71 z71Var = (z71) view;
        int i12 = m61Var.k;
        CharSequence charSequence = m61Var.l;
        CharSequence charSequence2 = m61Var.m;
        CharSequence charSequence3 = m61Var.n;
        TextView textView = z71Var.e;
        TextView textView2 = z71Var.f;
        z71Var.n = (i10 == 0 && i11 == 0) ? false : true;
        z71Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        z71Var.b.b(i10, i11);
        z71Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        z71Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        z71Var.setValue(charSequence3);
        z71Var.updateColors();
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new z71(context, g6Var);
    }
}
