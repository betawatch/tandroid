package w7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import q7.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new j(28);
    public final long a;
    public final a[] b;
    public final int c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i9, boolean z10) {
        this.a = j10;
        this.b = aVarArr;
        this.d = z10;
        if (z10) {
            this.c = i9;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        p8.o(parcel, 3, this.b, i9);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.r(parcel, q10);
    }
}
