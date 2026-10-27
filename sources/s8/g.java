package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new q7.m(16);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        double d = this.a;
        df.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        df.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        df.r(parcel, q5);
    }
}
