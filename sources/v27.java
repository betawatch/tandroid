// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.c3(new v27(f37Var, context, (byte) 1));
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
