package org.telegram.ui.web;

import a8.ma;
import a8.xa;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.StrictMode;
import android.text.SpannableString;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import di.p9;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.a8;
import org.telegram.messenger.bf;
import org.telegram.messenger.bz;
import org.telegram.messenger.mp;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m80;
import tg.f2;
import tg.i2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.b;
        t1 t1Var = (t1) this.c;
        cVar.c.w1();
        u2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            t1Var.run();
        }
    }

    private final void b() {
        ua.a aVar;
        u9.o oVar = (u9.o) this.b;
        ua.b bVar = (ua.b) this.c;
        if (oVar.b != u9.o.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (oVar) {
            aVar = oVar.a;
            oVar.a = null;
            oVar.b = bVar;
        }
        aVar.b(bVar);
    }

    private final void c() {
        u9.n nVar = (u9.n) this.b;
        ua.b bVar = (ua.b) this.c;
        synchronized (nVar) {
            try {
                if (nVar.b == null) {
                    nVar.a.add(bVar);
                } else {
                    nVar.b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ai.i iVar;
        p4.n1 n1Var;
        j6.k kVar;
        j6.k kVar2;
        int i7;
        int i10 = 28;
        Object obj = null;
        int i11 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i12 = u1Var.a;
                u1Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    mp.u1(i12).f4(tL_messages_webPage.users, false);
                    mp.u1(i12).Z3(tL_messages_webPage.chats, false);
                    u1Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            u1Var.h = tL_webPage;
                        }
                    }
                    u1Var.h = null;
                }
                TLRPC.WebPage webPage = u1Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    u1Var.h = null;
                }
                if (!bz.w0 && u1Var.h != null && (iVar = u1Var.l) != null) {
                    iVar.run();
                }
                u1Var.c();
                return;
            case 1:
                ((u1) this.b).m.remove((org.telegram.ui.Wallet.r) this.c);
                return;
            case 2:
                p4.d0 d0Var = (p4.d0) this.b;
                Runnable runnable = (Runnable) this.c;
                d0Var.getClass();
                runnable.run();
                return;
            case 3:
                p4.d0 d0Var2 = (p4.d0) this.b;
                p4.h1 h1Var = (p4.h1) this.c;
                p4.n0 n0Var = d0Var2.h;
                d0Var2.t = h1Var;
                bf bfVar = new bf(d0Var2, h1Var);
                h1Var.J0(bfVar);
                d0Var2.u = bfVar;
                try {
                    n0Var.j.p(0, h1Var);
                } catch (RemoteException e10) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                }
                ((q4.l) n0Var.n.b).a.setActive(true);
                d0Var2.s = new p4.f1(h1Var.X(), 0, h1Var.R0(), h1Var.h(), h1Var.h(), 0, h1Var.l(), h1Var.m(), h1Var.E0(), h1Var.D(), h1Var.T0(), 0, h1Var.q0(18) ? h1Var.l0() : e2.o0.L, h1Var.q0(22) ? h1Var.G() : 1.0f, 1.0f, h1Var.q0(21) ? h1Var.I() : e2.e.i, 0, h1Var.q0(28) ? h1Var.m0() : g2.c.d, h1Var.L(), h1Var.q0(23) ? h1Var.o() : 0, h1Var.q0(23) && h1Var.A0(), h1Var.v(), 1, h1Var.x0(), h1Var.i(), h1Var.j(), h1Var.g(), h1Var.U0(), h1Var.P0(), h1Var.a0(), h1Var.A(), h1Var.q0(30) ? h1Var.k0() : e2.s1.b, h1Var.F0());
                d0Var2.f(h1Var.u());
                return;
            case 4:
                ((c0.i) this.c).a(Boolean.valueOf(((p4.d0) this.b).o()));
                return;
            case 5:
                m9.w wVar = (m9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    n1Var = (p4.n1) wVar.a;
                    ma.k(n1Var, "SessionResult must not be null");
                } catch (InterruptedException e11) {
                    e = e11;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    n1Var = new p4.n1(-1);
                } catch (CancellationException e12) {
                    h2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e12);
                    n1Var = new p4.n1(1);
                } catch (ExecutionException e13) {
                    e = e13;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    n1Var = new p4.n1(-1);
                }
                resultReceiver.send(n1Var.a, n1Var.b);
                return;
            case 6:
                p4.d1 d1Var = (p4.d1) this.b;
                p4.l lVar = (p4.l) this.c;
                ab.c0 c0Var = d1Var.b;
                p4.v u10 = c0Var.u(lVar.asBinder());
                if (u10 != null) {
                    c0Var.K(u10);
                    return;
                }
                return;
            case 7:
                ((p4.d1) this.b).b.m((p4.v) this.c);
                return;
            case 8:
                q2.d dVar = (q2.d) this.b;
                e2.u uVar = (e2.u) this.c;
                q2.e eVar = dVar.d;
                if (eVar.F == 0 || dVar.c) {
                    return;
                }
                Looper looper = eVar.J;
                looper.getClass();
                dVar.b = eVar.b(looper, dVar.a, uVar, false);
                eVar.y.add(dVar);
                return;
            case 9:
                ((p9) this.b).a((SpannableString) this.c);
                return;
            case 10:
                qi.p pVar = (qi.p) this.b;
                qi.n nVar = (qi.n) this.c;
                synchronized (pVar.a) {
                    try {
                        if (pVar.s) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) pVar.n.get(nVar);
                        if (arrayList != null) {
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj2 = arrayList.get(i13);
                                i13++;
                                if (((qi.o) obj2).a != null) {
                                    qi.l lVar2 = (qi.l) pVar.h.get(nVar);
                                    if (lVar2 != null) {
                                        kVar2 = lVar2.a;
                                    } else {
                                        int i14 = 27;
                                        if (pVar.a()) {
                                            try {
                                                com.google.android.gms.internal.play_billing.s0 c10 = pVar.w.a.c(nVar.a, nVar.b);
                                                c10.b();
                                                kVar = new j6.k(c10, obj, objArr2 == true ? 1 : 0, i14);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e14) {
                                                if (pVar.c != null) {
                                                    try {
                                                        a8.g(e14, true);
                                                    } catch (LinkageError | RuntimeException unused) {
                                                    }
                                                }
                                                kVar = new j6.k(obj, e14, objArr == true ? 1 : 0, i14);
                                            }
                                            synchronized (pVar.a) {
                                                try {
                                                    if (pVar.s) {
                                                        return;
                                                    }
                                                    if (lVar2 == null && ((Throwable) kVar.c) == null) {
                                                        pVar.c(nVar, kVar);
                                                    }
                                                    ArrayList arrayList2 = (ArrayList) pVar.n.remove(nVar);
                                                    if (arrayList2 == null) {
                                                        return;
                                                    }
                                                    int size2 = arrayList2.size();
                                                    while (i11 < size2) {
                                                        Object obj3 = arrayList2.get(i11);
                                                        i11++;
                                                        qi.o oVar = (qi.o) obj3;
                                                        try {
                                                            qi.m mVar = oVar.a;
                                                            oVar.a = null;
                                                            if (mVar != null) {
                                                                mVar.d(kVar);
                                                            }
                                                        } catch (LinkageError | RuntimeException e15) {
                                                            if (pVar.c != null) {
                                                                try {
                                                                    a8.g(e15, true);
                                                                } catch (LinkageError | RuntimeException unused2) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                } finally {
                                                }
                                            }
                                        }
                                        kVar2 = new j6.k(obj, pVar.x, objArr3 == true ? 1 : 0, i14);
                                    }
                                    kVar = kVar2;
                                    synchronized (pVar.a) {
                                    }
                                }
                            }
                        }
                        pVar.n.remove(nVar);
                        return;
                    } finally {
                    }
                }
            case 11:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 12:
                r2.p pVar2 = (r2.p) this.b;
                r2.i iVar2 = (r2.i) this.c;
                aa aaVar = pVar2.c;
                Uri uri = iVar2.y;
                s2.c cVar = (s2.c) ((r2.j) aaVar.b).b.d.get(uri);
                if (cVar != null) {
                    s2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 13:
                s2.b bVar = (s2.b) this.b;
                Uri uri2 = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri2);
                return;
            case 14:
                sg.h0 h0Var = (sg.h0) this.b;
                sg.o0 o0Var = (sg.o0) this.c;
                h0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) h0Var.h(h0Var.f(), true, false, false).c;
                RectF f10 = h0Var.f();
                Object obj4 = h0Var.a.b;
                h0Var.w = new xa(byteBuffer, 0, f10);
                h0Var.a(false);
                o0Var.run();
                return;
            case 15:
                sg.t0 t0Var = (sg.t0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                sg.r0 r0Var = t0Var.d;
                if (r0Var == null || !r0Var.f) {
                    return;
                }
                sg.r0.a(r0Var);
                runnable2.run();
                return;
            case 16:
                tg.l0 l0Var = (tg.l0) this.b;
                View view = (View) this.c;
                l0Var.getClass();
                if (view instanceof tg.n) {
                    tg.n nVar2 = (tg.n) view;
                    nVar2.m();
                    l0Var.u0(nVar2, true);
                    return;
                }
                return;
            case 17:
                ((tg.s1) this.b).s((Bitmap) this.c);
                return;
            case 18:
                i2 i2Var = (i2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                i2Var.H = false;
                f2[] f2VarArr = (f2[]) arrayList3.toArray(new f2[0]);
                i2Var.I = f2VarArr;
                if (f2VarArr.length > 0) {
                    i2Var.c0.setScaleX(0.3f);
                    i2Var.c0.setScaleY(0.3f);
                    i2Var.c0.setAlpha(0.0f);
                    i2Var.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(kr.f).start();
                    return;
                }
                return;
            case 19:
                a();
                return;
            case 20:
                u2.r rVar = (u2.r) this.b;
                rVar.U.set(rVar.w((jb.m) this.c, rVar.O, 0));
                return;
            case 21:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i15 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 22:
                b();
                return;
            case 23:
                c();
                return;
            case 24:
                l9 l9Var = (l9) this.b;
                View view2 = (View) this.c;
                ue.a aVar = (ue.a) l9Var.d;
                if ((l9Var.a & 2) != 0) {
                    if (!aVar.r1(view2, l9Var.b, l9Var.c)) {
                        l9Var.a |= 8;
                        return;
                    }
                    l9Var.a &= -3;
                    l9Var.e = null;
                    view2.performHapticFeedback(0);
                    l9Var.a = (l9Var.a | 4) & (-11);
                    l9Var.e = null;
                    return;
                }
                return;
            case 25:
                ug.k0 k0Var = (ug.k0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = k0Var.e2;
                ek0 ek0Var = k0Var.o1;
                if (tLObject2 != null) {
                    arrayList4.clear();
                    arrayList4.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    k0Var.E2 = false;
                    k0Var.F2.b(k0Var.j2 + 4);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= ek0Var.getChildCount()) {
                            i7 = 0;
                        } else if (ek0Var.getChildAt(i16) instanceof ug.j0) {
                            i7 = ek0Var.getChildAt(i16).getTop();
                        } else {
                            i16++;
                        }
                    }
                    k0Var.H1();
                    if (k0Var.h2 >= 0 && i7 != 0) {
                        ((v4.c0) ek0Var.getLayoutManager()).h1(k0Var.h2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList4.size(), k0Var.I2.b);
                k0Var.t2.i(max, false);
                k0Var.t2.setBagePosition(max / k0Var.I2.c);
                ug.i0 i0Var = k0Var.t2;
                i0Var.I = true;
                i0Var.requestLayout();
                return;
            case 26:
                ((ug.k0) this.b).i1((m80) this.c, true);
                return;
            case 27:
                ug.x1 x1Var = (ug.x1) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                w7.G(x1Var.s);
                org.telegram.messenger.g0.g3(new t1(i10, x1Var, w7.I(document)));
                return;
            case 28:
                ug.x1 x1Var2 = (ug.x1) this.b;
                x1Var2.e = (File) this.c;
                x1Var2.a();
                return;
            default:
                v9.a aVar2 = (v9.a) this.b;
                Runnable runnable3 = (Runnable) this.c;
                Process.setThreadPriority(aVar2.c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable3.run();
                return;
        }
    }

    public /* synthetic */ t1(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.a = 2;
        this.b = d0Var;
        this.c = runnable;
    }
}
