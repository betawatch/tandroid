package yi;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import e2.l0;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import l2.f0;
import l2.n;
import org.telegram.messenger.le;
import org.telegram.messenger.u0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.jy0;
import zi.g0;
import zi.r0;
import zi.s0;
import zi.u;
import zi.v0;
import zi.y;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        j jVar = (j) this.b;
        i iVar = (i) this.c;
        File file = (File) this.d;
        k8.a aVar = jVar.g;
        long j3 = iVar.a;
        synchronized (((e0.g) aVar.c).f) {
            ((HashMap) ((e0.g) aVar.c).g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) aVar.c).d).post(new u0(aVar, j3, (le) aVar.b, file, 1));
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                i iVar = (i) this.c;
                byte[] bArr = (byte[]) this.d;
                File file = iVar.b;
                if (jVar.G != 4) {
                    return;
                }
                jVar.B = bArr;
                try {
                    jVar.p();
                    if (jVar.e) {
                        f0 a10 = new n(jVar.a).a();
                        jVar.A = a10;
                        a10.I0(jVar.F);
                        jVar.A.m0(l0.b(Uri.fromFile(file)));
                        jVar.A.a();
                    }
                    jVar.s(5);
                    ji.j jVar2 = jVar.f;
                    long j3 = jVar.j();
                    byte[] bArr2 = jVar.B;
                    jVar2.l0(j3, bArr2 == null ? null : (byte[]) bArr2.clone());
                    return;
                } catch (Throwable th2) {
                    jVar.g(th2 instanceof Exception ? th2 : new RuntimeException(th2));
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                u uVar = (u) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                uVar.getClass();
                try {
                    uVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 3:
                v0 v0Var = (v0) this.b;
                y yVar = (y) this.c;
                File file2 = (File) this.d;
                Handler handler = v0Var.i;
                try {
                    yVar.c(file2);
                    v0Var.g();
                    long h = yVar.h();
                    v0Var.m.b("preview snapshot completed: durationMs=" + h + ", size=" + file2.length() + ", elapsedMs=" + v0.f(v0Var.N));
                    handler.post(new g0(v0Var, h, 1));
                    return;
                } catch (Exception e10) {
                    handler.post(new zi.f0(v0Var, e10, 3));
                    return;
                }
            default:
                v0 v0Var2 = (v0) this.b;
                r0 r0Var = (r0) this.c;
                File file3 = (File) this.d;
                s0 s0Var = v0Var2.e;
                long j10 = r0Var.a;
                jy0 jy0Var = (jy0) s0Var;
                synchronized (jy0Var) {
                    if (jy0Var.d) {
                        return;
                    }
                    jy0Var.c.put(Long.valueOf(j10), new hy0(file3));
                    return;
                }
        }
    }
}
