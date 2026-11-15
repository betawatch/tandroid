package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.h(parcel, 2, this.a);
        yb.l(parcel, 4, this.b);
        yb.l(parcel, 5, this.c);
        yb.h(parcel, 6, this.d);
        boolean z10 = this.e;
        yb.q(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.l(parcel, 8, this.f);
        yb.s(parcel, r10);
    }
}
