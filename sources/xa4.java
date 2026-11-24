// default package

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xa4 {
    public static final /* synthetic */ int c = 0;
    public final vla a = vla.g();
    public boolean b;

    static {
        new xa4(0);
    }

    public xa4(int i) {
        a();
        a();
    }

    public static void b(pl2 pl2Var, l0d l0dVar, int i, Object obj) {
        if (l0dVar == l0d.d) {
            pl2Var.A(i, 3);
            ((o3) obj).b(pl2Var);
            pl2Var.A(i, 4);
        }
        pl2Var.A(i, l0dVar.b);
        switch (l0dVar.ordinal()) {
            case 0:
                pl2Var.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                pl2Var.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                pl2Var.E(((Long) obj).longValue());
                break;
            case 3:
                pl2Var.E(((Long) obj).longValue());
                break;
            case 4:
                pl2Var.v(((Integer) obj).intValue());
                break;
            case 5:
                pl2Var.t(((Long) obj).longValue());
                break;
            case 6:
                pl2Var.r(((Integer) obj).intValue());
                break;
            case 7:
                pl2Var.l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof m61)) {
                    pl2Var.z((String) obj);
                    break;
                } else {
                    pl2Var.p((m61) obj);
                    break;
                }
            case 9:
                ((o3) obj).b(pl2Var);
                break;
            case 10:
                o3 o3Var = (o3) obj;
                pl2Var.C(((gu4) o3Var).a(null));
                o3Var.b(pl2Var);
                break;
            case 11:
                if (!(obj instanceof m61)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    pl2Var.C(length);
                    pl2Var.m(bArr, 0, length);
                    break;
                } else {
                    pl2Var.p((m61) obj);
                    break;
                }
            case 12:
                pl2Var.C(((Integer) obj).intValue());
                break;
            case 13:
                pl2Var.v(((Integer) obj).intValue());
                break;
            case 14:
                pl2Var.r(((Integer) obj).intValue());
                break;
            case 15:
                pl2Var.t(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                pl2Var.C((intValue << 1) ^ (intValue >> 31));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                pl2Var.E((longValue << 1) ^ (longValue >> 63));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        vla vlaVar = this.a;
        int size = vlaVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry d = vlaVar.d(i);
            if (d.getValue() instanceof gu4) {
                gu4 gu4Var = (gu4) d.getValue();
                gu4Var.getClass();
                gv8 gv8Var = gv8.c;
                gv8Var.getClass();
                gv8Var.a(gu4Var.getClass()).c(gu4Var);
                gu4Var.h();
            }
        }
        if (!vlaVar.c) {
            if (vlaVar.a.size() > 0) {
                vlaVar.d(0).getKey().getClass();
                rjb.p();
                return;
            } else {
                Iterator it = vlaVar.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    rjb.p();
                    return;
                }
            }
        }
        if (!vlaVar.c) {
            vlaVar.b = vlaVar.b.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(vlaVar.b);
            vlaVar.e = vlaVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(vlaVar.e);
            vlaVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        xa4 xa4Var = new xa4();
        vla vlaVar = this.a;
        if (vlaVar.a.size() > 0) {
            Map.Entry d = vlaVar.d(0);
            if (d.getKey() != null) {
                rjb.p();
                return null;
            }
            d.getValue();
            throw null;
        }
        Iterator it = vlaVar.e().iterator();
        if (!it.hasNext()) {
            return xa4Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            rjb.p();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xa4) {
            return this.a.equals(((xa4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public xa4() {
    }
}
