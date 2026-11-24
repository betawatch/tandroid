// default package

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t9 implements b16 {
    public final /* synthetic */ String a;
    public final /* synthetic */ r9 b;
    public final /* synthetic */ s9 c;
    public final /* synthetic */ qp2 d;

    public t9(qp2 qp2Var, String str, r9 r9Var, s9 s9Var) {
        this.d = qp2Var;
        this.a = str;
        this.b = r9Var;
        this.c = s9Var;
    }

    @Override // b16
    public final void b(e16 e16Var, u06 u06Var) {
        boolean equals = u06.ON_START.equals(u06Var);
        String str = this.a;
        qp2 qp2Var = this.d;
        if (!equals) {
            if (u06.ON_STOP.equals(u06Var)) {
                qp2Var.e.remove(str);
                return;
            } else {
                if (u06.ON_DESTROY.equals(u06Var)) {
                    qp2Var.e(str);
                    return;
                }
                return;
            }
        }
        HashMap hashMap = qp2Var.e;
        Bundle bundle = qp2Var.g;
        HashMap hashMap2 = qp2Var.f;
        r9 r9Var = this.b;
        s9 s9Var = this.c;
        hashMap.put(str, new v9(r9Var, s9Var));
        if (hashMap2.containsKey(str)) {
            Object obj = hashMap2.get(str);
            hashMap2.remove(str);
            r9Var.i(obj);
        }
        q9 q9Var = (q9) bundle.getParcelable(str);
        if (q9Var != null) {
            bundle.remove(str);
            r9Var.i(s9Var.a(q9Var.b, q9Var.a));
        }
    }
}
