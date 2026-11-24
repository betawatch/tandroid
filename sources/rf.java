// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hk b;
    public final /* synthetic */ he c;
    public final /* synthetic */ d d;

    public /* synthetic */ rf(hk hkVar, he heVar, d dVar, byte b) {
        this.a = b;
        this.b = hkVar;
        this.c = heVar;
        this.d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        he heVar = this.c;
        hk hkVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new rf(hkVar, heVar, dVar, (byte) 1));
                break;
            default:
                ik.b0(hkVar, heVar, dVar);
                break;
        }
    }
}
