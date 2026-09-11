package u2;

import java.io.IOException;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements e2.h {
    public final /* synthetic */ a5.a a;
    public final /* synthetic */ t b;
    public final /* synthetic */ b0 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ i0(a5.a aVar, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        this.a = aVar;
        this.b = tVar;
        this.c = b0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        a5.a aVar = this.a;
        k0Var.f(aVar.b, (f0) aVar.c, this.b, this.c, this.d, this.e);
    }
}
