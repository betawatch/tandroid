// default package

import j$.time.LocalDate;
import j$.time.ZoneOffset;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pf implements dn7, z29, x56, us2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ pf(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // us2
    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        ad8 ad8Var = (ad8) obj;
        switch (b) {
            case 5:
                ad8Var.e0(i);
                break;
            case 6:
                ad8Var.K(i);
                break;
            case 7:
                ad8Var.n0(i);
                break;
            default:
                ad8Var.I0(i);
                break;
        }
    }

    @Override // dn7
    public final String c(int i) {
        byte b = this.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return k96.M0(2131748339, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i2) {
                    return k96.D0().x0().format(epochMilli);
                }
                return k96.D0().z0().format(epochMilli) + ", " + k96.D0().v0().format(epochMilli);
            default:
                return i == i2 ? "—" : String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override // x56
    public final void invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        mc8 mc8Var = (mc8) obj;
        switch (b) {
            case 3:
                mc8Var.g(i);
                break;
            default:
                mc8Var.d(i);
                break;
        }
    }

    @Override // z29
    public final int run() {
        return this.b;
    }
}
