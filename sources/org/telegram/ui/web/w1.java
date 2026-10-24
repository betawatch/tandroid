package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ei.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.yq;
import org.telegram.ui.lk;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w1 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new w1());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        x1 x1Var = (x1) view;
        String str = m61Var.n;
        String str2 = (String) m61Var.l;
        long j10 = m61Var.B;
        ImageView imageView = x1Var.a;
        x1Var.b.setText(str);
        lk lkVar = x1Var.c;
        lkVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            lkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            lkVar.setScaleX(1.3f);
            lkVar.setScaleY(1.3f);
        } else {
            lkVar.setTranslationY(0.0f);
            lkVar.setScaleX(1.0f);
            lkVar.setScaleY(1.0f);
        }
        x1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        r5 r5Var = x1Var.d;
        if (r5Var != null) {
            r5Var.o(imageView);
            x1Var.d = null;
        }
        x1Var.h = null;
        if (j10 != 0) {
            r5 n10 = r5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(6.0f), k6.o1(0.1f, k6.x0(null, k6.G6, false)));
            x1Var.h = c02;
            yq yqVar = new yq(c02, new w3(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            yqVar.h = dp;
            yqVar.n = dp2;
            imageView.setImageDrawable(yqVar);
        }
        x1Var.f = z10;
        x1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new x1(context);
    }
}
