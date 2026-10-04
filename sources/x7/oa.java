package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.g0.r(parcel, q6);
    }
}
