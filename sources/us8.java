// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class us8 implements qx6 {
    public final m63 a;
    public final k88 b;
    public final mv6 c;
    public final i2f d;
    public final int e;

    public us8(m63 m63Var, ka3 ka3Var) {
        k88 k88Var = new k88(ka3Var, (byte) 14);
        mv6 mv6Var = new mv6();
        i2f i2fVar = new i2f((byte) 17);
        this.a = m63Var;
        this.b = k88Var;
        this.c = mv6Var;
        this.d = i2fVar;
        this.e = TLObject.FLAG_20;
    }

    @Override // qx6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final vs8 d(br6 br6Var) {
        br6Var.b.getClass();
        return new vs8(br6Var, this.a, this.b, this.c.F(br6Var), this.d, this.e, null);
    }

    @Override // qx6
    public final qx6 a() {
        return this;
    }

    @Override // qx6
    public final qx6 b() {
        return this;
    }

    @Override // qx6
    public final qx6 c(eef eefVar) {
        return this;
    }
}
