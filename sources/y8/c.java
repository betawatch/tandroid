package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new w8.b(26);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.l(parcel, 3, this.b, i3);
        j8.a.l(parcel, 5, this.c, i3);
        j8.a.t(parcel, s6);
    }
}
