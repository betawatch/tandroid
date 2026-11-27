// default package

import j$.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class xp9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dq9 b;

    public /* synthetic */ xp9(dq9 dq9Var, byte b) {
        this.a = b;
        this.b = dq9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dq9 dq9Var = this.b;
        switch (b) {
            case 0:
                rr9 rr9Var = dq9Var.V;
                if (rr9Var != null && dq9Var.X) {
                    dq9Var.X = false;
                    xz0 xz0Var = rr9Var.e;
                    Objects.requireNonNull(xz0Var);
                    rr9Var.b.post(new gz0(xz0Var, (byte) 7));
                    break;
                } else if (!dq9Var.w && dq9Var.P != null && rr9Var == null) {
                    dq9Var.V = new rr9(dq9Var.e, dq9Var.f, dq9Var.k(), new cq9(dq9Var));
                    sr9 sr9Var = new sr9();
                    dq9Var.W = sr9Var;
                    aq9 aq9Var = dq9Var.Q;
                    if (aq9Var != null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = sr9Var.a;
                        if (!copyOnWriteArrayList.contains(aq9Var)) {
                            copyOnWriteArrayList.add(aq9Var);
                        }
                    }
                    dq9Var.V.l(dq9Var.W, null);
                    rr9 rr9Var2 = dq9Var.V;
                    float f = dq9Var.H;
                    rr9Var2.getClass();
                    rr9Var2.b.post(new jt(rr9Var2, f, (byte) 5));
                    dq9Var.V.k(a.o());
                    rr9 rr9Var3 = dq9Var.V;
                    rr9Var3.getClass();
                    rr9Var3.b.post(new hq9(rr9Var3, (byte) 3));
                    break;
                }
                break;
            case 1:
                dq9Var.C(true);
                break;
            default:
                dq9Var.C(true);
                break;
        }
    }
}
