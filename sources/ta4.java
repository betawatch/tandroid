// default package

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ta4 {
    public static final /* synthetic */ int c = 0;
    public final ona a = ona.g();
    public boolean b;

    static {
        new ta4(0);
    }

    public ta4(int i) {
        a();
        a();
    }

    public static void b(xk2 xk2Var, a3d a3dVar, int i, Object obj) {
        if (a3dVar == a3d.d) {
            xk2Var.A(i, 3);
            ((p3) obj).b(xk2Var);
            xk2Var.A(i, 4);
        }
        xk2Var.A(i, a3dVar.b);
        switch (a3dVar.ordinal()) {
            case 0:
                xk2Var.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                xk2Var.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                xk2Var.E(((Long) obj).longValue());
                break;
            case 3:
                xk2Var.E(((Long) obj).longValue());
                break;
            case 4:
                xk2Var.v(((Integer) obj).intValue());
                break;
            case 5:
                xk2Var.t(((Long) obj).longValue());
                break;
            case 6:
                xk2Var.r(((Integer) obj).intValue());
                break;
            case 7:
                xk2Var.l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof n51)) {
                    xk2Var.z((String) obj);
                    break;
                } else {
                    xk2Var.p((n51) obj);
                    break;
                }
            case 9:
                ((p3) obj).b(xk2Var);
                break;
            case 10:
                p3 p3Var = (p3) obj;
                xk2Var.C(((ju4) p3Var).a(null));
                p3Var.b(xk2Var);
                break;
            case 11:
                if (!(obj instanceof n51)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    xk2Var.C(length);
                    xk2Var.m(bArr, 0, length);
                    break;
                } else {
                    xk2Var.p((n51) obj);
                    break;
                }
            case 12:
                xk2Var.C(((Integer) obj).intValue());
                break;
            case 13:
                xk2Var.v(((Integer) obj).intValue());
                break;
            case 14:
                xk2Var.r(((Integer) obj).intValue());
                break;
            case 15:
                xk2Var.t(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                xk2Var.C((intValue << 1) ^ (intValue >> 31));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                xk2Var.E((longValue << 1) ^ (longValue >> 63));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ona onaVar = this.a;
        int size = onaVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry d = onaVar.d(i);
            if (d.getValue() instanceof ju4) {
                ju4 ju4Var = (ju4) d.getValue();
                ju4Var.getClass();
                ow8 ow8Var = ow8.c;
                ow8Var.getClass();
                ow8Var.a(ju4Var.getClass()).c(ju4Var);
                ju4Var.h();
            }
        }
        if (!onaVar.c) {
            if (onaVar.a.size() > 0) {
                onaVar.d(0).getKey().getClass();
                grb.o();
                return;
            } else {
                Iterator it = onaVar.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    grb.o();
                    return;
                }
            }
        }
        if (!onaVar.c) {
            onaVar.b = onaVar.b.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(onaVar.b);
            onaVar.e = onaVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(onaVar.e);
            onaVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        ta4 ta4Var = new ta4();
        ona onaVar = this.a;
        if (onaVar.a.size() > 0) {
            Map.Entry d = onaVar.d(0);
            if (d.getKey() != null) {
                grb.o();
                return null;
            }
            d.getValue();
            throw null;
        }
        Iterator it = onaVar.e().iterator();
        if (!it.hasNext()) {
            return ta4Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            grb.o();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ta4) {
            return this.a.equals(((ta4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ta4() {
    }
}
