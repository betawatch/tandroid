// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz7 implements c5c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rac c;
    public final /* synthetic */ nv0 d;
    public final /* synthetic */ d08 e;
    public final /* synthetic */ lac f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ s34 r;

    public /* synthetic */ yz7(int i, rac racVar, nv0 nv0Var, d08 d08Var, lac lacVar, boolean z, boolean z2, s34 s34Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = racVar;
        this.d = nv0Var;
        this.e = d08Var;
        this.f = lacVar;
        this.h = z;
        this.n = z2;
        this.r = s34Var;
    }

    @Override // c5c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                e08.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                e08.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
