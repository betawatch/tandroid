package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public o(int i7, int i10, int i11, boolean z10, boolean z11) {
        this.a = i7;
        this.b = z10;
        this.c = z11;
        this.d = i10;
        this.e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        yb.s(parcel, r10);
    }
}
