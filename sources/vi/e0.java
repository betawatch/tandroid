package vi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import li.e3;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.s60;
import org.telegram.ui.hk;
import org.telegram.ui.pe;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ e0(s0 s0Var, long j10, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        hk hkVar;
        h91 h91Var;
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                long j10 = this.c;
                if (s0Var.W == 6) {
                    s0Var.E = j10;
                    s0Var.K = 0L;
                    s0Var.G = 0L;
                    s0Var.H = j10;
                    s0Var.v(2);
                    s0Var.l.X(s0Var.Q, s0Var.E * 1000, s0Var.p);
                    break;
                }
                break;
            default:
                s0 s0Var2 = this.b;
                long j11 = this.c;
                if (s0Var2.W == 4) {
                    s0Var2.K = j11;
                    long min = Math.min(s0Var2.o, j11);
                    s0Var2.E = min;
                    s0Var2.G = 0L;
                    s0Var2.H = min;
                    s0Var2.b.setSurfaceTextureListener(null);
                    s0Var2.b.setTransform(s0Var2.h);
                    i2.j0 a2 = new i2.o(s0Var2.a).a();
                    s0Var2.S = a2;
                    a2.z1(s0Var2.b);
                    s0Var2.S.r0(b2.p0.b(Uri.fromFile(s0Var2.R)));
                    s0Var2.S.j(0);
                    s0Var2.S.U(1.0f);
                    s0Var2.S.p0(s0Var2.V);
                    s0Var2.S.a();
                    s0Var2.S.Z0(5, s0Var2.G);
                    s0Var2.m.b("preview player prepared: durationMs=" + s0Var2.E + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.v(5);
                    e3 e3Var = s0Var2.d;
                    long j12 = s0Var2.E;
                    long j13 = s0Var2.G;
                    long j14 = s0Var2.H;
                    ((n60) e3Var.b).w.setProgress(((float) j12) / 60000.0f);
                    n60 n60Var = (n60) e3Var.b;
                    n60Var.i0 = false;
                    n60Var.I.setAlpha(0.0f);
                    s0 s0Var3 = ((n60) e3Var.b).P;
                    if (s0Var3 == null) {
                        file = null;
                    } else {
                        s0.t();
                        file = s0Var3.R;
                    }
                    if (file != null) {
                        n60 n60Var2 = (n60) e3Var.b;
                        n60Var2.U = n60Var2.r(file, j12, null);
                        n60 n60Var3 = (n60) e3Var.b;
                        VideoEditedInfo videoEditedInfo = n60Var3.U;
                        videoEditedInfo.startTime = j13 > 0 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter.getInstance(n60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((n60) e3Var.b).n), ((n60) e3Var.b).U, file.getAbsolutePath(), new ArrayList());
                        float max = Math.max(1L, j12);
                        n60 n60Var4 = (n60) e3Var.b;
                        float f7 = j13 / max;
                        float f10 = j14 / max;
                        s60 s60Var = n60Var4.b;
                        if (s60Var != null && (hkVar = ((pe) s60Var).b.Y) != null && (h91Var = hkVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            h91Var.b = max2;
                            h91Var.c = Math.max(max2, Math.min(1.0f, f10));
                            h91Var.invalidate();
                        }
                    }
                    s0Var2.q();
                    break;
                }
                break;
        }
    }
}
