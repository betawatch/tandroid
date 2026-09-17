package u2;

import java.io.IOException;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
