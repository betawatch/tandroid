package u7;

import a8.k8;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f extends a8.q {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i7, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 11);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 11);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // a8.q
    public final boolean l1(Parcel parcel, int i7) {
        switch (this.b) {
            case 0:
                if (i7 == 1) {
                    Status status = (Status) d.a(parcel, Status.CREATOR);
                    Location location = (Location) d.a(parcel, Location.CREATOR);
                    d.b(parcel);
                    k8.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i7 == 1) {
                    j8.e eVar = (j8.e) d.a(parcel, j8.e.CREATOR);
                    d.b(parcel);
                    Status status2 = eVar.a;
                    j8.d dVar = new j8.d();
                    dVar.a = eVar;
                    k8.a(status2, dVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
