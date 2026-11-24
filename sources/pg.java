// default package

import j$.time.LocalDate;
import j$.time.ZoneOffset;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pg implements hp7, c59, x76, fu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ pg(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // fu2
    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        cf8 cf8Var = (cf8) obj;
        switch (b) {
            case 6:
                cf8Var.e0(i);
                break;
            case 7:
                cf8Var.K(i);
                break;
            case 8:
                cf8Var.n0(i);
                break;
            default:
                cf8Var.I0(i);
                break;
        }
    }

    @Override // hp7
    public final String c(int i) {
        byte b = this.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return jb6.M0(2131748288, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i2) {
                    return jb6.D0().x0().format(epochMilli);
                }
                return jb6.D0().z0().format(epochMilli) + ", " + jb6.D0().v0().format(epochMilli);
            default:
                return i == i2 ? "—" : String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override // x76
    public final void invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        pe8 pe8Var = (pe8) obj;
        switch (b) {
            case 3:
                pe8Var.g(i);
                break;
            default:
                pe8Var.b(i);
                break;
        }
    }

    @Override // c59
    public final int run() {
        return this.b;
    }
}
