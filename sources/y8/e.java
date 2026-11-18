package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int r10 = bc.r(parcel, 20293);
        bc.h(parcel, 2, this.a);
        bc.l(parcel, 4, this.b);
        bc.l(parcel, 5, this.c);
        bc.h(parcel, 6, this.d);
        boolean z10 = this.e;
        bc.q(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 8, this.f);
        bc.s(parcel, r10);
    }
}
