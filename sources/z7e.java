// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z7e extends b4 implements uc9 {
    public static final Parcelable.Creator<z7e> CREATOR = new t0e(20);
    public final Status a;

    public z7e(Status status) {
        this.a = status;
    }

    @Override // uc9
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
