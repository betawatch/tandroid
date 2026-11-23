package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new m6.e(20);
    public final long a;
    public final a[] b;
    public final int c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i7, boolean z10) {
        this.a = j3;
        this.b = aVarArr;
        this.d = z10;
        if (z10) {
            this.c = i7;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        bc.o(parcel, 3, this.b, i7);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.s(parcel, r10);
    }
}
