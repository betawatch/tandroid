// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wbd extends c4 {
    public static final Parcelable.Creator<wbd> CREATOR = new m9d((byte) 19);
    public final gfe a;
    public final gfe b;
    public final gfe c;
    public final int d;

    public wbd(gfe gfeVar, gfe gfeVar2, gfe gfeVar3, int i) {
        this.a = gfeVar;
        this.b = gfeVar2;
        this.c = gfeVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wbd)) {
            return false;
        }
        wbd wbdVar = (wbd) obj;
        return vue.a(this.a, wbdVar.a) && vue.a(this.b, wbdVar.b) && vue.a(this.c, wbdVar.c) && this.d == wbdVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        gfe gfeVar = this.a;
        String b = lsd.b(gfeVar == null ? null : gfeVar.p());
        gfe gfeVar2 = this.b;
        String b2 = lsd.b(gfeVar2 == null ? null : gfeVar2.p());
        gfe gfeVar3 = this.c;
        String b3 = lsd.b(gfeVar3 != null ? gfeVar3.p() : null);
        StringBuilder l = xnb.l("HmacSecretExtension{coseKeyAgreement=", b, ", saltEnc=", b2, ", saltAuth=");
        l.append(b3);
        l.append(", getPinUvAuthProtocol=");
        return uh9.l(l, this.d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        gfe gfeVar = this.a;
        bye.c(parcel, 1, gfeVar == null ? null : gfeVar.p());
        gfe gfeVar2 = this.b;
        bye.c(parcel, 2, gfeVar2 == null ? null : gfeVar2.p());
        gfe gfeVar3 = this.c;
        bye.c(parcel, 3, gfeVar3 != null ? gfeVar3.p() : null);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }
}
