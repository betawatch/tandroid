package si;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.y81;
import org.telegram.ui.gk;
import org.telegram.ui.pe;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ f0(u0 u0Var, long j10, int i10) {
        this.a = i10;
        this.b = u0Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        gk gkVar;
        y81 y81Var;
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                long j10 = this.c;
                if (u0Var.W == 6) {
                    u0Var.E = j10;
                    u0Var.K = 0L;
                    u0Var.G = 0L;
                    u0Var.H = j10;
                    u0Var.v(2);
                    u0Var.l.X(u0Var.Q, u0Var.E * 1000, u0Var.p);
                    break;
                }
                break;
            default:
                u0 u0Var2 = this.b;
                long j11 = this.c;
                if (u0Var2.W == 4) {
                    u0Var2.K = j11;
                    long min = Math.min(u0Var2.o, j11);
                    u0Var2.E = min;
                    u0Var2.G = 0L;
                    u0Var2.H = min;
                    u0Var2.b.setSurfaceTextureListener(null);
                    u0Var2.b.setTransform(u0Var2.h);
                    i2.h0 a2 = new i2.o(u0Var2.a).a();
                    u0Var2.S = a2;
                    a2.z1(u0Var2.b);
                    u0Var2.S.r0(b2.o0.b(Uri.fromFile(u0Var2.R)));
                    u0Var2.S.j(0);
                    u0Var2.S.U(1.0f);
                    u0Var2.S.p0(u0Var2.V);
                    u0Var2.S.b();
                    u0Var2.S.Z0(5, u0Var2.G);
                    u0Var2.m.b("preview player prepared: durationMs=" + u0Var2.E + ", trim=" + u0Var2.G + ".." + u0Var2.H);
                    u0Var2.v(5);
                    l2.f fVar = u0Var2.d;
                    long j12 = u0Var2.E;
                    long j13 = u0Var2.G;
                    long j14 = u0Var2.H;
                    ((m60) fVar.b).w.setProgress(((float) j12) / 60000.0f);
                    m60 m60Var = (m60) fVar.b;
                    m60Var.i0 = false;
                    m60Var.I.setAlpha(0.0f);
                    u0 u0Var3 = ((m60) fVar.b).P;
                    if (u0Var3 == null) {
                        file = null;
                    } else {
                        u0.t();
                        file = u0Var3.R;
                    }
                    if (file != null) {
                        m60 m60Var2 = (m60) fVar.b;
                        m60Var2.U = m60Var2.r(file, j12, null);
                        m60 m60Var3 = (m60) fVar.b;
                        VideoEditedInfo videoEditedInfo = m60Var3.U;
                        videoEditedInfo.startTime = j13 > 0 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter.getInstance(m60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((m60) fVar.b).n), ((m60) fVar.b).U, file.getAbsolutePath(), new ArrayList());
                        float max = Math.max(1L, j12);
                        m60 m60Var4 = (m60) fVar.b;
                        float f7 = j13 / max;
                        float f10 = j14 / max;
                        r60 r60Var = m60Var4.b;
                        if (r60Var != null && (gkVar = ((pe) r60Var).b.Y) != null && (y81Var = gkVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            y81Var.b = max2;
                            y81Var.c = Math.max(max2, Math.min(1.0f, f10));
                            y81Var.invalidate();
                        }
                    }
                    u0Var2.q();
                    break;
                }
                break;
        }
    }
}
