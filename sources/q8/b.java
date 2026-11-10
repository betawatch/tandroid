package q8;

import a9.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
