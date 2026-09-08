package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(3);
    public final float a;
    public final int b;

    public oa(float f7, int i10) {
        this.a = f7;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.e0.r(parcel, q6);
    }
}
