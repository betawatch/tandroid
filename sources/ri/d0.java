package ri;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.y81;
import org.telegram.ui.sk;
import org.telegram.ui.xe;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ d0(r0 r0Var, long j10, int i10) {
        this.a = i10;
        this.b = r0Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        sk skVar;
        y81 y81Var;
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                long j10 = this.c;
                if (r0Var.W == 6) {
                    r0Var.E = j10;
                    r0Var.K = 0L;
                    r0Var.G = 0L;
                    r0Var.H = j10;
                    r0Var.v(2);
                    r0Var.l.X(r0Var.Q, r0Var.E * 1000, r0Var.p);
                    break;
                }
                break;
            default:
                r0 r0Var2 = this.b;
                long j11 = this.c;
                if (r0Var2.W == 4) {
                    r0Var2.K = j11;
                    long min = Math.min(r0Var2.o, j11);
                    r0Var2.E = min;
                    r0Var2.G = 0L;
                    r0Var2.H = min;
                    r0Var2.b.setSurfaceTextureListener(null);
                    r0Var2.b.setTransform(r0Var2.h);
                    i2.h0 a2 = new i2.o(r0Var2.a).a();
                    r0Var2.S = a2;
                    a2.z1(r0Var2.b);
                    r0Var2.S.r0(b2.p0.b(Uri.fromFile(r0Var2.R)));
                    r0Var2.S.j(0);
                    r0Var2.S.U(1.0f);
                    r0Var2.S.p0(r0Var2.V);
                    r0Var2.S.b();
                    r0Var2.S.Z0(5, r0Var2.G);
                    r0Var2.m.b("preview player prepared: durationMs=" + r0Var2.E + ", trim=" + r0Var2.G + ".." + r0Var2.H);
                    r0Var2.v(5);
                    m.h hVar = r0Var2.d;
                    long j12 = r0Var2.E;
                    long j13 = r0Var2.G;
                    long j14 = r0Var2.H;
                    ((o60) hVar.b).w.setProgress(((float) j12) / 60000.0f);
                    o60 o60Var = (o60) hVar.b;
                    o60Var.i0 = false;
                    o60Var.I.setAlpha(0.0f);
                    r0 r0Var3 = ((o60) hVar.b).P;
                    if (r0Var3 == null) {
                        file = null;
                    } else {
                        r0.t();
                        file = r0Var3.R;
                    }
                    if (file != null) {
                        o60 o60Var2 = (o60) hVar.b;
                        o60Var2.U = o60Var2.r(file, j12, null);
                        o60 o60Var3 = (o60) hVar.b;
                        VideoEditedInfo videoEditedInfo = o60Var3.U;
                        videoEditedInfo.startTime = j13 > 0 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter.getInstance(o60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((o60) hVar.b).n), ((o60) hVar.b).U, file.getAbsolutePath(), new ArrayList());
                        float max = Math.max(1L, j12);
                        o60 o60Var4 = (o60) hVar.b;
                        float f7 = j13 / max;
                        float f10 = j14 / max;
                        t60 t60Var = o60Var4.b;
                        if (t60Var != null && (skVar = ((xe) t60Var).b.Y) != null && (y81Var = skVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            y81Var.b = max2;
                            y81Var.c = Math.max(max2, Math.min(1.0f, f10));
                            y81Var.invalidate();
                        }
                    }
                    r0Var2.q();
                    break;
                }
                break;
        }
    }
}
