package ug;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.od;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Wallet.m7;
import org.telegram.ui.Wallet.n7;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03af A[Catch: all -> 0x01f8, TRY_LEAVE, TryCatch #5 {all -> 0x01f8, blocks: (B:233:0x01b9, B:235:0x01bf, B:237:0x01c7, B:240:0x01dd, B:241:0x01d6, B:139:0x0212, B:143:0x021d, B:145:0x0233, B:149:0x0238, B:150:0x023f, B:153:0x024c, B:157:0x0251, B:158:0x0258, B:165:0x0285, B:171:0x0299, B:173:0x029d, B:175:0x02b6, B:179:0x02bb, B:180:0x02c0, B:181:0x02c1, B:184:0x02c9, B:186:0x02cd, B:188:0x02d1, B:190:0x02d5, B:192:0x02db, B:103:0x03a8, B:105:0x03af), top: B:66:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d1  */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        vg.p pVar;
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                ((x1) this.b).a();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().f();
                    return;
                }
                return;
            case 2:
                vg.e eVar = ((vg.d) this.b).d;
                eVar.s = false;
                eVar.w = null;
                Choreographer.getInstance().removeFrameCallback(eVar);
                eVar.G = 0L;
                m7 m7Var = (m7) eVar;
                n7 n7Var = m7Var.M;
                if (n7Var.d == m7Var) {
                    n7.c(n7Var);
                    return;
                }
                return;
            case 3:
                vg.o oVar = (vg.o) this.b;
                vg.q[] qVarArr = oVar.g;
                boolean z12 = true;
                ?? r42 = 1;
                boolean z13 = true;
                int i7 = 0;
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    z10 = false;
                } catch (Throwable th3) {
                    th = th3;
                    z12 = false;
                }
                if (qVarArr.length != 0) {
                    if (oVar.n == null) {
                        try {
                            oVar.a();
                        } catch (RuntimeException e11) {
                            e = e11;
                            z11 = true;
                            z13 = false;
                            a8.g(e, z11);
                            while (r5 < r0) {
                            }
                            oVar.h.set(false);
                            if (!z13) {
                            }
                            Trace.endSection();
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            z12 = false;
                            oVar.h.set(false);
                            if (z12) {
                                Trace.endSection();
                            }
                            throw th;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = qVarArr.length;
                    vg.p pVar2 = null;
                    int i10 = 0;
                    boolean z14 = false;
                    boolean z15 = false;
                    while (i10 < length) {
                        vg.q qVar = qVarArr[i10];
                        vg.p pVar3 = qVar.e;
                        if (qVar.c && pVar3 != null) {
                            boolean z16 = pVar3.c;
                            z15 |= z16;
                            if (!z16) {
                                pVar2 = pVar3;
                            }
                        }
                        i10++;
                        z14 |= (!qVar.c || qVar.d || pVar3 == null) ? false : true;
                    }
                    if (!z14) {
                        if (uptimeMillis - oVar.q < (z15 ? 16 : 33)) {
                        }
                    }
                    Trace.beginSection(z15 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                    try {
                        float min = oVar.q == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r9) / 1000.0f);
                        oVar.q = uptimeMillis;
                        EGLDisplay eGLDisplay = oVar.j;
                        EGLSurface eGLSurface = oVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, oVar.k);
                        if (pVar2 != null) {
                            try {
                                long j3 = oVar.r;
                                if (j3 == 0 || uptimeMillis - j3 >= 33) {
                                    vg.a aVar = oVar.n;
                                    int i11 = oVar.c;
                                    aVar.c(i11, i11, pVar2.a, pVar2.b, 0.0f, j3 == 0 ? 0.0f : (uptimeMillis - j3) / 1000.0f, 1.0f, 0.0f, true);
                                    oVar.r = uptimeMillis;
                                    oVar.s++;
                                }
                            } catch (RuntimeException e12) {
                                e = e12;
                                z11 = true;
                                a8.g(e, z11);
                                for (vg.q qVar2 : qVarArr) {
                                    qVar2.a.post(new u1(qVar2, 4));
                                }
                                oVar.h.set(false);
                                if (!z13) {
                                    return;
                                }
                                Trace.endSection();
                                return;
                            }
                        }
                        int length2 = qVarArr.length;
                        int i12 = 0;
                        boolean z17 = false;
                        boolean z18 = false;
                        while (i12 < length2) {
                            vg.q qVar3 = qVarArr[i12];
                            if (qVar3.c && ((pVar = qVar3.e) != null || !qVar3.i)) {
                                if (qVar3.h == EGL14.EGL_NO_SURFACE) {
                                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(oVar.j, oVar.m, qVar3.b, new int[]{12344}, i7);
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
                                    EGL14.eglSwapInterval(oVar.j, i7);
                                    if (EGL14.eglQuerySurface(oVar.j, qVar3.h, 12375, oVar.i, i7) && EGL14.eglQuerySurface(oVar.j, qVar3.h, 12374, oVar.i, r42)) {
                                        int i13 = qVar3.f;
                                        int[] iArr = oVar.i;
                                        int i14 = iArr[i7];
                                        int i15 = (i13 == i14 && qVar3.g == iArr[r42]) ? i7 : r42;
                                        qVar3.f = i14;
                                        qVar3.g = iArr[r42];
                                        if (pVar == null) {
                                            if (!qVar3.i) {
                                                GLES20.glBindFramebuffer(36160, i7);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glClear(TLObject.FLAG_14);
                                                if (!EGL14.eglSwapBuffers(oVar.j, qVar3.h) && qVar3.c) {
                                                    throw new IllegalStateException("Wallet EGL swap failed");
                                                }
                                                qVar3.i = r42;
                                            }
                                        } else if (i15 != 0 || pVar.c || qVar3.j || qVar3.i || qVar3.k != oVar.s || qVar3.l != 1.0f) {
                                            vg.a aVar2 = oVar.n;
                                            if (pVar.c) {
                                                if (pVar.d) {
                                                    vg.a aVar3 = oVar.o;
                                                    int i16 = oVar.d;
                                                    aVar3.c(i16, i16, pVar.a, pVar.b, 0.0f, z17 ? 0.0f : min, 1.0f, 0.0f, true);
                                                    aVar2 = aVar3;
                                                    z17 = true;
                                                } else {
                                                    if (oVar.p == null) {
                                                        vg.a aVar4 = new vg.a(oVar.a, 2);
                                                        aVar4.C = oVar.e;
                                                        oVar.p = aVar4;
                                                    }
                                                    vg.a aVar5 = oVar.p;
                                                    int i17 = oVar.c;
                                                    aVar5.c(i17, i17, pVar.a, pVar.b, 0.0f, z18 ? 0.0f : min, 1.0f, 0.0f, true);
                                                    aVar2 = aVar5;
                                                    z18 = true;
                                                }
                                            }
                                            aVar2.d(1.0f, 0.0f, qVar3.f, qVar3.g);
                                            if (!EGL14.eglSwapBuffers(oVar.j, qVar3.h) && qVar3.c) {
                                                throw new IllegalStateException("Wallet EGL swap failed");
                                            }
                                            qVar3.i = false;
                                            qVar3.k = oVar.s;
                                            qVar3.l = 1.0f;
                                            qVar3.j = pVar.c;
                                            qVar3.d = true;
                                        }
                                    } else if (qVar3.c) {
                                        throw new IllegalStateException("Wallet EGL surface size failed");
                                    }
                                    i12++;
                                    r42 = 1;
                                    i7 = 0;
                                } else if (qVar3.c) {
                                    throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                }
                            }
                            i12++;
                            r42 = 1;
                            i7 = 0;
                        }
                        oVar.h.set(false);
                    } catch (RuntimeException e13) {
                        e = e13;
                        z10 = true;
                        z11 = true;
                        z13 = z10;
                        a8.g(e, z11);
                        while (r5 < r0) {
                        }
                        oVar.h.set(false);
                        if (!z13) {
                        }
                        Trace.endSection();
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        z12 = true;
                        oVar.h.set(false);
                        if (z12) {
                        }
                        throw th;
                    }
                    Trace.endSection();
                    return;
                }
                oVar.h.set(false);
                return;
            case 4:
                vg.q qVar4 = (vg.q) this.b;
                vg.r rVar = qVar4.a;
                if (rVar.e == qVar4) {
                    rVar.n = false;
                    rVar.a();
                    return;
                }
                return;
            case 5:
                ((vh.g) this.b).Z1.O(true);
                return;
            case 6:
                ((wg.x) this.b).a(null);
                return;
            case 7:
                ((ph) this.b).a(Collections.EMPTY_LIST);
                return;
            case 8:
                ((wg.u) this.b).a(null);
                return;
            case 9:
                wg.a0 a0Var = (wg.a0) this.b;
                a0Var.getClass();
                wg.b0 b0Var = a0Var.r;
                h1 h1Var = new h1(b0Var.s1, b0Var.a, null, null, null, b0Var.J0);
                h1Var.F2 = true;
                h1Var.Y1 = true;
                b0Var.s1.showDialog(h1Var);
                return;
            case 10:
                ((FrameLayout) this.b).invalidate();
                return;
            case 11:
                wi.h hVar = (wi.h) ((og.b) this.b).b;
                hVar.h.invalidate();
                hVar.i.requestLayout();
                return;
            case 12:
                l2.j jVar = (l2.j) this.b;
                ArrayList arrayList = (ArrayList) jVar.c;
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    wi.n nVar = (wi.n) arrayList.get(i18);
                    wi.h hVar2 = nVar.e;
                    if (hVar2 != null) {
                        if (nVar.c == 1 && hVar2.g && !hVar2.K) {
                            if ((hVar2.b.f0() && od.a(hVar2.c)) != hVar2.f) {
                                hVar2.l();
                                hVar2.a();
                            }
                        }
                    }
                }
                jVar.f();
                return;
            case 13:
                ((wi.l) this.b).v1();
                return;
            case 14:
                wi.n nVar2 = (wi.n) this.b;
                if (nVar2.c == 1) {
                    nVar2.a.P1();
                    return;
                }
                return;
            case 15:
                xi.c cVar = (xi.c) this.b;
                org.telegram.messenger.g0.h3(new xi.b(cVar.a, cVar.b, 1), 500L);
                return;
            case 16:
                zh.k kVar = (zh.k) this.b;
                kVar.f();
                kVar.e(true);
                return;
            default:
                y40 y40Var = (y40) ((aa) this.b).b;
                y40Var.r0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = y40Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                a8.b(sb2.toString());
                y40Var.w(true);
                y40.n(y40Var);
                return;
        }
    }
}
