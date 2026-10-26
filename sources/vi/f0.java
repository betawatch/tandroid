package vi;

import java.io.File;
import li.e3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n60;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ o0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ f0(s0 s0Var, o0 o0Var, long j10, File file, boolean z10) {
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
                ((l11) s0Var.e).b(o0Var.a, file.length(), file);
                s0Var.i.post(new f0(s0Var, o0Var, j10, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        k11 k11Var;
        k11 k11Var2;
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
                e3 e3Var = s0Var.d;
                long j11 = o0Var.a;
                n60 n60Var = (n60) e3Var.b;
                m60 m60Var = n60Var.V;
                if (m60Var == null) {
                    return;
                }
                n60Var.V = null;
                n60Var.j0 = true;
                l11 l11Var = n60Var.T;
                if (l11Var == null) {
                    k11Var2 = null;
                } else {
                    synchronized (l11Var) {
                        j11 j11Var = (j11) l11Var.c.get(Long.valueOf(j11));
                        if (j11Var != null && !j11Var.e) {
                            k11Var = new k11(Math.max(j11Var.c, file.length()), j11Var.f, j11Var.g, j11Var.h, j11Var.i);
                        }
                        k11Var = new k11(file.length(), null, null, null, null);
                    }
                    k11Var2 = k11Var;
                }
                VideoEditedInfo r6 = n60Var.r(file, j10, k11Var2);
                r6.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = m60Var.c;
                photoEntry.effectId = m60Var.d;
                n60Var.f.r(photoEntry, r6, m60Var.a, m60Var.b, 0, false, m60Var.e);
                l11 l11Var2 = n60Var.T;
                if (l11Var2 != null) {
                    l11Var2.d(false);
                }
                n60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ f0(s0 s0Var, o0 o0Var, File file, long j10, boolean z10) {
        this.b = s0Var;
        this.c = o0Var;
        this.e = file;
        this.d = j10;
        this.f = z10;
    }
}
