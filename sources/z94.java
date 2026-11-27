// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class z94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ int c;

    public /* synthetic */ z94(int[] iArr, int i) {
        this.a = (byte) 0;
        this.c = i;
        this.b = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                ea4.j.i(i, iArr[0], 0, false);
                break;
            case 1:
                hl.c3(new z94((byte) 2, i, iArr));
                break;
            default:
                int i2 = iArr[0];
                if (i2 != 0) {
                    ea4.a(ea4.j.i(i, i2, 0, false));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z94(byte b, int i, int[] iArr) {
        this.a = b;
        this.b = iArr;
        this.c = i;
    }
}
