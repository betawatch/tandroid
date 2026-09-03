package q6;

import android.os.Parcel;
import android.os.Parcelable;
import b7.p1;
import java.util.Arrays;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u extends c6.a {
    public static final Parcelable.Creator<u> CREATOR = new l4.j(28);
    public final String a;
    public final String b;
    public final b7.w0 c;
    public final j d;
    public final i e;
    public final k f;
    public final g h;
    public final String n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        b7.w0 t6 = bArr == null ? null : b7.w0.t(bArr.length, bArr);
        boolean z4 = false;
        b6.m.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && t6 != null)) {
            z4 = true;
        }
        b6.m.a("Must provide id and rawId if not an error response.", z4);
        this.a = str;
        this.b = str2;
        this.c = t6;
        this.d = jVar;
        this.e = iVar;
        this.f = kVar;
        this.h = gVar;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return b6.m.l(this.a, uVar.a) && b6.m.l(this.b, uVar.b) && b6.m.l(this.c, uVar.c) && b6.m.l(this.d, uVar.d) && b6.m.l(this.e, uVar.e) && b6.m.l(this.f, uVar.f) && b6.m.l(this.h, uVar.h) && b6.m.l(this.n, uVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        b7.w0 w0Var = this.c;
        String c3 = i6.b.c(w0Var == null ? null : w0Var.u());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder l10 = ai.l("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        ai.w(l10, c3, ", \n registerResponse=", valueOf, ", \n signResponse=");
        ai.w(l10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        l10.append(valueOf4);
        l10.append(", \n authenticatorAttachment='");
        l10.append(this.n);
        l10.append("'}");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        p1.a.a();
        throw null;
    }
}
