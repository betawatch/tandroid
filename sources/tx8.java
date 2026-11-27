// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tx8 extends c4 {
    public static final Parcelable.Creator<tx8> CREATOR = new m9d(24);
    public final String a;
    public final String b;
    public final gfe c;
    public final c50 d;
    public final b50 e;
    public final d50 f;
    public final z40 h;
    public final String n;

    public tx8(String str, String str2, byte[] bArr, c50 c50Var, b50 b50Var, d50 d50Var, z40 z40Var, String str3) {
        gfe o = bArr == null ? null : gfe.o(bArr.length, bArr);
        boolean z = false;
        xve.a("Must provide a response object.", (c50Var != null && b50Var == null && d50Var == null) || (c50Var == null && b50Var != null && d50Var == null) || (c50Var == null && b50Var == null && d50Var != null));
        if (d50Var != null || (str != null && o != null)) {
            z = true;
        }
        xve.a("Must provide id and rawId if not an error response.", z);
        this.a = str;
        this.b = str2;
        this.c = o;
        this.d = c50Var;
        this.e = b50Var;
        this.f = d50Var;
        this.h = z40Var;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tx8)) {
            return false;
        }
        tx8 tx8Var = (tx8) obj;
        return vue.a(this.a, tx8Var.a) && vue.a(this.b, tx8Var.b) && vue.a(this.c, tx8Var.c) && vue.a(this.d, tx8Var.d) && vue.a(this.e, tx8Var.e) && vue.a(this.f, tx8Var.f) && vue.a(this.h, tx8Var.h) && vue.a(this.n, tx8Var.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        gfe gfeVar = this.c;
        String b = lsd.b(gfeVar == null ? null : gfeVar.p());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder l = xnb.l("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        qu6.u(l, b, ", \n registerResponse=", valueOf, ", \n signResponse=");
        qu6.u(l, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        l.append(valueOf4);
        l.append(", \n authenticatorAttachment='");
        l.append(this.n);
        l.append("'}");
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ene.a.a();
        throw null;
    }
}
