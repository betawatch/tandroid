package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends z5.a {
    public static final Parcelable.Creator<k> CREATOR = new l(0);
    public final Bundle a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.a = responseBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = r8.q(dest, 20293);
        r8.b(dest, 1, this.a);
        r8.r(dest, q6);
    }
}
