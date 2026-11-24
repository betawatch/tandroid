// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vqc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ xqc b;
    public final /* synthetic */ wqc c;
    public final /* synthetic */ mqc d;

    public /* synthetic */ vqc(xqc xqcVar, mqc mqcVar, wqc wqcVar) {
        this.b = xqcVar;
        this.d = mqcVar;
        this.c = wqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mqc mqcVar = this.d;
        wqc wqcVar = this.c;
        xqc xqcVar = this.b;
        switch (b) {
            case 0:
                if (mqcVar == null) {
                    if (wqcVar.e == null) {
                        xqcVar.e(wqcVar);
                        break;
                    } else {
                        xqcVar.c(wqcVar);
                        break;
                    }
                } else {
                    xqcVar.a(wqcVar, mqcVar);
                    break;
                }
            default:
                xqcVar.a(wqcVar, mqcVar);
                break;
        }
    }

    public /* synthetic */ vqc(xqc xqcVar, wqc wqcVar, mqc mqcVar) {
        this.b = xqcVar;
        this.c = wqcVar;
        this.d = mqcVar;
    }
}
