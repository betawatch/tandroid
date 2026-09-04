package zh;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0290 A[ADDED_TO_REGION, LOOP:1: B:84:0x0290->B:85:0x0292, LOOP_START, PHI: r5
      0x0290: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:83:0x028e, B:85:0x0292] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        boolean z10;
        int i10;
        char c11;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((n2) obj).invalidateSelf();
                break;
            case 1:
                q2 q2Var = (q2) obj;
                p2 p2Var = q2Var.H;
                int i13 = 6;
                if (p2Var == null) {
                    c10 = 2;
                    if (Math.abs(q2Var.d) <= 1.0E-4f && Math.abs(q2Var.e) <= 1.0E-4f) {
                        z10 = false;
                        if (q2Var.G == null ? true : z10) {
                            for (int i14 = 0; i14 < 6; i14++) {
                                Matrix.multiplyMV(q2Var.n, 0, q2Var.c, 0, q2Var.h[i14], 0);
                                q2Var.r[i14] = q2Var.n[c10];
                            }
                            Arrays.sort(q2Var.s, new bi.l7(q2Var, i13));
                            q2Var.invalidate();
                        }
                        if (!q2Var.isAttachedToWindow()) {
                            AndroidUtilities.runOnUIThread(q2Var.I, 16L);
                            break;
                        }
                    } else {
                        q2Var.a();
                    }
                } else {
                    q2 q2Var2 = p2Var.a;
                    float[] fArr = p2Var.h;
                    if (!p2Var.e && (i10 = p2Var.c) != 0) {
                        if (p2Var.l) {
                            q2Var2.a();
                        } else {
                            int c12 = m1.j.c(((o2) p2Var.b.get(i10 - 1)).a);
                            if (c12 == 1 || c12 == 2) {
                                c10 = 2;
                                q2Var2.a();
                                int i15 = p2Var.f - 1;
                                p2Var.f = i15;
                                if (i15 <= 0) {
                                    p2Var.b();
                                }
                            } else if (c12 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (p2Var.f / p2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(p2Var.j * f7) > 1.0E-4f || Math.abs(p2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f10 = p2Var.j * f7 * 0.96f;
                                    q2Var2.getClass();
                                    q2.b(1.0f, 0.0f, f10, fArr2);
                                    q2Var2.getClass();
                                    q2.d(fArr2, fArr, fArr);
                                    float f11 = p2Var.k * f7 * 0.96f;
                                    q2Var2.getClass();
                                    q2.b(0.0f, 1.0f, f11, fArr2);
                                    q2.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = p2Var.i;
                                float[] fArr4 = q2Var2.c;
                                for (int i16 = 0; i16 < 16; i16++) {
                                    float f12 = fArr[i16];
                                    fArr4[i16] = com.google.android.gms.internal.vision.e2.z(fArr3[i16], f12, pow, f12);
                                }
                                c10 = 2;
                                float f13 = fArr4[0];
                                float f14 = fArr4[c11];
                                float f15 = fArr4[2];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f13;
                                fArr5[c11] = f14;
                                fArr5[2] = f15;
                                float f16 = fArr4[4];
                                float f17 = fArr4[5];
                                float f18 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f16;
                                fArr6[c11] = f17;
                                fArr6[2] = f18;
                                float[] fArr7 = new float[3];
                                q2.e(fArr5);
                                q2.c(fArr5, fArr6, fArr7);
                                q2.e(fArr7);
                                q2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[2];
                                int i17 = p2Var.f - 1;
                                p2Var.f = i17;
                                if (i17 <= 0) {
                                    System.arraycopy(p2Var.i, 0, q2Var2.c, 0, 16);
                                    q2Var2.d = 0.0f;
                                    q2Var2.e = 0.0f;
                                    p2Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                }
                z10 = true;
                if (q2Var.G == null ? true : z10) {
                }
                if (!q2Var.isAttachedToWindow()) {
                }
                break;
            case 2:
                ((s2) obj).invalidate();
                break;
            case 3:
                ((w2) obj).invalidateSelf();
                break;
            case 4:
                t3 t3Var = (t3) obj;
                m2 m2Var = t3Var.i0;
                x9[] x9VarArr = t3Var.d;
                if (!x9VarArr[2 - t3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(m2Var);
                    AndroidUtilities.runOnUIThread(m2Var, 150L);
                    break;
                } else {
                    f4.d dVar = t3Var.U;
                    if (dVar != null && dVar.b == 1 && t3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(m2Var);
                        ValueAnimator valueAnimator = t3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            t3Var.h0 = null;
                        }
                        int i18 = 1 - t3Var.r0;
                        t3Var.r0 = i18;
                        xi0 lottieAnimation = x9VarArr[2 - i18].getImageReceiver().getLottieAnimation();
                        xi0 lottieAnimation2 = x9VarArr[t3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.Q(lottieAnimation.r(), false);
                        }
                        t3Var.W.c();
                        int i19 = t3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = t3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t3Var.b0.c();
                        stargiftattributebackdropArr[i19] = stargiftattributebackdrop;
                        t3Var.e(i19, stargiftattributebackdrop);
                        t3Var.g(1, (TL_stars.starGiftAttributePattern) t3Var.a0.c(), true);
                        t3Var.a();
                        float f19 = t3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f19, f19);
                        t3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new q3(t3Var, i12));
                        t3Var.h0.addListener(new s3(t3Var));
                        t3Var.h0.setDuration(320L);
                        t3Var.h0.setInterpolator(pr.h);
                        t3Var.h0.start();
                        break;
                    }
                }
                break;
            case 5:
                ((tg.e) obj).setPaused(true);
                break;
            case 6:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 7:
                ((i0[]) obj)[0].dismiss();
                break;
            case 8:
                ei.f fVar = (ei.f) obj;
                fVar.getClass();
                try {
                    ll0 currentListView = ((v7) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 9:
                of.f.s(((k7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            default:
                of.f.s(((l7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
        }
    }
}
