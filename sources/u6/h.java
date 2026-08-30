package u6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.yh;
import r5.c0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(22);
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
        boolean z4 = (jd.j.e(requestType) || jd.j.e(protocolType)) ? false : true;
        boolean z10 = !jd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z4 || z10) {
            return;
        }
        StringBuilder sb = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
        yh.x(sb, "Either type: ", type, ", or requestType: ", requestType);
        throw new IllegalArgumentException(android.support.v4.media.a.p(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.l(dest, 1, this.a);
        f5.b(dest, 2, this.b);
        f5.b(dest, 3, this.c);
        f5.l(dest, 4, this.d);
        f5.l(dest, 5, this.e);
        f5.l(dest, 6, this.f);
        f5.r(dest, q10);
    }
}
