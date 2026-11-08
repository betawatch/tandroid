package q8;

import a9.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
