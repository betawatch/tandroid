// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wme extends s6e {
    private static final wme zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        wme wmeVar = new wme();
        zzb = wmeVar;
        s6e.k(wme.class, wmeVar);
    }

    public static void o(wme wmeVar, uoe uoeVar) {
        wmeVar.zzh = uoeVar.a;
        wmeVar.zzd |= 2;
    }

    public static /* synthetic */ void p(wme wmeVar, wse wseVar) {
        wmeVar.zzf = wseVar;
        wmeVar.zze = 4;
    }

    public static /* synthetic */ void q(wme wmeVar, uve uveVar) {
        wmeVar.zzf = uveVar;
        wmeVar.zze = 3;
    }

    public static /* synthetic */ void r(wme wmeVar, int i) {
        wmeVar.zzg = i - 1;
        wmeVar.zzd |= 1;
    }

    public static eme s() {
        return (eme) zzb.f();
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", ovd.c, cre.class, uve.class, wse.class, "zzh", ovd.e});
        }
        if (i2 == 3) {
            return new wme();
        }
        if (i2 == 4) {
            return new eme(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final wse n() {
        return this.zze == 4 ? (wse) this.zzf : wse.o();
    }
}
