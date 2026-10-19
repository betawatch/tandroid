package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(18);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.a);
        f0.k(parcel, 3, this.b, i10);
        f0.k(parcel, 5, this.c, i10);
        f0.r(parcel, q6);
    }
}
