package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c1(a4 a4Var, long j3, int i10) {
        this.a = i10;
        this.b = a4Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a4 a4Var = this.b;
                b1 b1Var = a4Var.n1;
                a4Var.q2(1, true, null);
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
                a4.P0(this.b, this.c);
                break;
            case 3:
                a4.d1(this.b, this.c);
                break;
            case 4:
                this.b.X1(this.c);
                break;
            case 5:
                a4.m0(this.b, this.c);
                break;
            case 6:
                this.b.X1(this.c);
                break;
            case 7:
                a4.P(this.b, this.c);
                break;
            case 8:
                this.b.X1(this.c);
                break;
            case 9:
                a4.B0(this.b, this.c);
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
