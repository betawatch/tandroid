package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class m4 extends o6.a {
    public static final Parcelable.Creator<m4> CREATOR = new n5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public m4(float f7, int i10, String str, String str2) {
        this.b = str2;
        this.c = f7;
        this.a = str;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        w7.f0.l(parcel, 4, this.a);
        w7.f0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
