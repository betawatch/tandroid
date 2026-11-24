// default package

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rx6 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ tx6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx6(tx6 tx6Var, Looper looper) {
        super(looper);
        this.c = tx6Var;
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
        tx6 tx6Var;
        boolean z;
        mo5 mo5Var;
        qt qtVar;
        int i;
        sw6 sw6Var;
        g0c g0cVar;
        boolean z2;
        int i2;
        tx6 tx6Var2 = this.c;
        oz6 oz6Var = tx6Var2.g;
        boolean z3 = true;
        if (message.what != 1) {
            i2d.e(message.what, "Invalid message what=");
            return;
        }
        ye8 ye8Var = tx6Var2.s;
        tx6Var2.t();
        bqb T0 = tx6Var2.t.T0();
        tx6Var2.t();
        ye8 c = ye8Var.c(T0, tx6Var2.t.R0(), tx6Var2.s.k);
        tx6Var2.s = c;
        boolean z4 = this.a;
        boolean z5 = this.b;
        ye8 b0 = oz6Var.b0(c);
        mx6 mx6Var = oz6Var.b;
        ye8 a0 = oz6Var.a0(b0);
        g0c g0cVar2 = a0.F;
        bqb bqbVar = a0.j;
        mo5 M = mx6Var.M();
        qt qtVar2 = (qt) mx6Var.c;
        int i3 = 0;
        while (i3 < M.size()) {
            sw6 sw6Var2 = (sw6) M.get(i3);
            try {
                if (mx6Var.X(sw6Var2)) {
                    mx6Var.C0();
                    mt2 mt2Var = (mt2) qtVar2.get(sw6Var2);
                    mt2Var.getClass();
                    bqb bqbVar2 = mt2Var.h;
                    mx6Var.C0();
                    mt2 mt2Var2 = (mt2) qtVar2.get(sw6Var2);
                    mt2Var2.getClass();
                    g0c g0cVar3 = mt2Var2.i;
                    boolean z6 = (z4 && bqbVar.equals(bqbVar2)) ? z3 : false;
                    if (z5 && g0cVar2.equals(g0cVar3)) {
                        g0cVar = g0cVar3;
                        z2 = z3;
                    } else {
                        g0cVar = g0cVar3;
                        z2 = false;
                    }
                    uz0 R = mx6Var.R(sw6Var2);
                    if (R == null) {
                        if (!tx6Var2.g(sw6Var2)) {
                            break;
                        } else {
                            i2 = 0;
                        }
                    } else {
                        i2 = R.d();
                    }
                    mx6Var.C0();
                    mx6Var.C0();
                    mx6Var.C0();
                    mt2 mt2Var3 = (mt2) qtVar2.get(sw6Var2);
                    ne8 ne8Var = mt2Var3 != null ? mt2Var3.e : null;
                    tx6Var2.t();
                    ne8 a = zqe.a(ne8Var, tx6Var2.t.q());
                    mo5Var = M;
                    try {
                        rw6 rw6Var = sw6Var2.e;
                        rw6Var.getClass();
                        z = z4;
                        sw6Var = sw6Var2;
                        boolean z7 = z6;
                        tx6Var = tx6Var2;
                        qtVar = qtVar2;
                        int i4 = i2;
                        i = i3;
                        try {
                            rw6Var.h(i4, a0, a, z7, z2);
                            bqb bqbVar3 = z7 ? bqbVar2 : bqbVar;
                            g0c g0cVar4 = z2 ? g0cVar : g0cVar2;
                            mx6Var.C0();
                            mt2 mt2Var4 = (mt2) qtVar.get(sw6Var);
                            if (mt2Var4 != null) {
                                mt2Var4.h = bqbVar3;
                                mt2Var4.i = g0cVar4;
                            }
                        } catch (DeadObjectException unused) {
                            oz6Var.b.i0(sw6Var);
                            i3 = i + 1;
                            z4 = z;
                            qtVar2 = qtVar;
                            M = mo5Var;
                            tx6Var2 = tx6Var;
                            z3 = true;
                        } catch (RemoteException e) {
                            e = e;
                            ncd.g("MediaSessionImpl", "Exception in " + sw6Var, e);
                            i3 = i + 1;
                            z4 = z;
                            qtVar2 = qtVar;
                            M = mo5Var;
                            tx6Var2 = tx6Var;
                            z3 = true;
                        }
                    } catch (DeadObjectException unused2) {
                        tx6Var = tx6Var2;
                        z = z4;
                        qtVar = qtVar2;
                        i = i3;
                        sw6Var = sw6Var2;
                        oz6Var.b.i0(sw6Var);
                        i3 = i + 1;
                        z4 = z;
                        qtVar2 = qtVar;
                        M = mo5Var;
                        tx6Var2 = tx6Var;
                        z3 = true;
                    } catch (RemoteException e2) {
                        e = e2;
                        tx6Var = tx6Var2;
                        z = z4;
                        qtVar = qtVar2;
                        i = i3;
                        sw6Var = sw6Var2;
                        ncd.g("MediaSessionImpl", "Exception in " + sw6Var, e);
                        i3 = i + 1;
                        z4 = z;
                        qtVar2 = qtVar;
                        M = mo5Var;
                        tx6Var2 = tx6Var;
                        z3 = true;
                    }
                } else {
                    tx6Var = tx6Var2;
                    z = z4;
                    mo5Var = M;
                    qtVar = qtVar2;
                    i = i3;
                }
            } catch (DeadObjectException unused3) {
                tx6Var = tx6Var2;
                z = z4;
                mo5Var = M;
            } catch (RemoteException e3) {
                e = e3;
                tx6Var = tx6Var2;
                z = z4;
                mo5Var = M;
            }
            i3 = i + 1;
            z4 = z;
            qtVar2 = qtVar;
            M = mo5Var;
            tx6Var2 = tx6Var;
            z3 = true;
        }
        boolean z8 = z3;
        this.a = z8;
        this.b = z8;
    }
}
