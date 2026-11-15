package zi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.g20;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.q40;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ r0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ h0(v0 v0Var, r0 r0Var, long j3, File file, boolean z10) {
        this.b = v0Var;
        this.c = r0Var;
        this.d = j3;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        v0 v0Var = this.b;
        r0 r0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f;
        synchronized (v0Var.g) {
            if (!v0Var.H && !r0Var.d && !r0Var.e) {
                r0Var.e = true;
                ((jy0) v0Var.e).b(r0Var.a, file.length(), file);
                v0Var.i.post(new h0(v0Var, r0Var, j3, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy0 iy0Var;
        iy0 iy0Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                v0 v0Var = this.b;
                r0 r0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i7 = v0Var.a0;
                if (i7 == 10 || i7 == 9) {
                    return;
                }
                v0Var.x(8);
                v0Var.m.b("output completed: generation=" + r0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                v0Var.m("completed");
                ff ffVar = v0Var.d;
                long j10 = r0Var.a;
                q40 q40Var = (q40) ffVar.b;
                p40 p40Var = q40Var.V;
                if (p40Var != null) {
                    q40Var.V = null;
                    q40Var.l0 = true;
                    jy0 jy0Var = q40Var.T;
                    if (jy0Var == null) {
                        iy0Var2 = null;
                    } else {
                        synchronized (jy0Var) {
                            try {
                                try {
                                    hy0 hy0Var = (hy0) jy0Var.c.get(Long.valueOf(j10));
                                    if (hy0Var == null || hy0Var.e) {
                                        iy0Var = new iy0(file.length(), null, null, null, null);
                                    } else {
                                        iy0Var = new iy0(Math.max(hy0Var.c, file.length()), hy0Var.f, hy0Var.g, hy0Var.h, hy0Var.i);
                                    }
                                    iy0Var2 = iy0Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                    }
                    g20 t6 = q40Var.t(file, j3, iy0Var2);
                    t6.t = !z10;
                    org.telegram.messenger.ff ffVar2 = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, true, 0, 0);
                    ffVar2.x = p40Var.c;
                    ffVar2.y = p40Var.d;
                    q40Var.e.u(ffVar2, t6, p40Var.a, p40Var.b, 0, false, p40Var.e);
                    jy0 jy0Var2 = q40Var.T;
                    if (jy0Var2 != null) {
                        jy0Var2.d(false);
                    }
                    q40Var.T = null;
                    MediaController.B().Y(false);
                    if (q40Var.a0) {
                        q40Var.a0 = false;
                        q40Var.P = null;
                    }
                }
                if (v0Var.G) {
                    v0Var.s();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h0(v0 v0Var, r0 r0Var, File file, long j3, boolean z10) {
        this.b = v0Var;
        this.c = r0Var;
        this.e = file;
        this.d = j3;
        this.f = z10;
    }
}
