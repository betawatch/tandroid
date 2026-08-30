package r5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.widget.RemoteViews;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import j7.l0;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z4 = l0.z(parcel);
                String str = null;
                ArrayList arrayList = null;
                q5.i iVar = null;
                s5.a aVar = null;
                ArrayList arrayList2 = null;
                a0 a0Var = null;
                b0 b0Var = null;
                double d = 0.0d;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = l0.h(parcel, readInt);
                            break;
                        case 3:
                            arrayList = l0.j(parcel, readInt);
                            break;
                        case 4:
                            z10 = l0.n(parcel, readInt);
                            break;
                        case 5:
                            iVar = (q5.i) l0.g(parcel, readInt, q5.i.CREATOR);
                            break;
                        case 6:
                            z11 = l0.n(parcel, readInt);
                            break;
                        case 7:
                            aVar = (s5.a) l0.g(parcel, readInt, s5.a.CREATOR);
                            break;
                        case '\b':
                            z12 = l0.n(parcel, readInt);
                            break;
                        case '\t':
                            d = l0.q(parcel, readInt);
                            break;
                        case '\n':
                            z13 = l0.n(parcel, readInt);
                            break;
                        case 11:
                            z14 = l0.n(parcel, readInt);
                            break;
                        case '\f':
                            z15 = l0.n(parcel, readInt);
                            break;
                        case '\r':
                            arrayList2 = l0.j(parcel, readInt);
                            break;
                        case 14:
                            z16 = l0.n(parcel, readInt);
                            break;
                        case 15:
                            l0.u(parcel, readInt);
                            break;
                        case 16:
                            z17 = l0.n(parcel, readInt);
                            break;
                        case 17:
                            a0Var = (a0) l0.g(parcel, readInt, a0.CREATOR);
                            break;
                        case 18:
                            b0Var = (b0) l0.g(parcel, readInt, b0.CREATOR);
                            break;
                        default:
                            l0.y(parcel, readInt);
                            break;
                    }
                }
                l0.m(parcel, z4);
                return new b(str, arrayList, z10, iVar, z11, aVar, z12, d, z13, z14, z15, arrayList2, z16, z17, a0Var, b0Var);
            case 1:
                int z18 = l0.z(parcel);
                String str2 = null;
                String str3 = null;
                IBinder iBinder = null;
                s5.f fVar = null;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str2 = l0.h(parcel, readInt2);
                            break;
                        case 3:
                            str3 = l0.h(parcel, readInt2);
                            break;
                        case 4:
                            iBinder = l0.t(parcel, readInt2);
                            break;
                        case 5:
                            fVar = (s5.f) l0.g(parcel, readInt2, s5.f.CREATOR);
                            break;
                        case 6:
                            z19 = l0.n(parcel, readInt2);
                            break;
                        case 7:
                            z20 = l0.n(parcel, readInt2);
                            break;
                        default:
                            l0.y(parcel, readInt2);
                            break;
                    }
                }
                l0.m(parcel, z18);
                return new s5.a(str2, str3, iBinder, fVar, z19, z20);
            case 2:
                int z21 = l0.z(parcel);
                ArrayList arrayList3 = null;
                int[] iArr = null;
                String str4 = null;
                IBinder iBinder2 = null;
                long j10 = 0;
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
                boolean z22 = false;
                boolean z23 = false;
                while (parcel.dataPosition() < z21) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            arrayList3 = l0.j(parcel, readInt3);
                            break;
                        case 3:
                            iArr = l0.d(parcel, readInt3);
                            break;
                        case 4:
                            j10 = l0.w(parcel, readInt3);
                            break;
                        case 5:
                            str4 = l0.h(parcel, readInt3);
                            break;
                        case 6:
                            i10 = l0.u(parcel, readInt3);
                            break;
                        case 7:
                            i11 = l0.u(parcel, readInt3);
                            break;
                        case '\b':
                            i12 = l0.u(parcel, readInt3);
                            break;
                        case '\t':
                            i13 = l0.u(parcel, readInt3);
                            break;
                        case '\n':
                            i14 = l0.u(parcel, readInt3);
                            break;
                        case 11:
                            i15 = l0.u(parcel, readInt3);
                            break;
                        case '\f':
                            i16 = l0.u(parcel, readInt3);
                            break;
                        case '\r':
                            i17 = l0.u(parcel, readInt3);
                            break;
                        case 14:
                            i18 = l0.u(parcel, readInt3);
                            break;
                        case 15:
                            i19 = l0.u(parcel, readInt3);
                            break;
                        case 16:
                            i20 = l0.u(parcel, readInt3);
                            break;
                        case 17:
                            i21 = l0.u(parcel, readInt3);
                            break;
                        case 18:
                            i22 = l0.u(parcel, readInt3);
                            break;
                        case 19:
                            i23 = l0.u(parcel, readInt3);
                            break;
                        case 20:
                            i24 = l0.u(parcel, readInt3);
                            break;
                        case 21:
                            i25 = l0.u(parcel, readInt3);
                            break;
                        case 22:
                            i26 = l0.u(parcel, readInt3);
                            break;
                        case 23:
                            i27 = l0.u(parcel, readInt3);
                            break;
                        case 24:
                            i28 = l0.u(parcel, readInt3);
                            break;
                        case 25:
                            i29 = l0.u(parcel, readInt3);
                            break;
                        case 26:
                            i30 = l0.u(parcel, readInt3);
                            break;
                        case 27:
                            i31 = l0.u(parcel, readInt3);
                            break;
                        case 28:
                            i32 = l0.u(parcel, readInt3);
                            break;
                        case 29:
                            i33 = l0.u(parcel, readInt3);
                            break;
                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                            i34 = l0.u(parcel, readInt3);
                            break;
                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                            i35 = l0.u(parcel, readInt3);
                            break;
                        case ' ':
                            i36 = l0.u(parcel, readInt3);
                            break;
                        case '!':
                            iBinder2 = l0.t(parcel, readInt3);
                            break;
                        case '\"':
                            z22 = l0.n(parcel, readInt3);
                            break;
                        case '#':
                            z23 = l0.n(parcel, readInt3);
                            break;
                        default:
                            l0.y(parcel, readInt3);
                            break;
                    }
                }
                l0.m(parcel, z21);
                return new s5.f(arrayList3, iArr, j10, str4, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder2, z22, z23);
            case 3:
                int z24 = l0.z(parcel);
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                while (parcel.dataPosition() < z24) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 2) {
                        i37 = l0.u(parcel, readInt4);
                    } else if (c3 == 3) {
                        i38 = l0.u(parcel, readInt4);
                    } else if (c3 != 4) {
                        l0.y(parcel, readInt4);
                    } else {
                        i39 = l0.u(parcel, readInt4);
                    }
                }
                l0.m(parcel, z24);
                return new s5.b(i37, i38, i39);
            case 4:
                int z25 = l0.z(parcel);
                String str5 = null;
                String str6 = null;
                int i40 = 0;
                while (parcel.dataPosition() < z25) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 == 2) {
                        str5 = l0.h(parcel, readInt5);
                    } else if (c10 == 3) {
                        i40 = l0.u(parcel, readInt5);
                    } else if (c10 != 4) {
                        l0.y(parcel, readInt5);
                    } else {
                        str6 = l0.h(parcel, readInt5);
                    }
                }
                l0.m(parcel, z25);
                return new s5.d(str5, i40, str6);
            case 5:
                int z26 = l0.z(parcel);
                byte[] bArr = null;
                while (parcel.dataPosition() < z26) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        l0.y(parcel, readInt6);
                    } else {
                        bArr = l0.b(parcel, readInt6);
                    }
                }
                l0.m(parcel, z26);
                return new s7.d(bArr);
            case 6:
                int z27 = l0.z(parcel);
                byte[] bArr2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        l0.y(parcel, readInt7);
                    } else {
                        bArr2 = l0.b(parcel, readInt7);
                    }
                }
                l0.m(parcel, z27);
                return new s7.e(bArr2);
            case 7:
                int z28 = l0.z(parcel);
                byte[] bArr3 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        l0.y(parcel, readInt8);
                    } else {
                        bArr3 = l0.b(parcel, readInt8);
                    }
                }
                l0.m(parcel, z28);
                return new s7.f(bArr3);
            case 8:
                int z29 = l0.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z29) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        l0.y(parcel, readInt9);
                    } else {
                        pendingIntent = (PendingIntent) l0.g(parcel, readInt9, PendingIntent.CREATOR);
                    }
                }
                l0.m(parcel, z29);
                return new s7.g(pendingIntent);
            case 9:
                int z30 = l0.z(parcel);
                String[] strArr = null;
                int[] iArr2 = null;
                RemoteViews remoteViews = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z30) {
                    int readInt10 = parcel.readInt();
                    char c11 = (char) readInt10;
                    if (c11 == 1) {
                        strArr = l0.i(parcel, readInt10);
                    } else if (c11 == 2) {
                        iArr2 = l0.d(parcel, readInt10);
                    } else if (c11 == 3) {
                        remoteViews = (RemoteViews) l0.g(parcel, readInt10, RemoteViews.CREATOR);
                    } else if (c11 != 4) {
                        l0.y(parcel, readInt10);
                    } else {
                        bArr4 = l0.b(parcel, readInt10);
                    }
                }
                l0.m(parcel, z30);
                s7.h hVar = new s7.h();
                hVar.a = strArr;
                hVar.b = iArr2;
                hVar.c = remoteViews;
                hVar.d = bArr4;
                return hVar;
            case 10:
                int z31 = l0.z(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt11 = parcel.readInt();
                    boolean z33 = z32;
                    switch ((char) readInt11) {
                        case 2:
                            str7 = l0.h(parcel, readInt11);
                            break;
                        case 3:
                            str8 = l0.h(parcel, readInt11);
                            break;
                        case 4:
                            str9 = l0.h(parcel, readInt11);
                            break;
                        case 5:
                            str10 = l0.h(parcel, readInt11);
                            break;
                        case 6:
                            str11 = l0.h(parcel, readInt11);
                            break;
                        case 7:
                            str12 = l0.h(parcel, readInt11);
                            break;
                        case '\b':
                            str13 = l0.h(parcel, readInt11);
                            break;
                        case '\t':
                            str14 = l0.h(parcel, readInt11);
                            break;
                        case '\n':
                            str15 = l0.h(parcel, readInt11);
                            break;
                        case 11:
                            str16 = l0.h(parcel, readInt11);
                            break;
                        case '\f':
                            str17 = l0.h(parcel, readInt11);
                            break;
                        case '\r':
                            str18 = l0.h(parcel, readInt11);
                            break;
                        case 14:
                            z32 = l0.n(parcel, readInt11);
                            continue;
                        case 15:
                            str20 = l0.h(parcel, readInt11);
                            break;
                        case 16:
                            str19 = l0.h(parcel, readInt11);
                            break;
                        default:
                            l0.y(parcel, readInt11);
                            break;
                    }
                    z32 = z33;
                }
                boolean z34 = z32;
                l0.m(parcel, z31);
                UserAddress userAddress = new UserAddress();
                userAddress.a = str7;
                userAddress.b = str8;
                userAddress.c = str9;
                userAddress.d = str10;
                userAddress.e = str11;
                userAddress.f = str12;
                userAddress.h = str13;
                userAddress.n = str14;
                userAddress.r = str15;
                userAddress.s = str16;
                userAddress.v = str17;
                userAddress.w = str18;
                userAddress.x = z34;
                userAddress.y = str20;
                userAddress.B = str19;
                return userAddress;
            case 11:
                u0.h hVar2 = new u0.h(parcel);
                hVar2.a = parcel.readInt();
                return hVar2;
            case 12:
                int z35 = l0.z(parcel);
                int i41 = 0;
                boolean z36 = false;
                boolean z37 = false;
                while (parcel.dataPosition() < z35) {
                    int readInt12 = parcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 == 2) {
                        i41 = l0.u(parcel, readInt12);
                    } else if (c12 == 3) {
                        z36 = l0.n(parcel, readInt12);
                    } else if (c12 != 4) {
                        l0.y(parcel, readInt12);
                    } else {
                        z37 = l0.n(parcel, readInt12);
                    }
                }
                l0.m(parcel, z35);
                return new u5.y(i41, z36, z37);
            case 13:
                int z38 = l0.z(parcel);
                double d10 = 0.0d;
                q5.d dVar = null;
                q5.x xVar = null;
                boolean z39 = false;
                int i42 = 0;
                int i43 = 0;
                double d11 = 0.0d;
                while (parcel.dataPosition() < z38) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            d10 = l0.q(parcel, readInt13);
                            break;
                        case 3:
                            z39 = l0.n(parcel, readInt13);
                            break;
                        case 4:
                            i42 = l0.u(parcel, readInt13);
                            break;
                        case 5:
                            dVar = (q5.d) l0.g(parcel, readInt13, q5.d.CREATOR);
                            break;
                        case 6:
                            i43 = l0.u(parcel, readInt13);
                            break;
                        case 7:
                            xVar = (q5.x) l0.g(parcel, readInt13, q5.x.CREATOR);
                            break;
                        case '\b':
                            d11 = l0.q(parcel, readInt13);
                            break;
                        default:
                            l0.y(parcel, readInt13);
                            break;
                    }
                }
                l0.m(parcel, z38);
                u5.d dVar2 = new u5.d();
                dVar2.a = d10;
                dVar2.b = z39;
                dVar2.c = i42;
                dVar2.d = dVar;
                dVar2.e = i43;
                dVar2.f = xVar;
                dVar2.h = d11;
                return dVar2;
            case 14:
                int z40 = l0.z(parcel);
                String str21 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 2) {
                        l0.y(parcel, readInt14);
                    } else {
                        str21 = l0.h(parcel, readInt14);
                    }
                }
                l0.m(parcel, z40);
                return new u5.c(str21);
            case 15:
                int z41 = l0.z(parcel);
                boolean z42 = false;
                while (parcel.dataPosition() < z41) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        l0.y(parcel, readInt15);
                    } else {
                        z42 = l0.n(parcel, readInt15);
                    }
                }
                l0.m(parcel, z41);
                return new u6.a(z42);
            case 16:
                int z43 = l0.z(parcel);
                while (parcel.dataPosition() < z43) {
                    l0.y(parcel, parcel.readInt());
                }
                l0.m(parcel, z43);
                return new u6.b();
            case 17:
                int z44 = l0.z(parcel);
                boolean z45 = false;
                while (parcel.dataPosition() < z44) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        l0.y(parcel, readInt16);
                    } else {
                        z45 = l0.n(parcel, readInt16);
                    }
                }
                l0.m(parcel, z44);
                return new u6.c(z45);
            case 18:
                int z46 = l0.z(parcel);
                boolean z47 = false;
                while (parcel.dataPosition() < z46) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        l0.y(parcel, readInt17);
                    } else {
                        z47 = l0.n(parcel, readInt17);
                    }
                }
                l0.m(parcel, z46);
                return new u6.d(z47);
            case 19:
                int z48 = l0.z(parcel);
                PendingIntent pendingIntent2 = null;
                u6.g gVar = null;
                while (parcel.dataPosition() < z48) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        pendingIntent2 = (PendingIntent) l0.g(parcel, readInt18, PendingIntent.CREATOR);
                    } else if (c13 != 2) {
                        l0.y(parcel, readInt18);
                    } else {
                        gVar = (u6.g) l0.g(parcel, readInt18, u6.g.CREATOR);
                    }
                }
                l0.m(parcel, z48);
                return new u6.e(pendingIntent2, gVar);
            case 20:
                int z49 = l0.z(parcel);
                String str22 = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                String str23 = null;
                String str24 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z49) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str22 = l0.h(parcel, readInt19);
                            break;
                        case 2:
                            bundle = l0.a(parcel, readInt19);
                            break;
                        case 3:
                            bundle2 = l0.a(parcel, readInt19);
                            break;
                        case 4:
                            str23 = l0.h(parcel, readInt19);
                            break;
                        case 5:
                            str24 = l0.h(parcel, readInt19);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) l0.g(parcel, readInt19, ResultReceiver.CREATOR);
                            break;
                        default:
                            l0.y(parcel, readInt19);
                            break;
                    }
                }
                l0.m(parcel, z49);
                return new u6.f(str22, bundle, bundle2, str23, str24, resultReceiver);
            case 21:
                int z50 = l0.z(parcel);
                String str25 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z50) {
                    int readInt20 = parcel.readInt();
                    char c14 = (char) readInt20;
                    if (c14 == 1) {
                        str25 = l0.h(parcel, readInt20);
                    } else if (c14 != 2) {
                        l0.y(parcel, readInt20);
                    } else {
                        bundle3 = l0.a(parcel, readInt20);
                    }
                }
                l0.m(parcel, z50);
                return new u6.g(str25, bundle3);
            case 22:
                int z51 = l0.z(parcel);
                String str26 = "";
                String str27 = str26;
                String str28 = str27;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                String str29 = null;
                while (parcel.dataPosition() < z51) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            str26 = l0.h(parcel, readInt21);
                            break;
                        case 2:
                            bundle4 = l0.a(parcel, readInt21);
                            break;
                        case 3:
                            bundle5 = l0.a(parcel, readInt21);
                            break;
                        case 4:
                            str29 = l0.h(parcel, readInt21);
                            break;
                        case 5:
                            str27 = l0.h(parcel, readInt21);
                            break;
                        case 6:
                            str28 = l0.h(parcel, readInt21);
                            break;
                        default:
                            l0.y(parcel, readInt21);
                            break;
                    }
                }
                l0.m(parcel, z51);
                return new u6.h(str26, bundle4, bundle5, str29, str27, str28);
            case 23:
                int z52 = l0.z(parcel);
                Bundle bundle6 = null;
                while (parcel.dataPosition() < z52) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        l0.y(parcel, readInt22);
                    } else {
                        bundle6 = l0.a(parcel, readInt22);
                    }
                }
                l0.m(parcel, z52);
                return new u6.i(bundle6);
            case 24:
                int z53 = l0.z(parcel);
                Bundle bundle7 = null;
                while (parcel.dataPosition() < z53) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        l0.y(parcel, readInt23);
                    } else {
                        bundle7 = l0.a(parcel, readInt23);
                    }
                }
                l0.m(parcel, z53);
                return new u6.j(bundle7);
            case 25:
                int z54 = l0.z(parcel);
                ArrayList arrayList4 = null;
                Bundle bundle8 = null;
                String str30 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < z54) {
                    int readInt24 = parcel.readInt();
                    char c15 = (char) readInt24;
                    if (c15 == 1) {
                        arrayList4 = l0.l(parcel, readInt24, u6.h.CREATOR);
                    } else if (c15 == 2) {
                        bundle8 = l0.a(parcel, readInt24);
                    } else if (c15 == 3) {
                        str30 = l0.h(parcel, readInt24);
                    } else if (c15 != 4) {
                        l0.y(parcel, readInt24);
                    } else {
                        resultReceiver2 = (ResultReceiver) l0.g(parcel, readInt24, ResultReceiver.CREATOR);
                    }
                }
                l0.m(parcel, z54);
                return new GetCredentialRequest(arrayList4, bundle8, str30, resultReceiver2);
            case 26:
                int z55 = l0.z(parcel);
                Bundle bundle9 = null;
                while (parcel.dataPosition() < z55) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        l0.y(parcel, readInt25);
                    } else {
                        bundle9 = l0.a(parcel, readInt25);
                    }
                }
                l0.m(parcel, z55);
                return new u6.k(bundle9);
            case 27:
                int z56 = l0.z(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < z56) {
                    int readInt26 = parcel.readInt();
                    if (((char) readInt26) != 1) {
                        l0.y(parcel, readInt26);
                    } else {
                        pendingIntent3 = (PendingIntent) l0.g(parcel, readInt26, PendingIntent.CREATOR);
                    }
                }
                l0.m(parcel, z56);
                return new u6.l(pendingIntent3);
            case 28:
                int z57 = l0.z(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < z57) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        l0.y(parcel, readInt27);
                    } else {
                        pendingIntent4 = (PendingIntent) l0.g(parcel, readInt27, PendingIntent.CREATOR);
                    }
                }
                l0.m(parcel, z57);
                return new u6.m(pendingIntent4);
            default:
                int z58 = l0.z(parcel);
                while (parcel.dataPosition() < z58) {
                    l0.y(parcel, parcel.readInt());
                }
                l0.m(parcel, z58);
                return new u6.n();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b[i10];
            case 1:
                return new s5.a[i10];
            case 2:
                return new s5.f[i10];
            case 3:
                return new s5.b[i10];
            case 4:
                return new s5.d[i10];
            case 5:
                return new s7.d[i10];
            case 6:
                return new s7.e[i10];
            case 7:
                return new s7.f[i10];
            case 8:
                return new s7.g[i10];
            case 9:
                return new s7.h[i10];
            case 10:
                return new UserAddress[i10];
            case 11:
                return new u0.h[i10];
            case 12:
                return new u5.y[i10];
            case 13:
                return new u5.d[i10];
            case 14:
                return new u5.c[i10];
            case 15:
                return new u6.a[i10];
            case 16:
                return new u6.b[i10];
            case 17:
                return new u6.c[i10];
            case 18:
                return new u6.d[i10];
            case 19:
                return new u6.e[i10];
            case 20:
                return new u6.f[i10];
            case 21:
                return new u6.g[i10];
            case 22:
                return new u6.h[i10];
            case 23:
                return new u6.i[i10];
            case 24:
                return new u6.j[i10];
            case 25:
                return new GetCredentialRequest[i10];
            case 26:
                return new u6.k[i10];
            case 27:
                return new u6.l[i10];
            case 28:
                return new u6.m[i10];
            default:
                return new u6.n[i10];
        }
    }
}
