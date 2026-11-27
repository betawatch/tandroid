// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vdc extends c4 {
    public static final Parcelable.Creator<vdc> CREATOR = new mx6((byte) 23);
    public final int a;
    public final String b;
    public final int c;

    public vdc(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdc)) {
            return false;
        }
        vdc vdcVar = (vdc) obj;
        return this.a == vdcVar.a && ur5.a(this.b, vdcVar.b) && this.c == vdcVar.c;
    }

    public final int hashCode() {
        return bs2.j(this.a * 31, 31, this.b) + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 2, this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
