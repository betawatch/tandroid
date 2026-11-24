// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q68 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ q68(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // p8c
    public final void a(Object obj) {
        TextureView textureView;
        boolean z;
        boolean z2;
        int i;
        byte b = 9;
        boolean z3 = true;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                jza jzaVar = (jza) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((bm6) photoViewer.g7.get(photoViewer.P4)).i);
                    mza mzaVar = photoViewer.p5;
                    mzaVar.M = true;
                    mzaVar.F = jzaVar;
                    Bitmap n = photoViewer.C4.n();
                    int i2 = photoViewer.C4.V;
                    jza jzaVar2 = mzaVar.F;
                    photoViewer.C4.f0(jzaVar2 == null ? mzaVar.J : (isEmpty || n == null) ? jzaVar2.b() : mzaVar.e(n));
                    photoViewer.t5.setUndoCutState(true);
                    photoViewer.j2(true, true);
                    photoViewer.t5.post(new l68(photoViewer, b));
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                if (surfaceTexture != null && (textureView = photoViewer2.C2) != null) {
                    if (photoViewer2.L3) {
                        photoViewer2.G3 = (byte) 2;
                    }
                    textureView.setSurfaceTexture(surfaceTexture);
                    photoViewer2.C2.setVisibility(0);
                    photoViewer2.F3 = false;
                    photoViewer2.f0.invalidate();
                    gl.e3(new l68(photoViewer2, (byte) 12), 64L);
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.f9;
                u21.F(photoViewer3.f0, true).j();
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer4.M1.b2 = photoViewer4.L1.c();
                photoViewer4.f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer4.M1.d2);
                float L = (!(photoViewer4.M1.I0 instanceof vhb) || max <= 0) ? 0.0f : ((gl.q.y - max) - gl.L(80.0f)) - photoViewer4.M1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer4.y7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer4.y7 = null;
                }
                if (photoViewer4.u4 != 3) {
                    L = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer4.Z5, L);
                photoViewer4.y7 = ofFloat;
                ofFloat.addUpdateListener(new f68(photoViewer4, (byte) 10));
                photoViewer4.y7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer4.y7;
                s33 s33Var = s33.h;
                valueAnimator2.setInterpolator(s33Var);
                photoViewer4.y7.start();
                AnimatorSet animatorSet = photoViewer4.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new f68(photoViewer4, b));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer4.K1 = animatorSet2;
                zt7 zt7Var = photoViewer4.M1.b1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zt7Var, (Property<zt7, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer4.M1.S0, (Property<ow5, Float>) property, Math.min(0, gl.L(40.0f) + r14));
                f7 f7Var = photoViewer4.M1.V0;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(f7Var, (Property<f7, Float>) property2, max > gl.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer4.M1.q0, (Property<xr7, Float>) property2, max > gl.L(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer4.M1.r0, (Property<cs7, Float>) property2, max > gl.L(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(s33Var);
                animatorSet2.start();
                q88 q88Var = photoViewer4.M1;
                hs7 hs7Var = q88Var.k1;
                if (hs7Var != null) {
                    if (q88Var.b2) {
                        hs7Var.a(R.drawable.input_smile);
                    } else if (q88Var.a2) {
                        hs7Var.a(R.drawable.input_keyboard);
                    } else {
                        hs7Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = q88Var.o1;
                if (q88Var.b2 || q88Var.a2) {
                    z = false;
                    z2 = false;
                } else {
                    z = true;
                    z2 = false;
                }
                gl.P3(1.0f, textView, z, z2);
                gl.P3(1.0f, q88Var.m1, (q88Var.b2 || q88Var.a2) ? z2 : true, z2);
                gl.P3(1.0f, q88Var.q1, (q88Var.b2 || q88Var.a2) ? true : z2, z2);
                TextView textView2 = q88Var.p1;
                if (!q88Var.b2 && !q88Var.a2) {
                    z3 = z2;
                }
                gl.P3(1.0f, textView2, z3, z2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                jm6 jm6Var = (jm6) obj;
                Drawable[] drawableArr5 = PhotoViewer.f9;
                if (!photoViewer5.q5.b.R && (i = photoViewer5.P4) >= 0 && i < photoViewer5.g7.size() && (photoViewer5.g7.get(photoViewer5.P4) instanceof jm6)) {
                    v98 v98Var = photoViewer5.q5;
                    wr4 wr4Var = v98Var.h;
                    if (wr4Var != null) {
                        wr4Var.dismiss();
                        v98Var.h = null;
                    }
                    photoViewer5.q5.b.setLoading(true);
                    Utilities.e.c(new jw6(photoViewer5, jm6Var, (jm6) photoViewer5.g7.get(photoViewer5.P4), PhotoViewer.x0(), (byte) 18));
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Integer num = (Integer) obj;
                Drawable[] drawableArr6 = PhotoViewer.f9;
                Object obj2 = photoViewer6.g7.get(photoViewer6.P4);
                if (obj2 instanceof jm6) {
                    ((jm6) obj2).x = num.intValue();
                } else if (obj2 instanceof nm6) {
                    ((nm6) obj2).x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer6.d.w(photoViewer6.P4)) {
                    photoViewer6.U1();
                }
                photoViewer6.W1.setTimer(num.intValue());
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Integer num2 = (Integer) obj;
                Drawable[] drawableArr7 = PhotoViewer.f9;
                FrameLayout frameLayout = photoViewer7.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer7.X7.setTranslationY(photoViewer7.Q0.getTranslationY() - (photoViewer7.V1.getAlpha() * b00.c(46.0f, photoViewer7.V1.getEditTextHeight(), 0)));
                }
                photoViewer7.f1.setTranslationY(photoViewer7.V1.getAlpha() * (-b00.c(46.0f, num2.intValue(), 0)));
                photoViewer7.g1.setTranslationY(photoViewer7.V1.getAlpha() * (-b00.c(46.0f, num2.intValue(), 0)));
                photoViewer7.h1.setTranslationY(photoViewer7.V1.getAlpha() * (-b00.c(46.0f, num2.intValue(), 0)));
                eb1 eb1Var = photoViewer7.V1.N;
                if (eb1Var != null) {
                    eb1Var.setTranslationY((-num2.intValue()) - gl.L(14.0f));
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Integer num3 = (Integer) obj;
                Drawable[] drawableArr8 = PhotoViewer.f9;
                Object obj3 = photoViewer8.g7.get(photoViewer8.P4);
                if (obj3 instanceof jm6) {
                    ((jm6) obj3).x = num3.intValue();
                } else if (obj3 instanceof nm6) {
                    ((nm6) obj3).x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer8.d.w(photoViewer8.P4)) {
                    photoViewer8.U1();
                }
                photoViewer8.V1.setTimer(num3.intValue());
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Integer num4 = (Integer) obj;
                Drawable[] drawableArr9 = PhotoViewer.f9;
                eb1 eb1Var2 = photoViewer9.W1.N;
                if (eb1Var2 != null) {
                    eb1Var2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.f9;
                photoViewer10.w(0, false);
                break;
            default:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.f9;
                photoViewer11.w(0, false);
                break;
        }
    }
}
