package q6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c0 extends com.google.android.gms.internal.cast.y {
    public final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d dVar, Looper looper) {
        super(looper, 4);
        this.a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        y yVar;
        d dVar = this.a;
        if (dVar.C.get() != message.arg1) {
            int i7 = message.what;
            if ((i7 == 2 || i7 == 1 || i7 == 7) && (yVar = (y) message.obj) != null) {
                yVar.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || i10 == 4 || i10 == 5) && !dVar.t()) {
            y yVar2 = (y) message.obj;
            if (yVar2 != null) {
                yVar2.c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            dVar.z = new n6.a(message.arg2, null, null);
            if (!dVar.A && !TextUtils.isEmpty(dVar.o()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(dVar.o());
                    if (!dVar.A) {
                        dVar.A(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            n6.a aVar = dVar.z;
            if (aVar == null) {
                aVar = new n6.a(8, null, null);
            }
            dVar.o.a(aVar);
            dVar.u(aVar);
            return;
        }
        if (i11 == 5) {
            n6.a aVar2 = dVar.z;
            if (aVar2 == null) {
                aVar2 = new n6.a(8, null, null);
            }
            dVar.o.a(aVar2);
            dVar.u(aVar2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            n6.a aVar3 = new n6.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            dVar.o.a(aVar3);
            dVar.u(aVar3);
            return;
        }
        if (i11 == 6) {
            dVar.A(5, null);
            n nVar = dVar.t;
            if (nVar != null) {
                ((com.google.android.gms.common.api.k) nVar.a).onConnectionSuspended(message.arg2);
            }
            dVar.v(message.arg2);
            dVar.y(5, 1, null);
            return;
        }
        if (i11 == 2 && !dVar.s()) {
            y yVar3 = (y) message.obj;
            if (yVar3 != null) {
                yVar3.c();
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i12);
            Log.wtf("GmsClient", sb2.toString(), new Exception());
            return;
        }
        y yVar4 = (y) message.obj;
        synchronized (yVar4) {
            try {
                bool = yVar4.a;
                if (yVar4.b) {
                    String obj2 = yVar4.toString();
                    StringBuilder sb3 = new StringBuilder(obj2.length() + 47);
                    sb3.append("Callback proxy ");
                    sb3.append(obj2);
                    sb3.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb3.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            d dVar2 = yVar4.f;
            int i13 = yVar4.d;
            if (i13 != 0) {
                dVar2.A(1, null);
                Bundle bundle = yVar4.e;
                yVar4.b(new n6.a(i13, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!yVar4.a()) {
                dVar2.A(1, null);
                yVar4.b(new n6.a(8, null, null));
            }
        }
        synchronized (yVar4) {
            yVar4.b = true;
        }
        yVar4.c();
    }
}
