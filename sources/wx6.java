// default package

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wx6 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ yx6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx6(yx6 yx6Var, Looper looper) {
        super(looper);
        this.c = yx6Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        yx6 yx6Var;
        boolean z;
        po5 po5Var;
        qs qsVar;
        int i;
        xw6 xw6Var;
        f2c f2cVar;
        boolean z2;
        int i2;
        yx6 yx6Var2 = this.c;
        sz6 sz6Var = yx6Var2.g;
        boolean z3 = true;
        if (message.what != 1) {
            p3d.e(message.what, "Invalid message what=");
            return;
        }
        kg8 kg8Var = yx6Var2.s;
        yx6Var2.t();
        asb T0 = yx6Var2.t.T0();
        yx6Var2.t();
        kg8 c = kg8Var.c(T0, yx6Var2.t.R0(), yx6Var2.s.k);
        yx6Var2.s = c;
        boolean z4 = this.a;
        boolean z5 = this.b;
        kg8 b0 = sz6Var.b0(c);
        rx6 rx6Var = sz6Var.b;
        kg8 a0 = sz6Var.a0(b0);
        f2c f2cVar2 = a0.F;
        asb asbVar = a0.j;
        po5 L = rx6Var.L();
        qs qsVar2 = (qs) rx6Var.c;
        int i3 = 0;
        while (i3 < L.size()) {
            xw6 xw6Var2 = (xw6) L.get(i3);
            try {
                if (rx6Var.Y(xw6Var2)) {
                    rx6Var.D0();
                    us2 us2Var = (us2) qsVar2.get(xw6Var2);
                    us2Var.getClass();
                    asb asbVar2 = us2Var.h;
                    rx6Var.D0();
                    us2 us2Var2 = (us2) qsVar2.get(xw6Var2);
                    us2Var2.getClass();
                    f2c f2cVar3 = us2Var2.i;
                    boolean z6 = (z4 && asbVar.equals(asbVar2)) ? z3 : false;
                    if (z5 && f2cVar2.equals(f2cVar3)) {
                        f2cVar = f2cVar3;
                        z2 = z3;
                    } else {
                        f2cVar = f2cVar3;
                        z2 = false;
                    }
                    vy0 Q = rx6Var.Q(xw6Var2);
                    if (Q == null) {
                        if (!yx6Var2.g(xw6Var2)) {
                            break;
                        } else {
                            i2 = 0;
                        }
                    } else {
                        i2 = Q.d();
                    }
                    rx6Var.D0();
                    rx6Var.D0();
                    rx6Var.D0();
                    us2 us2Var3 = (us2) qsVar2.get(xw6Var2);
                    zf8 zf8Var = us2Var3 != null ? us2Var3.e : null;
                    yx6Var2.t();
                    zf8 a = ote.a(zf8Var, yx6Var2.t.q());
                    po5Var = L;
                    try {
                        ww6 ww6Var = xw6Var2.e;
                        ww6Var.getClass();
                        z = z4;
                        xw6Var = xw6Var2;
                        boolean z7 = z6;
                        yx6Var = yx6Var2;
                        qsVar = qsVar2;
                        int i4 = i2;
                        i = i3;
                        try {
                            ww6Var.h(i4, a0, a, z7, z2);
                            asb asbVar3 = z7 ? asbVar2 : asbVar;
                            f2c f2cVar4 = z2 ? f2cVar : f2cVar2;
                            rx6Var.D0();
                            us2 us2Var4 = (us2) qsVar.get(xw6Var);
                            if (us2Var4 != null) {
                                us2Var4.h = asbVar3;
                                us2Var4.i = f2cVar4;
                            }
                        } catch (DeadObjectException unused) {
                            sz6Var.b.k0(xw6Var);
                            i3 = i + 1;
                            z4 = z;
                            qsVar2 = qsVar;
                            L = po5Var;
                            yx6Var2 = yx6Var;
                            z3 = true;
                        } catch (RemoteException e) {
                            e = e;
                            efd.g("MediaSessionImpl", "Exception in " + xw6Var, e);
                            i3 = i + 1;
                            z4 = z;
                            qsVar2 = qsVar;
                            L = po5Var;
                            yx6Var2 = yx6Var;
                            z3 = true;
                        }
                    } catch (DeadObjectException unused2) {
                        yx6Var = yx6Var2;
                        z = z4;
                        qsVar = qsVar2;
                        i = i3;
                        xw6Var = xw6Var2;
                        sz6Var.b.k0(xw6Var);
                        i3 = i + 1;
                        z4 = z;
                        qsVar2 = qsVar;
                        L = po5Var;
                        yx6Var2 = yx6Var;
                        z3 = true;
                    } catch (RemoteException e2) {
                        e = e2;
                        yx6Var = yx6Var2;
                        z = z4;
                        qsVar = qsVar2;
                        i = i3;
                        xw6Var = xw6Var2;
                        efd.g("MediaSessionImpl", "Exception in " + xw6Var, e);
                        i3 = i + 1;
                        z4 = z;
                        qsVar2 = qsVar;
                        L = po5Var;
                        yx6Var2 = yx6Var;
                        z3 = true;
                    }
                } else {
                    yx6Var = yx6Var2;
                    z = z4;
                    po5Var = L;
                    qsVar = qsVar2;
                    i = i3;
                }
            } catch (DeadObjectException unused3) {
                yx6Var = yx6Var2;
                z = z4;
                po5Var = L;
            } catch (RemoteException e3) {
                e = e3;
                yx6Var = yx6Var2;
                z = z4;
                po5Var = L;
            }
            i3 = i + 1;
            z4 = z;
            qsVar2 = qsVar;
            L = po5Var;
            yx6Var2 = yx6Var;
            z3 = true;
        }
        boolean z8 = z3;
        this.a = z8;
        this.b = z8;
    }
}
