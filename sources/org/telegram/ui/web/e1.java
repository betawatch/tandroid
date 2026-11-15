package org.telegram.ui.web;

import a8.ja;
import a8.xa;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import di.l9;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.a8;
import org.telegram.messenger.cf;
import org.telegram.messenger.cl;
import org.telegram.messenger.gz;
import org.telegram.messenger.np;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.uj0;
import tg.b2;
import tg.e2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        u2.c cVar = (u2.c) this.b;
        e1 e1Var = (e1) this.c;
        cVar.c.Y();
        u2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            e1Var.run();
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

    /* JADX WARN: Removed duplicated region for block: B:96:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ai.s sVar;
        p4.m1 m1Var;
        ji.j jVar;
        ji.j jVar2;
        int i7;
        Object obj = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((org.telegram.ui.l0) this.b).g0.a((Integer) this.c);
                return;
            case 1:
                n1 n1Var = (n1) this.b;
                String str = (String) this.c;
                np messagesController = n1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = str;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new cl(messagesController, 3));
                n1Var.a.g3.O(true);
                return;
            case 2:
                t1 t1Var = (t1) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i11 = t1Var.a;
                t1Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    np.s1(i11).Y3(tL_messages_webPage.users, false);
                    np.s1(i11).S3(tL_messages_webPage.chats, false);
                    t1Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            t1Var.h = tL_webPage;
                        }
                    }
                    t1Var.h = null;
                }
                TLRPC.WebPage webPage = t1Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    t1Var.h = null;
                }
                if (!gz.w0 && t1Var.h != null && (sVar = t1Var.l) != null) {
                    sVar.run();
                }
                t1Var.c();
                return;
            case 3:
                ((t1) this.b).m.remove((org.telegram.ui.Wallet.r) this.c);
                return;
            case 4:
                p4.d0 d0Var = (p4.d0) this.b;
                Runnable runnable = (Runnable) this.c;
                d0Var.getClass();
                runnable.run();
                return;
            case 5:
                p4.d0 d0Var2 = (p4.d0) this.b;
                p4.g1 g1Var = (p4.g1) this.c;
                p4.m0 m0Var = d0Var2.h;
                d0Var2.t = g1Var;
                cf cfVar = new cf(d0Var2, g1Var);
                g1Var.I0(cfVar);
                d0Var2.u = cfVar;
                try {
                    m0Var.j.p(0, g1Var);
                } catch (RemoteException e10) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                }
                ((q4.l) m0Var.n.b).a.setActive(true);
                d0Var2.s = new p4.e1(g1Var.W(), 0, g1Var.R0(), g1Var.Q0(), g1Var.Q0(), 0, g1Var.j(), g1Var.m(), g1Var.D0(), g1Var.C(), g1Var.T0(), 0, g1Var.p0(18) ? g1Var.k0() : e2.o0.L, g1Var.p0(22) ? g1Var.F() : 1.0f, 1.0f, g1Var.p0(21) ? g1Var.H() : e2.e.i, 0, g1Var.p0(28) ? g1Var.l0() : g2.c.d, g1Var.K(), g1Var.p0(23) ? g1Var.n() : 0, g1Var.p0(23) && g1Var.z0(), g1Var.u(), 1, g1Var.w0(), g1Var.i(), g1Var.h(), g1Var.g(), g1Var.U0(), g1Var.O0(), g1Var.Z(), g1Var.z(), g1Var.p0(30) ? g1Var.j0() : e2.s1.b, g1Var.E0());
                d0Var2.f(g1Var.t());
                return;
            case 6:
                ((c0.i) this.c).a(Boolean.valueOf(((p4.d0) this.b).o()));
                return;
            case 7:
                m9.w wVar = (m9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    m1Var = (p4.m1) wVar.a;
                    ja.k(m1Var, "SessionResult must not be null");
                } catch (InterruptedException e11) {
                    e = e11;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    m1Var = new p4.m1(-1);
                } catch (CancellationException e12) {
                    h2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e12);
                    m1Var = new p4.m1(1);
                } catch (ExecutionException e13) {
                    e = e13;
                    h2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    m1Var = new p4.m1(-1);
                }
                resultReceiver.send(m1Var.a, m1Var.b);
                return;
            case 8:
                p4.c1 c1Var = (p4.c1) this.b;
                p4.l lVar = (p4.l) this.c;
                ab.c0 c0Var = c1Var.b;
                p4.v p10 = c0Var.p(lVar.asBinder());
                if (p10 != null) {
                    c0Var.H(p10);
                    return;
                }
                return;
            case 9:
                ((p4.c1) this.b).b.l((p4.v) this.c);
                return;
            case 10:
                q2.e eVar = (q2.e) this.b;
                e2.u uVar = (e2.u) this.c;
                q2.f fVar = eVar.d;
                if (fVar.F == 0 || eVar.c) {
                    return;
                }
                Looper looper = fVar.J;
                looper.getClass();
                eVar.b = fVar.b(looper, eVar.a, uVar, false);
                fVar.y.add(eVar);
                return;
            case 11:
                ((l9) this.b).a((SpannableString) this.c);
                return;
            case 12:
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
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj2 = arrayList.get(i12);
                                i12++;
                                if (((qi.o) obj2).a != null) {
                                    qi.l lVar2 = (qi.l) pVar.h.get(nVar);
                                    if (lVar2 != null) {
                                        jVar2 = lVar2.a;
                                    } else {
                                        int i13 = 26;
                                        if (pVar.a()) {
                                            try {
                                                com.google.android.gms.internal.play_billing.s0 c10 = pVar.w.a.c(nVar.a, nVar.b);
                                                c10.b();
                                                jVar = new ji.j(i13, c10, obj);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e14) {
                                                if (pVar.c != null) {
                                                    try {
                                                        a8.g(e14, true);
                                                    } catch (LinkageError | RuntimeException unused) {
                                                    }
                                                }
                                                jVar = new ji.j(i13, obj, e14);
                                            }
                                            synchronized (pVar.a) {
                                                try {
                                                    if (pVar.s) {
                                                        return;
                                                    }
                                                    if (lVar2 == null && ((Throwable) jVar.c) == null) {
                                                        pVar.c(nVar, jVar);
                                                    }
                                                    ArrayList arrayList2 = (ArrayList) pVar.n.remove(nVar);
                                                    if (arrayList2 == null) {
                                                        return;
                                                    }
                                                    int size2 = arrayList2.size();
                                                    while (i10 < size2) {
                                                        Object obj3 = arrayList2.get(i10);
                                                        i10++;
                                                        qi.o oVar = (qi.o) obj3;
                                                        try {
                                                            qi.m mVar = oVar.a;
                                                            oVar.a = null;
                                                            if (mVar != null) {
                                                                mVar.a(jVar);
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
                                        jVar2 = new ji.j(i13, obj, pVar.x);
                                    }
                                    jVar = jVar2;
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
            case 13:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 14:
                r2.q qVar = (r2.q) this.b;
                r2.i iVar = (r2.i) this.c;
                ff ffVar = qVar.c;
                Uri uri = iVar.y;
                s2.c cVar = (s2.c) ((r2.k) ffVar.b).b.d.get(uri);
                if (cVar != null) {
                    s2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 15:
                s2.b bVar = (s2.b) this.b;
                Uri uri2 = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri2);
                return;
            case 16:
                sg.i0 i0Var = (sg.i0) this.b;
                sg.p0 p0Var = (sg.p0) this.c;
                i0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) i0Var.h(i0Var.f(), true, false, false).c;
                RectF f10 = i0Var.f();
                Object obj4 = i0Var.a.b;
                i0Var.w = new xa(byteBuffer, 0, f10);
                i0Var.a(false);
                p0Var.run();
                return;
            case 17:
                sg.u0 u0Var = (sg.u0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                sg.s0 s0Var = u0Var.d;
                if (s0Var == null || !s0Var.f) {
                    return;
                }
                sg.s0.a(s0Var);
                runnable2.run();
                return;
            case 18:
                tg.g0 g0Var = (tg.g0) this.b;
                tg.n1 n1Var2 = (tg.n1) this.c;
                n1Var2.m();
                g0Var.r0(n1Var2, true);
                return;
            case 19:
                ((tg.n1) this.b).s((Bitmap) this.c);
                return;
            case 20:
                e2 e2Var = (e2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                e2Var.H = false;
                b2[] b2VarArr = (b2[]) arrayList3.toArray(new b2[0]);
                e2Var.I = b2VarArr;
                if (b2VarArr.length > 0) {
                    e2Var.c0.setScaleX(0.3f);
                    e2Var.c0.setScaleY(0.3f);
                    e2Var.c0.setAlpha(0.0f);
                    e2Var.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(er.f).start();
                    return;
                }
                return;
            case 21:
                a();
                return;
            case 22:
                u2.r rVar = (u2.r) this.b;
                rVar.U.set(rVar.w((k8.a) this.c, rVar.O, 0));
                return;
            case 23:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i14 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                k9 k9Var = (k9) this.b;
                View view = (View) this.c;
                ue.a aVar = (ue.a) k9Var.d;
                if ((k9Var.a & 2) != 0) {
                    if (!aVar.Z0(view, k9Var.b, k9Var.c)) {
                        k9Var.a |= 8;
                        return;
                    }
                    k9Var.a &= -3;
                    k9Var.e = null;
                    view.performHapticFeedback(0);
                    k9Var.a = (k9Var.a | 4) & (-11);
                    k9Var.e = null;
                    return;
                }
                return;
            case 27:
                ug.j0 j0Var = (ug.j0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = j0Var.e2;
                uj0 uj0Var = j0Var.o1;
                if (tLObject2 != null) {
                    arrayList4.clear();
                    arrayList4.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    j0Var.E2 = false;
                    j0Var.F2.b(j0Var.j2 + 4);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= uj0Var.getChildCount()) {
                            i7 = 0;
                        } else if (uj0Var.getChildAt(i15) instanceof ug.i0) {
                            i7 = uj0Var.getChildAt(i15).getTop();
                        } else {
                            i15++;
                        }
                    }
                    j0Var.G1();
                    if (j0Var.h2 >= 0 && i7 != 0) {
                        ((v4.b0) uj0Var.getLayoutManager()).h1(j0Var.h2 + 1, i7);
                    }
                }
                int max = Math.max(arrayList4.size(), j0Var.I2.b);
                j0Var.t2.i(max, false);
                j0Var.t2.setBagePosition(max / j0Var.I2.c);
                ug.h0 h0Var = j0Var.t2;
                h0Var.I = true;
                h0Var.requestLayout();
                return;
            case 28:
                ((ug.j0) this.b).h1((c80) this.c, true);
                return;
            default:
                ug.w1 w1Var = (ug.w1) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                w7.G(w1Var.s);
                org.telegram.messenger.g0.h3(new ug.t1(i10, w1Var, w7.I(document)));
                return;
        }
    }

    public /* synthetic */ e1(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.a = 4;
        this.b = d0Var;
        this.c = runnable;
    }
}
