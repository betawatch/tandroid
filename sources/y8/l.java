package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new u8.o(22);
    public int a;
    public Bundle b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.b(parcel, 3, this.b);
        xb.s(parcel, r10);
    }
}
