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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t4d implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ t4d(byte b) {
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
        wr wrVar = null;
        uc1 uc1Var = null;
        String str9 = null;
        Status status = null;
        Intent intent = null;
        switch (this.a) {
            case 0:
                int z7 = gte.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 2) {
                        i = gte.u(parcel, readInt);
                    } else if (c != 3) {
                        gte.y(parcel, readInt);
                    } else {
                        strArr = gte.i(parcel, readInt);
                    }
                }
                gte.m(parcel, z7);
                le0 le0Var = new le0();
                le0Var.a = i;
                le0Var.b = strArr;
                return le0Var;
            case 1:
                int z8 = gte.z(parcel);
                while (parcel.dataPosition() < z8) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        gte.y(parcel, readInt2);
                    } else {
                        intent = (Intent) gte.g(parcel, readInt2, Intent.CREATOR);
                    }
                }
                gte.m(parcel, z8);
                return new aj2(intent);
            case 2:
                int z9 = gte.z(parcel);
                int i8 = 0;
                int i9 = 0;
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num = null;
                while (parcel.dataPosition() < z9) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i8 = gte.u(parcel, readInt3);
                    } else if (c2 == 2) {
                        i9 = gte.u(parcel, readInt3);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) gte.g(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c2 == 4) {
                        str10 = gte.h(parcel, readInt3);
                    } else if (c2 != 5) {
                        gte.y(parcel, readInt3);
                    } else {
                        num = gte.v(parcel, readInt3);
                    }
                }
                gte.m(parcel, z9);
                return new ds2(i8, i9, pendingIntent, str10, num);
            case 3:
                int z10 = gte.z(parcel);
                mb6 mb6Var = null;
                while (parcel.dataPosition() < z10) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        status = (Status) gte.g(parcel, readInt4, Status.CREATOR);
                    } else if (c3 != 2) {
                        gte.y(parcel, readInt4);
                    } else {
                        mb6Var = (mb6) gte.g(parcel, readInt4, mb6.CREATOR);
                    }
                }
                gte.m(parcel, z10);
                return new lb6(status, mb6Var);
            case 4:
                int z11 = gte.z(parcel);
                tc1 tc1Var = null;
                UserAddress userAddress = null;
                vz7 vz7Var = null;
                String str11 = null;
                Bundle bundle2 = null;
                String str12 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str9 = gte.h(parcel, readInt5);
                            break;
                        case 2:
                            tc1Var = (tc1) gte.g(parcel, readInt5, tc1.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) gte.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 4:
                            vz7Var = (vz7) gte.g(parcel, readInt5, vz7.CREATOR);
                            break;
                        case 5:
                            str11 = gte.h(parcel, readInt5);
                            break;
                        case 6:
                            bundle2 = gte.a(parcel, readInt5);
                            break;
                        case 7:
                            str12 = gte.h(parcel, readInt5);
                            break;
                        case '\b':
                            bundle3 = gte.a(parcel, readInt5);
                            break;
                        default:
                            gte.y(parcel, readInt5);
                            break;
                    }
                }
                gte.m(parcel, z11);
                oy7 oy7Var = new oy7();
                oy7Var.a = str9;
                oy7Var.b = tc1Var;
                oy7Var.c = userAddress;
                oy7Var.d = vz7Var;
                oy7Var.e = str11;
                oy7Var.f = bundle2;
                oy7Var.h = str12;
                oy7Var.n = bundle3;
                return oy7Var;
            case 5:
                int z12 = gte.z(parcel);
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
                            arrayList2 = gte.j(parcel, readInt6);
                            break;
                        case 3:
                            iArr = gte.d(parcel, readInt6);
                            break;
                        case 4:
                            j2 = gte.w(parcel, readInt6);
                            break;
                        case 5:
                            str13 = gte.h(parcel, readInt6);
                            break;
                        case 6:
                            i10 = gte.u(parcel, readInt6);
                            break;
                        case 7:
                            i11 = gte.u(parcel, readInt6);
                            break;
                        case '\b':
                            i12 = gte.u(parcel, readInt6);
                            break;
                        case '\t':
                            i13 = gte.u(parcel, readInt6);
                            break;
                        case '\n':
                            i14 = gte.u(parcel, readInt6);
                            break;
                        case 11:
                            i15 = gte.u(parcel, readInt6);
                            break;
                        case '\f':
                            i16 = gte.u(parcel, readInt6);
                            break;
                        case '\r':
                            i17 = gte.u(parcel, readInt6);
                            break;
                        case 14:
                            i18 = gte.u(parcel, readInt6);
                            break;
                        case 15:
                            i19 = gte.u(parcel, readInt6);
                            break;
                        case 16:
                            i20 = gte.u(parcel, readInt6);
                            break;
                        case 17:
                            i21 = gte.u(parcel, readInt6);
                            break;
                        case 18:
                            i22 = gte.u(parcel, readInt6);
                            break;
                        case 19:
                            i23 = gte.u(parcel, readInt6);
                            break;
                        case 20:
                            i24 = gte.u(parcel, readInt6);
                            break;
                        case 21:
                            i25 = gte.u(parcel, readInt6);
                            break;
                        case 22:
                            i26 = gte.u(parcel, readInt6);
                            break;
                        case 23:
                            i27 = gte.u(parcel, readInt6);
                            break;
                        case 24:
                            i28 = gte.u(parcel, readInt6);
                            break;
                        case 25:
                            i29 = gte.u(parcel, readInt6);
                            break;
                        case 26:
                            i30 = gte.u(parcel, readInt6);
                            break;
                        case 27:
                            i31 = gte.u(parcel, readInt6);
                            break;
                        case 28:
                            i32 = gte.u(parcel, readInt6);
                            break;
                        case 29:
                            i33 = gte.u(parcel, readInt6);
                            break;
                        case kk7.S /* 30 */:
                            i34 = gte.u(parcel, readInt6);
                            break;
                        case 31:
                            i35 = gte.u(parcel, readInt6);
                            break;
                        case ' ':
                            i36 = gte.u(parcel, readInt6);
                            break;
                        case '!':
                            iBinder = gte.t(parcel, readInt6);
                            break;
                        case '\"':
                            z13 = gte.n(parcel, readInt6);
                            break;
                        case '#':
                            z14 = gte.n(parcel, readInt6);
                            break;
                        default:
                            gte.y(parcel, readInt6);
                            break;
                    }
                }
                gte.m(parcel, z12);
                return new ql7(arrayList2, iArr, j2, str13, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder, z13, z14);
            case 6:
                int z15 = gte.z(parcel);
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 2) {
                        i7 = gte.u(parcel, readInt7);
                    } else if (c4 == 3) {
                        z16 = gte.n(parcel, readInt7);
                    } else if (c4 != 4) {
                        gte.y(parcel, readInt7);
                    } else {
                        z17 = gte.n(parcel, readInt7);
                    }
                }
                gte.m(parcel, z15);
                return new bif(i7, z16, z17);
            case 7:
                int z18 = gte.z(parcel);
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        gte.y(parcel, readInt8);
                    } else {
                        z6 = gte.n(parcel, readInt8);
                    }
                }
                gte.m(parcel, z18);
                return new whf(z6);
            case 8:
                int z19 = gte.z(parcel);
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
                            z20 = gte.n(parcel, readInt9);
                            break;
                        case 2:
                            z21 = gte.n(parcel, readInt9);
                            break;
                        case 3:
                            z22 = gte.n(parcel, readInt9);
                            break;
                        case 4:
                            z23 = gte.n(parcel, readInt9);
                            break;
                        case 5:
                            z24 = gte.n(parcel, readInt9);
                            break;
                        case 6:
                            z25 = gte.n(parcel, readInt9);
                            break;
                        default:
                            gte.y(parcel, readInt9);
                            break;
                    }
                }
                gte.m(parcel, z19);
                return new mb6(z20, z21, z22, z23, z24, z25);
            case 9:
                int z26 = gte.z(parcel);
                boolean z27 = false;
                boolean z28 = false;
                lga lgaVar = null;
                ArrayList arrayList3 = null;
                wz7 wz7Var = null;
                myb mybVar = null;
                String str14 = null;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            z5 = gte.n(parcel, readInt10);
                            break;
                        case 2:
                            z27 = gte.n(parcel, readInt10);
                            break;
                        case 3:
                            uc1Var = (uc1) gte.g(parcel, readInt10, uc1.CREATOR);
                            break;
                        case 4:
                            z28 = gte.n(parcel, readInt10);
                            break;
                        case 5:
                            lgaVar = (lga) gte.g(parcel, readInt10, lga.CREATOR);
                            break;
                        case 6:
                            arrayList3 = gte.e(parcel, readInt10);
                            break;
                        case 7:
                            wz7Var = (wz7) gte.g(parcel, readInt10, wz7.CREATOR);
                            break;
                        case '\b':
                            mybVar = (myb) gte.g(parcel, readInt10, myb.CREATOR);
                            break;
                        case '\t':
                            z = gte.n(parcel, readInt10);
                            break;
                        case '\n':
                            str14 = gte.h(parcel, readInt10);
                            break;
                        case 11:
                            bundle4 = gte.a(parcel, readInt10);
                            break;
                        default:
                            gte.y(parcel, readInt10);
                            break;
                    }
                }
                gte.m(parcel, z26);
                py7 py7Var = new py7();
                py7Var.a = z5;
                py7Var.b = z27;
                py7Var.c = uc1Var;
                py7Var.d = z28;
                py7Var.e = lgaVar;
                py7Var.f = arrayList3;
                py7Var.h = wz7Var;
                py7Var.n = mybVar;
                py7Var.r = z;
                py7Var.s = str14;
                py7Var.w = bundle4;
                return py7Var;
            case 10:
                int z29 = gte.z(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                int i37 = 0;
                int i38 = 0;
                bad badVar = null;
                while (parcel.dataPosition() < z29) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            d = gte.q(parcel, readInt11);
                            break;
                        case 3:
                            z4 = gte.n(parcel, readInt11);
                            break;
                        case 4:
                            i37 = gte.u(parcel, readInt11);
                            break;
                        case 5:
                            wrVar = (wr) gte.g(parcel, readInt11, wr.CREATOR);
                            break;
                        case 6:
                            i38 = gte.u(parcel, readInt11);
                            break;
                        case 7:
                            badVar = (bad) gte.g(parcel, readInt11, bad.CREATOR);
                            break;
                        case '\b':
                            d2 = gte.q(parcel, readInt11);
                            break;
                        default:
                            gte.y(parcel, readInt11);
                            break;
                    }
                }
                gte.m(parcel, z29);
                m5d m5dVar = new m5d();
                m5dVar.a = d;
                m5dVar.b = z4;
                m5dVar.c = i37;
                m5dVar.d = wrVar;
                m5dVar.e = i38;
                m5dVar.f = badVar;
                m5dVar.h = d2;
                return m5dVar;
            case 11:
                int z30 = gte.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        gte.y(parcel, readInt12);
                    } else {
                        j = gte.w(parcel, readInt12);
                    }
                }
                gte.m(parcel, z30);
                return new n5d(j);
            case 12:
                int z31 = gte.z(parcel);
                long j3 = -1;
                long j4 = -1;
                int i39 = 1;
                int i40 = 1;
                while (parcel.dataPosition() < z31) {
                    int readInt13 = parcel.readInt();
                    char c5 = (char) readInt13;
                    if (c5 == 1) {
                        i39 = gte.u(parcel, readInt13);
                    } else if (c5 == 2) {
                        i40 = gte.u(parcel, readInt13);
                    } else if (c5 == 3) {
                        j3 = gte.w(parcel, readInt13);
                    } else if (c5 != 4) {
                        gte.y(parcel, readInt13);
                    } else {
                        j4 = gte.w(parcel, readInt13);
                    }
                }
                gte.m(parcel, z31);
                return new v5d(i39, i40, j3, j4);
            case 13:
                int z32 = gte.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt14 = parcel.readInt();
                    char c6 = (char) readInt14;
                    if (c6 == 2) {
                        i6 = gte.u(parcel, readInt14);
                    } else if (c6 != 3) {
                        gte.y(parcel, readInt14);
                    } else {
                        str8 = gte.h(parcel, readInt14);
                    }
                }
                gte.m(parcel, z32);
                vz7 vz7Var2 = new vz7();
                vz7Var2.a = i6;
                vz7Var2.b = str8;
                return vz7Var2;
            case 14:
                int z33 = gte.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        gte.y(parcel, readInt15);
                    } else {
                        z3 = gte.n(parcel, readInt15);
                    }
                }
                gte.m(parcel, z33);
                return new z5d(z3);
            case 15:
                int z34 = gte.z(parcel);
                while (parcel.dataPosition() < z34) {
                    int readInt16 = parcel.readInt();
                    char c7 = (char) readInt16;
                    if (c7 == 2) {
                        i5 = gte.u(parcel, readInt16);
                    } else if (c7 != 3) {
                        gte.y(parcel, readInt16);
                    } else {
                        bundle = gte.a(parcel, readInt16);
                    }
                }
                gte.m(parcel, z34);
                wz7 wz7Var2 = new wz7();
                wz7Var2.a = i5;
                wz7Var2.b = bundle;
                return wz7Var2;
            case 16:
                int z35 = gte.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        gte.y(parcel, readInt17);
                    } else {
                        z2 = gte.n(parcel, readInt17);
                    }
                }
                gte.m(parcel, z35);
                return new dz4(z2);
            case 17:
                int z36 = gte.z(parcel);
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                boolean z37 = false;
                boolean z38 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt18 = parcel.readInt();
                    char c8 = (char) readInt18;
                    if (c8 == 1) {
                        i41 = gte.u(parcel, readInt18);
                    } else if (c8 == 2) {
                        z37 = gte.n(parcel, readInt18);
                    } else if (c8 == 3) {
                        z38 = gte.n(parcel, readInt18);
                    } else if (c8 == 4) {
                        i42 = gte.u(parcel, readInt18);
                    } else if (c8 != 5) {
                        gte.y(parcel, readInt18);
                    } else {
                        i43 = gte.u(parcel, readInt18);
                    }
                }
                gte.m(parcel, z36);
                return new mj9(i41, i42, i43, z37, z38);
            case 18:
                int z39 = gte.z(parcel);
                while (parcel.dataPosition() < z39) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        gte.y(parcel, readInt19);
                    } else {
                        str7 = gte.h(parcel, readInt19);
                    }
                }
                gte.m(parcel, z39);
                return new s6d(str7);
            case 19:
                int z40 = gte.z(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt20 = parcel.readInt();
                    char c9 = (char) readInt20;
                    if (c9 == 1) {
                        bArr2 = gte.b(parcel, readInt20);
                    } else if (c9 == 2) {
                        bArr3 = gte.b(parcel, readInt20);
                    } else if (c9 == 3) {
                        bArr4 = gte.b(parcel, readInt20);
                    } else if (c9 != 4) {
                        gte.y(parcel, readInt20);
                    } else {
                        i4 = gte.u(parcel, readInt20);
                    }
                }
                gte.m(parcel, z40);
                return new d7d(bArr2 == null ? null : qae.o(bArr2.length, bArr2), bArr3 == null ? null : qae.o(bArr3.length, bArr3), bArr4 != null ? qae.o(bArr4.length, bArr4) : null, i4);
            case 20:
                int z41 = gte.z(parcel);
                int i44 = 0;
                String str15 = null;
                while (parcel.dataPosition() < z41) {
                    int readInt21 = parcel.readInt();
                    char c10 = (char) readInt21;
                    if (c10 == 2) {
                        str6 = gte.h(parcel, readInt21);
                    } else if (c10 == 3) {
                        str15 = gte.h(parcel, readInt21);
                    } else if (c10 == 4) {
                        i3 = gte.u(parcel, readInt21);
                    } else if (c10 != 5) {
                        gte.y(parcel, readInt21);
                    } else {
                        i44 = gte.u(parcel, readInt21);
                    }
                }
                gte.m(parcel, z41);
                return new l7d(i3, i44, str6, str15);
            case 21:
                int z42 = gte.z(parcel);
                while (parcel.dataPosition() < z42) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        gte.y(parcel, readInt22);
                    } else {
                        bArr = gte.c(parcel, readInt22);
                    }
                }
                gte.m(parcel, z42);
                return new w7d(bArr);
            case 22:
                int z43 = gte.z(parcel);
                while (parcel.dataPosition() < z43) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        gte.y(parcel, readInt23);
                    } else {
                        arrayList = gte.j(parcel, readInt23);
                    }
                }
                gte.m(parcel, z43);
                lga lgaVar2 = new lga();
                lgaVar2.a = arrayList;
                return lgaVar2;
            case 23:
                int z44 = gte.z(parcel);
                pu8 pu8Var = null;
                su8 su8Var = null;
                byte[] bArr5 = null;
                ArrayList arrayList4 = null;
                Double d3 = null;
                ArrayList arrayList5 = null;
                d50 d50Var = null;
                Integer num2 = null;
                zpb zpbVar = null;
                String str16 = null;
                w40 w40Var = null;
                String str17 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z44) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            pu8Var = (pu8) gte.g(parcel, readInt24, pu8.CREATOR);
                            break;
                        case 3:
                            su8Var = (su8) gte.g(parcel, readInt24, su8.CREATOR);
                            break;
                        case 4:
                            bArr5 = gte.b(parcel, readInt24);
                            break;
                        case 5:
                            arrayList4 = gte.l(parcel, readInt24, ou8.CREATOR);
                            break;
                        case 6:
                            int x = gte.x(parcel, readInt24);
                            if (x != 0) {
                                gte.B(parcel, x, 8);
                                d3 = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                d3 = null;
                                break;
                            }
                        case 7:
                            arrayList5 = gte.l(parcel, readInt24, nu8.CREATOR);
                            break;
                        case '\b':
                            d50Var = (d50) gte.g(parcel, readInt24, d50.CREATOR);
                            break;
                        case '\t':
                            num2 = gte.v(parcel, readInt24);
                            break;
                        case '\n':
                            zpbVar = (zpb) gte.g(parcel, readInt24, zpb.CREATOR);
                            break;
                        case 11:
                            str16 = gte.h(parcel, readInt24);
                            break;
                        case '\f':
                            w40Var = (w40) gte.g(parcel, readInt24, w40.CREATOR);
                            break;
                        case '\r':
                            str17 = gte.h(parcel, readInt24);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) gte.g(parcel, readInt24, ResultReceiver.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt24);
                            break;
                    }
                }
                gte.m(parcel, z44);
                return new mu8(pu8Var, su8Var, bArr5, arrayList4, d3, arrayList5, d50Var, num2, zpbVar, str16, w40Var, str17, resultReceiver);
            case 24:
                int z45 = gte.z(parcel);
                String str18 = null;
                String str19 = null;
                byte[] bArr6 = null;
                a50 a50Var = null;
                z40 z40Var = null;
                b50 b50Var = null;
                x40 x40Var = null;
                String str20 = null;
                while (parcel.dataPosition() < z45) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str18 = gte.h(parcel, readInt25);
                            break;
                        case 2:
                            str19 = gte.h(parcel, readInt25);
                            break;
                        case 3:
                            bArr6 = gte.b(parcel, readInt25);
                            break;
                        case 4:
                            a50Var = (a50) gte.g(parcel, readInt25, a50.CREATOR);
                            break;
                        case 5:
                            z40Var = (z40) gte.g(parcel, readInt25, z40.CREATOR);
                            break;
                        case 6:
                            b50Var = (b50) gte.g(parcel, readInt25, b50.CREATOR);
                            break;
                        case 7:
                            x40Var = (x40) gte.g(parcel, readInt25, x40.CREATOR);
                            break;
                        case '\b':
                            str20 = gte.h(parcel, readInt25);
                            break;
                        case '\t':
                            gte.h(parcel, readInt25);
                            break;
                        default:
                            gte.y(parcel, readInt25);
                            break;
                    }
                }
                gte.m(parcel, z45);
                return new ku8(str18, str19, bArr6, a50Var, z40Var, b50Var, x40Var, str20);
            case 25:
                int z46 = gte.z(parcel);
                String str21 = null;
                while (parcel.dataPosition() < z46) {
                    int readInt26 = parcel.readInt();
                    char c11 = (char) readInt26;
                    if (c11 == 1) {
                        i2 = gte.u(parcel, readInt26);
                    } else if (c11 == 2) {
                        str5 = gte.h(parcel, readInt26);
                    } else if (c11 != 3) {
                        gte.y(parcel, readInt26);
                    } else {
                        str21 = gte.h(parcel, readInt26);
                    }
                }
                gte.m(parcel, z46);
                myb mybVar2 = new myb();
                mybVar2.a = i2;
                mybVar2.b = str5;
                mybVar2.c = str21;
                return mybVar2;
            case 26:
                int z47 = gte.z(parcel);
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt27 = parcel.readInt();
                    char c12 = (char) readInt27;
                    if (c12 == 2) {
                        str4 = gte.h(parcel, readInt27);
                    } else if (c12 != 3) {
                        gte.y(parcel, readInt27);
                    } else {
                        arrayList6 = gte.l(parcel, readInt27, a9e.CREATOR);
                    }
                }
                gte.m(parcel, z47);
                return new p8d(str4, arrayList6);
            case 27:
                int z48 = gte.z(parcel);
                byte[] bArr7 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < z48) {
                    int readInt28 = parcel.readInt();
                    char c13 = (char) readInt28;
                    if (c13 == 2) {
                        str3 = gte.h(parcel, readInt28);
                    } else if (c13 == 3) {
                        bArr7 = gte.b(parcel, readInt28);
                    } else if (c13 != 4) {
                        gte.y(parcel, readInt28);
                    } else {
                        arrayList7 = gte.l(parcel, readInt28, Transport.CREATOR);
                    }
                }
                gte.m(parcel, z48);
                return new nu8(str3, bArr7, arrayList7);
            case 28:
                int z49 = gte.z(parcel);
                Integer num3 = null;
                while (parcel.dataPosition() < z49) {
                    int readInt29 = parcel.readInt();
                    char c14 = (char) readInt29;
                    if (c14 == 2) {
                        str2 = gte.h(parcel, readInt29);
                    } else if (c14 != 3) {
                        gte.y(parcel, readInt29);
                    } else {
                        num3 = gte.v(parcel, readInt29);
                    }
                }
                gte.m(parcel, z49);
                return new ou8(str2, num3.intValue());
            default:
                int z50 = gte.z(parcel);
                String str22 = null;
                String str23 = null;
                while (parcel.dataPosition() < z50) {
                    int readInt30 = parcel.readInt();
                    char c15 = (char) readInt30;
                    if (c15 == 2) {
                        str = gte.h(parcel, readInt30);
                    } else if (c15 == 3) {
                        str22 = gte.h(parcel, readInt30);
                    } else if (c15 != 4) {
                        gte.y(parcel, readInt30);
                    } else {
                        str23 = gte.h(parcel, readInt30);
                    }
                }
                gte.m(parcel, z50);
                return new pu8(str, str22, str23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new le0[i];
            case 1:
                return new aj2[i];
            case 2:
                return new ds2[i];
            case 3:
                return new lb6[i];
            case 4:
                return new oy7[i];
            case 5:
                return new ql7[i];
            case 6:
                return new bif[i];
            case 7:
                return new whf[i];
            case 8:
                return new mb6[i];
            case 9:
                return new py7[i];
            case 10:
                return new m5d[i];
            case 11:
                return new n5d[i];
            case 12:
                return new v5d[i];
            case 13:
                return new vz7[i];
            case 14:
                return new z5d[i];
            case 15:
                return new wz7[i];
            case 16:
                return new dz4[i];
            case 17:
                return new mj9[i];
            case 18:
                return new s6d[i];
            case 19:
                return new d7d[i];
            case 20:
                return new l7d[i];
            case 21:
                return new w7d[i];
            case 22:
                return new lga[i];
            case 23:
                return new mu8[i];
            case 24:
                return new ku8[i];
            case 25:
                return new myb[i];
            case 26:
                return new p8d[i];
            case 27:
                return new nu8[i];
            case 28:
                return new ou8[i];
            default:
                return new pu8[i];
        }
    }
}
