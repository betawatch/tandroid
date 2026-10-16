package zh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ b1(r3 r3Var, long j10, int i10) {
        this.a = i10;
        this.b = r3Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r3 r3Var = this.b;
                a1 a1Var = r3Var.o1;
                r3Var.s2(1, true, null);
                if (this.c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var);
                    break;
                }
                break;
            case 1:
                this.b.Y1(this.c);
                break;
            case 2:
                r3.Q0(this.b, this.c);
                break;
            case 3:
                r3.e1(this.b, this.c);
                break;
            case 4:
                this.b.Y1(this.c);
                break;
            case 5:
                r3.m0(this.b, this.c);
                break;
            case 6:
                this.b.Y1(this.c);
                break;
            case 7:
                r3.Q(this.b, this.c);
                break;
            case 8:
                this.b.Y1(this.c);
                break;
            case 9:
                r3.C0(this.b, this.c);
                break;
            case 10:
                this.b.Y1(this.c);
                break;
            default:
                this.b.Y1(this.c);
                break;
        }
    }
}
