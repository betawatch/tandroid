package qh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ o8(ba baVar, boolean z4, int i10) {
        this.a = i10;
        this.b = baVar;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                ba baVar = this.b;
                if (!this.c) {
                    baVar.G0.b(false, false);
                    break;
                } else {
                    baVar.getClass();
                    break;
                }
            default:
                ba baVar2 = this.b;
                baVar2.O = null;
                baVar2.e = false;
                baVar2.q(this.c);
                break;
        }
    }
}
