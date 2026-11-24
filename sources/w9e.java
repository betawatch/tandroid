// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class w9e extends b4 {
    public static final Parcelable.Creator<w9e> CREATOR = new qyd((byte) 15);
    public final String a;
    public final String b;
    public final long c;

    public w9e(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        jte.s(parcel, r);
    }
}
