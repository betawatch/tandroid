// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class s6d extends b4 {
    public static final Parcelable.Creator<s6d> CREATOR = new t4d((byte) 18);
    public final String a;

    public s6d(String str) {
        fre.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s6d) {
            return this.a.equals(((s6d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
