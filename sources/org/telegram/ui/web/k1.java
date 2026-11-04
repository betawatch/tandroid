package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import gi.k3;
import org.telegram.messenger.h10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class k1 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new k1());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        l1 l1Var = (l1) view;
        String str = r31Var.n;
        String str2 = (String) r31Var.l;
        long j10 = r31Var.B;
        ImageView imageView = l1Var.a;
        l1Var.b.setText(str);
        k2 k2Var = l1Var.c;
        k2Var.setText(str2);
        if (TextUtils.isEmpty(str)) {
            k2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            k2Var.setScaleX(1.3f);
            k2Var.setScaleY(1.3f);
        } else {
            k2Var.setTranslationY(0.0f);
            k2Var.setScaleX(1.0f);
            k2Var.setScaleY(1.0f);
        }
        l1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        g5 g5Var = l1Var.d;
        if (g5Var != null) {
            g5Var.n(imageView);
            l1Var.d = null;
        }
        l1Var.h = null;
        if (j10 != 0) {
            g5 m10 = g5.m(h10.t0, j10, null, 1);
            l1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(l1Var.d);
        } else {
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, k6.x0(null, k6.G6, false)));
            l1Var.h = d02;
            xp xpVar = new xp(d02, new k3(charSequence));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            xpVar.h = L;
            xpVar.n = L2;
            imageView.setImageDrawable(xpVar);
        }
        l1Var.f = z10;
        l1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new l1(context);
    }
}
