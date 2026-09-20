package rg;

import ai.c8;
import android.graphics.Bitmap;
import android.opengl.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.pj0;
import org.telegram.ui.u21;
import xh.s2;
import yh.i8;
import yh.m7;
import yh.o2;
import yh.p2;
import yh.q2;
import yh.y2;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0170 A[ADDED_TO_REGION, LOOP:1: B:34:0x0170->B:35:0x0172, LOOP_START, PHI: r5
      0x0170: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:33:0x016e, B:35:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        f6 f6Var;
        char c10;
        boolean z10;
        int i11;
        int i12 = this.a;
        int i13 = 16;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((r1) obj).invalidate();
                break;
            case 1:
                ((z1) obj).a();
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    break;
                }
                break;
            case 3:
                ((rf.b) ((com.google.android.gms.internal.cast.p) obj).c).a(false);
                break;
            case 4:
                CharSequence charSequence = (CharSequence) obj;
                xc X = xc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    break;
                }
                break;
            case 5:
                ((tg.y) obj).run(null);
                break;
            case 6:
                ((pj0) obj).run(Collections.EMPTY_LIST);
                break;
            case 7:
                ((tg.v) obj).run(null);
                break;
            case 8:
                tg.c0 c0Var = ((tg.b0) obj).r;
                n2 n2Var = c0Var.n;
                i10 = ((f3) c0Var).currentAccount;
                f6Var = ((f3) c0Var).resourcesProvider;
                k1 k1Var = new k1(n2Var, i10, null, null, null, f6Var);
                k1Var.J0 = true;
                k1Var.c0 = true;
                c0Var.n.showDialog(k1Var);
                break;
            case 9:
                ((f3) obj).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new u21(i13), 220L);
                break;
            case 10:
                ((th.f) obj).d0.N(true);
                break;
            case 11:
                wh.m mVar = (wh.m) obj;
                mVar.f();
                mVar.e(true);
                break;
            case 12:
                ((xg.b) obj).f();
                break;
            case 13:
                xh.m mVar2 = (xh.m) obj;
                mVar2.h0.setTranslationX(mVar2.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                break;
            case 14:
                ((xh.c0) obj).onBackPressed();
                break;
            case 15:
                k61 k61Var = ((xh.r1) obj).Y;
                if (k61Var != null) {
                    k61Var.N(false);
                    break;
                }
                break;
            case 16:
                ((xh.f1) obj).c();
                break;
            case 17:
                xh.o1 o1Var = (xh.o1) obj;
                i8 i8Var = o1Var.e;
                if (i8Var != null) {
                    i8Var.d();
                    o1Var.invalidateSelf();
                    break;
                }
                break;
            case 18:
                ((s2) obj).o();
                break;
            case 19:
                try {
                    ((Bitmap) obj).recycle();
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 20:
                yf.n nVar = (yf.n) obj;
                long j3 = nVar.b;
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    nVar.b = j10;
                    nVar.a.e(j10);
                }
                if (nVar.b <= 0) {
                    nVar.c = false;
                }
                if (nVar.c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    break;
                }
                break;
            case 21:
                yh.a aVar = (yh.a) obj;
                aVar.getClass();
                new m7(aVar.getContext(), aVar.b).show();
                break;
            case 22:
                yh.f fVar = (yh.f) obj;
                fVar.getClass();
                try {
                    vl0 currentListView = fVar.x0.F.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 23:
                new pw0(((yh.s) obj).getContext()).show();
                break;
            case 24:
                AndroidUtilities.showKeyboard(((yh.a0) obj).d0);
                break;
            case 25:
                AndroidUtilities.showKeyboard(((yh.e0) obj).h);
                break;
            case 26:
                AndroidUtilities.showKeyboard(((yh.i0) obj).c);
                break;
            case 27:
                y2 y2Var = (y2) obj;
                y2Var.h0 = false;
                y2Var.j0 = false;
                y2Var.a(y2Var.W, y2Var.a0, y2Var.b0, y2Var.c0);
                break;
            case 28:
                ((yh.n2) obj).invalidateSelf();
                break;
            default:
                q2 q2Var = (q2) obj;
                p2 p2Var = q2Var.H;
                int i14 = 6;
                if (p2Var == null) {
                    c10 = 2;
                    if (Math.abs(q2Var.d) <= 1.0E-4f && Math.abs(q2Var.e) <= 1.0E-4f) {
                        z10 = false;
                        if (q2Var.G == null ? true : z10) {
                            for (int i15 = 0; i15 < 6; i15++) {
                                Matrix.multiplyMV(q2Var.n, 0, q2Var.c, 0, q2Var.h[i15], 0);
                                q2Var.r[i15] = q2Var.n[c10];
                            }
                            Arrays.sort(q2Var.s, new c8(q2Var, i14));
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
                    if (!p2Var.e && (i11 = p2Var.c) != 0) {
                        if (p2Var.l) {
                            q2Var2.a();
                        } else {
                            int c11 = m1.j.c(((o2) p2Var.b.get(i11 - 1)).a);
                            if (c11 == 1 || c11 == 2) {
                                c10 = 2;
                                q2Var2.a();
                                int i16 = p2Var.f - 1;
                                p2Var.f = i16;
                                if (i16 <= 0) {
                                    p2Var.b();
                                }
                            } else if (c11 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (p2Var.f / p2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(p2Var.j * f7) > 1.0E-4f || Math.abs(p2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c10 = 2;
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
                                    c10 = 2;
                                }
                                float[] fArr3 = p2Var.i;
                                float[] fArr4 = q2Var2.c;
                                for (int i17 = 0; i17 < 16; i17++) {
                                    float f12 = fArr[i17];
                                    fArr4[i17] = e2.z(fArr3[i17], f12, pow, f12);
                                }
                                float f13 = fArr4[0];
                                float f14 = fArr4[1];
                                float f15 = fArr4[c10];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f13;
                                fArr5[1] = f14;
                                fArr5[c10] = f15;
                                float f16 = fArr4[4];
                                float f17 = fArr4[5];
                                float f18 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f16;
                                fArr6[1] = f17;
                                fArr6[c10] = f18;
                                float[] fArr7 = new float[3];
                                q2.e(fArr5);
                                q2.c(fArr5, fArr6, fArr7);
                                q2.e(fArr7);
                                q2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[1] = fArr5[1];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[1];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[1];
                                fArr4[10] = fArr7[c10];
                                int i18 = p2Var.f - 1;
                                p2Var.f = i18;
                                if (i18 <= 0) {
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
        }
    }
}
