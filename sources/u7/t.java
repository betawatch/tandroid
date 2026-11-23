package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.a, i7);
        cc.s(parcel, r10);
    }
}
