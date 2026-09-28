package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class v81 extends org.telegram.ui.Components.w51 {
    static {
        org.telegram.ui.Components.w51.setup(new v81());
    }

    public static org.telegram.ui.Components.x51 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.x51 J = org.telegram.ui.Components.x51.J(v81.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        long j3 = x51Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        w81 w81Var = (w81) view;
        int i12 = x51Var.k;
        CharSequence charSequence = x51Var.l;
        CharSequence charSequence2 = x51Var.m;
        CharSequence charSequence3 = x51Var.n;
        TextView textView = w81Var.e;
        TextView textView2 = w81Var.f;
        w81Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        w81Var.b.b(i10, i11);
        w81Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        w81Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        w81Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w81(context, d6Var);
    }
}
