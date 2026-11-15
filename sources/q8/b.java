package q8;

import a9.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
