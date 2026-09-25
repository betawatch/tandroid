package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p7.j(16);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.a);
        f0.l(parcel, 3, this.b);
        f0.l(parcel, 4, this.c);
        f0.l(parcel, 5, this.d);
        f0.l(parcel, 6, this.e);
        f0.l(parcel, 7, this.f);
        f0.l(parcel, 8, this.h);
        f0.r(parcel, q6);
    }
}
