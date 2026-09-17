package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(26);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        e0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        e0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f;
        e0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        e0.r(parcel, q6);
    }
}
