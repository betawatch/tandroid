package xh;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import bi.sa;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.eo;
import org.telegram.ui.nx;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a7 A[ADDED_TO_REGION, LOOP:1: B:157:0x03a7->B:158:0x03a9, LOOP_START, PHI: r5
      0x03a7: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:156:0x03a5, B:158:0x03a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a4  */
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
                AndroidUtilities.showKeyboard(((a0) obj).d0);
                break;
            case 1:
                AndroidUtilities.showKeyboard(((e0) obj).h);
                break;
            case 2:
                AndroidUtilities.showKeyboard(((i0) obj).c);
                break;
            case 3:
                x2 x2Var = (x2) obj;
                x2Var.h0 = false;
                x2Var.j0 = false;
                x2Var.a(x2Var.W, x2Var.a0, x2Var.b0, x2Var.c0);
                break;
            case 4:
                ((n2) obj).invalidateSelf();
                break;
            case 5:
                q2 q2Var = (q2) obj;
                p2 p2Var = q2Var.H;
                if (p2Var == null) {
                    c10 = 2;
                    if (Math.abs(q2Var.d) <= 1.0E-4f && Math.abs(q2Var.e) <= 1.0E-4f) {
                        z10 = false;
                        if (q2Var.G == null ? true : z10) {
                            for (int i13 = 0; i13 < 6; i13++) {
                                Matrix.multiplyMV(q2Var.n, 0, q2Var.c, 0, q2Var.h[i13], 0);
                                q2Var.r[i13] = q2Var.n[c10];
                            }
                            Arrays.sort(q2Var.s, new bi.q3(q2Var, 5));
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
                                int i14 = p2Var.f - 1;
                                p2Var.f = i14;
                                if (i14 <= 0) {
                                    p2Var.b();
                                }
                            } else if (c12 == 3) {
                                c10 = 2;
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
                                for (int i15 = 0; i15 < 16; i15++) {
                                    float f12 = fArr[i15];
                                    fArr4[i15] = com.google.android.gms.internal.vision.e2.z(fArr3[i15], f12, pow, f12);
                                }
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
                                int i16 = p2Var.f - 1;
                                p2Var.f = i16;
                                if (i16 <= 0) {
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
            case 6:
                ((s2) obj).invalidate();
                break;
            case 7:
                ((w2) obj).invalidateSelf();
                break;
            case 8:
                u3 u3Var = (u3) obj;
                x xVar = u3Var.i0;
                w9[] w9VarArr = u3Var.d;
                if (!w9VarArr[2 - u3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(xVar);
                    AndroidUtilities.runOnUIThread(xVar, 150L);
                    break;
                } else {
                    f4.d dVar = u3Var.U;
                    if (dVar != null && dVar.b == 1 && u3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(xVar);
                        ValueAnimator valueAnimator = u3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u3Var.h0 = null;
                        }
                        int i17 = 1 - u3Var.r0;
                        u3Var.r0 = i17;
                        hj0 lottieAnimation = w9VarArr[2 - i17].getImageReceiver().getLottieAnimation();
                        hj0 lottieAnimation2 = w9VarArr[u3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.S(lottieAnimation.t(), false);
                        }
                        u3Var.W.c();
                        int i18 = u3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = u3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u3Var.b0.c();
                        stargiftattributebackdropArr[i18] = stargiftattributebackdrop;
                        u3Var.e(i18, stargiftattributebackdrop);
                        u3Var.g(1, (TL_stars.starGiftAttributePattern) u3Var.a0.c(), true);
                        u3Var.a();
                        float f19 = u3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f19, f19);
                        u3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new q3(u3Var, i12));
                        u3Var.h0.addListener(new s3(u3Var));
                        u3Var.h0.setDuration(320L);
                        u3Var.h0.setInterpolator(wr.h);
                        u3Var.h0.start();
                        break;
                    }
                }
                break;
            case 9:
                ((rg.f) obj).setPaused(true);
                break;
            case 10:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 11:
                ((i0[]) obj)[0].dismiss();
                break;
            case 12:
                ci.f fVar = (ci.f) obj;
                fVar.getClass();
                try {
                    vl0 currentListView = ((z7) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 13:
                nf.f.s(((o7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 14:
                nf.f.s(((p7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 15:
                yg.v vVar = (yg.v) ((o0.b) obj).a;
                yg.u uVar = vVar.b;
                if (uVar != null) {
                    uVar.d();
                }
                vVar.a.z7(true);
                break;
            case 16:
                ((ValueAnimator) obj).start();
                break;
            case 17:
                org.telegram.ui.ActionBar.p2 p2Var2 = ((yg.y) obj).f2.r;
                if (p2Var2 instanceof eo) {
                    p2Var2.showDialog(new qg.a1(p2Var2, 11, false));
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new qg.a1(p2Var2, 11, false));
                        break;
                    }
                }
                break;
            case 18:
                wy wyVar = ((nx) obj).O0;
                if (!wyVar.L || !wyVar.X3().G()) {
                    wyVar.x4(true, true);
                    break;
                } else {
                    wyVar.E0.h();
                    break;
                }
            case 19:
                ((zh.r0) obj).a.t(false);
                break;
            case 20:
                zh.t0 t0Var = ((zh.s0) obj).a;
                NotificationCenter.getInstance(t0Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t0Var.g()));
                break;
            case 21:
                zh.x0 x0Var = (zh.x0) obj;
                x0Var.H = false;
                x0Var.p(false);
                x0Var.T = false;
                break;
            case 22:
                ((zh.e2) obj).a.Q0();
                break;
            case 23:
                zh.a3 a3Var = ((zh.h2) obj).x;
                zh.w2 w2Var = a3Var.Q1;
                if (w2Var != null) {
                    if (!a3Var.T1 && !a3Var.U1 && !a3Var.V1) {
                        zh.u7 u7Var = ((zh.l7) w2Var).d;
                        if (!u7Var.n0.getCurrentPeerView().d1(true) && !u7Var.n0.E(true)) {
                            u7Var.q(true);
                            break;
                        }
                    } else if (a3Var.O1.e) {
                        ((zh.t7) a3Var.M2.c).loopBack();
                        break;
                    } else {
                        a3Var.W0 = 0L;
                        break;
                    }
                }
                break;
            case 24:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 25:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i19 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                break;
            case 26:
                zh.z3.a(((zh.v3) obj).d);
                break;
            case 27:
                zh.i4 i4Var = (zh.i4) obj;
                if (i4Var.isShowing()) {
                    i4Var.q(true);
                    break;
                }
                break;
            case 28:
                ((sa) obj).run();
                break;
            default:
                bi.f1 f1Var = (bi.f1) obj;
                f1Var.c(f1Var.b);
                f1Var.c = false;
                break;
        }
    }
}
