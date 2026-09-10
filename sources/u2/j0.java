package u2;

import java.io.IOException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements e2.h {
    public final /* synthetic */ a5.a a;
    public final /* synthetic */ u b;
    public final /* synthetic */ c0 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ j0(a5.a aVar, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        this.a = aVar;
        this.b = uVar;
        this.c = c0Var;
        this.d = iOException;
        this.e = z10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        m0 m0Var = (m0) obj;
        a5.a aVar = this.a;
        m0Var.f(aVar.b, (g0) aVar.c, this.b, this.c, this.d, this.e);
    }
}
