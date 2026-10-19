package si;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                ((z01) s0Var.e).b(o0Var.a, file.length(), file);
                s0Var.i.post(new g0(s0Var, o0Var, j10, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        y01 y01Var;
        y01 y01Var2;
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
                z01 z01Var = l60Var.T;
                if (z01Var == null) {
                    y01Var2 = null;
                } else {
                    synchronized (z01Var) {
                        x01 x01Var = (x01) z01Var.c.get(Long.valueOf(j11));
                        if (x01Var != null && !x01Var.e) {
                            y01Var = new y01(Math.max(x01Var.c, file.length()), x01Var.f, x01Var.g, x01Var.h, x01Var.i);
                        }
                        y01Var = new y01(file.length(), null, null, null, null);
                    }
                    y01Var2 = y01Var;
                }
                VideoEditedInfo r10 = l60Var.r(file, j10, y01Var2);
                r10.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = k60Var.c;
                photoEntry.effectId = k60Var.d;
                l60Var.f.s(photoEntry, r10, k60Var.a, k60Var.b, 0, false, k60Var.e);
                z01 z01Var2 = l60Var.T;
                if (z01Var2 != null) {
                    z01Var2.d(false);
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
