package z7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import y5.v;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new w7.f(25);
    public final int a;
    public final v5.a b;
    public final v c;

    public h(int i10, v5.a aVar, v vVar) {
        this.a = i10;
        this.b = aVar;
        this.c = vVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.k(parcel, 2, this.b, i10);
        r8.k(parcel, 3, this.c, i10);
        r8.r(parcel, q6);
    }
}
