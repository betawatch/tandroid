package qh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ s8(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ba baVar = this.b;
                baVar.getClass();
                baVar.g(1.0f, true, new f8(baVar, 6));
                baVar.Y0.b(true, true);
                break;
            default:
                ba baVar2 = this.b;
                baVar2.f(false);
                baVar2.j2 = null;
                break;
        }
    }
}
