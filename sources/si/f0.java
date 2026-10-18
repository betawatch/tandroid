package si;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.q60;
import org.telegram.ui.hk;
import org.telegram.ui.re;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ f0(s0 s0Var, long j10, int i10) {
        this.a = i10;
        this.b = s0Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        hk hkVar;
        p81 p81Var;
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
                    i2.h0 a2 = new i2.o(s0Var2.a).a();
                    s0Var2.S = a2;
                    a2.z1(s0Var2.b);
                    s0Var2.S.r0(b2.o0.b(Uri.fromFile(s0Var2.R)));
                    s0Var2.S.j(0);
                    s0Var2.S.U(1.0f);
                    s0Var2.S.p0(s0Var2.V);
                    s0Var2.S.b();
                    s0Var2.S.Z0(5, s0Var2.G);
                    s0Var2.m.b("preview player prepared: durationMs=" + s0Var2.E + ", trim=" + s0Var2.G + ".." + s0Var2.H);
                    s0Var2.v(5);
                    l2.f fVar = s0Var2.d;
                    long j12 = s0Var2.E;
                    long j13 = s0Var2.G;
                    long j14 = s0Var2.H;
                    ((l60) fVar.b).w.setProgress(((float) j12) / 60000.0f);
                    l60 l60Var = (l60) fVar.b;
                    l60Var.i0 = false;
                    l60Var.I.setAlpha(0.0f);
                    s0 s0Var3 = ((l60) fVar.b).P;
                    if (s0Var3 == null) {
                        file = null;
                    } else {
                        s0.t();
                        file = s0Var3.R;
                    }
                    if (file != null) {
                        l60 l60Var2 = (l60) fVar.b;
                        l60Var2.U = l60Var2.r(file, j12, null);
                        l60 l60Var3 = (l60) fVar.b;
                        VideoEditedInfo videoEditedInfo = l60Var3.U;
                        videoEditedInfo.startTime = j13 > 0 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter.getInstance(l60Var3.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(((l60) fVar.b).n), ((l60) fVar.b).U, file.getAbsolutePath(), new ArrayList());
                        float max = Math.max(1L, j12);
                        l60 l60Var4 = (l60) fVar.b;
                        float f7 = j13 / max;
                        float f10 = j14 / max;
                        q60 q60Var = l60Var4.b;
                        if (q60Var != null && (hkVar = ((re) q60Var).b.Y) != null && (p81Var = hkVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            p81Var.b = max2;
                            p81Var.c = Math.max(max2, Math.min(1.0f, f10));
                            p81Var.invalidate();
                        }
                    }
                    s0Var2.q();
                    break;
                }
                break;
        }
    }
}
