package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new u8.o(23);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public r(int i7, int i10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i7;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        yb.s(parcel, r10);
    }
}
