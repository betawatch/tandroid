// default package

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class s5d implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ s5d(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        int i7 = 0;
        ArrayList arrayList = null;
        LatLng latLng = null;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        PendingIntent pendingIntent = null;
        GoogleSignInAccount googleSignInAccount = null;
        Account account = null;
        ws2 ws2Var = null;
        a8d a8dVar = null;
        ArrayList arrayList2 = null;
        Uri uri = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        Intent intent = null;
        PendingIntent pendingIntent2 = null;
        switch (this.a) {
            case 0:
                int z5 = aye.z(parcel);
                while (parcel.dataPosition() < z5) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = aye.u(parcel, readInt);
                    } else if (c != 2) {
                        aye.y(parcel, readInt);
                    } else {
                        arrayList = aye.l(parcel, readInt, cg7.CREATOR);
                    }
                }
                aye.m(parcel, z5);
                return new ikb(i, arrayList);
            case 1:
                int z6 = aye.z(parcel);
                while (parcel.dataPosition() < z6) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        aye.y(parcel, readInt2);
                    } else {
                        pendingIntent2 = (PendingIntent) aye.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                aye.m(parcel, z6);
                return new xg7(pendingIntent2);
            case 2:
                int z7 = aye.z(parcel);
                int i8 = 0;
                while (parcel.dataPosition() < z7) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i7 = aye.u(parcel, readInt3);
                    } else if (c2 == 2) {
                        i8 = aye.u(parcel, readInt3);
                    } else if (c2 != 3) {
                        aye.y(parcel, readInt3);
                    } else {
                        intent = (Intent) aye.g(parcel, readInt3, Intent.CREATOR);
                    }
                }
                aye.m(parcel, z7);
                return new r5d(i7, i8, intent);
            case 3:
                int z8 = aye.z(parcel);
                long j = 0;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Uri uri2 = null;
                String str7 = null;
                String str8 = null;
                ArrayList arrayList5 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < z8) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str3 = aye.h(parcel, readInt4);
                            break;
                        case 3:
                            str4 = aye.h(parcel, readInt4);
                            break;
                        case 4:
                            str5 = aye.h(parcel, readInt4);
                            break;
                        case 5:
                            str6 = aye.h(parcel, readInt4);
                            break;
                        case 6:
                            uri2 = (Uri) aye.g(parcel, readInt4, Uri.CREATOR);
                            break;
                        case 7:
                            str7 = aye.h(parcel, readInt4);
                            break;
                        case '\b':
                            j = aye.w(parcel, readInt4);
                            break;
                        case '\t':
                            str8 = aye.h(parcel, readInt4);
                            break;
                        case '\n':
                            arrayList5 = aye.l(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 11:
                            str9 = aye.h(parcel, readInt4);
                            break;
                        case '\f':
                            str10 = aye.h(parcel, readInt4);
                            break;
                        default:
                            aye.y(parcel, readInt4);
                            break;
                    }
                }
                aye.m(parcel, z8);
                return new GoogleSignInAccount(str3, str4, str5, str6, uri2, str7, j, str8, arrayList5, str9, str10);
            case 4:
                int z9 = aye.z(parcel);
                long j2 = 0;
                int i9 = 0;
                int i10 = 0;
                boolean z10 = false;
                String str11 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        i9 = aye.u(parcel, readInt5);
                    } else if (c3 == 2) {
                        str11 = aye.h(parcel, readInt5);
                    } else if (c3 == 3) {
                        j2 = aye.w(parcel, readInt5);
                    } else if (c3 == 4) {
                        i10 = aye.u(parcel, readInt5);
                    } else if (c3 != 5) {
                        aye.y(parcel, readInt5);
                    } else {
                        z10 = aye.n(parcel, readInt5);
                    }
                }
                aye.m(parcel, z9);
                return new e6d(i9, i10, j2, str11, z10);
            case 5:
                int z11 = aye.z(parcel);
                boolean z12 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        i6 = aye.u(parcel, readInt6);
                    } else if (c4 != 2) {
                        aye.y(parcel, readInt6);
                    } else {
                        z12 = aye.n(parcel, readInt6);
                    }
                }
                aye.m(parcel, z11);
                return new yg7(i6, z12);
            case 6:
                int z13 = aye.z(parcel);
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        arrayList4 = aye.l(parcel, readInt7, a94.CREATOR);
                    } else if (c5 == 2) {
                        z4 = aye.n(parcel, readInt7);
                    } else if (c5 == 3) {
                        str12 = aye.h(parcel, readInt7);
                    } else if (c5 != 4) {
                        aye.y(parcel, readInt7);
                    } else {
                        str13 = aye.h(parcel, readInt7);
                    }
                }
                aye.m(parcel, z13);
                return new fo(arrayList4, z4, str12, str13);
            case 7:
                int z14 = aye.z(parcel);
                int i11 = 0;
                int i12 = 0;
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < z14) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        strArr = aye.i(parcel, readInt8);
                    } else if (c6 == 2) {
                        cursorWindowArr = (CursorWindow[]) aye.k(parcel, readInt8, CursorWindow.CREATOR);
                    } else if (c6 == 3) {
                        i12 = aye.u(parcel, readInt8);
                    } else if (c6 == 4) {
                        bundle = aye.a(parcel, readInt8);
                    } else if (c6 != 1000) {
                        aye.y(parcel, readInt8);
                    } else {
                        i11 = aye.u(parcel, readInt8);
                    }
                }
                aye.m(parcel, z14);
                DataHolder dataHolder = new DataHolder(i11, strArr, cursorWindowArr, i12, bundle);
                dataHolder.c = new Bundle();
                int i13 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.b;
                    if (i13 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.h = new int[cursorWindowArr2.length];
                        int i14 = 0;
                        for (int i15 = 0; i15 < cursorWindowArr2.length; i15++) {
                            dataHolder.h[i15] = i14;
                            i14 += cursorWindowArr2[i15].getNumRows() - (i14 - cursorWindowArr2[i15].getStartPosition());
                        }
                        dataHolder.n = i14;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr2[i13], i13);
                    i13++;
                }
            case 8:
                int z15 = aye.z(parcel);
                int i16 = 0;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                ArrayList arrayList6 = null;
                Account account2 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            i16 = aye.u(parcel, readInt9);
                            break;
                        case 2:
                            arrayList6 = aye.l(parcel, readInt9, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) aye.g(parcel, readInt9, Account.CREATOR);
                            break;
                        case 4:
                            z16 = aye.n(parcel, readInt9);
                            break;
                        case 5:
                            z17 = aye.n(parcel, readInt9);
                            break;
                        case 6:
                            z18 = aye.n(parcel, readInt9);
                            break;
                        case 7:
                            str14 = aye.h(parcel, readInt9);
                            break;
                        case '\b':
                            str15 = aye.h(parcel, readInt9);
                            break;
                        case '\t':
                            arrayList3 = aye.l(parcel, readInt9, e15.CREATOR);
                            break;
                        case '\n':
                            str16 = aye.h(parcel, readInt9);
                            break;
                        default:
                            aye.y(parcel, readInt9);
                            break;
                    }
                }
                aye.m(parcel, z15);
                return new GoogleSignInOptions(i16, arrayList6, account2, z16, z17, z18, str14, str15, GoogleSignInOptions.c(arrayList3), str16);
            case 9:
                int z19 = aye.z(parcel);
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        i5 = aye.u(parcel, readInt10);
                    } else if (c7 == 2) {
                        uri = (Uri) aye.g(parcel, readInt10, Uri.CREATOR);
                    } else if (c7 == 3) {
                        i17 = aye.u(parcel, readInt10);
                    } else if (c7 != 4) {
                        aye.y(parcel, readInt10);
                    } else {
                        i18 = aye.u(parcel, readInt10);
                    }
                }
                aye.m(parcel, z19);
                return new kxc(i5, uri, i17, i18);
            case 10:
                int z20 = aye.z(parcel);
                String str17 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        arrayList2 = aye.j(parcel, readInt11);
                    } else if (c8 != 2) {
                        aye.y(parcel, readInt11);
                    } else {
                        str17 = aye.h(parcel, readInt11);
                    }
                }
                aye.m(parcel, z20);
                return new l7d(str17, arrayList2);
            case 11:
                int z21 = aye.z(parcel);
                while (parcel.dataPosition() < z21) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i4 = aye.u(parcel, readInt12);
                    } else if (c9 != 2) {
                        aye.y(parcel, readInt12);
                    } else {
                        a8dVar = (a8d) aye.g(parcel, readInt12, a8d.CREATOR);
                    }
                }
                aye.m(parcel, z21);
                return new n7d(i4, a8dVar);
            case 12:
                int z22 = aye.z(parcel);
                c8d c8dVar = null;
                while (parcel.dataPosition() < z22) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 == 1) {
                        i3 = aye.u(parcel, readInt13);
                    } else if (c10 == 2) {
                        ws2Var = (ws2) aye.g(parcel, readInt13, ws2.CREATOR);
                    } else if (c10 != 3) {
                        aye.y(parcel, readInt13);
                    } else {
                        c8dVar = (c8d) aye.g(parcel, readInt13, c8d.CREATOR);
                    }
                }
                aye.m(parcel, z22);
                return new t7d(i3, ws2Var, c8dVar);
            case 13:
                int z23 = aye.z(parcel);
                long j3 = 0;
                long j4 = 0;
                int i19 = -1;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                String str18 = null;
                String str19 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i20 = aye.u(parcel, readInt14);
                            break;
                        case 2:
                            i21 = aye.u(parcel, readInt14);
                            break;
                        case 3:
                            i22 = aye.u(parcel, readInt14);
                            break;
                        case 4:
                            j3 = aye.w(parcel, readInt14);
                            break;
                        case 5:
                            j4 = aye.w(parcel, readInt14);
                            break;
                        case 6:
                            str18 = aye.h(parcel, readInt14);
                            break;
                        case 7:
                            str19 = aye.h(parcel, readInt14);
                            break;
                        case '\b':
                            i23 = aye.u(parcel, readInt14);
                            break;
                        case '\t':
                            i19 = aye.u(parcel, readInt14);
                            break;
                        default:
                            aye.y(parcel, readInt14);
                            break;
                    }
                }
                aye.m(parcel, z23);
                return new cg7(i20, i21, i22, j3, j4, str18, str19, i23, i19);
            case 14:
                int z24 = aye.z(parcel);
                int i24 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 1) {
                        i2 = aye.u(parcel, readInt15);
                    } else if (c11 == 2) {
                        account = (Account) aye.g(parcel, readInt15, Account.CREATOR);
                    } else if (c11 == 3) {
                        i24 = aye.u(parcel, readInt15);
                    } else if (c11 != 4) {
                        aye.y(parcel, readInt15);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) aye.g(parcel, readInt15, GoogleSignInAccount.CREATOR);
                    }
                }
                aye.m(parcel, z24);
                return new a8d(i2, account, i24, googleSignInAccount2);
            case 15:
                int z25 = aye.z(parcel);
                int i25 = 0;
                boolean z26 = false;
                boolean z27 = false;
                IBinder iBinder = null;
                ws2 ws2Var2 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 1) {
                        i25 = aye.u(parcel, readInt16);
                    } else if (c12 == 2) {
                        iBinder = aye.t(parcel, readInt16);
                    } else if (c12 == 3) {
                        ws2Var2 = (ws2) aye.g(parcel, readInt16, ws2.CREATOR);
                    } else if (c12 == 4) {
                        z26 = aye.n(parcel, readInt16);
                    } else if (c12 != 5) {
                        aye.y(parcel, readInt16);
                    } else {
                        z27 = aye.n(parcel, readInt16);
                    }
                }
                aye.m(parcel, z25);
                return new c8d(i25, iBinder, ws2Var2, z26, z27);
            case 16:
                int z28 = aye.z(parcel);
                String str20 = "";
                String str21 = "";
                while (parcel.dataPosition() < z28) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 4) {
                        str20 = aye.h(parcel, readInt17);
                    } else if (c13 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) aye.g(parcel, readInt17, GoogleSignInAccount.CREATOR);
                    } else if (c13 != '\b') {
                        aye.y(parcel, readInt17);
                    } else {
                        str21 = aye.h(parcel, readInt17);
                    }
                }
                aye.m(parcel, z28);
                return new SignInAccount(str20, googleSignInAccount, str21);
            case 17:
                int z29 = aye.z(parcel);
                boolean z30 = false;
                int i26 = 0;
                boolean z31 = false;
                hh0 hh0Var = null;
                eh0 eh0Var = null;
                String str22 = null;
                gh0 gh0Var = null;
                fh0 fh0Var = null;
                while (parcel.dataPosition() < z29) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            hh0Var = (hh0) aye.g(parcel, readInt18, hh0.CREATOR);
                            break;
                        case 2:
                            eh0Var = (eh0) aye.g(parcel, readInt18, eh0.CREATOR);
                            break;
                        case 3:
                            str22 = aye.h(parcel, readInt18);
                            break;
                        case 4:
                            z30 = aye.n(parcel, readInt18);
                            break;
                        case 5:
                            i26 = aye.u(parcel, readInt18);
                            break;
                        case 6:
                            gh0Var = (gh0) aye.g(parcel, readInt18, gh0.CREATOR);
                            break;
                        case 7:
                            fh0Var = (fh0) aye.g(parcel, readInt18, fh0.CREATOR);
                            break;
                        case '\b':
                            z31 = aye.n(parcel, readInt18);
                            break;
                        default:
                            aye.y(parcel, readInt18);
                            break;
                    }
                }
                aye.m(parcel, z29);
                return new ih0(hh0Var, eh0Var, str22, z30, i26, gh0Var, fh0Var, z31);
            case 18:
                int z32 = aye.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        aye.y(parcel, readInt19);
                    } else {
                        pendingIntent = (PendingIntent) aye.g(parcel, readInt19, PendingIntent.CREATOR);
                    }
                }
                aye.m(parcel, z32);
                return new jh0(pendingIntent);
            case 19:
                int z33 = aye.z(parcel);
                boolean z34 = false;
                boolean z35 = false;
                boolean z36 = false;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < z33) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            z34 = aye.n(parcel, readInt20);
                            break;
                        case 2:
                            str23 = aye.h(parcel, readInt20);
                            break;
                        case 3:
                            str24 = aye.h(parcel, readInt20);
                            break;
                        case 4:
                            z35 = aye.n(parcel, readInt20);
                            break;
                        case 5:
                            str25 = aye.h(parcel, readInt20);
                            break;
                        case 6:
                            arrayList7 = aye.j(parcel, readInt20);
                            break;
                        case 7:
                            z36 = aye.n(parcel, readInt20);
                            break;
                        default:
                            aye.y(parcel, readInt20);
                            break;
                    }
                }
                aye.m(parcel, z33);
                return new eh0(z34, str23, str24, z35, str25, arrayList7, z36);
            case 20:
                int z37 = aye.z(parcel);
                while (parcel.dataPosition() < z37) {
                    int readInt21 = parcel.readInt();
                    char c14 = (char) readInt21;
                    if (c14 == 1) {
                        z3 = aye.n(parcel, readInt21);
                    } else if (c14 != 2) {
                        aye.y(parcel, readInt21);
                    } else {
                        str2 = aye.h(parcel, readInt21);
                    }
                }
                aye.m(parcel, z37);
                return new fh0(str2, z3);
            case 21:
                int z38 = aye.z(parcel);
                String str26 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt22 = parcel.readInt();
                    char c15 = (char) readInt22;
                    if (c15 == 1) {
                        z2 = aye.n(parcel, readInt22);
                    } else if (c15 == 2) {
                        bArr = aye.b(parcel, readInt22);
                    } else if (c15 != 3) {
                        aye.y(parcel, readInt22);
                    } else {
                        str26 = aye.h(parcel, readInt22);
                    }
                }
                aye.m(parcel, z38);
                return new gh0(z2, bArr, str26);
            case 22:
                int z39 = aye.z(parcel);
                while (parcel.dataPosition() < z39) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        aye.y(parcel, readInt23);
                    } else {
                        z = aye.n(parcel, readInt23);
                    }
                }
                aye.m(parcel, z39);
                return new hh0(z);
            case 23:
                int z40 = aye.z(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < z40) {
                    int readInt24 = parcel.readInt();
                    char c16 = (char) readInt24;
                    if (c16 == 2) {
                        str = aye.h(parcel, readInt24);
                    } else if (c16 != 5) {
                        aye.y(parcel, readInt24);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) aye.g(parcel, readInt24, GoogleSignInOptions.CREATOR);
                    }
                }
                aye.m(parcel, z40);
                return new SignInConfiguration(str, googleSignInOptions);
            case 24:
                int z41 = aye.z(parcel);
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                Uri uri3 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                tx8 tx8Var = null;
                while (parcel.dataPosition() < z41) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str27 = aye.h(parcel, readInt25);
                            break;
                        case 2:
                            str28 = aye.h(parcel, readInt25);
                            break;
                        case 3:
                            str29 = aye.h(parcel, readInt25);
                            break;
                        case 4:
                            str30 = aye.h(parcel, readInt25);
                            break;
                        case 5:
                            uri3 = (Uri) aye.g(parcel, readInt25, Uri.CREATOR);
                            break;
                        case 6:
                            str31 = aye.h(parcel, readInt25);
                            break;
                        case 7:
                            str32 = aye.h(parcel, readInt25);
                            break;
                        case '\b':
                            str33 = aye.h(parcel, readInt25);
                            break;
                        case '\t':
                            tx8Var = (tx8) aye.g(parcel, readInt25, tx8.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt25);
                            break;
                    }
                }
                aye.m(parcel, z41);
                return new yka(str27, str28, str29, str30, uri3, str31, str32, str33, tx8Var);
            case 25:
                try {
                    return Transport.a(parcel.readString());
                } catch (b5c e) {
                    grb.m(e);
                    return null;
                }
            case 26:
                try {
                    return cy.a(parcel.readString());
                } catch (ay e2) {
                    grb.m(e2);
                    return null;
                }
            case 27:
                int z42 = aye.z(parcel);
                long j5 = 0;
                long j6 = 0;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                ddc ddcVar = null;
                while (parcel.dataPosition() < z42) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 2:
                            str34 = aye.h(parcel, readInt26);
                            break;
                        case 3:
                            str35 = aye.h(parcel, readInt26);
                            break;
                        case 4:
                            j5 = aye.w(parcel, readInt26);
                            break;
                        case 5:
                            str36 = aye.h(parcel, readInt26);
                            break;
                        case 6:
                            str37 = aye.h(parcel, readInt26);
                            break;
                        case 7:
                            str38 = aye.h(parcel, readInt26);
                            break;
                        case '\b':
                            str39 = aye.h(parcel, readInt26);
                            break;
                        case '\t':
                            str40 = aye.h(parcel, readInt26);
                            break;
                        case '\n':
                            str41 = aye.h(parcel, readInt26);
                            break;
                        case 11:
                            j6 = aye.w(parcel, readInt26);
                            break;
                        case '\f':
                            str42 = aye.h(parcel, readInt26);
                            break;
                        case '\r':
                            ddcVar = (ddc) aye.g(parcel, readInt26, ddc.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt26);
                            break;
                    }
                }
                aye.m(parcel, z42);
                return new z9(str34, str35, j5, str36, str37, str38, str39, str40, str41, j6, str42, ddcVar);
            case 28:
                int z43 = aye.z(parcel);
                boolean z44 = false;
                boolean z45 = false;
                String str43 = null;
                String str44 = null;
                IBinder iBinder2 = null;
                po7 po7Var = null;
                while (parcel.dataPosition() < z43) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 2:
                            str43 = aye.h(parcel, readInt27);
                            break;
                        case 3:
                            str44 = aye.h(parcel, readInt27);
                            break;
                        case 4:
                            iBinder2 = aye.t(parcel, readInt27);
                            break;
                        case 5:
                            po7Var = (po7) aye.g(parcel, readInt27, po7.CREATOR);
                            break;
                        case 6:
                            z44 = aye.n(parcel, readInt27);
                            break;
                        case 7:
                            z45 = aye.n(parcel, readInt27);
                            break;
                        default:
                            aye.y(parcel, readInt27);
                            break;
                    }
                }
                aye.m(parcel, z43);
                return new jd1(str43, str44, iBinder2, po7Var, z44, z45);
            default:
                int z46 = aye.z(parcel);
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                while (parcel.dataPosition() < z46) {
                    int readInt28 = parcel.readInt();
                    char c17 = (char) readInt28;
                    if (c17 == 2) {
                        latLng = (LatLng) aye.g(parcel, readInt28, LatLng.CREATOR);
                    } else if (c17 == 3) {
                        f = aye.r(parcel, readInt28);
                    } else if (c17 == 4) {
                        f2 = aye.r(parcel, readInt28);
                    } else if (c17 != 5) {
                        aye.y(parcel, readInt28);
                    } else {
                        f3 = aye.r(parcel, readInt28);
                    }
                }
                aye.m(parcel, z46);
                return new CameraPosition(latLng, f, f2, f3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ikb[i];
            case 1:
                return new xg7[i];
            case 2:
                return new r5d[i];
            case 3:
                return new GoogleSignInAccount[i];
            case 4:
                return new e6d[i];
            case 5:
                return new yg7[i];
            case 6:
                return new fo[i];
            case 7:
                return new DataHolder[i];
            case 8:
                return new GoogleSignInOptions[i];
            case 9:
                return new kxc[i];
            case 10:
                return new l7d[i];
            case 11:
                return new n7d[i];
            case 12:
                return new t7d[i];
            case 13:
                return new cg7[i];
            case 14:
                return new a8d[i];
            case 15:
                return new c8d[i];
            case 16:
                return new SignInAccount[i];
            case 17:
                return new ih0[i];
            case 18:
                return new jh0[i];
            case 19:
                return new eh0[i];
            case 20:
                return new fh0[i];
            case 21:
                return new gh0[i];
            case 22:
                return new hh0[i];
            case 23:
                return new SignInConfiguration[i];
            case 24:
                return new yka[i];
            case 25:
                return new Transport[i];
            case 26:
                return new cy[i];
            case 27:
                return new z9[i];
            case 28:
                return new jd1[i];
            default:
                return new CameraPosition[i];
        }
    }
}
