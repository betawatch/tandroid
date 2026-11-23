package wg;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.ry0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        xi.i iVar = (xi.i) this.b;
        WebView webView = (WebView) this.c;
        e5.f fVar = (e5.f) this.d;
        synchronized (iVar.a) {
            if (!iVar.u && iVar.o == webView && iVar.p == fVar && !iVar.r) {
                if (iVar.s) {
                    a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                    iVar.q();
                } else {
                    iVar.s = true;
                    a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                    iVar.h();
                }
            }
        }
    }

    private final void b() {
        yi.j jVar = (yi.j) this.b;
        yi.h hVar = (yi.h) this.c;
        File file = (File) this.d;
        jb.m mVar = jVar.g;
        long j3 = hVar.a;
        synchronized (((e0.g) mVar.c).f) {
            ((HashMap) ((e0.g) mVar.c).g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) mVar.c).d).post(new org.telegram.messenger.u0(mVar, j3, (ke) mVar.b, file, 1));
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.User c22;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                mp mpVar = (mp) this.c;
                t0 t0Var = (t0) this.d;
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    mpVar.f4(tL_channels_channelParticipants.users, false);
                    mpVar.Z3(tL_channels_channelParticipants.chats, false);
                    long e10 = i10.i(i10.t0).e();
                    ArrayList arrayList = new ArrayList();
                    for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i7).peer;
                        if (peer != null && fj.B1(peer) != e10 && (c22 = mpVar.c2(Long.valueOf(peer.user_id))) != null && !n10.y(c22) && !c22.bot) {
                            arrayList.add(mpVar.o1(peer));
                        }
                    }
                    t0Var.a(arrayList);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                w10 w10Var = (w10) this.c;
                w10 w10Var2 = (w10) this.d;
                if (tL_error != null) {
                    w10Var.a(tL_error);
                    return;
                } else {
                    w10Var2.a(null);
                    return;
                }
            case 2:
                ((ug.z) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 3:
                xh.l lVar = (xh.l) this.b;
                k80 k80Var = (k80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                i80 i80Var = lVar.H;
                if (i80Var == null || lVar.I != k80Var) {
                    return;
                }
                i80Var.a(clickableSpan);
                lVar.I = null;
                lVar.y.f(true);
                return;
            case 4:
                a();
                return;
            case 5:
                yf.e eVar = (yf.e) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str = eVar.b;
                int i10 = eVar.a;
                if (tLObject2 != null) {
                    ri.d0(i10).l1(str, (TLRPC.Document) tLObject2, false);
                } else {
                    eVar.a();
                    ri.d0(i10).l1(str, null, true);
                    if (tL_error2 != null) {
                        ks.f(i10).d(new v9.b(22, eVar, tL_error2));
                    }
                }
                eVar.a();
                return;
            case 6:
                yi.j jVar = (yi.j) this.b;
                yi.h hVar = (yi.h) this.c;
                byte[] bArr = (byte[]) this.d;
                File file = hVar.b;
                if (jVar.G != 4) {
                    return;
                }
                jVar.B = bArr;
                try {
                    jVar.p();
                    if (jVar.e) {
                        l2.g0 a10 = new l2.o(jVar.a).a();
                        jVar.A = a10;
                        a10.J0(jVar.F);
                        jVar.A.n0(e2.l0.b(Uri.fromFile(file)));
                        jVar.A.a();
                    }
                    jVar.s(5);
                    j6.k kVar = jVar.f;
                    long j3 = jVar.j();
                    byte[] bArr2 = jVar.B;
                    kVar.k0(j3, bArr2 == null ? null : (byte[]) bArr2.clone());
                    return;
                } catch (Throwable th2) {
                    jVar.g(th2 instanceof Exception ? th2 : new RuntimeException(th2));
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                zi.t tVar = (zi.t) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                tVar.getClass();
                try {
                    tVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 9:
                zi.u0 u0Var = (zi.u0) this.b;
                zi.x xVar = (zi.x) this.c;
                File file2 = (File) this.d;
                Handler handler = u0Var.i;
                try {
                    xVar.c(file2);
                    u0Var.g();
                    long h = xVar.h();
                    u0Var.m.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + zi.u0.f(u0Var.N));
                    handler.post(new zi.f0(u0Var, h, 1));
                    return;
                } catch (Exception e11) {
                    handler.post(new zi.e0(u0Var, e11, 3));
                    return;
                }
            default:
                zi.u0 u0Var2 = (zi.u0) this.b;
                zi.q0 q0Var = (zi.q0) this.c;
                File file3 = (File) this.d;
                zi.r0 r0Var = u0Var2.e;
                long j10 = q0Var.a;
                ry0 ry0Var = (ry0) r0Var;
                synchronized (ry0Var) {
                    if (ry0Var.d) {
                        return;
                    }
                    ry0Var.c.put(Long.valueOf(j10), new py0(file3));
                    return;
                }
        }
    }

    public /* synthetic */ p(yf.e eVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 5;
        this.c = eVar;
        this.b = tLObject;
        this.d = tL_error;
    }
}
