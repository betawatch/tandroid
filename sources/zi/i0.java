package zi;

import org.telegram.ui.Components.jy0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ r0 c;

    public /* synthetic */ i0(v0 v0Var, r0 r0Var, int i7, int i10) {
        this.a = i10;
        this.b = v0Var;
        this.c = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                r0 r0Var = this.c;
                ((jy0) v0Var.e).c(r0Var.a);
                return;
            case 1:
                v0 v0Var2 = this.b;
                r0 r0Var2 = this.c;
                s0 s0Var = v0Var2.e;
                long j3 = r0Var2.a;
                jy0 jy0Var = (jy0) s0Var;
                synchronized (jy0Var) {
                    jy0Var.c(j3);
                }
                return;
            default:
                v0 v0Var3 = this.b;
                r0 r0Var3 = this.c;
                ((jy0) v0Var3.e).c(r0Var3.a);
                return;
        }
    }

    public /* synthetic */ i0(v0 v0Var, r0 r0Var, Exception exc) {
        this.a = 1;
        this.b = v0Var;
        this.c = r0Var;
    }
}
