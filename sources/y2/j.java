package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class j extends Handler implements Runnable {
    public final int a;
    public final k b;
    public final long c;
    public i d;
    public IOException e;
    public int f;
    public Thread h;
    public boolean n;
    public volatile boolean r;
    public final /* synthetic */ n s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i10, long j3) {
        super(looper);
        this.s = nVar;
        this.b = kVar;
        this.d = iVar;
        this.a = i10;
        this.c = j3;
    }

    public final void a(boolean z10) {
        this.r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.n = true;
                    this.b.k();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.s.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.d;
            iVar.getClass();
            iVar.C(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.c;
        i iVar = this.d;
        iVar.getClass();
        iVar.l(this.b, elapsedRealtime, j3, this.f);
        this.e = null;
        n nVar = this.s;
        z2.a aVar = nVar.a;
        j jVar = nVar.b;
        jVar.getClass();
        aVar.execute(jVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.r) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            b();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.s.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.c;
        i iVar = this.d;
        iVar.getClass();
        if (this.n) {
            iVar.C(this.b, elapsedRealtime, j3, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                iVar.p(this.b, elapsedRealtime, j3);
                return;
            } catch (RuntimeException e) {
                e2.a.f("LoadTask", "Unexpected exception handling load completed", e);
                this.s.c = new m(e);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i12 = this.f + 1;
        this.f = i12;
        k4.d k10 = iVar.k(this.b, elapsedRealtime, j3, iOException, i12);
        int i13 = k10.a;
        if (i13 == 3) {
            this.s.c = this.e;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f = 1;
            }
            long j10 = k10.b;
            if (j10 == -9223372036854775807L) {
                j10 = Math.min((this.f - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            }
            n nVar = this.s;
            e2.d.g(nVar.b == null);
            nVar.b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (this.r) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.r) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e7) {
            if (this.r) {
                return;
            }
            e2.a.f("LoadTask", "Unexpected exception loading stream", e7);
            obtainMessage(3, new m(e7)).sendToTarget();
        } catch (OutOfMemoryError e10) {
            if (this.r) {
                return;
            }
            e2.a.f("LoadTask", "OutOfMemory error loading stream", e10);
            obtainMessage(3, new m(e10)).sendToTarget();
        } catch (Error e11) {
            if (!this.r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
