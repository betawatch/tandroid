// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum q44 implements Parcelable {
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

    public static final Parcelable.Creator<q44> CREATOR = new nkf(7);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    q44(int i) {
        this.a = i;
    }

    public static q44 a(int i) {
        for (q44 q44Var : values()) {
            if (i == q44Var.a) {
                return q44Var;
            }
        }
        Locale locale = Locale.US;
        throw new p44(qd4.n(i, "Error code ", " is not supported"));
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
