// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wyd extends b4 {
    public static final Parcelable.Creator<wyd> CREATOR = new qyd((byte) 12);
    public final qae a;
    public final qae b;

    public wyd(qae qaeVar, qae qaeVar2) {
        this.a = qaeVar;
        this.b = qaeVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wyd)) {
            return false;
        }
        wyd wydVar = (wyd) obj;
        return cqe.a(this.a, wydVar.a) && cqe.a(this.b, wydVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        qae qaeVar = this.a;
        jte.c(parcel, 1, qaeVar == null ? null : qaeVar.p());
        qae qaeVar2 = this.b;
        jte.c(parcel, 2, qaeVar2 != null ? qaeVar2.p() : null);
        jte.s(parcel, r);
    }
}
