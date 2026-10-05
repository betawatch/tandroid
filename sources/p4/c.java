package p4;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.emoji2.text.o b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.a = i11;
        this.b = oVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v vVar = ((e) ((la.h) this.b.f).d).d;
                if (vVar != null) {
                    vVar.j(this.c);
                    break;
                }
                break;
            default:
                v vVar2 = ((e) ((la.h) this.b.f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.c);
                    break;
                }
                break;
        }
    }
}
