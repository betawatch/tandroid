package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t71 extends org.telegram.ui.Components.m41 {
    static {
        org.telegram.ui.Components.m41.setup(new t71());
    }

    public static org.telegram.ui.Components.n41 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.n41 J = org.telegram.ui.Components.n41.J(t71.class);
        J.d = i10;
        J.k = i13;
        J.l = charSequence;
        J.m = charSequence2;
        J.n = charSequence3;
        J.B = (i11 & 4294967295L) | (i12 << 32);
        return J;
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        long j10 = n41Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        u71 u71Var = (u71) view;
        int i12 = n41Var.k;
        CharSequence charSequence = n41Var.l;
        CharSequence charSequence2 = n41Var.m;
        CharSequence charSequence3 = n41Var.n;
        TextView textView = u71Var.e;
        TextView textView2 = u71Var.f;
        u71Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        u71Var.b.b(i10, i11);
        u71Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        u71Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        u71Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new u71(context, c6Var);
    }
}
