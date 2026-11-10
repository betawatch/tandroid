package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.h(parcel, 2, this.a);
        xb.l(parcel, 4, this.b);
        xb.l(parcel, 5, this.c);
        xb.h(parcel, 6, this.d);
        boolean z9 = this.e;
        xb.q(parcel, 7, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 8, this.f);
        xb.s(parcel, r10);
    }
}
