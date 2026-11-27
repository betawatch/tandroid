// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tl8 {
    public final TLRPC.TL_premiumSubscriptionOption a;
    public int b;
    public long c;
    public long d;
    public long e;
    public wo8 f;
    public vo8 g;
    public int h;

    public tl8(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        wo8 wo8Var = this.f;
        if (wo8Var == null || this.g != null) {
            return;
        }
        ArrayList arrayList = wo8Var.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vo8 vo8Var = (vo8) obj;
            String str = ((uo8) vo8Var.b.a.get(0)).d;
            int i2 = this.a.months;
            if (i2 != 12) {
                Locale locale = Locale.ROOT;
                if (str.equals("P" + i2 + "M")) {
                    this.g = vo8Var;
                    return;
                }
            } else if (str.equals("P1Y")) {
                this.g = vo8Var;
                return;
            }
        }
    }

    public final String b() {
        boolean b = f11.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (b || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.currency;
        }
        if (this.f == null) {
            return "";
        }
        a();
        vo8 vo8Var = this.g;
        return vo8Var == null ? "" : ((uo8) vo8Var.b.a.get(0)).c;
    }

    public final int c() {
        if (this.b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.b = i;
                if (i == 0) {
                    this.b = -1;
                }
            }
        }
        return this.b;
    }

    public final String d() {
        if (f11.b() || this.a.store_product == null) {
            return di0.h().e(g(), b());
        }
        if (this.f == null) {
            return "";
        }
        di0.h();
        return di0.f(b(), 6, g(), false);
    }

    public final String e() {
        if (f11.b() || this.a.store_product == null) {
            return di0.h().e(h(), b());
        }
        if (this.f == null) {
            return "";
        }
        di0.h();
        return di0.f(b(), 6, h(), false);
    }

    public final String f() {
        if (f11.b() || this.a.store_product == null) {
            return di0.h().e(i(), b());
        }
        if (this.f == null) {
            return "";
        }
        di0.h();
        return di0.f(b(), 6, i(), false);
    }

    public final long g() {
        boolean b = f11.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (b || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.amount;
        }
        if (this.f == null) {
            return 0L;
        }
        a();
        vo8 vo8Var = this.g;
        if (vo8Var == null) {
            return 0L;
        }
        return ((uo8) vo8Var.b.a.get(0)).b;
    }

    public final long h() {
        if (this.c == 0) {
            long g = g();
            if (g != 0) {
                this.c = g / this.a.months;
            }
        }
        return this.c;
    }

    public final long i() {
        if (this.d == 0) {
            long g = g();
            if (g != 0) {
                this.d = (long) ((g / this.a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
