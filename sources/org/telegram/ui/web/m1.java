package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import fi.l3;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class m1 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new m1());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        n1 n1Var = (n1) view;
        String str = x31Var.n;
        String str2 = (String) x31Var.l;
        long j3 = x31Var.B;
        ImageView imageView = n1Var.a;
        n1Var.b.setText(str);
        n2 n2Var = n1Var.c;
        n2Var.setText(str2);
        if (TextUtils.isEmpty(str)) {
            n2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            n2Var.setScaleX(1.3f);
            n2Var.setScaleY(1.3f);
        } else {
            n2Var.setTranslationY(0.0f);
            n2Var.setScaleX(1.0f);
            n2Var.setScaleY(1.0f);
        }
        n1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        h5 h5Var = n1Var.d;
        if (h5Var != null) {
            h5Var.n(imageView);
            n1Var.d = null;
        }
        n1Var.h = null;
        if (j3 != 0) {
            h5 m10 = h5.m(p10.s0, j3, null, 1);
            n1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(n1Var.d);
        } else {
            ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(6.0f), m6.r1(0.1f, m6.x0(null, m6.G6, false)));
            n1Var.h = d02;
            xp xpVar = new xp(d02, new l3(charSequence));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            xpVar.h = L;
            xpVar.n = L2;
            imageView.setImageDrawable(xpVar);
        }
        n1Var.f = z9;
        n1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new n1(context);
    }
}
