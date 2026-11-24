// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vu8 implements qz6 {
    public final y73 a;
    public final h68 b;
    public final mx6 c;
    public final k4f d;
    public final int e;

    public vu8(y73 y73Var, wb3 wb3Var) {
        h68 h68Var = new h68(wb3Var, (byte) 18);
        mx6 mx6Var = new mx6();
        k4f k4fVar = new k4f((byte) 17);
        this.a = y73Var;
        this.b = h68Var;
        this.c = mx6Var;
        this.d = k4fVar;
        this.e = TLObject.FLAG_20;
    }

    @Override // qz6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final wu8 d(bt6 bt6Var) {
        bt6Var.b.getClass();
        return new wu8(bt6Var, this.a, this.b, this.c.G(bt6Var), this.d, this.e, null);
    }

    @Override // qz6
    public final qz6 a() {
        return this;
    }

    @Override // qz6
    public final qz6 b() {
        return this;
    }

    @Override // qz6
    public final qz6 c(fgf fgfVar) {
        return this;
    }
}
