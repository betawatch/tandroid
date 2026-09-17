package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new r(2);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public t(int i10, int i11, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.l(parcel, 3, this.b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        e0.r(parcel, q6);
    }
}
