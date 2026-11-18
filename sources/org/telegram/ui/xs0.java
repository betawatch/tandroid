package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xs0 {
    public final TLRPC.TL_premiumSubscriptionOption a;
    public int b;
    public long c;
    public long d;
    public long e;
    public f5.m f;
    public f5.l g;
    public int h;

    public xs0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        f5.m mVar = this.f;
        if (mVar != null && this.g == null) {
            ArrayList arrayList = mVar.h;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f5.l lVar = (f5.l) obj;
                String str = ((f5.j) lVar.b.a.get(0)).d;
                int i10 = this.a.months;
                if (i10 != 12) {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i10 + "M")) {
                        this.g = lVar;
                        return;
                    }
                } else if (str.equals("P1Y")) {
                    this.g = lVar;
                    return;
                }
            }
        }
    }

    public final String b() {
        boolean b10 = org.telegram.messenger.s2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (b10 || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.currency;
        }
        if (this.f == null) {
            return "";
        }
        a();
        f5.l lVar = this.g;
        return lVar == null ? "" : ((f5.j) lVar.b.a.get(0)).c;
    }

    public final int c() {
        if (this.b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i7 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.b = i7;
                if (i7 == 0) {
                    this.b = -1;
                }
            }
        }
        return this.b;
    }

    public final String d() {
        if (org.telegram.messenger.s2.b() || this.a.store_product == null) {
            return org.telegram.messenger.r1.i().f(g(), b());
        }
        if (this.f == null) {
            return "";
        }
        org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
        long g10 = g();
        String b10 = b();
        i7.getClass();
        return org.telegram.messenger.r1.g(b10, 6, g10, false);
    }

    public final String e() {
        if (org.telegram.messenger.s2.b() || this.a.store_product == null) {
            return org.telegram.messenger.r1.i().f(h(), b());
        }
        if (this.f == null) {
            return "";
        }
        org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
        long h = h();
        String b10 = b();
        i7.getClass();
        return org.telegram.messenger.r1.g(b10, 6, h, false);
    }

    public final String f() {
        if (org.telegram.messenger.s2.b() || this.a.store_product == null) {
            return org.telegram.messenger.r1.i().f(i(), b());
        }
        if (this.f == null) {
            return "";
        }
        org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
        long i10 = i();
        String b10 = b();
        i7.getClass();
        return org.telegram.messenger.r1.g(b10, 6, i10, false);
    }

    public final long g() {
        boolean b10 = org.telegram.messenger.s2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (b10 || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.amount;
        }
        if (this.f == null) {
            return 0L;
        }
        a();
        f5.l lVar = this.g;
        if (lVar == null) {
            return 0L;
        }
        return ((f5.j) lVar.b.a.get(0)).b;
    }

    public final long h() {
        if (this.c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.c = g10 / this.a.months;
            }
        }
        return this.c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
