// default package

import java.io.IOException;

/* loaded from: classes.dex */
public final class wfe extends mnd {
    private static volatile qxd zzbg;
    private static final wfe zzbir;
    private dpd zzbiq = pyd.c;

    static {
        wfe wfeVar = new wfe();
        zzbir = wfeVar;
        mnd.c(wfe.class, wfeVar);
    }

    public static wfe f() {
        return zzbir;
    }

    public static wfe g(byte[] bArr) {
        mnd mndVar = (mnd) zzbir.a(4);
        try {
            jyd jydVar = jyd.c;
            jydVar.getClass();
            jydVar.a(mndVar.getClass()).c(mndVar, bArr, 0, bArr.length, new lfd());
            jydVar.a(mndVar.getClass()).b(mndVar);
            if (mndVar.zzex != 0) {
                throw new RuntimeException();
            }
            boolean z = true;
            byte byteValue = ((Byte) mndVar.a(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = jydVar.a(mndVar.getClass()).g(mndVar);
                    mndVar.a(2);
                }
            }
            if (z) {
                return (wfe) mndVar;
            }
            throw new mpd(new zp2().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof mpd) {
                throw ((mpd) e.getCause());
            }
            throw new mpd(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw mpd.a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, qxd] */
    @Override // mnd
    public final Object a(int i) {
        qxd qxdVar;
        switch (gge.a[i - 1]) {
            case 1:
                return new wfe();
            case 2:
                return new tfe(zzbir);
            case 3:
                return new vyd(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", vfe.class});
            case 4:
                return zzbir;
            case 5:
                qxd qxdVar2 = zzbg;
                if (qxdVar2 != null) {
                    return qxdVar2;
                }
                synchronized (wfe.class) {
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

    public final dpd e() {
        return this.zzbiq;
    }
}
