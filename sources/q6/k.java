package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends y5.a {
    public static final Parcelable.Creator<k> CREATOR = new o5.p(22);
    public final Bundle a;

    public k(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.a = responseBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.b(dest, 1, this.a);
        p8.r(dest, q10);
    }
}
