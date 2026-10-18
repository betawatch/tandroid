package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.m(15);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        double d = this.a;
        f0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        f0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        f0.r(parcel, q6);
    }
}
