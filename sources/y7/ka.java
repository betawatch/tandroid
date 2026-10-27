package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class ka extends p6.a {
    public static final Parcelable.Creator<ka> CREATOR = new m5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public ka(float f7, int i10, String str, String str2) {
        this.a = str;
        this.b = f7;
        this.c = str2;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.a);
        df.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        df.l(parcel, 3, this.c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
