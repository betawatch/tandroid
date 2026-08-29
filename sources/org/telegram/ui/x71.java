package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x71 extends org.telegram.ui.Components.v41 {
    static {
        org.telegram.ui.Components.v41.setup(new x71());
    }

    public static org.telegram.ui.Components.w41 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(x71.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        long j10 = w41Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        y71 y71Var = (y71) view;
        int i12 = w41Var.k;
        CharSequence charSequence = w41Var.l;
        CharSequence charSequence2 = w41Var.m;
        CharSequence charSequence3 = w41Var.n;
        TextView textView = y71Var.e;
        TextView textView2 = y71Var.f;
        y71Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        y71Var.b.b(i10, i11);
        y71Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        y71Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        y71Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y71(context, c6Var);
    }
}
