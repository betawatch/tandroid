// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zd0(lo loVar, Object obj, byte b) {
        this.a = b;
        this.b = loVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        lo loVar = this.b;
        switch (b) {
            case 0:
                if (loVar.a == 0) {
                    loVar.p(obj);
                    break;
                }
                break;
            default:
                int i = loVar.a - 1;
                loVar.a = i;
                if (i == 0) {
                    loVar.p(obj);
                    break;
                }
                break;
        }
    }
}
