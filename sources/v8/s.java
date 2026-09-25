package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r(2);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public s(int i10, int i11, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.a);
        f0.l(parcel, 3, this.b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f0.r(parcel, q6);
    }
}
