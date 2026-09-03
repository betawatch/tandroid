package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import r5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(21);
    public final String a;
    public final Bundle b;

    public g(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        this.a = type;
        this.b = data;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = g5.q(dest, 20293);
        g5.l(dest, 1, this.a);
        g5.b(dest, 2, this.b);
        g5.r(dest, q10);
    }
}
