package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import q4.x;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i extends r6.a implements r {
    public static final Parcelable.Creator<i> CREATOR = new x(20);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override // com.google.android.gms.common.api.r
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.a, i7);
        yb.p(parcel, 2, this.b);
        yb.m(parcel, 3, this.c);
        yb.s(parcel, r10);
    }
}
