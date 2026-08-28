package x5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import c2.u0;
import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 extends u0 {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g gVar, Looper looper) {
        super(looper, 6);
        this.a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.a.N.get() != message.arg1) {
            int i9 = message.what;
            if (i9 == 2 || i9 == 1 || i9 == 7) {
                w wVar = (w) message.obj;
                wVar.getClass();
                wVar.d();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || i10 == 4 || i10 == 5) && !this.a.f()) {
            w wVar2 = (w) message.obj;
            wVar2.getClass();
            wVar2.d();
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            g gVar = this.a;
            gVar.K = new u5.a(message.arg2);
            if (!gVar.L && !TextUtils.isEmpty(gVar.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(gVar.v());
                    g gVar2 = this.a;
                    if (!gVar2.L) {
                        gVar2.F(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            g gVar3 = this.a;
            u5.a aVar = gVar3.K;
            if (aVar == null) {
                aVar = new u5.a(8);
            }
            gVar3.A.a(aVar);
            this.a.z(aVar);
            return;
        }
        if (i11 == 5) {
            g gVar4 = this.a;
            u5.a aVar2 = gVar4.K;
            if (aVar2 == null) {
                aVar2 = new u5.a(8);
            }
            gVar4.A.a(aVar2);
            this.a.z(aVar2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            u5.a aVar3 = new u5.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.A.a(aVar3);
            this.a.z(aVar3);
            return;
        }
        if (i11 == 6) {
            this.a.F(5, null);
            m mVar = this.a.F;
            if (mVar != null) {
                ((com.google.android.gms.common.api.k) mVar.a).onConnectionSuspended(message.arg2);
            }
            this.a.A(message.arg2);
            g.E(this.a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.a.i()) {
            w wVar3 = (w) message.obj;
            wVar3.getClass();
            wVar3.d();
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            Log.wtf("GmsClient", r0.l(i12, "Don't know how to handle message: "), new Exception());
            return;
        }
        w wVar4 = (w) message.obj;
        synchronized (wVar4) {
            try {
                bool = wVar4.a;
                if (wVar4.b) {
                    Log.w("GmsClient", "Callback proxy " + wVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            g gVar5 = wVar4.f;
            int i13 = wVar4.d;
            if (i13 != 0) {
                gVar5.F(1, null);
                Bundle bundle = wVar4.e;
                wVar4.a(new u5.a(i13, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!wVar4.b()) {
                gVar5.F(1, null);
                wVar4.a(new u5.a(8, null));
            }
        }
        synchronized (wVar4) {
            wVar4.b = true;
        }
        wVar4.d();
    }
}
