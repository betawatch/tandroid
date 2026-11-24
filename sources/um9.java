// default package

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class um9 extends t76 {
    public static final ArrayList Z = new ArrayList();
    public static final ArrayList a0 = new ArrayList();
    public ao9 O;
    public boolean P;
    public rm9 Q;
    public long R;
    public long S;
    public long T;
    public zn9 U;
    public tm9 V;
    public volatile int W;
    public volatile int X;
    public v76 Y;

    /* JADX WARN: Multi-variable type inference failed */
    public static void I(zn9 zn9Var, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object[] objArr = 0;
        int i = 0;
        while (true) {
            ArrayList arrayList3 = Z;
            if (i >= arrayList3.size()) {
                break;
            }
            um9 um9Var = (um9) arrayList3.get(i);
            if (um9Var.U == zn9Var) {
                um9Var.V = new tm9(um9Var, zn9Var);
            }
            ao9 ao9Var = um9Var.O;
            if (ao9Var != null) {
                arrayList.add(ao9Var);
                arrayList2.add(um9Var.V);
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
        pm9 pm9Var = new pm9(new int[]{size}, runnable, objArr == true ? 1 : 0);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ao9) arrayList.get(i2)).l((zn9) arrayList2.get(i2), pm9Var);
        }
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            ao9 ao9Var2 = (ao9) arrayList4.get(i3);
            ao9Var2.getClass();
            if (!ao9Var2.b.post(new tn9(ao9Var2, pm9Var, (byte) 1))) {
                pm9Var.run();
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
        fa4.b("[LivePlayer] rejoin in " + elapsedRealtime + " ms");
        rm9 rm9Var = new rm9(this, b);
        this.Q = rm9Var;
        gl.e3(rm9Var, elapsedRealtime);
    }

    public final void L(zn9 zn9Var) {
        if (this.U != zn9Var) {
            this.U = zn9Var;
            tm9 tm9Var = zn9Var != null ? new tm9(this, zn9Var) : null;
            this.V = tm9Var;
            ao9 ao9Var = this.O;
            if (ao9Var != null) {
                ao9Var.l(tm9Var, null);
            }
        }
    }

    @Override // t76
    public final void a() {
        ao9 ao9Var = this.O;
        if (ao9Var != null) {
            ao9Var.b.post(new kt(ao9Var, this.H, (byte) 5));
        }
    }

    @Override // t76
    public final void d() {
        L(null);
    }

    @Override // t76
    public final boolean q() {
        return true;
    }

    @Override // t76
    public final void t() {
        rm9 rm9Var = this.Q;
        if (rm9Var != null) {
            gl.r(rm9Var);
            this.Q = null;
        }
        byte b = 0;
        this.P = false;
        ao9 ao9Var = this.O;
        if (ao9Var != null) {
            this.O = null;
            this.V = null;
            a0.add(ao9Var);
            qm9 qm9Var = new qm9(ao9Var, b);
            if (!ao9Var.b.post(new tn9(ao9Var, qm9Var, (byte) 1))) {
                qm9Var.run();
            }
        }
        Z.remove(this);
    }

    @Override // t76
    public final void v() {
        if (this.R == 0 || SystemClock.elapsedRealtime() - this.T < 60000) {
            return;
        }
        this.R = 0L;
        this.S = 0L;
    }

    @Override // t76
    public final void w(TLRPC.TL_error tL_error) {
        gl.d3(new tj9(this, tL_error, (byte) 8));
    }

    @Override // t76
    public final void x() {
        K();
    }

    @Override // t76
    public final void y(TLRPC.TL_dataJSON tL_dataJSON, boolean z) {
        gl.d3(new rm9(this, (byte) 0));
    }

    @Override // t76
    public final void z(boolean z) {
        ao9 ao9Var = this.O;
        if (ao9Var != null) {
            ao9Var.k(z);
        }
    }
}
