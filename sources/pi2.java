// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pi2 extends g2 {
    public static final /* synthetic */ ai4 e;

    static {
        i94 i94Var = new i94(pi2.class, "ChunkOffsetBox.java");
        e = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        xvc b = i94.b(e, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[entryCount=");
        nya nyaVar = (nya) this;
        aq1.r(i94.b(nya.h, nyaVar, nyaVar));
        return hg9.k(sb, nyaVar.f.length, "]");
    }
}
