// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum v34 implements Parcelable {
    b(9),
    c(11),
    d(18),
    e(19),
    f(20),
    h(23),
    n(27),
    r(28),
    s(29),
    w(30),
    x(35),
    y(36);

    public static final Parcelable.Creator<v34> CREATOR = new xff(7);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    v34(int i) {
        this.a = i;
    }

    public static v34 a(int i) {
        for (v34 v34Var : values()) {
            if (i == v34Var.a) {
                return v34Var;
            }
        }
        Locale locale = Locale.US;
        throw new u34(tb4.n(i, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
