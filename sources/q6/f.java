package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(14);
    public final s a;
    public final x0 b;
    public final i0 c;
    public final z0 d;
    public final m0 e;
    public final n0 f;
    public final y0 h;
    public final o0 n;
    public final t r;
    public final q0 s;
    public final s0 v;
    public final p0 w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.a = sVar;
        this.c = i0Var;
        this.b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f = n0Var;
        this.h = y0Var;
        this.n = o0Var;
        this.r = tVar;
        this.s = q0Var;
        this.v = s0Var;
        this.w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return b6.m.l(this.a, fVar.a) && b6.m.l(this.b, fVar.b) && b6.m.l(this.c, fVar.c) && b6.m.l(this.d, fVar.d) && b6.m.l(this.e, fVar.e) && b6.m.l(this.f, fVar.f) && b6.m.l(this.h, fVar.h) && b6.m.l(this.n, fVar.n) && b6.m.l(this.r, fVar.r) && b6.m.l(this.s, fVar.s) && b6.m.l(this.v, fVar.v) && b6.m.l(this.w, fVar.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.v, this.w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.n);
        String valueOf9 = String.valueOf(this.r);
        String valueOf10 = String.valueOf(this.s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder m9 = yh.m("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        yh.w(m9, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        yh.w(m9, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        yh.w(m9, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        yh.w(m9, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return android.support.v4.media.a.r(m9, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.a, i10);
        g5.k(parcel, 3, this.b, i10);
        g5.k(parcel, 4, this.c, i10);
        g5.k(parcel, 5, this.d, i10);
        g5.k(parcel, 6, this.e, i10);
        g5.k(parcel, 7, this.f, i10);
        g5.k(parcel, 8, this.h, i10);
        g5.k(parcel, 9, this.n, i10);
        g5.k(parcel, 10, this.r, i10);
        g5.k(parcel, 11, this.s, i10);
        g5.k(parcel, 12, this.v, i10);
        g5.k(parcel, 13, this.w, i10);
        g5.r(parcel, q10);
    }
}
