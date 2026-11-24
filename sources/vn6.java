// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class vn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int[] e;

    public /* synthetic */ vn6(hq6 hq6Var, long j, long j2, int[] iArr, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = j;
        this.d = j2;
        this.e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int[] iArr = this.e;
        long j = this.d;
        long j2 = this.c;
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.getNotificationCenter().k(34, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
            case 1:
                hq6Var.getNotificationCenter().k(34, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
            default:
                hq6Var.getNotificationCenter().k(34, Long.valueOf(j2), Long.valueOf(j), iArr);
                break;
        }
    }
}
