package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m4 extends q6.a {
    public static final Parcelable.Creator<m4> CREATOR = new n5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public m4(float f10, int i3, String str, String str2) {
        this.b = str2;
        this.c = f10;
        this.a = str;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.b);
        j8.a.r(parcel, 3, 4);
        parcel.writeFloat(this.c);
        j8.a.m(parcel, 4, this.a);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
