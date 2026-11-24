// default package

import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ov8 implements hp7, jp7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv8 b;

    public /* synthetic */ ov8(tv8 tv8Var, byte b) {
        this.a = b;
        this.b = tv8Var;
    }

    @Override // hp7
    public final String c(int i) {
        byte b = this.a;
        tv8 tv8Var = this.b;
        switch (b) {
            case 0:
                return tv8Var.P ? jb6.a0("MilesShort", null, 2131748184, Integer.valueOf(i)) : jb6.a0("KMetersShort", null, 2131748818, Integer.valueOf(i));
            default:
                if (!tv8Var.P) {
                    if (i == 1) {
                        return jb6.a0("MetersShort", null, 2131748199, 50);
                    }
                    if (i > 1) {
                        i--;
                    }
                    return jb6.a0("MetersShort", null, 2131748199, Integer.valueOf(i * 100));
                }
                if (i == 1) {
                    return jb6.a0("FootsShort", null, 2131750533, Integer.valueOf(nm7.Y3));
                }
                if (i > 1) {
                    i--;
                }
                Locale locale = Locale.US;
                return hg9.j(i, ".");
        }
    }

    @Override // jp7
    public final void g(lp7 lp7Var, int i) {
        tv8 tv8Var = this.b;
        try {
            tv8Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        tv8Var.c(true);
    }
}
