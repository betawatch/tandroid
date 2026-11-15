package q2;

import a8.xa;
import ab.c0;
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
import fi.o7;
import hi.c5;
import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.ou;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Wallet.v6;
import org.telegram.ui.Wallet.w6;
import org.telegram.ui.an;
import org.telegram.ui.u91;
import org.telegram.ui.z41;
import sg.g0;
import sg.i0;
import sg.j1;
import sg.k1;
import sg.s0;
import sg.x0;
import tg.c2;
import tg.n2;
import tg.z1;
import ug.j0;
import ug.m1;
import ug.q0;
import ug.w1;
import v4.b0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f6, code lost:
    
        if (r11.i != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018a A[Catch: all -> 0x0122, RuntimeException -> 0x0126, TryCatch #9 {RuntimeException -> 0x0126, all -> 0x0122, blocks: (B:63:0x0073, B:66:0x008a, B:68:0x00e1, B:70:0x00e7, B:74:0x0274, B:75:0x00f0, B:83:0x00f9, B:85:0x00ff, B:87:0x0115, B:91:0x011a, B:92:0x0121, B:93:0x012b, B:95:0x0137, B:99:0x013c, B:100:0x0143, B:101:0x0144, B:103:0x0157, B:105:0x016b, B:107:0x0173, B:111:0x0180, B:113:0x018a, B:115:0x018e, B:117:0x01a9, B:120:0x01af, B:121:0x01b4, B:123:0x01b5, B:126:0x01bd, B:128:0x01c1, B:130:0x01c5, B:132:0x01c9, B:134:0x01cf, B:137:0x01d7, B:139:0x01dd, B:141:0x01e1, B:144:0x01f0, B:146:0x0209, B:148:0x020d, B:149:0x021b, B:152:0x022a, B:154:0x0242, B:156:0x0254, B:159:0x025a, B:160:0x025f, B:162:0x0260, B:166:0x0270, B:169:0x027a, B:170:0x0281, B:184:0x007f), top: B:62:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0299 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #3 {all -> 0x0023, blocks: (B:192:0x001f, B:15:0x0035, B:18:0x003f, B:21:0x0045, B:23:0x0049, B:28:0x0052, B:33:0x0058, B:36:0x0063, B:41:0x0292, B:43:0x0299), top: B:191:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                if (eVar.c) {
                    return;
                }
                h hVar = eVar.b;
                if (hVar != null) {
                    hVar.c(eVar.a);
                }
                eVar.d.y.remove(eVar);
                eVar.c = true;
                return;
            case 1:
                ((b) this.b).c(null);
                return;
            case 2:
                u91 u91Var = (u91) this.b;
                if (u91Var.getParentLayout() != null) {
                    u91Var.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", u91Var.a);
                    an anVar = new an(bundle);
                    anVar.Fa = true;
                    u91Var.presentFragment(anVar);
                    return;
                }
                return;
            case 3:
                ((ff) this.b).A0();
                return;
            case 4:
                lz lzVar = (lz) this.b;
                rh.b bVar = (rh.b) lzVar.c;
                if (bVar == rh.b.b) {
                    lzVar.a(rh.b.a, true);
                    return;
                } else {
                    if (bVar == rh.b.c) {
                        lzVar.a(rh.b.d, true);
                        return;
                    }
                    return;
                }
            case 5:
                ((s4.e) this.b).k();
                return;
            case 6:
                ((s4.g) this.b).n = -1;
                return;
            case 7:
                ((wi0) this.b).b();
                return;
            case 8:
                ou ouVar = ((g0) this.b).b.a;
                if (ouVar != null) {
                    ouVar.E0();
                    return;
                }
                return;
            case 9:
                i0 i0Var = ((g0) this.b).b;
                if (i0Var.d == null) {
                    i0Var.L = null;
                    return;
                }
                int currentColor = i0Var.f.getCurrentColor();
                i0Var.l(i0Var.b, false, false);
                xa d = i0Var.d(i0Var.b, currentColor, new RectF(i0Var.h));
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
            case 10:
                ((s0) ((s4.s0) this.b).b).E.a.m();
                return;
            case 11:
                j1 j1Var = ((k1) this.b).a;
                if (j1Var != null) {
                    j1Var.C();
                    return;
                }
                return;
            case 12:
                org.telegram.messenger.g0.J3(((sh.b) this.b).a);
                return;
            case 13:
                sh.b bVar2 = (sh.b) ((bi.u) this.b).f2;
                q1 q1Var = bVar2.n;
                if (q1Var == null || q1Var.getDelegate() == null) {
                    return;
                }
                bVar2.n.getDelegate().F1(bVar2.n, false);
                return;
            case 14:
                ((sh.n) this.b).c.g3.O(true);
                return;
            case 15:
                ((sh.m) this.b).a();
                return;
            case 16:
                c5 c5Var = (c5) this.b;
                c5Var.y0 = true;
                c5Var.s();
                return;
            case 17:
                si.b0(m10.t0).d(2, null, ((c2) this.b).f.document, (int) (System.currentTimeMillis() / 1000), false);
                return;
            case 18:
                org.telegram.messenger.g0.J3(((n2) this.b).r0);
                return;
            case 19:
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
            case 20:
                c0 c0Var = (c0) this.b;
                ((v5.g) ((w5.c) c0Var.e)).f(new z1(c0Var, 5));
                return;
            case 21:
                j0 j0Var = ((ug.c0) this.b).c;
                j0Var.s1.presentFragment(z41.g0(j0Var.n1(), true));
                return;
            case 22:
                fh0 fh0Var = ((q0) this.b).G;
                fh0Var.getAnimatedDrawable().N(0, true, false);
                fh0Var.d();
                return;
            case 23:
                ((ug.x0) ((o7) this.b).c).I0();
                return;
            case 24:
                ug.k1 k1Var = (ug.k1) this.b;
                int size = 1073741823 - (1073741823 % k1Var.f3.size());
                b0 b0Var = k1Var.g3;
                k1Var.t3 = size;
                b0Var.h1(size, (k1Var.getMeasuredHeight() - k1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                k1Var.z1(null, false);
                return;
            case 25:
                ((m1) this.b).invalidate();
                return;
            case 26:
                ((w1) this.b).a();
                return;
            case 27:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            case 28:
                vg.e eVar2 = ((vg.d) this.b).d;
                eVar2.s = false;
                eVar2.w = null;
                Choreographer.getInstance().removeFrameCallback(eVar2);
                eVar2.G = 0L;
                v6 v6Var = (v6) eVar2;
                w6 w6Var = v6Var.M;
                if (w6Var.d == v6Var) {
                    w6.c(w6Var);
                    return;
                }
                return;
            default:
                vg.p pVar = (vg.p) this.b;
                vg.r[] rVarArr = pVar.g;
                boolean z10 = true;
                boolean z11 = false;
                int i10 = 0;
                z11 = false;
                try {
                } catch (RuntimeException e10) {
                    e = e10;
                    z10 = true;
                    z11 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                }
                if (rVarArr.length != 0) {
                    if (pVar.n == null) {
                        try {
                            try {
                                pVar.a();
                            } catch (RuntimeException e11) {
                                e = e11;
                                a8.g(e, z10);
                                for (vg.r rVar : rVarArr) {
                                    rVar.a.post(new vg.o(rVar, 0));
                                }
                                pVar.h.set(false);
                                if (!z11) {
                                    return;
                                }
                                Trace.endSection();
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z10 = z11;
                            pVar.h.set(false);
                            if (z10) {
                                Trace.endSection();
                            }
                            throw th;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = rVarArr.length;
                    vg.q qVar = null;
                    int i11 = 0;
                    boolean z12 = false;
                    boolean z13 = false;
                    while (i11 < length) {
                        vg.r rVar2 = rVarArr[i11];
                        vg.q qVar2 = rVar2.e;
                        if (rVar2.c && qVar2 != null) {
                            boolean z14 = qVar2.c;
                            z13 |= z14;
                            if (!z14) {
                                qVar = qVar2;
                            }
                        }
                        i11++;
                        z12 |= (!rVar2.c || rVar2.d || qVar2 == null) ? false : true;
                    }
                    if (!z12) {
                        if (uptimeMillis - pVar.q < (z13 ? 16 : 33)) {
                        }
                    }
                    Trace.beginSection(z13 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                    try {
                        float min = pVar.q == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r10) / 1000.0f);
                        pVar.q = uptimeMillis;
                        EGLDisplay eGLDisplay = pVar.j;
                        EGLSurface eGLSurface = pVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar.k);
                        if (qVar != null) {
                            try {
                                long j10 = pVar.r;
                                if (j10 == 0 || uptimeMillis - j10 >= 33) {
                                    vg.a aVar = pVar.n;
                                    int i12 = pVar.c;
                                    aVar.c(i12, i12, qVar.a, qVar.b, 0.0f, j10 == 0 ? 0.0f : (uptimeMillis - j10) / 1000.0f, 1.0f, 0.0f, true);
                                    pVar.r = uptimeMillis;
                                    pVar.s++;
                                }
                            } catch (RuntimeException e12) {
                                e = e12;
                                z11 = z10;
                                a8.g(e, z10);
                                while (r4 < r0) {
                                }
                                pVar.h.set(false);
                                if (!z11) {
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                pVar.h.set(false);
                                if (z10) {
                                }
                                throw th;
                            }
                        }
                        int length2 = rVarArr.length;
                        int i13 = 0;
                        boolean z15 = false;
                        boolean z16 = false;
                        while (i13 < length2) {
                            vg.r rVar3 = rVarArr[i13];
                            if (rVar3.c) {
                                vg.q qVar3 = rVar3.e;
                                if (qVar3 == null) {
                                    break;
                                }
                                if (rVar3.h == EGL14.EGL_NO_SURFACE) {
                                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(pVar.j, pVar.m, rVar3.b, new int[]{12344}, i10);
                                    rVar3.h = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                                        if (rVar3.c) {
                                            throw new IllegalStateException("Wallet EGL window failed");
                                        }
                                    }
                                }
                                EGLDisplay eGLDisplay2 = pVar.j;
                                EGLSurface eGLSurface2 = rVar3.h;
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, pVar.k)) {
                                    EGL14.eglSwapInterval(pVar.j, i10);
                                    if (EGL14.eglQuerySurface(pVar.j, rVar3.h, 12375, pVar.i, i10)) {
                                        int i14 = i10;
                                        if (EGL14.eglQuerySurface(pVar.j, rVar3.h, 12374, pVar.i, 1)) {
                                            int i15 = rVar3.f;
                                            int[] iArr = pVar.i;
                                            int i16 = iArr[i14];
                                            if (i15 == i16 && rVar3.g == iArr[1]) {
                                                i7 = i14;
                                                rVar3.f = i16;
                                                rVar3.g = iArr[1];
                                                if (qVar3 != null) {
                                                    if (!rVar3.i) {
                                                        GLES20.glBindFramebuffer(36160, i14);
                                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                        GLES20.glClear(TLObject.FLAG_14);
                                                        if (!EGL14.eglSwapBuffers(pVar.j, rVar3.h) && rVar3.c) {
                                                            throw new IllegalStateException("Wallet EGL swap failed");
                                                        }
                                                        rVar3.i = true;
                                                    }
                                                } else if (i7 != 0 || qVar3.c || rVar3.j || rVar3.i || rVar3.k != pVar.s || rVar3.l != 1.0f) {
                                                    vg.a aVar2 = pVar.n;
                                                    if (qVar3.c) {
                                                        if (qVar3.d) {
                                                            vg.a aVar3 = pVar.o;
                                                            int i17 = pVar.d;
                                                            aVar3.c(i17, i17, qVar3.a, qVar3.b, 0.0f, z15 ? 0.0f : min, 1.0f, 0.0f, true);
                                                            aVar2 = aVar3;
                                                            z15 = true;
                                                        } else {
                                                            if (pVar.p == null) {
                                                                vg.a aVar4 = new vg.a(pVar.a, 2);
                                                                aVar4.C = pVar.e;
                                                                pVar.p = aVar4;
                                                            }
                                                            vg.a aVar5 = pVar.p;
                                                            int i18 = pVar.c;
                                                            aVar5.c(i18, i18, qVar3.a, qVar3.b, 0.0f, z16 ? 0.0f : min, 1.0f, 0.0f, true);
                                                            aVar2 = aVar5;
                                                            z16 = true;
                                                        }
                                                    }
                                                    aVar2.d(1.0f, 0.0f, rVar3.f, rVar3.g);
                                                    if (!EGL14.eglSwapBuffers(pVar.j, rVar3.h) && rVar3.c) {
                                                        throw new IllegalStateException("Wallet EGL swap failed");
                                                    }
                                                    rVar3.i = false;
                                                    rVar3.k = pVar.s;
                                                    rVar3.l = 1.0f;
                                                    rVar3.j = qVar3.c;
                                                    rVar3.d = true;
                                                    i13++;
                                                    z10 = true;
                                                    i10 = 0;
                                                }
                                            }
                                            i7 = 1;
                                            rVar3.f = i16;
                                            rVar3.g = iArr[1];
                                            if (qVar3 != null) {
                                            }
                                        }
                                    }
                                    if (rVar3.c) {
                                        throw new IllegalStateException("Wallet EGL surface size failed");
                                    }
                                    i13++;
                                    z10 = true;
                                    i10 = 0;
                                } else if (rVar3.c) {
                                    throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                }
                            }
                            i13++;
                            z10 = true;
                            i10 = 0;
                        }
                        pVar.h.set(false);
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
                pVar.h.set(false);
                return;
        }
    }
}
