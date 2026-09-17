package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
    public String a;
    public String b;
    public f c;
    public g d;
    public g e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.l(parcel, 3, this.b);
        e0.k(parcel, 4, this.c, i10);
        e0.k(parcel, 5, this.d, i10);
        e0.k(parcel, 6, this.e, i10);
        e0.r(parcel, q6);
    }
}
