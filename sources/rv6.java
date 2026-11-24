// default package

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rv6 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ tv6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv6(tv6 tv6Var, Looper looper) {
        super(looper);
        this.c = tv6Var;
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
        tv6 tv6Var;
        boolean z;
        mm5 mm5Var;
        ps psVar;
        int i;
        su6 su6Var;
        eyb eybVar;
        boolean z2;
        int i2;
        tv6 tv6Var2 = this.c;
        ox6 ox6Var = tv6Var2.g;
        boolean z3 = true;
        if (message.what != 1) {
            fvc.d(message.what, "Invalid message what=");
            return;
        }
        wc8 wc8Var = tv6Var2.s;
        tv6Var2.t();
        aob T0 = tv6Var2.t.T0();
        tv6Var2.t();
        wc8 c = wc8Var.c(T0, tv6Var2.t.R0(), tv6Var2.s.k);
        tv6Var2.s = c;
        boolean z4 = this.a;
        boolean z5 = this.b;
        wc8 b0 = ox6Var.b0(c);
        mv6 mv6Var = ox6Var.b;
        wc8 a0 = ox6Var.a0(b0);
        eyb eybVar2 = a0.F;
        aob aobVar = a0.j;
        mm5 K = mv6Var.K();
        ps psVar2 = (ps) mv6Var.c;
        int i3 = 0;
        while (i3 < K.size()) {
            su6 su6Var2 = (su6) K.get(i3);
            try {
                if (mv6Var.V(su6Var2)) {
                    mv6Var.x0();
                    bs2 bs2Var = (bs2) psVar2.get(su6Var2);
                    bs2Var.getClass();
                    aob aobVar2 = bs2Var.h;
                    mv6Var.x0();
                    bs2 bs2Var2 = (bs2) psVar2.get(su6Var2);
                    bs2Var2.getClass();
                    eyb eybVar3 = bs2Var2.i;
                    boolean z6 = (z4 && aobVar.equals(aobVar2)) ? z3 : false;
                    if (z5 && eybVar2.equals(eybVar3)) {
                        eybVar = eybVar3;
                        z2 = z3;
                    } else {
                        eybVar = eybVar3;
                        z2 = false;
                    }
                    ny0 P = mv6Var.P(su6Var2);
                    if (P == null) {
                        if (!tv6Var2.g(su6Var2)) {
                            break;
                        } else {
                            i2 = 0;
                        }
                    } else {
                        i2 = P.d();
                    }
                    mv6Var.x0();
                    mv6Var.x0();
                    mv6Var.x0();
                    bs2 bs2Var3 = (bs2) psVar2.get(su6Var2);
                    kc8 kc8Var = bs2Var3 != null ? bs2Var3.e : null;
                    tv6Var2.t();
                    kc8 a = woe.a(kc8Var, tv6Var2.t.q());
                    mm5Var = K;
                    try {
                        ru6 ru6Var = su6Var2.e;
                        ru6Var.getClass();
                        z = z4;
                        su6Var = su6Var2;
                        boolean z7 = z6;
                        tv6Var = tv6Var2;
                        psVar = psVar2;
                        int i4 = i2;
                        i = i3;
                        try {
                            ru6Var.h(i4, a0, a, z7, z2);
                            aob aobVar3 = z7 ? aobVar2 : aobVar;
                            eyb eybVar4 = z2 ? eybVar : eybVar2;
                            mv6Var.x0();
                            bs2 bs2Var4 = (bs2) psVar.get(su6Var);
                            if (bs2Var4 != null) {
                                bs2Var4.h = aobVar3;
                                bs2Var4.i = eybVar4;
                            }
                        } catch (DeadObjectException unused) {
                            ox6Var.b.e0(su6Var);
                            i3 = i + 1;
                            z4 = z;
                            psVar2 = psVar;
                            K = mm5Var;
                            tv6Var2 = tv6Var;
                            z3 = true;
                        } catch (RemoteException e) {
                            e = e;
                            lad.g("MediaSessionImpl", "Exception in " + su6Var, e);
                            i3 = i + 1;
                            z4 = z;
                            psVar2 = psVar;
                            K = mm5Var;
                            tv6Var2 = tv6Var;
                            z3 = true;
                        }
                    } catch (DeadObjectException unused2) {
                        tv6Var = tv6Var2;
                        z = z4;
                        psVar = psVar2;
                        i = i3;
                        su6Var = su6Var2;
                        ox6Var.b.e0(su6Var);
                        i3 = i + 1;
                        z4 = z;
                        psVar2 = psVar;
                        K = mm5Var;
                        tv6Var2 = tv6Var;
                        z3 = true;
                    } catch (RemoteException e2) {
                        e = e2;
                        tv6Var = tv6Var2;
                        z = z4;
                        psVar = psVar2;
                        i = i3;
                        su6Var = su6Var2;
                        lad.g("MediaSessionImpl", "Exception in " + su6Var, e);
                        i3 = i + 1;
                        z4 = z;
                        psVar2 = psVar;
                        K = mm5Var;
                        tv6Var2 = tv6Var;
                        z3 = true;
                    }
                } else {
                    tv6Var = tv6Var2;
                    z = z4;
                    mm5Var = K;
                    psVar = psVar2;
                    i = i3;
                }
            } catch (DeadObjectException unused3) {
                tv6Var = tv6Var2;
                z = z4;
                mm5Var = K;
            } catch (RemoteException e3) {
                e = e3;
                tv6Var = tv6Var2;
                z = z4;
                mm5Var = K;
            }
            i3 = i + 1;
            z4 = z;
            psVar2 = psVar;
            K = mm5Var;
            tv6Var2 = tv6Var;
            z3 = true;
        }
        boolean z8 = z3;
        this.a = z8;
        this.b = z8;
    }
}
