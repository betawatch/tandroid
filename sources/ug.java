// default package

import j$.time.YearMonth;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ hn7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hn7 c;
    public final /* synthetic */ hn7 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ ug(hn7 hn7Var, int i, hn7 hn7Var2, hn7 hn7Var3, int i2, int i3, int i4) {
        this.a = hn7Var;
        this.b = i;
        this.c = hn7Var2;
        this.d = hn7Var3;
        this.e = i2;
        this.f = i3;
        this.h = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hn7 hn7Var = this.a;
        int value = hn7Var.getValue();
        int i = this.b;
        hn7 hn7Var2 = this.c;
        hn7 hn7Var3 = this.d;
        if (value == i) {
            hn7Var2.setMinValue(1);
            try {
                hn7Var2.setMaxValue(YearMonth.of(2024, hn7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                fa4.g(e, true);
                hn7Var2.setMaxValue(31);
            }
            hn7Var3.setMinValue(0);
            hn7Var3.setMaxValue(11);
            return;
        }
        if (hn7Var.getValue() != this.e) {
            hn7Var2.setMinValue(1);
            try {
                hn7Var2.setMaxValue(YearMonth.of(hn7Var.getValue(), hn7Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e2) {
                fa4.g(e2, true);
                hn7Var2.setMaxValue(31);
            }
            hn7Var3.setMinValue(0);
            hn7Var3.setMaxValue(11);
            return;
        }
        hn7Var3.setMinValue(0);
        int i2 = this.f;
        hn7Var3.setMaxValue(i2);
        if (hn7Var3.getValue() == i2) {
            hn7Var2.setMinValue(1);
            hn7Var2.setMaxValue(this.h);
            return;
        }
        hn7Var2.setMinValue(1);
        try {
            hn7Var2.setMaxValue(YearMonth.of(hn7Var.getValue(), hn7Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e3) {
            fa4.g(e3, true);
            hn7Var2.setMaxValue(31);
        }
    }
}
