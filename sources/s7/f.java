package s7;

import a8.aa;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends c8.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 9);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 9);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    @Override // c8.b
    public final boolean J0(Parcel parcel, int i10) {
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    Status status = (Status) d.a(parcel, Status.CREATOR);
                    Location location = (Location) d.a(parcel, Location.CREATOR);
                    d.b(parcel);
                    aa.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    h8.g gVar = (h8.g) d.a(parcel, h8.g.CREATOR);
                    d.b(parcel);
                    Status status2 = gVar.a;
                    h8.f fVar = new h8.f();
                    fVar.a = gVar;
                    aa.a(status2, fVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
