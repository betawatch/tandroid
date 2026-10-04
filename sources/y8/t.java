package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(15);
    public final int a;
    public final boolean b;
    public final boolean c;

    public t(int i10, boolean z10, boolean z11) {
        this.a = i10;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        w7.g0.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        w7.g0.r(parcel, q6);
    }
}
