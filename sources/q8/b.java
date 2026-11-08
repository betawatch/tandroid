package q8;

import a9.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
