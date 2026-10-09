package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new p7.j(9);
    public int a;
    public String[] b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        int i11 = this.a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.m(parcel, 3, this.b);
        d0.r(parcel, q6);
    }
}
