package qh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.jx0;
import org.telegram.ui.xz;
import rh.a3;
import rh.e4;
import rh.i4;
import rh.t2;
import rh.u2;
import rh.v8;
import rh.w7;
import th.d1;
import th.f4;
import th.h5;
import th.i5;
import th.i6;
import th.p1;
import th.p3;
import th.w2;
import vh.n2;
import vh.p2;
import vh.y2;
import vh.z1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        t2 t2Var;
        boolean z10;
        switch (this.a) {
            case 0:
                ((i0) this.b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                e4 e4Var = (e4) this.b;
                e4Var.T2.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.P1();
                break;
            case 2:
                ((a3) this.b).h.invalidate();
                break;
            case 3:
                u2 u2Var = (u2) this.b;
                u2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.E = floatValue;
                if (floatValue >= 0.8f && (t2Var = u2Var.H) != null && (z10 = t2Var.l) && z10) {
                    t2Var.l = false;
                    t2Var.b();
                }
                u2Var.invalidate();
                break;
            case 4:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 5:
                i4 i4Var = (i4) this.b;
                i4Var.getClass();
                i4Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                break;
            case 6:
                w7 w7Var = (w7) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz xzVar = w7Var.c;
                xzVar.setScaleX(floatValue2);
                xzVar.setScaleY(floatValue2);
                break;
            case 7:
                v8 v8Var = (v8) this.b;
                v8Var.getClass();
                v8Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                break;
            case 8:
                sg.s sVar = (sg.s) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.q qVar = sVar.b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue3);
                    break;
                }
                break;
            case 9:
                th.a aVar = (th.a) this.b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 10:
                th.l lVar = (th.l) this.b;
                lVar.O.e = org.telegram.messenger.i0.T1(0.0f, 1.0f - lVar.b0.d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                lVar.invalidate();
                break;
            case 11:
                ((th.j0) this.b).invalidate();
                break;
            case 12:
                p1 p1Var = (p1) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p1Var.c.setAlpha(floatValue4);
                p1Var.a.setAlpha(org.telegram.messenger.i0.T1(0.0f, 0.5f, floatValue4));
                p1Var.invalidate();
                break;
            case 13:
                th.c0 c0Var = (th.c0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = c0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (org.telegram.messenger.i0.T1(c0Var.f, 1.0f, floatValue5) * 255.0f));
                    c0Var.h.invalidate();
                    break;
                }
                break;
            case 14:
                sg.r rVar = (sg.r) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th.c0 c0Var2 = (th.c0) rVar.b;
                Drawable drawable2 = c0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (org.telegram.messenger.i0.T1(1.0f, c0Var2.f, floatValue6) * 255.0f));
                    c0Var2.h.invalidate();
                    break;
                }
                break;
            case 15:
                th.w0 w0Var = (th.w0) this.b;
                w0Var.getClass();
                w0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                d1 d1Var = (d1) this.b;
                d1Var.getClass();
                d1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                break;
            case 17:
                w2 w2Var = (w2) this.b;
                w2Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = w2Var.c;
                textViewArr[0].setAlpha(floatValue7);
                float f7 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-org.telegram.messenger.i0.L(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue7 * org.telegram.messenger.i0.L(4.0f));
                break;
            case 18:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                jx0 jx0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                jx0Var.R = floatValue8;
                jx0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 19:
                p3 p3Var = (p3) this.b;
                p3Var.r = ((Float) p3Var.x.getAnimatedValue()).floatValue();
                p3Var.invalidate();
                break;
            case 20:
                f4 f4Var = (f4) this.b;
                f4Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.e.setTranslationY(((-f4Var.d) + f4Var.getMeasuredHeight()) - f4Var.w);
                break;
            case 21:
                i5 i5Var = (i5) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = i5Var.a;
                h5 h5Var = (h5) arrayList.get(i5Var.d);
                h5Var.n = floatValue9;
                h5Var.invalidate();
                int i10 = i5Var.c;
                if (i10 != -1) {
                    h5 h5Var2 = (h5) arrayList.get(i10);
                    h5Var2.n = 1.0f - floatValue9;
                    h5Var2.invalidate();
                    break;
                }
                break;
            case 22:
                i6 i6Var = (i6) this.b;
                i6Var.getClass();
                i6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.invalidate();
                i6Var.requestLayout();
                i6Var.J.requestLayout();
                break;
            case 23:
                uh.m mVar = (uh.m) this.b;
                mVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.r.setTranslationY(org.telegram.messenger.i0.W1(mVar.x, -org.telegram.messenger.i0.L(42.0f), 0));
                mVar.n.setTranslationY(org.telegram.messenger.i0.W1(mVar.x, 0, org.telegram.messenger.i0.L(42.0f)));
                break;
            case 24:
                vh.k kVar = (vh.k) this.b;
                kVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh.f fVar = kVar.f;
                fVar.getEditText().setTranslationX(org.telegram.messenger.i0.W1(kVar.n0, kVar.getEditTextLeft() + org.telegram.messenger.i0.L(-26.0f), org.telegram.messenger.i0.L(2.0f)));
                FrameLayout frameLayout = kVar.s;
                frameLayout.setTranslationX(org.telegram.messenger.i0.W1(kVar.n0, -org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(2.0f)));
                frameLayout.setTranslationY(org.telegram.messenger.i0.W1(kVar.n0, -org.telegram.messenger.i0.L(8.0f), 0));
                fVar.getEmojiButton().setAlpha(kVar.n0);
                kVar.r.setAlpha((float) Math.pow(kVar.n0, 16.0d));
                kVar.u(kVar.n0);
                oh ohVar = kVar.M;
                if (ohVar != null) {
                    ohVar.setAlpha((float) Math.pow(kVar.n0, 4.0d));
                }
                fVar.getEditText().invalidate();
                kVar.invalidate();
                break;
            case 25:
                vh.t tVar = (vh.t) this.b;
                tVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.a.invalidate();
                break;
            case 26:
                z1 z1Var = (z1) this.b;
                z1Var.getClass();
                z1Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.i();
                break;
            case 27:
                ((n2) this.b).i1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                p2 p2Var = (p2) this.b;
                p2Var.getClass();
                p2Var.o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                p2Var.invalidate();
                break;
            default:
                ((y2) this.b).invalidate();
                break;
        }
    }
}
