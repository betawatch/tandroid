package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c1(y3 y3Var, long j3, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y3 y3Var = this.b;
                b1 b1Var = y3Var.n1;
                y3Var.q2(1, true, null);
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
                y3.P0(this.b, this.c);
                break;
            case 3:
                y3.d1(this.b, this.c);
                break;
            case 4:
                this.b.X1(this.c);
                break;
            case 5:
                y3.m0(this.b, this.c);
                break;
            case 6:
                this.b.X1(this.c);
                break;
            case 7:
                y3.P(this.b, this.c);
                break;
            case 8:
                this.b.X1(this.c);
                break;
            case 9:
                y3.B0(this.b, this.c);
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
