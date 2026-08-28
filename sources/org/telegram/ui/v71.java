package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Components.k41 {
    static {
        org.telegram.ui.Components.k41.setup(new v71());
    }

    public static org.telegram.ui.Components.l41 a(int i9, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(v71.class);
        J.d = i9;
        J.k = i12;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i10 & 4294967295L) | (i11 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        long j10 = l41Var.B;
        int i9 = (int) j10;
        int i10 = (int) (j10 >>> 32);
        w71 w71Var = (w71) view;
        int i11 = l41Var.k;
        CharSequence charSequence = l41Var.l;
        CharSequence charSequence2 = l41Var.m;
        CharSequence charSequence3 = l41Var.n;
        TextView textView = w71Var.e;
        TextView textView2 = w71Var.f;
        w71Var.c.setVisibility(i11 != 0 ? 0 : 8);
        textView.setTranslationX(i11 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i11 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        w71Var.b.b(i9, i10);
        w71Var.d.setImageResource(i11);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        w71Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        w71Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new w71(context, b6Var);
    }
}
