package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(8);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.h(parcel, 2, this.a);
        h0.l(parcel, 4, this.b);
        h0.l(parcel, 5, this.c);
        h0.h(parcel, 6, this.d);
        boolean z10 = this.e;
        h0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.l(parcel, 8, this.f);
        h0.r(parcel, q6);
    }
}
