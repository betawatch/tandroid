// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wj7 extends b4 {
    public static final Parcelable.Creator<wj7> CREATOR = new xff((byte) 9);
    public final String a;
    public final int b;
    public final String c;

    public wj7(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.l(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
