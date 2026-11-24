// default package

import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rha implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rha(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        nra nraVar;
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                sha shaVar = (sha) obj;
                shaVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                shaVar.invalidate();
                break;
            case 1:
                dka dkaVar = (dka) obj;
                dkaVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dkaVar.invalidate();
                break;
            case 2:
                jla jlaVar = (jla) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jlaVar.w = floatValue;
                colorMatrix.setSaturation(floatValue);
                if (cmb.I.o()) {
                    gm.h(colorMatrix, (1.0f - jlaVar.w) * (-0.3f));
                }
                jlaVar.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 3:
                wsa wsaVar = (wsa) obj;
                wsaVar.W2.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wsaVar.O1();
                break;
            case 4:
                ((ura) obj).h.invalidate();
                break;
            case 5:
                ora oraVar = (ora) obj;
                oraVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oraVar.F = floatValue2;
                if (floatValue2 >= 0.8f && (nraVar = oraVar.I) != null && (z = nraVar.l) && z) {
                    nraVar.l = false;
                    nraVar.b();
                }
                oraVar.invalidate();
                break;
            case 6:
                ((dta) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 7:
                kta ktaVar = (kta) obj;
                ktaVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ktaVar.invalidate();
                break;
            case 8:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh2 mh2Var = ((cxa) obj).c;
                mh2Var.setScaleX(floatValue3);
                mh2Var.setScaleY(floatValue3);
                break;
            case 9:
                bya byaVar = (bya) obj;
                byaVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                byaVar.invalidate();
                break;
            case 10:
                gza gzaVar = (gza) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gzaVar.e.setAlpha(1.0f - floatValue4);
                ng0 ng0Var = gzaVar.b;
                ng0Var.A0.f = floatValue4;
                gzaVar.c.invalidate();
                ng0Var.invalidate();
                break;
            case 11:
                ((u0b) obj).D1(valueAnimator);
                break;
            case 12:
                a1b a1bVar = (a1b) obj;
                a1bVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1bVar.a();
                break;
            case 13:
                n1b n1bVar = (n1b) obj;
                n1bVar.getClass();
                n1bVar.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 14:
                g3b g3bVar = (g3b) obj;
                g3bVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g3bVar.invalidate();
                break;
            case 15:
                l4b l4bVar = (l4b) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = l4bVar.a;
                k4b k4bVar = (k4b) arrayList.get(l4bVar.d);
                k4bVar.n = floatValue5;
                k4bVar.invalidate();
                int i = l4bVar.c;
                if (i != -1) {
                    k4b k4bVar2 = (k4b) arrayList.get(i);
                    k4bVar2.n = 1.0f - floatValue5;
                    k4bVar2.invalidate();
                    break;
                }
                break;
            case 16:
                k5b k5bVar = (k5b) obj;
                k5bVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5bVar.invalidate();
                k5bVar.requestLayout();
                k5bVar.K.requestLayout();
                break;
            case 17:
                n6b n6bVar = (n6b) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6bVar.E = floatValue6;
                t1 t1Var = n6bVar.c;
                t1Var.setAlpha(floatValue6);
                t1Var.setScaleX(gm.R1(0.9f, 1.0f, n6bVar.E));
                t1Var.setScaleY(gm.R1(0.9f, 1.0f, n6bVar.E));
                n6bVar.b.invalidate();
                break;
            case 18:
                a7b a7bVar = (a7b) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7bVar.r = floatValue7;
                qac qacVar = a7bVar.y;
                if (qacVar != null) {
                    qacVar.a(Float.valueOf(Utilities.i(floatValue7, 1.0f, -1.0f)));
                }
                a7bVar.a.invalidate();
                break;
            case 19:
                ((v7b) obj).y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                ((x7b) obj).setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 21:
                kcb kcbVar = (kcb) obj;
                kcbVar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcbVar.a.invalidate();
                break;
            case 22:
                skb skbVar = (skb) obj;
                skbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                skbVar.C.invalidate();
                break;
            case 23:
                rob robVar = (rob) obj;
                robVar.getClass();
                robVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                robVar.z0.invalidate();
                robVar.E0.invalidate();
                robVar.T1.setAlpha(robVar.q1);
                robVar.S1.invalidate();
                robVar.X0();
                break;
            case 24:
                rob robVar2 = ((gob) obj).a;
                robVar2.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                robVar2.z0.invalidate();
                robVar2.E0.invalidate();
                robVar2.T1.setAlpha(robVar2.q1);
                robVar2.S1.invalidate();
                robVar2.X0();
                break;
            case 25:
                tob tobVar = (tob) ((rm3) ((fb) obj).b).b;
                tobVar.getTransitionParams().L1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tobVar.invalidate();
                break;
            case 26:
                bpb bpbVar = (bpb) obj;
                bpbVar.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bpbVar.invalidate();
                break;
            case 27:
                avb avbVar = (avb) obj;
                avbVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = avbVar.a.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    int R = RecyclerView.R(avbVar.a.getChildAt(i2));
                    int i3 = avbVar.d.e;
                    if (R < i3 || i3 <= 0) {
                        avbVar.a.getChildAt(i2).setAlpha(1.0f);
                    } else {
                        avbVar.a.getChildAt(i2).setAlpha(avbVar.F);
                    }
                }
                break;
            case 28:
                uvb uvbVar = (uvb) obj;
                uvbVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uvbVar.invalidate();
                break;
            default:
                sxb sxbVar = (sxb) obj;
                sxbVar.getClass();
                sxbVar.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
