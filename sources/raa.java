// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class raa implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yu0 b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ raa(yu0 yu0Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = yu0Var;
        this.c = document;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.Document document = this.c;
        yu0 yu0Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                yu0Var.a(str, document);
                break;
            default:
                yu0Var.a(str, document);
                break;
        }
    }
}
