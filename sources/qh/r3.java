package qh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;
    public final /* synthetic */ eg.z2 c;

    public /* synthetic */ r3(a5 a5Var, eg.z2 z2Var, int i10) {
        this.a = i10;
        this.b = a5Var;
        this.c = z2Var;
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
