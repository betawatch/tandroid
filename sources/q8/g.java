package q8;

import android.os.Parcel;
import android.os.Parcelable;
import p6.w;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new n8.g(29);
    public final int a;
    public final w b;

    public g(int i3, w wVar) {
        this.a = i3;
        this.b = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.l(parcel, 2, this.b, i3);
        j8.a.t(parcel, s6);
    }
}
