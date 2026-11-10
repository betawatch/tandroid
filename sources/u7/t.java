package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class t extends r6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<t> CREATOR = new m(2);
    public final Status a;

    public t(Status status) {
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.a, i7);
        xb.s(parcel, r10);
    }
}
