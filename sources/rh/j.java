package rh;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.z5;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Wallet.a6;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.b31;
import org.telegram.ui.hb1;
import org.telegram.ui.mt;
import s4.b0;
import sg.a2;
import sg.c0;
import sg.j0;
import sg.m1;
import sg.q0;
import sg.q1;
import sg.s1;
import sg.w0;
import ug.v;
import ug.y;
import yh.d0;
import yh.e1;
import yh.k1;
import yh.p1;
import yh.q2;
import zh.b8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03aa A[Catch: all -> 0x01e5, TRY_LEAVE, TryCatch #2 {all -> 0x01e5, blocks: (B:246:0x01a6, B:248:0x01ac, B:250:0x01b4, B:253:0x01ca, B:254:0x01c3, B:110:0x01ff, B:114:0x020a, B:116:0x0220, B:120:0x0225, B:121:0x022c, B:124:0x0239, B:128:0x023e, B:129:0x0245, B:136:0x0273, B:142:0x0287, B:144:0x028b, B:146:0x02a4, B:150:0x02a9, B:151:0x02ae, B:152:0x02af, B:155:0x02b7, B:157:0x02bb, B:159:0x02bf, B:161:0x02c3, B:163:0x02c9, B:188:0x03a3, B:190:0x03aa), top: B:55:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03cd  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
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
        tg.q qVar;
        int i11;
        c6 c6Var;
        switch (this.a) {
            case 0:
                ((q) this.b).a();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 2:
                j0 j0Var = ((c0) this.b).c;
                j0Var.n.presentFragment(hb1.d0(j0Var.t1(), true));
                return;
            case 3:
                bk0 bk0Var = ((q0) this.b).y;
                bk0Var.getAnimatedDrawable().N(0, true, false);
                bk0Var.d();
                return;
            case 4:
                ((w0) this.b).b.A();
                return;
            case 5:
                q1 q1Var = (q1) this.b;
                int size = 1073741823 - (1073741823 % q1Var.V2.size());
                b0 b0Var = q1Var.W2;
                q1Var.j3 = size;
                b0Var.h1(size, (q1Var.getMeasuredHeight() - q1Var.getChildAt(0).getMeasuredHeight()) >> 1);
                q1Var.x1(null, false);
                return;
            case 6:
                ((s1) this.b).invalidate();
                return;
            case 7:
                ((a2) this.b).a();
                return;
            case 8:
                ((z5) this.b).z();
                return;
            case 9:
                tg.f fVar = ((tg.d) this.b).d;
                fVar.s = false;
                fVar.v = null;
                Choreographer.getInstance().removeFrameCallback(fVar);
                fVar.F = 0L;
                a6 a6Var = (a6) fVar;
                b6 b6Var = a6Var.L;
                if (b6Var.d == a6Var) {
                    b6.c(b6Var);
                    return;
                }
                return;
            case 10:
                tg.p pVar = (tg.p) this.b;
                tg.r[] rVarArr = pVar.f;
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
                    if (pVar.m == null) {
                        try {
                            pVar.a();
                        } catch (RuntimeException e7) {
                            e = e7;
                            r11 = i12;
                            FileLog.e(e);
                            while (r4 < r0) {
                            }
                            pVar.g.set(false);
                            if (r11 == 0) {
                            }
                            Trace.endSection();
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            i10 = i12;
                            pVar.g.set(false);
                            if (i10 != 0) {
                                Trace.endSection();
                            }
                            throw th;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = rVarArr.length;
                    tg.q qVar2 = null;
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
                                if (uptimeMillis - pVar.p < (z10 ? 16 : 33)) {
                                }
                            }
                            Trace.beginSection(z10 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                            try {
                                float min = pVar.p == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r8) / 1000.0f);
                                pVar.p = uptimeMillis;
                                EGLDisplay eGLDisplay = pVar.i;
                                EGLSurface eGLSurface = pVar.k;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar.j);
                                if (qVar2 != null) {
                                    try {
                                        long j10 = pVar.q;
                                        if (j10 == 0 || uptimeMillis - j10 >= 33) {
                                            tg.a aVar = pVar.m;
                                            int i14 = pVar.c;
                                            aVar.c(i14, i14, qVar2.a, qVar2.b, 0.0f, j10 == 0 ? 0.0f : (uptimeMillis - j10) / 1000.0f, 1.0f, 0.0f, true);
                                            pVar.q = uptimeMillis;
                                            pVar.r++;
                                        }
                                    } catch (RuntimeException e10) {
                                        e = e10;
                                        FileLog.e(e);
                                        for (tg.r rVar : rVarArr) {
                                            rVar.a.post(new j(rVar, 11));
                                        }
                                        pVar.g.set(false);
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
                                    tg.r rVar2 = rVarArr[i15];
                                    if (rVar2.c && ((qVar = rVar2.e) != null || !rVar2.i)) {
                                        if (rVar2.h == EGL14.EGL_NO_SURFACE) {
                                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(pVar.i, pVar.l, rVar2.b, new int[]{12344}, i12);
                                            rVar2.h = eglCreateWindowSurface;
                                            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                                                if (rVar2.c) {
                                                    throw new IllegalStateException("Wallet EGL window failed");
                                                }
                                            }
                                        }
                                        EGLDisplay eGLDisplay2 = pVar.i;
                                        EGLSurface eGLSurface2 = rVar2.h;
                                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, pVar.j)) {
                                            EGL14.eglSwapInterval(pVar.i, i12);
                                            if (EGL14.eglQuerySurface(pVar.i, rVar2.h, 12375, pVar.h, i12) && EGL14.eglQuerySurface(pVar.i, rVar2.h, 12374, pVar.h, r11 == true ? 1 : 0)) {
                                                int i16 = rVar2.f;
                                                int[] iArr = pVar.h;
                                                int i17 = iArr[i12];
                                                int i18 = (i16 == i17 && rVar2.g == iArr[r11 == true ? 1 : 0]) ? i12 : r11 == true ? 1 : 0;
                                                rVar2.f = i17;
                                                rVar2.g = iArr[r11 == true ? 1 : 0];
                                                if (qVar == null) {
                                                    if (!rVar2.i) {
                                                        GLES20.glBindFramebuffer(36160, i12);
                                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                        GLES20.glClear(16384);
                                                        if (!EGL14.eglSwapBuffers(pVar.i, rVar2.h) && rVar2.c) {
                                                            throw new IllegalStateException("Wallet EGL swap failed");
                                                        }
                                                        rVar2.i = r11;
                                                    }
                                                } else if (i18 != 0 || qVar.c || rVar2.j || rVar2.i || rVar2.k != pVar.r || rVar2.l != 1.0f) {
                                                    tg.a aVar2 = pVar.m;
                                                    if (qVar.c) {
                                                        try {
                                                            if (qVar.d) {
                                                                tg.a aVar3 = pVar.n;
                                                                int i19 = pVar.d;
                                                                aVar3.c(i19, i19, qVar.a, qVar.b, 0.0f, z11 ? 0.0f : min, 1.0f, 0.0f, true);
                                                                aVar2 = aVar3;
                                                                z11 = true;
                                                            } else {
                                                                if (pVar.o == null) {
                                                                    tg.a aVar4 = new tg.a(pVar.a, 2);
                                                                    aVar4.C = 2;
                                                                    pVar.o = aVar4;
                                                                }
                                                                tg.a aVar5 = pVar.o;
                                                                int i20 = pVar.c;
                                                                aVar5.c(i20, i20, qVar.a, qVar.b, 0.0f, z12 ? 0.0f : min, 1.0f, 0.0f, true);
                                                                aVar2 = aVar5;
                                                                z12 = true;
                                                            }
                                                        } catch (RuntimeException e11) {
                                                            e = e11;
                                                            r11 = 1;
                                                            FileLog.e(e);
                                                            while (r4 < r0) {
                                                            }
                                                            pVar.g.set(false);
                                                            if (r11 == 0) {
                                                            }
                                                            Trace.endSection();
                                                            return;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            i10 = 1;
                                                            pVar.g.set(false);
                                                            if (i10 != 0) {
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    try {
                                                        aVar2.d(1.0f, 0.0f, rVar2.f, rVar2.g);
                                                    } catch (RuntimeException e12) {
                                                        e = e12;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                    try {
                                                        if (!EGL14.eglSwapBuffers(pVar.i, rVar2.h) && rVar2.c) {
                                                            throw new IllegalStateException("Wallet EGL swap failed");
                                                        }
                                                        rVar2.i = false;
                                                        rVar2.k = pVar.r;
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
                                                        pVar.g.set(false);
                                                        if (r11 == 0) {
                                                        }
                                                        Trace.endSection();
                                                        return;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        i12 = 1;
                                                        i10 = i12;
                                                        pVar.g.set(false);
                                                        if (i10 != 0) {
                                                        }
                                                        throw th;
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
                                pVar.g.set(false);
                            } catch (RuntimeException e14) {
                                e = e14;
                                boolean z13 = r11 == true ? 1 : 0;
                            } catch (Throwable th8) {
                                th = th8;
                                boolean z14 = r11 == true ? 1 : 0;
                                i10 = r11;
                            }
                            Trace.endSection();
                            return;
                        }
                        tg.r rVar3 = rVarArr[i13];
                        tg.q qVar3 = rVar3.e;
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
                pVar.g.set(false);
                return;
            case 11:
                tg.r rVar4 = (tg.r) this.b;
                tg.s sVar = rVar4.a;
                if (sVar.d == rVar4) {
                    sVar.h = false;
                    sVar.a();
                    return;
                }
                return;
            case 12:
                ((tf.b) ((com.google.android.gms.internal.cast.p) this.b).c).a(false);
                return;
            case 13:
                CharSequence charSequence = (CharSequence) this.b;
                zc X = zc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 14:
                ((y) this.b).run(null);
                return;
            case 15:
                ((mt) this.b).run(Collections.EMPTY_LIST);
                return;
            case 16:
                ((v) this.b).run(null);
                return;
            case 17:
                ug.c0 c0Var = ((ug.b0) this.b).r;
                m2 m2Var = c0Var.n;
                i11 = ((e3) c0Var).currentAccount;
                c6Var = ((e3) c0Var).resourcesProvider;
                m1 m1Var = new m1(m2Var, i11, null, null, null, c6Var);
                m1Var.J0 = true;
                m1Var.c0 = true;
                c0Var.n.showDialog(m1Var);
                return;
            case 18:
                ((e3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new b31(19), 220L);
                return;
            case 19:
                ((uh.f) this.b).d0.N(true);
                return;
            case 20:
                ((x2.n) this.b).k();
                return;
            case 21:
                xh.k kVar = (xh.k) this.b;
                kVar.f();
                kVar.e(true);
                return;
            case 22:
                ((yg.b) this.b).f();
                return;
            case 23:
                yh.n nVar = (yh.n) this.b;
                nVar.h0.setTranslationX(nVar.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 24:
                ((d0) this.b).onBackPressed();
                return;
            case 25:
                z61 z61Var = ((p1) this.b).Y;
                if (z61Var != null) {
                    z61Var.N(false);
                    return;
                }
                return;
            case 26:
                ((e1) this.b).c();
                return;
            case 27:
                ((k1) this.b).invalidateSelf();
                return;
            case 28:
                yh.m1 m1Var2 = (yh.m1) this.b;
                b8 b8Var = m1Var2.e;
                if (b8Var != null) {
                    b8Var.d();
                    m1Var2.invalidateSelf();
                    return;
                }
                return;
            default:
                ((q2) this.b).o();
                return;
        }
    }
}
