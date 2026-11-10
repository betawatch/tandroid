package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import u8.o;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z9 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f;
        xb.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        xb.s(parcel, r10);
    }
}
