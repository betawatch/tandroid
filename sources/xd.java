// default package

import j$.time.YearMonth;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xd implements Runnable {
    public final /* synthetic */ hq7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hq7 c;
    public final /* synthetic */ hq7 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ xd(hq7 hq7Var, int i, hq7 hq7Var2, hq7 hq7Var3, int i2, int i3, int i4) {
        this.a = hq7Var;
        this.b = i;
        this.c = hq7Var2;
        this.d = hq7Var3;
        this.e = i2;
        this.f = i3;
        this.h = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hq7 hq7Var = this.a;
        int value = hq7Var.getValue();
        int i = this.b;
        hq7 hq7Var2 = this.c;
        hq7 hq7Var3 = this.d;
        if (value == i) {
            hq7Var2.setMinValue(1);
            try {
                hq7Var2.setMaxValue(YearMonth.of(2024, hq7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                cc4.g(e, true);
                hq7Var2.setMaxValue(31);
            }
            hq7Var3.setMinValue(0);
            hq7Var3.setMaxValue(11);
            return;
        }
        if (hq7Var.getValue() != this.e) {
            hq7Var2.setMinValue(1);
            try {
                hq7Var2.setMaxValue(YearMonth.of(hq7Var.getValue(), hq7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e2) {
                cc4.g(e2, true);
                hq7Var2.setMaxValue(31);
            }
            hq7Var3.setMinValue(0);
            hq7Var3.setMaxValue(11);
            return;
        }
        hq7Var3.setMinValue(0);
        int i2 = this.f;
        hq7Var3.setMaxValue(i2);
        if (hq7Var3.getValue() == i2) {
            hq7Var2.setMinValue(1);
            hq7Var2.setMaxValue(this.h);
            return;
        }
        hq7Var2.setMinValue(1);
        try {
            hq7Var2.setMaxValue(YearMonth.of(hq7Var.getValue(), hq7Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e3) {
            cc4.g(e3, true);
            hq7Var2.setMaxValue(31);
        }
    }
}
