package s6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new w0(28);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final ResultReceiver f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.a = type;
        this.b = credentialData;
        this.c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.l(dest, 1, this.a);
        com.google.android.gms.internal.cast.o.b(dest, 2, this.b);
        com.google.android.gms.internal.cast.o.b(dest, 3, this.c);
        com.google.android.gms.internal.cast.o.l(dest, 4, this.d);
        com.google.android.gms.internal.cast.o.l(dest, 5, this.e);
        com.google.android.gms.internal.cast.o.k(dest, 6, this.f, i10);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
