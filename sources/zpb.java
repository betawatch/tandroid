// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zpb extends b4 {
    public static final Parcelable.Creator<zpb> CREATOR = new j9d(9);
    public final xpb a;
    public final String b;

    static {
        new zpb("supported", null);
        new zpb("not-supported", null);
    }

    public zpb(String str, String str2) {
        fre.h(str);
        try {
            this.a = xpb.a(str);
            this.b = str2;
        } catch (ypb e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zpb)) {
            return false;
        }
        zpb zpbVar = (zpb) obj;
        return vze.a(this.a, zpbVar.a) && vze.a(this.b, zpbVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a.a);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
