package wh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ f2.u0 c;

    public /* synthetic */ u2(r3 r3Var, f2.u0 u0Var, int i10) {
        this.a = i10;
        this.b = r3Var;
        this.c = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.setItemAnimator(this.c);
                break;
            default:
                this.b.setItemAnimator(this.c);
                break;
        }
    }
}
