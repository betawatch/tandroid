// default package

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class to3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vo3 b;

    public /* synthetic */ to3(vo3 vo3Var, byte b) {
        this.a = b;
        this.b = vo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vo3 vo3Var = this.b;
                if (!vo3Var.h && !vo3Var.g) {
                    vo3Var.e.postDelayed(this, 700L);
                    if (!vo3Var.r && DictationLid.c != 0) {
                        int c = vo3Var.k.c();
                        if (c - vo3Var.u >= 16000) {
                            vo3Var.u = c;
                            vo3Var.r = true;
                            byte[] b = vo3Var.k.b(0, c);
                            DictationLid.a.execute(new rd3(b, new qy1(this, b, (byte) 14), (byte) 23));
                            break;
                        }
                    }
                }
                break;
            default:
                vo3 vo3Var2 = this.b;
                if (!vo3Var2.h) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - vo3Var2.D;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < vo3Var2.B) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    vo3Var2.c.d(Math.max(0.0f, Math.min(1.0f, sin)));
                    vo3Var2.e.postDelayed(this, 50L);
                    break;
                }
                break;
        }
    }
}
