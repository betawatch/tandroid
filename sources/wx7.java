// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx7 implements b3c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q8c c;
    public final /* synthetic */ eu0 d;
    public final /* synthetic */ by7 e;
    public final /* synthetic */ k8c f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ h24 r;

    public /* synthetic */ wx7(int i, q8c q8cVar, eu0 eu0Var, by7 by7Var, k8c k8cVar, boolean z, boolean z2, h24 h24Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = q8cVar;
        this.d = eu0Var;
        this.e = by7Var;
        this.f = k8cVar;
        this.h = z;
        this.n = z2;
        this.r = h24Var;
    }

    @Override // b3c
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                cy7.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                cy7.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
