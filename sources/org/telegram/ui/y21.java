package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y21 extends org.telegram.ui.Components.q31 {
    static {
        org.telegram.ui.Components.q31.h(new y21());
    }

    public static org.telegram.ui.Components.r31 i(int i3, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(y21.class);
        K.d = i3;
        K.k = i12;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i10 & 4294967295L) | (i11 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        long j10 = r31Var.B;
        int i3 = (int) j10;
        int i10 = (int) (j10 >>> 32);
        z21 z21Var = (z21) view;
        int i11 = r31Var.k;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        CharSequence charSequence3 = r31Var.n;
        TextView textView = z21Var.e;
        TextView textView2 = z21Var.f;
        z21Var.n = (i3 == 0 && i10 == 0) ? false : true;
        z21Var.c.setVisibility(i11 != 0 ? 0 : 8);
        textView.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        textView2.setTranslationX(i11 == 0 ? org.telegram.messenger.g0.L(2.0f) : 0.0f);
        z21Var.b.b(i3, i10);
        z21Var.d.setImageResource(i11);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        z21Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        z21Var.setValue(charSequence3);
        z21Var.updateColors();
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new z21(context, e6Var);
    }
}
