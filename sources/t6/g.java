package t6;

import a8.aa;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends c8.b implements d {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 6);
        this.b = i10;
        this.c = taskCompletionSource;
    }

    @Override // c8.b
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Status status = (Status) l7.a.a(parcel, Status.CREATOR);
            s6.a aVar = (s6.a) l7.a.a(parcel, s6.a.CREATOR);
            l7.a.b(parcel);
            p0(status, aVar);
            return true;
        }
        if (i10 == 2) {
            Status status2 = (Status) l7.a.a(parcel, Status.CREATOR);
            s6.c cVar = (s6.c) l7.a.a(parcel, s6.c.CREATOR);
            l7.a.b(parcel);
            y0(status2, cVar);
            return true;
        }
        if (i10 == 3) {
            l7.a.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 != 4) {
            return false;
        }
        l7.a.b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // t6.d
    public void p0(Status status, s6.a aVar) {
        switch (this.b) {
            case 0:
                aa.b(status, aVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // t6.d
    public void y0(Status status, s6.c cVar) {
        switch (this.b) {
            case 1:
                aa.b(status, cVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
