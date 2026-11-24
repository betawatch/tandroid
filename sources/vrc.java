// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class vrc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ asc b;

    public /* synthetic */ vrc(asc ascVar, byte b) {
        this.a = b;
        this.b = ascVar;
    }

    @Override // qac
    public final void a(Object obj) {
        l7 l7Var;
        byte b = this.a;
        asc ascVar = this.b;
        switch (b) {
            case 0:
                ascVar.f0((String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!ascVar.isFinished && (l7Var = ascVar.O) != null) {
                    if (user != null) {
                        gm.t1(l7Var);
                        ascVar.m0(null, user);
                        break;
                    } else {
                        gm.c3(new wrc(ascVar, (byte) 1));
                        break;
                    }
                }
                break;
        }
    }
}
