package u2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import bi.u6;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.mh1;
import wh.g4;
import xh.x3;
import y9.e2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements d9.e, q3.g, Continuation, c2, GenericProvider, q9.d, Vector.TLDeserializer, z9.b {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ FingerprintManager c(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        Set x10 = u6Var.x(xa.a.class);
        xa.c cVar = xa.c.c;
        if (cVar == null) {
            synchronized (xa.c.class) {
                try {
                    cVar = xa.c.c;
                    if (cVar == null) {
                        cVar = new xa.c(0);
                        xa.c.c = cVar;
                    }
                } finally {
                }
            }
        }
        return new xa.b(x10, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z9.b
    public Object a(JsonReader jsonReader) {
        String str;
        char c10;
        char c11;
        char c12;
        char c13;
        String str2 = null;
        Long l4 = null;
        String str3 = null;
        String str4 = null;
        int i10 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 25:
                jsonReader.beginObject();
                String str5 = null;
                String str6 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            str5 = jsonReader.nextString();
                            if (str5 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                        case 1:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null arch");
                            }
                            str2 = nextString;
                            break;
                        case 2:
                            str6 = jsonReader.nextString();
                            if (str6 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                str = str2 == null ? " arch" : "";
                if (str5 == null) {
                    str = str.concat(" libraryName");
                }
                if (str6 == null) {
                    str = r6.t(str, " buildId");
                }
                if (str.isEmpty()) {
                    return new y9.c0(str2, str5, str6);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            case 26:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("filename")) {
                        String nextString2 = jsonReader.nextString();
                        if (nextString2 == null) {
                            throw new NullPointerException("Null filename");
                        }
                        str4 = nextString2;
                    } else if (nextName2.equals("contents")) {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                str = str4 == null ? " filename" : "";
                if (bArr == null) {
                    str = str.concat(" contents");
                }
                if (str.isEmpty()) {
                    return new y9.f0(str4, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            case 27:
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(13, (boolean) (objArr == true ? 1 : 0));
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1536268810:
                            if (nextName3.equals("parameterKey")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1027290370:
                            if (nextName3.equals("templateVersion")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1098747284:
                            if (nextName3.equals("rolloutVariant")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1124454216:
                            if (nextName3.equals("parameterValue")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 == null) {
                                throw new NullPointerException("Null parameterKey");
                            }
                            sVar.b = nextString3;
                            break;
                        case 1:
                            sVar.e = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str7 = null;
                            String str8 = null;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (nextName4.equals("variantId")) {
                                    str8 = jsonReader.nextString();
                                    if (str8 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                } else if (nextName4.equals("rolloutId")) {
                                    str7 = jsonReader.nextString();
                                    if (str7 == null) {
                                        throw new NullPointerException("Null rolloutId");
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            String str9 = str7 == null ? " rolloutId" : "";
                            if (str8 == null) {
                                str9 = str9.concat(" variantId");
                            }
                            if (!str9.isEmpty()) {
                                throw new IllegalStateException("Missing required properties:".concat(str9));
                            }
                            sVar.c = new y9.x0(str7, str8);
                            break;
                        case 3:
                            String nextString4 = jsonReader.nextString();
                            if (nextString4 == null) {
                                throw new NullPointerException("Null parameterValue");
                            }
                            sVar.d = nextString4;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return sVar.b();
            case 28:
                jsonReader.beginObject();
                Integer num = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    switch (nextName5.hashCode()) {
                        case -1266514778:
                            if (nextName5.equals("frames")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3373707:
                            if (nextName5.equals("name")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 2125650548:
                            if (nextName5.equals("importance")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            list = z9.c.d(jsonReader, new z9.a(i10));
                            if (list == null) {
                                throw new NullPointerException("Null frames");
                            }
                            continue;
                        case 1:
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case 2:
                            num = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String str10 = str3 != null ? "" : " name";
                if (num == null) {
                    str10 = str10.concat(" importance");
                }
                if (list == null) {
                    str10 = r6.t(str10, " frames");
                }
                if (str10.isEmpty()) {
                    return new y9.r0(str3, num.intValue(), list);
                }
                throw new IllegalStateException("Missing required properties:".concat(str10));
            default:
                jsonReader.beginObject();
                Long l10 = null;
                String str11 = null;
                String str12 = null;
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    switch (nextName6.hashCode()) {
                        case 3373707:
                            if (nextName6.equals("name")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3530753:
                            if (nextName6.equals("size")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 3601339:
                            if (nextName6.equals("uuid")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 1153765347:
                            if (nextName6.equals("baseAddress")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                            String nextString5 = jsonReader.nextString();
                            if (nextString5 == null) {
                                throw new NullPointerException("Null name");
                            }
                            str11 = nextString5;
                            break;
                        case 1:
                            l10 = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            str12 = new String(Base64.decode(jsonReader.nextString(), 2), e2.a);
                            break;
                        case 3:
                            l4 = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                str = l4 == null ? " baseAddress" : "";
                if (l10 == null) {
                    str = str.concat(" size");
                }
                if (str11 == null) {
                    str = r6.t(str, " name");
                }
                if (str.isEmpty()) {
                    return new y9.o0(str11, l4.longValue(), l10.longValue(), str12);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0137  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v31, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // d9.e, i5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        String str;
        float f7;
        int i10;
        String str2;
        int i11;
        float f10;
        String str3;
        boolean z10;
        int i12;
        switch (this.a) {
            case 0:
                return ((c3.o) obj).c().getClass().getSimpleName();
            case 1:
                return e9.i0.v(e9.q.w(((e0) obj).q().b, new c(2)));
            case 2:
                return Integer.valueOf(((b2.l1) obj).c);
            case 9:
                return Long.valueOf(((z3.a) obj).b);
            case 10:
                return Long.valueOf(((z3.a) obj).c);
            case 11:
                return (w3.o) obj;
            case 18:
                q1 q1Var = (q1) obj;
                q1Var.getClass();
                Bundle bundle = new Bundle();
                String str4 = q1.e;
                e9.a1 a1Var = q1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(a1Var.d);
                e9.g0 listIterator = a1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((b2.l1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str4, arrayList);
                return bundle;
            case 23:
                Bundle bundle2 = (Bundle) obj;
                ?? charSequence2 = bundle2.getCharSequence(d2.b.s);
                int i13 = 1;
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList(d2.b.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = parcelableArrayList.get(i14);
                            i14++;
                            Bundle bundle3 = (Bundle) obj2;
                            int i15 = bundle3.getInt(d2.d.a);
                            int i16 = bundle3.getInt(d2.d.b);
                            int i17 = bundle3.getInt(d2.d.c);
                            int i18 = bundle3.getInt(d2.d.d, -1);
                            Bundle bundle4 = bundle3.getBundle(d2.d.e);
                            if (i18 == i13) {
                                bundle4.getClass();
                                String string = bundle4.getString(d2.f.c);
                                string.getClass();
                                charSequence2.setSpan(new d2.f(string, bundle4.getInt(d2.f.d)), i15, i16, i17);
                            } else if (i18 == 2) {
                                bundle4.getClass();
                                charSequence2.setSpan(new d2.g(bundle4.getInt(d2.g.d), bundle4.getInt(d2.g.e), bundle4.getInt(d2.g.f)), i15, i16, i17);
                            } else if (i18 == 3) {
                                charSequence2.setSpan(new d2.e(), i15, i16, i17);
                            } else if (i18 == 4) {
                                bundle4.getClass();
                                String string2 = bundle4.getString(d2.h.b);
                                string2.getClass();
                                charSequence2.setSpan(new d2.h(string2), i15, i16, i17);
                            }
                            i13 = 1;
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle2.getSerializable(d2.b.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle2.getSerializable(d2.b.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle2.getParcelable(d2.b.w);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    byte[] byteArray = bundle2.getByteArray(d2.b.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        str = d2.b.y;
                        if (bundle2.containsKey(str)) {
                            String str5 = d2.b.z;
                            if (bundle2.containsKey(str5)) {
                                f7 = bundle2.getFloat(str);
                                i10 = bundle2.getInt(str5);
                                String str6 = d2.b.A;
                                int i19 = bundle2.containsKey(str6) ? bundle2.getInt(str6) : TLObject.FLAG_31;
                                String str7 = d2.b.B;
                                float f11 = bundle2.containsKey(str7) ? bundle2.getFloat(str7) : -3.4028235E38f;
                                String str8 = d2.b.C;
                                int i20 = bundle2.containsKey(str8) ? bundle2.getInt(str8) : TLObject.FLAG_31;
                                str2 = d2.b.E;
                                if (bundle2.containsKey(str2)) {
                                    String str9 = d2.b.D;
                                    if (bundle2.containsKey(str9)) {
                                        f10 = bundle2.getFloat(str2);
                                        i11 = bundle2.getInt(str9);
                                        String str10 = d2.b.F;
                                        float f12 = !bundle2.containsKey(str10) ? bundle2.getFloat(str10) : -3.4028235E38f;
                                        String str11 = d2.b.G;
                                        float f13 = !bundle2.containsKey(str11) ? bundle2.getFloat(str11) : -3.4028235E38f;
                                        str3 = d2.b.H;
                                        if (bundle2.containsKey(str3)) {
                                            z10 = false;
                                            i12 = -16777216;
                                        } else {
                                            i12 = bundle2.getInt(str3);
                                            z10 = true;
                                        }
                                        boolean z11 = bundle2.getBoolean(d2.b.I, false) ? false : z10;
                                        String str12 = d2.b.J;
                                        int i21 = !bundle2.containsKey(str12) ? bundle2.getInt(str12) : TLObject.FLAG_31;
                                        String str13 = d2.b.K;
                                        float f14 = !bundle2.containsKey(str13) ? bundle2.getFloat(str13) : 0.0f;
                                        String str14 = d2.b.L;
                                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle2.containsKey(str14) ? bundle2.getInt(str14) : 0);
                                    }
                                }
                                i11 = TLObject.FLAG_31;
                                f10 = -3.4028235E38f;
                                String str102 = d2.b.F;
                                if (!bundle2.containsKey(str102)) {
                                }
                                String str112 = d2.b.G;
                                if (!bundle2.containsKey(str112)) {
                                }
                                str3 = d2.b.H;
                                if (bundle2.containsKey(str3)) {
                                }
                                if (bundle2.getBoolean(d2.b.I, false)) {
                                }
                                String str122 = d2.b.J;
                                if (!bundle2.containsKey(str122)) {
                                }
                                String str132 = d2.b.K;
                                if (!bundle2.containsKey(str132)) {
                                }
                                String str142 = d2.b.L;
                                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle2.containsKey(str142) ? bundle2.getInt(str142) : 0);
                            }
                        }
                        f7 = -3.4028235E38f;
                        i10 = TLObject.FLAG_31;
                        String str62 = d2.b.A;
                        if (bundle2.containsKey(str62)) {
                        }
                        String str72 = d2.b.B;
                        if (bundle2.containsKey(str72)) {
                        }
                        String str82 = d2.b.C;
                        if (bundle2.containsKey(str82)) {
                        }
                        str2 = d2.b.E;
                        if (bundle2.containsKey(str2)) {
                        }
                        i11 = TLObject.FLAG_31;
                        f10 = -3.4028235E38f;
                        String str1022 = d2.b.F;
                        if (!bundle2.containsKey(str1022)) {
                        }
                        String str1122 = d2.b.G;
                        if (!bundle2.containsKey(str1122)) {
                        }
                        str3 = d2.b.H;
                        if (bundle2.containsKey(str3)) {
                        }
                        if (bundle2.getBoolean(d2.b.I, false)) {
                        }
                        String str1222 = d2.b.J;
                        if (!bundle2.containsKey(str1222)) {
                        }
                        String str1322 = d2.b.K;
                        if (!bundle2.containsKey(str1322)) {
                        }
                        String str1422 = d2.b.L;
                        return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle2.containsKey(str1422) ? bundle2.getInt(str1422) : 0);
                    }
                    bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                charSequence = null;
                str = d2.b.y;
                if (bundle2.containsKey(str)) {
                }
                f7 = -3.4028235E38f;
                i10 = TLObject.FLAG_31;
                String str622 = d2.b.A;
                if (bundle2.containsKey(str622)) {
                }
                String str722 = d2.b.B;
                if (bundle2.containsKey(str722)) {
                }
                String str822 = d2.b.C;
                if (bundle2.containsKey(str822)) {
                }
                str2 = d2.b.E;
                if (bundle2.containsKey(str2)) {
                }
                i11 = TLObject.FLAG_31;
                f10 = -3.4028235E38f;
                String str10222 = d2.b.F;
                if (!bundle2.containsKey(str10222)) {
                }
                String str11222 = d2.b.G;
                if (!bundle2.containsKey(str11222)) {
                }
                str3 = d2.b.H;
                if (bundle2.containsKey(str3)) {
                }
                if (bundle2.getBoolean(d2.b.I, false)) {
                }
                String str12222 = d2.b.J;
                if (!bundle2.containsKey(str12222)) {
                }
                String str13222 = d2.b.K;
                if (!bundle2.containsKey(str13222)) {
                }
                String str14222 = d2.b.L;
                return new d2.b(charSequence, alignment2, alignment4, bitmap, f7, i10, i19, f11, i20, i11, f10, f12, f13, z11, i12, i21, f14, !bundle2.containsKey(str14222) ? bundle2.getInt(str14222) : 0);
            default:
                long j3 = ((z3.a) obj).b;
                if (j3 == -9223372036854775807L) {
                    j3 = 0;
                }
                return Long.valueOf(j3);
        }
    }

    @Override // q3.g
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 15:
                d2Var.dismiss();
                break;
            case 16:
                d2Var.dismiss();
                break;
            case 21:
                x3.d2(new mh1(6, null));
                break;
            default:
                int i11 = x3.q1;
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = g4.k0;
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
            t9.b bVar2 = t9.b.a;
            bVar2.b(str);
            File file = bVar.c;
            z10 = true;
            if (file.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
    }
}
