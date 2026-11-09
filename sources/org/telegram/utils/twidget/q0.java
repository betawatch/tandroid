package org.telegram.utils.twidget;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class q0 implements ServiceConnection {
    public b a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public final j0 f = new j0(this, 2);
    public final /* synthetic */ r0 h;

    public q0(r0 r0Var) {
        this.h = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.utils.twidget.b] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a aVar;
        synchronized (this.h.b) {
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
                                q0Var.h.i(q0Var, i10);
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
                        if (this.e) {
                            try {
                                aVar.b1();
                            } catch (RemoteException unused) {
                            }
                        }
                        this.h.b.notifyAll();
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
        synchronized (this.h.b) {
            i7 = this.b;
        }
        this.h.i(this, i7);
    }
}
