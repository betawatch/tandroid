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
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.nj0;
import org.telegram.ui.o91;
import xh.s2;
import yh.i8;
import yh.l7;
import yh.o2;
import yh.p2;
import yh.q2;
import yh.y2;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                xc X = xc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    break;
                }
                break;
            case 4:
                ((tg.y) obj).run(null);
                break;
            case 5:
                ((nj0) obj).run(Collections.EMPTY_LIST);
                break;
            case 6:
                ((tg.v) obj).run(null);
                break;
            case 7:
                tg.c0 c0Var = ((tg.b0) obj).r;
                n2 n2Var = c0Var.n;
                i10 = ((f3) c0Var).currentAccount;
                e6Var = ((f3) c0Var).resourcesProvider;
                k1 k1Var = new k1(n2Var, i10, null, null, null, e6Var);
                k1Var.J0 = true;
                k1Var.c0 = true;
                c0Var.n.showDialog(k1Var);
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
                l61 l61Var = ((xh.r1) obj).Y;
                if (l61Var != null) {
                    l61Var.N(false);
                    break;
                }
                break;
            case 15:
                ((xh.f1) obj).c();
                break;
            case 16:
                xh.o1 o1Var = (xh.o1) obj;
                i8 i8Var = o1Var.e;
                if (i8Var != null) {
                    i8Var.d();
                    o1Var.invalidateSelf();
                    break;
                }
                break;
            case 17:
                ((s2) obj).o();
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
                new l7(aVar.getContext(), aVar.b).show();
                break;
            case 21:
                yh.f fVar = (yh.f) obj;
                fVar.getClass();
                try {
                    wl0 currentListView = fVar.x0.F.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 22:
                new qw0(((yh.s) obj).getContext()).show();
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
                y2 y2Var = (y2) obj;
                y2Var.h0 = false;
                y2Var.j0 = false;
                y2Var.a(y2Var.W, y2Var.a0, y2Var.b0, y2Var.c0);
                break;
            case 27:
                ((yh.n2) obj).invalidateSelf();
                break;
            case 28:
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
                            Arrays.sort(q2Var.s, new c8(q2Var, i13));
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
                                int i15 = p2Var.f - 1;
                                p2Var.f = i15;
                                if (i15 <= 0) {
                                    p2Var.b();
                                }
                            } else if (c11 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (p2Var.f / p2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                c10 = 2;
                                if (Math.abs(p2Var.j * f7) > 1.0E-4f || Math.abs(p2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    float f10 = p2Var.j * f7 * 0.96f;
                                    q2Var2.getClass();
                                    q2.b(1.0f, 0.0f, f10, fArr2);
                                    q2Var2.getClass();
                                    q2.d(fArr2, fArr, fArr);
                                    float f11 = p2Var.k * f7 * 0.96f;
                                    q2Var2.getClass();
                                    q2.b(0.0f, 1.0f, f11, fArr2);
                                    q2.d(fArr2, fArr, fArr);
                                }
                                float[] fArr3 = p2Var.i;
                                float[] fArr4 = q2Var2.c;
                                for (int i16 = 0; i16 < 16; i16++) {
                                    float f12 = fArr[i16];
                                    fArr4[i16] = e2.z(fArr3[i16], f12, pow, f12);
                                }
                                float[] fArr5 = {fArr4[0], fArr4[1], fArr4[2]};
                                float[] fArr6 = {fArr4[4], fArr4[5], fArr4[6]};
                                float[] fArr7 = new float[3];
                                q2.e(fArr5);
                                q2.c(fArr5, fArr6, fArr7);
                                q2.e(fArr7);
                                q2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[1] = fArr5[1];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[1];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[1];
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
            default:
                ((yh.s2) obj).invalidate();
                break;
        }
    }
}
