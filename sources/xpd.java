// default package

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xpd extends c2e {
    private static final xpd zzb;
    private a3e zzd = pae.e;

    static {
        xpd xpdVar = new xpd();
        zzb = xpdVar;
        c2e.k(xpd.class, xpdVar);
    }

    public static qpd n() {
        return (qpd) zzb.f();
    }

    public static void o(xpd xpdVar, ArrayList arrayList) {
        a3e a3eVar = xpdVar.zzd;
        if (!((bsd) a3eVar).a) {
            a3eVar = a3eVar.zzd(a3eVar.size() << 1);
            xpdVar.zzd = a3eVar;
        }
        Charset charset = h3e.a;
        int size = arrayList.size();
        if (a3eVar instanceof ArrayList) {
            ((ArrayList) a3eVar).ensureCapacity(a3eVar.size() + size);
        } else if (a3eVar instanceof pae) {
            pae paeVar = (pae) a3eVar;
            int i = paeVar.c + size;
            int length = paeVar.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    paeVar.b = Arrays.copyOf(paeVar.b, length);
                } else {
                    paeVar.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = a3eVar.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String n = tb4.n(a3eVar.size() - size2, "Element at index ", " is null.");
                int size4 = a3eVar.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        fvc.f(n);
                        return;
                    }
                    a3eVar.remove(size4);
                }
            } else {
                a3eVar.add(obj);
            }
        }
    }

    @Override // c2e
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vae(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", jpd.class});
        }
        if (i2 == 3) {
            return new xpd();
        }
        if (i2 == 4) {
            return new qpd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
