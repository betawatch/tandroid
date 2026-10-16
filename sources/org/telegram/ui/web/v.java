package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Base64;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import androidx.car.app.hardware.common.CarResultStub;
import bi.n9;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import fi.v2;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.rl;
import rg.p2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        r2.c cVar = (r2.c) this.b;
        v vVar = (v) this.c;
        cVar.c.s0();
        r2.f fVar = cVar.b;
        synchronized (fVar.a) {
            fVar.b();
            vVar.run();
        }
    }

    private final void b() {
        qa.a aVar;
        r9.p pVar = (r9.p) this.b;
        qa.b bVar = (qa.b) this.c;
        if (pVar.b != r9.p.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (pVar) {
            aVar = pVar.a;
            pVar.a = null;
            pVar.b = bVar;
        }
        aVar.h(bVar);
    }

    private final void c() {
        r9.o oVar = (r9.o) this.b;
        qa.b bVar = (qa.b) this.c;
        synchronized (oVar) {
            try {
                if (oVar.b == null) {
                    oVar.a.add(bVar);
                } else {
                    oVar.b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c1 c1Var;
        h0 h0Var;
        r2 r2Var;
        long j10 = 0;
        int i10 = 8;
        int i11 = 0;
        switch (this.a) {
            case 0:
                c1 c1Var2 = (c1) this.b;
                n9 n9Var = (n9) this.c;
                fi.r rVar = c1Var2.j0;
                rVar.f = true;
                rVar.k();
                c1Var2.v(n9Var);
                return;
            case 1:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy == null || (c1Var = botWebViewContainer$BotWebViewProxy.a) == null || (h0Var = c1Var.c) == null) {
                    return;
                }
                h0Var.f(arrayList);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                e1.c.addAll(0, arrayList2);
                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                    e1.d.put(longSparseArray.keyAt(i12), (d1) longSparseArray.valueAt(i12));
                }
                e1.b = true;
                e1.a = false;
                ArrayList arrayList3 = e1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        ((Utilities.Callback) obj).run(arrayList2);
                    }
                    e1.e = null;
                    return;
                }
                return;
            case 3:
                g1 g1Var = (g1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                h1 h1Var = g1Var.h;
                ArrayList arrayList5 = h1Var.f;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                h1Var.h = false;
                c71 c71Var = h1Var.a;
                if (c71Var != null) {
                    c71Var.W2.N(true);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.b;
                e1Var.setEnabled(((g2) this.c).b() != null);
                e1Var.animate().alpha(e1Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 5:
                ((org.telegram.ui.m0) this.b).f0.run((Integer) this.c);
                return;
            case 6:
                z1 z1Var = (z1) this.b;
                z1Var.getMessagesController().removeWebBrowserException((String) this.c);
                z1Var.a.W2.N(true);
                return;
            case 7:
                g2 g2Var = (g2) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i13 = g2Var.a;
                g2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i13).putChats(tL_messages_webPage.chats, false);
                    g2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            g2Var.h = tL_webPage;
                        }
                    }
                    g2Var.h = null;
                }
                TLRPC.WebPage webPage = g2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    g2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && g2Var.h != null && (r2Var = g2Var.l) != null) {
                    r2Var.run();
                }
                g2Var.c();
                return;
            case 8:
                ((g2) this.b).m.remove((v) this.c);
                return;
            case 9:
                p2.b bVar = (p2.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.s = false;
                bVar.b(uri);
                return;
            case 10:
                pi.j jVar = (pi.j) this.b;
                pi.i iVar = (pi.i) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = iVar.b.getInputStream();
                    while (true) {
                        synchronized (jVar.a) {
                            while (!jVar.u && jVar.m.get(Integer.valueOf(iVar.a)) == iVar && (!jVar.t || !iVar.e || iVar.c == j10)) {
                                try {
                                    jVar.a.wait();
                                } finally {
                                }
                            }
                            if (!jVar.u && jVar.m.get(Integer.valueOf(iVar.a)) == iVar) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, iVar.c));
                                if (read < 0) {
                                    jVar.c(iVar, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (jVar.a) {
                                        try {
                                            if (!jVar.u && jVar.m.get(Integer.valueOf(iVar.a)) == iVar && jVar.t) {
                                                iVar.c -= read;
                                                jVar.l(2, iVar.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                    j10 = 0;
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                    jVar.c(iVar, true);
                    return;
                }
                break;
            case 11:
                pi.j jVar2 = (pi.j) this.b;
                String str = (String) this.c;
                jVar2.getClass();
                try {
                    byte[] decode = Base64.decode(str.substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        jVar2.k(decode);
                        return;
                    }
                    jVar2.f();
                    return;
                } catch (IllegalArgumentException e) {
                    FileLog.e(e);
                    jVar2.f();
                    return;
                }
            case 12:
                ((pi.j) this.b).k((byte[]) this.c);
                return;
            case 13:
                qg.q0 q0Var = (qg.q0) this.b;
                qg.x0 x0Var = (qg.x0) this.c;
                q0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) q0Var.h(q0Var.f(), true, false, false).c;
                RectF f7 = q0Var.f();
                Object obj2 = q0Var.a.b;
                q0Var.w = new a5.a(byteBuffer, 0, f7);
                q0Var.a(false);
                x0Var.run();
                return;
            case 14:
                qg.c1 c1Var3 = (qg.c1) this.b;
                Runnable runnable = (Runnable) this.c;
                qg.a1 a1Var = c1Var3.d;
                if (a1Var == null || !a1Var.f) {
                    return;
                }
                qg.a1.b(a1Var);
                runnable.run();
                return;
            case 15:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 16:
                a();
                return;
            case 17:
                r2.r rVar2 = (r2.r) this.b;
                rVar2.T.set(rVar2.w((qf.b) this.c, rVar2.N, 0));
                return;
            case 18:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i14 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 19:
                b();
                return;
            case 20:
                c();
                return;
            case 21:
                rg.o0 o0Var = (rg.o0) this.b;
                rg.z1 z1Var2 = (rg.z1) this.c;
                z1Var2.m();
                o0Var.s0(z1Var2, true);
                return;
            case 22:
                ((rg.z1) this.b).s((Bitmap) this.c);
                return;
            case 23:
                p2 p2Var = (p2) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                p2Var.G = false;
                rg.m2[] m2VarArr = (rg.m2[]) arrayList6.toArray(new rg.m2[0]);
                p2Var.H = m2VarArr;
                if (m2VarArr.length > 0) {
                    p2Var.b0.setScaleX(0.3f);
                    p2Var.b0.setScaleY(0.3f);
                    p2Var.b0.setAlpha(0.0f);
                    p2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(es.f).start();
                    return;
                }
                return;
            case 24:
                ((ri.j) this.b).a0((ri.k0) this.c);
                return;
            case 25:
                ri.j jVar3 = (ri.j) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                jVar3.k();
                ri.m mVar = jVar3.x;
                if (mVar != null) {
                    long l4 = mVar.l();
                    ri.s sVar = jVar3.w;
                    if (sVar != null && l4 != Long.MAX_VALUE) {
                        sVar.q = Math.max(0L, l4) * 1000;
                        Handler handler = sVar.u;
                        if (handler != null) {
                            handler.removeCallbacks(sVar.x0);
                        }
                    }
                }
                jVar3.p();
                ri.m mVar2 = jVar3.x;
                if (mVar2 != null) {
                    mVar2.q();
                    jVar3.x = null;
                }
                handlerThread.quitSafely();
                return;
            case 26:
                ri.s sVar2 = (ri.s) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                sVar2.getClass();
                try {
                    try {
                        sVar2.f();
                        sVar2.r0 = true;
                    } catch (RuntimeException e7) {
                        sVar2.w0 = e7;
                        sVar2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 27:
                m.h hVar = (m.h) this.b;
                ri.k0 k0Var = (ri.k0) this.c;
                ri.r0 r0Var = (ri.r0) hVar.b;
                r0Var.N++;
                r0Var.w = true;
                r0Var.m.b("camera switch started: target=" + k0Var);
                o60 o60Var = (o60) r0Var.d.b;
                FrameLayout frameLayout = o60Var.x;
                o60Var.s0++;
                ValueAnimator valueAnimator = o60Var.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    o60Var.b0.cancel();
                    o60Var.b0 = null;
                }
                o60Var.n0 = true;
                o60Var.o0 = false;
                o60Var.p0 = false;
                o60Var.q0 = false;
                o60Var.r0 = SystemClock.elapsedRealtime();
                rl rlVar = o60Var.E;
                o60Var.v(false);
                Bitmap bitmap = o60Var.t0;
                if (bitmap != null) {
                    rlVar.setImageBitmap(bitmap);
                    o60Var.m0 = true;
                    rlVar.animate().cancel();
                    rlVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i15 = o60Var.s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                o60Var.b0 = ofFloat;
                ofFloat.setDuration(580L);
                o60Var.b0.setInterpolator(es.h);
                o60Var.b0.addUpdateListener(new org.telegram.ui.ActionBar.p2(o60Var, i15, 4));
                o60Var.b0.addListener(new v2(o60Var, i15, i10));
                o60Var.b0.start();
                FileLog.d("RoundVideo camera flip started: facing=" + k0Var + ", minimumDurationMs=580");
                o60Var.y();
                r0Var.o();
                return;
            case 28:
                ((ri.r0) ((m.h) this.b).b).h((Exception) this.c);
                return;
            default:
                s9.a aVar = (s9.a) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
        }
    }
}
