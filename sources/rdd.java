// default package

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rdd extends q79 {
    public final /* synthetic */ hh0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdd(hh0 hh0Var, Looper looper) {
        super(looper, (byte) 4);
        this.a = hh0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        p6d p6dVar;
        hh0 hh0Var = this.a;
        int i = hh0Var.C.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (p6dVar = (p6d) message.obj) != null) {
                p6dVar.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !hh0Var.r()) {
            p6d p6dVar2 = (p6d) message.obj;
            if (p6dVar2 != null) {
                p6dVar2.c();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            hh0Var.z = new ot2(message.arg2, null, null);
            if (!hh0Var.A) {
                TextUtils.isEmpty(hh0Var.l());
            }
            ot2 ot2Var = hh0Var.z;
            if (ot2Var == null) {
                ot2Var = new ot2(8, null, null);
            }
            hh0Var.o.a(ot2Var);
            hh0Var.s(ot2Var);
            return;
        }
        if (i4 == 5) {
            ot2 ot2Var2 = hh0Var.z;
            if (ot2Var2 == null) {
                ot2Var2 = new ot2(8, null, null);
            }
            hh0Var.o.a(ot2Var2);
            hh0Var.s(ot2Var2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            ot2 ot2Var3 = new ot2(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            hh0Var.o.a(ot2Var3);
            hh0Var.s(ot2Var3);
            return;
        }
        if (i4 == 6) {
            hh0Var.A(5, null);
            cf9 cf9Var = hh0Var.t;
            if (cf9Var != null) {
                ((f05) cf9Var.b).onConnectionSuspended(message.arg2);
            }
            hh0Var.t(message.arg2);
            hh0Var.y(5, 1, null);
            return;
        }
        if (i4 == 2 && !hh0Var.q()) {
            p6d p6dVar3 = (p6d) message.obj;
            if (p6dVar3 != null) {
                p6dVar3.c();
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i5);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        p6d p6dVar4 = (p6d) message.obj;
        synchronized (p6dVar4) {
            bool = p6dVar4.a;
            if (p6dVar4.b) {
                String obj2 = p6dVar4.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(obj2);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (bool != null) {
            hh0 hh0Var2 = p6dVar4.f;
            int i6 = p6dVar4.d;
            if (i6 != 0) {
                hh0Var2.A(1, null);
                Bundle bundle = p6dVar4.e;
                p6dVar4.b(new ot2(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!p6dVar4.a()) {
                hh0Var2.A(1, null);
                p6dVar4.b(new ot2(8, null, null));
            }
        }
        synchronized (p6dVar4) {
            p6dVar4.b = true;
        }
        p6dVar4.c();
    }
}
