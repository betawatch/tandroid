package p6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p extends q6.a {
    public static final Parcelable.Creator<p> CREATOR = new n8.g(17);
    public final int a;
    public List b;

    public p(int i3, List list) {
        this.a = i3;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.q(parcel, 2, this.b);
        j8.a.t(parcel, s6);
    }
}
