// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v47 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f57 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ v47(f57 f57Var, Context context, byte b) {
        this.a = b;
        this.b = f57Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Context context = this.c;
        f57 f57Var = this.b;
        switch (b) {
            case 0:
                f57Var.d0.a(false);
                gm.c3(new v47(f57Var, context, (byte) 1));
                break;
            default:
                if (gm.C1(context)) {
                    new kj8(43, f57Var.d0.G, context).show();
                    break;
                }
                break;
        }
    }
}
