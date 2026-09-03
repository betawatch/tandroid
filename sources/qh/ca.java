package qh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ca implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ la b;

    public /* synthetic */ ca(la laVar, int i10) {
        this.a = i10;
        this.b = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                la laVar = this.b;
                ja jaVar = laVar.J;
                if (jaVar != null) {
                    long j10 = jaVar.a;
                    if (j10 > 0) {
                        laVar.E = j10;
                        break;
                    }
                }
                break;
            case 1:
                fa faVar = this.b.a;
                if (faVar != null) {
                    faVar.w0();
                    break;
                }
                break;
            default:
                fa faVar2 = this.b.a;
                if (faVar2 != null) {
                    faVar2.G();
                    break;
                }
                break;
        }
    }
}
