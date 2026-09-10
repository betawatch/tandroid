package qg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
import org.telegram.ui.u00;
import xh.b4;
import xh.n7;
import xh.o8;
import xh.p2;
import xh.q2;
import xh.x2;
import xh.x3;
import zh.g4;
import zh.m5;
import zh.n5;
import zh.o6;
import zh.q3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(a6.i iVar, View view) {
        this.a = 3;
        this.b = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        p2 p2Var;
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.l0;
                limitPreviewView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue < 0.5f ? (floatValue / 0.5f) * (-7.0f) : (1.0f - ((floatValue - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 1:
                s0 s0Var = (s0) obj;
                s0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0Var.d.invalidate();
                r0 r0Var = s0Var.e;
                if (r0Var != null) {
                    r0Var.invalidate();
                    break;
                }
                break;
            case 2:
                ((x1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 3:
                ((View) ((g.c0) ((a6.i) obj).b).d.getParent()).invalidate();
                break;
            case 4:
                sg.b bVar = (sg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 5:
                wg.h hVar = (wg.h) obj;
                hVar.getClass();
                hVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                x3 x3Var = (x3) obj;
                x3Var.Y0.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.T1();
                break;
            case 7:
                ((x2) obj).h.invalidate();
                break;
            case 8:
                q2 q2Var = (q2) obj;
                q2Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.E = floatValue2;
                if (floatValue2 >= 0.8f && (p2Var = q2Var.H) != null && (z10 = p2Var.l) && z10) {
                    p2Var.l = false;
                    p2Var.b();
                }
                q2Var.invalidate();
                break;
            case 9:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 10:
                b4 b4Var = (b4) obj;
                b4Var.getClass();
                b4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                break;
            case 11:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00 u00Var = ((n7) obj).c;
                u00Var.setScaleX(floatValue3);
                u00Var.setScaleY(floatValue3);
                break;
            case 12:
                o8 o8Var = (o8) obj;
                o8Var.getClass();
                o8Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.invalidate();
                break;
            case 13:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg.u uVar = ((yg.v) obj).b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue4);
                    break;
                }
                break;
            case 14:
                zh.a aVar = (zh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 15:
                zh.k kVar = (zh.k) obj;
                kVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - kVar.b0.d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                kVar.invalidate();
                break;
            case 16:
                ((zh.m0) obj).invalidate();
                break;
            case 17:
                zh.o1 o1Var = (zh.o1) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.c.setAlpha(floatValue5);
                o1Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue5));
                o1Var.invalidate();
                break;
            case 18:
                zh.f0 f0Var = (zh.f0) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = f0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(f0Var.f, 1.0f, floatValue6) * 255.0f));
                    f0Var.h.invalidate();
                    break;
                }
                break;
            case 19:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zh.f0 f0Var2 = (zh.f0) ((yg.b) obj).b;
                Drawable drawable2 = f0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, f0Var2.f, floatValue7) * 255.0f));
                    f0Var2.h.invalidate();
                    break;
                }
                break;
            case 20:
                zh.x0 x0Var = (zh.x0) obj;
                x0Var.getClass();
                x0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 21:
                zh.e1 e1Var = (zh.e1) obj;
                e1Var.getClass();
                e1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.invalidate();
                break;
            case 22:
                zh.x2 x2Var = (zh.x2) obj;
                x2Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = x2Var.c;
                textViewArr[0].setAlpha(floatValue8);
                float f7 = 1.0f - floatValue8;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue8 * AndroidUtilities.dp(4.0f));
                break;
            case 23:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                s01 s01Var = profileStoriesView.h;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue9;
                s01Var.R = floatValue9;
                s01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 24:
                q3 q3Var = (q3) obj;
                q3Var.r = ((Float) q3Var.w.getAnimatedValue()).floatValue();
                q3Var.invalidate();
                break;
            case 25:
                g4 g4Var = (g4) obj;
                g4Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4Var.e.setTranslationY(((-g4Var.d) + g4Var.getMeasuredHeight()) - g4Var.v);
                break;
            case 26:
                n5 n5Var = (n5) obj;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = n5Var.a;
                m5 m5Var = (m5) arrayList.get(n5Var.d);
                m5Var.n = floatValue10;
                m5Var.invalidate();
                int i12 = n5Var.c;
                if (i12 != -1) {
                    m5 m5Var2 = (m5) arrayList.get(i12);
                    m5Var2.n = 1.0f - floatValue10;
                    m5Var2.invalidate();
                    break;
                }
                break;
            default:
                o6 o6Var = (o6) obj;
                o6Var.getClass();
                o6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidate();
                o6Var.requestLayout();
                o6Var.J.requestLayout();
                break;
        }
    }

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
