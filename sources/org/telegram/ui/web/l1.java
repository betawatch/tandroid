package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import hi.l3;
import org.telegram.messenger.j10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class l1 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new l1());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        m1 m1Var = (m1) view;
        String str = l41Var.o;
        String str2 = (String) l41Var.m;
        long j3 = l41Var.C;
        ImageView imageView = m1Var.a;
        m1Var.b.setText(str);
        o2 o2Var = m1Var.c;
        o2Var.setText(str2);
        if (TextUtils.isEmpty(str)) {
            o2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            o2Var.setScaleX(1.3f);
            o2Var.setScaleY(1.3f);
        } else {
            o2Var.setTranslationY(0.0f);
            o2Var.setScaleX(1.0f);
            o2Var.setScaleY(1.0f);
        }
        m1Var.e = str2;
        if (TextUtils.isEmpty(str)) {
            str = (str2.isEmpty() || TextUtils.isEmpty(str2)) ? "" : str2;
        }
        String charSequence = str.toString();
        o5 o5Var = m1Var.d;
        if (o5Var != null) {
            o5Var.n(imageView);
            m1Var.d = null;
        }
        m1Var.h = null;
        if (j3 != 0) {
            o5 m10 = o5.m(j10.t0, j3, null, 1);
            m1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(m1Var.d);
        } else {
            ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, n6.x0(null, n6.G6, false)));
            m1Var.h = d02;
            mq mqVar = new mq(d02, new l3(charSequence));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            mqVar.h = L;
            mqVar.n = L2;
            imageView.setImageDrawable(mqVar);
        }
        m1Var.f = z10;
        m1Var.invalidate();
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new m1(context);
    }
}
