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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class urd implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ urd(byte b) {
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
        bbe bbeVar = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str2 = null;
        nrd nrdVar = null;
        ArrayList arrayList = null;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        ConnectionConfiguration connectionConfiguration = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        sf0 sf0Var = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String str6 = null;
        ParcelFileDescriptor parcelFileDescriptor3 = null;
        r5 = null;
        JSONObject jSONObject = null;
        rad radVar = null;
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
                int z2 = jve.z(parcel);
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        uri = (Uri) jve.g(parcel, readInt2, Uri.CREATOR);
                    } else if (c == 4) {
                        bundle = jve.a(parcel, readInt2);
                    } else if (c != 5) {
                        jve.y(parcel, readInt2);
                    } else {
                        bArr = jve.b(parcel, readInt2);
                    }
                }
                jve.m(parcel, z2);
                return new nrd(uri, bundle, bArr);
            case 1:
                int z3 = jve.z(parcel);
                int i20 = 0;
                while (parcel.dataPosition() < z3) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 2) {
                        i = jve.u(parcel, readInt3);
                    } else if (c2 != 3) {
                        jve.y(parcel, readInt3);
                    } else {
                        i20 = jve.u(parcel, readInt3);
                    }
                }
                jve.m(parcel, z3);
                return new gsd(i, i20);
            case 2:
                int z4 = jve.z(parcel);
                while (parcel.dataPosition() < z4) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 2) {
                        i19 = jve.u(parcel, readInt4);
                    } else if (c3 != 3) {
                        jve.y(parcel, readInt4);
                    } else {
                        arrayList2 = jve.l(parcel, readInt4, rad.CREATOR);
                    }
                }
                jve.m(parcel, z4);
                return new rsd(i19, arrayList2);
            case 3:
                int z5 = jve.z(parcel);
                while (parcel.dataPosition() < z5) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 2) {
                        i18 = jve.u(parcel, readInt5);
                    } else if (c4 != 3) {
                        jve.y(parcel, readInt5);
                    } else {
                        radVar = (rad) jve.g(parcel, readInt5, rad.CREATOR);
                    }
                }
                jve.m(parcel, z5);
                return new ctd(i18, radVar);
            case 4:
                int z6 = jve.z(parcel);
                gt6 gt6Var = null;
                String str7 = null;
                while (parcel.dataPosition() < z6) {
                    int readInt6 = parcel.readInt();
                    char c5 = (char) readInt6;
                    if (c5 == 2) {
                        gt6Var = (gt6) jve.g(parcel, readInt6, gt6.CREATOR);
                    } else if (c5 != 3) {
                        jve.y(parcel, readInt6);
                    } else {
                        str7 = jve.h(parcel, readInt6);
                    }
                }
                jve.m(parcel, z6);
                Pattern pattern = qe1.a;
                if (str7 != null) {
                    try {
                        jSONObject = new JSONObject(str7);
                    } catch (JSONException unused) {
                    }
                }
                return new r8a(gt6Var, jSONObject);
            case 5:
                int z7 = jve.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 2) {
                        i17 = jve.u(parcel, readInt7);
                    } else if (c6 != 3) {
                        jve.y(parcel, readInt7);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) jve.g(parcel, readInt7, ParcelFileDescriptor.CREATOR);
                    }
                }
                jve.m(parcel, z7);
                return new otd(i17, parcelFileDescriptor3);
            case 6:
                int z8 = jve.z(parcel);
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
                            f = jve.r(parcel, readInt8);
                            break;
                        case 3:
                            i21 = jve.u(parcel, readInt8);
                            break;
                        case 4:
                            i22 = jve.u(parcel, readInt8);
                            break;
                        case 5:
                            i23 = jve.u(parcel, readInt8);
                            break;
                        case 6:
                            i24 = jve.u(parcel, readInt8);
                            break;
                        case 7:
                            i25 = jve.u(parcel, readInt8);
                            break;
                        case '\b':
                            i26 = jve.u(parcel, readInt8);
                            break;
                        case '\t':
                            i27 = jve.u(parcel, readInt8);
                            break;
                        case '\n':
                            str8 = jve.h(parcel, readInt8);
                            break;
                        case 11:
                            i28 = jve.u(parcel, readInt8);
                            break;
                        case '\f':
                            i29 = jve.u(parcel, readInt8);
                            break;
                        case '\r':
                            str9 = jve.h(parcel, readInt8);
                            break;
                        default:
                            jve.y(parcel, readInt8);
                            break;
                    }
                }
                jve.m(parcel, z8);
                return new ykb(f, i21, i22, i23, i24, i25, i26, i27, str8, i28, i29, str9);
            case 7:
                int z9 = jve.z(parcel);
                String str10 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 2) {
                        str6 = jve.h(parcel, readInt9);
                    } else if (c7 != 3) {
                        jve.y(parcel, readInt9);
                    } else {
                        str10 = jve.h(parcel, readInt9);
                    }
                }
                jve.m(parcel, z9);
                return new ebc(str6, str10);
            case 8:
                int z10 = jve.z(parcel);
                while (parcel.dataPosition() < z10) {
                    int readInt10 = parcel.readInt();
                    char c8 = (char) readInt10;
                    if (c8 == 2) {
                        i16 = jve.u(parcel, readInt10);
                    } else if (c8 != 3) {
                        jve.y(parcel, readInt10);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) jve.g(parcel, readInt10, ParcelFileDescriptor.CREATOR);
                    }
                }
                jve.m(parcel, z10);
                return new ztd(i16, parcelFileDescriptor2);
            case 9:
                int z11 = jve.z(parcel);
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt11 = parcel.readInt();
                    char c9 = (char) readInt11;
                    if (c9 == 2) {
                        i15 = jve.u(parcel, readInt11);
                    } else if (c9 == 3) {
                        i30 = jve.u(parcel, readInt11);
                    } else if (c9 != 4) {
                        jve.y(parcel, readInt11);
                    } else {
                        i31 = jve.u(parcel, readInt11);
                    }
                }
                jve.m(parcel, z11);
                return new edc(i15, i30, i31);
            case 10:
                int z12 = jve.z(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt12 = parcel.readInt();
                    char c10 = (char) readInt12;
                    if (c10 == 2) {
                        i14 = jve.u(parcel, readInt12);
                    } else if (c10 != 3) {
                        jve.y(parcel, readInt12);
                    } else {
                        z13 = jve.n(parcel, readInt12);
                    }
                }
                jve.m(parcel, z12);
                return new mud(i14, z13);
            case 11:
                int z14 = jve.z(parcel);
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt13 = parcel.readInt();
                    char c11 = (char) readInt13;
                    if (c11 == 2) {
                        i13 = jve.u(parcel, readInt13);
                    } else if (c11 == 3) {
                        z15 = jve.n(parcel, readInt13);
                    } else if (c11 != 4) {
                        jve.y(parcel, readInt13);
                    } else {
                        z16 = jve.n(parcel, readInt13);
                    }
                }
                jve.m(parcel, z14);
                return new xud(i13, z15, z16);
            case 12:
                int z17 = jve.z(parcel);
                boolean z18 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt14 = parcel.readInt();
                    char c12 = (char) readInt14;
                    if (c12 == 2) {
                        i12 = jve.u(parcel, readInt14);
                    } else if (c12 != 3) {
                        jve.y(parcel, readInt14);
                    } else {
                        z18 = jve.n(parcel, readInt14);
                    }
                }
                jve.m(parcel, z17);
                return new vvd(i12, z18);
            case 13:
                int z19 = jve.z(parcel);
                while (parcel.dataPosition() < z19) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        jve.y(parcel, readInt15);
                    } else {
                        z = jve.n(parcel, readInt15);
                    }
                }
                jve.m(parcel, z19);
                return new y50(z);
            case 14:
                int z20 = jve.z(parcel);
                itd itdVar = qtd.b;
                vtd vtdVar = vtd.e;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                epd epdVar = null;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                while (parcel.dataPosition() < z20) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i32 = jve.u(parcel, readInt16);
                            break;
                        case 2:
                            i33 = jve.u(parcel, readInt16);
                            break;
                        case 3:
                            str11 = jve.h(parcel, readInt16);
                            break;
                        case 4:
                            str12 = jve.h(parcel, readInt16);
                            break;
                        case 5:
                            i34 = jve.u(parcel, readInt16);
                            break;
                        case 6:
                            str13 = jve.h(parcel, readInt16);
                            break;
                        case 7:
                            epdVar = (epd) jve.g(parcel, readInt16, epd.CREATOR);
                            break;
                        case '\b':
                            vtdVar = jve.l(parcel, readInt16, o94.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt16);
                            break;
                    }
                }
                jve.m(parcel, z20);
                return new epd(i32, i33, str11, str12, str13, i34, vtdVar, epdVar);
            case 15:
                int z21 = jve.z(parcel);
                long j = 0;
                le5[] le5VarArr = null;
                int i35 = 0;
                boolean z22 = false;
                while (true) {
                    long j2 = j;
                    while (parcel.dataPosition() < z21) {
                        readInt = parcel.readInt();
                        char c13 = (char) readInt;
                        if (c13 != 2) {
                            if (c13 == 3) {
                                le5VarArr = (le5[]) jve.k(parcel, readInt, le5.CREATOR);
                            } else if (c13 == 4) {
                                i35 = jve.u(parcel, readInt);
                            } else if (c13 != 5) {
                                jve.y(parcel, readInt);
                            } else {
                                z22 = jve.n(parcel, readInt);
                            }
                        }
                    }
                    jve.m(parcel, z21);
                    return new ipd(j2, le5VarArr, i35, z22);
                    j = jve.w(parcel, readInt);
                    break;
                }
                break;
            case 16:
                int z23 = jve.z(parcel);
                String str14 = null;
                String str15 = null;
                tf0[] tf0VarArr = null;
                qf0[] qf0VarArr = null;
                String[] strArr = null;
                lf0[] lf0VarArr = null;
                while (parcel.dataPosition() < z23) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            sf0Var = (sf0) jve.g(parcel, readInt17, sf0.CREATOR);
                            break;
                        case 3:
                            str14 = jve.h(parcel, readInt17);
                            break;
                        case 4:
                            str15 = jve.h(parcel, readInt17);
                            break;
                        case 5:
                            tf0VarArr = (tf0[]) jve.k(parcel, readInt17, tf0.CREATOR);
                            break;
                        case 6:
                            qf0VarArr = (qf0[]) jve.k(parcel, readInt17, qf0.CREATOR);
                            break;
                        case 7:
                            strArr = jve.i(parcel, readInt17);
                            break;
                        case '\b':
                            lf0VarArr = (lf0[]) jve.k(parcel, readInt17, lf0.CREATOR);
                            break;
                        default:
                            jve.y(parcel, readInt17);
                            break;
                    }
                }
                jve.m(parcel, z23);
                of0 of0Var = new of0();
                of0Var.a = sf0Var;
                of0Var.b = str14;
                of0Var.c = str15;
                of0Var.d = tf0VarArr;
                of0Var.e = qf0VarArr;
                of0Var.f = strArr;
                of0Var.h = lf0VarArr;
                return of0Var;
            case 17:
                int z24 = jve.z(parcel);
                float f2 = -1.0f;
                int i36 = 0;
                int i37 = 0;
                boolean z25 = false;
                boolean z26 = false;
                while (parcel.dataPosition() < z24) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            i11 = jve.u(parcel, readInt18);
                            break;
                        case 3:
                            i36 = jve.u(parcel, readInt18);
                            break;
                        case 4:
                            i37 = jve.u(parcel, readInt18);
                            break;
                        case 5:
                            z25 = jve.n(parcel, readInt18);
                            break;
                        case 6:
                            z26 = jve.n(parcel, readInt18);
                            break;
                        case 7:
                            f2 = jve.r(parcel, readInt18);
                            break;
                        default:
                            jve.y(parcel, readInt18);
                            break;
                    }
                }
                jve.m(parcel, z24);
                v0e v0eVar = new v0e();
                v0eVar.a = i11;
                v0eVar.b = i36;
                v0eVar.c = i37;
                v0eVar.d = z25;
                v0eVar.e = z26;
                v0eVar.f = f2;
                return v0eVar;
            case 18:
                int z27 = jve.z(parcel);
                String str16 = null;
                UserAddress userAddress = null;
                int i38 = 0;
                String str17 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt19 = parcel.readInt();
                    char c14 = (char) readInt19;
                    if (c14 == 1) {
                        str5 = jve.h(parcel, readInt19);
                    } else if (c14 == 2) {
                        str17 = jve.h(parcel, readInt19);
                    } else if (c14 == 3) {
                        str16 = jve.h(parcel, readInt19);
                    } else if (c14 == 4) {
                        i38 = jve.u(parcel, readInt19);
                    } else if (c14 != 5) {
                        jve.y(parcel, readInt19);
                    } else {
                        userAddress = (UserAddress) jve.g(parcel, readInt19, UserAddress.CREATOR);
                    }
                }
                jve.m(parcel, z27);
                be1 be1Var = new be1();
                be1Var.a = str5;
                be1Var.b = str17;
                be1Var.c = str16;
                be1Var.d = i38;
                be1Var.e = userAddress;
                return be1Var;
            case 19:
                int z28 = jve.z(parcel);
                PendingIntent pendingIntent = null;
                int i39 = 0;
                ot2 ot2Var = null;
                while (parcel.dataPosition() < z28) {
                    int readInt20 = parcel.readInt();
                    char c15 = (char) readInt20;
                    if (c15 == 1) {
                        i39 = jve.u(parcel, readInt20);
                    } else if (c15 == 2) {
                        str4 = jve.h(parcel, readInt20);
                    } else if (c15 == 3) {
                        pendingIntent = (PendingIntent) jve.g(parcel, readInt20, PendingIntent.CREATOR);
                    } else if (c15 != 4) {
                        jve.y(parcel, readInt20);
                    } else {
                        ot2Var = (ot2) jve.g(parcel, readInt20, ot2.CREATOR);
                    }
                }
                jve.m(parcel, z28);
                return new Status(i39, str4, pendingIntent, ot2Var);
            case 20:
                int z29 = jve.z(parcel);
                while (parcel.dataPosition() < z29) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 2) {
                        i10 = jve.u(parcel, readInt21);
                    } else if (c16 != 3) {
                        jve.y(parcel, readInt21);
                    } else {
                        str3 = jve.h(parcel, readInt21);
                    }
                }
                jve.m(parcel, z29);
                return new bwd(i10, str3);
            case 21:
                int z30 = jve.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt22 = parcel.readInt();
                    char c17 = (char) readInt22;
                    if (c17 == 2) {
                        i9 = jve.u(parcel, readInt22);
                    } else if (c17 != 3) {
                        jve.y(parcel, readInt22);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) jve.g(parcel, readInt22, ConnectionConfiguration.CREATOR);
                    }
                }
                jve.m(parcel, z30);
                return new owd(i9, connectionConfiguration);
            case 22:
                int z31 = jve.z(parcel);
                while (parcel.dataPosition() < z31) {
                    int readInt23 = parcel.readInt();
                    char c18 = (char) readInt23;
                    if (c18 == 2) {
                        i8 = jve.u(parcel, readInt23);
                    } else if (c18 != 3) {
                        jve.y(parcel, readInt23);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) jve.k(parcel, readInt23, ConnectionConfiguration.CREATOR);
                    }
                }
                jve.m(parcel, z31);
                return new xwd(i8, connectionConfigurationArr);
            case 23:
                int z32 = jve.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt24 = parcel.readInt();
                    char c19 = (char) readInt24;
                    if (c19 == 2) {
                        i7 = jve.u(parcel, readInt24);
                    } else if (c19 != 3) {
                        jve.y(parcel, readInt24);
                    } else {
                        arrayList = jve.l(parcel, readInt24, bbe.CREATOR);
                    }
                }
                jve.m(parcel, z32);
                return new ixd(i7, arrayList);
            case 24:
                int z33 = jve.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt25 = parcel.readInt();
                    char c20 = (char) readInt25;
                    if (c20 == 2) {
                        i6 = jve.u(parcel, readInt25);
                    } else if (c20 != 3) {
                        jve.y(parcel, readInt25);
                    } else {
                        nrdVar = (nrd) jve.g(parcel, readInt25, nrd.CREATOR);
                    }
                }
                jve.m(parcel, z33);
                return new rxd(i6, nrdVar);
            case 25:
                int z34 = jve.z(parcel);
                while (parcel.dataPosition() < z34) {
                    int readInt26 = parcel.readInt();
                    char c21 = (char) readInt26;
                    if (c21 == 2) {
                        i5 = jve.u(parcel, readInt26);
                    } else if (c21 != 3) {
                        jve.y(parcel, readInt26);
                    } else {
                        str2 = jve.h(parcel, readInt26);
                    }
                }
                jve.m(parcel, z34);
                return new ayd(i5, str2);
            case 26:
                int z35 = jve.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt27 = parcel.readInt();
                    char c22 = (char) readInt27;
                    if (c22 == 2) {
                        i4 = jve.u(parcel, readInt27);
                    } else if (c22 != 3) {
                        jve.y(parcel, readInt27);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) jve.g(parcel, readInt27, ParcelFileDescriptor.CREATOR);
                    }
                }
                jve.m(parcel, z35);
                return new kyd(i4, parcelFileDescriptor);
            case 27:
                int z36 = jve.z(parcel);
                while (parcel.dataPosition() < z36) {
                    int readInt28 = parcel.readInt();
                    char c23 = (char) readInt28;
                    if (c23 == 2) {
                        i3 = jve.u(parcel, readInt28);
                    } else if (c23 != 3) {
                        jve.y(parcel, readInt28);
                    } else {
                        bbeVar = (bbe) jve.g(parcel, readInt28, bbe.CREATOR);
                    }
                }
                jve.m(parcel, z36);
                return new tyd(i3, bbeVar);
            case 28:
                int z37 = jve.z(parcel);
                while (parcel.dataPosition() < z37) {
                    int readInt29 = parcel.readInt();
                    char c24 = (char) readInt29;
                    if (c24 == 2) {
                        i2 = jve.u(parcel, readInt29);
                    } else if (c24 != 3) {
                        jve.y(parcel, readInt29);
                    } else {
                        str = jve.h(parcel, readInt29);
                    }
                }
                jve.m(parcel, z37);
                return new dzd(i2, str);
            default:
                int z38 = jve.z(parcel);
                LatLng latLng2 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt30 = parcel.readInt();
                    char c25 = (char) readInt30;
                    if (c25 == 2) {
                        latLng = (LatLng) jve.g(parcel, readInt30, LatLng.CREATOR);
                    } else if (c25 != 3) {
                        jve.y(parcel, readInt30);
                    } else {
                        latLng2 = (LatLng) jve.g(parcel, readInt30, LatLng.CREATOR);
                    }
                }
                jve.m(parcel, z38);
                return new LatLngBounds(latLng, latLng2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nrd[i];
            case 1:
                return new gsd[i];
            case 2:
                return new rsd[i];
            case 3:
                return new ctd[i];
            case 4:
                return new r8a[i];
            case 5:
                return new otd[i];
            case 6:
                return new ykb[i];
            case 7:
                return new ebc[i];
            case 8:
                return new ztd[i];
            case 9:
                return new edc[i];
            case 10:
                return new mud[i];
            case 11:
                return new xud[i];
            case 12:
                return new vvd[i];
            case 13:
                return new y50[i];
            case 14:
                return new epd[i];
            case 15:
                return new ipd[i];
            case 16:
                return new of0[i];
            case 17:
                return new v0e[i];
            case 18:
                return new be1[i];
            case 19:
                return new Status[i];
            case 20:
                return new bwd[i];
            case 21:
                return new owd[i];
            case 22:
                return new xwd[i];
            case 23:
                return new ixd[i];
            case 24:
                return new rxd[i];
            case 25:
                return new ayd[i];
            case 26:
                return new kyd[i];
            case 27:
                return new tyd[i];
            case 28:
                return new dzd[i];
            default:
                return new LatLngBounds[i];
        }
    }
}
