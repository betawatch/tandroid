package org.telegram.ui.web;

import a8.ia;
import a8.wa;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.LongSparseArray;
import android.widget.ImageView;
import androidx.car.app.hardware.common.CarResultStub;
import c8.xa;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import di.p7;
import fi.u2;
import fi.w3;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.c20;
import org.telegram.messenger.df;
import org.telegram.messenger.fl;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xq;
import tg.c2;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var;
        d0 d0Var;
        o5 o5Var;
        p4.m1 m1Var;
        int i7 = 3;
        SurfaceTexture surfaceTexture = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                x0 x0Var2 = (x0) this.b;
                p7 p7Var = (p7) this.c;
                hi.p pVar = x0Var2.j0;
                pVar.f = true;
                pVar.k();
                x0Var2.v(p7Var);
                return;
            case 1:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy == null || (x0Var = botWebViewContainer$BotWebViewProxy.a) == null || (d0Var = x0Var.c) == null) {
                    return;
                }
                d0Var.f(arrayList);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                xa.c.addAll(0, arrayList2);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    xa.d.put(longSparseArray.keyAt(i11), (y0) longSparseArray.valueAt(i11));
                }
                xa.b = true;
                xa.a = false;
                ArrayList arrayList3 = xa.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i10 < size) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        ((c20) obj).a(arrayList2);
                    }
                    xa.e = null;
                    return;
                }
                return;
            case 3:
                u2 u2Var = (u2) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                z0 z0Var = (z0) u2Var.c;
                ArrayList arrayList5 = z0Var.h;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                z0Var.n = false;
                w3 w3Var = z0Var.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.z0 z0Var2 = (org.telegram.ui.ActionBar.z0) this.b;
                z0Var2.setEnabled(((u1) this.c).b() != null);
                z0Var2.animate().alpha(z0Var2.isEnabled() ? 1.0f : 0.5f);
                return;
            case 5:
                ((org.telegram.ui.l0) this.b).f0.a((Integer) this.c);
                return;
            case 6:
                o1 o1Var = (o1) this.b;
                String str = (String) this.c;
                qp messagesController = o1Var.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = str;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new fl(messagesController, i7));
                o1Var.a.f3.O(true);
                return;
            case 7:
                u1 u1Var = (u1) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i12 = u1Var.a;
                u1Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    qp.s1(i12).Y3(tL_messages_webPage.users, false);
                    qp.s1(i12).S3(tL_messages_webPage.chats, false);
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
                if (!iz.w0 && u1Var.h != null && (o5Var = u1Var.l) != null) {
                    o5Var.run();
                }
                u1Var.c();
                return;
            case 8:
                ((u1) this.b).m.remove((s) this.c);
                return;
            case 9:
                p4.d0 d0Var2 = (p4.d0) this.b;
                Runnable runnable = (Runnable) this.c;
                d0Var2.getClass();
                runnable.run();
                return;
            case 10:
                p4.d0 d0Var3 = (p4.d0) this.b;
                p4.g1 g1Var = (p4.g1) this.c;
                p4.m0 m0Var = d0Var3.h;
                d0Var3.t = g1Var;
                df dfVar = new df(d0Var3, g1Var);
                g1Var.I0(dfVar);
                d0Var3.u = dfVar;
                try {
                    m0Var.j.p(0, g1Var);
                } catch (RemoteException e10) {
                    h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                }
                ((q4.l) m0Var.n.b).a.setActive(true);
                d0Var3.s = new p4.e1(g1Var.W(), 0, g1Var.R0(), g1Var.Q0(), g1Var.Q0(), 0, g1Var.j(), g1Var.m(), g1Var.D0(), g1Var.C(), g1Var.T0(), 0, g1Var.p0(18) ? g1Var.k0() : e2.o0.L, g1Var.p0(22) ? g1Var.F() : 1.0f, 1.0f, g1Var.p0(21) ? g1Var.H() : e2.e.i, 0, g1Var.p0(28) ? g1Var.l0() : g2.d.d, g1Var.K(), g1Var.p0(23) ? g1Var.n() : 0, g1Var.p0(23) && g1Var.z0(), g1Var.u(), 1, g1Var.w0(), g1Var.i(), g1Var.h(), g1Var.g(), g1Var.U0(), g1Var.O0(), g1Var.Z(), g1Var.z(), g1Var.p0(30) ? g1Var.j0() : e2.s1.b, g1Var.E0());
                d0Var3.f(g1Var.t());
                return;
            case 11:
                ((c0.i) this.c).a(Boolean.valueOf(((p4.d0) this.b).o()));
                return;
            case 12:
                m9.w wVar = (m9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    m1Var = (p4.m1) wVar.a;
                    ia.k(m1Var, "SessionResult must not be null");
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
            case 13:
                p4.c1 c1Var = (p4.c1) this.b;
                p4.l lVar = (p4.l) this.c;
                ui.e eVar = c1Var.b;
                p4.v x10 = eVar.x(lVar.asBinder());
                if (x10 != null) {
                    eVar.T(x10);
                    return;
                }
                return;
            case 14:
                ((p4.c1) this.b).b.q((p4.v) this.c);
                return;
            case 15:
                q2.d dVar = (q2.d) this.b;
                e2.u uVar = (e2.u) this.c;
                q2.e eVar2 = dVar.d;
                if (eVar2.E == 0 || dVar.c) {
                    return;
                }
                Looper looper = eVar2.I;
                looper.getClass();
                dVar.b = eVar2.b(looper, dVar.a, uVar, false);
                eVar2.y.add(dVar);
                return;
            case 16:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 17:
                r2.p pVar2 = (r2.p) this.b;
                r2.i iVar = (r2.i) this.c;
                rt rtVar = pVar2.c;
                Uri uri = iVar.y;
                s2.c cVar = (s2.c) ((r2.j) rtVar.b).b.d.get(uri);
                if (cVar != null) {
                    s2.c.b(cVar, uri, true);
                    return;
                }
                return;
            case 18:
                s2.b bVar = (s2.b) this.b;
                Uri uri2 = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri2);
                return;
            case 19:
                sg.j0 j0Var = (sg.j0) this.b;
                sg.q0 q0Var = (sg.q0) this.c;
                j0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) j0Var.h(j0Var.f(), true, false, false).c;
                RectF f10 = j0Var.f();
                Object obj2 = j0Var.a.b;
                j0Var.w = new wa(byteBuffer, 0, f10);
                j0Var.a(false);
                q0Var.run();
                return;
            case 20:
                sg.v0 v0Var = (sg.v0) this.b;
                Runnable runnable2 = (Runnable) this.c;
                sg.t0 t0Var = v0Var.d;
                if (t0Var == null || !t0Var.f) {
                    return;
                }
                sg.t0.a(t0Var);
                runnable2.run();
                return;
            case 21:
                tg.g0 g0Var = (tg.g0) this.b;
                tg.n1 n1Var = (tg.n1) this.c;
                n1Var.m();
                g0Var.r0(n1Var, true);
                return;
            case 22:
                ((tg.n1) this.b).s((Bitmap) this.c);
                return;
            case 23:
                c2 c2Var = (c2) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                c2Var.G = false;
                tg.z1[] z1VarArr = (tg.z1[]) arrayList6.toArray(new tg.z1[0]);
                c2Var.H = z1VarArr;
                if (z1VarArr.length > 0) {
                    c2Var.b0.setScaleX(0.3f);
                    c2Var.b0.setScaleY(0.3f);
                    c2Var.b0.setAlpha(0.0f);
                    c2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(xq.f).start();
                    return;
                }
                return;
            case 24:
                ti.i iVar2 = (ti.i) this.b;
                ti.p pVar3 = (ti.p) this.c;
                ti.m mVar = iVar2.b;
                if (iVar2.j != pVar3) {
                    return;
                }
                ImageView imageView = iVar2.l;
                if (imageView != null && imageView.getVisibility() == 0) {
                    pVar3.setFirstFrameCallback(new ti.b(iVar2, i7));
                }
                if (mVar.L()) {
                    mVar.f();
                    return;
                } else {
                    if (mVar.h()) {
                        return;
                    }
                    mVar.c(mVar.l());
                    return;
                }
            case 25:
                ti.i iVar3 = (ti.i) this.b;
                c20 c20Var = (c20) this.c;
                iVar3.l();
                ti.p pVar4 = iVar3.j;
                iVar3.j = null;
                if (pVar4 != null) {
                    org.telegram.messenger.g0.E2(pVar4);
                    SurfaceTexture surfaceTexture2 = pVar4.a;
                    pVar4.a = null;
                    surfaceTexture = surfaceTexture2;
                }
                c20Var.a(surfaceTexture);
                return;
            case 26:
                ti.p pVar5 = (ti.p) this.b;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.c;
                if (pVar5.a == surfaceTexture3 && pVar5.getSurfaceTexture() == null) {
                    pVar5.setSurfaceTexture(surfaceTexture3);
                    return;
                }
                return;
            case 27:
                u2.c cVar2 = (u2.c) this.b;
                s sVar = (s) this.c;
                cVar2.c.i();
                u2.f fVar = cVar2.b;
                synchronized (fVar.a) {
                    fVar.b();
                    sVar.run();
                }
                return;
            case 28:
                u2.r rVar = (u2.r) this.b;
                rVar.T.set(rVar.w((wf.b) this.c, rVar.N, 0));
                return;
            default:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i13 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
        }
    }

    public /* synthetic */ s(p4.d0 d0Var, p4.v vVar, Runnable runnable) {
        this.a = 9;
        this.b = d0Var;
        this.c = runnable;
    }
}
