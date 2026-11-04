package q8;

import android.os.Parcel;
import android.os.Parcelable;
import p6.x;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(0);
    public final int a;
    public final m6.a b;
    public final x c;

    public h(int i3, m6.a aVar, x xVar) {
        this.a = i3;
        this.b = aVar;
        this.c = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.l(parcel, 2, this.b, i3);
        j8.a.l(parcel, 3, this.c, i3);
        j8.a.t(parcel, s6);
    }
}
