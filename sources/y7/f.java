package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import w5.k;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new k(10);
    public final long a;
    public final a[] b;
    public final int c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.a = j10;
        this.b = aVarArr;
        this.d = z10;
        if (z10) {
            this.c = i10;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        o.o(parcel, 3, this.b, i10);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        o.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        o.r(parcel, q6);
    }
}
