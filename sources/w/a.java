package w;

import a8.bf;
import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.e0;
import androidx.fragment.app.k0;
import androidx.fragment.app.n0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.firebase.messaging.o;
import d7.b0;
import d7.h0;
import d7.j;
import d7.k;
import d7.m;
import d7.m0;
import d7.o0;
import d7.p0;
import d7.q0;
import d7.t;
import d7.u;
import d7.v;
import d7.w;
import d7.x;
import d7.y;
import d7.z0;
import j$.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import o7.s0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel inParcel) {
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[][] bArr = null;
        String str4 = null;
        Bundle bundle2 = null;
        c.b bVar = null;
        String str5 = null;
        switch (this.a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                return new Parcelable(inParcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(1);
                    public final int a;
                    public final MediaDescriptionCompat b;

                    {
                        this.a = inParcel.readInt();
                        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i12) {
                        parcel.writeInt(this.a);
                        this.b.writeToParcel(parcel, i12);
                    }
                };
            case 2:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 3:
                return new MediaMetadataCompat(inParcel);
            case 4:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 5:
                return new androidx.activity.result.a(inParcel);
            case 6:
                i.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                i.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 7:
                return new androidx.fragment.app.b(inParcel);
            case 8:
                return new androidx.fragment.app.c(inParcel);
            case 9:
                e0 e0Var = new e0();
                e0Var.a = inParcel.readString();
                e0Var.b = inParcel.readInt();
                return e0Var;
            case 10:
                k0 k0Var = new k0();
                k0Var.e = null;
                k0Var.f = new ArrayList();
                k0Var.h = new ArrayList();
                k0Var.a = inParcel.createStringArrayList();
                k0Var.b = inParcel.createStringArrayList();
                k0Var.c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                k0Var.d = inParcel.readInt();
                k0Var.e = inParcel.readString();
                k0Var.f = inParcel.createStringArrayList();
                k0Var.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                k0Var.n = inParcel.createTypedArrayList(e0.CREATOR);
                return k0Var;
            case 11:
                return new n0(inParcel);
            case 12:
                int z13 = bf.z(inParcel);
                int i12 = 0;
                while (inParcel.dataPosition() < z13) {
                    int readInt = inParcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i10 = bf.u(inParcel, readInt);
                    } else if (c10 == 2) {
                        i12 = bf.u(inParcel, readInt);
                    } else if (c10 != 3) {
                        bf.y(inParcel, readInt);
                    } else {
                        bundle = bf.a(inParcel, readInt);
                    }
                }
                bf.m(inParcel, z13);
                return new b6.a(i10, i12, bundle);
            case 13:
                int z14 = bf.z(inParcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (inParcel.dataPosition() < z14) {
                    int readInt2 = inParcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 2) {
                        str5 = bf.h(inParcel, readInt2);
                    } else if (c11 != 5) {
                        bf.y(inParcel, readInt2);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) bf.g(inParcel, readInt2, GoogleSignInOptions.CREATOR);
                    }
                }
                bf.m(inParcel, z14);
                return new SignInConfiguration(str5, googleSignInOptions);
            case 14:
                try {
                    return Transport.a(inParcel.readString());
                } catch (b7.a e) {
                    throw new RuntimeException(e);
                }
            case 15:
                c.d dVar = new c.d();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i13 = c.c.b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.b)) {
                        c.a aVar = new c.a();
                        aVar.a = readStrongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (c.b) queryLocalInterface;
                    }
                }
                dVar.a = bVar;
                return dVar;
            case 16:
                int z15 = bf.z(inParcel);
                while (inParcel.dataPosition() < z15) {
                    int readInt3 = inParcel.readInt();
                    if (((char) readInt3) != 2) {
                        bf.y(inParcel, readInt3);
                    } else {
                        bundle2 = bf.a(inParcel, readInt3);
                    }
                }
                bf.m(inParcel, z15);
                return new o(bundle2);
            case 17:
                try {
                    return d7.c.a(inParcel.readString());
                } catch (d7.b e10) {
                    throw new RuntimeException(e10);
                }
            case 18:
                int z16 = bf.z(inParcel);
                while (inParcel.dataPosition() < z16) {
                    int readInt4 = inParcel.readInt();
                    if (((char) readInt4) != 1) {
                        bf.y(inParcel, readInt4);
                    } else {
                        z12 = bf.n(inParcel, readInt4);
                    }
                }
                bf.m(inParcel, z16);
                return new z0(z12);
            case 19:
                int z17 = bf.z(inParcel);
                long j10 = 0;
                while (inParcel.dataPosition() < z17) {
                    int readInt5 = inParcel.readInt();
                    if (((char) readInt5) != 1) {
                        bf.y(inParcel, readInt5);
                    } else {
                        j10 = bf.w(inParcel, readInt5);
                    }
                }
                bf.m(inParcel, z17);
                return new m0(j10);
            case 20:
                int z18 = bf.z(inParcel);
                while (inParcel.dataPosition() < z18) {
                    int readInt6 = inParcel.readInt();
                    if (((char) readInt6) != 1) {
                        bf.y(inParcel, readInt6);
                    } else {
                        z11 = bf.n(inParcel, readInt6);
                    }
                }
                bf.m(inParcel, z18);
                return new d7.n0(z11);
            case 21:
                int z19 = bf.z(inParcel);
                while (inParcel.dataPosition() < z19) {
                    int readInt7 = inParcel.readInt();
                    if (((char) readInt7) != 1) {
                        bf.y(inParcel, readInt7);
                    } else {
                        z10 = bf.n(inParcel, readInt7);
                    }
                }
                bf.m(inParcel, z19);
                return new t(z10);
            case 22:
                int z20 = bf.z(inParcel);
                while (inParcel.dataPosition() < z20) {
                    int readInt8 = inParcel.readInt();
                    if (((char) readInt8) != 1) {
                        bf.y(inParcel, readInt8);
                    } else {
                        str4 = bf.h(inParcel, readInt8);
                    }
                }
                bf.m(inParcel, z20);
                return new o0(str4);
            case 23:
                int z21 = bf.z(inParcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (inParcel.dataPosition() < z21) {
                    int readInt9 = inParcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 == 1) {
                        bArr2 = bf.b(inParcel, readInt9);
                    } else if (c12 == 2) {
                        bArr3 = bf.b(inParcel, readInt9);
                    } else if (c12 == 3) {
                        bArr4 = bf.b(inParcel, readInt9);
                    } else if (c12 != 4) {
                        bf.y(inParcel, readInt9);
                    } else {
                        i11 = bf.u(inParcel, readInt9);
                    }
                }
                bf.m(inParcel, z21);
                return new p0(bArr2 == null ? null : s0.s(bArr2.length, bArr2), bArr3 == null ? null : s0.s(bArr3.length, bArr3), bArr4 != null ? s0.s(bArr4.length, bArr4) : null, i11);
            case 24:
                int z22 = bf.z(inParcel);
                while (inParcel.dataPosition() < z22) {
                    int readInt10 = inParcel.readInt();
                    if (((char) readInt10) != 1) {
                        bf.y(inParcel, readInt10);
                    } else {
                        bArr = bf.c(inParcel, readInt10);
                    }
                }
                bf.m(inParcel, z22);
                return new q0(bArr);
            case 25:
                int z23 = bf.z(inParcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArr5 = null;
                ArrayList arrayList = null;
                Double d = null;
                ArrayList arrayList2 = null;
                m mVar = null;
                Integer num = null;
                h0 h0Var = null;
                String str6 = null;
                d7.f fVar = null;
                String str7 = null;
                ResultReceiver resultReceiver = null;
                while (inParcel.dataPosition() < z23) {
                    int readInt11 = inParcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            yVar = (y) bf.g(inParcel, readInt11, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) bf.g(inParcel, readInt11, b0.CREATOR);
                            break;
                        case 4:
                            bArr5 = bf.b(inParcel, readInt11);
                            break;
                        case 5:
                            arrayList = bf.l(inParcel, readInt11, x.CREATOR);
                            break;
                        case 6:
                            int x9 = bf.x(inParcel, readInt11);
                            if (x9 != 0) {
                                bf.A(inParcel, x9, 8);
                                d = Double.valueOf(inParcel.readDouble());
                                break;
                            } else {
                                d = null;
                                break;
                            }
                        case 7:
                            arrayList2 = bf.l(inParcel, readInt11, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) bf.g(inParcel, readInt11, m.CREATOR);
                            break;
                        case '\t':
                            num = bf.v(inParcel, readInt11);
                            break;
                        case '\n':
                            h0Var = (h0) bf.g(inParcel, readInt11, h0.CREATOR);
                            break;
                        case 11:
                            str6 = bf.h(inParcel, readInt11);
                            break;
                        case '\f':
                            fVar = (d7.f) bf.g(inParcel, readInt11, d7.f.CREATOR);
                            break;
                        case '\r':
                            str7 = bf.h(inParcel, readInt11);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) bf.g(inParcel, readInt11, ResultReceiver.CREATOR);
                            break;
                        default:
                            bf.y(inParcel, readInt11);
                            break;
                    }
                }
                bf.m(inParcel, z23);
                return new v(yVar, b0Var, bArr5, arrayList, d, arrayList2, mVar, num, h0Var, str6, fVar, str7, resultReceiver);
            case 26:
                int z24 = bf.z(inParcel);
                String str8 = null;
                String str9 = null;
                byte[] bArr6 = null;
                j jVar = null;
                d7.i iVar = null;
                k kVar = null;
                d7.g gVar = null;
                String str10 = null;
                while (inParcel.dataPosition() < z24) {
                    int readInt12 = inParcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str8 = bf.h(inParcel, readInt12);
                            break;
                        case 2:
                            str9 = bf.h(inParcel, readInt12);
                            break;
                        case 3:
                            bArr6 = bf.b(inParcel, readInt12);
                            break;
                        case 4:
                            jVar = (j) bf.g(inParcel, readInt12, j.CREATOR);
                            break;
                        case 5:
                            iVar = (d7.i) bf.g(inParcel, readInt12, d7.i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) bf.g(inParcel, readInt12, k.CREATOR);
                            break;
                        case 7:
                            gVar = (d7.g) bf.g(inParcel, readInt12, d7.g.CREATOR);
                            break;
                        case '\b':
                            str10 = bf.h(inParcel, readInt12);
                            break;
                        case '\t':
                            bf.h(inParcel, readInt12);
                            break;
                        default:
                            bf.y(inParcel, readInt12);
                            break;
                    }
                }
                bf.m(inParcel, z24);
                return new u(str8, str9, bArr6, jVar, iVar, kVar, gVar, str10);
            case 27:
                int z25 = bf.z(inParcel);
                byte[] bArr7 = null;
                ArrayList arrayList3 = null;
                while (inParcel.dataPosition() < z25) {
                    int readInt13 = inParcel.readInt();
                    char c13 = (char) readInt13;
                    if (c13 == 2) {
                        str3 = bf.h(inParcel, readInt13);
                    } else if (c13 == 3) {
                        bArr7 = bf.b(inParcel, readInt13);
                    } else if (c13 != 4) {
                        bf.y(inParcel, readInt13);
                    } else {
                        arrayList3 = bf.l(inParcel, readInt13, Transport.CREATOR);
                    }
                }
                bf.m(inParcel, z25);
                return new w(str3, bArr7, arrayList3);
            case 28:
                int z26 = bf.z(inParcel);
                Integer num2 = null;
                while (inParcel.dataPosition() < z26) {
                    int readInt14 = inParcel.readInt();
                    char c14 = (char) readInt14;
                    if (c14 == 2) {
                        str2 = bf.h(inParcel, readInt14);
                    } else if (c14 != 3) {
                        bf.y(inParcel, readInt14);
                    } else {
                        num2 = bf.v(inParcel, readInt14);
                    }
                }
                bf.m(inParcel, z26);
                return new x(str2, num2.intValue());
            default:
                int z27 = bf.z(inParcel);
                String str11 = null;
                String str12 = null;
                while (inParcel.dataPosition() < z27) {
                    int readInt15 = inParcel.readInt();
                    char c15 = (char) readInt15;
                    if (c15 == 2) {
                        str = bf.h(inParcel, readInt15);
                    } else if (c15 == 3) {
                        str11 = bf.h(inParcel, readInt15);
                    } else if (c15 != 4) {
                        bf.y(inParcel, readInt15);
                    } else {
                        str12 = bf.h(inParcel, readInt15);
                    }
                }
                bf.m(inParcel, z27);
                return new y(str, str11, str12);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b[i10];
            case 1:
                return new MediaBrowserCompat$MediaItem[i10];
            case 2:
                return new MediaDescriptionCompat[i10];
            case 3:
                return new MediaMetadataCompat[i10];
            case 4:
                return new RatingCompat[i10];
            case 5:
                return new androidx.activity.result.a[i10];
            case 6:
                return new androidx.activity.result.g[i10];
            case 7:
                return new androidx.fragment.app.b[i10];
            case 8:
                return new androidx.fragment.app.c[i10];
            case 9:
                return new e0[i10];
            case 10:
                return new k0[i10];
            case 11:
                return new n0[i10];
            case 12:
                return new b6.a[i10];
            case 13:
                return new SignInConfiguration[i10];
            case 14:
                return new Transport[i10];
            case 15:
                return new c.d[i10];
            case 16:
                return new o[i10];
            case 17:
                return new d7.c[i10];
            case 18:
                return new z0[i10];
            case 19:
                return new m0[i10];
            case 20:
                return new d7.n0[i10];
            case 21:
                return new t[i10];
            case 22:
                return new o0[i10];
            case 23:
                return new p0[i10];
            case 24:
                return new q0[i10];
            case 25:
                return new v[i10];
            case 26:
                return new u[i10];
            case 27:
                return new w[i10];
            case 28:
                return new x[i10];
            default:
                return new y[i10];
        }
    }
}
