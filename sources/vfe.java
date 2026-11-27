// default package

/* loaded from: classes.dex */
public final class vfe extends mnd {
    private static volatile qxd zzbg;
    private static final vfe zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        vfe vfeVar = new vfe();
        zzbiv = vfeVar;
        mnd.c(vfe.class, vfeVar);
    }

    public static ufe j() {
        return (ufe) ((knd) zzbiv.a(5));
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, qxd] */
    @Override // mnd
    public final Object a(int i) {
        qxd qxdVar;
        switch (gge.a[i - 1]) {
            case 1:
                return new vfe();
            case 2:
                return new ufe(zzbiv);
            case 3:
                return new vyd(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                qxd qxdVar2 = zzbg;
                if (qxdVar2 != null) {
                    return qxdVar2;
                }
                synchronized (vfe.class) {
                    qxd qxdVar3 = zzbg;
                    qxdVar = qxdVar3;
                    if (qxdVar3 == null) {
                        ?? lndVar = new lnd();
                        zzbg = lndVar;
                        qxdVar = lndVar;
                    }
                }
                return qxdVar;
            case 6:
                return (byte) 1;
            default:
                p3d.a();
            case 7:
                return null;
        }
    }

    public final int e() {
        return this.zzya;
    }

    public final boolean f() {
        return (this.zzbb & 1) == 1;
    }

    public final String g() {
        return this.zzbis;
    }

    public final long h() {
        return this.zzbit;
    }

    public final long i() {
        return this.zzbiu;
    }

    public final void k(String str) {
        this.zzbb |= 2;
        this.zzbis = str;
    }

    public final void l(long j) {
        this.zzbb |= 4;
        this.zzbit = j;
    }

    public final void m(long j) {
        this.zzbb |= 8;
        this.zzbiu = j;
    }
}
