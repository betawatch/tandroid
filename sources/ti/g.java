package ti;

import a8.fg;
import a8.me;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import bi.td;
import java.util.Collections;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Wallet.k6;
import org.telegram.ui.Wallet.l6;
import org.telegram.ui.u90;
import tg.m1;
import ug.p;
import ug.q;
import ug.r;
import ug.s;
import vg.b0;
import vg.c0;
import vg.v;
import vg.y;
import x2.o;
import zh.d1;
import zh.j1;
import zh.m;
import zh.p1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d3 A[Catch: all -> 0x020c, TRY_LEAVE, TryCatch #6 {all -> 0x020c, blocks: (B:247:0x01cd, B:249:0x01d3, B:251:0x01db, B:254:0x01f1, B:255:0x01ea, B:111:0x0226, B:115:0x0231, B:117:0x0247, B:121:0x024c, B:122:0x0253, B:125:0x0260, B:129:0x0265, B:130:0x026c, B:137:0x029a, B:143:0x02ae, B:145:0x02b2, B:147:0x02cb, B:151:0x02d0, B:152:0x02d5, B:153:0x02d6, B:156:0x02de, B:158:0x02e2, B:160:0x02e6, B:162:0x02ea, B:164:0x02f0, B:189:0x03cc, B:191:0x03d3), top: B:57:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f5  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ?? r11;
        q qVar;
        int i11;
        u6 u6Var;
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                AndroidUtilities.runOnUIThread(new b(cVar.a, cVar.b, 1), 500L);
                return;
            case 1:
                ((me) this.b).A();
                return;
            case 2:
                ug.f fVar = ((ug.d) this.b).d;
                fVar.s = false;
                fVar.v = null;
                Choreographer.getInstance().removeFrameCallback(fVar);
                fVar.F = 0L;
                k6 k6Var = (k6) fVar;
                l6 l6Var = k6Var.L;
                if (l6Var.d == k6Var) {
                    l6.c(l6Var);
                    return;
                }
                return;
            case 3:
                p pVar = (p) this.b;
                r[] rVarArr = pVar.g;
                int i12 = 0;
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (RuntimeException e) {
                    e = e;
                    r11 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    i10 = 0;
                }
                if (rVarArr.length != 0) {
                    if (pVar.n == null) {
                        try {
                            pVar.a();
                        } catch (RuntimeException e10) {
                            e = e10;
                            r11 = i12;
                            FileLog.e(e);
                            while (r4 < r0) {
                            }
                            pVar.h.set(false);
                            if (r11 == 0) {
                            }
                            Trace.endSection();
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            i10 = i12;
                            pVar.h.set(false);
                            if (i10 != 0) {
                            }
                            throw th;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = rVarArr.length;
                    q qVar2 = null;
                    int i13 = 0;
                    char c10 = 0;
                    boolean z10 = false;
                    while (true) {
                        r11 = 1;
                        char c11 = 1;
                        r11 = 1;
                        r11 = 1;
                        r11 = 1;
                        if (i13 >= length) {
                            if (c10 == 0) {
                                if (uptimeMillis - pVar.q < (z10 ? 16 : 33)) {
                                }
                            }
                            Trace.beginSection(z10 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                            try {
                                float min = pVar.q == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r8) / 1000.0f);
                                pVar.q = uptimeMillis;
                                EGLDisplay eGLDisplay = pVar.j;
                                EGLSurface eGLSurface = pVar.l;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar.k);
                                if (qVar2 != null) {
                                    try {
                                        long j10 = pVar.r;
                                        if (j10 == 0 || uptimeMillis - j10 >= 33) {
                                            ug.a aVar = pVar.n;
                                            int i14 = pVar.c;
                                            aVar.c(i14, i14, qVar2.a, qVar2.b, 0.0f, j10 == 0 ? 0.0f : (uptimeMillis - j10) / 1000.0f, 1.0f, 0.0f, true);
                                            pVar.r = uptimeMillis;
                                            pVar.s++;
                                        }
                                    } catch (RuntimeException e11) {
                                        e = e11;
                                        FileLog.e(e);
                                        for (r rVar : rVarArr) {
                                            rVar.a.post(new g(rVar, 4));
                                        }
                                        pVar.h.set(false);
                                        if (r11 == 0) {
                                            return;
                                        }
                                        Trace.endSection();
                                        return;
                                    }
                                }
                                int length2 = rVarArr.length;
                                int i15 = 0;
                                boolean z11 = false;
                                boolean z12 = false;
                                while (i15 < length2) {
                                    r rVar2 = rVarArr[i15];
                                    if (rVar2.c && ((qVar = rVar2.e) != null || !rVar2.i)) {
                                        if (rVar2.h == EGL14.EGL_NO_SURFACE) {
                                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(pVar.j, pVar.m, rVar2.b, new int[]{12344}, i12);
                                            rVar2.h = eglCreateWindowSurface;
                                            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                                                if (rVar2.c) {
                                                    throw new IllegalStateException("Wallet EGL window failed");
                                                }
                                            }
                                        }
                                        EGLDisplay eGLDisplay2 = pVar.j;
                                        EGLSurface eGLSurface2 = rVar2.h;
                                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, pVar.k)) {
                                            EGL14.eglSwapInterval(pVar.j, i12);
                                            if (EGL14.eglQuerySurface(pVar.j, rVar2.h, 12375, pVar.i, i12) && EGL14.eglQuerySurface(pVar.j, rVar2.h, 12374, pVar.i, r11 == true ? 1 : 0)) {
                                                int i16 = rVar2.f;
                                                int[] iArr = pVar.i;
                                                int i17 = iArr[i12];
                                                int i18 = (i16 == i17 && rVar2.g == iArr[r11 == true ? 1 : 0]) ? i12 : r11 == true ? 1 : 0;
                                                rVar2.f = i17;
                                                rVar2.g = iArr[r11 == true ? 1 : 0];
                                                if (qVar == null) {
                                                    if (!rVar2.i) {
                                                        GLES20.glBindFramebuffer(36160, i12);
                                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                        GLES20.glClear(16384);
                                                        if (!EGL14.eglSwapBuffers(pVar.j, rVar2.h) && rVar2.c) {
                                                            throw new IllegalStateException("Wallet EGL swap failed");
                                                        }
                                                        rVar2.i = r11;
                                                    }
                                                } else if (i18 != 0 || qVar.c || rVar2.j || rVar2.i || rVar2.k != pVar.s || rVar2.l != 1.0f) {
                                                    ug.a aVar2 = pVar.n;
                                                    if (qVar.c) {
                                                        try {
                                                            if (qVar.d) {
                                                                ug.a aVar3 = pVar.o;
                                                                int i19 = pVar.d;
                                                                aVar3.c(i19, i19, qVar.a, qVar.b, 0.0f, z11 ? 0.0f : min, 1.0f, 0.0f, true);
                                                                aVar2 = aVar3;
                                                                z11 = true;
                                                            } else {
                                                                if (pVar.p == null) {
                                                                    ug.a aVar4 = new ug.a(pVar.a, 2);
                                                                    aVar4.C = pVar.e;
                                                                    pVar.p = aVar4;
                                                                }
                                                                ug.a aVar5 = pVar.p;
                                                                int i20 = pVar.c;
                                                                aVar5.c(i20, i20, qVar.a, qVar.b, 0.0f, z12 ? 0.0f : min, 1.0f, 0.0f, true);
                                                                aVar2 = aVar5;
                                                                z12 = true;
                                                            }
                                                        } catch (RuntimeException e12) {
                                                            e = e12;
                                                            r11 = 1;
                                                            FileLog.e(e);
                                                            while (r4 < r0) {
                                                            }
                                                            pVar.h.set(false);
                                                            if (r11 == 0) {
                                                            }
                                                            Trace.endSection();
                                                            return;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            i10 = 1;
                                                            pVar.h.set(false);
                                                            if (i10 != 0) {
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    try {
                                                        aVar2.d(1.0f, 0.0f, rVar2.f, rVar2.g);
                                                        try {
                                                            if (!EGL14.eglSwapBuffers(pVar.j, rVar2.h) && rVar2.c) {
                                                                throw new IllegalStateException("Wallet EGL swap failed");
                                                            }
                                                            rVar2.i = false;
                                                            rVar2.k = pVar.s;
                                                            rVar2.l = 1.0f;
                                                            rVar2.j = qVar.c;
                                                            i12 = 1;
                                                            rVar2.d = true;
                                                        } catch (RuntimeException e13) {
                                                            e = e13;
                                                            i12 = 1;
                                                            r11 = i12;
                                                            FileLog.e(e);
                                                            while (r4 < r0) {
                                                            }
                                                            pVar.h.set(false);
                                                            if (r11 == 0) {
                                                            }
                                                            Trace.endSection();
                                                            return;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            i12 = 1;
                                                            i10 = i12;
                                                            pVar.h.set(false);
                                                            if (i10 != 0) {
                                                                Trace.endSection();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (RuntimeException e14) {
                                                        e = e14;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                }
                                            } else {
                                                i12 = r11 == true ? 1 : 0;
                                                if (rVar2.c) {
                                                    throw new IllegalStateException("Wallet EGL surface size failed");
                                                }
                                            }
                                            i15++;
                                            r11 = i12;
                                            i12 = 0;
                                        } else if (rVar2.c) {
                                            throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                        }
                                    }
                                    i12 = r11 == true ? 1 : 0;
                                    i15++;
                                    r11 = i12;
                                    i12 = 0;
                                }
                                pVar.h.set(false);
                            } catch (RuntimeException e15) {
                                e = e15;
                                boolean z13 = r11 == true ? 1 : 0;
                            } catch (Throwable th8) {
                                th = th8;
                                boolean z14 = r11 == true ? 1 : 0;
                                i10 = r11;
                            }
                            Trace.endSection();
                            return;
                        }
                        r rVar3 = rVarArr[i13];
                        q qVar3 = rVar3.e;
                        if (rVar3.c && qVar3 != null) {
                            boolean z15 = qVar3.c;
                            z10 |= z15;
                            if (!z15) {
                                qVar2 = qVar3;
                            }
                        }
                        if (!rVar3.c || rVar3.d || qVar3 == null) {
                            c11 = 0;
                        }
                        i13++;
                        c10 |= c11;
                    }
                }
                pVar.h.set(false);
                return;
            case 4:
                r rVar4 = (r) this.b;
                s sVar = rVar4.a;
                if (sVar.e == rVar4) {
                    sVar.n = false;
                    sVar.a();
                    return;
                }
                return;
            case 5:
                ((uf.b) ((fg) this.b).c).a(false);
                return;
            case 6:
                CharSequence charSequence = (CharSequence) this.b;
                wc Y = wc.Y();
                if (Y != null) {
                    Y.R(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 7:
                ((y) this.b).run(null);
                return;
            case 8:
                ((oy) this.b).run(Collections.EMPTY_LIST);
                return;
            case 9:
                ((v) this.b).run(null);
                return;
            case 10:
                c0 c0Var = ((b0) this.b).r;
                r2 r2Var = c0Var.n;
                i11 = ((k3) c0Var).currentAccount;
                u6Var = ((k3) c0Var).resourcesProvider;
                m1 m1Var = new m1(r2Var, i11, null, null, null, u6Var);
                m1Var.J0 = true;
                m1Var.c0 = true;
                c0Var.n.showDialog(m1Var);
                return;
            case 11:
                ((k3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new u90(25), 220L);
                return;
            case 12:
                ((vh.f) this.b).d0.O(true);
                return;
            case 13:
                n60 n60Var = (n60) ((e3) this.b).b;
                n60Var.p0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = n60Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                FileLog.d(sb2.toString());
                n60Var.t(true);
                n60.l(n60Var);
                return;
            case 14:
                ((o) this.b).k();
                return;
            case 15:
                yh.j jVar = (yh.j) this.b;
                jVar.f();
                jVar.e(true);
                return;
            case 16:
                ((zg.b) this.b).f();
                return;
            case 17:
                m mVar = (m) this.b;
                mVar.h0.setTranslationX(mVar.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 18:
                ((zh.c0) this.b).onBackPressed();
                return;
            case 19:
                j71 j71Var = ((p1) this.b).Y;
                if (j71Var != null) {
                    j71Var.O(false);
                    return;
                }
                return;
            case 20:
                ((d1) this.b).c();
                return;
            case 21:
                ((j1) this.b).invalidateSelf();
                return;
            case 22:
                zh.m1 m1Var2 = (zh.m1) this.b;
                td tdVar = m1Var2.e;
                if (tdVar != null) {
                    tdVar.d();
                    m1Var2.invalidateSelf();
                    return;
                }
                return;
            default:
                ((zh.r2) this.b).p();
                return;
        }
    }
}
