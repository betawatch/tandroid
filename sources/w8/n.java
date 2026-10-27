package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new s(2);
    public int a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.a;
        df.s(parcel, 1, 4);
        parcel.writeInt(i11);
        df.l(parcel, 2, this.b);
        df.l(parcel, 3, this.c);
        df.r(parcel, q5);
    }
}
