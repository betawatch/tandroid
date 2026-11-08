package org.telegram.utils.twidget;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class q0 implements ServiceConnection {
    public b a;
    public int b;
    public int c;
    public boolean d;
    public final j0 e = new j0(this, 2);
    public final /* synthetic */ r0 f;

    public q0(r0 r0Var) {
        this.f = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.utils.twidget.b] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a aVar;
        synchronized (this.f.b) {
            try {
                if (this.d) {
                    final int i7 = this.b + 1;
                    this.b = i7;
                    try {
                        iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: org.telegram.utils.twidget.p0
                            @Override // android.os.IBinder.DeathRecipient
                            public final void binderDied() {
                                int i10 = i7;
                                q0 q0Var = q0.this;
                                q0Var.f.g(q0Var, i10);
                            }
                        }, 0);
                        int i10 = z.b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                            a aVar2 = new a();
                            aVar2.a = iBinder;
                            aVar = aVar2;
                        } else {
                            aVar = (b) queryLocalInterface;
                        }
                        this.a = aVar;
                        if (this.f.h) {
                            try {
                                aVar.b1();
                            } catch (RemoteException unused) {
                            }
                        }
                        this.f.b.notifyAll();
                    } catch (RemoteException unused2) {
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i7;
        synchronized (this.f.b) {
            i7 = this.b;
        }
        this.f.g(this, i7);
    }
}
