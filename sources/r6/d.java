package r6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(22);
    public final boolean a;

    public d(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = r8.q(dest, 20293);
        r8.s(dest, 1, 4);
        dest.writeInt(this.a ? 1 : 0);
        r8.r(dest, q6);
    }
}
