package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ei.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.zq;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class v1 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new v1());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        w1 w1Var = (w1) view;
        String str = f61Var.n;
        String str2 = (String) f61Var.l;
        long j10 = f61Var.B;
        ImageView imageView = w1Var.a;
        w1Var.b.setText(str);
        mk mkVar = w1Var.c;
        mkVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            mkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            mkVar.setScaleX(1.3f);
            mkVar.setScaleY(1.3f);
        } else {
            mkVar.setTranslationY(0.0f);
            mkVar.setScaleX(1.0f);
            mkVar.setScaleY(1.0f);
        }
        w1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        r5 r5Var = w1Var.d;
        if (r5Var != null) {
            r5Var.o(imageView);
            w1Var.d = null;
        }
        if (j10 != 0) {
            r5 n10 = r5.n(UserConfig.selectedAccount, j10, null, 1);
            w1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(w1Var.d);
        } else {
            zq zqVar = new zq(h6.c0(AndroidUtilities.dp(6.0f), h6.m1(0.1f, h6.x0(null, h6.G6, false))), new w3(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            zqVar.h = dp;
            zqVar.n = dp2;
            imageView.setImageDrawable(zqVar);
        }
        w1Var.f = z10;
        w1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new w1(context);
    }
}
