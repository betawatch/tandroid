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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pl(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 0;
        switch (this.a) {
            case 0:
                s02 s02Var = (s02) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (s02Var != null) {
                    i22 i22Var = s02Var.b;
                    i22Var.G0 = -1;
                    i22Var.H0 = intValue;
                    i22Var.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                bf0 bf0Var = (bf0) this.b;
                bf0 bf0Var2 = (bf0) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bf0Var.setScaleX(floatValue);
                bf0Var.setScaleY(floatValue);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction > 0.25f && !bf0Var2.getImageReceiver().B()) {
                    bf0Var.setAlpha(1.0f - ((animatedFraction - 0.25f) * 1.3333334f));
                    break;
                }
                break;
            case 2:
                ng0 ng0Var = (ng0) this.b;
                ql1 ql1Var = (ql1) this.c;
                ql1Var.f = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = ng0Var.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ql1 ql1Var2 = (ql1) obj;
                    if (ql1Var2 != ql1Var) {
                        ql1Var2.f = (int) ((ql1Var2.g / 255.0f) * (255 - ql1Var.f));
                    }
                }
                ng0Var.invalidate();
                break;
            case 3:
                ng0 ng0Var2 = (ng0) this.b;
                ll1 ll1Var = (ll1) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList2 = ng0Var2.c;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ll1 ll1Var2 = (ll1) obj2;
                    if (ll1Var2 == ll1Var) {
                        ll1Var.d = (int) (floatValue2 * 255.0f);
                    } else {
                        ll1Var2.d = (int) ((1.0f - floatValue2) * ll1Var2.e);
                    }
                }
                ng0Var2.invalidate();
                break;
            case 4:
                ((gx) this.b).accept(Float.valueOf(((y21) this.c).getTranslationY()));
                break;
            case 5:
                ((t52) this.b).accept(Float.valueOf(((y21) this.c).getTranslationY()));
                break;
            case 6:
                yv1 yv1Var = (yv1) this.b;
                yv1 yv1Var2 = (yv1) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var2.ra = floatValue3;
                yv1Var2.fragmentView.invalidate();
                yv1Var2.A0.invalidate();
                float f = 1.0f - floatValue3;
                float L = gm.L(8.0f) * f;
                yv1Var.p1.setTranslationY(L);
                yv1Var.p1.getAvatarImageView().setTranslationY(-L);
                float f2 = (-gm.L(8.0f)) * floatValue3;
                yv1Var2.p1.setTranslationY(f2);
                yv1Var2.p1.getAvatarImageView().setTranslationY(-f2);
                float f3 = (floatValue3 * 0.2f) + 0.8f;
                yv1Var.p1.getAvatarImageView().setScaleX(f3);
                yv1Var.p1.getAvatarImageView().setScaleY(f3);
                yv1Var.p1.getAvatarImageView().setAlpha(floatValue3);
                float f4 = (0.2f * f) + 0.8f;
                yv1Var2.p1.getAvatarImageView().setScaleX(f4);
                yv1Var2.p1.getAvatarImageView().setScaleY(f4);
                yv1Var2.p1.getAvatarImageView().setAlpha(f);
                r02 r02Var = yv1Var2.b1;
                if (r02Var != null) {
                    r02Var.setAlpha(f);
                    break;
                }
                break;
            case 7:
                k12 k12Var = (k12) this.b;
                ((qu3) this.c).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                i22 i22Var2 = k12Var.d0;
                i22Var2.E1();
                a22 a22Var = i22Var2.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var2.d2;
                if (a22Var == chatAttachAlertPhotoLayout) {
                    chatAttachAlertPhotoLayout.m(i22Var2.i4);
                    break;
                }
                break;
            case 8:
                ba2 ba2Var = (ba2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ba2Var.O.setAlpha(floatValue4);
                float f5 = 1.0f - floatValue4;
                ba2Var.O.setTranslationY(((-r4.getHeight()) / 2.0f) * f5);
                ba2Var.O.setScaleY((floatValue4 * 0.8f) + 0.2f);
                while (i < arrayList3.size()) {
                    ((View) arrayList3.get(i)).setTranslationY((-ba2Var.O.getHeight()) * f5);
                    i++;
                }
                break;
            case 9:
                bm1 bm1Var = (bm1) this.b;
                cm1 cm1Var = (cm1) this.c;
                bm1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cm1Var.invalidate();
                break;
            case 10:
                x53 x53Var = (x53) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < arrayList4.size()) {
                    x53.g((View) arrayList4.get(i), floatValue5);
                    i++;
                }
                x53Var.m.l0.invalidate();
                break;
            case 11:
                ((sc3) this.b).P((u69) this.c);
                break;
            case 12:
                hh3 hh3Var = (hh3) this.b;
                lka lkaVar = (lka) this.c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f6 = 1.0f - floatValue6;
                lkaVar.setAlpha(f6);
                lkaVar.setTranslationY((-gm.L(5.0f)) * floatValue6);
                hh3Var.E.setAlpha(floatValue6);
                hh3Var.E.setTranslationY(gm.L(5.0f) * f6);
                break;
            case 13:
                ((mi3) this.b).M.a5((mk3) this.c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                yh4 yh4Var = (yh4) this.b;
                ((rl) this.c).b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                while (i < ((ArrayList) yh4Var.c).size()) {
                    if (!oi5.b) {
                        ((View) ((ArrayList) yh4Var.c).get(i)).invalidate();
                    }
                    i++;
                }
                break;
            case 15:
                ko4 ko4Var = (ko4) this.b;
                int[] iArr = (int[]) this.c;
                ko4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{on2.f(floatValue7, iArr[0], ko4Var.h[0]), on2.f(floatValue7, iArr[1], ko4Var.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                ko4Var.b = linearGradient;
                linearGradient.setLocalMatrix(ko4Var.c);
                paint.setShader(ko4Var.b);
                ko4Var.a.r.put(0, paint);
                ko4Var.g.setColor(on2.f(0.1f, on2.f(floatValue7, iArr[1], ko4Var.h[1]), -1));
                ko4Var.f.setColor(on2.f(0.1f, on2.f(floatValue7, iArr[0], ko4Var.h[0]), -16777216));
                ko4Var.invalidateSelf();
                break;
            case 16:
                jb5 jb5Var = (jb5) this.b;
                ha5 ha5Var = (ha5) this.c;
                jb5Var.getClass();
                ha5Var.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                jb5Var.invalidate();
                break;
            case 17:
                MediaController mediaController = (MediaController) this.b;
                ndc ndcVar = (ndc) this.c;
                String[] strArr = MediaController.W1;
                ndcVar.A0(((Float) valueAnimator.getAnimatedValue()).floatValue() * (mediaController.Y != 1 ? 1.0f : 0.2f));
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
                kb8 kb8Var = photoViewer.F2;
                if (kb8Var != null) {
                    kb8Var.invalidateOutline();
                    break;
                }
                break;
            case 19:
                ec8 ec8Var = (ec8) this.b;
                ((fc8) this.c).r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec8Var.invalidate();
                break;
            case 20:
                ic8 ic8Var = (ic8) this.b;
                ((Drawable) this.c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view2 = ((yj8) ic8Var.c).v2;
                if (!(view2 instanceof rc2)) {
                    view2.invalidate();
                    break;
                } else {
                    ((rc2) view2).r2();
                    break;
                }
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                boolean[] zArr = (boolean[]) this.c;
                int i2 = ProfileStoriesView.t0;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue8 > 0.2f) {
                    zArr[0] = true;
                    if (gda.o() > 0) {
                        gm.W3(profileStoriesView);
                        gm.d3(new pp8(profileStoriesView, (byte) 9), 180L);
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
                g29 g29Var = (g29) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue9 >= 0.5f) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        g29Var.t0.b(g29Var.A0, false);
                    }
                    float f7 = (floatValue9 - 0.5f) / 0.5f;
                    g29Var.setRotationY((1.0f - f7) * (-90.0f));
                    g29Var.B0 = (f7 * 0.3f) + 0.7f;
                    g29Var.invalidate();
                    break;
                } else {
                    float f8 = floatValue9 / 0.5f;
                    g29Var.setRotationY(90.0f * f8);
                    g29Var.B0 = ((1.0f - f8) * 0.3f) + 0.7f;
                    g29Var.invalidate();
                    break;
                }
            case 24:
                kq kqVar = (kq) this.b;
                int[] iArr2 = (int[]) this.c;
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i3 = intValue2 - kqVar.b;
                ((r59) kqVar.d).scrollBy(0, i3);
                iArr2[0] = iArr2[0] + i3;
                kqVar.b = intValue2;
                break;
            case 25:
                re1 re1Var = (re1) this.b;
                h68 h68Var = (h68) this.c;
                int intValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                re1Var.a = intValue3;
                h68Var.c(intValue3);
                break;
            case 26:
                qj9 qj9Var = (qj9) this.b;
                View view3 = (View) this.c;
                qj9Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
            case 27:
                g3b g3bVar = (g3b) this.b;
                f35[] f35VarArr = (f35[]) this.c;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < f35VarArr.length) {
                    g3bVar.c[i] = (g3bVar.d[i] * floatValue10) + ((1.0f - floatValue10) * g3bVar.e[i]);
                    i++;
                }
                g3bVar.invalidate();
                break;
            case 28:
                qdb qdbVar = (qdb) this.b;
                pdb pdbVar = (pdb) this.c;
                qdbVar.getClass();
                pdbVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qdbVar.i();
                break;
            default:
                ((View) ((azc) ((et8) this.b).b).d.getParent()).invalidate();
                break;
        }
    }
}
