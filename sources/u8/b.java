package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 9, this.n);
        bc.s(parcel, r10);
    }
}
