// default package

import android.os.SystemClock;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pq5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q b;

    public /* synthetic */ pq5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn9 tn9Var;
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                tn9 tn9Var2 = qVar.S;
                if (tn9Var2 != null && tn9Var2.a == 3) {
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
                un9 un9Var = qVar.Q;
                if (un9Var != null && (tn9Var = qVar.S) != null) {
                    if (tn9Var.a != 3) {
                        if (tn9Var.e) {
                            un9Var.p();
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
