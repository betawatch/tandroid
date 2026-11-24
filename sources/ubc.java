// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ubc implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ v8b b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ubc(v8b v8bVar, int i, long j) {
        this.b = v8bVar;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        long j = this.c;
        v8b v8bVar = this.b;
        switch (b) {
            case 0:
                xbc xbcVar = (xbc) v8bVar.c;
                String str = g8c.a;
                l93 l93Var = ((t54) xbcVar).a.s;
                tj R = l93Var.R((rx6) l93Var.d.e);
                l93Var.V(R, 1018, new i93(R, i, j));
                break;
            default:
                xbc xbcVar2 = (xbc) v8bVar.c;
                String str2 = g8c.a;
                l93 l93Var2 = ((t54) xbcVar2).a.s;
                tj R2 = l93Var2.R((rx6) l93Var2.d.e);
                l93Var2.V(R2, 1021, new i93(R2, j, i));
                break;
        }
    }

    public /* synthetic */ ubc(v8b v8bVar, long j, int i) {
        this.b = v8bVar;
        this.c = j;
        this.d = i;
    }
}
