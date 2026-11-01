package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yc1 extends org.telegram.ui.Components.a51 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a51.h(new yc1());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        zc1 zc1Var = (zc1) view;
        int i10 = b51Var.k;
        CharSequence charSequence = b51Var.l;
        CharSequence charSequence2 = b51Var.m;
        boolean z11 = b51Var.q;
        boolean z12 = b51Var.r;
        int i11 = b51Var.z;
        TextView textView = zc1Var.e;
        ImageView imageView = zc1Var.f;
        zc1Var.h = z11;
        zc1Var.n = z12;
        zc1Var.b.setImageResource(i10);
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        zc1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = org.telegram.messenger.i0.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        zc1Var.c.setPadding(0, L, 0, L);
        zc1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new zc1(context, p6Var);
    }
}
