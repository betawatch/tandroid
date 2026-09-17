package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
