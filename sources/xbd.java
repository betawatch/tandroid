// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xbd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tcd b;

    public /* synthetic */ xbd(tcd tcdVar, byte b) {
        this.a = b;
        this.b = tcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tcd tcdVar = this.b;
        switch (b) {
            case 0:
                xab xabVar = tcdVar.e;
                gw6 gw6Var = (gw6) xabVar.c;
                if (gw6Var == null) {
                    gw6Var = gw6.d((Context) xabVar.b);
                    xabVar.c = gw6Var;
                }
                gw6Var.h(tcdVar);
                break;
            default:
                tcdVar.n();
                break;
        }
    }
}
