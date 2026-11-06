package s7;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(17);
    public final String a;
    public final String b;
    public final String c;

    public f(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return p0.s(com.google.android.recaptcha.internal.a.n("DocumentId[packageName=", this.a, ", corpusName=", this.b, ", uri="), this.c, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.a);
        wb.l(parcel, 2, this.b);
        wb.l(parcel, 3, this.c);
        wb.s(parcel, r10);
    }
}
