// default package

import j$.time.LocalDate;
import j$.time.ZoneOffset;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yd implements dq7, o69, b86, ot2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ yd(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // ot2
    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        og8 og8Var = (og8) obj;
        switch (b) {
            case 6:
                og8Var.e0(i);
                break;
            case 7:
                og8Var.K(i);
                break;
            case 8:
                og8Var.n0(i);
                break;
            default:
                og8Var.I0(i);
                break;
        }
    }

    @Override // dq7
    public final String c(int i) {
        byte b = this.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                return i == i2 ? "—" : String.format("%02d", Integer.valueOf(i));
            default:
                if (i == 0) {
                    return ob6.M0(2131748285, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i2) {
                    return ob6.D0().x0().format(epochMilli);
                }
                return ob6.D0().z0().format(epochMilli) + ", " + ob6.D0().v0().format(epochMilli);
        }
    }

    @Override // b86
    public final void invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        bg8 bg8Var = (bg8) obj;
        switch (b) {
            case 3:
                bg8Var.g(i);
                break;
            default:
                bg8Var.d(i);
                break;
        }
    }

    @Override // o69
    public final int run() {
        return this.b;
    }
}
