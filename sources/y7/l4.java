package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l4 extends p6.a {
    public static final Parcelable.Creator<l4> CREATOR = new m5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public l4(float f7, int i10, String str, String str2) {
        this.b = str2;
        this.c = f7;
        this.a = str;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.b);
        df.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        df.l(parcel, 4, this.a);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
