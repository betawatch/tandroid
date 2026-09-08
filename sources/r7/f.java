package r7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.f5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f extends b8.b {
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

    @Override // b8.b
    public final boolean K0(Parcel parcel, int i10) {
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    Status status = (Status) d.a(parcel, Status.CREATOR);
                    Location location = (Location) d.a(parcel, Location.CREATOR);
                    d.b(parcel);
                    f5.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    g8.g gVar = (g8.g) d.a(parcel, g8.g.CREATOR);
                    d.b(parcel);
                    Status status2 = gVar.a;
                    g8.f fVar = new g8.f();
                    fVar.a = gVar;
                    f5.a(status2, fVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
