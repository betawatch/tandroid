package sh;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.view.Choreographer;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.kc;
import di.v7;
import fi.e5;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Wallet.w6;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.e51;
import tg.a2;
import tg.k2;
import ug.b0;
import ug.i0;
import ug.j1;
import ug.l1;
import ug.p0;
import ug.t1;
import ug.w0;
import vg.q;
import vg.r;
import wg.u;
import wg.x;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0146, code lost:
    
        if (r11.i != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01db A[Catch: all -> 0x0172, RuntimeException -> 0x0176, TryCatch #10 {RuntimeException -> 0x0176, all -> 0x0172, blocks: (B:86:0x00c5, B:89:0x00da, B:91:0x0131, B:93:0x0137, B:97:0x02c5, B:98:0x0140, B:106:0x0149, B:108:0x014f, B:110:0x0165, B:114:0x016a, B:115:0x0171, B:116:0x017c, B:118:0x0188, B:122:0x018d, B:123:0x0194, B:124:0x0195, B:126:0x01a8, B:128:0x01bc, B:130:0x01c4, B:134:0x01d1, B:136:0x01db, B:138:0x01df, B:140:0x01fa, B:143:0x0200, B:144:0x0205, B:146:0x0206, B:149:0x020e, B:151:0x0212, B:153:0x0216, B:155:0x021a, B:157:0x0220, B:160:0x0228, B:162:0x022e, B:164:0x0232, B:167:0x0241, B:169:0x025a, B:171:0x025e, B:172:0x026c, B:175:0x027b, B:177:0x0293, B:179:0x02a5, B:182:0x02ab, B:183:0x02b0, B:185:0x02b1, B:189:0x02c1, B:192:0x02cb, B:193:0x02d2, B:207:0x00cf), top: B:85:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02eb A[Catch: all -> 0x02fc, TRY_LEAVE, TryCatch #6 {all -> 0x02fc, blocks: (B:62:0x02e4, B:64:0x02eb), top: B:61:0x02e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0312  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        boolean z10;
        int i7;
        vg.p pVar = null;
        int i10 = 0;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                g0.K3(((c) this.b).a);
                return;
            case 1:
                c cVar = (c) ((z5) this.b).Z1;
                q1 q1Var = cVar.n;
                if (q1Var == null || q1Var.getDelegate() == null) {
                    return;
                }
                cVar.n.getDelegate().s1(cVar.n, false);
                return;
            case 2:
                ((o) this.b).c.f3.O(true);
                return;
            case 3:
                ((n) this.b).a();
                return;
            case 4:
                e5 e5Var = (e5) this.b;
                e5Var.x0 = true;
                e5Var.s();
                return;
            case 5:
                ui.b0(p10.s0).d(2, null, ((a2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 6:
                g0.K3(((k2) this.b).q0);
                return;
            case 7:
                ((FrameLayout) this.b).invalidate();
                return;
            case 8:
                ti.i iVar = (ti.i) ((og.b) this.b).b;
                iVar.h.invalidate();
                iVar.i.requestLayout();
                return;
            case 9:
                l2.i iVar2 = (l2.i) this.b;
                ArrayList arrayList = (ArrayList) iVar2.c;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ti.o oVar = (ti.o) arrayList.get(i11);
                    ti.i iVar3 = oVar.e;
                    if (iVar3 != null && oVar.c == 1 && iVar3.g && !iVar3.K) {
                        if ((iVar3.b.r() && kc.a(iVar3.c)) != iVar3.f) {
                            iVar3.l();
                            iVar3.a();
                        }
                    }
                }
                iVar2.f();
                return;
            case 10:
                ((ti.m) this.b).Q();
                return;
            case 11:
                ti.o oVar2 = (ti.o) this.b;
                if (oVar2.c == 1) {
                    oVar2.a.T();
                    return;
                }
                return;
            case 12:
                u2.f fVar = (u2.f) this.b;
                synchronized (fVar.a) {
                    try {
                        if (fVar.m) {
                            return;
                        }
                        long j3 = fVar.l - 1;
                        fVar.l = j3;
                        if (j3 > 0) {
                            return;
                        }
                        if (j3 < 0) {
                            fVar.c(new IllegalStateException());
                            return;
                        } else {
                            fVar.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 13:
                ui.e eVar = (ui.e) this.b;
                ((v5.g) ((w5.c) eVar.e)).f(new u5.e(eVar, 0));
                return;
            case 14:
                i0 i0Var = ((b0) this.b).c;
                i0Var.r1.presentFragment(e51.g0(i0Var.n1(), true));
                return;
            case 15:
                ch0 ch0Var = ((p0) this.b).F;
                ch0Var.getAnimatedDrawable().N(0, true, false);
                ch0Var.d();
                return;
            case 16:
                ((w0) ((v7) this.b).c).I0();
                return;
            case 17:
                j1 j1Var = (j1) this.b;
                int size = 1073741823 - (1073741823 % j1Var.e3.size());
                v4.b0 b0Var = j1Var.f3;
                j1Var.s3 = size;
                b0Var.h1(size, (j1Var.getMeasuredHeight() - j1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                j1Var.z1(null, false);
                return;
            case 18:
                ((l1) this.b).invalidate();
                return;
            case 19:
                ((t1) this.b).a();
                return;
            case 20:
                ui.c cVar2 = (ui.c) this.b;
                g0.i3(new ui.b(cVar2.a, cVar2.b, 1), 500L);
                return;
            case 21:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            case 22:
                vg.e eVar2 = ((vg.d) this.b).d;
                eVar2.s = false;
                eVar2.w = null;
                Choreographer.getInstance().removeFrameCallback(eVar2);
                eVar2.F = 0L;
                w6 w6Var = (w6) eVar2;
                x6 x6Var = w6Var.L;
                if (x6Var.d == w6Var) {
                    x6.c(x6Var);
                    return;
                }
                return;
            case 23:
                vg.o oVar3 = (vg.o) this.b;
                q[] qVarArr = oVar3.g;
                try {
                } catch (RuntimeException e10) {
                    e = e10;
                    z9 = true;
                    z10 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z11 = false;
                }
                if (qVarArr.length != 0) {
                    if (oVar3.n == null) {
                        try {
                            oVar3.a();
                        } catch (RuntimeException e11) {
                            e = e11;
                            z10 = false;
                            z9 = true;
                            try {
                                a8.g(e, z9);
                                for (q qVar : qVarArr) {
                                    qVar.a.post(new b(qVar, 24));
                                }
                                oVar3.h.set(false);
                                if (!z10) {
                                    return;
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = z10;
                                oVar3.h.set(false);
                                if (z11) {
                                    Trace.endSection();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z11 = false;
                            oVar3.h.set(false);
                            if (z11) {
                            }
                            throw th;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    boolean z12 = false;
                    boolean z13 = false;
                    for (q qVar2 : qVarArr) {
                        vg.p pVar2 = qVar2.e;
                        if (qVar2.c && pVar2 != null) {
                            boolean z14 = pVar2.c;
                            z13 |= z14;
                            if (!z14) {
                                pVar = pVar2;
                            }
                        }
                        z12 |= (!qVar2.c || qVar2.d || pVar2 == null) ? false : true;
                    }
                    if (!z12) {
                        if (uptimeMillis - oVar3.q < (z13 ? 16 : 33)) {
                        }
                    }
                    Trace.beginSection(z13 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                    try {
                        float min = oVar3.q == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r2) / 1000.0f);
                        oVar3.q = uptimeMillis;
                        EGLDisplay eGLDisplay = oVar3.j;
                        EGLSurface eGLSurface = oVar3.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar3.k);
                        if (pVar != null) {
                            try {
                                long j10 = oVar3.r;
                                if (j10 == 0 || uptimeMillis - j10 >= 33) {
                                    vg.a aVar = oVar3.n;
                                    int i12 = oVar3.c;
                                    aVar.c(i12, i12, pVar.a, pVar.b, 0.0f, j10 == 0 ? 0.0f : (uptimeMillis - j10) / 1000.0f, 1.0f, 0.0f, true);
                                    oVar3.r = uptimeMillis;
                                    oVar3.s++;
                                }
                            } catch (RuntimeException e12) {
                                e = e12;
                                z9 = z11;
                                z10 = z9;
                                a8.g(e, z9);
                                while (r2 < r0) {
                                }
                                oVar3.h.set(false);
                                if (!z10) {
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                oVar3.h.set(false);
                                if (z11) {
                                }
                                throw th;
                            }
                        }
                        int length = qVarArr.length;
                        int i13 = 0;
                        boolean z15 = false;
                        boolean z16 = false;
                        while (i13 < length) {
                            q qVar3 = qVarArr[i13];
                            if (qVar3.c) {
                                vg.p pVar3 = qVar3.e;
                                if (pVar3 == null) {
                                    break;
                                }
                                if (qVar3.h == EGL14.EGL_NO_SURFACE) {
                                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(oVar3.j, oVar3.m, qVar3.b, new int[]{12344}, i10);
                                    qVar3.h = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                                        if (qVar3.c) {
                                            throw new IllegalStateException("Wallet EGL window failed");
                                        }
                                    }
                                }
                                EGLDisplay eGLDisplay2 = oVar3.j;
                                EGLSurface eGLSurface2 = qVar3.h;
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, oVar3.k)) {
                                    EGL14.eglSwapInterval(oVar3.j, i10);
                                    if (EGL14.eglQuerySurface(oVar3.j, qVar3.h, 12375, oVar3.i, i10)) {
                                        int i14 = i10;
                                        if (EGL14.eglQuerySurface(oVar3.j, qVar3.h, 12374, oVar3.i, 1)) {
                                            int i15 = qVar3.f;
                                            int[] iArr = oVar3.i;
                                            int i16 = iArr[i14];
                                            if (i15 == i16 && qVar3.g == iArr[1]) {
                                                i7 = i14;
                                                qVar3.f = i16;
                                                qVar3.g = iArr[1];
                                                if (pVar3 != null) {
                                                    if (!qVar3.i) {
                                                        GLES20.glBindFramebuffer(36160, i14);
                                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                        GLES20.glClear(TLObject.FLAG_14);
                                                        if (!EGL14.eglSwapBuffers(oVar3.j, qVar3.h) && qVar3.c) {
                                                            throw new IllegalStateException("Wallet EGL swap failed");
                                                        }
                                                        qVar3.i = true;
                                                    }
                                                } else if (i7 != 0 || pVar3.c || qVar3.j || qVar3.i || qVar3.k != oVar3.s || qVar3.l != 1.0f) {
                                                    vg.a aVar2 = oVar3.n;
                                                    if (pVar3.c) {
                                                        if (pVar3.d) {
                                                            vg.a aVar3 = oVar3.o;
                                                            int i17 = oVar3.d;
                                                            aVar3.c(i17, i17, pVar3.a, pVar3.b, 0.0f, z15 ? 0.0f : min, 1.0f, 0.0f, true);
                                                            aVar2 = aVar3;
                                                            z15 = true;
                                                        } else {
                                                            if (oVar3.p == null) {
                                                                vg.a aVar4 = new vg.a(oVar3.a, 2);
                                                                aVar4.C = oVar3.e;
                                                                oVar3.p = aVar4;
                                                            }
                                                            vg.a aVar5 = oVar3.p;
                                                            int i18 = oVar3.c;
                                                            aVar5.c(i18, i18, pVar3.a, pVar3.b, 0.0f, z16 ? 0.0f : min, 1.0f, 0.0f, true);
                                                            aVar2 = aVar5;
                                                            z16 = true;
                                                        }
                                                    }
                                                    aVar2.d(1.0f, 0.0f, qVar3.f, qVar3.g);
                                                    if (!EGL14.eglSwapBuffers(oVar3.j, qVar3.h) && qVar3.c) {
                                                        throw new IllegalStateException("Wallet EGL swap failed");
                                                    }
                                                    qVar3.i = false;
                                                    qVar3.k = oVar3.s;
                                                    qVar3.l = 1.0f;
                                                    qVar3.j = pVar3.c;
                                                    qVar3.d = true;
                                                    i13++;
                                                    i10 = 0;
                                                    z11 = true;
                                                }
                                            }
                                            i7 = 1;
                                            qVar3.f = i16;
                                            qVar3.g = iArr[1];
                                            if (pVar3 != null) {
                                            }
                                        }
                                    }
                                    if (qVar3.c) {
                                        throw new IllegalStateException("Wallet EGL surface size failed");
                                    }
                                    i13++;
                                    i10 = 0;
                                    z11 = true;
                                } else if (qVar3.c) {
                                    throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                }
                            }
                            i13++;
                            i10 = 0;
                            z11 = true;
                        }
                        oVar3.h.set(false);
                    } catch (RuntimeException e13) {
                        e = e13;
                        z9 = true;
                        z10 = true;
                    } catch (Throwable th6) {
                        th = th6;
                        z11 = true;
                    }
                    Trace.endSection();
                    return;
                }
                oVar3.h.set(false);
                return;
            case 24:
                q qVar4 = (q) this.b;
                r rVar = qVar4.a;
                if (rVar.e == qVar4) {
                    rVar.n = false;
                    rVar.a();
                    return;
                }
                return;
            case 25:
                ((vh.g) this.b).Y1.O(true);
                return;
            case 26:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.b;
                gc X = gc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, spannableStringBuilder).j();
                    return;
                }
                return;
            case 27:
                ((x) this.b).a(null);
                return;
            case 28:
                ((ex) this.b).a(Collections.EMPTY_LIST);
                return;
            default:
                ((u) this.b).a(null);
                return;
        }
    }
}
