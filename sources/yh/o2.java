package yh;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c4 A[ADDED_TO_REGION, LOOP:1: B:95:0x02c4->B:96:0x02c6, LOOP_START, PHI: r5
      0x02c4: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:94:0x02c2, B:96:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
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
                r2 r2Var = (r2) obj;
                q2 q2Var = r2Var.H;
                int i13 = 6;
                if (q2Var == null) {
                    c10 = 2;
                    if (Math.abs(r2Var.d) <= 1.0E-4f && Math.abs(r2Var.e) <= 1.0E-4f) {
                        z10 = false;
                        if (r2Var.G == null ? true : z10) {
                            for (int i14 = 0; i14 < 6; i14++) {
                                Matrix.multiplyMV(r2Var.n, 0, r2Var.c, 0, r2Var.h[i14], 0);
                                r2Var.r[i14] = r2Var.n[c10];
                            }
                            Arrays.sort(r2Var.s, new ai.e8(r2Var, i13));
                            r2Var.invalidate();
                        }
                        if (!r2Var.isAttachedToWindow()) {
                            AndroidUtilities.runOnUIThread(r2Var.I, 16L);
                            break;
                        }
                    } else {
                        r2Var.a();
                    }
                } else {
                    r2 r2Var2 = q2Var.a;
                    float[] fArr = q2Var.h;
                    if (!q2Var.e && (i10 = q2Var.c) != 0) {
                        if (q2Var.l) {
                            r2Var2.a();
                        } else {
                            int c12 = m1.j.c(((p2) q2Var.b.get(i10 - 1)).a);
                            if (c12 == 1 || c12 == 2) {
                                c10 = 2;
                                r2Var2.a();
                                int i15 = q2Var.f - 1;
                                q2Var.f = i15;
                                if (i15 <= 0) {
                                    q2Var.b();
                                }
                            } else if (c12 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (q2Var.f / q2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(q2Var.j * f7) > 1.0E-4f || Math.abs(q2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f10 = q2Var.j * f7 * 0.96f;
                                    r2Var2.getClass();
                                    r2.b(1.0f, 0.0f, f10, fArr2);
                                    r2Var2.getClass();
                                    r2.d(fArr2, fArr, fArr);
                                    float f11 = q2Var.k * f7 * 0.96f;
                                    r2Var2.getClass();
                                    r2.b(0.0f, 1.0f, f11, fArr2);
                                    r2.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = q2Var.i;
                                float[] fArr4 = r2Var2.c;
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
                                r2.e(fArr5);
                                r2.c(fArr5, fArr6, fArr7);
                                r2.e(fArr7);
                                r2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[2];
                                int i17 = q2Var.f - 1;
                                q2Var.f = i17;
                                if (i17 <= 0) {
                                    System.arraycopy(q2Var.i, 0, r2Var2.c, 0, 16);
                                    r2Var2.d = 0.0f;
                                    r2Var2.e = 0.0f;
                                    q2Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                }
                z10 = true;
                if (r2Var.G == null ? true : z10) {
                }
                if (!r2Var.isAttachedToWindow()) {
                }
                break;
            case 1:
                ((t2) obj).invalidate();
                break;
            case 2:
                ((x2) obj).invalidateSelf();
                break;
            case 3:
                v3 v3Var = (v3) obj;
                o2 o2Var = v3Var.i0;
                w9[] w9VarArr = v3Var.d;
                if (!w9VarArr[2 - v3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(o2Var);
                    AndroidUtilities.runOnUIThread(o2Var, 150L);
                    break;
                } else {
                    f4.d dVar = v3Var.U;
                    if (dVar != null && dVar.b == 1 && v3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(o2Var);
                        ValueAnimator valueAnimator = v3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            v3Var.h0 = null;
                        }
                        int i18 = 1 - v3Var.r0;
                        v3Var.r0 = i18;
                        kj0 lottieAnimation = w9VarArr[2 - i18].getImageReceiver().getLottieAnimation();
                        kj0 lottieAnimation2 = w9VarArr[v3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        v3Var.W.c();
                        int i19 = v3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = v3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v3Var.b0.c();
                        stargiftattributebackdropArr[i19] = stargiftattributebackdrop;
                        v3Var.e(i19, stargiftattributebackdrop);
                        v3Var.g(1, (TL_stars.starGiftAttributePattern) v3Var.a0.c(), true);
                        v3Var.a();
                        float f19 = v3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f19, f19);
                        v3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new r3(v3Var, i12));
                        v3Var.h0.addListener(new t3(v3Var));
                        v3Var.h0.setDuration(320L);
                        v3Var.h0.setInterpolator(tr.h);
                        v3Var.h0.start();
                        break;
                    }
                }
                break;
            case 4:
                z7 z7Var = (z7) obj;
                if (z7Var.S != null && z7Var.Y != -1) {
                    z7Var.q1("POSTED_ALIGN");
                    z7Var.S.a();
                    break;
                }
                break;
            case 5:
                ((sg.e) obj).setPaused(true);
                break;
            case 6:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 7:
                ((j0[]) obj)[0].dismiss();
                break;
            case 8:
                nf.f.s(((n7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 9:
                nf.f.s(((p7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 10:
                zg.r rVar = (zg.r) ((l2.g) obj).b;
                zg.q qVar = rVar.b;
                if (qVar != null) {
                    qVar.d();
                }
                rVar.a.z7(true);
                break;
            case 11:
                ((ValueAnimator) obj).start();
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.v) obj).f2.r;
                if (n2Var instanceof yn) {
                    n2Var.showDialog(new rg.y0(n2Var, 11, false));
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.y0(n2Var, 11, false));
                        break;
                    }
                }
                break;
        }
    }
}
