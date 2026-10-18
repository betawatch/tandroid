package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Components.e61 {
    static {
        org.telegram.ui.Components.e61.setup(new v71());
    }

    public static org.telegram.ui.Components.f61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.f61 J = org.telegram.ui.Components.f61.J(v71.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        long j10 = f61Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        w71 w71Var = (w71) view;
        int i12 = f61Var.k;
        CharSequence charSequence = f61Var.l;
        CharSequence charSequence2 = f61Var.m;
        CharSequence charSequence3 = f61Var.n;
        TextView textView = w71Var.e;
        TextView textView2 = w71Var.f;
        w71Var.n = (i10 == 0 && i11 == 0) ? false : true;
        w71Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        w71Var.b.b(i10, i11);
        w71Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        w71Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        w71Var.setValue(charSequence3);
        w71Var.d();
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w71(context, d6Var);
    }
}
