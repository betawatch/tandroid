package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import kh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.gk;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s1 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new s1());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        t1 t1Var = (t1) view;
        String str = l41Var.n;
        String str2 = (String) l41Var.l;
        long j10 = l41Var.B;
        ImageView imageView = t1Var.a;
        t1Var.b.setText(str);
        gk gkVar = t1Var.c;
        gkVar.setText(str2);
        if (TextUtils.isEmpty(str)) {
            gkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            gkVar.setScaleX(1.3f);
            gkVar.setScaleY(1.3f);
        } else {
            gkVar.setTranslationY(0.0f);
            gkVar.setScaleX(1.0f);
            gkVar.setScaleY(1.0f);
        }
        t1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        k5 k5Var = t1Var.d;
        if (k5Var != null) {
            k5Var.o(imageView);
            t1Var.d = null;
        }
        if (j10 != 0) {
            k5 n10 = k5.n(UserConfig.selectedAccount, j10, null, 1);
            t1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(t1Var.d);
        } else {
            fq fqVar = new fq(f6.b0(AndroidUtilities.dp(6.0f), f6.l1(0.1f, f6.w0(null, f6.G6, false))), new w3(charSequence));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            fqVar.h = dp;
            fqVar.n = dp2;
            imageView.setImageDrawable(fqVar);
        }
        t1Var.f = z10;
        t1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new t1(context);
    }
}
