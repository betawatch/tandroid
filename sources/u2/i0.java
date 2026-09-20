package u2;

import java.io.IOException;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        l0 l0Var = (l0) obj;
        a5.a aVar = this.a;
        l0Var.f(aVar.b, (f0) aVar.c, this.b, this.c, this.d, this.e);
    }
}
