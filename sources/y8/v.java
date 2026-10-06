package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int a;
    public final String b;

    public v(int i10, String str) {
        this.a = i10;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.g0.l(parcel, 3, this.b);
        w7.g0.r(parcel, q6);
    }
}
