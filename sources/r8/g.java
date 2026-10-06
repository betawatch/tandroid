package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.j(17);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        double d = this.a;
        g0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        g0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        g0.r(parcel, q6);
    }
}
