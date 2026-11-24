// default package

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 0;
        byte b = 1;
        switch (this.a) {
            case 0:
                fz1 fz1Var = (fz1) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (fz1Var != null) {
                    x02 x02Var = fz1Var.b;
                    x02Var.G0 = -1;
                    x02Var.H0 = intValue;
                    x02Var.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                be0 be0Var = (be0) this.b;
                be0 be0Var2 = (be0) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0Var.setScaleX(floatValue);
                be0Var.setScaleY(floatValue);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !be0Var2.getImageReceiver().B()) {
                    be0Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 2:
                nf0 nf0Var = (nf0) this.b;
                ik1 ik1Var = (ik1) this.c;
                ik1Var.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = nf0Var.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ik1 ik1Var2 = (ik1) obj;
                    if (ik1Var2 != ik1Var) {
                        ik1Var2.f = (int) ((ik1Var2.g / 255.0f) * (255 - ik1Var.f));
                    }
                }
                nf0Var.invalidate();
                break;
            case 3:
                nf0 nf0Var2 = (nf0) this.b;
                dk1 dk1Var = (dk1) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = nf0Var2.c;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    dk1 dk1Var2 = (dk1) obj2;
                    if (dk1Var2 == dk1Var) {
                        dk1Var.d = (int) (floatValue2 * 255.0f);
                    } else {
                        dk1Var2.d = (int) ((1.0f - floatValue2) * dk1Var2.e);
                    }
                }
                nf0Var2.invalidate();
                break;
            case 4:
                ((gw) this.b).accept(Float.valueOf(((q11) this.c).getTranslationY()));
                break;
            case 5:
                ((i42) this.b).accept(Float.valueOf(((q11) this.c).getTranslationY()));
                break;
            case 6:
                mu1 mu1Var = (mu1) this.b;
                mu1 mu1Var2 = (mu1) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var2.ra = floatValue3;
                mu1Var2.fragmentView.invalidate();
                mu1Var2.A0.invalidate();
                float f = 1.0f - floatValue3;
                float L = gl.L(8.0f) * f;
                mu1Var.p1.setTranslationY(L);
                mu1Var.p1.getAvatarImageView().setTranslationY(-L);
                float f2 = (-gl.L(8.0f)) * floatValue3;
                mu1Var2.p1.setTranslationY(f2);
                mu1Var2.p1.getAvatarImageView().setTranslationY(-f2);
                float f3 = (floatValue3 * 0.2f) + 0.8f;
                mu1Var.p1.getAvatarImageView().setScaleX(f3);
                mu1Var.p1.getAvatarImageView().setScaleY(f3);
                mu1Var.p1.getAvatarImageView().setAlpha(floatValue3);
                float f4 = (0.2f * f) + 0.8f;
                mu1Var2.p1.getAvatarImageView().setScaleX(f4);
                mu1Var2.p1.getAvatarImageView().setScaleY(f4);
                mu1Var2.p1.getAvatarImageView().setAlpha(f);
                ez1 ez1Var = mu1Var2.b1;
                if (ez1Var != null) {
                    ez1Var.setAlpha(f);
                    break;
                }
                break;
            case 7:
                zz1 zz1Var = (zz1) this.b;
                ((gt3) this.c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x02 x02Var2 = zz1Var.d0;
                x02Var2.E1();
                p02 p02Var = x02Var2.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var2.d2;
                if (p02Var == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(x02Var2.i4);
                    break;
                }
                break;
            case 8:
                p82 p82Var = (p82) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p82Var.O.setAlpha(floatValue4);
                float f5 = 1.0f - floatValue4;
                p82Var.O.setTranslationY(((-r4.getHeight()) / 2.0f) * f5);
                p82Var.O.setScaleY((floatValue4 * 0.8f) + 0.2f);
                while (i < arrayList3.size()) {
                    ((View) arrayList3.get(i)).setTranslationY((-p82Var.O.getHeight()) * f5);
                    i++;
                }
                break;
            case 9:
                tk1 tk1Var = (tk1) this.b;
                uk1 uk1Var = (uk1) this.c;
                tk1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uk1Var.invalidate();
                break;
            case 10:
                m43 m43Var = (m43) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < arrayList4.size()) {
                    m43.g((View) arrayList4.get(i), floatValue5);
                    i++;
                }
                m43Var.m.l0.invalidate();
                break;
            case 11:
                ((gb3) this.b).P((s49) this.c);
                break;
            case 12:
                uf3 uf3Var = (uf3) this.b;
                jia jiaVar = (jia) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f6 = 1.0f - floatValue6;
                jiaVar.setAlpha(f6);
                jiaVar.setTranslationY((-gl.L(5.0f)) * floatValue6);
                uf3Var.E.setAlpha(floatValue6);
                uf3Var.E.setTranslationY(gl.L(5.0f) * f6);
                break;
            case 13:
                ((ah3) this.b).M.W4((bj3) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                xf4 xf4Var = (xf4) this.b;
                ((rk) this.c).b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i < ((ArrayList) xf4Var.c).size()) {
                    if (!pg5.b) {
                        ((View) ((ArrayList) xf4Var.c).get(i)).invalidate();
                    }
                    i++;
                }
                break;
            case 15:
                jm4 jm4Var = (jm4) this.b;
                int[] iArr = (int[]) this.c;
                jm4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{bm2.f(floatValue7, iArr[0], jm4Var.h[0]), bm2.f(floatValue7, iArr[1], jm4Var.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                jm4Var.b = linearGradient;
                linearGradient.setLocalMatrix(jm4Var.c);
                paint.setShader(jm4Var.b);
                jm4Var.a.r.put(0, paint);
                jm4Var.g.setColor(bm2.f(0.1f, bm2.f(floatValue7, iArr[1], jm4Var.h[1]), -1));
                jm4Var.f.setColor(bm2.f(0.1f, bm2.f(floatValue7, iArr[0], jm4Var.h[0]), -16777216));
                jm4Var.invalidateSelf();
                break;
            case 16:
                l95 l95Var = (l95) this.b;
                h85 h85Var = (h85) this.c;
                l95Var.getClass();
                h85Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l95Var.invalidate();
                break;
            case 17:
                MediaController mediaController = (MediaController) this.b;
                lbc lbcVar = (lbc) this.c;
                String[] strArr = MediaController.W1;
                lbcVar.A0(((Float) valueAnimator.getAnimatedValue()).floatValue() * (mediaController.Y != 1 ? 1.0f : 0.2f));
                break;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                View view = (View) this.c;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.invalidateOutline();
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.invalidateOutline();
                }
                j98 j98Var = photoViewer.F2;
                if (j98Var != null) {
                    j98Var.invalidateOutline();
                    break;
                }
                break;
            case 19:
                da8 da8Var = (da8) this.b;
                ((ea8) this.c).r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da8Var.invalidate();
                break;
            case 20:
                eh8 eh8Var = (eh8) this.b;
                ((Drawable) this.c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view2 = ((xh8) eh8Var.c).v2;
                if (!(view2 instanceof gb2)) {
                    view2.invalidate();
                    break;
                } else {
                    ((gb2) view2).r2();
                    break;
                }
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i2 = ProfileStoriesView.t0;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue8 > 0.2f) {
                    zArr[0] = true;
                    if (gba.o() > 0) {
                        gl.W3(profileStoriesView);
                        gl.d3(new sr8(profileStoriesView, b), 180L);
                    }
                }
                profileStoriesView.a0 = Math.max(1.0f, floatValue8);
                profileStoriesView.invalidate();
                break;
            case 22:
                TextView textView = (TextView) this.b;
                TextView textView2 = (TextView) this.c;
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                e09 e09Var = (e09) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue9 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        e09Var.t0.b(e09Var.A0, false);
                    }
                    float f7 = (floatValue9 - 0.5f) / 0.5f;
                    e09Var.setRotationY((1.0f - f7) * (-90.0f));
                    e09Var.B0 = (f7 * 0.3f) + 0.7f;
                    e09Var.invalidate();
                    break;
                } else {
                    float f8 = floatValue9 / 0.5f;
                    e09Var.setRotationY(90.0f * f8);
                    e09Var.B0 = ((1.0f - f8) * 0.3f) + 0.7f;
                    e09Var.invalidate();
                    break;
                }
            case 24:
                kp kpVar = (kp) this.b;
                int[] iArr2 = (int[]) this.c;
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i3 = intValue2 - kpVar.b;
                ((o39) kpVar.d).scrollBy(0, i3);
                iArr2[0] = iArr2[0] + i3;
                kpVar.b = intValue2;
                break;
            case 25:
                jd1 jd1Var = (jd1) this.b;
                k88 k88Var = (k88) this.c;
                int intValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                jd1Var.a = intValue3;
                k88Var.c(intValue3);
                break;
            case 26:
                nh9 nh9Var = (nh9) this.b;
                View view3 = (View) this.c;
                nh9Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
            case 27:
                e1b e1bVar = (e1b) this.b;
                f15[] f15VarArr = (f15[]) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < f15VarArr.length) {
                    e1bVar.c[i] = (e1bVar.d[i] * floatValue10) + ((1.0f - floatValue10) * e1bVar.e[i]);
                    i++;
                }
                e1bVar.invalidate();
                break;
            case 28:
                obb obbVar = (obb) this.b;
                nbb nbbVar = (nbb) this.c;
                obbVar.getClass();
                nbbVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                obbVar.i();
                break;
            default:
                ((View) ((zwc) ((g29) this.b).b).d.getParent()).invalidate();
                break;
        }
    }
}
