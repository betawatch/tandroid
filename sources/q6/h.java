package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new o5.p(18);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.i.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.i.e(requestType, "requestType");
        kotlin.jvm.internal.i.e(protocolType, "protocolType");
        this.a = type;
        this.b = credentialRetrievalData;
        this.c = candidateQueryData;
        this.d = requestMatcher;
        this.e = requestType;
        this.f = protocolType;
        boolean z10 = (fd.j.e(requestType) || fd.j.e(protocolType)) ? false : true;
        boolean z11 = !fd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z10 || z11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
        r0.A(sb2, "Either type: ", type, ", or requestType: ", requestType);
        throw new IllegalArgumentException(aa.d.p(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.l(dest, 1, this.a);
        p8.b(dest, 2, this.b);
        p8.b(dest, 3, this.c);
        p8.l(dest, 4, this.d);
        p8.l(dest, 5, this.e);
        p8.l(dest, 6, this.f);
        p8.r(dest, q10);
    }
}
