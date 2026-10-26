package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class la extends p6.a {
    public static final Parcelable.Creator<la> CREATOR = new m5(3);
    public final float a;
    public final int b;

    public la(float f7, int i10) {
        this.a = f7;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.r(parcel, q5);
    }
}
