package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class t71 extends org.telegram.ui.Components.f61 {
    static {
        org.telegram.ui.Components.f61.setup(new t71());
    }

    public static org.telegram.ui.Components.g61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(t71.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.b71 b71Var) {
        long j10 = g61Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        u71 u71Var = (u71) view;
        int i12 = g61Var.k;
        CharSequence charSequence = g61Var.l;
        CharSequence charSequence2 = g61Var.m;
        CharSequence charSequence3 = g61Var.n;
        TextView textView = u71Var.e;
        TextView textView2 = u71Var.f;
        u71Var.n = (i10 == 0 && i11 == 0) ? false : true;
        u71Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        u71Var.b.b(i10, i11);
        u71Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        u71Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        u71Var.setValue(charSequence3);
        u71Var.d();
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u71(context, d6Var);
    }
}
