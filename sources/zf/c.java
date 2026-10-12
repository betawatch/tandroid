package zf;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.opengl.Matrix;
import bi.q7;
import com.google.android.gms.internal.play_billing.k3;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z9;
import zh.e7;
import zh.f7;
import zh.i2;
import zh.j2;
import zh.k2;
import zh.l2;
import zh.l3;
import zh.n2;
import zh.n3;
import zh.o3;
import zh.p7;
import zh.r2;
import zh.s2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
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
        char c11;
        char c12;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                try {
                    ((Bitmap) obj).recycle();
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                o oVar = (o) obj;
                long j10 = oVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    oVar.b = j11;
                    oVar.a.e(j11);
                }
                if (oVar.b <= 0) {
                    oVar.c = false;
                }
                if (oVar.c) {
                    AndroidUtilities.runOnUIThread(oVar.d, 1000L);
                    break;
                }
                break;
            case 2:
                zh.a aVar = (zh.a) obj;
                aVar.getClass();
                new f7(aVar.getContext(), aVar.b).show();
                break;
            case 3:
                zh.f fVar = (zh.f) obj;
                fVar.getClass();
                try {
                    mm0 currentListView = fVar.x0.F.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 4:
                new dx0(((zh.t) obj).getContext()).show();
                break;
            case 5:
                AndroidUtilities.showKeyboard(((zh.z) obj).d0);
                break;
            case 6:
                AndroidUtilities.showKeyboard(((zh.d0) obj).h);
                break;
            case 7:
                AndroidUtilities.showKeyboard(((zh.h0) obj).c);
                break;
            case 8:
                s2 s2Var = (s2) obj;
                s2Var.h0 = false;
                s2Var.j0 = false;
                s2Var.a(s2Var.W, s2Var.a0, s2Var.b0, s2Var.c0);
                break;
            case 9:
                ((i2) obj).invalidateSelf();
                break;
            case 10:
                l2 l2Var = (l2) obj;
                k2 k2Var = l2Var.H;
                int i13 = 6;
                if (k2Var == null) {
                    c10 = 2;
                    c11 = 1;
                    if (Math.abs(l2Var.d) <= 1.0E-4f && Math.abs(l2Var.e) <= 1.0E-4f) {
                        c12 = 0;
                        if ((l2Var.G == null ? c11 : c12) != 0) {
                            for (int i14 = 0; i14 < 6; i14++) {
                                Matrix.multiplyMV(l2Var.n, 0, l2Var.c, 0, l2Var.h[i14], 0);
                                l2Var.r[i14] = l2Var.n[c10];
                            }
                            Arrays.sort(l2Var.s, new q7(l2Var, i13));
                            l2Var.invalidate();
                        }
                        if (!l2Var.isAttachedToWindow()) {
                            AndroidUtilities.runOnUIThread(l2Var.I, 16L);
                            break;
                        }
                    } else {
                        l2Var.a();
                    }
                } else {
                    l2 l2Var2 = k2Var.a;
                    float[] fArr = k2Var.h;
                    if (!k2Var.e && (i10 = k2Var.c) != 0) {
                        if (k2Var.l) {
                            l2Var2.a();
                        } else {
                            int c13 = m1.j.c(((j2) k2Var.b.get(i10 - 1)).a);
                            if (c13 == 1 || c13 == 2) {
                                c10 = 2;
                                c11 = 1;
                                l2Var2.a();
                                int i15 = k2Var.f - 1;
                                k2Var.f = i15;
                                if (i15 <= 0) {
                                    k2Var.b();
                                }
                            } else if (c13 == 3) {
                                char c14 = 2;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (k2Var.f / k2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(k2Var.j * f7) > 1.0E-4f || Math.abs(k2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f10 = k2Var.j * f7 * 0.96f;
                                    l2Var2.getClass();
                                    l2.b(1.0f, 0.0f, f10, fArr2);
                                    l2Var2.getClass();
                                    l2.d(fArr2, fArr, fArr);
                                    float f11 = k2Var.k * f7 * 0.96f;
                                    l2Var2.getClass();
                                    l2.b(0.0f, 1.0f, f11, fArr2);
                                    l2.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = k2Var.i;
                                float[] fArr4 = l2Var2.c;
                                int i16 = 0;
                                while (i16 < 16) {
                                    float f12 = fArr[i16];
                                    fArr4[i16] = k3.y(fArr3[i16], f12, pow, f12);
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
                                l2.e(fArr5);
                                l2.c(fArr5, fArr6, fArr7);
                                l2.e(fArr7);
                                l2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[c10];
                                int i17 = k2Var.f - 1;
                                k2Var.f = i17;
                                if (i17 <= 0) {
                                    System.arraycopy(k2Var.i, 0, l2Var2.c, 0, 16);
                                    l2Var2.d = 0.0f;
                                    l2Var2.e = 0.0f;
                                    k2Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                    c11 = 1;
                }
                c12 = c11;
                if ((l2Var.G == null ? c11 : c12) != 0) {
                }
                if (!l2Var.isAttachedToWindow()) {
                }
                break;
            case 11:
                ((n2) obj).invalidate();
                break;
            case 12:
                ((r2) obj).invalidateSelf();
                break;
            case 13:
                o3 o3Var = (o3) obj;
                c cVar = o3Var.i0;
                z9[] z9VarArr = o3Var.d;
                if (!z9VarArr[2 - o3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar, 150L);
                    break;
                } else {
                    f4.d dVar = o3Var.U;
                    if (dVar != null && dVar.b == 1 && o3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(cVar);
                        ValueAnimator valueAnimator = o3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            o3Var.h0 = null;
                        }
                        int i18 = 1 - o3Var.r0;
                        o3Var.r0 = i18;
                        yj0 lottieAnimation = z9VarArr[2 - i18].getImageReceiver().getLottieAnimation();
                        yj0 lottieAnimation2 = z9VarArr[o3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        o3Var.W.c();
                        int i19 = o3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = o3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) o3Var.b0.c();
                        stargiftattributebackdropArr[i19] = stargiftattributebackdrop;
                        o3Var.e(i19, stargiftattributebackdrop);
                        o3Var.g(1, (TL_stars.starGiftAttributePattern) o3Var.a0.c(), true);
                        o3Var.a();
                        float f19 = o3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f19, f19);
                        o3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new l3(o3Var, i12));
                        o3Var.h0.addListener(new n3(o3Var));
                        o3Var.h0.setDuration(320L);
                        o3Var.h0.setInterpolator(es.h);
                        o3Var.h0.start();
                        break;
                    }
                }
                break;
            case 14:
                ((tg.n) obj).setPaused(true);
                break;
            case 15:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 16:
                ((zh.h0[]) obj)[0].dismiss();
                break;
            case 17:
                ei.f fVar2 = (ei.f) obj;
                fVar2.getClass();
                try {
                    mm0 currentListView2 = ((p7) fVar2.M0).R.getCurrentListView();
                    if (currentListView2 != null && currentListView2.getAdapter() != null) {
                        currentListView2.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                pf.d.s(((e7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            default:
                pf.d.s(((f7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
        }
    }
}
