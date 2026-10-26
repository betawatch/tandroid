package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m6 extends p6.a {
    public static final Parcelable.Creator<m6> CREATOR = new m5(1);
    public final int a;
    public final float b;
    public final int c;

    public m6(int i10, int i11, float f7, int i12) {
        if (i10 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i11;
        this.b = f7;
        this.c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(1);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 4, 4);
        parcel.writeFloat(this.b);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.c);
        df.r(parcel, q5);
    }
}
