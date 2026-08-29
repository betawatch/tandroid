package t6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;
import kotlin.jvm.internal.j;
import s6.m;
import s6.r;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends c7.a implements a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(0);
        this.b = i10;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // t6.a
    public void A0(Status status, s6.b bVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // t6.a
    public void E(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // t6.a
    public void Q(Status status, m mVar) {
        switch (this.b) {
            case 1:
                j.e(status, "status");
                o5.a(status, mVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // t6.a
    public void u0(Status status, s6.e eVar) {
        switch (this.b) {
            case 0:
                j.e(status, "status");
                o5.a(status, eVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }
}
