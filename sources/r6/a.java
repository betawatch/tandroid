package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.f0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(6);
    public final boolean a;
    public final int b;

    public a(int i10, boolean z10) {
        this.a = z10;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f0.r(parcel, q6);
    }
}
