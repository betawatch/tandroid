// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class t19 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c29 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ t19(c29 c29Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = c29Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        c29 c29Var = this.b;
        switch (b) {
            case 0:
                nm7.f(c29Var.b).d(new t19(c29Var, tLObject, (byte) 1));
                break;
            default:
                c29Var.b(tLObject);
                break;
        }
    }
}
