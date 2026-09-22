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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.mj0;
import org.telegram.ui.o91;
import xh.r2;
import yh.j8;
import yh.n7;
import yh.o2;
import yh.p2;
import yh.q2;
import yh.t2;
import yh.z2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172 A[ADDED_TO_REGION, LOOP:1: B:36:0x0172->B:37:0x0174, LOOP_START, PHI: r4
      0x0172: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:35:0x0170, B:37:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        e6 e6Var;
        char c10;
        boolean z10;
        int i11;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((z1) obj).a();
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    break;
                }
                break;
            case 2:
                ((rf.b) ((com.google.android.gms.internal.cast.p) obj).c).a(false);
                break;
            case 3:
                CharSequence charSequence = (CharSequence) obj;
                vc X = vc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    break;
                }
                break;
            case 4:
                ((tg.z) obj).run(null);
                break;
            case 5:
                ((mj0) obj).run(Collections.EMPTY_LIST);
                break;
            case 6:
                ((tg.w) obj).run(null);
                break;
            case 7:
                tg.d0 d0Var = ((tg.c0) obj).r;
                n2 n2Var = d0Var.n;
                i10 = ((f3) d0Var).currentAccount;
                e6Var = ((f3) d0Var).resourcesProvider;
                k1 k1Var = new k1(n2Var, i10, null, null, null, e6Var);
                k1Var.J0 = true;
                k1Var.c0 = true;
                d0Var.n.showDialog(k1Var);
                break;
            case 8:
                ((f3) obj).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new o91(14), 220L);
                break;
            case 9:
                ((th.f) obj).d0.N(true);
                break;
            case 10:
                wh.m mVar = (wh.m) obj;
                mVar.f();
                mVar.e(true);
                break;
            case 11:
                ((xg.b) obj).f();
                break;
            case 12:
                xh.m mVar2 = (xh.m) obj;
                mVar2.h0.setTranslationX(mVar2.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                break;
            case 13:
                ((xh.c0) obj).onBackPressed();
                break;
            case 14:
                w51 w51Var = ((xh.q1) obj).Y;
                if (w51Var != null) {
                    w51Var.N(false);
                    break;
                }
                break;
            case 15:
                ((xh.e1) obj).c();
                break;
            case 16:
                xh.n1 n1Var = (xh.n1) obj;
                j8 j8Var = n1Var.e;
                if (j8Var != null) {
                    j8Var.d();
                    n1Var.invalidateSelf();
                    break;
                }
                break;
            case 17:
                ((r2) obj).o();
                break;
            case 18:
                try {
                    ((Bitmap) obj).recycle();
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 19:
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
            case 20:
                yh.a aVar = (yh.a) obj;
                aVar.getClass();
                new n7(aVar.getContext(), aVar.b).show();
                break;
            case 21:
                yh.f fVar = (yh.f) obj;
                fVar.getClass();
                try {
                    ll0 currentListView = fVar.x0.F.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 22:
                new ew0(((yh.s) obj).getContext()).show();
                break;
            case 23:
                AndroidUtilities.showKeyboard(((yh.a0) obj).d0);
                break;
            case 24:
                AndroidUtilities.showKeyboard(((yh.e0) obj).h);
                break;
            case 25:
                AndroidUtilities.showKeyboard(((yh.i0) obj).c);
                break;
            case 26:
                z2 z2Var = (z2) obj;
                z2Var.h0 = false;
                z2Var.j0 = false;
                z2Var.a(z2Var.W, z2Var.a0, z2Var.b0, z2Var.c0);
                break;
            case 27:
                ((o2) obj).invalidateSelf();
                break;
            case 28:
                yh.r2 r2Var = (yh.r2) obj;
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
                            Arrays.sort(r2Var.s, new c8(r2Var, i13));
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
                    yh.r2 r2Var2 = q2Var.a;
                    float[] fArr = q2Var.h;
                    if (!q2Var.e && (i11 = q2Var.c) != 0) {
                        if (q2Var.l) {
                            r2Var2.a();
                        } else {
                            int c11 = m1.j.c(((p2) q2Var.b.get(i11 - 1)).a);
                            if (c11 == 1 || c11 == 2) {
                                c10 = 2;
                                r2Var2.a();
                                int i15 = q2Var.f - 1;
                                q2Var.f = i15;
                                if (i15 <= 0) {
                                    q2Var.b();
                                }
                            } else if (c11 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (q2Var.f / q2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                c10 = 2;
                                if (Math.abs(q2Var.j * f7) > 1.0E-4f || Math.abs(q2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    float f10 = q2Var.j * f7 * 0.96f;
                                    r2Var2.getClass();
                                    yh.r2.b(1.0f, 0.0f, f10, fArr2);
                                    r2Var2.getClass();
                                    yh.r2.d(fArr2, fArr, fArr);
                                    float f11 = q2Var.k * f7 * 0.96f;
                                    r2Var2.getClass();
                                    yh.r2.b(0.0f, 1.0f, f11, fArr2);
                                    yh.r2.d(fArr2, fArr, fArr);
                                }
                                float[] fArr3 = q2Var.i;
                                float[] fArr4 = r2Var2.c;
                                for (int i16 = 0; i16 < 16; i16++) {
                                    float f12 = fArr[i16];
                                    fArr4[i16] = e2.z(fArr3[i16], f12, pow, f12);
                                }
                                float[] fArr5 = {fArr4[0], fArr4[1], fArr4[2]};
                                float[] fArr6 = {fArr4[4], fArr4[5], fArr4[6]};
                                float[] fArr7 = new float[3];
                                yh.r2.e(fArr5);
                                yh.r2.c(fArr5, fArr6, fArr7);
                                yh.r2.e(fArr7);
                                yh.r2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[1] = fArr5[1];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[1];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[1];
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
            default:
                ((t2) obj).invalidate();
                break;
        }
    }
}
