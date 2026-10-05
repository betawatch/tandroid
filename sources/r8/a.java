package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new p7.j(9);
    public int a;
    public String[] b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.m(parcel, 3, this.b);
        g0.r(parcel, q6);
    }
}
