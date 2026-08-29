package s6;

import a4.w;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(0);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.a = type;
        this.b = credentialRetrievalData;
        this.c = candidateQueryData;
        this.d = requestMatcher;
        this.e = requestType;
        this.f = protocolType;
        boolean z10 = (hd.j.e(requestType) || hd.j.e(protocolType)) ? false : true;
        boolean z11 = !hd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z10 || z11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
        th.w(sb2, "Either type: ", type, ", or requestType: ", requestType);
        throw new IllegalArgumentException(w.o(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
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
        com.google.android.gms.internal.cast.o.l(dest, 6, this.f);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
