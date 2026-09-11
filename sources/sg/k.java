package sg;

import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class k {
    public final TLRPC.TL_premiumGiftOption a;
    public final TLRPC.TL_premiumGiftCodeOption b;
    public final TLRPC.TL_premiumGiftOption c;
    public final TLRPC.TL_premiumGiftCodeOption d;
    public int e;
    public long f;
    public long g;
    public c5.o h;

    public k(TLRPC.TL_premiumGiftOption tL_premiumGiftOption) {
        this.a = tL_premiumGiftOption;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final String a() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.currency;
            }
        } else if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.currency;
        }
        c5.o oVar = this.h;
        return oVar == null ? "" : oVar.a().c;
    }

    public final int b() {
        if (this.e == 0) {
            if (f() == 0) {
                return 0;
            }
            if (this.g != 0) {
                int f7 = (int) ((1.0d - (f() / this.g)) * 100.0d);
                this.e = f7;
                if (f7 == 0) {
                    this.e = -1;
                }
            }
        }
        return this.e;
    }

    public final String c() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        return (BuildVars.useInvoiceBilling() || ((tL_premiumGiftOption = this.a) != null && tL_premiumGiftOption.store_product == null) || ((tL_premiumGiftCodeOption = this.b) != null && tL_premiumGiftCodeOption.store_product == null)) ? BillingController.getInstance().formatCurrency(e(), a()) : this.h == null ? "" : BillingController.getInstance().formatCurrency(e(), a(), 6);
    }

    public final int d() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public final long e() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption == null) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
            if (tL_premiumGiftCodeOption != null && (BuildVars.useInvoiceBilling() || tL_premiumGiftCodeOption.store_product == null)) {
                return tL_premiumGiftCodeOption.amount;
            }
        } else if (BuildVars.useInvoiceBilling() || tL_premiumGiftOption.store_product == null) {
            return tL_premiumGiftOption.amount;
        }
        c5.o oVar = this.h;
        if (oVar == null) {
            return 0L;
        }
        return oVar.a().b;
    }

    public final long f() {
        if (this.f == 0) {
            long e7 = e();
            if (e7 != 0) {
                this.f = e7 / d();
            }
        }
        return this.f;
    }

    public final long g() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.c;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.amount;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.d;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.amount;
        }
        return 0L;
    }

    public final String h() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.a;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.b;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public k(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2) {
        this.a = null;
        this.b = tL_premiumGiftCodeOption;
        this.c = null;
        this.d = e2.u(tL_premiumGiftCodeOption2) ? tL_premiumGiftCodeOption2 : null;
    }
}
