package z5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new w5.k(22);
    public final n a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.a = nVar;
        this.b = z10;
        this.c = z11;
        this.d = iArr;
        this.e = i10;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.a, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.internal.cast.o.g(parcel, 4, this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.internal.cast.o.g(parcel, 6, this.f);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
