package r7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v7.i5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final boolean L0(Parcel parcel, int i10) {
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    Status status = (Status) d.a(parcel, Status.CREATOR);
                    Location location = (Location) d.a(parcel, Location.CREATOR);
                    d.b(parcel);
                    i5.a(status, location, this.c);
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    g8.e eVar = (g8.e) d.a(parcel, g8.e.CREATOR);
                    d.b(parcel);
                    Status status2 = eVar.a;
                    g8.d dVar = new g8.d();
                    dVar.a = eVar;
                    i5.a(status2, dVar, this.c);
                    break;
                }
                break;
        }
        return true;
    }
}
