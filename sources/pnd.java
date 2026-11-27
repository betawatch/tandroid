// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class pnd {
    public static final /* synthetic */ int a = 0;

    static {
        int i = und.D;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = old.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static wle b(int i, int i2, gi0 gi0Var, String str, uoe uoeVar) {
        try {
            dne s = wne.s();
            int i3 = gi0Var.a;
            s.b();
            wne.r((wne) s.b, i3);
            String str2 = gi0Var.c;
            s.b();
            wne.o((wne) s.b, str2);
            int i4 = gi0Var.b;
            if (i4 != 0) {
                s.b();
                wne.p((wne) s.b, i4);
            }
            if (i != 0) {
                s.b();
                wne.q((wne) s.b, i);
            }
            if (str != null) {
                s.b();
                wne.n((wne) s.b, str);
            }
            kle u = wle.u();
            u.c(s);
            u.b();
            wle.t((wle) u.b, i2);
            if (!uoeVar.equals(uoe.b)) {
                u.b();
                wle.p((wle) u.b, uoeVar);
            }
            return (wle) u.a();
        } catch (Throwable th) {
            old.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static wme c(int i, uoe uoeVar) {
        try {
            eme s = wme.s();
            s.b();
            wme.r((wme) s.b, i);
            if (!uoeVar.equals(uoe.b)) {
                s.b();
                wme.o((wme) s.b, uoeVar);
            }
            return (wme) s.a();
        } catch (Exception e) {
            old.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
