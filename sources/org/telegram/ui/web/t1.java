package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import lh.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ik;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class t1 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new t1());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        u1 u1Var = (u1) view;
        String str = n41Var.n;
        String str2 = (String) n41Var.l;
        long j10 = n41Var.B;
        ImageView imageView = u1Var.a;
        u1Var.b.setText(str);
        ik ikVar = u1Var.c;
        ikVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            ikVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            ikVar.setScaleX(1.3f);
            ikVar.setScaleY(1.3f);
        } else {
            ikVar.setTranslationY(0.0f);
            ikVar.setScaleX(1.0f);
            ikVar.setScaleY(1.0f);
        }
        u1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        k5 k5Var = u1Var.d;
        if (k5Var != null) {
            k5Var.o(imageView);
            u1Var.d = null;
        }
        if (j10 != 0) {
            k5 n10 = k5.n(UserConfig.selectedAccount, j10, null, 1);
            u1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(u1Var.d);
        } else {
            dq dqVar = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, g6.w0(null, g6.G6, false))), new v3(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            dqVar.h = dp;
            dqVar.n = dp2;
            imageView.setImageDrawable(dqVar);
        }
        u1Var.f = z10;
        u1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new u1(context);
    }
}
