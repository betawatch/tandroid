package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.rk;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class w1 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new w1());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        x1 x1Var = (x1) view;
        String str = i51Var.n;
        String str2 = (String) i51Var.l;
        long j10 = i51Var.B;
        ImageView imageView = x1Var.a;
        x1Var.b.setText(str);
        rk rkVar = x1Var.c;
        rkVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            rkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            rkVar.setScaleX(1.3f);
            rkVar.setScaleY(1.3f);
        } else {
            rkVar.setTranslationY(0.0f);
            rkVar.setScaleX(1.0f);
            rkVar.setScaleY(1.0f);
        }
        x1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        l5 l5Var = x1Var.d;
        if (l5Var != null) {
            l5Var.o(imageView);
            x1Var.d = null;
        }
        if (j10 != 0) {
            l5 n10 = l5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            mq mqVar = new mq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, j6.w0(null, j6.G6, false))), new dg.k1(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            mqVar.h = dp;
            mqVar.n = dp2;
            imageView.setImageDrawable(mqVar);
        }
        x1Var.f = z4;
        x1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new x1(context);
    }
}
