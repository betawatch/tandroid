package tg;

import ai.ce;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ff0;
import sg.l1;
import ug.a0;
import ug.w;
import ug.z;
import yh.d0;
import yh.e1;
import yh.k1;
import yh.m1;
import yh.p1;
import yh.q2;
import zh.x;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03e7 A[Catch: all -> 0x0220, TRY_LEAVE, TryCatch #0 {all -> 0x0220, blocks: (B:266:0x01e1, B:268:0x01e7, B:270:0x01ef, B:273:0x0205, B:274:0x01fe, B:130:0x023a, B:134:0x0245, B:136:0x025b, B:140:0x0260, B:141:0x0267, B:144:0x0274, B:148:0x0279, B:149:0x0280, B:156:0x02ae, B:162:0x02c2, B:164:0x02c6, B:166:0x02df, B:170:0x02e4, B:171:0x02e9, B:172:0x02ea, B:175:0x02f2, B:177:0x02f6, B:179:0x02fa, B:181:0x02fe, B:183:0x0304, B:208:0x03e0, B:210:0x03e7), top: B:75:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0409  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
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
        r rVar;
        int i11;
        d6 d6Var;
        switch (this.a) {
            case 0:
                q qVar = (q) this.b;
                s[] sVarArr = qVar.g;
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
                if (sVarArr.length != 0) {
                    if (qVar.n == null) {
                        try {
                            qVar.a();
                        } catch (RuntimeException e7) {
                            e = e7;
                            r11 = i12;
                            FileLog.e(e);
                            while (r4 < r0) {
                            }
                            qVar.h.set(false);
                            if (r11 == 0) {
                            }
                            Trace.endSection();
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            i10 = i12;
                            qVar.h.set(false);
                            if (i10 != 0) {
                            }
                            throw th;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = sVarArr.length;
                    r rVar2 = null;
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
                                if (uptimeMillis - qVar.q < (z10 ? 16 : 33)) {
                                }
                            }
                            Trace.beginSection(z10 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                            try {
                                float min = qVar.q == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r8) / 1000.0f);
                                qVar.q = uptimeMillis;
                                EGLDisplay eGLDisplay = qVar.j;
                                EGLSurface eGLSurface = qVar.l;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, qVar.k);
                                if (rVar2 != null) {
                                    try {
                                        long j10 = qVar.r;
                                        if (j10 == 0 || uptimeMillis - j10 >= 33) {
                                            a aVar = qVar.n;
                                            int i14 = qVar.c;
                                            aVar.c(i14, i14, rVar2.a, rVar2.b, 0.0f, j10 == 0 ? 0.0f : (uptimeMillis - j10) / 1000.0f, 1.0f, 0.0f, true);
                                            qVar.r = uptimeMillis;
                                            qVar.s++;
                                        }
                                    } catch (RuntimeException e10) {
                                        e = e10;
                                        FileLog.e(e);
                                        for (s sVar : sVarArr) {
                                            sVar.a.post(new p(sVar, 1));
                                        }
                                        qVar.h.set(false);
                                        if (r11 == 0) {
                                            return;
                                        }
                                        Trace.endSection();
                                        return;
                                    }
                                }
                                int length2 = sVarArr.length;
                                int i15 = 0;
                                boolean z11 = false;
                                boolean z12 = false;
                                while (i15 < length2) {
                                    s sVar2 = sVarArr[i15];
                                    if (sVar2.c && ((rVar = sVar2.e) != null || !sVar2.i)) {
                                        if (sVar2.h == EGL14.EGL_NO_SURFACE) {
                                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(qVar.j, qVar.m, sVar2.b, new int[]{12344}, i12);
                                            sVar2.h = eglCreateWindowSurface;
                                            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                                                if (sVar2.c) {
                                                    throw new IllegalStateException("Wallet EGL window failed");
                                                }
                                            }
                                        }
                                        EGLDisplay eGLDisplay2 = qVar.j;
                                        EGLSurface eGLSurface2 = sVar2.h;
                                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, qVar.k)) {
                                            EGL14.eglSwapInterval(qVar.j, i12);
                                            if (EGL14.eglQuerySurface(qVar.j, sVar2.h, 12375, qVar.i, i12) && EGL14.eglQuerySurface(qVar.j, sVar2.h, 12374, qVar.i, r11 == true ? 1 : 0)) {
                                                int i16 = sVar2.f;
                                                int[] iArr = qVar.i;
                                                int i17 = iArr[i12];
                                                int i18 = (i16 == i17 && sVar2.g == iArr[r11 == true ? 1 : 0]) ? i12 : r11 == true ? 1 : 0;
                                                sVar2.f = i17;
                                                sVar2.g = iArr[r11 == true ? 1 : 0];
                                                if (rVar == null) {
                                                    if (!sVar2.i) {
                                                        GLES20.glBindFramebuffer(36160, i12);
                                                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                        GLES20.glClear(16384);
                                                        if (!EGL14.eglSwapBuffers(qVar.j, sVar2.h) && sVar2.c) {
                                                            throw new IllegalStateException("Wallet EGL swap failed");
                                                        }
                                                        sVar2.i = r11;
                                                    }
                                                } else if (i18 != 0 || rVar.c || sVar2.j || sVar2.i || sVar2.k != qVar.s || sVar2.l != 1.0f) {
                                                    a aVar2 = qVar.n;
                                                    if (rVar.c) {
                                                        try {
                                                            if (rVar.d) {
                                                                a aVar3 = qVar.o;
                                                                int i19 = qVar.d;
                                                                aVar3.c(i19, i19, rVar.a, rVar.b, 0.0f, z11 ? 0.0f : min, 1.0f, 0.0f, true);
                                                                aVar2 = aVar3;
                                                                z11 = true;
                                                            } else {
                                                                if (qVar.p == null) {
                                                                    a aVar4 = new a(qVar.a, 2);
                                                                    aVar4.C = qVar.e;
                                                                    qVar.p = aVar4;
                                                                }
                                                                a aVar5 = qVar.p;
                                                                int i20 = qVar.c;
                                                                aVar5.c(i20, i20, rVar.a, rVar.b, 0.0f, z12 ? 0.0f : min, 1.0f, 0.0f, true);
                                                                aVar2 = aVar5;
                                                                z12 = true;
                                                            }
                                                        } catch (RuntimeException e11) {
                                                            e = e11;
                                                            r11 = 1;
                                                            FileLog.e(e);
                                                            while (r4 < r0) {
                                                            }
                                                            qVar.h.set(false);
                                                            if (r11 == 0) {
                                                            }
                                                            Trace.endSection();
                                                            return;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            i10 = 1;
                                                            qVar.h.set(false);
                                                            if (i10 != 0) {
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    try {
                                                        aVar2.d(1.0f, 0.0f, sVar2.f, sVar2.g);
                                                        try {
                                                            if (!EGL14.eglSwapBuffers(qVar.j, sVar2.h) && sVar2.c) {
                                                                throw new IllegalStateException("Wallet EGL swap failed");
                                                            }
                                                            sVar2.i = false;
                                                            sVar2.k = qVar.s;
                                                            sVar2.l = 1.0f;
                                                            sVar2.j = rVar.c;
                                                            i12 = 1;
                                                            sVar2.d = true;
                                                        } catch (RuntimeException e12) {
                                                            e = e12;
                                                            i12 = 1;
                                                            r11 = i12;
                                                            FileLog.e(e);
                                                            while (r4 < r0) {
                                                            }
                                                            qVar.h.set(false);
                                                            if (r11 == 0) {
                                                            }
                                                            Trace.endSection();
                                                            return;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            i12 = 1;
                                                            i10 = i12;
                                                            qVar.h.set(false);
                                                            if (i10 != 0) {
                                                                Trace.endSection();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (RuntimeException e13) {
                                                        e = e13;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                }
                                            } else {
                                                i12 = r11 == true ? 1 : 0;
                                                if (sVar2.c) {
                                                    throw new IllegalStateException("Wallet EGL surface size failed");
                                                }
                                            }
                                            i15++;
                                            r11 = i12;
                                            i12 = 0;
                                        } else if (sVar2.c) {
                                            throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                        }
                                    }
                                    i12 = r11 == true ? 1 : 0;
                                    i15++;
                                    r11 = i12;
                                    i12 = 0;
                                }
                                qVar.h.set(false);
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
                        s sVar3 = sVarArr[i13];
                        r rVar3 = sVar3.e;
                        if (sVar3.c && rVar3 != null) {
                            boolean z15 = rVar3.c;
                            z10 |= z15;
                            if (!z15) {
                                rVar2 = rVar3;
                            }
                        }
                        if (!sVar3.c || sVar3.d || rVar3 == null) {
                            c11 = 0;
                        }
                        i13++;
                        c10 |= c11;
                    }
                }
                qVar.h.set(false);
                return;
            case 1:
                s sVar4 = (s) this.b;
                t tVar = sVar4.a;
                if (tVar.e == sVar4) {
                    tVar.n = false;
                    tVar.a();
                    return;
                }
                return;
            case 2:
                ((tf.b) ((com.google.android.gms.internal.cast.p) this.b).c).a(false);
                return;
            case 3:
                CharSequence charSequence = (CharSequence) this.b;
                xc X = xc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 4:
                ((w) this.b).run(null);
                return;
            case 5:
                ((qy) this.b).run(Collections.EMPTY_LIST);
                return;
            case 6:
                ((ug.t) this.b).run(null);
                return;
            case 7:
                a0 a0Var = ((z) this.b).r;
                n2 n2Var = a0Var.n;
                i11 = ((f3) a0Var).currentAccount;
                d6Var = ((f3) a0Var).resourcesProvider;
                l1 l1Var = new l1(n2Var, i11, null, null, null, d6Var);
                l1Var.J0 = true;
                l1Var.c0 = true;
                a0Var.n.showDialog(l1Var);
                return;
            case 8:
                ((f3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new ff0(21), 220L);
                return;
            case 9:
                ((uh.f) this.b).d0.N(true);
                return;
            case 10:
                ((x2.n) this.b).k();
                return;
            case 11:
                xh.j jVar = (xh.j) this.b;
                jVar.f();
                jVar.e(true);
                return;
            case 12:
                ((yg.b) this.b).f();
                return;
            case 13:
                yh.n nVar = (yh.n) this.b;
                nVar.h0.setTranslationX(nVar.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 14:
                ((d0) this.b).onBackPressed();
                return;
            case 15:
                s61 s61Var = ((p1) this.b).Y;
                if (s61Var != null) {
                    s61Var.N(false);
                    return;
                }
                return;
            case 16:
                ((e1) this.b).c();
                return;
            case 17:
                ((k1) this.b).invalidateSelf();
                return;
            case 18:
                m1 m1Var = (m1) this.b;
                ce ceVar = m1Var.e;
                if (ceVar != null) {
                    ceVar.d();
                    m1Var.invalidateSelf();
                    return;
                }
                return;
            case 19:
                ((q2) this.b).o();
                return;
            case 20:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 21:
                zf.n nVar2 = (zf.n) this.b;
                long j11 = nVar2.b;
                if (j11 > 0) {
                    long j12 = j11 - 1;
                    nVar2.b = j12;
                    nVar2.a.i(j12);
                }
                if (nVar2.b <= 0) {
                    nVar2.c = false;
                }
                if (nVar2.c) {
                    AndroidUtilities.runOnUIThread(nVar2.d, 1000L);
                    return;
                }
                return;
            default:
                ((x) this.b).e();
                return;
        }
    }
}
