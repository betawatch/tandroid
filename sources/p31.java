// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class p31 implements es4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ p31(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d6  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    @Override // es4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        CharSequence charSequence;
        Bitmap bitmap;
        boolean containsKey;
        float f;
        int i;
        String str;
        float f2;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        j99 f3;
        j99 b;
        byte b2 = 18;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                return ((e84) obj).a().getClass().getSimpleName();
            case 1:
                Bundle bundle = (Bundle) obj;
                ?? charSequence2 = bundle.getCharSequence(m43.s);
                if (charSequence2 != 0) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(m43.t);
                    if (parcelableArrayList != null) {
                        charSequence2 = SpannableString.valueOf(charSequence2);
                        int size = parcelableArrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = parcelableArrayList.get(i6);
                            i6++;
                            Bundle bundle2 = (Bundle) obj2;
                            int i7 = bundle2.getInt(o53.a);
                            int i8 = bundle2.getInt(o53.b);
                            int i9 = bundle2.getInt(o53.c);
                            int i10 = bundle2.getInt(o53.d, -1);
                            Bundle bundle3 = bundle2.getBundle(o53.e);
                            if (i10 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(wr9.c);
                                string.getClass();
                                charSequence2.setSpan(new wr9(string, bundle3.getInt(wr9.d)), i7, i8, i9);
                            } else if (i10 == 2) {
                                bundle3.getClass();
                                charSequence2.setSpan(new glb(bundle3.getInt(glb.d), bundle3.getInt(glb.e), bundle3.getInt(glb.f)), i7, i8, i9);
                            } else if (i10 == 3) {
                                charSequence2.setSpan(new ai5(), i7, i8, i9);
                            } else if (i10 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(aoc.b);
                                string2.getClass();
                                charSequence2.setSpan(new aoc(string2), i7, i8, i9);
                            }
                        }
                    }
                } else {
                    charSequence2 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(m43.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(m43.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(m43.w);
                if (bitmap2 == null) {
                    byte[] byteArray = bundle.getByteArray(m43.x);
                    if (byteArray == null) {
                        charSequence = charSequence2;
                        bitmap = null;
                        String str4 = m43.y;
                        containsKey = bundle.containsKey(str4);
                        int i11 = TLObject.FLAG_31;
                        if (containsKey) {
                            String str5 = m43.z;
                            if (bundle.containsKey(str5)) {
                                f = bundle.getFloat(str4);
                                i = bundle.getInt(str5);
                                String str6 = m43.A;
                                int i12 = bundle.containsKey(str6) ? bundle.getInt(str6) : Integer.MIN_VALUE;
                                String str7 = m43.B;
                                float f4 = bundle.containsKey(str7) ? bundle.getFloat(str7) : -3.4028235E38f;
                                String str8 = m43.C;
                                int i13 = bundle.containsKey(str8) ? bundle.getInt(str8) : Integer.MIN_VALUE;
                                str = m43.E;
                                if (bundle.containsKey(str)) {
                                    String str9 = m43.D;
                                    if (bundle.containsKey(str9)) {
                                        f2 = bundle.getFloat(str);
                                        i2 = bundle.getInt(str9);
                                        String str10 = m43.F;
                                        float f5 = !bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                                        String str11 = m43.G;
                                        float f6 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                                        str2 = m43.H;
                                        if (bundle.containsKey(str2)) {
                                            i3 = -16777216;
                                            b3 = 0;
                                        } else {
                                            i3 = bundle.getInt(str2);
                                        }
                                        int i14 = i3;
                                        ?? r30 = bundle.getBoolean(m43.I, false) ? 0 : b3;
                                        str3 = m43.J;
                                        if (bundle.containsKey(str3)) {
                                            i11 = bundle.getInt(str3);
                                        }
                                        int i15 = i11;
                                        String str12 = m43.K;
                                        float f7 = !bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
                                        String str13 = m43.L;
                                        return new m43(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f6, r30, i14, i15, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                                    }
                                }
                                f2 = -3.4028235E38f;
                                i2 = Integer.MIN_VALUE;
                                String str102 = m43.F;
                                if (!bundle.containsKey(str102)) {
                                }
                                String str112 = m43.G;
                                float f62 = bundle.containsKey(str112) ? bundle.getFloat(str112) : -3.4028235E38f;
                                str2 = m43.H;
                                if (bundle.containsKey(str2)) {
                                }
                                int i142 = i3;
                                if (bundle.getBoolean(m43.I, false)) {
                                }
                                str3 = m43.J;
                                if (bundle.containsKey(str3)) {
                                }
                                int i152 = i11;
                                String str122 = m43.K;
                                if (!bundle.containsKey(str122)) {
                                }
                                String str132 = m43.L;
                                return new m43(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f62, r30, i142, i152, f7, bundle.containsKey(str132) ? bundle.getInt(str132) : 0);
                            }
                        }
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                        String str62 = m43.A;
                        if (bundle.containsKey(str62)) {
                        }
                        String str72 = m43.B;
                        if (bundle.containsKey(str72)) {
                        }
                        String str82 = m43.C;
                        if (bundle.containsKey(str82)) {
                        }
                        str = m43.E;
                        if (bundle.containsKey(str)) {
                        }
                        f2 = -3.4028235E38f;
                        i2 = Integer.MIN_VALUE;
                        String str1022 = m43.F;
                        if (!bundle.containsKey(str1022)) {
                        }
                        String str1122 = m43.G;
                        float f622 = bundle.containsKey(str1122) ? bundle.getFloat(str1122) : -3.4028235E38f;
                        str2 = m43.H;
                        if (bundle.containsKey(str2)) {
                        }
                        int i1422 = i3;
                        if (bundle.getBoolean(m43.I, false)) {
                        }
                        str3 = m43.J;
                        if (bundle.containsKey(str3)) {
                        }
                        int i1522 = i11;
                        String str1222 = m43.K;
                        if (!bundle.containsKey(str1222)) {
                        }
                        String str1322 = m43.L;
                        return new m43(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f622, r30, i1422, i1522, f7, bundle.containsKey(str1322) ? bundle.getInt(str1322) : 0);
                    }
                    bitmap2 = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                bitmap = bitmap2;
                charSequence = null;
                String str42 = m43.y;
                containsKey = bundle.containsKey(str42);
                int i112 = TLObject.FLAG_31;
                if (containsKey) {
                }
                f = -3.4028235E38f;
                i = Integer.MIN_VALUE;
                String str622 = m43.A;
                if (bundle.containsKey(str622)) {
                }
                String str722 = m43.B;
                if (bundle.containsKey(str722)) {
                }
                String str822 = m43.C;
                if (bundle.containsKey(str822)) {
                }
                str = m43.E;
                if (bundle.containsKey(str)) {
                }
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
                String str10222 = m43.F;
                if (!bundle.containsKey(str10222)) {
                }
                String str11222 = m43.G;
                float f6222 = bundle.containsKey(str11222) ? bundle.getFloat(str11222) : -3.4028235E38f;
                str2 = m43.H;
                if (bundle.containsKey(str2)) {
                }
                int i14222 = i3;
                if (bundle.getBoolean(m43.I, false)) {
                }
                str3 = m43.J;
                if (bundle.containsKey(str3)) {
                }
                int i15222 = i112;
                String str12222 = m43.K;
                if (!bundle.containsKey(str12222)) {
                }
                String str13222 = m43.L;
                return new m43(charSequence, alignment2, alignment4, bitmap, f, i, i12, f4, i13, i2, f2, f5, f6222, r30, i14222, i15222, f7, bundle.containsKey(str13222) ? bundle.getInt(str13222) : 0);
            case 2:
                return Integer.valueOf(((m43) obj).r);
            case 3:
                long j = ((p43) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 4:
                return po5.u(Integer.valueOf(((wh2) obj).a));
            case 5:
                u1c u1cVar = (u1c) obj;
                u1cVar.getClass();
                Bundle bundle4 = new Bundle();
                String str14 = u1c.e;
                j99 j99Var = u1cVar.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(j99Var.d);
                no5 listIterator = j99Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((t1c) listIterator.next()).c());
                }
                bundle4.putParcelableArrayList(str14, arrayList);
                return bundle4;
            case 6:
                return new ea3((vgb) obj);
            case 7:
                xy5 xy5Var = (xy5) obj;
                return xy5Var.a + ": " + xy5Var.b;
            case 8:
                vh5 vh5Var = (vh5) obj;
                vh5Var.g();
                return po5.q(ose.b(vh5Var.Z.b, new p31(b2)));
            case 9:
                scb scbVar = (scb) obj;
                scbVar.getClass();
                Bundle bundle5 = new Bundle();
                int i16 = scbVar.a;
                if (i16 != 0) {
                    bundle5.putInt(scb.d, i16);
                }
                int i17 = scbVar.b;
                if (i17 != 0) {
                    bundle5.putInt(scb.e, i17);
                }
                int i18 = scbVar.c;
                if (i18 != 0) {
                    bundle5.putInt(scb.f, i18);
                }
                return bundle5;
            case 10:
                et6 et6Var = (et6) obj;
                et6Var.getClass();
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable(et6.h, et6Var.a);
                String str15 = et6Var.b;
                if (str15 != null) {
                    bundle6.putString(et6.i, str15);
                }
                String str16 = et6Var.c;
                if (str16 != null) {
                    bundle6.putString(et6.j, str16);
                }
                int i19 = et6Var.d;
                if (i19 != 0) {
                    bundle6.putInt(et6.k, i19);
                }
                int i20 = et6Var.e;
                if (i20 != 0) {
                    bundle6.putInt(et6.l, i20);
                }
                String str17 = et6Var.f;
                if (str17 != null) {
                    bundle6.putString(et6.m, str17);
                }
                String str18 = et6Var.g;
                if (str18 != null) {
                    bundle6.putString(et6.n, str18);
                }
                return bundle6;
            case 11:
                Bundle bundle7 = (Bundle) obj;
                Uri uri = (Uri) bundle7.getParcelable(et6.h);
                uri.getClass();
                String string3 = bundle7.getString(et6.i);
                String string4 = bundle7.getString(et6.j);
                int i21 = bundle7.getInt(et6.k, 0);
                int i22 = bundle7.getInt(et6.l, 0);
                String string5 = bundle7.getString(et6.m);
                String string6 = bundle7.getString(et6.n);
                t95 t95Var = new t95();
                t95Var.c = uri;
                t95Var.d = eg7.n(string3);
                t95Var.e = string4;
                t95Var.a = i21;
                t95Var.b = i22;
                t95Var.f = string5;
                t95Var.g = string6;
                return new et6(t95Var);
            case 12:
                String str19 = (String) obj;
                yj1 yj1Var = o07.g;
                yj1Var.getClass();
                int length = str19.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (yj1Var.b(str19.charAt(length))) {
                            length--;
                        } else {
                            b3 = 0;
                        }
                    }
                }
                if (b3 != 0 && !str19.isEmpty()) {
                    return str19;
                }
                StringBuilder sb = new StringBuilder(str19.length() + 16);
                sb.append('\"');
                while (r6 < str19.length()) {
                    char charAt = str19.charAt(r6);
                    if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(charAt);
                    r6++;
                }
                sb.append('\"');
                return sb.toString();
            case 13:
                Collection collection = (Collection) obj;
                int i23 = zo5.d;
                if (collection instanceof zo5) {
                    return (zo5) collection;
                }
                boolean z = collection instanceof zo5;
                if (z) {
                    p99 p99Var = (p99) ((zo5) collection);
                    yo5 yo5Var = p99Var.h;
                    if (yo5Var == null) {
                        yo5Var = new yo5(p99Var, b3);
                        p99Var.h = yo5Var;
                    }
                    i4 = yo5Var.size();
                } else {
                    i4 = 11;
                }
                xo5 xo5Var = new xo5();
                xo5Var.b = false;
                wq7 wq7Var = new wq7();
                wq7Var.d(i4);
                xo5Var.a = wq7Var;
                if (z) {
                    zo5 zo5Var = (zo5) collection;
                    wq7 wq7Var2 = zo5Var instanceof p99 ? ((p99) zo5Var).e : null;
                    if (wq7Var2 != null) {
                        wq7Var.a(Math.max(wq7Var.c, wq7Var2.c));
                        if (wq7Var2.c != 0) {
                            i5 = -1;
                            while (i5 >= 0) {
                                yve.j(i5, wq7Var2.c);
                                Object obj3 = wq7Var2.a[i5];
                                yve.j(i5, wq7Var2.c);
                                xo5Var.c(wq7Var2.b[i5], obj3);
                                i5++;
                                if (i5 >= wq7Var2.c) {
                                }
                            }
                        }
                        i5 = -1;
                    } else {
                        bp5 o = zo5Var.o();
                        wq7 wq7Var3 = xo5Var.a;
                        wq7Var3.a(Math.max(wq7Var3.c, o.size()));
                        for (vq7 vq7Var : zo5Var.o()) {
                            xo5Var.c(vq7Var.a(), vq7Var.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        xo5Var.a(it.next());
                    }
                }
                Objects.requireNonNull(xo5Var.a);
                if (xo5Var.a.c == 0) {
                    return p99.n;
                }
                xo5Var.b = true;
                return new p99(xo5Var.a);
            case 14:
                return Long.valueOf(((p43) obj).b);
            case 15:
                return Long.valueOf(((p43) obj).c);
            case 16:
                return po5.q(ose.b(((xt6) obj).r().b, new p31(b2)));
            case 17:
                Bundle bundle8 = (Bundle) obj;
                ko4 ko4Var = ko4.Z;
                jo4 jo4Var = new jo4();
                if (bundle8 != null) {
                    ClassLoader classLoader = e31.class.getClassLoader();
                    String str20 = gcc.a;
                    bundle8.setClassLoader(classLoader);
                }
                String string7 = bundle8.getString(ko4.a0);
                String str21 = ko4Var.a;
                if (string7 == null) {
                    string7 = str21;
                }
                jo4Var.a = string7;
                String string8 = bundle8.getString(ko4.b0);
                String str22 = ko4Var.b;
                if (string8 == null) {
                    string8 = str22;
                }
                jo4Var.b = string8;
                ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(ko4.F0);
                if (parcelableArrayList2 == null) {
                    no5 no5Var = po5.b;
                    f3 = j99.e;
                } else {
                    mo5 p = po5.p();
                    for (int i24 = 0; i24 < parcelableArrayList2.size(); i24++) {
                        Bundle bundle9 = (Bundle) parcelableArrayList2.get(i24);
                        bundle9.getClass();
                        String string9 = bundle9.getString(xy5.c);
                        String string10 = bundle9.getString(xy5.d);
                        string10.getClass();
                        p.c(new xy5(string9, string10));
                    }
                    f3 = p.f();
                }
                jo4Var.c = po5.q(f3);
                String string11 = bundle8.getString(ko4.c0);
                String str23 = ko4Var.d;
                if (string11 == null) {
                    string11 = str23;
                }
                jo4Var.d = string11;
                jo4Var.e = bundle8.getInt(ko4.d0, ko4Var.e);
                jo4Var.f = bundle8.getInt(ko4.e0, ko4Var.f);
                jo4Var.g = bundle8.getFloat(ko4.O0, ko4Var.g);
                jo4Var.h = bundle8.getInt(ko4.G0, ko4Var.h);
                jo4Var.i = bundle8.getInt(ko4.f0, ko4Var.i);
                jo4Var.j = bundle8.getInt(ko4.g0, ko4Var.j);
                String string12 = bundle8.getString(ko4.h0);
                String str24 = ko4Var.l;
                if (string12 == null) {
                    string12 = str24;
                }
                jo4Var.k = string12;
                String string13 = bundle8.getString(ko4.K0);
                String str25 = ko4Var.n;
                if (string13 == null) {
                    string13 = str25;
                }
                jo4Var.m = string13;
                String string14 = bundle8.getString(ko4.i0);
                String str26 = ko4Var.s;
                if (string14 == null) {
                    string14 = str26;
                }
                jo4Var.r = eg7.n(string14);
                String string15 = bundle8.getString(ko4.j0);
                String str27 = ko4Var.t;
                if (string15 == null) {
                    string15 = str27;
                }
                jo4Var.s = eg7.n(string15);
                jo4Var.t = bundle8.getInt(ko4.k0, ko4Var.u);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    byte[] byteArray2 = bundle8.getByteArray(ko4.l0 + "_" + Integer.toString(r6, 36));
                    if (byteArray2 == null) {
                        float f8 = bundle8.getFloat(ko4.q0, ko4Var.F);
                        if (f8 <= 0.0f) {
                            f8 = -1.0f;
                        }
                        jo4Var.v = arrayList2;
                        jo4Var.w = (hr3) bundle8.getParcelable(ko4.m0);
                        jo4Var.x = bundle8.getLong(ko4.n0, ko4Var.y);
                        jo4Var.z = bundle8.getInt(ko4.o0, ko4Var.A);
                        jo4Var.A = bundle8.getInt(ko4.p0, ko4Var.B);
                        jo4Var.B = bundle8.getInt(ko4.N0, ko4Var.C);
                        jo4Var.C = bundle8.getInt(ko4.I0, ko4Var.D);
                        jo4Var.D = bundle8.getInt(ko4.J0, ko4Var.E);
                        jo4Var.a(f8);
                        jo4Var.F = bundle8.getInt(ko4.r0, ko4Var.G);
                        jo4Var.G = bundle8.getBoolean(ko4.M0, ko4Var.H);
                        jo4Var.H = bundle8.getFloat(ko4.s0, ko4Var.I);
                        jo4Var.I = bundle8.getByteArray(ko4.t0);
                        jo4Var.J = bundle8.getInt(ko4.u0, ko4Var.K);
                        jo4Var.L = bundle8.getInt(ko4.H0, ko4Var.M);
                        Bundle bundle10 = bundle8.getBundle(ko4.v0);
                        if (bundle10 != null) {
                            jo4Var.K = new bm2(bundle10.getInt(bm2.i, -1), bundle10.getInt(bm2.j, -1), bundle10.getInt(bm2.k, -1), bundle10.getByteArray(bm2.l), bundle10.getInt(bm2.m, -1), bundle10.getInt(bm2.n, -1));
                        }
                        jo4Var.M = bundle8.getInt(ko4.w0, ko4Var.N);
                        jo4Var.N = bundle8.getInt(ko4.L0, ko4Var.O);
                        jo4Var.O = bundle8.getInt(ko4.x0, ko4Var.P);
                        jo4Var.P = bundle8.getInt(ko4.y0, ko4Var.Q);
                        jo4Var.Q = bundle8.getInt(ko4.z0, ko4Var.R);
                        jo4Var.R = bundle8.getInt(ko4.A0, ko4Var.S);
                        jo4Var.S = bundle8.getInt(ko4.B0, ko4Var.T);
                        jo4Var.U = bundle8.getInt(ko4.D0, ko4Var.V);
                        jo4Var.V = bundle8.getInt(ko4.E0, ko4Var.W);
                        jo4Var.W = bundle8.getInt(ko4.C0, ko4Var.X);
                        return new ko4(jo4Var);
                    }
                    arrayList2.add(byteArray2);
                    r6++;
                }
            case 18:
                return Integer.valueOf(((t1c) obj).c);
            case 19:
                Bundle bundle11 = (Bundle) obj;
                Bundle bundle12 = bundle11.getBundle(z1c.c);
                bundle12.getClass();
                ArrayList parcelableArrayList3 = bundle12.getParcelableArrayList(t1c.f);
                if (parcelableArrayList3 == null) {
                    no5 no5Var2 = po5.b;
                    b = j99.e;
                } else {
                    b = e31.b(new p31((byte) 17), parcelableArrayList3);
                }
                t1c t1cVar = new t1c(bundle12.getString(t1c.g, ""), (ko4[]) b.toArray(new ko4[0]));
                int[] intArray = bundle11.getIntArray(z1c.d);
                intArray.getClass();
                return new z1c(t1cVar, ype.a(intArray));
            default:
                e2c e2cVar = (e2c) obj;
                e2cVar.getClass();
                Bundle bundle13 = new Bundle();
                bundle13.putBundle(e2c.f, e2cVar.b.c());
                bundle13.putIntArray(e2c.g, e2cVar.d);
                bundle13.putBooleanArray(e2c.h, e2cVar.e);
                bundle13.putBoolean(e2c.i, e2cVar.c);
                return bundle13;
        }
    }
}
