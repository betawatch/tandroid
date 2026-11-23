package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class t extends r6.a implements com.google.android.gms.common.api.r {
    public static final Parcelable.Creator<t> CREATOR = new m(2);
    public final Status a;

    public t(Status status) {
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.a, i7);
        bc.s(parcel, r10);
    }
}
