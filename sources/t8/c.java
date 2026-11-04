package t8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new q8.i(18);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public b f;
    public b h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.e);
        j8.a.l(parcel, 7, this.f, i3);
        j8.a.l(parcel, 8, this.h, i3);
        j8.a.t(parcel, s6);
    }
}
