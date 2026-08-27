package y7;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class b {
    public static final a6.b a;
    public static final e b;

    static {
        d dVar = new d();
        a6.b bVar = new a6.b(18);
        a = bVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new e("SignIn.API", bVar, dVar);
    }
}
