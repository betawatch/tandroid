// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class r8a implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt0 b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ r8a(pt0 pt0Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = pt0Var;
        this.c = document;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.Document document = this.c;
        pt0 pt0Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                pt0Var.a(str, document);
                break;
            default:
                pt0Var.a(str, document);
                break;
        }
    }
}
