package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ q0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ g0(u0 u0Var, q0 q0Var, long j10, File file, boolean z10) {
        this.b = u0Var;
        this.c = q0Var;
        this.d = j10;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        u0 u0Var = this.b;
        q0 q0Var = this.c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f;
        synchronized (u0Var.g) {
            if (!u0Var.D && !q0Var.d && !q0Var.e) {
                q0Var.e = true;
                ((d11) u0Var.e).b(q0Var.a, file.length(), file);
                u0Var.i.post(new g0(u0Var, q0Var, j10, file, z10));
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
                u0 u0Var = this.b;
                q0 q0Var = this.c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = u0Var.W;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                u0Var.v(8);
                u0Var.m.b("output completed: generation=" + q0Var.a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                u0Var.m("completed");
                l2.f fVar = u0Var.d;
                long j11 = q0Var.a;
                m60 m60Var = (m60) fVar.b;
                l60 l60Var = m60Var.V;
                if (l60Var == null) {
                    return;
                }
                m60Var.V = null;
                m60Var.j0 = true;
                d11 d11Var = m60Var.T;
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
                VideoEditedInfo r10 = m60Var.r(file, j10, c11Var2);
                r10.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = l60Var.c;
                photoEntry.effectId = l60Var.d;
                m60Var.f.s(photoEntry, r10, l60Var.a, l60Var.b, 0, false, l60Var.e);
                d11 d11Var2 = m60Var.T;
                if (d11Var2 != null) {
                    d11Var2.d(false);
                }
                m60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ g0(u0 u0Var, q0 q0Var, File file, long j10, boolean z10) {
        this.b = u0Var;
        this.c = q0Var;
        this.e = file;
        this.d = j10;
        this.f = z10;
    }
}
