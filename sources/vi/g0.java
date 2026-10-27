package vi;

import java.io.File;
import li.e3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.o60;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            if (!u0Var.G && !q0Var.d && !q0Var.e) {
                q0Var.e = true;
                ((m11) u0Var.e).b(q0Var.a, file.length(), file);
                u0Var.i.post(new g0(u0Var, q0Var, j10, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        l11 l11Var;
        l11 l11Var2;
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
                int i10 = u0Var.Z;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                u0Var.w(8);
                u0Var.m.b("output completed: generation=" + q0Var.a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                u0Var.m("completed");
                e3 e3Var = u0Var.d;
                long j11 = q0Var.a;
                o60 o60Var = (o60) e3Var.b;
                n60 n60Var = o60Var.U;
                if (n60Var == null) {
                    return;
                }
                o60Var.U = null;
                o60Var.j0 = true;
                m11 m11Var = o60Var.S;
                if (m11Var == null) {
                    l11Var2 = null;
                } else {
                    synchronized (m11Var) {
                        k11 k11Var = (k11) m11Var.c.get(Long.valueOf(j11));
                        if (k11Var != null && !k11Var.e) {
                            l11Var = new l11(Math.max(k11Var.c, file.length()), k11Var.f, k11Var.g, k11Var.h, k11Var.i);
                        }
                        l11Var = new l11(file.length(), null, null, null, null);
                    }
                    l11Var2 = l11Var;
                }
                VideoEditedInfo s10 = o60Var.s(file, j10, l11Var2);
                s10.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = n60Var.c;
                photoEntry.effectId = n60Var.d;
                o60Var.e.r(photoEntry, s10, n60Var.a, n60Var.b, 0, false, n60Var.e);
                m11 m11Var2 = o60Var.S;
                if (m11Var2 != null) {
                    m11Var2.d(false);
                }
                o60Var.S = null;
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
