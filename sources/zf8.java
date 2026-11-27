// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zf8 {
    public static final zf8 b = new yf8().b();
    public static final String c;
    public final lk4 a;

    static {
        String str = gcc.a;
        c = "0";
    }

    public zf8(lk4 lk4Var) {
        this.a = lk4Var;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            lk4 lk4Var = this.a;
            if (i >= lk4Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(lk4Var.a(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zf8) {
            return this.a.equals(((zf8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
