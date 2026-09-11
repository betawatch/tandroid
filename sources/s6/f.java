package s6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f extends b8.b implements d {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 6);
        this.b = i10;
        this.c = taskCompletionSource;
    }

    @Override // b8.b
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Status status = (Status) k7.a.a(parcel, Status.CREATOR);
            r6.a aVar = (r6.a) k7.a.a(parcel, r6.a.CREATOR);
            k7.a.b(parcel);
            v(status, aVar);
            return true;
        }
        if (i10 == 2) {
            Status status2 = (Status) k7.a.a(parcel, Status.CREATOR);
            r6.c cVar = (r6.c) k7.a.a(parcel, r6.c.CREATOR);
            k7.a.b(parcel);
            W(status2, cVar);
            return true;
        }
        if (i10 == 3) {
            k7.a.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 != 4) {
            return false;
        }
        k7.a.b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // s6.d
    public void W(Status status, r6.c cVar) {
        switch (this.b) {
            case 1:
                f5.b(status, cVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // s6.d
    public void v(Status status, r6.a aVar) {
        switch (this.b) {
            case 0:
                f5.b(status, aVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
