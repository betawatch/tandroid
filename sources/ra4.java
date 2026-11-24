// default package

import android.os.SystemClock;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ra4 {
    public final ca4 a;
    public la4 b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public d g;

    public ra4(h64 h64Var, ca4 ca4Var) {
        this.a = ca4Var;
    }

    public final void a() {
        la4 la4Var = this.b;
        if (la4Var != null) {
            this.b = null;
            Integer valueOf = this.e ? Integer.valueOf((int) (SystemClock.uptimeMillis() - this.c)) : null;
            String str = this.a.b;
            if (la4Var == ia4.g) {
                ia4.g = null;
            }
            la4Var.i = valueOf;
            if (str != null) {
                ia4.d.postRunnable(new ba4(str, la4Var, (byte) 0));
            }
        }
    }
}
