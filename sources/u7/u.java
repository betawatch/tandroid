package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u extends r6.a implements com.google.android.gms.common.api.r {
    public static final Parcelable.Creator<u> CREATOR = new n(2);
    public final Status a;

    public u(Status status) {
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.a, i7);
        yb.s(parcel, r10);
    }
}
