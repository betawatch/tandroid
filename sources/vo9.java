// default package

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class vo9 extends s96 {
    public static final ArrayList Z = new ArrayList();
    public static final ArrayList a0 = new ArrayList();
    public bq9 O;
    public boolean P;
    public so9 Q;
    public long R;
    public long S;
    public long T;
    public aq9 U;
    public uo9 V;
    public volatile int W;
    public volatile int X;
    public u96 Y;

    /* JADX WARN: Multi-variable type inference failed */
    public static void I(aq9 aq9Var, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object[] objArr = 0;
        int i = 0;
        while (true) {
            ArrayList arrayList3 = Z;
            if (i >= arrayList3.size()) {
                break;
            }
            vo9 vo9Var = (vo9) arrayList3.get(i);
            if (vo9Var.U == aq9Var) {
                vo9Var.V = new uo9(vo9Var, aq9Var);
            }
            bq9 bq9Var = vo9Var.O;
            if (bq9Var != null) {
                arrayList.add(bq9Var);
                arrayList2.add(vo9Var.V);
            }
            i++;
        }
        ArrayList arrayList4 = new ArrayList(a0);
        int size = arrayList4.size() + arrayList.size();
        if (size == 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        qo9 qo9Var = new qo9(new int[]{size}, runnable, objArr == true ? 1 : 0);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((bq9) arrayList.get(i2)).l((aq9) arrayList2.get(i2), qo9Var);
        }
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            bq9 bq9Var2 = (bq9) arrayList4.get(i3);
            bq9Var2.getClass();
            if (!bq9Var2.b.post(new up9(bq9Var2, qo9Var, (byte) 1))) {
                qo9Var.run();
            }
        }
    }

    public final void J() {
        if (this.w) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.R;
        long min = j == 0 ? 4000L : Math.min(j << 1, 60000L);
        this.R = min;
        this.S = min + elapsedRealtime;
        this.T = elapsedRealtime;
        n();
    }

    public final void K() {
        if (this.w) {
            return;
        }
        byte b = 1;
        this.P = true;
        if (this.Q != null || this.F) {
            return;
        }
        long elapsedRealtime = this.S - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            J();
            return;
        }
        fc4.b("[LivePlayer] rejoin in " + elapsedRealtime + " ms");
        so9 so9Var = new so9(this, b);
        this.Q = so9Var;
        gm.d3(so9Var, elapsedRealtime);
    }

    public final void L(aq9 aq9Var) {
        if (this.U != aq9Var) {
            this.U = aq9Var;
            uo9 uo9Var = aq9Var != null ? new uo9(this, aq9Var) : null;
            this.V = uo9Var;
            bq9 bq9Var = this.O;
            if (bq9Var != null) {
                bq9Var.l(uo9Var, null);
            }
        }
    }

    @Override // s96
    public final void a() {
        bq9 bq9Var = this.O;
        if (bq9Var != null) {
            bq9Var.b.post(new ku(bq9Var, this.H, (byte) 5));
        }
    }

    @Override // s96
    public final void d() {
        L(null);
    }

    @Override // s96
    public final boolean q() {
        return true;
    }

    @Override // s96
    public final void t() {
        so9 so9Var = this.Q;
        if (so9Var != null) {
            gm.r(so9Var);
            this.Q = null;
        }
        byte b = 0;
        this.P = false;
        bq9 bq9Var = this.O;
        if (bq9Var != null) {
            this.O = null;
            this.V = null;
            a0.add(bq9Var);
            ro9 ro9Var = new ro9(bq9Var, b);
            if (!bq9Var.b.post(new up9(bq9Var, ro9Var, (byte) 1))) {
                ro9Var.run();
            }
        }
        Z.remove(this);
    }

    @Override // s96
    public final void v() {
        if (this.R == 0 || SystemClock.elapsedRealtime() - this.T < 60000) {
            return;
        }
        this.R = 0L;
        this.S = 0L;
    }

    @Override // s96
    public final void w(TLRPC.TL_error tL_error) {
        gm.c3(new il9(this, tL_error, (byte) 10));
    }

    @Override // s96
    public final void x() {
        K();
    }

    @Override // s96
    public final void y(TLRPC.TL_dataJSON tL_dataJSON, boolean z) {
        gm.c3(new so9(this, (byte) 0));
    }

    @Override // s96
    public final void z(boolean z) {
        bq9 bq9Var = this.O;
        if (bq9Var != null) {
            bq9Var.k(z);
        }
    }
}
