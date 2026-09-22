package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c1(z3 z3Var, long j3, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                b1 b1Var = z3Var.n1;
                z3Var.q2(1, true, null);
                if (this.c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    break;
                }
                break;
            case 1:
                this.b.X1(this.c);
                break;
            case 2:
                z3.P0(this.b, this.c);
                break;
            case 3:
                z3.d1(this.b, this.c);
                break;
            case 4:
                this.b.X1(this.c);
                break;
            case 5:
                z3.m0(this.b, this.c);
                break;
            case 6:
                this.b.X1(this.c);
                break;
            case 7:
                z3.P(this.b, this.c);
                break;
            case 8:
                this.b.X1(this.c);
                break;
            case 9:
                z3.B0(this.b, this.c);
                break;
            case 10:
                this.b.X1(this.c);
                break;
            default:
                this.b.X1(this.c);
                break;
        }
    }
}
