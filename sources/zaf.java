// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zaf extends c4 {
    public static final Parcelable.Creator<zaf> CREATOR = new t4f(11);
    public final float a;
    public final int b;

    public zaf(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.s(parcel, r);
    }
}
