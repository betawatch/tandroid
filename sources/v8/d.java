package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(10);
    public String a;
    public String b;
    public int c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.l(parcel, 3, this.b);
        int i11 = this.c;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 0;
        }
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.r(parcel, q6);
    }
}
