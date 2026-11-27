// default package

import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ww8 implements dq7, fq7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bx8 b;

    public /* synthetic */ ww8(bx8 bx8Var, byte b) {
        this.a = b;
        this.b = bx8Var;
    }

    @Override // dq7
    public final String c(int i) {
        byte b = this.a;
        bx8 bx8Var = this.b;
        switch (b) {
            case 0:
                return bx8Var.P ? ob6.a0("MilesShort", null, 2131748181, Integer.valueOf(i)) : ob6.a0("KMetersShort", null, 2131748815, Integer.valueOf(i));
            default:
                if (!bx8Var.P) {
                    if (i == 1) {
                        return ob6.a0("MetersShort", null, 2131748196, 50);
                    }
                    if (i > 1) {
                        i--;
                    }
                    return ob6.a0("MetersShort", null, 2131748196, Integer.valueOf(i * 100));
                }
                if (i == 1) {
                    return ob6.a0("FootsShort", null, 2131750561, Integer.valueOf(jn7.Y3));
                }
                if (i > 1) {
                    i--;
                }
                Locale locale = Locale.US;
                return uh9.k(i, ".");
        }
    }

    @Override // fq7
    public final void i(hq7 hq7Var, int i) {
        bx8 bx8Var = this.b;
        try {
            bx8Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        bx8Var.c(true);
    }
}
