package s6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;
import kotlin.jvm.internal.j;
import r6.m;
import r6.r;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends b7.a implements a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(0);
        this.b = i10;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // s6.a
    public void U(Status status, r6.e eVar) {
        switch (this.b) {
            case 0:
                j.e(status, "status");
                g5.a(status, eVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // s6.a
    public void h(Status status, m mVar) {
        switch (this.b) {
            case 1:
                j.e(status, "status");
                g5.a(status, mVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // s6.a
    public void q(Status status, r6.b bVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // s6.a
    public void u0(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
