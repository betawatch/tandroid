// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q2d extends b4 {
    public static final Parcelable.Creator<q2d> CREATOR = new hx6((byte) 26);
    public final List a;

    public q2d(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.h(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
