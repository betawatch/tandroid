// default package

import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y3d implements fh0 {
    public final zz4 a;
    public final gp b;
    public ti5 c;
    public Set d;
    public boolean e;
    public final /* synthetic */ i05 f;

    public y3d(i05 i05Var, zz4 zz4Var, gp gpVar) {
        Objects.requireNonNull(i05Var);
        this.f = i05Var;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = zz4Var;
        this.b = gpVar;
    }

    @Override // fh0
    public final void a(ot2 ot2Var) {
        this.f.y.post(new tnd((Object) this, (Object) ot2Var, false, (byte) 12));
    }

    public final void b(ot2 ot2Var) {
        w3d w3dVar = (w3d) this.f.s.get(this.b);
        if (w3dVar != null) {
            w3dVar.k(ot2Var);
        }
    }
}
