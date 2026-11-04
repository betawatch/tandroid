package p8;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b {
    public static final a6.b a;
    public static final e b;

    static {
        d dVar = new d();
        a6.b bVar = new a6.b(11);
        a = bVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new e("SignIn.API", bVar, dVar);
    }
}
