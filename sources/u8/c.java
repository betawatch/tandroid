package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.l(parcel, 4, this.c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.e);
        xb.k(parcel, 7, this.f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}
