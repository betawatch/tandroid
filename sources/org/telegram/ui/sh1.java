package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sh1 extends org.telegram.ui.Components.o61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.o61.setup(new sh1());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        th1 th1Var = (th1) view;
        int i10 = p61Var.k;
        CharSequence charSequence = p61Var.l;
        CharSequence charSequence2 = p61Var.m;
        boolean z11 = p61Var.q;
        boolean z12 = p61Var.r;
        int i11 = p61Var.z;
        TextView textView = th1Var.d;
        TextView textView2 = th1Var.e;
        ImageView imageView = th1Var.f;
        th1Var.h = z11;
        th1Var.n = z12;
        ImageView imageView2 = th1Var.b;
        imageView2.setImageResource(i10);
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView2.setText(charSequence2);
        textView2.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int dp = AndroidUtilities.dp(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        th1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.e6 e6Var = th1Var.a;
        int w02 = org.telegram.ui.ActionBar.i6.w0(th1Var.n ? org.telegram.ui.ActionBar.i6.q7 : th1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(th1Var.n ? org.telegram.ui.ActionBar.i6.q7 : th1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, e6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(th1Var.n ? org.telegram.ui.ActionBar.i6.p7 : th1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(th1Var.n ? org.telegram.ui.ActionBar.i6.p7 : th1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.y6, e6Var));
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new th1(context, e6Var);
    }
}
