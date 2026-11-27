// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r4a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a5a b;

    public /* synthetic */ r4a(a5a a5aVar, byte b) {
        this.a = b;
        this.b = a5aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a5a a5aVar = this.b;
        switch (b) {
            case 0:
                a5aVar.b1(false);
                break;
            case 1:
                a5aVar.b1(true);
                break;
            case 2:
                wua wuaVar = new wua(a5aVar.getContext(), a5aVar.T1, a5aVar.U1, a5aVar.J0, null);
                long j = a5aVar.X1.id;
                String str = a5aVar.a2;
                wuaVar.l3 = true;
                jxa.v(wuaVar.a, false).H(j, new ku9(wuaVar, str, (byte) 8));
                break;
            case 3:
                fz.c1(a5aVar.J0, a5aVar.getContext(), a5aVar.X1);
                break;
            case 4:
                new eza(a5aVar.getContext(), a5aVar.J0).show();
                break;
            default:
                a5aVar.dismiss();
                break;
        }
    }
}
