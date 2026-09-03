package v6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;
import kotlin.jvm.internal.j;
import u6.l;
import u6.r;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f extends a7.c implements a {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super(4);
        this.b = i10;
        this.c = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }

    @Override // v6.a
    public void H(Status status, l lVar) {
        switch (this.b) {
            case 1:
                j.e(status, "status");
                p5.a(status, lVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // v6.a
    public void N(Status status, r rVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // v6.a
    public void R(Status status, u6.e eVar) {
        switch (this.b) {
            case 0:
                j.e(status, "status");
                p5.a(status, eVar, this.c);
                return;
            default:
                j.e(status, "status");
                throw new UnsupportedOperationException();
        }
    }

    @Override // v6.a
    public void l(Status status, u6.b bVar) {
        j.e(status, "status");
        throw new UnsupportedOperationException();
    }
}
