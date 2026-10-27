package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r extends p6.a {
    public static final Parcelable.Creator<r> CREATOR = new s(0);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public r(int i10, int i11, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
