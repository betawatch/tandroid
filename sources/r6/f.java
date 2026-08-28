package r6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
import kotlin.jvm.internal.i;
import q6.l;
import q6.q;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends a7.a implements a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i9, TaskCompletionSource taskCompletionSource) {
        super(0);
        this.b = i9;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // r6.a
    public void U(Status status, q6.b bVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // r6.a
    public void p0(Status status, l lVar) {
        switch (this.b) {
            case 1:
                i.e(status, "status");
                h5.a(status, lVar, this.c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // r6.a
    public void r0(Status status, q qVar) {
        i.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // r6.a
    public void t0(Status status, q6.e eVar) {
        switch (this.b) {
            case 0:
                i.e(status, "status");
                h5.a(status, eVar, this.c);
                return;
            default:
                i.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
