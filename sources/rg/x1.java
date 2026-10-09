package rg;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import ci.u5;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.ft;
import org.telegram.ui.t21;
import xh.s2;
import yh.b8;
import yh.f7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x042f A[Catch: all -> 0x026a, TRY_LEAVE, TryCatch #4 {all -> 0x026a, blocks: (B:282:0x022b, B:284:0x0231, B:286:0x0239, B:289:0x024f, B:290:0x0248, B:146:0x0284, B:150:0x028f, B:152:0x02a5, B:156:0x02aa, B:157:0x02b1, B:160:0x02be, B:164:0x02c3, B:165:0x02ca, B:172:0x02f8, B:178:0x030c, B:180:0x0310, B:182:0x0329, B:186:0x032e, B:187:0x0333, B:188:0x0334, B:191:0x033c, B:193:0x0340, B:195:0x0344, B:197:0x0348, B:199:0x034e, B:224:0x0428, B:226:0x042f), top: B:92:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0451  */
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
        sg.q qVar;
        int i11;
        e6 e6Var;
        switch (this.a) {
            case 0:
                ((a2) this.b).a();
                return;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 2:
                ((u5) this.b).B();
                return;
            case 3:
                sg.f fVar = ((sg.d) this.b).d;
                fVar.s = false;
                fVar.v = null;
                Choreographer.getInstance().removeFrameCallback(fVar);
                fVar.F = 0L;
                b6 b6Var = (b6) fVar;
                c6 c6Var = b6Var.L;
                if (c6Var.d == b6Var) {
                    c6.c(c6Var);
                    return;
                }
                return;
            case 4:
                sg.p pVar = (sg.p) this.b;
                sg.r[] rVarArr = pVar.f;
                int i12 = 0;
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (RuntimeException e7) {
                    e = e7;
                    r11 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    i10 = 0;
                }
                if (rVarArr.length != 0) {
                    if (pVar.m == null) {
                        try {
                            pVar.a();
                        } catch (RuntimeException e10) {
                            e = e10;
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
                            }
                            throw th;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = rVarArr.length;
                    sg.q qVar2 = null;
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
                                        long j3 = pVar.q;
                                        if (j3 == 0 || uptimeMillis - j3 >= 33) {
                                            sg.a aVar = pVar.m;
                                            int i14 = pVar.c;
                                            aVar.c(i14, i14, qVar2.a, qVar2.b, 0.0f, j3 == 0 ? 0.0f : (uptimeMillis - j3) / 1000.0f, 1.0f, 0.0f, true);
                                            pVar.q = uptimeMillis;
                                            pVar.r++;
                                        }
                                    } catch (RuntimeException e11) {
                                        e = e11;
                                        FileLog.e(e);
                                        for (sg.r rVar : rVarArr) {
                                            rVar.a.post(new x1(rVar, 5));
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
                                    sg.r rVar2 = rVarArr[i15];
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
                                                    sg.a aVar2 = pVar.m;
                                                    if (qVar.c) {
                                                        try {
                                                            if (qVar.d) {
                                                                sg.a aVar3 = pVar.n;
                                                                int i19 = pVar.d;
                                                                aVar3.c(i19, i19, qVar.a, qVar.b, 0.0f, z11 ? 0.0f : min, 1.0f, 0.0f, true);
                                                                aVar2 = aVar3;
                                                                z11 = true;
                                                            } else {
                                                                if (pVar.o == null) {
                                                                    sg.a aVar4 = new sg.a(pVar.a, 2);
                                                                    aVar4.C = 2;
                                                                    pVar.o = aVar4;
                                                                }
                                                                sg.a aVar5 = pVar.o;
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
                                                                Trace.endSection();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    try {
                                                        aVar2.d(1.0f, 0.0f, rVar2.f, rVar2.g);
                                                    } catch (RuntimeException e13) {
                                                        e = e13;
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
                                                    } catch (RuntimeException e14) {
                                                        e = e14;
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
                        sg.r rVar3 = rVarArr[i13];
                        sg.q qVar3 = rVar3.e;
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
            case 5:
                sg.r rVar4 = (sg.r) this.b;
                sg.s sVar = rVar4.a;
                if (sVar.d == rVar4) {
                    sVar.h = false;
                    sVar.a();
                    return;
                }
                return;
            case 6:
                ((sf.b) ((com.google.android.gms.internal.cast.p) this.b).c).a(false);
                return;
            case 7:
                CharSequence charSequence = (CharSequence) this.b;
                ad X = ad.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 8:
                ((tg.y) this.b).run(null);
                return;
            case 9:
                ((ft) this.b).run(Collections.EMPTY_LIST);
                return;
            case 10:
                ((tg.v) this.b).run(null);
                return;
            case 11:
                tg.c0 c0Var = ((tg.b0) this.b).r;
                n2 n2Var = c0Var.n;
                i11 = ((f3) c0Var).currentAccount;
                e6Var = ((f3) c0Var).resourcesProvider;
                l1 l1Var = new l1(n2Var, i11, null, null, null, e6Var);
                l1Var.J0 = true;
                l1Var.c0 = true;
                c0Var.n.showDialog(l1Var);
                return;
            case 12:
                ((f3) this.b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new t21(18), 220L);
                return;
            case 13:
                ((th.f) this.b).d0.N(true);
                return;
            case 14:
                wh.k kVar = (wh.k) this.b;
                kVar.f();
                kVar.e(true);
                return;
            case 15:
                ((xg.b) this.b).f();
                return;
            case 16:
                xh.o oVar = (xh.o) this.b;
                oVar.h0.setTranslationX(oVar.g0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 17:
                ((xh.e0) this.b).onBackPressed();
                return;
            case 18:
                c71 c71Var = ((xh.r1) this.b).Y;
                if (c71Var != null) {
                    c71Var.N(false);
                    return;
                }
                return;
            case 19:
                ((xh.g1) this.b).c();
                return;
            case 20:
                ((xh.m1) this.b).invalidateSelf();
                return;
            case 21:
                xh.o1 o1Var = (xh.o1) this.b;
                b8 b8Var = o1Var.e;
                if (b8Var != null) {
                    b8Var.d();
                    o1Var.invalidateSelf();
                    return;
                }
                return;
            case 22:
                ((s2) this.b).o();
                return;
            case 23:
                try {
                    ((Bitmap) this.b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 24:
                yf.n nVar = (yf.n) this.b;
                long j10 = nVar.b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    nVar.b = j11;
                    nVar.a.e(j11);
                }
                if (nVar.b <= 0) {
                    nVar.c = false;
                }
                if (nVar.c) {
                    AndroidUtilities.runOnUIThread(nVar.d, 1000L);
                    return;
                }
                return;
            case 25:
                yh.a aVar6 = (yh.a) this.b;
                aVar6.getClass();
                new f7(aVar6.getContext(), aVar6.b).show();
                return;
            case 26:
                yh.f fVar2 = (yh.f) this.b;
                fVar2.getClass();
                try {
                    qm0 currentListView = fVar2.x0.F.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 27:
                new hx0(((yh.s) this.b).getContext()).show();
                return;
            case 28:
                AndroidUtilities.showKeyboard(((yh.y) this.b).d0);
                return;
            default:
                AndroidUtilities.showKeyboard(((yh.c0) this.b).h);
                return;
        }
    }
}
