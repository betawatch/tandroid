// default package

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rpd implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ rpd(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.util.ArrayList] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        Uri uri = null;
        LatLng latLng = null;
        String str = null;
        a9e a9eVar = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str2 = null;
        kpd kpdVar = null;
        ArrayList arrayList = null;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        ConnectionConfiguration connectionConfiguration = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        se0 se0Var = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String str6 = null;
        ParcelFileDescriptor parcelFileDescriptor3 = null;
        r5 = null;
        JSONObject jSONObject = null;
        p8d p8dVar = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        switch (this.a) {
            case 0:
                int z2 = gte.z(parcel);
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        uri = (Uri) gte.g(parcel, readInt2, Uri.CREATOR);
                    } else if (c == 4) {
                        bundle = gte.a(parcel, readInt2);
                    } else if (c != 5) {
                        gte.y(parcel, readInt2);
                    } else {
                        bArr = gte.b(parcel, readInt2);
                    }
                }
                gte.m(parcel, z2);
                return new kpd(uri, bundle, bArr);
            case 1:
                int z3 = gte.z(parcel);
                int i20 = 0;
                while (parcel.dataPosition() < z3) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 2) {
                        i = gte.u(parcel, readInt3);
                    } else if (c2 != 3) {
                        gte.y(parcel, readInt3);
                    } else {
                        i20 = gte.u(parcel, readInt3);
                    }
                }
                gte.m(parcel, z3);
                return new dqd(i, i20);
            case 2:
                int z4 = gte.z(parcel);
                while (parcel.dataPosition() < z4) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 2) {
                        i19 = gte.u(parcel, readInt4);
                    } else if (c3 != 3) {
                        gte.y(parcel, readInt4);
                    } else {
                        arrayList2 = gte.l(parcel, readInt4, p8d.CREATOR);
                    }
                }
                gte.m(parcel, z4);
                return new oqd(i19, arrayList2);
            case 3:
                int z5 = gte.z(parcel);
                while (parcel.dataPosition() < z5) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 2) {
                        i18 = gte.u(parcel, readInt5);
                    } else if (c4 != 3) {
                        gte.y(parcel, readInt5);
                    } else {
                        p8dVar = (p8d) gte.g(parcel, readInt5, p8d.CREATOR);
                    }
                }
                gte.m(parcel, z5);
                return new zqd(i18, p8dVar);
            case 4:
                int z6 = gte.z(parcel);
                gr6 gr6Var = null;
                String str7 = null;
                while (parcel.dataPosition() < z6) {
                    int readInt6 = parcel.readInt();
                    char c5 = (char) readInt6;
                    if (c5 == 2) {
                        gr6Var = (gr6) gte.g(parcel, readInt6, gr6.CREATOR);
                    } else if (c5 != 3) {
                        gte.y(parcel, readInt6);
                    } else {
                        str7 = gte.h(parcel, readInt6);
                    }
                }
                gte.m(parcel, z6);
                Pattern pattern = id1.a;
                if (str7 != null) {
                    try {
                        jSONObject = new JSONObject(str7);
                    } catch (JSONException unused) {
                    }
                }
                return new p6a(gr6Var, jSONObject);
            case 5:
                int z7 = gte.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 2) {
                        i17 = gte.u(parcel, readInt7);
                    } else if (c6 != 3) {
                        gte.y(parcel, readInt7);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) gte.g(parcel, readInt7, ParcelFileDescriptor.CREATOR);
                    }
                }
                gte.m(parcel, z7);
                return new lrd(i17, parcelFileDescriptor3);
            case 6:
                int z8 = gte.z(parcel);
                float f = 0.0f;
                String str8 = null;
                String str9 = null;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (parcel.dataPosition() < z8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            f = gte.r(parcel, readInt8);
                            break;
                        case 3:
                            i21 = gte.u(parcel, readInt8);
                            break;
                        case 4:
                            i22 = gte.u(parcel, readInt8);
                            break;
                        case 5:
                            i23 = gte.u(parcel, readInt8);
                            break;
                        case 6:
                            i24 = gte.u(parcel, readInt8);
                            break;
                        case 7:
                            i25 = gte.u(parcel, readInt8);
                            break;
                        case '\b':
                            i26 = gte.u(parcel, readInt8);
                            break;
                        case '\t':
                            i27 = gte.u(parcel, readInt8);
                            break;
                        case '\n':
                            str8 = gte.h(parcel, readInt8);
                            break;
                        case 11:
                            i28 = gte.u(parcel, readInt8);
                            break;
                        case '\f':
                            i29 = gte.u(parcel, readInt8);
                            break;
                        case '\r':
                            str9 = gte.h(parcel, readInt8);
                            break;
                        default:
                            gte.y(parcel, readInt8);
                            break;
                    }
                }
                gte.m(parcel, z8);
                return new xib(f, i21, i22, i23, i24, i25, i26, i27, str8, i28, i29, str9);
            case 7:
                int z9 = gte.z(parcel);
                String str10 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 2) {
                        str6 = gte.h(parcel, readInt9);
                    } else if (c7 != 3) {
                        gte.y(parcel, readInt9);
                    } else {
                        str10 = gte.h(parcel, readInt9);
                    }
                }
                gte.m(parcel, z9);
                return new d9c(str6, str10);
            case 8:
                int z10 = gte.z(parcel);
                while (parcel.dataPosition() < z10) {
                    int readInt10 = parcel.readInt();
                    char c8 = (char) readInt10;
                    if (c8 == 2) {
                        i16 = gte.u(parcel, readInt10);
                    } else if (c8 != 3) {
                        gte.y(parcel, readInt10);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) gte.g(parcel, readInt10, ParcelFileDescriptor.CREATOR);
                    }
                }
                gte.m(parcel, z10);
                return new wrd(i16, parcelFileDescriptor2);
            case 9:
                int z11 = gte.z(parcel);
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt11 = parcel.readInt();
                    char c9 = (char) readInt11;
                    if (c9 == 2) {
                        i15 = gte.u(parcel, readInt11);
                    } else if (c9 == 3) {
                        i30 = gte.u(parcel, readInt11);
                    } else if (c9 != 4) {
                        gte.y(parcel, readInt11);
                    } else {
                        i31 = gte.u(parcel, readInt11);
                    }
                }
                gte.m(parcel, z11);
                return new bbc(i15, i30, i31);
            case 10:
                int z12 = gte.z(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt12 = parcel.readInt();
                    char c10 = (char) readInt12;
                    if (c10 == 2) {
                        i14 = gte.u(parcel, readInt12);
                    } else if (c10 != 3) {
                        gte.y(parcel, readInt12);
                    } else {
                        z13 = gte.n(parcel, readInt12);
                    }
                }
                gte.m(parcel, z12);
                return new jsd(i14, z13);
            case 11:
                int z14 = gte.z(parcel);
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt13 = parcel.readInt();
                    char c11 = (char) readInt13;
                    if (c11 == 2) {
                        i13 = gte.u(parcel, readInt13);
                    } else if (c11 == 3) {
                        z15 = gte.n(parcel, readInt13);
                    } else if (c11 != 4) {
                        gte.y(parcel, readInt13);
                    } else {
                        z16 = gte.n(parcel, readInt13);
                    }
                }
                gte.m(parcel, z14);
                return new usd(i13, z15, z16);
            case 12:
                int z17 = gte.z(parcel);
                boolean z18 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt14 = parcel.readInt();
                    char c12 = (char) readInt14;
                    if (c12 == 2) {
                        i12 = gte.u(parcel, readInt14);
                    } else if (c12 != 3) {
                        gte.y(parcel, readInt14);
                    } else {
                        z18 = gte.n(parcel, readInt14);
                    }
                }
                gte.m(parcel, z17);
                return new std(i12, z18);
            case 13:
                int z19 = gte.z(parcel);
                while (parcel.dataPosition() < z19) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        gte.y(parcel, readInt15);
                    } else {
                        z = gte.n(parcel, readInt15);
                    }
                }
                gte.m(parcel, z19);
                return new y40(z);
            case 14:
                int z20 = gte.z(parcel);
                frd frdVar = nrd.b;
                srd srdVar = srd.e;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                bnd bndVar = null;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                while (parcel.dataPosition() < z20) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i32 = gte.u(parcel, readInt16);
                            break;
                        case 2:
                            i33 = gte.u(parcel, readInt16);
                            break;
                        case 3:
                            str11 = gte.h(parcel, readInt16);
                            break;
                        case 4:
                            str12 = gte.h(parcel, readInt16);
                            break;
                        case 5:
                            i34 = gte.u(parcel, readInt16);
                            break;
                        case 6:
                            str13 = gte.h(parcel, readInt16);
                            break;
                        case 7:
                            bndVar = (bnd) gte.g(parcel, readInt16, bnd.CREATOR);
                            break;
                        case '\b':
                            srdVar = gte.l(parcel, readInt16, f84.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt16);
                            break;
                    }
                }
                gte.m(parcel, z20);
                return new bnd(i32, i33, str11, str12, str13, i34, srdVar, bndVar);
            case 15:
                int z21 = gte.z(parcel);
                long j = 0;
                nc5[] nc5VarArr = null;
                int i35 = 0;
                boolean z22 = false;
                while (true) {
                    long j2 = j;
                    while (parcel.dataPosition() < z21) {
                        readInt = parcel.readInt();
                        char c13 = (char) readInt;
                        if (c13 != 2) {
                            if (c13 == 3) {
                                nc5VarArr = (nc5[]) gte.k(parcel, readInt, nc5.CREATOR);
                            } else if (c13 == 4) {
                                i35 = gte.u(parcel, readInt);
                            } else if (c13 != 5) {
                                gte.y(parcel, readInt);
                            } else {
                                z22 = gte.n(parcel, readInt);
                            }
                        }
                    }
                    gte.m(parcel, z21);
                    return new fnd(j2, nc5VarArr, i35, z22);
                    j = gte.w(parcel, readInt);
                    break;
                }
                break;
            case 16:
                int z23 = gte.z(parcel);
                String str14 = null;
                String str15 = null;
                te0[] te0VarArr = null;
                qe0[] qe0VarArr = null;
                String[] strArr = null;
                le0[] le0VarArr = null;
                while (parcel.dataPosition() < z23) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            se0Var = (se0) gte.g(parcel, readInt17, se0.CREATOR);
                            break;
                        case 3:
                            str14 = gte.h(parcel, readInt17);
                            break;
                        case 4:
                            str15 = gte.h(parcel, readInt17);
                            break;
                        case 5:
                            te0VarArr = (te0[]) gte.k(parcel, readInt17, te0.CREATOR);
                            break;
                        case 6:
                            qe0VarArr = (qe0[]) gte.k(parcel, readInt17, qe0.CREATOR);
                            break;
                        case 7:
                            strArr = gte.i(parcel, readInt17);
                            break;
                        case '\b':
                            le0VarArr = (le0[]) gte.k(parcel, readInt17, le0.CREATOR);
                            break;
                        default:
                            gte.y(parcel, readInt17);
                            break;
                    }
                }
                gte.m(parcel, z23);
                oe0 oe0Var = new oe0();
                oe0Var.a = se0Var;
                oe0Var.b = str14;
                oe0Var.c = str15;
                oe0Var.d = te0VarArr;
                oe0Var.e = qe0VarArr;
                oe0Var.f = strArr;
                oe0Var.h = le0VarArr;
                return oe0Var;
            case 17:
                int z24 = gte.z(parcel);
                float f2 = -1.0f;
                int i36 = 0;
                int i37 = 0;
                boolean z25 = false;
                boolean z26 = false;
                while (parcel.dataPosition() < z24) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            i11 = gte.u(parcel, readInt18);
                            break;
                        case 3:
                            i36 = gte.u(parcel, readInt18);
                            break;
                        case 4:
                            i37 = gte.u(parcel, readInt18);
                            break;
                        case 5:
                            z25 = gte.n(parcel, readInt18);
                            break;
                        case 6:
                            z26 = gte.n(parcel, readInt18);
                            break;
                        case 7:
                            f2 = gte.r(parcel, readInt18);
                            break;
                        default:
                            gte.y(parcel, readInt18);
                            break;
                    }
                }
                gte.m(parcel, z24);
                syd sydVar = new syd();
                sydVar.a = i11;
                sydVar.b = i36;
                sydVar.c = i37;
                sydVar.d = z25;
                sydVar.e = z26;
                sydVar.f = f2;
                return sydVar;
            case 18:
                int z27 = gte.z(parcel);
                String str16 = null;
                UserAddress userAddress = null;
                int i38 = 0;
                String str17 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt19 = parcel.readInt();
                    char c14 = (char) readInt19;
                    if (c14 == 1) {
                        str5 = gte.h(parcel, readInt19);
                    } else if (c14 == 2) {
                        str17 = gte.h(parcel, readInt19);
                    } else if (c14 == 3) {
                        str16 = gte.h(parcel, readInt19);
                    } else if (c14 == 4) {
                        i38 = gte.u(parcel, readInt19);
                    } else if (c14 != 5) {
                        gte.y(parcel, readInt19);
                    } else {
                        userAddress = (UserAddress) gte.g(parcel, readInt19, UserAddress.CREATOR);
                    }
                }
                gte.m(parcel, z27);
                tc1 tc1Var = new tc1();
                tc1Var.a = str5;
                tc1Var.b = str17;
                tc1Var.c = str16;
                tc1Var.d = i38;
                tc1Var.e = userAddress;
                return tc1Var;
            case 19:
                int z28 = gte.z(parcel);
                PendingIntent pendingIntent = null;
                int i39 = 0;
                ds2 ds2Var = null;
                while (parcel.dataPosition() < z28) {
                    int readInt20 = parcel.readInt();
                    char c15 = (char) readInt20;
                    if (c15 == 1) {
                        i39 = gte.u(parcel, readInt20);
                    } else if (c15 == 2) {
                        str4 = gte.h(parcel, readInt20);
                    } else if (c15 == 3) {
                        pendingIntent = (PendingIntent) gte.g(parcel, readInt20, PendingIntent.CREATOR);
                    } else if (c15 != 4) {
                        gte.y(parcel, readInt20);
                    } else {
                        ds2Var = (ds2) gte.g(parcel, readInt20, ds2.CREATOR);
                    }
                }
                gte.m(parcel, z28);
                return new Status(i39, str4, pendingIntent, ds2Var);
            case 20:
                int z29 = gte.z(parcel);
                while (parcel.dataPosition() < z29) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 2) {
                        i10 = gte.u(parcel, readInt21);
                    } else if (c16 != 3) {
                        gte.y(parcel, readInt21);
                    } else {
                        str3 = gte.h(parcel, readInt21);
                    }
                }
                gte.m(parcel, z29);
                return new ytd(i10, str3);
            case 21:
                int z30 = gte.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt22 = parcel.readInt();
                    char c17 = (char) readInt22;
                    if (c17 == 2) {
                        i9 = gte.u(parcel, readInt22);
                    } else if (c17 != 3) {
                        gte.y(parcel, readInt22);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) gte.g(parcel, readInt22, ConnectionConfiguration.CREATOR);
                    }
                }
                gte.m(parcel, z30);
                return new lud(i9, connectionConfiguration);
            case 22:
                int z31 = gte.z(parcel);
                while (parcel.dataPosition() < z31) {
                    int readInt23 = parcel.readInt();
                    char c18 = (char) readInt23;
                    if (c18 == 2) {
                        i8 = gte.u(parcel, readInt23);
                    } else if (c18 != 3) {
                        gte.y(parcel, readInt23);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) gte.k(parcel, readInt23, ConnectionConfiguration.CREATOR);
                    }
                }
                gte.m(parcel, z31);
                return new uud(i8, connectionConfigurationArr);
            case 23:
                int z32 = gte.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt24 = parcel.readInt();
                    char c19 = (char) readInt24;
                    if (c19 == 2) {
                        i7 = gte.u(parcel, readInt24);
                    } else if (c19 != 3) {
                        gte.y(parcel, readInt24);
                    } else {
                        arrayList = gte.l(parcel, readInt24, a9e.CREATOR);
                    }
                }
                gte.m(parcel, z32);
                return new fvd(i7, arrayList);
            case 24:
                int z33 = gte.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt25 = parcel.readInt();
                    char c20 = (char) readInt25;
                    if (c20 == 2) {
                        i6 = gte.u(parcel, readInt25);
                    } else if (c20 != 3) {
                        gte.y(parcel, readInt25);
                    } else {
                        kpdVar = (kpd) gte.g(parcel, readInt25, kpd.CREATOR);
                    }
                }
                gte.m(parcel, z33);
                return new ovd(i6, kpdVar);
            case 25:
                int z34 = gte.z(parcel);
                while (parcel.dataPosition() < z34) {
                    int readInt26 = parcel.readInt();
                    char c21 = (char) readInt26;
                    if (c21 == 2) {
                        i5 = gte.u(parcel, readInt26);
                    } else if (c21 != 3) {
                        gte.y(parcel, readInt26);
                    } else {
                        str2 = gte.h(parcel, readInt26);
                    }
                }
                gte.m(parcel, z34);
                return new xvd(i5, str2);
            case 26:
                int z35 = gte.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt27 = parcel.readInt();
                    char c22 = (char) readInt27;
                    if (c22 == 2) {
                        i4 = gte.u(parcel, readInt27);
                    } else if (c22 != 3) {
                        gte.y(parcel, readInt27);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) gte.g(parcel, readInt27, ParcelFileDescriptor.CREATOR);
                    }
                }
                gte.m(parcel, z35);
                return new hwd(i4, parcelFileDescriptor);
            case 27:
                int z36 = gte.z(parcel);
                while (parcel.dataPosition() < z36) {
                    int readInt28 = parcel.readInt();
                    char c23 = (char) readInt28;
                    if (c23 == 2) {
                        i3 = gte.u(parcel, readInt28);
                    } else if (c23 != 3) {
                        gte.y(parcel, readInt28);
                    } else {
                        a9eVar = (a9e) gte.g(parcel, readInt28, a9e.CREATOR);
                    }
                }
                gte.m(parcel, z36);
                return new qwd(i3, a9eVar);
            case 28:
                int z37 = gte.z(parcel);
                while (parcel.dataPosition() < z37) {
                    int readInt29 = parcel.readInt();
                    char c24 = (char) readInt29;
                    if (c24 == 2) {
                        i2 = gte.u(parcel, readInt29);
                    } else if (c24 != 3) {
                        gte.y(parcel, readInt29);
                    } else {
                        str = gte.h(parcel, readInt29);
                    }
                }
                gte.m(parcel, z37);
                return new axd(i2, str);
            default:
                int z38 = gte.z(parcel);
                LatLng latLng2 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt30 = parcel.readInt();
                    char c25 = (char) readInt30;
                    if (c25 == 2) {
                        latLng = (LatLng) gte.g(parcel, readInt30, LatLng.CREATOR);
                    } else if (c25 != 3) {
                        gte.y(parcel, readInt30);
                    } else {
                        latLng2 = (LatLng) gte.g(parcel, readInt30, LatLng.CREATOR);
                    }
                }
                gte.m(parcel, z38);
                return new LatLngBounds(latLng, latLng2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kpd[i];
            case 1:
                return new dqd[i];
            case 2:
                return new oqd[i];
            case 3:
                return new zqd[i];
            case 4:
                return new p6a[i];
            case 5:
                return new lrd[i];
            case 6:
                return new xib[i];
            case 7:
                return new d9c[i];
            case 8:
                return new wrd[i];
            case 9:
                return new bbc[i];
            case 10:
                return new jsd[i];
            case 11:
                return new usd[i];
            case 12:
                return new std[i];
            case 13:
                return new y40[i];
            case 14:
                return new bnd[i];
            case 15:
                return new fnd[i];
            case 16:
                return new oe0[i];
            case 17:
                return new syd[i];
            case 18:
                return new tc1[i];
            case 19:
                return new Status[i];
            case 20:
                return new ytd[i];
            case 21:
                return new lud[i];
            case 22:
                return new uud[i];
            case 23:
                return new fvd[i];
            case 24:
                return new ovd[i];
            case 25:
                return new xvd[i];
            case 26:
                return new hwd[i];
            case 27:
                return new qwd[i];
            case 28:
                return new axd[i];
            default:
                return new LatLngBounds[i];
        }
    }
}
