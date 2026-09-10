package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import bi.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.uk;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class z1 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new z1());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        a2 a2Var = (a2) view;
        String str = v51Var.n;
        String str2 = (String) v51Var.l;
        long j3 = v51Var.B;
        ImageView imageView = a2Var.a;
        a2Var.b.setText(str);
        uk ukVar = a2Var.c;
        ukVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            ukVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            ukVar.setScaleX(1.3f);
            ukVar.setScaleY(1.3f);
        } else {
            ukVar.setTranslationY(0.0f);
            ukVar.setScaleX(1.0f);
            ukVar.setScaleY(1.0f);
        }
        a2Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        p5 p5Var = a2Var.d;
        if (p5Var != null) {
            p5Var.o(imageView);
            a2Var.d = null;
        }
        if (j3 != 0) {
            p5 n10 = p5.n(UserConfig.selectedAccount, j3, null, 1);
            a2Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(a2Var.d);
        } else {
            vq vqVar = new vq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, j6.w0(null, j6.G6, false))), new w4(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            vqVar.h = dp;
            vqVar.n = dp2;
            imageView.setImageDrawable(vqVar);
        }
        a2Var.f = z10;
        a2Var.invalidate();
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new a2(context);
    }
}
