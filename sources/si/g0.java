package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.y01;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ p0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ g0(t0 t0Var, p0 p0Var, long j10, File file, boolean z10) {
        this.b = t0Var;
        this.c = p0Var;
        this.d = j10;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        t0 t0Var = this.b;
        p0 p0Var = this.c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f;
        synchronized (t0Var.g) {
            if (!t0Var.D && !p0Var.d && !p0Var.e) {
                p0Var.e = true;
                ((y01) t0Var.e).b(p0Var.a, file.length(), file);
                t0Var.i.post(new g0(t0Var, p0Var, j10, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        x01 x01Var;
        x01 x01Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.b;
                p0 p0Var = this.c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = t0Var.W;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                t0Var.v(8);
                t0Var.m.b("output completed: generation=" + p0Var.a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                t0Var.m("completed");
                l2.f fVar = t0Var.d;
                long j11 = p0Var.a;
                l60 l60Var = (l60) fVar.b;
                k60 k60Var = l60Var.V;
                if (k60Var == null) {
                    return;
                }
                l60Var.V = null;
                l60Var.j0 = true;
                y01 y01Var = l60Var.T;
                if (y01Var == null) {
                    x01Var2 = null;
                } else {
                    synchronized (y01Var) {
                        w01 w01Var = (w01) y01Var.c.get(Long.valueOf(j11));
                        if (w01Var != null && !w01Var.e) {
                            x01Var = new x01(Math.max(w01Var.c, file.length()), w01Var.f, w01Var.g, w01Var.h, w01Var.i);
                        }
                        x01Var = new x01(file.length(), null, null, null, null);
                    }
                    x01Var2 = x01Var;
                }
                VideoEditedInfo r10 = l60Var.r(file, j10, x01Var2);
                r10.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = k60Var.c;
                photoEntry.effectId = k60Var.d;
                l60Var.f.r(photoEntry, r10, k60Var.a, k60Var.b, 0, false, k60Var.e);
                y01 y01Var2 = l60Var.T;
                if (y01Var2 != null) {
                    y01Var2.d(false);
                }
                l60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ g0(t0 t0Var, p0 p0Var, File file, long j10, boolean z10) {
        this.b = t0Var;
        this.c = p0Var;
        this.e = file;
        this.d = j10;
        this.f = z10;
    }
}
