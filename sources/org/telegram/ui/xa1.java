package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xa1 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new xa1());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        ya1 ya1Var = (ya1) view;
        int i3 = r31Var.k;
        CharSequence charSequence = r31Var.l;
        CharSequence charSequence2 = r31Var.m;
        boolean z11 = r31Var.q;
        boolean z12 = r31Var.r;
        int i10 = r31Var.z;
        TextView textView = ya1Var.e;
        ImageView imageView = ya1Var.f;
        ya1Var.h = z11;
        ya1Var.n = z12;
        ya1Var.b.setImageResource(i3);
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        ya1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = org.telegram.messenger.g0.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        ya1Var.c.setPadding(0, L, 0, L);
        ya1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ya1(context, e6Var);
    }
}
