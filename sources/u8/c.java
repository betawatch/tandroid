package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new o(4);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public b f;
    public b h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.l(parcel, 4, this.c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.e);
        bc.k(parcel, 7, this.f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.s(parcel, r10);
    }
}
