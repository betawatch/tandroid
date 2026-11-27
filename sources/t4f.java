// default package

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.MaskedWallet;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class t4f implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ t4f(byte b) {
        this.a = b;
    }

    public static void a(gv4 gv4Var, Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = gv4Var.a;
        bye.q(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = gv4Var.b;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = gv4Var.c;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i4);
        bye.l(parcel, 4, gv4Var.d);
        bye.f(parcel, 5, gv4Var.e);
        bye.o(parcel, 6, gv4Var.f, i);
        bye.b(parcel, 7, gv4Var.h);
        bye.k(parcel, 8, gv4Var.n, i);
        bye.o(parcel, 10, gv4Var.r, i);
        bye.o(parcel, 11, gv4Var.s, i);
        boolean z = gv4Var.w;
        bye.q(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = gv4Var.x;
        bye.q(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = gv4Var.y;
        bye.q(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bye.l(parcel, 15, gv4Var.E);
        bye.s(parcel, r);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        float f = 0.0f;
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList3 = null;
        String[] strArr = null;
        ArrayList arrayList4 = null;
        PendingIntent pendingIntent = null;
        Status status = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Bundle bundle = null;
        String str7 = null;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                int z = aye.z(parcel);
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                int i = 0;
                byte b = 0;
                byte b2 = 0;
                byte b3 = 0;
                byte b4 = 0;
                while (parcel.dataPosition() < z) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            i = aye.u(parcel, readInt);
                            break;
                        case 3:
                            str8 = aye.h(parcel, readInt);
                            break;
                        case 4:
                            str9 = aye.h(parcel, readInt);
                            break;
                        case 5:
                            str10 = aye.h(parcel, readInt);
                            break;
                        case 6:
                            str11 = aye.h(parcel, readInt);
                            break;
                        case 7:
                            str12 = aye.h(parcel, readInt);
                            break;
                        case '\b':
                            str13 = aye.h(parcel, readInt);
                            break;
                        case '\t':
                            b = aye.p(parcel, readInt);
                            break;
                        case '\n':
                            b2 = aye.p(parcel, readInt);
                            break;
                        case 11:
                            b3 = aye.p(parcel, readInt);
                            break;
                        case '\f':
                            b4 = aye.p(parcel, readInt);
                            break;
                        case '\r':
                            str14 = aye.h(parcel, readInt);
                            break;
                        default:
                            aye.y(parcel, readInt);
                            break;
                    }
                }
                aye.m(parcel, z);
                return new d1f(i, str8, str9, str10, str11, str12, str13, b, b2, b3, b4, str14);
            case 1:
                int z2 = aye.z(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = gv4.F;
                a94[] a94VarArr = gv4.G;
                a94[] a94VarArr2 = a94VarArr;
                String str15 = null;
                IBinder iBinder = null;
                Account account = null;
                String str16 = null;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                boolean z3 = false;
                int i5 = 0;
                boolean z4 = false;
                while (parcel.dataPosition() < z2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i2 = aye.u(parcel, readInt2);
                            break;
                        case 2:
                            i3 = aye.u(parcel, readInt2);
                            break;
                        case 3:
                            i4 = aye.u(parcel, readInt2);
                            break;
                        case 4:
                            str15 = aye.h(parcel, readInt2);
                            break;
                        case 5:
                            iBinder = aye.t(parcel, readInt2);
                            break;
                        case 6:
                            scopeArr = (Scope[]) aye.k(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = aye.a(parcel, readInt2);
                            break;
                        case '\b':
                            account = (Account) aye.g(parcel, readInt2, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            aye.y(parcel, readInt2);
                            break;
                        case '\n':
                            a94VarArr = (a94[]) aye.k(parcel, readInt2, a94.CREATOR);
                            break;
                        case 11:
                            a94VarArr2 = (a94[]) aye.k(parcel, readInt2, a94.CREATOR);
                            break;
                        case '\f':
                            z3 = aye.n(parcel, readInt2);
                            break;
                        case '\r':
                            i5 = aye.u(parcel, readInt2);
                            break;
                        case 14:
                            z4 = aye.n(parcel, readInt2);
                            break;
                        case 15:
                            str16 = aye.h(parcel, readInt2);
                            break;
                    }
                }
                aye.m(parcel, z2);
                return new gv4(i2, i3, i4, str15, iBinder, scopeArr, bundle2, account, a94VarArr, a94VarArr2, z3, i5, z4, str16);
            case 2:
                int z5 = aye.z(parcel);
                Boolean bool = null;
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < z5) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c == 2) {
                        str = aye.h(parcel, readInt3);
                    } else if (c == 3) {
                        bool = aye.o(parcel, readInt3);
                    } else if (c == 4) {
                        str17 = aye.h(parcel, readInt3);
                    } else if (c != 5) {
                        aye.y(parcel, readInt3);
                    } else {
                        str18 = aye.h(parcel, readInt3);
                    }
                }
                aye.m(parcel, z5);
                return new f50(str, bool, str17, str18);
            case 3:
                int z6 = aye.z(parcel);
                int i6 = 0;
                while (parcel.dataPosition() < z6) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        aye.y(parcel, readInt4);
                    } else {
                        i6 = aye.u(parcel, readInt4);
                    }
                }
                aye.m(parcel, z6);
                return new f1f(i6);
            case 4:
                int z7 = aye.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        aye.y(parcel, readInt5);
                    } else {
                        bArr = aye.b(parcel, readInt5);
                    }
                }
                aye.m(parcel, z7);
                return new r4f(bArr);
            case 5:
                int z8 = aye.z(parcel);
                String str19 = null;
                while (parcel.dataPosition() < z8) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 2) {
                        str7 = aye.h(parcel, readInt6);
                    } else if (c2 != 3) {
                        aye.y(parcel, readInt6);
                    } else {
                        str19 = aye.h(parcel, readInt6);
                    }
                }
                aye.m(parcel, z8);
                xe0 xe0Var = new xe0();
                xe0Var.a = str7;
                xe0Var.b = str19;
                return xe0Var;
            case 6:
                int z9 = aye.z(parcel);
                int i7 = 0;
                while (parcel.dataPosition() < z9) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        i7 = aye.u(parcel, readInt7);
                    } else if (c3 != 2) {
                        aye.y(parcel, readInt7);
                    } else {
                        bundle = aye.a(parcel, readInt7);
                    }
                }
                aye.m(parcel, z9);
                return new n4f(i7, bundle);
            case 7:
                int z10 = aye.z(parcel);
                double d = 0.0d;
                String str20 = null;
                ArrayList arrayList5 = null;
                f26 f26Var = null;
                jd1 jd1Var = null;
                ArrayList arrayList6 = null;
                sre sreVar = null;
                f1f f1fVar = null;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str20 = aye.h(parcel, readInt8);
                            break;
                        case 3:
                            arrayList5 = aye.j(parcel, readInt8);
                            break;
                        case 4:
                            z11 = aye.n(parcel, readInt8);
                            break;
                        case 5:
                            f26Var = (f26) aye.g(parcel, readInt8, f26.CREATOR);
                            break;
                        case 6:
                            z12 = aye.n(parcel, readInt8);
                            break;
                        case 7:
                            jd1Var = (jd1) aye.g(parcel, readInt8, jd1.CREATOR);
                            break;
                        case '\b':
                            z13 = aye.n(parcel, readInt8);
                            break;
                        case '\t':
                            d = aye.q(parcel, readInt8);
                            break;
                        case '\n':
                            z14 = aye.n(parcel, readInt8);
                            break;
                        case 11:
                            z15 = aye.n(parcel, readInt8);
                            break;
                        case '\f':
                            z16 = aye.n(parcel, readInt8);
                            break;
                        case '\r':
                            arrayList6 = aye.j(parcel, readInt8);
                            break;
                        case 14:
                            z17 = aye.n(parcel, readInt8);
                            break;
                        case 15:
                            aye.u(parcel, readInt8);
                            break;
                        case 16:
                            z18 = aye.n(parcel, readInt8);
                            break;
                        case 17:
                            sreVar = (sre) aye.g(parcel, readInt8, sre.CREATOR);
                            break;
                        case 18:
                            f1fVar = (f1f) aye.g(parcel, readInt8, f1f.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt8);
                            break;
                    }
                }
                aye.m(parcel, z10);
                return new ld1(str20, arrayList5, z11, f26Var, z12, jd1Var, z13, d, z14, z15, z16, arrayList6, z17, z18, sreVar, f1fVar);
            case 8:
                int z19 = aye.z(parcel);
                String str21 = null;
                int i8 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c4 = (char) readInt9;
                    if (c4 == 2) {
                        str6 = aye.h(parcel, readInt9);
                    } else if (c4 == 3) {
                        str21 = aye.h(parcel, readInt9);
                    } else if (c4 != 4) {
                        aye.y(parcel, readInt9);
                    } else {
                        i8 = aye.u(parcel, readInt9);
                    }
                }
                aye.m(parcel, z19);
                dr5 dr5Var = new dr5();
                dr5Var.a = str6;
                dr5Var.b = str21;
                dr5Var.c = i8;
                return dr5Var;
            case 9:
                int z20 = aye.z(parcel);
                String str22 = null;
                prb prbVar = null;
                rac racVar = null;
                rac racVar2 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt10 = parcel.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 2) {
                        str5 = aye.h(parcel, readInt10);
                    } else if (c5 == 3) {
                        str22 = aye.h(parcel, readInt10);
                    } else if (c5 == 4) {
                        prbVar = (prb) aye.g(parcel, readInt10, prb.CREATOR);
                    } else if (c5 == 5) {
                        racVar = (rac) aye.g(parcel, readInt10, rac.CREATOR);
                    } else if (c5 != 6) {
                        aye.y(parcel, readInt10);
                    } else {
                        racVar2 = (rac) aye.g(parcel, readInt10, rac.CREATOR);
                    }
                }
                aye.m(parcel, z20);
                htc htcVar = new htc();
                htcVar.a = str5;
                htcVar.b = str22;
                htcVar.c = prbVar;
                htcVar.d = racVar;
                htcVar.e = racVar2;
                return htcVar;
            case 10:
                int z21 = aye.z(parcel);
                String str23 = null;
                int i9 = 0;
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        str4 = aye.h(parcel, readInt11);
                    } else if (c6 == 2) {
                        f = aye.r(parcel, readInt11);
                    } else if (c6 == 3) {
                        str23 = aye.h(parcel, readInt11);
                    } else if (c6 != 4) {
                        aye.y(parcel, readInt11);
                    } else {
                        i9 = aye.u(parcel, readInt11);
                    }
                }
                aye.m(parcel, z21);
                return new uaf(f, i9, str4, str23);
            case 11:
                int z22 = aye.z(parcel);
                int i10 = 0;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        f = aye.r(parcel, readInt12);
                    } else if (c7 != 2) {
                        aye.y(parcel, readInt12);
                    } else {
                        i10 = aye.u(parcel, readInt12);
                    }
                }
                aye.m(parcel, z22);
                return new zaf(f, i10);
            case 12:
                int z23 = aye.z(parcel);
                ArrayList arrayList7 = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 1) {
                        status = (Status) aye.g(parcel, readInt13, Status.CREATOR);
                    } else if (c8 == 2) {
                        arrayList7 = aye.l(parcel, readInt13, dmf.CREATOR);
                    } else if (c8 != 3) {
                        aye.y(parcel, readInt13);
                    } else {
                        strArr2 = aye.i(parcel, readInt13);
                    }
                }
                aye.m(parcel, z23);
                n9f n9fVar = new n9f();
                n9fVar.a = status;
                n9fVar.b = arrayList7;
                n9fVar.c = strArr2;
                return n9fVar;
            case 13:
                int z24 = aye.z(parcel);
                while (parcel.dataPosition() < z24) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        aye.y(parcel, readInt14);
                    } else {
                        pendingIntent = (PendingIntent) aye.g(parcel, readInt14, PendingIntent.CREATOR);
                    }
                }
                aye.m(parcel, z24);
                return new r9f(pendingIntent);
            case 14:
                int z25 = aye.z(parcel);
                String str24 = null;
                String str25 = null;
                qqe qqeVar = null;
                String str26 = null;
                String str27 = null;
                Float f2 = null;
                nhf nhfVar = null;
                while (parcel.dataPosition() < z25) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            str24 = aye.h(parcel, readInt15);
                            break;
                        case 2:
                            str25 = aye.h(parcel, readInt15);
                            break;
                        case 3:
                            qqeVar = (qqe) aye.g(parcel, readInt15, qqe.CREATOR);
                            break;
                        case 4:
                            str26 = aye.h(parcel, readInt15);
                            break;
                        case 5:
                            str27 = aye.h(parcel, readInt15);
                            break;
                        case 6:
                            f2 = aye.s(parcel, readInt15);
                            break;
                        case 7:
                            nhfVar = (nhf) aye.g(parcel, readInt15, nhf.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt15);
                            break;
                    }
                }
                aye.m(parcel, z25);
                return new s9f(str24, str25, qqeVar, str26, str27, f2, nhfVar);
            case 15:
                try {
                    return t51.a(parcel.readInt());
                } catch (s51 e) {
                    grb.m(e);
                    return null;
                }
            case 16:
                int z26 = aye.z(parcel);
                String str28 = null;
                String str29 = null;
                ArrayList arrayList8 = null;
                String str30 = null;
                boolean z27 = false;
                while (parcel.dataPosition() < z26) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            arrayList4 = aye.e(parcel, readInt16);
                            break;
                        case 3:
                        default:
                            aye.y(parcel, readInt16);
                            break;
                        case 4:
                            str28 = aye.h(parcel, readInt16);
                            break;
                        case 5:
                            str29 = aye.h(parcel, readInt16);
                            break;
                        case 6:
                            arrayList8 = aye.e(parcel, readInt16);
                            break;
                        case 7:
                            z27 = aye.n(parcel, readInt16);
                            break;
                        case '\b':
                            str30 = aye.h(parcel, readInt16);
                            break;
                    }
                }
                aye.m(parcel, z26);
                pt5 pt5Var = new pt5();
                pt5Var.a = arrayList4;
                pt5Var.b = str28;
                pt5Var.c = str29;
                pt5Var.d = arrayList8;
                pt5Var.e = z27;
                pt5Var.f = str30;
                return pt5Var;
            case 17:
                int z28 = aye.z(parcel);
                int[] iArr = null;
                RemoteViews remoteViews = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt17 = parcel.readInt();
                    char c9 = (char) readInt17;
                    if (c9 == 1) {
                        strArr = aye.i(parcel, readInt17);
                    } else if (c9 == 2) {
                        iArr = aye.d(parcel, readInt17);
                    } else if (c9 == 3) {
                        remoteViews = (RemoteViews) aye.g(parcel, readInt17, RemoteViews.CREATOR);
                    } else if (c9 != 4) {
                        aye.y(parcel, readInt17);
                    } else {
                        bArr2 = aye.b(parcel, readInt17);
                    }
                }
                aye.m(parcel, z28);
                wdf wdfVar = new wdf();
                wdfVar.a = strArr;
                wdfVar.b = iArr;
                wdfVar.c = remoteViews;
                wdfVar.d = bArr2;
                return wdfVar;
            case 18:
                int z29 = aye.z(parcel);
                qqe qqeVar2 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt18 = parcel.readInt();
                    char c10 = (char) readInt18;
                    if (c10 == 1) {
                        i11 = aye.u(parcel, readInt18);
                    } else if (c10 == 2) {
                        arrayList3 = aye.l(parcel, readInt18, s9f.CREATOR);
                    } else if (c10 != 3) {
                        aye.y(parcel, readInt18);
                    } else {
                        qqeVar2 = (qqe) aye.g(parcel, readInt18, qqe.CREATOR);
                    }
                }
                aye.m(parcel, z29);
                return new xdf(i11, arrayList3, qqeVar2);
            case 19:
                int z30 = aye.z(parcel);
                long j = 0;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt19 = parcel.readInt();
                    char c11 = (char) readInt19;
                    if (c11 == 1) {
                        j = aye.w(parcel, readInt19);
                    } else if (c11 == 2) {
                        bArr3 = aye.b(parcel, readInt19);
                    } else if (c11 == 3) {
                        bArr4 = aye.b(parcel, readInt19);
                    } else if (c11 != 4) {
                        aye.y(parcel, readInt19);
                    } else {
                        bArr5 = aye.b(parcel, readInt19);
                    }
                }
                aye.m(parcel, z30);
                return new cef(j, bArr3, bArr4, bArr5);
            case 20:
                int z31 = aye.z(parcel);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = arrayList10;
                ArrayList arrayList13 = arrayList11;
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                prb prbVar2 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                gi6 gi6Var = null;
                int i12 = 0;
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt20 = parcel.readInt();
                    prb prbVar3 = prbVar2;
                    switch ((char) readInt20) {
                        case 2:
                            str3 = aye.h(parcel, readInt20);
                            break;
                        case 3:
                            str35 = aye.h(parcel, readInt20);
                            break;
                        case 4:
                            str36 = aye.h(parcel, readInt20);
                            break;
                        case 5:
                            str37 = aye.h(parcel, readInt20);
                            break;
                        case 6:
                            str38 = aye.h(parcel, readInt20);
                            break;
                        case 7:
                            str39 = aye.h(parcel, readInt20);
                            break;
                        case '\b':
                            str33 = aye.h(parcel, readInt20);
                            break;
                        case '\t':
                            str32 = aye.h(parcel, readInt20);
                            break;
                        case '\n':
                            str31 = aye.h(parcel, readInt20);
                            break;
                        case 11:
                            str34 = aye.h(parcel, readInt20);
                            break;
                        case '\f':
                            i12 = aye.u(parcel, readInt20);
                            break;
                        case '\r':
                            arrayList9 = aye.l(parcel, readInt20, htc.CREATOR);
                            break;
                        case 14:
                            prbVar2 = (prb) aye.g(parcel, readInt20, prb.CREATOR);
                            continue;
                        case 15:
                            arrayList12 = aye.l(parcel, readInt20, LatLng.CREATOR);
                            break;
                        case 16:
                            str40 = aye.h(parcel, readInt20);
                            break;
                        case 17:
                            str41 = aye.h(parcel, readInt20);
                            break;
                        case 18:
                            arrayList13 = aye.l(parcel, readInt20, zy5.CREATOR);
                            break;
                        case 19:
                            z32 = aye.n(parcel, readInt20);
                            break;
                        case 20:
                            arrayList14 = aye.l(parcel, readInt20, rac.CREATOR);
                            break;
                        case 21:
                            arrayList15 = aye.l(parcel, readInt20, llb.CREATOR);
                            break;
                        case 22:
                            arrayList16 = aye.l(parcel, readInt20, rac.CREATOR);
                            break;
                        case 23:
                            gi6Var = (gi6) aye.g(parcel, readInt20, gi6.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt20);
                            break;
                    }
                    prbVar2 = prbVar3;
                }
                aye.m(parcel, z31);
                ii6 ii6Var = new ii6();
                ii6Var.a = str3;
                ii6Var.b = str35;
                ii6Var.c = str36;
                ii6Var.d = str37;
                ii6Var.e = str38;
                ii6Var.f = str39;
                ii6Var.h = str33;
                ii6Var.n = str32;
                ii6Var.r = str31;
                ii6Var.s = str34;
                ii6Var.w = i12;
                ii6Var.x = arrayList9;
                ii6Var.y = prbVar2;
                ii6Var.E = arrayList12;
                ii6Var.F = str40;
                ii6Var.G = str41;
                ii6Var.H = arrayList13;
                ii6Var.I = z32;
                ii6Var.J = arrayList14;
                ii6Var.K = arrayList15;
                ii6Var.L = arrayList16;
                ii6Var.M = gi6Var;
                return ii6Var;
            case 21:
                int z33 = aye.z(parcel);
                int i13 = -1;
                String str42 = null;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                ArrayList arrayList17 = null;
                String str47 = null;
                String str48 = null;
                String str49 = null;
                byte[] bArr6 = null;
                String str50 = null;
                rmf rmfVar = null;
                Integer num = null;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z34 = false;
                while (parcel.dataPosition() < z33) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 2:
                            str42 = aye.h(parcel, readInt21);
                            break;
                        case 3:
                            str43 = aye.h(parcel, readInt21);
                            break;
                        case 4:
                            str44 = aye.h(parcel, readInt21);
                            break;
                        case 5:
                            str45 = aye.h(parcel, readInt21);
                            break;
                        case 6:
                            str46 = aye.h(parcel, readInt21);
                            break;
                        case 7:
                            i14 = aye.u(parcel, readInt21);
                            break;
                        case '\b':
                            arrayList17 = aye.l(parcel, readInt21, kxc.CREATOR);
                            break;
                        case '\t':
                            i15 = aye.u(parcel, readInt21);
                            break;
                        case '\n':
                            i13 = aye.u(parcel, readInt21);
                            break;
                        case 11:
                            str47 = aye.h(parcel, readInt21);
                            break;
                        case '\f':
                            str48 = aye.h(parcel, readInt21);
                            break;
                        case '\r':
                            i16 = aye.u(parcel, readInt21);
                            break;
                        case 14:
                            str49 = aye.h(parcel, readInt21);
                            break;
                        case 15:
                            bArr6 = aye.b(parcel, readInt21);
                            break;
                        case 16:
                            str50 = aye.h(parcel, readInt21);
                            break;
                        case 17:
                            z34 = aye.n(parcel, readInt21);
                            break;
                        case 18:
                            rmfVar = (rmf) aye.g(parcel, readInt21, rmf.CREATOR);
                            break;
                        case 19:
                            num = aye.v(parcel, readInt21);
                            break;
                        default:
                            aye.y(parcel, readInt21);
                            break;
                    }
                }
                aye.m(parcel, z33);
                return new CastDevice(str42, str43, str44, str45, str46, i14, arrayList17, i15, i13, str47, str48, i16, str49, bArr6, str50, z34, rmfVar, num);
            case 22:
                int z35 = aye.z(parcel);
                boolean z36 = true;
                String str51 = null;
                String str52 = null;
                String str53 = null;
                String str54 = null;
                int i17 = 0;
                int i18 = 0;
                boolean z37 = false;
                int i19 = 0;
                while (parcel.dataPosition() < z35) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 2:
                            str51 = aye.h(parcel, readInt22);
                            break;
                        case 3:
                            i17 = aye.u(parcel, readInt22);
                            break;
                        case 4:
                            i18 = aye.u(parcel, readInt22);
                            break;
                        case 5:
                            str52 = aye.h(parcel, readInt22);
                            break;
                        case 6:
                            str53 = aye.h(parcel, readInt22);
                            break;
                        case 7:
                            z36 = aye.n(parcel, readInt22);
                            break;
                        case '\b':
                            str54 = aye.h(parcel, readInt22);
                            break;
                        case '\t':
                            z37 = aye.n(parcel, readInt22);
                            break;
                        case '\n':
                            i19 = aye.u(parcel, readInt22);
                            break;
                        default:
                            aye.y(parcel, readInt22);
                            break;
                    }
                }
                aye.m(parcel, z35);
                return new vff(str51, i17, i18, str52, str53, z36, str54, z37, i19);
            case 23:
                int z38 = aye.z(parcel);
                String str55 = null;
                String[] strArr3 = null;
                String str56 = null;
                o9d o9dVar = null;
                o9d o9dVar2 = null;
                ii6[] ii6VarArr = null;
                gr7[] gr7VarArr = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                dr5[] dr5VarArr = null;
                while (parcel.dataPosition() < z38) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            str2 = aye.h(parcel, readInt23);
                            break;
                        case 3:
                            str55 = aye.h(parcel, readInt23);
                            break;
                        case 4:
                            strArr3 = aye.i(parcel, readInt23);
                            break;
                        case 5:
                            str56 = aye.h(parcel, readInt23);
                            break;
                        case 6:
                            o9dVar = (o9d) aye.g(parcel, readInt23, o9d.CREATOR);
                            break;
                        case 7:
                            o9dVar2 = (o9d) aye.g(parcel, readInt23, o9d.CREATOR);
                            break;
                        case '\b':
                            ii6VarArr = (ii6[]) aye.k(parcel, readInt23, ii6.CREATOR);
                            break;
                        case '\t':
                            gr7VarArr = (gr7[]) aye.k(parcel, readInt23, gr7.CREATOR);
                            break;
                        case '\n':
                            userAddress = (UserAddress) aye.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress2 = (UserAddress) aye.g(parcel, readInt23, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dr5VarArr = (dr5[]) aye.k(parcel, readInt23, dr5.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt23);
                            break;
                    }
                }
                aye.m(parcel, z38);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.a = str2;
                maskedWallet.b = str55;
                maskedWallet.c = strArr3;
                maskedWallet.d = str56;
                maskedWallet.e = o9dVar;
                maskedWallet.f = o9dVar2;
                maskedWallet.h = ii6VarArr;
                maskedWallet.n = gr7VarArr;
                maskedWallet.r = userAddress;
                maskedWallet.s = userAddress2;
                maskedWallet.w = dr5VarArr;
                return maskedWallet;
            case 24:
                int z39 = aye.z(parcel);
                boolean z40 = false;
                while (parcel.dataPosition() < z39) {
                    int readInt24 = parcel.readInt();
                    char c12 = (char) readInt24;
                    if (c12 == 1) {
                        z40 = aye.n(parcel, readInt24);
                    } else if (c12 != 2) {
                        aye.y(parcel, readInt24);
                    } else {
                        arrayList2 = aye.j(parcel, readInt24);
                    }
                }
                aye.m(parcel, z39);
                return new nhf(arrayList2, z40);
            case 25:
                int z41 = aye.z(parcel);
                while (parcel.dataPosition() < z41) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        aye.y(parcel, readInt25);
                    } else {
                        arrayList = aye.l(parcel, readInt25, cef.CREATOR);
                    }
                }
                aye.m(parcel, z41);
                return new ohf(arrayList);
            case 26:
                int z42 = aye.z(parcel);
                int i20 = 1;
                String str57 = null;
                String str58 = null;
                String str59 = null;
                n4f[] n4fVarArr = null;
                String str60 = null;
                yjf yjfVar = null;
                boolean z43 = false;
                boolean z44 = false;
                while (parcel.dataPosition() < z42) {
                    int readInt26 = parcel.readInt();
                    char c13 = (char) readInt26;
                    if (c13 == 11) {
                        str60 = aye.h(parcel, readInt26);
                    } else if (c13 != '\f') {
                        switch (c13) {
                            case 1:
                                str57 = aye.h(parcel, readInt26);
                                break;
                            case 2:
                                str58 = aye.h(parcel, readInt26);
                                break;
                            case 3:
                                z43 = aye.n(parcel, readInt26);
                                break;
                            case 4:
                                i20 = aye.u(parcel, readInt26);
                                break;
                            case 5:
                                z44 = aye.n(parcel, readInt26);
                                break;
                            case 6:
                                str59 = aye.h(parcel, readInt26);
                                break;
                            case 7:
                                n4fVarArr = (n4f[]) aye.k(parcel, readInt26, n4f.CREATOR);
                                break;
                            default:
                                aye.y(parcel, readInt26);
                                break;
                        }
                    } else {
                        yjfVar = (yjf) aye.g(parcel, readInt26, yjf.CREATOR);
                    }
                }
                aye.m(parcel, z42);
                return new hhf(str57, str58, z43, i20, z44, str59, n4fVarArr, str60, yjfVar);
            case 27:
                int z45 = aye.z(parcel);
                long j2 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (parcel.dataPosition() < z45) {
                    int readInt27 = parcel.readInt();
                    char c14 = (char) readInt27;
                    if (c14 == 1) {
                        i21 = aye.u(parcel, readInt27);
                    } else if (c14 == 2) {
                        i22 = aye.u(parcel, readInt27);
                    } else if (c14 == 3) {
                        i23 = aye.u(parcel, readInt27);
                    } else if (c14 == 4) {
                        i24 = aye.u(parcel, readInt27);
                    } else if (c14 != 5) {
                        aye.y(parcel, readInt27);
                    } else {
                        j2 = aye.w(parcel, readInt27);
                    }
                }
                aye.m(parcel, z45);
                return new vjf(i21, i22, i23, j2, i24);
            case 28:
                int z46 = aye.z(parcel);
                float[] fArr = null;
                Bitmap bitmap = null;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (parcel.dataPosition() < z46) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 1:
                            int x = aye.x(parcel, readInt28);
                            int dataPosition = parcel.dataPosition();
                            if (x == 0) {
                                fArr = null;
                                break;
                            } else {
                                float[] createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + x);
                                fArr = createFloatArray;
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) aye.g(parcel, readInt28, Bitmap.CREATOR);
                            break;
                        case 3:
                            i25 = aye.u(parcel, readInt28);
                            break;
                        case 4:
                            i26 = aye.u(parcel, readInt28);
                            break;
                        case 5:
                            i27 = aye.u(parcel, readInt28);
                            break;
                        case 6:
                            i28 = aye.u(parcel, readInt28);
                            break;
                        case 7:
                            i29 = aye.u(parcel, readInt28);
                            break;
                        default:
                            aye.y(parcel, readInt28);
                            break;
                    }
                }
                aye.m(parcel, z46);
                return new hkf(fArr, bitmap, i25, i26, i27, i28, i29);
            default:
                int z47 = aye.z(parcel);
                ArrayList arrayList18 = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList19 = null;
                while (parcel.dataPosition() < z47) {
                    int readInt29 = parcel.readInt();
                    char c15 = (char) readInt29;
                    if (c15 == 1) {
                        arrayList18 = aye.l(parcel, readInt29, hkf.CREATOR);
                    } else if (c15 == 2) {
                        int x2 = aye.x(parcel, readInt29);
                        int dataPosition2 = parcel.dataPosition();
                        if (x2 == 0) {
                            fArr2 = null;
                        } else {
                            float[] createFloatArray2 = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + x2);
                            fArr2 = createFloatArray2;
                        }
                    } else if (c15 == 3) {
                        bitmap2 = (Bitmap) aye.g(parcel, readInt29, Bitmap.CREATOR);
                    } else if (c15 != 4) {
                        aye.y(parcel, readInt29);
                    } else {
                        int x3 = aye.x(parcel, readInt29);
                        int dataPosition3 = parcel.dataPosition();
                        if (x3 == 0) {
                            arrayList19 = null;
                        } else {
                            ArrayList arrayList20 = new ArrayList();
                            int readInt30 = parcel.readInt();
                            for (int i30 = 0; i30 < readInt30; i30++) {
                                arrayList20.add(Float.valueOf(parcel.readFloat()));
                            }
                            parcel.setDataPosition(dataPosition3 + x3);
                            arrayList19 = arrayList20;
                        }
                    }
                }
                aye.m(parcel, z47);
                return new jkf(arrayList18, fArr2, bitmap2, arrayList19);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d1f[i];
            case 1:
                return new gv4[i];
            case 2:
                return new f50[i];
            case 3:
                return new f1f[i];
            case 4:
                return new r4f[i];
            case 5:
                return new xe0[i];
            case 6:
                return new n4f[i];
            case 7:
                return new ld1[i];
            case 8:
                return new dr5[i];
            case 9:
                return new htc[i];
            case 10:
                return new uaf[i];
            case 11:
                return new zaf[i];
            case 12:
                return new n9f[i];
            case 13:
                return new r9f[i];
            case 14:
                return new s9f[i];
            case 15:
                return new t51[i];
            case 16:
                return new pt5[i];
            case 17:
                return new wdf[i];
            case 18:
                return new xdf[i];
            case 19:
                return new cef[i];
            case 20:
                return new ii6[i];
            case 21:
                return new CastDevice[i];
            case 22:
                return new vff[i];
            case 23:
                return new MaskedWallet[i];
            case 24:
                return new nhf[i];
            case 25:
                return new ohf[i];
            case 26:
                return new hhf[i];
            case 27:
                return new vjf[i];
            case 28:
                return new hkf[i];
            default:
                return new jkf[i];
        }
    }
}
