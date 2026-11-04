package r4;

import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import b8.ke;
import b8.kg;
import ei.v7;
import gi.c5;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Wallet.t6;
import org.telegram.ui.Wallet.u6;
import org.telegram.ui.m91;
import org.telegram.ui.r41;
import org.telegram.ui.wm;
import tg.j1;
import tg.k1;
import tg.x0;
import ug.a2;
import ug.l2;
import vg.m1;
import vg.o1;
import vg.v0;
import vg.w1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
    
        if (r11.i != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cd A[Catch: all -> 0x0165, RuntimeException -> 0x0169, TryCatch #8 {RuntimeException -> 0x0169, all -> 0x0165, blocks: (B:66:0x00b6, B:69:0x00cd, B:71:0x0124, B:73:0x012a, B:77:0x02b7, B:78:0x0133, B:90:0x013c, B:92:0x0142, B:94:0x0158, B:98:0x015d, B:99:0x0164, B:100:0x016e, B:102:0x017a, B:106:0x017f, B:107:0x0186, B:108:0x0187, B:110:0x019a, B:112:0x01ae, B:114:0x01b6, B:118:0x01c3, B:120:0x01cd, B:122:0x01d1, B:124:0x01ec, B:127:0x01f2, B:128:0x01f7, B:130:0x01f8, B:133:0x0200, B:135:0x0204, B:137:0x0208, B:139:0x020c, B:141:0x0212, B:144:0x021a, B:146:0x0220, B:148:0x0224, B:151:0x0233, B:153:0x024c, B:155:0x0250, B:156:0x025e, B:159:0x026d, B:161:0x0285, B:163:0x0297, B:166:0x029d, B:167:0x02a2, B:169:0x02a3, B:173:0x02b3, B:176:0x02bd, B:177:0x02c4, B:191:0x00c2), top: B:65:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02dc A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #3 {all -> 0x0066, blocks: (B:198:0x0062, B:24:0x0078, B:27:0x0082, B:30:0x0088, B:32:0x008c, B:37:0x0095, B:42:0x009b, B:45:0x00a6, B:50:0x02d5, B:52:0x02dc), top: B:14:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                ((vi0) this.b).b();
                return;
            case 1:
                m91 m91Var = (m91) this.b;
                if (m91Var.getParentLayout() != null) {
                    m91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", m91Var.a);
                    wm wmVar = new wm(bundle);
                    wmVar.Da = true;
                    m91Var.presentFragment(wmVar);
                    return;
                }
                return;
            case 2:
                ez ezVar = (ez) this.b;
                sh.b bVar = (sh.b) ezVar.c;
                if (bVar == sh.b.b) {
                    ezVar.a(sh.b.a, true);
                    return;
                } else {
                    if (bVar == sh.b.c) {
                        ezVar.a(sh.b.d, true);
                        return;
                    }
                    return;
                }
            case 3:
                t2.f fVar = (t2.f) this.b;
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
                za.p pVar = (za.p) this.b;
                ((u5.g) ((v5.c) pVar.d)).f(new e3(pVar, 14));
                return;
            case 5:
                nh nhVar = ((tg.h0) this.b).b.a;
                if (nhVar != null) {
                    nhVar.x();
                    return;
                }
                return;
            case 6:
                tg.i0 i0Var = ((tg.h0) this.b).b;
                if (i0Var.d == null) {
                    i0Var.L = null;
                    return;
                }
                int currentColor = i0Var.f.getCurrentColor();
                i0Var.l(i0Var.b, false, false);
                kg d = i0Var.d(i0Var.b, currentColor, new RectF(i0Var.h));
                i0Var.b();
                x0 x0Var = i0Var.d;
                RectF rectF = new RectF();
                i0Var.h = rectF;
                x0Var.a(rectF);
                i0Var.p(i0Var.e(x0Var, currentColor, new RectF(i0Var.h)), false);
                i0Var.p(d, false);
                i0Var.e(x0Var, currentColor, null);
                i0Var.d = null;
                i0Var.J = 0.0f;
                i0Var.L = null;
                return;
            case 7:
                ((tg.s0) ((lt) this.b).b).E.a.f();
                return;
            case 8:
                j1 j1Var = ((k1) this.b).a;
                if (j1Var != null) {
                    j1Var.o();
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.g0.K3(((th.b) this.b).a);
                return;
            case 10:
                th.b bVar2 = (th.b) ((ai.z) this.b).a2;
                q1 q1Var = bVar2.n;
                if (q1Var == null || q1Var.getDelegate() == null) {
                    return;
                }
                bVar2.n.getDelegate().u1(bVar2.n, false);
                return;
            case 11:
                ((th.n) this.b).c.g3.O(true);
                return;
            case 12:
                ((th.m) this.b).a();
                return;
            case 13:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            case 14:
                c5 c5Var = (c5) this.b;
                c5Var.y0 = true;
                c5Var.s();
                return;
            case 15:
                li.b0(h10.t0).d(2, null, ((a2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 16:
                org.telegram.messenger.g0.K3(((l2) this.b).r0);
                return;
            case 17:
                ui.d dVar = (ui.d) this.b;
                org.telegram.messenger.g0.i3(new ui.c(dVar.a, dVar.b, 1), 500L);
                return;
            case 18:
                vg.i0 i0Var2 = ((vg.b0) this.b).c;
                i0Var2.p1.presentFragment(r41.g0(i0Var2.n1(), true));
                return;
            case 19:
                fh0 fh0Var = ((vg.o0) this.b).G;
                fh0Var.getAnimatedDrawable().N(0, true, false);
                fh0Var.d();
                return;
            case 20:
                ((v0) ((v7) this.b).c).I0();
                return;
            case 21:
                m1 m1Var = (m1) this.b;
                int size = 1073741823 - (1073741823 % m1Var.f3.size());
                u4.b0 b0Var = m1Var.g3;
                m1Var.t3 = size;
                b0Var.h1(size, (m1Var.getMeasuredHeight() - m1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                m1Var.z1(null, false);
                return;
            case 22:
                ((o1) this.b).invalidate();
                return;
            case 23:
                ((w1) this.b).a();
                return;
            case 24:
                ((ke) this.b).L();
                return;
            case 25:
                wg.e eVar = ((wg.d) this.b).d;
                eVar.s = false;
                eVar.w = null;
                Choreographer.getInstance().removeFrameCallback(eVar);
                eVar.G = 0L;
                t6 t6Var = (t6) eVar;
                u6 u6Var = t6Var.M;
                if (u6Var.d == t6Var) {
                    u6.c(u6Var);
                    return;
                }
                return;
            case 26:
                wg.o oVar = (wg.o) this.b;
                wg.q[] qVarArr = oVar.g;
                boolean z10 = true;
                boolean z11 = false;
                int i10 = 0;
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    z10 = true;
                    z11 = false;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                }
                if (qVarArr.length != 0) {
                    if (oVar.n == null) {
                        try {
                            oVar.a();
                        } catch (RuntimeException e11) {
                            e = e11;
                            a8.g(e, z10);
                            for (wg.q qVar : qVarArr) {
                                qVar.a.post(new u(qVar, 27));
                            }
                            oVar.h.set(false);
                            if (!z11) {
                                return;
                            }
                            Trace.endSection();
                            return;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = qVarArr.length;
                    wg.p pVar2 = null;
                    int i11 = 0;
                    boolean z12 = false;
                    boolean z13 = false;
                    while (i11 < length) {
                        wg.q qVar2 = qVarArr[i11];
                        wg.p pVar3 = qVar2.e;
                        if (qVar2.c && pVar3 != null) {
                            boolean z14 = pVar3.c;
                            z13 |= z14;
                            if (!z14) {
                                pVar2 = pVar3;
                            }
                        }
                        i11++;
                        z12 |= (!qVar2.c || qVar2.d || pVar3 == null) ? false : true;
                    }
                    if (!z12) {
                        if (uptimeMillis - oVar.q < (z13 ? 16 : 33)) {
                        }
                    }
                    Trace.beginSection(z13 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                    try {
                        float min = oVar.q == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r10) / 1000.0f);
                        oVar.q = uptimeMillis;
                        EGLDisplay eGLDisplay = oVar.j;
                        EGLSurface eGLSurface = oVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar.k);
                        if (pVar2 != null) {
                            try {
                                long j11 = oVar.r;
                                if (j11 == 0 || uptimeMillis - j11 >= 33) {
                                    wg.a aVar = oVar.n;
                                    int i12 = oVar.c;
                                    aVar.c(i12, i12, pVar2.a, pVar2.b, 0.0f, j11 == 0 ? 0.0f : (uptimeMillis - j11) / 1000.0f, 1.0f, 0.0f, true);
                                    oVar.r = uptimeMillis;
                                    oVar.s++;
                                }
                            } catch (RuntimeException e12) {
                                e = e12;
                                z11 = z10;
                                a8.g(e, z10);
                                while (r4 < r0) {
                                }
                                oVar.h.set(false);
                                if (!z11) {
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                oVar.h.set(false);
                                if (z10) {
                                    Trace.endSection();
                                }
                                throw th;
                            }
                        }
                        int length2 = qVarArr.length;
                        int i13 = 0;
                        boolean z15 = false;
                        boolean z16 = false;
                        while (i13 < length2) {
                            wg.q qVar3 = qVarArr[i13];
                            if (qVar3.c) {
                                wg.p pVar4 = qVar3.e;
                                if (pVar4 == null) {
                                    break;
                                }
                                if (qVar3.h == EGL14.EGL_NO_SURFACE) {
                                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(oVar.j, oVar.m, qVar3.b, new int[]{12344}, i10);
                                    qVar3.h = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                                        if (qVar3.c) {
                                            throw new IllegalStateException("Wallet EGL window failed");
                                        }
                                    }
                                }
                                EGLDisplay eGLDisplay2 = oVar.j;
                                EGLSurface eGLSurface2 = qVar3.h;
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, oVar.k)) {
                                    EGL14.eglSwapInterval(oVar.j, i10);
                                    if (EGL14.eglQuerySurface(oVar.j, qVar3.h, 12375, oVar.i, i10)) {
                                        int i14 = i10;
                                        if (EGL14.eglQuerySurface(oVar.j, qVar3.h, 12374, oVar.i, 1)) {
                                            int i15 = qVar3.f;
                                            int[] iArr = oVar.i;
                                            int i16 = iArr[i14];
                                            if (i15 == i16 && qVar3.g == iArr[1]) {
                                                i3 = i14;
                                                qVar3.f = i16;
                                                qVar3.g = iArr[1];
                                                if (pVar4 != null) {
                                                    if (!qVar3.i) {
                                                        GLES20.glBindFramebuffer(36160, i14);
                                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                        GLES20.glClear(TLObject.FLAG_14);
                                                        if (!EGL14.eglSwapBuffers(oVar.j, qVar3.h) && qVar3.c) {
                                                            throw new IllegalStateException("Wallet EGL swap failed");
                                                        }
                                                        qVar3.i = true;
                                                    }
                                                } else if (i3 != 0 || pVar4.c || qVar3.j || qVar3.i || qVar3.k != oVar.s || qVar3.l != 1.0f) {
                                                    wg.a aVar2 = oVar.n;
                                                    if (pVar4.c) {
                                                        if (pVar4.d) {
                                                            wg.a aVar3 = oVar.o;
                                                            int i17 = oVar.d;
                                                            aVar3.c(i17, i17, pVar4.a, pVar4.b, 0.0f, z15 ? 0.0f : min, 1.0f, 0.0f, true);
                                                            aVar2 = aVar3;
                                                            z15 = true;
                                                        } else {
                                                            if (oVar.p == null) {
                                                                wg.a aVar4 = new wg.a(oVar.a, 2);
                                                                aVar4.C = oVar.e;
                                                                oVar.p = aVar4;
                                                            }
                                                            wg.a aVar5 = oVar.p;
                                                            int i18 = oVar.c;
                                                            aVar5.c(i18, i18, pVar4.a, pVar4.b, 0.0f, z16 ? 0.0f : min, 1.0f, 0.0f, true);
                                                            aVar2 = aVar5;
                                                            z16 = true;
                                                        }
                                                    }
                                                    aVar2.d(1.0f, 0.0f, qVar3.f, qVar3.g);
                                                    if (!EGL14.eglSwapBuffers(oVar.j, qVar3.h) && qVar3.c) {
                                                        throw new IllegalStateException("Wallet EGL swap failed");
                                                    }
                                                    qVar3.i = false;
                                                    qVar3.k = oVar.s;
                                                    qVar3.l = 1.0f;
                                                    qVar3.j = pVar4.c;
                                                    qVar3.d = true;
                                                    i13++;
                                                    z10 = true;
                                                    i10 = 0;
                                                }
                                            }
                                            i3 = 1;
                                            qVar3.f = i16;
                                            qVar3.g = iArr[1];
                                            if (pVar4 != null) {
                                            }
                                        }
                                    }
                                    if (qVar3.c) {
                                        throw new IllegalStateException("Wallet EGL surface size failed");
                                    }
                                    i13++;
                                    z10 = true;
                                    i10 = 0;
                                } else if (qVar3.c) {
                                    throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                }
                            }
                            i13++;
                            z10 = true;
                            i10 = 0;
                        }
                        oVar.h.set(false);
                    } catch (RuntimeException e13) {
                        e = e13;
                        z10 = true;
                        z11 = true;
                    } catch (Throwable th5) {
                        th = th5;
                        z10 = true;
                    }
                    Trace.endSection();
                    return;
                }
                oVar.h.set(false);
                return;
            case 27:
                wg.q qVar4 = (wg.q) this.b;
                wg.r rVar = qVar4.a;
                if (rVar.e == qVar4) {
                    rVar.n = false;
                    rVar.a();
                    return;
                }
                return;
            case 28:
                ((wh.h) this.b).W1.O(true);
                return;
            default:
                j40 j40Var = (j40) ((y00) this.b).a;
                j40Var.q0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = j40Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                a8.b(sb2.toString());
                j40Var.v(true);
                j40.m(j40Var);
                return;
        }
    }
}
