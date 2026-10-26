package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z71 extends org.telegram.ui.Components.s61 {
    static {
        org.telegram.ui.Components.s61.setup(new z71());
    }

    public static org.telegram.ui.Components.t61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(z71.class);
        K.d = i10;
        K.k = i13;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        long j10 = t61Var.B;
        int i10 = (int) j10;
        int i11 = (int) (j10 >>> 32);
        a81 a81Var = (a81) view;
        int i12 = t61Var.k;
        CharSequence charSequence = t61Var.l;
        CharSequence charSequence2 = t61Var.m;
        CharSequence charSequence3 = t61Var.n;
        TextView textView = a81Var.e;
        TextView textView2 = a81Var.f;
        a81Var.n = (i10 == 0 && i11 == 0) ? false : true;
        a81Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        a81Var.b.b(i10, i11);
        a81Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        a81Var.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        a81Var.setValue(charSequence3);
        a81Var.updateColors();
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new a81(context, u6Var);
    }
}
