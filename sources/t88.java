// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t88 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ t88(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // qac
    public final void a(Object obj) {
        boolean z;
        boolean z2;
        int i;
        boolean z3 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                k1b k1bVar = (k1b) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((co6) photoViewer.f7.get(photoViewer.O4)).i);
                    n1b n1bVar = photoViewer.o5;
                    n1bVar.M = true;
                    n1bVar.F = k1bVar;
                    Bitmap n = photoViewer.B4.n();
                    int i2 = photoViewer.B4.V;
                    k1b k1bVar2 = n1bVar.F;
                    photoViewer.B4.f0(k1bVar2 == null ? n1bVar.J : (isEmpty || n == null) ? k1bVar2.b() : n1bVar.e(n));
                    photoViewer.s5.setUndoCutState(true);
                    photoViewer.k2(true, true);
                    photoViewer.s5.post(new n88(photoViewer, (byte) 7));
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                ndc ndcVar = photoViewer2.G2;
                if (ndcVar != null && photoViewer2.C2 != null) {
                    if (photoViewer2.L3) {
                        photoViewer2.G3 = (byte) 2;
                    }
                    ndcVar.z0(null);
                    photoViewer2.G2.z0(photoViewer2.C2);
                    photoViewer2.C2.setVisibility(0);
                    photoViewer2.F3 = false;
                    photoViewer2.f0.invalidate();
                    if (photoViewer2.G2.c0()) {
                        gm.d3(new n88(photoViewer2, (byte) 15), 500L);
                    } else {
                        photoViewer2.X8 = true;
                        photoViewer2.q(false);
                    }
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                c41.F(photoViewer3.f0, true).j();
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer4.M1.b2 = photoViewer4.L1.c();
                photoViewer4.f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer4.M1.d2);
                float L = (!(photoViewer4.M1.I0 instanceof xjb) || max <= 0) ? 0.0f : ((gm.q.y - max) - gm.L(80.0f)) - photoViewer4.M1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer4.x7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer4.x7 = null;
                }
                if (photoViewer4.t4 != 3) {
                    L = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer4.Y5, L);
                photoViewer4.x7 = ofFloat;
                ofFloat.addUpdateListener(new h88(photoViewer4, (byte) 10));
                photoViewer4.x7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer4.x7;
                d53 d53Var = d53.h;
                valueAnimator2.setInterpolator(d53Var);
                photoViewer4.x7.start();
                AnimatorSet animatorSet = photoViewer4.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new h88(photoViewer4, (byte) 9));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer4.K1 = animatorSet2;
                aw7 aw7Var = photoViewer4.M1.b1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aw7Var, (Property<aw7, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer4.M1.S0, (Property<oy5, Float>) property, Math.min(0, gm.L(40.0f) + r14));
                f7 f7Var = photoViewer4.M1.V0;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(f7Var, (Property<f7, Float>) property2, max > gm.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer4.M1.q0, (Property<yt7, Float>) property2, max > gm.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer4.M1.r0, (Property<du7, Float>) property2, max > gm.L(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(d53Var);
                animatorSet2.start();
                sa8 sa8Var = photoViewer4.M1;
                iu7 iu7Var = sa8Var.k1;
                if (iu7Var != null) {
                    if (sa8Var.b2) {
                        iu7Var.a(R.drawable.input_smile);
                    } else if (sa8Var.a2) {
                        iu7Var.a(R.drawable.input_keyboard);
                    } else {
                        iu7Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = sa8Var.o1;
                if (sa8Var.b2 || sa8Var.a2) {
                    z = false;
                    z2 = false;
                } else {
                    z = true;
                    z2 = false;
                }
                gm.O3(1.0f, textView, z, z2);
                gm.O3(1.0f, sa8Var.m1, (sa8Var.b2 || sa8Var.a2) ? z2 : true, z2);
                gm.O3(1.0f, sa8Var.q1, (sa8Var.b2 || sa8Var.a2) ? true : z2, z2);
                TextView textView2 = sa8Var.p1;
                if (!sa8Var.b2 && !sa8Var.a2) {
                    z3 = z2;
                }
                gm.O3(1.0f, textView2, z3, z2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                jo6 jo6Var = (jo6) obj;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                if (!photoViewer5.p5.b.R && (i = photoViewer5.O4) >= 0 && i < photoViewer5.f7.size() && (photoViewer5.f7.get(photoViewer5.O4) instanceof jo6)) {
                    wb8 wb8Var = photoViewer5.p5;
                    xt4 xt4Var = wb8Var.h;
                    if (xt4Var != null) {
                        xt4Var.dismiss();
                        wb8Var.h = null;
                    }
                    photoViewer5.p5.b.setLoading(true);
                    Utilities.e.c(new jy6(photoViewer5, jo6Var, (jo6) photoViewer5.f7.get(photoViewer5.O4), PhotoViewer.x0(), (byte) 18));
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Integer num = (Integer) obj;
                Drawable[] drawableArr6 = PhotoViewer.d9;
                Object obj2 = photoViewer6.f7.get(photoViewer6.O4);
                if (obj2 instanceof jo6) {
                    ((jo6) obj2).x = num.intValue();
                } else if (obj2 instanceof no6) {
                    ((no6) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer6.d.w(photoViewer6.O4)) {
                    photoViewer6.V1();
                }
                photoViewer6.W1.setTimer(num.intValue());
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Integer num2 = (Integer) obj;
                Drawable[] drawableArr7 = PhotoViewer.d9;
                FrameLayout frameLayout = photoViewer7.W7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer7.W7.setTranslationY(photoViewer7.Q0.getTranslationY() - (photoViewer7.V1.getAlpha() * b10.c(46.0f, photoViewer7.V1.getEditTextHeight(), 0)));
                }
                photoViewer7.f1.setTranslationY(photoViewer7.V1.getAlpha() * (-b10.c(46.0f, num2.intValue(), 0)));
                photoViewer7.g1.setTranslationY(photoViewer7.V1.getAlpha() * (-b10.c(46.0f, num2.intValue(), 0)));
                photoViewer7.h1.setTranslationY(photoViewer7.V1.getAlpha() * (-b10.c(46.0f, num2.intValue(), 0)));
                lc1 lc1Var = photoViewer7.V1.N;
                if (lc1Var != null) {
                    lc1Var.setTranslationY((-num2.intValue()) - gm.L(14.0f));
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Integer num3 = (Integer) obj;
                Drawable[] drawableArr8 = PhotoViewer.d9;
                Object obj3 = photoViewer8.f7.get(photoViewer8.O4);
                if (obj3 instanceof jo6) {
                    ((jo6) obj3).x = num3.intValue();
                } else if (obj3 instanceof no6) {
                    ((no6) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer8.d.w(photoViewer8.O4)) {
                    photoViewer8.V1();
                }
                photoViewer8.V1.setTimer(num3.intValue());
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Integer num4 = (Integer) obj;
                Drawable[] drawableArr9 = PhotoViewer.d9;
                lc1 lc1Var2 = photoViewer9.W1.N;
                if (lc1Var2 != null) {
                    lc1Var2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.d9;
                photoViewer10.u(0, false);
                break;
            default:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.d9;
                photoViewer11.u(0, false);
                break;
        }
    }
}
