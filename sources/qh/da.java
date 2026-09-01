package qh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma b;

    public /* synthetic */ da(ma maVar, int i10) {
        this.a = i10;
        this.b = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ma maVar = this.b;
                ka kaVar = maVar.J;
                if (kaVar != null) {
                    long j10 = kaVar.a;
                    if (j10 > 0) {
                        maVar.E = j10;
                        break;
                    }
                }
                break;
            case 1:
                ga gaVar = this.b.a;
                if (gaVar != null) {
                    gaVar.w0();
                    break;
                }
                break;
            default:
                ga gaVar2 = this.b.a;
                if (gaVar2 != null) {
                    gaVar2.G();
                    break;
                }
                break;
        }
    }
}
