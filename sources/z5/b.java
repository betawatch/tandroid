package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b implements q {
    public final Status a;
    public final GoogleSignInAccount b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.a;
    }
}
