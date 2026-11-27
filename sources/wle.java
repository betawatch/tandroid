// default package

import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wle extends s6e {
    private static final wle zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private wne zzh;
    private int zzi;

    static {
        wle wleVar = new wle();
        zzb = wleVar;
        s6e.k(wle.class, wleVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [rfe] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, s6e] */
    public static wle n(byte[] bArr, d2e d2eVar) {
        wle wleVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (s6e) wleVar.d(4);
            try {
                ?? a = zee.c.a(r2.getClass());
                pl6 pl6Var = new pl6();
                d2eVar.getClass();
                a.a(r2, bArr, 0, length, pl6Var);
                a.zzf(r2);
                wleVar = r2;
            } catch (j8e e) {
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof j8e) {
                    throw ((j8e) e2.getCause());
                }
                throw new j8e(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                p3d.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (mie e3) {
                p3d.l(e3.getMessage());
                return null;
            }
        }
        if (wleVar == null || s6e.c(wleVar, true)) {
            return wleVar;
        }
        p3d.l(new mie().getMessage());
        return null;
    }

    public static void p(wle wleVar, uoe uoeVar) {
        wleVar.zzi = uoeVar.a;
        wleVar.zzd |= 4;
    }

    public static /* synthetic */ void q(wle wleVar, wne wneVar) {
        wleVar.zzh = wneVar;
        wleVar.zzd |= 2;
    }

    public static /* synthetic */ void r(wle wleVar, wse wseVar) {
        wleVar.zzf = wseVar;
        wleVar.zze = 7;
    }

    public static /* synthetic */ void s(wle wleVar, uve uveVar) {
        wleVar.zzf = uveVar;
        wleVar.zze = 6;
    }

    public static /* synthetic */ void t(wle wleVar, int i) {
        wleVar.zzg = i - 1;
        wleVar.zzd |= 1;
    }

    public static kle u() {
        return (kle) zzb.f();
    }

    @Override // s6e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lfe(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", ovd.c, "zzh", cre.class, "zzi", ovd.e, uve.class, wse.class});
        }
        if (i2 == 3) {
            return new wle();
        }
        if (i2 == 4) {
            return new kle(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final wse o() {
        return this.zze == 7 ? (wse) this.zzf : wse.o();
    }
}
