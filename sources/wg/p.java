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
import org.telegram.messenger.le;
import org.telegram.messenger.ls;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        k8.a aVar = jVar.g;
        long j3 = hVar.a;
        synchronized (((e0.g) aVar.c).f) {
            ((HashMap) ((e0.g) aVar.c).g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) aVar.c).d).post(new org.telegram.messenger.u0(aVar, j3, (le) aVar.b, file, 1));
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                y10 y10Var = (y10) this.c;
                y10 y10Var2 = (y10) this.d;
                if (tL_error != null) {
                    y10Var.a(tL_error);
                    return;
                } else {
                    y10Var2.a(null);
                    return;
                }
            case 1:
                ((ug.z) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 2:
                xh.l lVar = (xh.l) this.b;
                n80 n80Var = (n80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                l80 l80Var = lVar.H;
                if (l80Var == null || lVar.I != n80Var) {
                    return;
                }
                l80Var.a(clickableSpan);
                lVar.I = null;
                lVar.y.f(true);
                return;
            case 3:
                a();
                return;
            case 4:
                yf.e eVar = (yf.e) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                String str = eVar.b;
                int i7 = eVar.a;
                if (tLObject != null) {
                    si.d0(i7).l1(str, (TLRPC.Document) tLObject, false);
                } else {
                    eVar.a();
                    si.d0(i7).l1(str, null, true);
                    if (tL_error2 != null) {
                        ls.f(i7).d(new q(18, eVar, tL_error2));
                    }
                }
                eVar.a();
                return;
            case 5:
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
                        l2.f0 a10 = new l2.n(jVar.a).a();
                        jVar.A = a10;
                        a10.I0(jVar.F);
                        jVar.A.m0(e2.l0.b(Uri.fromFile(file)));
                        jVar.A.a();
                    }
                    jVar.s(5);
                    ji.l lVar2 = jVar.f;
                    long j3 = jVar.j();
                    byte[] bArr2 = jVar.B;
                    lVar2.Q(j3, bArr2 == null ? null : (byte[]) bArr2.clone());
                    return;
                } catch (Throwable th2) {
                    jVar.g(th2 instanceof Exception ? th2 : new RuntimeException(th2));
                    return;
                }
            case 6:
                b();
                return;
            case 7:
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
            case 8:
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
                } catch (Exception e10) {
                    handler.post(new zi.e0(u0Var, e10, 3));
                    return;
                }
            default:
                zi.u0 u0Var2 = (zi.u0) this.b;
                zi.q0 q0Var = (zi.q0) this.c;
                File file3 = (File) this.d;
                zi.r0 r0Var = u0Var2.e;
                long j10 = q0Var.a;
                sy0 sy0Var = (sy0) r0Var;
                synchronized (sy0Var) {
                    if (sy0Var.d) {
                        return;
                    }
                    sy0Var.c.put(Long.valueOf(j10), new qy0(file3));
                    return;
                }
        }
    }

    public /* synthetic */ p(yf.e eVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 4;
        this.c = eVar;
        this.d = tLObject;
        this.b = tL_error;
    }
}
