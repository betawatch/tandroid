// default package

import android.os.SystemClock;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class po5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q b;

    public /* synthetic */ po5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl9 tl9Var;
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                tl9 tl9Var2 = qVar.S;
                if (tl9Var2 != null && tl9Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j = qVar.I0;
                    if (j == 0 || elapsedRealtimeNanos - j >= 70000000) {
                        qVar.B();
                        break;
                    }
                }
                break;
            case 1:
                int i = q.N0;
                qVar.k();
                break;
            default:
                int i2 = q.N0;
                ul9 ul9Var = qVar.Q;
                if (ul9Var != null && (tl9Var = qVar.S) != null) {
                    if (tl9Var.a != 3) {
                        if (tl9Var.e) {
                            ul9Var.p();
                            break;
                        }
                    } else {
                        qVar.r();
                        break;
                    }
                }
                break;
        }
    }
}
