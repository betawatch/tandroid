package v6;

import a8.l8;
import a8.q;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d extends q implements b {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, TaskCompletionSource taskCompletionSource, int i7) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 8);
        this.b = i7;
        this.c = taskCompletionSource;
    }

    @Override // v6.b
    public void D0(Status status, u6.a aVar) {
        switch (this.b) {
            case 0:
                l8.b(status, aVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // v6.b
    public void L(Status status, u6.c cVar) {
        switch (this.b) {
            case 1:
                l8.b(status, cVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // a8.q
    public final boolean i1(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            Status status = (Status) n7.a.a(parcel, Status.CREATOR);
            u6.a aVar = (u6.a) n7.a.a(parcel, u6.a.CREATOR);
            n7.a.d(parcel);
            D0(status, aVar);
            return true;
        }
        if (i7 == 2) {
            Status status2 = (Status) n7.a.a(parcel, Status.CREATOR);
            u6.c cVar = (u6.c) n7.a.a(parcel, u6.c.CREATOR);
            n7.a.d(parcel);
            L(status2, cVar);
            return true;
        }
        if (i7 == 3) {
            n7.a.d(parcel);
            throw new UnsupportedOperationException();
        }
        if (i7 != 4) {
            return false;
        }
        n7.a.d(parcel);
        throw new UnsupportedOperationException();
    }
}
