package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.e0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.h(parcel, 2, this.a);
        e0.l(parcel, 4, this.b);
        e0.l(parcel, 5, this.c);
        e0.h(parcel, 6, this.d);
        boolean z10 = this.e;
        e0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 8, this.f);
        e0.r(parcel, q6);
    }
}
