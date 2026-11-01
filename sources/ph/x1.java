package ph;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.opengl.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import bi.v6;
import java.util.Arrays;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Wallet.h8;
import org.telegram.ui.Wallet.i5;
import org.telegram.ui.Wallet.j5;
import rh.x7;
import rh.y7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c4 A[ADDED_TO_REGION, LOOP:1: B:89:0x02c4->B:90:0x02c6, LOOP_START, PHI: r10
      0x02c4: PHI (r10v1 int) = (r10v0 int), (r10v2 int) binds: [B:88:0x02c2, B:90:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        switch (this.a) {
            case 0:
                ((j2) this.b).p();
                return;
            case 1:
                ((qg.b) this.b).f();
                return;
            case 2:
                ((qh.r) this.b).e();
                return;
            case 3:
                r2.f fVar = (r2.f) this.b;
                synchronized (fVar.a) {
                    try {
                        if (fVar.m) {
                            return;
                        }
                        long j10 = fVar.l - 1;
                        fVar.l = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 < 0) {
                            fVar.c(new IllegalStateException());
                            return;
                        } else {
                            fVar.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 4:
                ji.f fVar2 = (ji.f) this.b;
                ((s5.g) ((t5.c) fVar2.e)).f(new mg.l(fVar2, 26));
                return;
            case 5:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                rf.m mVar = (rf.m) this.b;
                long j11 = mVar.b;
                if (j11 > 0) {
                    long j12 = j11 - 1;
                    mVar.b = j12;
                    mVar.a.l(j12);
                }
                if (mVar.b <= 0) {
                    mVar.c = false;
                }
                if (mVar.c) {
                    org.telegram.messenger.i0.h3(mVar.d, 1000L);
                    return;
                }
                return;
            case 7:
                rh.a aVar = (rh.a) this.b;
                aVar.getClass();
                new y7(aVar.getContext(), aVar.b).show();
                return;
            case 8:
                rh.h hVar = (rh.h) this.b;
                if (!hVar.isAttachedToWindow() || hVar.c.canScrollVertically(1)) {
                    return;
                }
                hVar.a();
                return;
            case 9:
                new kv0(((e30) this.b).getContext()).show();
                return;
            case 10:
                org.telegram.messenger.i0.J3(((rh.b0) this.b).W1);
                return;
            case 11:
                org.telegram.messenger.i0.J3(((rh.e0) this.b).n1);
                return;
            case 12:
                org.telegram.messenger.i0.J3(((rh.i0) this.b).j1);
                return;
            case 13:
                ((rh.t0) this.b).onBackPressed();
                return;
            case 14:
                i5 i5Var = (i5) ((rh.d4) this.b);
                h8 h8Var = i5Var.c.j0;
                if (h8Var != null) {
                    TL_wallet.nftItem nftitem = i5Var.b;
                    if (h8Var.A()) {
                        h8Var.c0(h8Var.v(nftitem));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                j5 j5Var = (j5) ((rh.c4) this.b);
                h8 h8Var2 = j5Var.b.j0;
                if (h8Var2 != null) {
                    h8Var2.b0(j5Var.a);
                    return;
                }
                return;
            case 16:
                rh.b3 b3Var = (rh.b3) this.b;
                b3Var.h0 = false;
                b3Var.j0 = false;
                b3Var.a(b3Var.W, b3Var.a0, b3Var.b0, b3Var.c0);
                return;
            case 17:
                ((rh.s2) this.b).invalidateSelf();
                return;
            case 18:
                rh.v2 v2Var = (rh.v2) this.b;
                rh.u2 u2Var = v2Var.H;
                if (u2Var != null) {
                    rh.v2 v2Var2 = u2Var.a;
                    float[] fArr = u2Var.h;
                    if (!u2Var.e && (i11 = u2Var.c) != 0) {
                        if (u2Var.l) {
                            v2Var2.a();
                        } else {
                            int c11 = m1.j.c(((rh.t2) u2Var.b.get(i11 - 1)).a);
                            if (c11 == 1 || c11 == 2) {
                                c10 = 2;
                                z10 = true;
                                i10 = 4;
                                v2Var2.a();
                                int i12 = u2Var.f - 1;
                                u2Var.f = i12;
                                if (i12 <= 0) {
                                    u2Var.b();
                                }
                            } else if (c11 == 3) {
                                z10 = true;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (u2Var.f / u2Var.g)), 3.0d));
                                float f7 = 1.0f - pow;
                                if (Math.abs(u2Var.j * f7) > 1.0E-4f || Math.abs(u2Var.k * f7) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c10 = 2;
                                    float f10 = u2Var.j * f7 * 0.96f;
                                    v2Var2.getClass();
                                    rh.v2.b(1.0f, 0.0f, f10, fArr2);
                                    v2Var2.getClass();
                                    rh.v2.d(fArr2, fArr, fArr);
                                    float f11 = u2Var.k * f7 * 0.96f;
                                    v2Var2.getClass();
                                    rh.v2.b(0.0f, 1.0f, f11, fArr2);
                                    rh.v2.d(fArr2, fArr, fArr);
                                } else {
                                    c10 = 2;
                                }
                                float[] fArr3 = u2Var.i;
                                float[] fArr4 = v2Var2.c;
                                for (int i13 = 0; i13 < 16; i13++) {
                                    float f12 = fArr[i13];
                                    fArr4[i13] = c3.i0.z(fArr3[i13], f12, pow, f12);
                                }
                                i10 = 4;
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
                                rh.v2.e(fArr5);
                                rh.v2.c(fArr5, fArr6, fArr7);
                                rh.v2.e(fArr7);
                                rh.v2.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[1] = fArr5[1];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[1];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[1];
                                fArr4[10] = fArr7[c10];
                                int i14 = u2Var.f - 1;
                                u2Var.f = i14;
                                if (i14 <= 0) {
                                    System.arraycopy(u2Var.i, 0, v2Var2.c, 0, 16);
                                    v2Var2.d = 0.0f;
                                    v2Var2.e = 0.0f;
                                    u2Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                    z10 = true;
                    i10 = 4;
                } else {
                    c10 = 2;
                    z10 = true;
                    i10 = 4;
                    if (Math.abs(v2Var.d) <= 1.0E-4f && Math.abs(v2Var.e) <= 1.0E-4f) {
                        z11 = false;
                        if (v2Var.G == null ? z10 : z11) {
                            for (int i15 = 0; i15 < 6; i15++) {
                                Matrix.multiplyMV(v2Var.n, 0, v2Var.c, 0, v2Var.h[i15], 0);
                                v2Var.r[i15] = v2Var.n[c10];
                            }
                            Arrays.sort(v2Var.s, new v6(v2Var, i10));
                            v2Var.invalidate();
                        }
                        if (v2Var.isAttachedToWindow()) {
                            return;
                        }
                        org.telegram.messenger.i0.h3(v2Var.I, 16L);
                        return;
                    }
                    v2Var.a();
                }
                z11 = z10;
                if (v2Var.G == null ? z10 : z11) {
                }
                if (v2Var.isAttachedToWindow()) {
                }
                break;
            case 19:
                ((rh.w2) this.b).invalidate();
                return;
            case 20:
                ((rh.a3) this.b).invalidateSelf();
                return;
            case 21:
                rh.y3 y3Var = (rh.y3) this.b;
                x1 x1Var = y3Var.l0;
                g9[] g9VarArr = y3Var.d;
                if (!g9VarArr[2 - y3Var.u0].getImageReceiver().J()) {
                    org.telegram.messenger.i0.r(x1Var);
                    org.telegram.messenger.i0.h3(x1Var, 150L);
                    return;
                }
                f4.d dVar = y3Var.a0;
                if (dVar != null && dVar.b == 1 && y3Var.isAttachedToWindow()) {
                    org.telegram.messenger.i0.r(x1Var);
                    ValueAnimator valueAnimator = y3Var.k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        y3Var.k0 = null;
                    }
                    int i16 = 1 - y3Var.u0;
                    y3Var.u0 = i16;
                    ci0 B = g9VarArr[2 - i16].getImageReceiver().B();
                    ci0 B2 = g9VarArr[y3Var.u0 + 1].getImageReceiver().B();
                    if (B2 != null && B != null) {
                        B2.T(false, B.t());
                    }
                    y3Var.c0.c();
                    int i17 = y3Var.u0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = y3Var.b0;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) y3Var.e0.c();
                    stargiftattributebackdropArr[i17] = stargiftattributebackdrop;
                    y3Var.e(i17, stargiftattributebackdrop);
                    y3Var.g(1, (TL_stars.starGiftAttributePattern) y3Var.d0.c(), true);
                    y3Var.a();
                    float f19 = y3Var.u0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f19, f19);
                    y3Var.k0 = ofFloat;
                    ofFloat.addUpdateListener(new rh.u3(y3Var, 2));
                    y3Var.k0.addListener(new rh.x3(y3Var));
                    y3Var.k0.setDuration(320L);
                    y3Var.k0.setInterpolator(gr.h);
                    y3Var.k0.start();
                    return;
                }
                return;
            case 22:
                rh.h8 h8Var3 = (rh.h8) this.b;
                if (h8Var3.U == null || h8Var3.a0 == -1) {
                    return;
                }
                h8Var3.n1("POSTED_ALIGN");
                h8Var3.U.a();
                return;
            case 23:
                ((lg.q) this.b).setPaused(true);
                return;
            case 24:
                org.telegram.messenger.i0.J3((EditTextBoldCursor) this.b);
                return;
            case 25:
                ((rh.i0[]) this.b)[0].dismiss();
                return;
            case 26:
                gf.f.r(((x7) this.b).getContext(), dd.L0(2131744984, null));
                return;
            case 27:
                gf.f.r(((y7) this.b).getContext(), dd.L0(2131744984, null));
                return;
            case 28:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            default:
                sg.s sVar = (sg.s) ((n2.u) this.b).b;
                sg.q qVar = sVar.b;
                if (qVar != null) {
                    qVar.d(true);
                }
                sVar.a.L7(true);
                return;
        }
    }
}
