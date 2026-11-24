// default package

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.identity.intents.model.UserAddress;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v6d implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ v6d(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = 0;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        byte[][] bArr = null;
        String str6 = null;
        String str7 = null;
        Bundle bundle = null;
        String str8 = null;
        ws wsVar = null;
        ce1 ce1Var = null;
        String str9 = null;
        Status status = null;
        Intent intent = null;
        switch (this.a) {
            case 0:
                int z7 = jve.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        i = jve.u(parcel, readInt);
                    } else if (c != 3) {
                        jve.y(parcel, readInt);
                    } else {
                        strArr = jve.i(parcel, readInt);
                    }
                }
                jve.m(parcel, z7);
                lf0 lf0Var = new lf0();
                lf0Var.a = i;
                lf0Var.b = strArr;
                return lf0Var;
            case 1:
                int z8 = jve.z(parcel);
                while (parcel.dataPosition() < z8) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        jve.y(parcel, readInt2);
                    } else {
                        intent = (Intent) jve.g(parcel, readInt2, Intent.CREATOR);
                    }
                }
                jve.m(parcel, z8);
                return new ok2(intent);
            case 2:
                int z9 = jve.z(parcel);
                int i8 = 0;
                int i9 = 0;
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num = null;
                while (parcel.dataPosition() < z9) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i8 = jve.u(parcel, readInt3);
                    } else if (c2 == 2) {
                        i9 = jve.u(parcel, readInt3);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) jve.g(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c2 == 4) {
                        str10 = jve.h(parcel, readInt3);
                    } else if (c2 != 5) {
                        jve.y(parcel, readInt3);
                    } else {
                        num = jve.v(parcel, readInt3);
                    }
                }
                jve.m(parcel, z9);
                return new ot2(i8, i9, pendingIntent, str10, num);
            case 3:
                int z10 = jve.z(parcel);
                ld6 ld6Var = null;
                while (parcel.dataPosition() < z10) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        status = (Status) jve.g(parcel, readInt4, Status.CREATOR);
                    } else if (c3 != 2) {
                        jve.y(parcel, readInt4);
                    } else {
                        ld6Var = (ld6) jve.g(parcel, readInt4, ld6.CREATOR);
                    }
                }
                jve.m(parcel, z10);
                return new kd6(status, ld6Var);
            case 4:
                int z11 = jve.z(parcel);
                be1 be1Var = null;
                UserAddress userAddress = null;
                y18 y18Var = null;
                String str11 = null;
                Bundle bundle2 = null;
                String str12 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str9 = jve.h(parcel, readInt5);
                            break;
                        case 2:
                            be1Var = (be1) jve.g(parcel, readInt5, be1.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) jve.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 4:
                            y18Var = (y18) jve.g(parcel, readInt5, y18.CREATOR);
                            break;
                        case 5:
                            str11 = jve.h(parcel, readInt5);
                            break;
                        case 6:
                            bundle2 = jve.a(parcel, readInt5);
                            break;
                        case 7:
                            str12 = jve.h(parcel, readInt5);
                            break;
                        case '\b':
                            bundle3 = jve.a(parcel, readInt5);
                            break;
                        default:
                            jve.y(parcel, readInt5);
                            break;
                    }
                }
                jve.m(parcel, z11);
                q08 q08Var = new q08();
                q08Var.a = str9;
                q08Var.b = be1Var;
                q08Var.c = userAddress;
                q08Var.d = y18Var;
                q08Var.e = str11;
                q08Var.f = bundle2;
                q08Var.h = str12;
                q08Var.n = bundle3;
                return q08Var;
            case 5:
                int z12 = jve.z(parcel);
                long j2 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                boolean z13 = false;
                boolean z14 = false;
                ArrayList arrayList2 = null;
                int[] iArr = null;
                String str13 = null;
                IBinder iBinder = null;
                while (parcel.dataPosition() < z12) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            arrayList2 = jve.j(parcel, readInt6);
                            break;
                        case 3:
                            iArr = jve.d(parcel, readInt6);
                            break;
                        case 4:
                            j2 = jve.w(parcel, readInt6);
                            break;
                        case 5:
                            str13 = jve.h(parcel, readInt6);
                            break;
                        case 6:
                            i10 = jve.u(parcel, readInt6);
                            break;
                        case 7:
                            i11 = jve.u(parcel, readInt6);
                            break;
                        case '\b':
                            i12 = jve.u(parcel, readInt6);
                            break;
                        case '\t':
                            i13 = jve.u(parcel, readInt6);
                            break;
                        case '\n':
                            i14 = jve.u(parcel, readInt6);
                            break;
                        case 11:
                            i15 = jve.u(parcel, readInt6);
                            break;
                        case '\f':
                            i16 = jve.u(parcel, readInt6);
                            break;
                        case '\r':
                            i17 = jve.u(parcel, readInt6);
                            break;
                        case 14:
                            i18 = jve.u(parcel, readInt6);
                            break;
                        case 15:
                            i19 = jve.u(parcel, readInt6);
                            break;
                        case 16:
                            i20 = jve.u(parcel, readInt6);
                            break;
                        case 17:
                            i21 = jve.u(parcel, readInt6);
                            break;
                        case 18:
                            i22 = jve.u(parcel, readInt6);
                            break;
                        case 19:
                            i23 = jve.u(parcel, readInt6);
                            break;
                        case 20:
                            i24 = jve.u(parcel, readInt6);
                            break;
                        case 21:
                            i25 = jve.u(parcel, readInt6);
                            break;
                        case 22:
                            i26 = jve.u(parcel, readInt6);
                            break;
                        case 23:
                            i27 = jve.u(parcel, readInt6);
                            break;
                        case 24:
                            i28 = jve.u(parcel, readInt6);
                            break;
                        case 25:
                            i29 = jve.u(parcel, readInt6);
                            break;
                        case 26:
                            i30 = jve.u(parcel, readInt6);
                            break;
                        case 27:
                            i31 = jve.u(parcel, readInt6);
                            break;
                        case 28:
                            i32 = jve.u(parcel, readInt6);
                            break;
                        case 29:
                            i33 = jve.u(parcel, readInt6);
                            break;
                        case nm7.S /* 30 */:
                            i34 = jve.u(parcel, readInt6);
                            break;
                        case 31:
                            i35 = jve.u(parcel, readInt6);
                            break;
                        case ' ':
                            i36 = jve.u(parcel, readInt6);
                            break;
                        case '!':
                            iBinder = jve.t(parcel, readInt6);
                            break;
                        case '\"':
                            z13 = jve.n(parcel, readInt6);
                            break;
                        case '#':
                            z14 = jve.n(parcel, readInt6);
                            break;
                        default:
                            jve.y(parcel, readInt6);
                            break;
                    }
                }
                jve.m(parcel, z12);
                return new tn7(arrayList2, iArr, j2, str13, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder, z13, z14);
            case 6:
                int z15 = jve.z(parcel);
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 2) {
                        i7 = jve.u(parcel, readInt7);
                    } else if (c4 == 3) {
                        z16 = jve.n(parcel, readInt7);
                    } else if (c4 != 4) {
                        jve.y(parcel, readInt7);
                    } else {
                        z17 = jve.n(parcel, readInt7);
                    }
                }
                jve.m(parcel, z15);
                return new ckf(i7, z16, z17);
            case 7:
                int z18 = jve.z(parcel);
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        jve.y(parcel, readInt8);
                    } else {
                        z6 = jve.n(parcel, readInt8);
                    }
                }
                jve.m(parcel, z18);
                return new xjf(z6);
            case 8:
                int z19 = jve.z(parcel);
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                boolean z25 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            z20 = jve.n(parcel, readInt9);
                            break;
                        case 2:
                            z21 = jve.n(parcel, readInt9);
                            break;
                        case 3:
                            z22 = jve.n(parcel, readInt9);
                            break;
                        case 4:
                            z23 = jve.n(parcel, readInt9);
                            break;
                        case 5:
                            z24 = jve.n(parcel, readInt9);
                            break;
                        case 6:
                            z25 = jve.n(parcel, readInt9);
                            break;
                        default:
                            jve.y(parcel, readInt9);
                            break;
                    }
                }
                jve.m(parcel, z19);
                return new ld6(z20, z21, z22, z23, z24, z25);
            case 9:
                int z26 = jve.z(parcel);
                boolean z27 = false;
                boolean z28 = false;
                nia niaVar = null;
                ArrayList arrayList3 = null;
                z18 z18Var = null;
                n0c n0cVar = null;
                String str14 = null;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            z5 = jve.n(parcel, readInt10);
                            break;
                        case 2:
                            z27 = jve.n(parcel, readInt10);
                            break;
                        case 3:
                            ce1Var = (ce1) jve.g(parcel, readInt10, ce1.CREATOR);
                            break;
                        case 4:
                            z28 = jve.n(parcel, readInt10);
                            break;
                        case 5:
                            niaVar = (nia) jve.g(parcel, readInt10, nia.CREATOR);
                            break;
                        case 6:
                            arrayList3 = jve.e(parcel, readInt10);
                            break;
                        case 7:
                            z18Var = (z18) jve.g(parcel, readInt10, z18.CREATOR);
                            break;
                        case '\b':
                            n0cVar = (n0c) jve.g(parcel, readInt10, n0c.CREATOR);
                            break;
                        case '\t':
                            z = jve.n(parcel, readInt10);
                            break;
                        case '\n':
                            str14 = jve.h(parcel, readInt10);
                            break;
                        case 11:
                            bundle4 = jve.a(parcel, readInt10);
                            break;
                        default:
                            jve.y(parcel, readInt10);
                            break;
                    }
                }
                jve.m(parcel, z26);
                r08 r08Var = new r08();
                r08Var.a = z5;
                r08Var.b = z27;
                r08Var.c = ce1Var;
                r08Var.d = z28;
                r08Var.e = niaVar;
                r08Var.f = arrayList3;
                r08Var.h = z18Var;
                r08Var.n = n0cVar;
                r08Var.r = z;
                r08Var.s = str14;
                r08Var.w = bundle4;
                return r08Var;
            case 10:
                int z29 = jve.z(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                int i37 = 0;
                int i38 = 0;
                dcd dcdVar = null;
                while (parcel.dataPosition() < z29) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            d = jve.q(parcel, readInt11);
                            break;
                        case 3:
                            z4 = jve.n(parcel, readInt11);
                            break;
                        case 4:
                            i37 = jve.u(parcel, readInt11);
                            break;
                        case 5:
                            wsVar = (ws) jve.g(parcel, readInt11, ws.CREATOR);
                            break;
                        case 6:
                            i38 = jve.u(parcel, readInt11);
                            break;
                        case 7:
                            dcdVar = (dcd) jve.g(parcel, readInt11, dcd.CREATOR);
                            break;
                        case '\b':
                            d2 = jve.q(parcel, readInt11);
                            break;
                        default:
                            jve.y(parcel, readInt11);
                            break;
                    }
                }
                jve.m(parcel, z29);
                o7d o7dVar = new o7d();
                o7dVar.a = d;
                o7dVar.b = z4;
                o7dVar.c = i37;
                o7dVar.d = wsVar;
                o7dVar.e = i38;
                o7dVar.f = dcdVar;
                o7dVar.h = d2;
                return o7dVar;
            case 11:
                int z30 = jve.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        jve.y(parcel, readInt12);
                    } else {
                        j = jve.w(parcel, readInt12);
                    }
                }
                jve.m(parcel, z30);
                return new p7d(j);
            case 12:
                int z31 = jve.z(parcel);
                long j3 = -1;
                long j4 = -1;
                int i39 = 1;
                int i40 = 1;
                while (parcel.dataPosition() < z31) {
                    int readInt13 = parcel.readInt();
                    char c5 = (char) readInt13;
                    if (c5 == 1) {
                        i39 = jve.u(parcel, readInt13);
                    } else if (c5 == 2) {
                        i40 = jve.u(parcel, readInt13);
                    } else if (c5 == 3) {
                        j3 = jve.w(parcel, readInt13);
                    } else if (c5 != 4) {
                        jve.y(parcel, readInt13);
                    } else {
                        j4 = jve.w(parcel, readInt13);
                    }
                }
                jve.m(parcel, z31);
                return new x7d(i39, i40, j3, j4);
            case 13:
                int z32 = jve.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    char c6 = (char) readInt14;
                    if (c6 == 2) {
                        i6 = jve.u(parcel, readInt14);
                    } else if (c6 != 3) {
                        jve.y(parcel, readInt14);
                    } else {
                        str8 = jve.h(parcel, readInt14);
                    }
                }
                jve.m(parcel, z32);
                y18 y18Var2 = new y18();
                y18Var2.a = i6;
                y18Var2.b = str8;
                return y18Var2;
            case 14:
                int z33 = jve.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        jve.y(parcel, readInt15);
                    } else {
                        z3 = jve.n(parcel, readInt15);
                    }
                }
                jve.m(parcel, z33);
                return new b8d(z3);
            case 15:
                int z34 = jve.z(parcel);
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    char c7 = (char) readInt16;
                    if (c7 == 2) {
                        i5 = jve.u(parcel, readInt16);
                    } else if (c7 != 3) {
                        jve.y(parcel, readInt16);
                    } else {
                        bundle = jve.a(parcel, readInt16);
                    }
                }
                jve.m(parcel, z34);
                z18 z18Var2 = new z18();
                z18Var2.a = i5;
                z18Var2.b = bundle;
                return z18Var2;
            case 16:
                int z35 = jve.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        jve.y(parcel, readInt17);
                    } else {
                        z2 = jve.n(parcel, readInt17);
                    }
                }
                jve.m(parcel, z35);
                return new c15(z2);
            case 17:
                int z36 = jve.z(parcel);
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                boolean z37 = false;
                boolean z38 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt18 = parcel.readInt();
                    char c8 = (char) readInt18;
                    if (c8 == 1) {
                        i41 = jve.u(parcel, readInt18);
                    } else if (c8 == 2) {
                        z37 = jve.n(parcel, readInt18);
                    } else if (c8 == 3) {
                        z38 = jve.n(parcel, readInt18);
                    } else if (c8 == 4) {
                        i42 = jve.u(parcel, readInt18);
                    } else if (c8 != 5) {
                        jve.y(parcel, readInt18);
                    } else {
                        i43 = jve.u(parcel, readInt18);
                    }
                }
                jve.m(parcel, z36);
                return new ol9(i41, i42, i43, z37, z38);
            case 18:
                int z39 = jve.z(parcel);
                while (parcel.dataPosition() < z39) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        jve.y(parcel, readInt19);
                    } else {
                        str7 = jve.h(parcel, readInt19);
                    }
                }
                jve.m(parcel, z39);
                return new u8d(str7);
            case 19:
                int z40 = jve.z(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    char c9 = (char) readInt20;
                    if (c9 == 1) {
                        bArr2 = jve.b(parcel, readInt20);
                    } else if (c9 == 2) {
                        bArr3 = jve.b(parcel, readInt20);
                    } else if (c9 == 3) {
                        bArr4 = jve.b(parcel, readInt20);
                    } else if (c9 != 4) {
                        jve.y(parcel, readInt20);
                    } else {
                        i4 = jve.u(parcel, readInt20);
                    }
                }
                jve.m(parcel, z40);
                return new f9d(bArr2 == null ? null : rce.o(bArr2.length, bArr2), bArr3 == null ? null : rce.o(bArr3.length, bArr3), bArr4 != null ? rce.o(bArr4.length, bArr4) : null, i4);
            case 20:
                int z41 = jve.z(parcel);
                int i44 = 0;
                String str15 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    char c10 = (char) readInt21;
                    if (c10 == 2) {
                        str6 = jve.h(parcel, readInt21);
                    } else if (c10 == 3) {
                        str15 = jve.h(parcel, readInt21);
                    } else if (c10 == 4) {
                        i3 = jve.u(parcel, readInt21);
                    } else if (c10 != 5) {
                        jve.y(parcel, readInt21);
                    } else {
                        i44 = jve.u(parcel, readInt21);
                    }
                }
                jve.m(parcel, z41);
                return new n9d(i3, i44, str6, str15);
            case 21:
                int z42 = jve.z(parcel);
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        jve.y(parcel, readInt22);
                    } else {
                        bArr = jve.c(parcel, readInt22);
                    }
                }
                jve.m(parcel, z42);
                return new y9d(bArr);
            case 22:
                int z43 = jve.z(parcel);
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        jve.y(parcel, readInt23);
                    } else {
                        arrayList = jve.j(parcel, readInt23);
                    }
                }
                jve.m(parcel, z43);
                nia niaVar2 = new nia();
                niaVar2.a = arrayList;
                return niaVar2;
            case 23:
                int z44 = jve.z(parcel);
                qw8 qw8Var = null;
                tw8 tw8Var = null;
                byte[] bArr5 = null;
                ArrayList arrayList4 = null;
                Double d3 = null;
                ArrayList arrayList5 = null;
                d60 d60Var = null;
                Integer num2 = null;
                asb asbVar = null;
                String str16 = null;
                w50 w50Var = null;
                String str17 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z44) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            qw8Var = (qw8) jve.g(parcel, readInt24, qw8.CREATOR);
                            break;
                        case 3:
                            tw8Var = (tw8) jve.g(parcel, readInt24, tw8.CREATOR);
                            break;
                        case 4:
                            bArr5 = jve.b(parcel, readInt24);
                            break;
                        case 5:
                            arrayList4 = jve.l(parcel, readInt24, pw8.CREATOR);
                            break;
                        case 6:
                            int x = jve.x(parcel, readInt24);
                            if (x != 0) {
                                jve.B(parcel, x, 8);
                                d3 = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d3 = null;
                                break;
                            }
                        case 7:
                            arrayList5 = jve.l(parcel, readInt24, ow8.CREATOR);
                            break;
                        case '\b':
                            d60Var = (d60) jve.g(parcel, readInt24, d60.CREATOR);
                            break;
                        case '\t':
                            num2 = jve.v(parcel, readInt24);
                            break;
                        case '\n':
                            asbVar = (asb) jve.g(parcel, readInt24, asb.CREATOR);
                            break;
                        case 11:
                            str16 = jve.h(parcel, readInt24);
                            break;
                        case '\f':
                            w50Var = (w50) jve.g(parcel, readInt24, w50.CREATOR);
                            break;
                        case '\r':
                            str17 = jve.h(parcel, readInt24);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) jve.g(parcel, readInt24, ResultReceiver.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt24);
                            break;
                    }
                }
                jve.m(parcel, z44);
                return new nw8(qw8Var, tw8Var, bArr5, arrayList4, d3, arrayList5, d60Var, num2, asbVar, str16, w50Var, str17, resultReceiver);
            case 24:
                int z45 = jve.z(parcel);
                String str18 = null;
                String str19 = null;
                byte[] bArr6 = null;
                a60 a60Var = null;
                z50 z50Var = null;
                b60 b60Var = null;
                x50 x50Var = null;
                String str20 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str18 = jve.h(parcel, readInt25);
                            break;
                        case 2:
                            str19 = jve.h(parcel, readInt25);
                            break;
                        case 3:
                            bArr6 = jve.b(parcel, readInt25);
                            break;
                        case 4:
                            a60Var = (a60) jve.g(parcel, readInt25, a60.CREATOR);
                            break;
                        case 5:
                            z50Var = (z50) jve.g(parcel, readInt25, z50.CREATOR);
                            break;
                        case 6:
                            b60Var = (b60) jve.g(parcel, readInt25, b60.CREATOR);
                            break;
                        case 7:
                            x50Var = (x50) jve.g(parcel, readInt25, x50.CREATOR);
                            break;
                        case '\b':
                            str20 = jve.h(parcel, readInt25);
                            break;
                        case '\t':
                            jve.h(parcel, readInt25);
                            break;
                        default:
                            jve.y(parcel, readInt25);
                            break;
                    }
                }
                jve.m(parcel, z45);
                return new lw8(str18, str19, bArr6, a60Var, z50Var, b60Var, x50Var, str20);
            case 25:
                int z46 = jve.z(parcel);
                String str21 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt26 = parcel.readInt();
                    char c11 = (char) readInt26;
                    if (c11 == 1) {
                        i2 = jve.u(parcel, readInt26);
                    } else if (c11 == 2) {
                        str5 = jve.h(parcel, readInt26);
                    } else if (c11 != 3) {
                        jve.y(parcel, readInt26);
                    } else {
                        str21 = jve.h(parcel, readInt26);
                    }
                }
                jve.m(parcel, z46);
                n0c n0cVar2 = new n0c();
                n0cVar2.a = i2;
                n0cVar2.b = str5;
                n0cVar2.c = str21;
                return n0cVar2;
            case 26:
                int z47 = jve.z(parcel);
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt27 = parcel.readInt();
                    char c12 = (char) readInt27;
                    if (c12 == 2) {
                        str4 = jve.h(parcel, readInt27);
                    } else if (c12 != 3) {
                        jve.y(parcel, readInt27);
                    } else {
                        arrayList6 = jve.l(parcel, readInt27, bbe.CREATOR);
                    }
                }
                jve.m(parcel, z47);
                return new rad(str4, arrayList6);
            case 27:
                int z48 = jve.z(parcel);
                byte[] bArr7 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt28 = parcel.readInt();
                    char c13 = (char) readInt28;
                    if (c13 == 2) {
                        str3 = jve.h(parcel, readInt28);
                    } else if (c13 == 3) {
                        bArr7 = jve.b(parcel, readInt28);
                    } else if (c13 != 4) {
                        jve.y(parcel, readInt28);
                    } else {
                        arrayList7 = jve.l(parcel, readInt28, Transport.CREATOR);
                    }
                }
                jve.m(parcel, z48);
                return new ow8(str3, bArr7, arrayList7);
            case 28:
                int z49 = jve.z(parcel);
                Integer num3 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt29 = parcel.readInt();
                    char c14 = (char) readInt29;
                    if (c14 == 2) {
                        str2 = jve.h(parcel, readInt29);
                    } else if (c14 != 3) {
                        jve.y(parcel, readInt29);
                    } else {
                        num3 = jve.v(parcel, readInt29);
                    }
                }
                jve.m(parcel, z49);
                return new pw8(str2, num3.intValue());
            default:
                int z50 = jve.z(parcel);
                String str22 = null;
                String str23 = null;
                while (parcel.dataPosition() < z50) {
                    int readInt30 = parcel.readInt();
                    char c15 = (char) readInt30;
                    if (c15 == 2) {
                        str = jve.h(parcel, readInt30);
                    } else if (c15 == 3) {
                        str22 = jve.h(parcel, readInt30);
                    } else if (c15 != 4) {
                        jve.y(parcel, readInt30);
                    } else {
                        str23 = jve.h(parcel, readInt30);
                    }
                }
                jve.m(parcel, z50);
                return new qw8(str, str22, str23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lf0[i];
            case 1:
                return new ok2[i];
            case 2:
                return new ot2[i];
            case 3:
                return new kd6[i];
            case 4:
                return new q08[i];
            case 5:
                return new tn7[i];
            case 6:
                return new ckf[i];
            case 7:
                return new xjf[i];
            case 8:
                return new ld6[i];
            case 9:
                return new r08[i];
            case 10:
                return new o7d[i];
            case 11:
                return new p7d[i];
            case 12:
                return new x7d[i];
            case 13:
                return new y18[i];
            case 14:
                return new b8d[i];
            case 15:
                return new z18[i];
            case 16:
                return new c15[i];
            case 17:
                return new ol9[i];
            case 18:
                return new u8d[i];
            case 19:
                return new f9d[i];
            case 20:
                return new n9d[i];
            case 21:
                return new y9d[i];
            case 22:
                return new nia[i];
            case 23:
                return new nw8[i];
            case 24:
                return new lw8[i];
            case 25:
                return new n0c[i];
            case 26:
                return new rad[i];
            case 27:
                return new ow8[i];
            case 28:
                return new pw8[i];
            default:
                return new qw8[i];
        }
    }
}
