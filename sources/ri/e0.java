package ri;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.o60;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ e0(r0 r0Var, n0 n0Var, long j10, File file, boolean z10) {
        this.b = r0Var;
        this.c = n0Var;
        this.d = j10;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        r0 r0Var = this.b;
        n0 n0Var = this.c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f;
        synchronized (r0Var.g) {
            if (!r0Var.D && !n0Var.d && !n0Var.e) {
                n0Var.e = true;
                ((d11) r0Var.e).b(n0Var.a, file.length(), file);
                r0Var.i.post(new e0(r0Var, n0Var, j10, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        c11 c11Var;
        c11 c11Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                r0 r0Var = this.b;
                n0 n0Var = this.c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = r0Var.W;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                r0Var.v(8);
                r0Var.m.b("output completed: generation=" + n0Var.a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                r0Var.m("completed");
                m.h hVar = r0Var.d;
                long j11 = n0Var.a;
                o60 o60Var = (o60) hVar.b;
                n60 n60Var = o60Var.V;
                if (n60Var == null) {
                    return;
                }
                o60Var.V = null;
                o60Var.j0 = true;
                d11 d11Var = o60Var.T;
                if (d11Var == null) {
                    c11Var2 = null;
                } else {
                    synchronized (d11Var) {
                        b11 b11Var = (b11) d11Var.c.get(Long.valueOf(j11));
                        if (b11Var != null && !b11Var.e) {
                            c11Var = new c11(Math.max(b11Var.c, file.length()), b11Var.f, b11Var.g, b11Var.h, b11Var.i);
                        }
                        c11Var = new c11(file.length(), null, null, null, null);
                    }
                    c11Var2 = c11Var;
                }
                VideoEditedInfo r10 = o60Var.r(file, j10, c11Var2);
                r10.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = n60Var.c;
                photoEntry.effectId = n60Var.d;
                o60Var.f.s(photoEntry, r10, n60Var.a, n60Var.b, 0, false, n60Var.e);
                d11 d11Var2 = o60Var.T;
                if (d11Var2 != null) {
                    d11Var2.d(false);
                }
                o60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ e0(r0 r0Var, n0 n0Var, File file, long j10, boolean z10) {
        this.b = r0Var;
        this.c = n0Var;
        this.e = file;
        this.d = j10;
        this.f = z10;
    }
}
