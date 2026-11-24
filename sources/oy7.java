// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oy7 extends b4 {
    public static final Parcelable.Creator<oy7> CREATOR = new t4d(4);
    public String a;
    public tc1 b;
    public UserAddress c;
    public vz7 d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.k(parcel, 2, this.b, i);
        jte.k(parcel, 3, this.c, i);
        jte.k(parcel, 4, this.d, i);
        jte.l(parcel, 5, this.e);
        jte.b(parcel, 6, this.f);
        jte.l(parcel, 7, this.h);
        jte.b(parcel, 8, this.n);
        jte.s(parcel, r);
    }
}
