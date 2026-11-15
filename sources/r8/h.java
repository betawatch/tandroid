package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int a;
    public final n6.a b;
    public final q6.x c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.a = i7;
        this.b = aVar;
        this.c = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.k(parcel, 2, this.b, i7);
        yb.k(parcel, 3, this.c, i7);
        yb.s(parcel, r10);
    }
}
