// default package

import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class s29 {
    public static final String a;

    static {
        String str = gcc.a;
        a = "0";
    }

    public static s29 a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = vf5.d;
            yve.f(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(vf5.d, false) ? new vf5(bundle.getBoolean(vf5.e, false)) : new vf5();
        }
        if (i == 1) {
            String str3 = u68.c;
            yve.f(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(u68.c, -1.0f);
            return f == -1.0f ? new u68() : new u68(f);
        }
        if (i == 2) {
            String str4 = fva.d;
            yve.f(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(fva.d, 5);
            float f2 = bundle.getFloat(fva.e, -1.0f);
            return f2 == -1.0f ? new fva(i2) : new fva(i2, f2);
        }
        if (i != 3) {
            lq5.j(uh9.k(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = krb.d;
        yve.f(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(krb.d, false) ? new krb(bundle.getBoolean(krb.e, false)) : new krb();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
