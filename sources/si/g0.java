package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.y01;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ o0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ g0(s0 s0Var, o0 o0Var, long j10, File file, boolean z10) {
        this.b = s0Var;
        this.c = o0Var;
        this.d = j10;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        s0 s0Var = this.b;
        o0 o0Var = this.c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f;
        synchronized (s0Var.g) {
            if (!s0Var.D && !o0Var.d && !o0Var.e) {
                o0Var.e = true;
                ((y01) s0Var.e).b(o0Var.a, file.length(), file);
                s0Var.i.post(new g0(s0Var, o0Var, j10, file, z10));
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
                s0 s0Var = this.b;
                o0 o0Var = this.c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = s0Var.W;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                s0Var.v(8);
                s0Var.m.b("output completed: generation=" + o0Var.a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                s0Var.m("completed");
                l2.f fVar = s0Var.d;
                long j11 = o0Var.a;
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

    public /* synthetic */ g0(s0 s0Var, o0 o0Var, File file, long j10, boolean z10) {
        this.b = s0Var;
        this.c = o0Var;
        this.e = file;
        this.d = j10;
        this.f = z10;
    }
}
