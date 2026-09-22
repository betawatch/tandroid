package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rh1 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new rh1());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        sh1 sh1Var = (sh1) view;
        int i10 = i51Var.k;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        boolean z11 = i51Var.q;
        boolean z12 = i51Var.r;
        int i11 = i51Var.z;
        TextView textView = sh1Var.d;
        TextView textView2 = sh1Var.e;
        ImageView imageView = sh1Var.f;
        sh1Var.h = z11;
        sh1Var.n = z12;
        ImageView imageView2 = sh1Var.b;
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
        sh1Var.c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.e6 e6Var = sh1Var.a;
        int v02 = org.telegram.ui.ActionBar.i6.v0(sh1Var.n ? org.telegram.ui.ActionBar.i6.q7 : sh1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(sh1Var.n ? org.telegram.ui.ActionBar.i6.q7 : sh1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, e6Var), mode));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(sh1Var.n ? org.telegram.ui.ActionBar.i6.p7 : sh1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(sh1Var.n ? org.telegram.ui.ActionBar.i6.p7 : sh1Var.h ? org.telegram.ui.ActionBar.i6.n6 : org.telegram.ui.ActionBar.i6.y6, e6Var));
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new sh1(context, e6Var);
    }
}
