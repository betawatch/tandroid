package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new u8.o(26);
    public String a;
    public Bundle b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.b(parcel, 3, this.b);
        yb.s(parcel, r10);
    }
}
