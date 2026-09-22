package p4;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                v vVar = ((e) ((lf.h) this.b.f).d).d;
                if (vVar != null) {
                    vVar.j(this.c);
                    break;
                }
                break;
            default:
                v vVar2 = ((e) ((lf.h) this.b.f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.c);
                    break;
                }
                break;
        }
    }
}
