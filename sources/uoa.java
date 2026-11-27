// default package

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uoa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uoa(rw3 rw3Var, int i) {
        this.a = (byte) 17;
        this.b = rw3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0336 A[ADDED_TO_REGION, LOOP:1: B:130:0x0336->B:131:0x0338, LOOP_START, PHI: r7
      0x0336: PHI (r7v1 int) = (r7v0 int), (r7v2 int) binds: [B:129:0x0334, B:131:0x0338] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0333  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        char c;
        char c2;
        int i;
        byte b = this.a;
        boolean z3 = false;
        boolean z4 = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((voa) obj).e();
                break;
            case 1:
                ((gra) obj).onBackPressed();
                break;
            case 2:
                dqc dqcVar = (dqc) obj;
                wsc wscVar = dqcVar.c.k0;
                if (wscVar != null) {
                    TL_wallet.nftItem nftitem = dqcVar.b;
                    if (wscVar.A()) {
                        wscVar.c0(wscVar.v(nftitem));
                        break;
                    }
                }
                break;
            case 3:
                eqc eqcVar = (eqc) obj;
                wsc wscVar2 = eqcVar.b.k0;
                if (wscVar2 != null) {
                    wscVar2.b0(eqcVar.a);
                    break;
                }
                break;
            case 4:
                vta vtaVar = (vta) obj;
                vtaVar.i0 = false;
                vtaVar.k0 = false;
                vtaVar.a(vtaVar.a0, vtaVar.b0, vtaVar.c0, vtaVar.d0);
                break;
            case 5:
                ((mta) obj).invalidateSelf();
                break;
            case 6:
                pta ptaVar = (pta) obj;
                ota otaVar = ptaVar.I;
                if (otaVar == null) {
                    char c3 = 2;
                    z = true;
                    if (Math.abs(ptaVar.d) <= 1.0E-4f && Math.abs(ptaVar.e) <= 1.0E-4f) {
                        z2 = false;
                        c = c3;
                        if (ptaVar.H == null ? z : z2) {
                            for (int i2 = 0; i2 < 6; i2++) {
                                Matrix.multiplyMV(ptaVar.n, 0, ptaVar.c, 0, ptaVar.h[i2], 0);
                                ptaVar.r[i2] = ptaVar.n[c];
                            }
                            Arrays.sort(ptaVar.s, new jz0(ptaVar, (byte) 6));
                            ptaVar.invalidate();
                        }
                        if (!ptaVar.isAttachedToWindow()) {
                            hl.d3(ptaVar.J, 16L);
                            break;
                        }
                    } else {
                        ptaVar.a();
                        c2 = c3;
                    }
                } else {
                    float[] fArr = otaVar.h;
                    pta ptaVar2 = otaVar.a;
                    if (!otaVar.e && (i = otaVar.c) != 0) {
                        if (otaVar.l) {
                            ptaVar2.a();
                        } else {
                            int F = ik8.F(((nta) otaVar.b.get(i - 1)).a);
                            if (F == 1 || F == 2) {
                                char c4 = 2;
                                z = true;
                                ptaVar2.a();
                                int i3 = otaVar.f - 1;
                                otaVar.f = i3;
                                c2 = c4;
                                if (i3 <= 0) {
                                    otaVar.b();
                                    c2 = c4;
                                }
                            } else if (F == 3) {
                                char c5 = 2;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (otaVar.f / otaVar.g)), 3.0d));
                                float f = 1.0f - pow;
                                if (Math.abs(otaVar.j * f) > 1.0E-4f || Math.abs(otaVar.k * f) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    float f2 = otaVar.j * f;
                                    Objects.requireNonNull(ptaVar2);
                                    pta.b(1.0f, 0.0f, f2 * 0.96f, fArr2);
                                    pta.d(fArr2, fArr, fArr);
                                    pta.b(0.0f, 1.0f, otaVar.k * f * 0.96f, fArr2);
                                    pta.d(fArr2, fArr, fArr);
                                }
                                float[] fArr3 = otaVar.i;
                                float[] fArr4 = ptaVar2.c;
                                int i4 = 0;
                                while (i4 < 16) {
                                    float f3 = fArr[i4];
                                    fArr4[i4] = qd4.A(fArr3[i4], f3, pow, f3);
                                    i4++;
                                    z4 = z4;
                                }
                                z = z4;
                                float f4 = fArr4[0];
                                float f5 = fArr4[z ? 1 : 0];
                                float f6 = fArr4[2];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f4;
                                fArr5[z ? 1 : 0] = f5;
                                fArr5[2] = f6;
                                float f7 = fArr4[4];
                                float f8 = fArr4[5];
                                float f9 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f7;
                                fArr6[z ? 1 : 0] = f8;
                                fArr6[2] = f9;
                                float[] fArr7 = new float[3];
                                pta.e(fArr5);
                                pta.c(fArr5, fArr6, fArr7);
                                pta.e(fArr7);
                                pta.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[z ? 1 : 0] = fArr5[z ? 1 : 0];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[z ? 1 : 0];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[z ? 1 : 0];
                                fArr4[10] = fArr7[2];
                                int i5 = otaVar.f - 1;
                                otaVar.f = i5;
                                c2 = c5;
                                if (i5 <= 0) {
                                    System.arraycopy(otaVar.i, 0, ptaVar2.c, 0, 16);
                                    ptaVar2.d = 0.0f;
                                    ptaVar2.e = 0.0f;
                                    otaVar.b();
                                    c2 = c5;
                                }
                            }
                        }
                    }
                    c2 = 2;
                    z = true;
                }
                z2 = z ? 1 : 0;
                c = c2;
                if (ptaVar.H == null ? z : z2) {
                }
                if (!ptaVar.isAttachedToWindow()) {
                }
                break;
            case 7:
                ((qta) obj).invalidate();
                break;
            case 8:
                ((uta) obj).invalidateSelf();
                break;
            case 9:
                sua suaVar = (sua) obj;
                uoa uoaVar = suaVar.p0;
                de0[] de0VarArr = suaVar.d;
                if (!de0VarArr[2 - suaVar.y0].getImageReceiver().C()) {
                    hl.r(uoaVar);
                    hl.d3(uoaVar, 150L);
                    break;
                } else {
                    yta ytaVar = suaVar.b0;
                    if (ytaVar != null && ytaVar.b == 1 && suaVar.isAttachedToWindow()) {
                        hl.r(uoaVar);
                        ValueAnimator valueAnimator = suaVar.o0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            suaVar.o0 = null;
                        }
                        int i6 = 1 - suaVar.y0;
                        suaVar.y0 = i6;
                        b29 y = de0VarArr[2 - i6].getImageReceiver().y();
                        b29 y2 = de0VarArr[suaVar.y0 + 1].getImageReceiver().y();
                        if (y2 != null && y != null) {
                            y2.O(false, y.o());
                        }
                        suaVar.d0.b();
                        int i7 = suaVar.y0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = suaVar.c0;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) suaVar.f0.b();
                        stargiftattributebackdropArr[i7] = stargiftattributebackdrop;
                        suaVar.e(i7, stargiftattributebackdrop);
                        suaVar.g(1, (TL_stars.starGiftAttributePattern) suaVar.e0.b(), true);
                        suaVar.a();
                        float f10 = suaVar.y0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
                        suaVar.o0 = ofFloat;
                        ofFloat.addUpdateListener(new pua(suaVar, (byte) 2));
                        suaVar.o0.addListener(new rua(suaVar));
                        suaVar.o0.setDuration(320L);
                        suaVar.o0.setInterpolator(k43.h);
                        suaVar.o0.start();
                        break;
                    }
                }
                break;
            case 10:
                nza nzaVar = (nza) obj;
                if (nzaVar.V != null && nzaVar.b0 != -1) {
                    nzaVar.o1("POSTED_ALIGN");
                    nzaVar.V.a();
                    break;
                }
                break;
            case 11:
                ((it4) obj).setPaused(true);
                break;
            case 12:
                ((h4a[]) obj)[0].dismiss();
                break;
            case 13:
                m01.u(((dza) obj).getContext(), ob6.M0(2131744623, null));
                break;
            case 14:
                m01.u(((eza) obj).getContext(), ob6.M0(2131744623, null));
                break;
            case 15:
                w1b w1bVar = (w1b) obj;
                w1bVar.n0.a(w1bVar.k0.f0, w1bVar.l0.isAttachedToWindow());
                break;
            case 16:
                g2b g2bVar = (g2b) obj;
                if (g2bVar.isShowing()) {
                    g2bVar.F0(true);
                    break;
                }
                break;
            case 17:
                ((rw3) obj).n0(0);
                break;
            case 18:
                p2b p2bVar = (p2b) obj;
                if (!p2bVar.x) {
                    p2bVar.E = 0.0f;
                    break;
                }
                break;
            case 19:
                ls6.d0(yac.t0).d(2, null, ((i3b) obj).f.document, (int) (System.currentTimeMillis() / 1000), false);
                break;
            case 20:
                ((b5b) obj).b();
                break;
            case 21:
                ar3 ar3Var = (ar3) obj;
                ar3Var.c(ar3Var.b);
                ar3Var.c = false;
                break;
            case 22:
                ((i9b) obj).run();
                break;
            case 23:
                g6b g6bVar = (g6b) obj;
                g6bVar.c();
                g6bVar.a(true);
                break;
            case 24:
                ((h5b) obj).a(null);
                break;
            case 25:
                ((p6b) obj).K();
                break;
            case 26:
                w6b w6bVar = (w6b) obj;
                ArrayList arrayList = w6bVar.c;
                if (arrayList != null) {
                    w6bVar.a.j1 = arrayList;
                }
                o68 o68Var = w6bVar.a;
                long j = w6bVar.b;
                if (o68Var.l1 != j || o68Var.j1 != null) {
                    o68Var.l1 = j;
                    o68Var.h1();
                    o68Var.f1();
                    o68Var.c1(true);
                    TL_stories.PeerStories peerStories = o68Var.t0.Q0;
                    c6b c6bVar = o68Var.C1;
                    if (peerStories != null) {
                        c6bVar.U(peerStories, true);
                        break;
                    } else {
                        TL_stories.PeerStories x = c6bVar.x(j);
                        if (x == null) {
                            x = c6bVar.y(j);
                            z3 = true;
                        }
                        c6bVar.U(x, z3);
                        break;
                    }
                }
                break;
            case 27:
                ((m66) obj).e(true);
                break;
            case 28:
                ((u7b) obj).requestLayout();
                break;
            default:
                v8b v8bVar = (v8b) obj;
                kg5 kg5Var = v8bVar.c;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    v8bVar.c = null;
                }
                v8bVar.b(false);
                break;
        }
    }

    public /* synthetic */ uoa(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
