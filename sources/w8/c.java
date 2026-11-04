package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new b(2);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f;
        j8.a.r(parcel, 7, 4);
        parcel.writeFloat(f10);
        j8.a.t(parcel, s6);
    }
}
