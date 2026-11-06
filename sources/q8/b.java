package q8;

import a9.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class b {
    public static final e a;
    public static final com.google.android.gms.common.api.e b;

    static {
        d dVar = new d();
        e eVar = new e(13);
        a = eVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new com.google.android.gms.common.api.e("SignIn.API", eVar, dVar);
    }
}
