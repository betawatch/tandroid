// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class th2 extends h2 {
    public static final /* synthetic */ xh4 e;

    static {
        u84 u84Var = new u84(th2.class, "ChunkOffsetBox.java");
        e = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "java.lang.String"));
    }

    public final String toString() {
        lyc b = u84.b(e, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[entryCount=");
        n0b n0bVar = (n0b) this;
        bp1.r(u84.b(n0b.h, n0bVar, n0bVar));
        return uh9.l(sb, n0bVar.f.length, "]");
    }
}
