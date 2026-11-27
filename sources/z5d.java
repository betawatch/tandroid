// default package

import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class z5d implements k05, l05 {
    public final /* synthetic */ a6d a;

    public /* synthetic */ z5d(a6d a6dVar) {
        this.a = a6dVar;
    }

    @Override // k05
    public final void onConnected(Bundle bundle) {
        a6d a6dVar = this.a;
        xve.h(a6dVar.I);
        xka xkaVar = a6dVar.w;
        xve.h(xkaVar);
        xkaVar.B(new y5d(a6dVar));
    }

    @Override // l05
    public final void onConnectionFailed(ws2 ws2Var) {
        a6d a6dVar = this.a;
        ReentrantLock reentrantLock = a6dVar.b;
        reentrantLock.lock();
        try {
            if (a6dVar.x && !ws2Var.b()) {
                a6dVar.f();
                a6dVar.b();
            } else {
                a6dVar.g(ws2Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k05
    public final void onConnectionSuspended(int i) {
    }
}
