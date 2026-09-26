package rg;

import ai.e8;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.bt;
import org.telegram.ui.l21;
import xh.s2;
import yh.i8;
import yh.m7;
import yh.n2;
import yh.o2;
import yh.p2;
import yh.x2;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        d6 d6Var;
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
                ((bt) obj).run(Collections.EMPTY_LIST);
                break;
            case 7:
                ((tg.v) obj).run(null);
                break;
            case 8:
                tg.c0 c0Var = ((tg.b0) obj).r;
                m2 m2Var = c0Var.n;
                i10 = ((e3) c0Var).currentAccount;
                d6Var = ((e3) c0Var).resourcesProvider;
                k1 k1Var = new k1(m2Var, i10, null, null, null, d6Var);
                k1Var.J0 = true;
                k1Var.c0 = true;
                c0Var.n.showDialog(k1Var);
                break;
            case 9:
                ((e3) obj).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new l21(i13), 220L);
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
                j61 j61Var = ((xh.r1) obj).Y;
                if (j61Var != null) {
                    j61Var.N(false);
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
                    wl0 currentListView = fVar.x0.F.getCurrentListView();
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
                x2 x2Var = (x2) obj;
                x2Var.h0 = false;
                x2Var.j0 = false;
                x2Var.a(x2Var.W, x2Var.a0, x2Var.b0, x2Var.c0);
                break;
            case 28:
                ((yh.m2) obj).invalidateSelf();
                break;
            default:
                p2 p2Var = (p2) obj;
                o2 o2Var = p2Var.H;
                int i14 = 6;
                if (o2Var == null) {
                    c10 = 2;
                    if (Math.abs(p2Var.d) <= 1.0E-4f && Math.abs(p2Var.e) <= 1.0E-4f) {
                        z10 = false;
                        if (p2Var.G == null ? true : z10) {
                            for (int i15 = 0; i15 < 6; i15++) {
                                Matrix.multiplyMV(p2Var.n, 0, p2Var.c, 0, p2Var.h[i15], 0);
                                p2Var.r[i15] = p2Var.n[c10];
                            }
                            Arrays.sort(p2Var.s, new e8(p2Var, i14));
                            p2Var.invalidate();
                        }
                        if (!p2Var.isAttachedToWindow()) {
                            AndroidUtilities.runOnUIThread(p2Var.I, 16L);
                            break;
                        }
                    } else {
                        p2Var.a();
                    }
                } else {
                    p2 p2Var2 = o2Var.a;
                    float[] fArr = o2Var.h;
                    if (!o2Var.e && (i11 = o2Var.c) != 0) {
                        if (o2Var.l) {
                            p2Var2.a();
                        } else {
                            int c11 = m1.j.c(((n2) o2Var.b.get(i11 - 1)).a);
                            if (c11 == 1 || c11 == 2) {
                                c10 = 2;
                                p2Var2.a();
                                int i16 = o2Var.f - 1;
                                o2Var.f = i16;
                                if (i16 <= 0) {
                                    o2Var.b();
                                }
                            } else if (c11 == 3) {
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (o2Var.f / o2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(o2Var.j * f7) > 1.0E-4f || Math.abs(o2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c10 = 2;
                                    float f10 = o2Var.j * f7 * 0.96f;
                                    p2Var2.getClass();
                                    p2.b(1.0f, 0.0f, f10, fArr2);
                                    p2Var2.getClass();
                                    p2.d(fArr2, fArr, fArr);
                                    float f11 = o2Var.k * f7 * 0.96f;
                                    p2Var2.getClass();
                                    p2.b(0.0f, 1.0f, f11, fArr2);
                                    p2.d(fArr2, fArr, fArr);
                                } else {
                                    c10 = 2;
                                }
                                float[] fArr3 = o2Var.i;
                                float[] fArr4 = p2Var2.c;
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
                                p2.e(fArr5);
                                p2.c(fArr5, fArr6, fArr7);
                                p2.e(fArr7);
                                p2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[1] = fArr5[1];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[1];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[1];
                                fArr4[10] = fArr7[c10];
                                int i18 = o2Var.f - 1;
                                o2Var.f = i18;
                                if (i18 <= 0) {
                                    System.arraycopy(o2Var.i, 0, p2Var2.c, 0, 16);
                                    p2Var2.d = 0.0f;
                                    p2Var2.e = 0.0f;
                                    o2Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                }
                z10 = true;
                if (p2Var.G == null ? true : z10) {
                }
                if (!p2Var.isAttachedToWindow()) {
                }
                break;
        }
    }
}
