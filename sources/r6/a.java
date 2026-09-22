package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        e0.r(parcel, q6);
    }
}
