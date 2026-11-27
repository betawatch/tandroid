// default package

import android.os.SystemClock;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y0d(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = (z) this.c;
                boolean z = this.b;
                if (!zVar.A && zVar.v != 0) {
                    zVar.v = 0L;
                    boolean z2 = false;
                    zVar.o.set(false);
                    zVar.U = "Widget engine stopped";
                    q0d q0dVar = zVar.R;
                    if (q0dVar != null) {
                        if (!z) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - q0dVar.C > 60000) {
                                q0dVar.C = elapsedRealtime;
                                q0dVar.B = 0;
                            }
                            if (q0dVar.n) {
                                int i = q0dVar.B;
                                q0dVar.B = i + 1;
                                if (i < 2) {
                                    z2 = true;
                                }
                            }
                            q0dVar.n();
                            if (q0dVar.d != null) {
                                z3f.n(q0dVar, z2);
                            } else if (z2) {
                                q0dVar.a();
                            }
                            if (!z2) {
                                q0dVar.g("Widget engine stopped");
                                break;
                            }
                        } else {
                            if (q0dVar.n && q0dVar.m && !q0dVar.o) {
                                z2 = true;
                            }
                            q0dVar.n();
                            if (z2) {
                                if (q0dVar.d == null) {
                                    q0dVar.a();
                                    break;
                                } else {
                                    z3f.n(q0dVar, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                dx7 dx7Var = (dx7) this.c;
                if (!this.b) {
                    dx7Var.H0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
