package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ wo0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        boolean z10;
        boolean z11;
        int i10;
        int i11 = 9;
        int i12 = 8;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                jg.s2 s2Var = (jg.s2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.ze) photoViewer.g7.get(photoViewer.P4)).i);
                    jg.v2 v2Var = photoViewer.p5;
                    v2Var.L = true;
                    v2Var.E = s2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i13 = photoViewer.C4.U;
                    jg.s2 s2Var2 = v2Var.E;
                    photoViewer.C4.v0(s2Var2 == null ? v2Var.I : (isEmpty || n10 == null) ? s2Var2.b() : v2Var.e(n10));
                    photoViewer.t5.setUndoCutState(true);
                    photoViewer.d3(true, true);
                    photoViewer.t5.post(new qo0(photoViewer, i11));
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                org.telegram.ui.Components.cc.F(this.b.e0, true).j();
                break;
            case 2:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.L1.Q1 = photoViewer2.K1.c();
                photoViewer2.e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.S1);
                float L = (!(photoViewer2.L1.B0 instanceof jg.g3) || max <= 0) ? 0.0f : ((org.telegram.messenger.i0.q.y - max) - org.telegram.messenger.i0.L(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer2.s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.s7 = null;
                }
                if (photoViewer2.u4 != 3) {
                    L = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, L);
                photoViewer2.s7 = ofFloat;
                ofFloat.addUpdateListener(new po0(photoViewer2, i11));
                photoViewer2.s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.s7;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                valueAnimator2.setInterpolator(grVar);
                photoViewer2.s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new po0(photoViewer2, i12));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                jg.d2 d2Var = photoViewer2.L1.U0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(d2Var, (Property<jg.d2, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.L0, (Property<jg.n0, Float>) property, Math.min(0, org.telegram.messenger.i0.L(40.0f) + r15));
                jg.d0 d0Var = photoViewer2.L1.O0;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(d0Var, (Property<jg.d0, Float>) property2, max > org.telegram.messenger.i0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.L1.j0, (Property<jg.k1, Float>) property2, max > org.telegram.messenger.i0.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.L1.k0, (Property<jg.o1, Float>) property2, max > org.telegram.messenger.i0.L(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(grVar);
                animatorSet2.start();
                er0 er0Var = photoViewer2.L1;
                jg.t1 t1Var = er0Var.d1;
                if (t1Var != null) {
                    if (er0Var.Q1) {
                        t1Var.a(R.drawable.input_smile);
                    } else if (er0Var.P1) {
                        t1Var.a(R.drawable.input_keyboard);
                    } else {
                        t1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = er0Var.h1;
                if (er0Var.Q1 || er0Var.P1) {
                    z10 = false;
                    z11 = false;
                } else {
                    z10 = true;
                    z11 = false;
                }
                org.telegram.messenger.i0.T3(1.0f, textView, z10, z11);
                org.telegram.messenger.i0.T3(1.0f, er0Var.f1, (er0Var.Q1 || er0Var.P1) ? z11 : true, z11);
                org.telegram.messenger.i0.T3(1.0f, er0Var.j1, (er0Var.Q1 || er0Var.P1) ? true : z11, z11);
                TextView textView2 = er0Var.i1;
                if (!er0Var.Q1 && !er0Var.P1) {
                    z12 = z11;
                }
                org.telegram.messenger.i0.T3(1.0f, textView2, z12, z11);
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (!photoViewer3.q5.b.Q && (i10 = photoViewer3.P4) >= 0 && i10 < photoViewer3.g7.size() && (photoViewer3.g7.get(photoViewer3.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.ui.Components.pe0 pe0Var = photoViewer3.q5;
                    vh.n2 n2Var = pe0Var.h;
                    if (n2Var != null) {
                        n2Var.dismiss();
                        pe0Var.h = null;
                    }
                    photoViewer3.q5.b.setLoading(true);
                    Utilities.e.c(new w50(photoViewer3, efVar, (org.telegram.messenger.ef) photoViewer3.g7.get(photoViewer3.P4), PhotoViewer.A1(), 17));
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer4 = this.b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.g7.get(photoViewer4.P4);
                if (obj2 instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj2).x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.P2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * i0.a.d(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.e1.setTranslationY(photoViewer5.U1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f1.setTranslationY(photoViewer5.U1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                photoViewer5.g1.setTranslationY(photoViewer5.U1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                org.telegram.ui.Components.oh ohVar = photoViewer5.U1.M;
                if (ohVar != null) {
                    ohVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.i0.L(14.0f));
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer6 = this.b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.g7.get(photoViewer6.P4);
                if (obj3 instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj3).x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.P2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                break;
            case 7:
                Integer num4 = (Integer) obj;
                org.telegram.ui.Components.oh ohVar2 = this.b.V1.M;
                if (ohVar2 != null) {
                    ohVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.C0(0, false);
                break;
            default:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.C0(0, false);
                break;
        }
    }
}
