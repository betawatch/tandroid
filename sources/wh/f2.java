package wh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f2(r3 r3Var, int i10, int i11) {
        this.a = i11;
        this.b = r3Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c4(this.c);
                break;
            case 1:
                this.b.e4(this.c);
                break;
            case 2:
                this.b.scrollBy(0, this.c);
                break;
            default:
                this.b.d4(this.c);
                break;
        }
    }
}
