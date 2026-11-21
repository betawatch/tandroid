package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String a;
    public String b;
    public f c;
    public g d;
    public g e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.k(parcel, 4, this.c, i7);
        bc.k(parcel, 5, this.d, i7);
        bc.k(parcel, 6, this.e, i7);
        bc.s(parcel, r10);
    }
}
