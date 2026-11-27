// default package

import android.os.SystemClock;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class sq5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q b;

    public /* synthetic */ sq5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ip9 ip9Var;
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                ip9 ip9Var2 = qVar.S;
                if (ip9Var2 != null && ip9Var2.a == 3) {
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
                jp9 jp9Var = qVar.Q;
                if (jp9Var != null && (ip9Var = qVar.S) != null) {
                    if (ip9Var.a != 3) {
                        if (ip9Var.e) {
                            jp9Var.p();
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
