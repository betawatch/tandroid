// default package

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pbd extends o59 {
    public final /* synthetic */ gg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbd(gg0 gg0Var, Looper looper) {
        super(looper, (byte) 4);
        this.a = gg0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        n4d n4dVar;
        gg0 gg0Var = this.a;
        int i = gg0Var.C.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (n4dVar = (n4d) message.obj) != null) {
                n4dVar.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !gg0Var.r()) {
            n4d n4dVar2 = (n4d) message.obj;
            if (n4dVar2 != null) {
                n4dVar2.c();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            gg0Var.z = new ds2(message.arg2, null, null);
            if (!gg0Var.A) {
                TextUtils.isEmpty(gg0Var.l());
            }
            ds2 ds2Var = gg0Var.z;
            if (ds2Var == null) {
                ds2Var = new ds2(8, null, null);
            }
            gg0Var.o.a(ds2Var);
            gg0Var.s(ds2Var);
            return;
        }
        if (i4 == 5) {
            ds2 ds2Var2 = gg0Var.z;
            if (ds2Var2 == null) {
                ds2Var2 = new ds2(8, null, null);
            }
            gg0Var.o.a(ds2Var2);
            gg0Var.s(ds2Var2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            ds2 ds2Var3 = new ds2(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            gg0Var.o.a(ds2Var3);
            gg0Var.s(ds2Var3);
            return;
        }
        if (i4 == 6) {
            gg0Var.A(5, null);
            ln8 ln8Var = gg0Var.t;
            if (ln8Var != null) {
                ((ey4) ln8Var.b).onConnectionSuspended(message.arg2);
            }
            gg0Var.t(message.arg2);
            gg0Var.y(5, 1, null);
            return;
        }
        if (i4 == 2 && !gg0Var.q()) {
            n4d n4dVar3 = (n4d) message.obj;
            if (n4dVar3 != null) {
                n4dVar3.c();
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
        n4d n4dVar4 = (n4d) message.obj;
        synchronized (n4dVar4) {
            bool = n4dVar4.a;
            if (n4dVar4.b) {
                String obj2 = n4dVar4.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(obj2);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (bool != null) {
            gg0 gg0Var2 = n4dVar4.f;
            int i6 = n4dVar4.d;
            if (i6 != 0) {
                gg0Var2.A(1, null);
                Bundle bundle = n4dVar4.e;
                n4dVar4.b(new ds2(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!n4dVar4.a()) {
                gg0Var2.A(1, null);
                n4dVar4.b(new ds2(8, null, null));
            }
        }
        synchronized (n4dVar4) {
            n4dVar4.b = true;
        }
        n4dVar4.c();
    }
}
