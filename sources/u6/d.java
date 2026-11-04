package u6;

import android.os.Parcel;
import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends o implements b {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, TaskCompletionSource taskCompletionSource, int i3) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 6);
        this.b = i3;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean I0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            Status status = (Status) m7.a.a(parcel, Status.CREATOR);
            t6.a aVar = (t6.a) m7.a.a(parcel, t6.a.CREATOR);
            m7.a.d(parcel);
            w0(status, aVar);
            return true;
        }
        if (i3 == 2) {
            Status status2 = (Status) m7.a.a(parcel, Status.CREATOR);
            t6.c cVar = (t6.c) m7.a.a(parcel, t6.c.CREATOR);
            m7.a.d(parcel);
            l0(status2, cVar);
            return true;
        }
        if (i3 == 3) {
            m7.a.d(parcel);
            throw new UnsupportedOperationException();
        }
        if (i3 != 4) {
            return false;
        }
        m7.a.d(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // u6.b
    public void l0(Status status, t6.c cVar) {
        switch (this.b) {
            case 1:
                y9.b(status, cVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // u6.b
    public void w0(Status status, t6.a aVar) {
        switch (this.b) {
            case 0:
                y9.b(status, aVar, this.c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
