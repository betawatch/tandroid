package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import di.c4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.xk;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class x1 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new x1());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        y1 y1Var = (y1) view;
        String str = m61Var.n;
        String str2 = (String) m61Var.l;
        long j10 = m61Var.B;
        ImageView imageView = y1Var.a;
        y1Var.b.setText(str);
        xk xkVar = y1Var.c;
        xkVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            xkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            xkVar.setScaleX(1.3f);
            xkVar.setScaleY(1.3f);
        } else {
            xkVar.setTranslationY(0.0f);
            xkVar.setScaleX(1.0f);
            xkVar.setScaleY(1.0f);
        }
        y1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        s5 s5Var = y1Var.d;
        if (s5Var != null) {
            s5Var.o(imageView);
            y1Var.d = null;
        }
        if (j10 != 0) {
            s5 n10 = s5.n(UserConfig.selectedAccount, j10, null, 1);
            y1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(y1Var.d);
        } else {
            cr crVar = new cr(g6.c0(AndroidUtilities.dp(6.0f), g6.m1(0.1f, g6.x0(null, g6.G6, false))), new c4(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            crVar.h = dp;
            crVar.n = dp2;
            imageView.setImageDrawable(crVar);
        }
        y1Var.f = z10;
        y1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new y1(context);
    }
}
