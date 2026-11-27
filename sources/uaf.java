// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class uaf extends c4 {
    public static final Parcelable.Creator<uaf> CREATOR = new t4f((byte) 10);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public uaf(float f, int i, String str, String str2) {
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        bye.l(parcel, 3, this.c);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }
}
