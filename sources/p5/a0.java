package p5;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 extends a6.a {
    public static final Parcelable.Creator<a0> CREATOR = new w0(7);
    public final boolean a;

    public a0(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
