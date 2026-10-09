package yh;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02cd A[ADDED_TO_REGION, LOOP:1: B:100:0x02cd->B:101:0x02cf, LOOP_START, PHI: r5
      0x02cd: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:99:0x02cb, B:101:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        char c11;
        char c12;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                AndroidUtilities.showKeyboard(((h0) obj).c);
                break;
            case 1:
                t2 t2Var = (t2) obj;
                t2Var.h0 = false;
                t2Var.j0 = false;
                t2Var.a(t2Var.W, t2Var.a0, t2Var.b0, t2Var.c0);
                break;
            case 2:
                ((j2) obj).invalidateSelf();
                break;
            case 3:
                m2 m2Var = (m2) obj;
                l2 l2Var = m2Var.H;
                int i13 = 6;
                if (l2Var == null) {
                    c10 = 2;
                    c11 = 1;
                    if (Math.abs(m2Var.d) <= 1.0E-4f && Math.abs(m2Var.e) <= 1.0E-4f) {
                        c12 = 0;
                        if ((m2Var.G == null ? c11 : c12) != 0) {
                            for (int i14 = 0; i14 < 6; i14++) {
                                Matrix.multiplyMV(m2Var.n, 0, m2Var.c, 0, m2Var.h[i14], 0);
                                m2Var.r[i14] = m2Var.n[c10];
                            }
                            Arrays.sort(m2Var.s, new ai.f8(m2Var, i13));
                            m2Var.invalidate();
                        }
                        if (!m2Var.isAttachedToWindow()) {
                            AndroidUtilities.runOnUIThread(m2Var.I, 16L);
                            break;
                        }
                    } else {
                        m2Var.a();
                    }
                } else {
                    m2 m2Var2 = l2Var.a;
                    float[] fArr = l2Var.h;
                    if (!l2Var.e && (i10 = l2Var.c) != 0) {
                        if (l2Var.l) {
                            m2Var2.a();
                        } else {
                            int c13 = m1.j.c(((k2) l2Var.b.get(i10 - 1)).a);
                            if (c13 == 1 || c13 == 2) {
                                c10 = 2;
                                c11 = 1;
                                m2Var2.a();
                                int i15 = l2Var.f - 1;
                                l2Var.f = i15;
                                if (i15 <= 0) {
                                    l2Var.b();
                                }
                            } else if (c13 == 3) {
                                char c14 = 2;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (l2Var.f / l2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(l2Var.j * f7) > 1.0E-4f || Math.abs(l2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f10 = l2Var.j * f7 * 0.96f;
                                    m2Var2.getClass();
                                    m2.b(1.0f, 0.0f, f10, fArr2);
                                    m2Var2.getClass();
                                    m2.d(fArr2, fArr, fArr);
                                    float f11 = l2Var.k * f7 * 0.96f;
                                    m2Var2.getClass();
                                    m2.b(0.0f, 1.0f, f11, fArr2);
                                    m2.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = l2Var.i;
                                float[] fArr4 = m2Var2.c;
                                int i16 = 0;
                                while (i16 < 16) {
                                    float f12 = fArr[i16];
                                    fArr4[i16] = com.google.android.gms.internal.vision.e2.y(fArr3[i16], f12, pow, f12);
                                    i16++;
                                    c14 = c14;
                                }
                                c10 = c14;
                                float f13 = fArr4[0];
                                float f14 = fArr4[c11];
                                float f15 = fArr4[c10];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f13;
                                fArr5[c11] = f14;
                                fArr5[c10] = f15;
                                float f16 = fArr4[4];
                                float f17 = fArr4[5];
                                float f18 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f16;
                                fArr6[c11] = f17;
                                fArr6[c10] = f18;
                                float[] fArr7 = new float[3];
                                m2.e(fArr5);
                                m2.c(fArr5, fArr6, fArr7);
                                m2.e(fArr7);
                                m2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[c10];
                                int i17 = l2Var.f - 1;
                                l2Var.f = i17;
                                if (i17 <= 0) {
                                    System.arraycopy(l2Var.i, 0, m2Var2.c, 0, 16);
                                    m2Var2.d = 0.0f;
                                    m2Var2.e = 0.0f;
                                    l2Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                    c11 = 1;
                }
                c12 = c11;
                if ((m2Var.G == null ? c11 : c12) != 0) {
                }
                if (!m2Var.isAttachedToWindow()) {
                }
                break;
            case 4:
                ((o2) obj).invalidate();
                break;
            case 5:
                ((s2) obj).invalidateSelf();
                break;
            case 6:
                p3 p3Var = (p3) obj;
                f0 f0Var = p3Var.i0;
                y9[] y9VarArr = p3Var.d;
                if (!y9VarArr[2 - p3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(f0Var);
                    AndroidUtilities.runOnUIThread(f0Var, 150L);
                    break;
                } else {
                    f4.d dVar = p3Var.U;
                    if (dVar != null && dVar.b == 1 && p3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(f0Var);
                        ValueAnimator valueAnimator = p3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            p3Var.h0 = null;
                        }
                        int i18 = 1 - p3Var.r0;
                        p3Var.r0 = i18;
                        ck0 lottieAnimation = y9VarArr[2 - i18].getImageReceiver().getLottieAnimation();
                        ck0 lottieAnimation2 = y9VarArr[p3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        p3Var.W.c();
                        int i19 = p3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = p3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) p3Var.b0.c();
                        stargiftattributebackdropArr[i19] = stargiftattributebackdrop;
                        p3Var.e(i19, stargiftattributebackdrop);
                        p3Var.g(1, (TL_stars.starGiftAttributePattern) p3Var.a0.c(), true);
                        p3Var.a();
                        float f19 = p3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f19, f19);
                        p3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new m3(p3Var, i12));
                        p3Var.h0.addListener(new o3(p3Var));
                        p3Var.h0.setDuration(320L);
                        p3Var.h0.setInterpolator(hs.h);
                        p3Var.h0.start();
                        break;
                    }
                }
                break;
            case 7:
                ((sg.n) obj).setPaused(true);
                break;
            case 8:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 9:
                ((h0[]) obj)[0].dismiss();
                break;
            case 10:
                di.f fVar = (di.f) obj;
                fVar.getClass();
                try {
                    qm0 currentListView = ((p7) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 11:
                of.f.s(((e7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 12:
                of.f.s(((f7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 13:
                zg.t tVar = (zg.t) ((m2.t) obj).b;
                zg.s sVar = tVar.b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.a.C7(true);
                break;
            case 14:
                ((ValueAnimator) obj).start();
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.w) obj).f2.r;
                if (n2Var instanceof zn) {
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
