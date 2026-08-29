package z7;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class b {
    public static final b6.b a;
    public static final e b;

    static {
        d dVar = new d();
        b6.b bVar = new b6.b(18);
        a = bVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new e("SignIn.API", bVar, dVar);
    }
}
