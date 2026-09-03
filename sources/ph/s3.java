package ph;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;
    public final /* synthetic */ dg.b3 c;

    public /* synthetic */ s3(c5 c5Var, dg.b3 b3Var, int i10) {
        this.a = i10;
        this.b = c5Var;
        this.c = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D0(this.c, true);
                break;
            default:
                this.b.C0(this.c);
                break;
        }
    }
}
