package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import n4.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i extends p6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new x(28);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override // com.google.android.gms.common.api.q
    public final Status h() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.a, i10);
        df.p(parcel, 2, this.b);
        df.m(parcel, 3, this.c);
        df.r(parcel, q5);
    }
}
