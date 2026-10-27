package vi;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import li.e3;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.jk;
import org.telegram.ui.qe;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        jk jkVar;
        i91 i91Var;
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                long j10 = this.c;
                if (u0Var.Z == 6) {
                    u0Var.H = j10;
                    u0Var.N = 0L;
                    u0Var.J = 0L;
                    u0Var.K = j10;
                    u0Var.w(2);
                    u0Var.l.X(u0Var.T, u0Var.H * 1000, u0Var.r);
                    break;
                }
                break;
            default:
                u0 u0Var2 = this.b;
                long j11 = this.c;
                if (u0Var2.Z == 4) {
                    u0Var2.N = j11;
                    long min = Math.min(u0Var2.q, j11);
                    u0Var2.H = min;
                    u0Var2.J = 0L;
                    u0Var2.K = min;
                    u0Var2.b.setSurfaceTextureListener(null);
                    u0Var2.b.setTransform(u0Var2.h);
                    i2.j0 a2 = new i2.o(u0Var2.a).a();
                    u0Var2.V = a2;
                    a2.z1(u0Var2.b);
                    u0Var2.V.r0(b2.p0.b(Uri.fromFile(u0Var2.U)));
                    u0Var2.V.j(0);
                    u0Var2.V.U(1.0f);
                    u0Var2.V.p0(u0Var2.Y);
                    u0Var2.V.a();
                    u0Var2.V.Z0(5, u0Var2.J);
                    u0Var2.m.b("preview player prepared: durationMs=" + u0Var2.H + ", trim=" + u0Var2.J + ".." + u0Var2.K);
                    u0Var2.w(5);
                    e3 e3Var = u0Var2.d;
                    long j12 = u0Var2.H;
                    long j13 = u0Var2.J;
                    long j14 = u0Var2.K;
                    ((o60) e3Var.b).v.setProgress(((float) j12) / 60000.0f);
                    o60 o60Var = (o60) e3Var.b;
                    o60Var.i0 = false;
                    o60Var.H.setAlpha(0.0f);
                    o60 o60Var2 = (o60) e3Var.b;
                    if (o60Var2.U == null) {
                        u0 u0Var3 = o60Var2.O;
                        if (u0Var3 == null) {
                            file = null;
                        } else {
                            u0.u();
                            file = u0Var3.U;
                        }
                        if (file != null) {
                            o60 o60Var3 = (o60) e3Var.b;
                            o60Var3.T = o60Var3.s(file, j12, null);
                            o60 o60Var4 = (o60) e3Var.b;
                            VideoEditedInfo videoEditedInfo = o60Var4.T;
                            videoEditedInfo.startTime = j13 > 0 ? j13 : -1L;
                            videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                            NotificationCenter.getInstance(o60Var4.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((o60) e3Var.b).h), ((o60) e3Var.b).T, file.getAbsolutePath(), new ArrayList());
                            float max = Math.max(1L, j12);
                            o60 o60Var5 = (o60) e3Var.b;
                            float f7 = j13 / max;
                            float f10 = j14 / max;
                            t60 t60Var = o60Var5.b;
                            if (t60Var != null && (jkVar = ((qe) t60Var).b.Y) != null && (i91Var = jkVar.f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                                i91Var.b = max2;
                                i91Var.c = Math.max(max2, Math.min(1.0f, f10));
                                i91Var.invalidate();
                            }
                        }
                    }
                    u0Var2.r();
                    break;
                }
                break;
        }
    }
}
