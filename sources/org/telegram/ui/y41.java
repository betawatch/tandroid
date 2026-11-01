package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y41 extends org.telegram.ui.Components.a51 {
    static {
        org.telegram.ui.Components.a51.h(new y41());
    }

    public static org.telegram.ui.Components.b51 i(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.b51 K = org.telegram.ui.Components.b51.K(y41.class);
        K.d = i10;
        K.k = i13;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        long j10 = b51Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        z41 z41Var = (z41) view;
        int i12 = b51Var.k;
        CharSequence charSequence = b51Var.l;
        CharSequence charSequence2 = b51Var.m;
        CharSequence charSequence3 = b51Var.n;
        TextView textView = z41Var.e;
        TextView textView2 = z41Var.f;
        z41Var.n = (i10 == 0 && i11 == 0) ? false : true;
        z41Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? org.telegram.messenger.i0.L(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? org.telegram.messenger.i0.L(2.0f) : 0.0f);
        z41Var.b.b(i10, i11);
        z41Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        z41Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        z41Var.setValue(charSequence3);
        z41Var.updateColors();
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new z41(context, p6Var);
    }
}
