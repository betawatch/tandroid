// default package

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class yla implements n93 {
    public final rd4 a;
    public final s93[] e;
    public final u93[] f;
    public int g;
    public int h;
    public s93 i;
    public q93 j;
    public boolean k;
    public boolean l;
    public int m;
    public Executor o;
    public xla p;
    public xla q;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public yla(s93[] s93VarArr, u93[] u93VarArr) {
        this.e = s93VarArr;
        this.g = s93VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = u93VarArr;
        this.h = u93VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        rd4 rd4Var = new rd4(this);
        this.a = rd4Var;
        rd4Var.start();
    }

    @Override // n93
    public final void a(long j) {
        synchronized (this.b) {
            yve.p(this.g == this.e.length || this.k);
            this.n = j;
        }
    }

    @Override // n93
    public final Object d() {
        s93 s93Var;
        synchronized (this.b) {
            q93 q93Var = this.j;
            if (q93Var != null) {
                throw q93Var;
            }
            yve.p(this.i == null);
            int i = this.g;
            if (i == 0) {
                s93Var = null;
            } else {
                s93[] s93VarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                s93Var = s93VarArr[i2];
            }
            this.i = s93Var;
        }
        return s93Var;
    }

    public s93 f() {
        return new s93(1, 0);
    }

    @Override // n93
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            s93 s93Var = this.i;
            if (s93Var != null) {
                n(s93Var, false);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                n((s93) this.c.removeFirst(), false);
            }
            while (!this.d.isEmpty()) {
                ((u93) this.d.removeFirst()).release();
            }
        }
    }

    public u93 g() {
        return new SimpleDecoderOutputBuffer(new lu3(this, (byte) 17));
    }

    public q93 h(Throwable th) {
        return new fm5("Unexpected decode error", th);
    }

    public abstract q93 i(s93 s93Var, u93 u93Var, boolean z);

    public final boolean j() {
        q93 h;
        synchronized (this.b) {
            while (!this.l) {
                if (!this.c.isEmpty() && this.h > 0) {
                    break;
                }
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            s93 s93Var = (s93) this.c.removeFirst();
            u93[] u93VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            u93 u93Var = u93VarArr[i];
            boolean z = this.k;
            this.k = false;
            if (s93Var.isEndOfStream()) {
                u93Var.addFlag(4);
            } else {
                u93Var.timeUs = s93Var.e;
                if (s93Var.isFirstSample()) {
                    u93Var.addFlag(TLObject.FLAG_27);
                }
                if (!l(s93Var.e)) {
                    u93Var.shouldBeSkipped = true;
                }
                try {
                    h = i(s93Var, u93Var, z);
                } catch (OutOfMemoryError e) {
                    h = h(e);
                } catch (RuntimeException e2) {
                    h = h(e2);
                }
                if (h != null) {
                    synchronized (this.b) {
                        this.j = h;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    u93Var.release();
                } else {
                    boolean z2 = u93Var.shouldBeSkipped;
                    int i2 = this.m;
                    if (z2) {
                        this.m = i2 + 1;
                        u93Var.release();
                    } else {
                        u93Var.skippedOutputBufferCount = i2;
                        this.m = 0;
                        this.d.addLast(u93Var);
                        xla xlaVar = this.p;
                        Executor executor = this.o;
                        if (xlaVar != null && executor != null) {
                            executor.execute(xlaVar);
                        }
                    }
                }
                n(s93Var, true);
            }
            return true;
        }
    }

    @Override // n93
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final u93 c() {
        synchronized (this.b) {
            q93 q93Var = this.j;
            if (q93Var != null) {
                throw q93Var;
            }
            if (this.d.isEmpty()) {
                return null;
            }
            return (u93) this.d.removeFirst();
        }
    }

    public final boolean l(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.n;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // n93
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void e(s93 s93Var) {
        synchronized (this.b) {
            q93 q93Var = this.j;
            if (q93Var != null) {
                throw q93Var;
            }
            yve.f(s93Var == this.i);
            this.c.addLast(s93Var);
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
            this.i = null;
        }
    }

    public final void n(s93 s93Var, boolean z) {
        s93Var.clear();
        int i = this.g;
        this.g = i + 1;
        this.e[i] = s93Var;
        xla xlaVar = this.q;
        Executor executor = this.o;
        if (!z || xlaVar == null || executor == null) {
            return;
        }
        executor.execute(xlaVar);
    }

    public final void o(u93 u93Var) {
        synchronized (this.b) {
            u93Var.clear();
            u93[] u93VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            u93VarArr[i] = u93Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [xla] */
    /* JADX WARN: Type inference failed for: r4v2, types: [xla] */
    public final void p(final m93 m93Var, Executor executor) {
        synchronized (this.b) {
            this.o = executor;
            final byte b = 0;
            this.p = new Runnable() { // from class: xla
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    m93 m93Var2 = m93Var;
                    switch (b2) {
                        case 0:
                            m93Var2.a();
                            break;
                        default:
                            m93Var2.b();
                            break;
                    }
                }
            };
            final byte b2 = 1;
            this.q = new Runnable() { // from class: xla
                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b2;
                    m93 m93Var2 = m93Var;
                    switch (b22) {
                        case 0:
                            m93Var2.a();
                            break;
                        default:
                            m93Var2.b();
                            break;
                    }
                }
            };
        }
    }

    public final void q(int i) {
        int i2 = this.g;
        s93[] s93VarArr = this.e;
        yve.p(i2 == s93VarArr.length);
        for (s93 s93Var : s93VarArr) {
            s93Var.c(i);
        }
    }

    @Override // n93
    public void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
