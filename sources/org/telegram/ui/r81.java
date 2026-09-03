package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r81 extends org.telegram.ui.Components.g51 {
    static {
        org.telegram.ui.Components.g51.setup(new r81());
    }

    public static org.telegram.ui.Components.h51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(r81.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        long j10 = h51Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        s81 s81Var = (s81) view;
        int i12 = h51Var.k;
        CharSequence charSequence = h51Var.l;
        CharSequence charSequence2 = h51Var.m;
        CharSequence charSequence3 = h51Var.n;
        TextView textView = s81Var.e;
        TextView textView2 = s81Var.f;
        s81Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        s81Var.b.b(i10, i11);
        s81Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        s81Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        s81Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new s81(context, g6Var);
    }
}
