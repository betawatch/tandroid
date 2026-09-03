package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s81 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new s81());
    }

    public static org.telegram.ui.Components.i51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(s81.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        long j10 = i51Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        t81 t81Var = (t81) view;
        int i12 = i51Var.k;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        CharSequence charSequence3 = i51Var.n;
        TextView textView = t81Var.e;
        TextView textView2 = t81Var.f;
        t81Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        t81Var.b.b(i10, i11);
        t81Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        t81Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        t81Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t81(context, f6Var);
    }
}
