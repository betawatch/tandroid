package yh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ b1(s3 s3Var, long j3, int i10) {
        this.a = i10;
        this.b = s3Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s3 s3Var = this.b;
                a1 a1Var = s3Var.o1;
                s3Var.s2(1, true, null);
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
                s3.Q0(this.b, this.c);
                break;
            case 3:
                s3.e1(this.b, this.c);
                break;
            case 4:
                this.b.Y1(this.c);
                break;
            case 5:
                s3.m0(this.b, this.c);
                break;
            case 6:
                this.b.Y1(this.c);
                break;
            case 7:
                s3.Q(this.b, this.c);
                break;
            case 8:
                this.b.Y1(this.c);
                break;
            case 9:
                s3.C0(this.b, this.c);
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
