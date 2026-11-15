package s7;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import q4.x;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        return p0.s(e2.n("DocumentId[packageName=", this.a, ", corpusName=", this.b, ", uri="), this.c, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.a);
        yb.l(parcel, 2, this.b);
        yb.l(parcel, 3, this.c);
        yb.s(parcel, r10);
    }
}
