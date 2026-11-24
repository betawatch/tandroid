// default package

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w6d extends b4 {
    public static final Parcelable.Creator<w6d> CREATOR = new jid((byte) 4);
    public final PointF[] a;
    public final int b;

    public w6d(PointF[] pointFArr, int i) {
        this.a = pointFArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.o(parcel, 2, this.a, i);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.s(parcel, r);
    }
}
