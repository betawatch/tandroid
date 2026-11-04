package t7;

import android.location.Location;
import android.os.Parcel;
import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.internal.cast.o {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i3, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 9);
        this.b = i3;
        switch (i3) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 9);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean L0(Parcel parcel, int i3) {
        switch (this.b) {
            case 0:
                if (i3 == 1) {
                    Status status = (Status) d.a(parcel, Status.CREATOR);
                    Location location = (Location) d.a(parcel, Location.CREATOR);
                    d.b(parcel);
                    y9.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i3 == 1) {
                    i8.e eVar = (i8.e) d.a(parcel, i8.e.CREATOR);
                    d.b(parcel);
                    Status status2 = eVar.a;
                    i8.d dVar = new i8.d();
                    dVar.a = eVar;
                    y9.a(status2, dVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
