package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean a;
    public final int b;

    public a(int i7, boolean z10) {
        this.a = z10;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        cc.s(parcel, r10);
    }
}
