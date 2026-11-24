// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v27 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f37 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ v27(f37 f37Var, Context context, byte b) {
        this.a = b;
        this.b = f37Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Context context = this.c;
        f37 f37Var = this.b;
        switch (b) {
            case 0:
                f37Var.d0.a(false);
                gl.d3(new v27(f37Var, context, (byte) 1));
                break;
            default:
                if (gl.C1(context)) {
                    new jh8(43, f37Var.d0.G, context).show();
                    break;
                }
                break;
        }
    }
}
