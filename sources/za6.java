// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class za6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb6 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ za6(eb6 eb6Var, Integer num, byte b) {
        this.a = b;
        this.b = eb6Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Integer num = this.c;
        eb6 eb6Var = this.b;
        switch (b) {
            case 0:
                if (!eb6Var.b.isEmpty()) {
                    gl.d3(new za6(eb6Var, num, b2));
                    break;
                }
                break;
            default:
                eb6Var.getNotificationCenter().k(76, num);
                break;
        }
    }
}
