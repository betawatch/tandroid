// default package

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class u9 implements f36 {
    public final /* synthetic */ String a;
    public final /* synthetic */ s9 b;
    public final /* synthetic */ t9 c;
    public final /* synthetic */ jq2 d;

    public u9(jq2 jq2Var, String str, s9 s9Var, t9 t9Var) {
        this.d = jq2Var;
        this.a = str;
        this.b = s9Var;
        this.c = t9Var;
    }

    @Override // f36
    public final void b(i36 i36Var, y26 y26Var) {
        boolean equals = y26.ON_START.equals(y26Var);
        String str = this.a;
        jq2 jq2Var = this.d;
        if (!equals) {
            if (y26.ON_STOP.equals(y26Var)) {
                jq2Var.e.remove(str);
                return;
            } else {
                if (y26.ON_DESTROY.equals(y26Var)) {
                    jq2Var.e(str);
                    return;
                }
                return;
            }
        }
        HashMap hashMap = jq2Var.e;
        Bundle bundle = jq2Var.g;
        HashMap hashMap2 = jq2Var.f;
        s9 s9Var = this.b;
        t9 t9Var = this.c;
        hashMap.put(str, new w9(s9Var, t9Var));
        if (hashMap2.containsKey(str)) {
            Object obj = hashMap2.get(str);
            hashMap2.remove(str);
            s9Var.k(obj);
        }
        r9 r9Var = (r9) bundle.getParcelable(str);
        if (r9Var != null) {
            bundle.remove(str);
            s9Var.k(t9Var.a(r9Var.b, r9Var.a));
        }
    }
}
