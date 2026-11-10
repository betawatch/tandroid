package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new q4.x(2);
    public final int a;
    public List b;

    public p(int i7, List list) {
        this.a = i7;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.p(parcel, 2, this.b);
        xb.s(parcel, r10);
    }
}
