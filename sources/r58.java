// default package

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r58 {
    public static volatile r58 j;
    public final boolean a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final Object e;
    public Object f;
    public Serializable g;
    public Serializable h;
    public Serializable i;

    public r58() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.a = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            inputStream = a.b.getAssets().open("PhoneFormats.dat");
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.e = byteArray;
                ByteBuffer wrap = ByteBuffer.wrap(byteArray);
                this.f = wrap;
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                try {
                    inputStream.close();
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                this.g = Locale.getDefault().getCountry().toLowerCase();
                this.b = new HashMap(nm7.d4);
                this.c = new HashMap(nm7.d4);
                this.d = new HashMap(10);
                this.i = new HashMap(nm7.d4);
                int k = k(0);
                int i = 4;
                int i2 = (k * 12) + 4;
                for (int i3 = 0; i3 < k; i3++) {
                    String l = l(i);
                    String l2 = l(i + 4);
                    int k2 = k(i + 8) + i2;
                    i += 12;
                    if (l2.equals((String) this.g)) {
                        this.h = l;
                    }
                    ((HashMap) this.i).put(l2, l);
                    this.b.put(l, Integer.valueOf(k2));
                    ArrayList arrayList = (ArrayList) this.c.get(l);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.c.put(l, arrayList);
                    }
                    arrayList.add(l2);
                }
                String str = (String) this.h;
                if (str != null) {
                    a(str);
                }
                this.a = true;
            } catch (Exception e4) {
                e = e4;
                byteArrayOutputStream2 = byteArrayOutputStream;
                e.printStackTrace();
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e5) {
                        fc4.g(e5, true);
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e6) {
                        fc4.g(e6, true);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e7) {
                        fc4.g(e7, true);
                    }
                }
                if (inputStream == null) {
                    throw th;
                }
                try {
                    inputStream.close();
                    throw th;
                } catch (Exception e8) {
                    fc4.g(e8, true);
                    throw th;
                }
            }
        } catch (Exception e9) {
            e = e9;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static r58 f() {
        r58 r58Var;
        r58 r58Var2 = j;
        if (r58Var2 != null) {
            return r58Var2;
        }
        synchronized (r58.class) {
            r58Var = j;
            if (r58Var == null) {
                r58Var = new r58();
                j = r58Var;
            }
        }
        return r58Var;
    }

    public static String h(String str, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = z ? "0123456789+" : "0123456789";
        for (int length = sb.length() - 1; length >= 0; length--) {
            if (!str2.contains(sb.substring(length, length + 1))) {
                sb.deleteCharAt(length);
            }
        }
        return sb.toString();
    }

    public static void i(String str, String str2, HashMap hashMap) {
        if (!hashMap.containsKey(str) || str2.equals(hashMap.get(str))) {
            hashMap.put(str, str2);
            return;
        }
        throw bx7.b("The group ID " + str + " is associated with more than one pathway from variants", null);
    }

    public final wa1 a(String str) {
        Integer num;
        r58 r58Var = this;
        HashMap hashMap = r58Var.d;
        wa1 wa1Var = (wa1) hashMap.get(str);
        if (wa1Var != null || (num = (Integer) r58Var.b.get(str)) == null) {
            return wa1Var;
        }
        byte[] bArr = (byte[]) r58Var.e;
        int intValue = num.intValue();
        wa1 wa1Var2 = new wa1();
        wa1Var2.a = "";
        wa1Var2.b = new ArrayList();
        wa1Var2.c = new ArrayList();
        wa1Var2.d = new ArrayList();
        wa1Var2.a = str;
        hashMap.put(str, wa1Var2);
        short j2 = r58Var.j(intValue);
        short j3 = r58Var.j(intValue + 4);
        short j4 = r58Var.j(intValue + 8);
        int i = intValue + 12;
        ArrayList arrayList = new ArrayList(5);
        while (true) {
            String l = r58Var.l(i);
            if (l.length() == 0) {
                break;
            }
            arrayList.add(l);
            i += l.length() + 1;
        }
        wa1Var2.b = arrayList;
        int i2 = i + 1;
        ArrayList arrayList2 = new ArrayList(5);
        while (true) {
            String l2 = r58Var.l(i2);
            if (l2.length() == 0) {
                break;
            }
            arrayList2.add(l2);
            i2 += l2.length() + 1;
        }
        wa1Var2.c = arrayList2;
        ArrayList arrayList3 = new ArrayList(j4);
        int i3 = intValue + j2;
        int i4 = i3;
        int i5 = 0;
        while (i5 < j4) {
            fq9 fq9Var = new fq9();
            fq9Var.b = new ArrayList();
            fq9Var.a = r58Var.j(i4);
            short j5 = r58Var.j(i4 + 2);
            i4 += 4;
            ArrayList arrayList4 = new ArrayList(j5);
            int i6 = 0;
            while (i6 < j5) {
                s58 s58Var = new s58();
                s58Var.a = r58Var.k(i4);
                s58Var.b = r58Var.k(i4 + 4);
                byte b = bArr[i4 + 8];
                s58Var.c = bArr[i4 + 9];
                byte b2 = bArr[i4 + 10];
                byte b3 = bArr[i4 + 11];
                s58Var.d = bArr[i4 + 12];
                byte b4 = bArr[i4 + 13];
                short j6 = r58Var.j(i4 + 14);
                i4 += 16;
                String l3 = r58Var.l(i3 + j3 + j6);
                s58Var.e = l3;
                int indexOf = l3.indexOf("[[");
                if (indexOf != -1) {
                    s58Var.e = s58Var.e.substring(0, indexOf).concat(s58Var.e.substring(s58Var.e.indexOf("]]") + 2));
                }
                arrayList4.add(s58Var);
                i6++;
                r58Var = this;
            }
            fq9Var.b = arrayList4;
            arrayList3.add(fq9Var);
            i5++;
            r58Var = this;
        }
        wa1Var2.d = arrayList3;
        return wa1Var2;
    }

    public final mo5 b(List list, HashMap hashMap) {
        boolean z;
        r58 r58Var;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        int i = 0;
        while (true) {
            int size = list.size();
            z = this.a;
            String str = null;
            if (i >= size) {
                break;
            }
            eh5 eh5Var = (eh5) list.get(i);
            Uri uri = eh5Var.a;
            mh5 mh5Var = new mh5(eh5Var.b, eh5Var.e, eh5Var.d);
            if (z && (str = (String) hashMap.get(eh5Var.c)) == null) {
                r58Var = this;
            } else {
                Uri uri2 = eh5Var.a;
                r58Var = this;
                r58Var.g(uri2, str, i, arrayList, mh5Var, hashMap2, hashMap3);
            }
            i++;
            this = r58Var;
        }
        r58 r58Var2 = this;
        if (z) {
            nh5 nh5Var = (nh5) ((mo5) r58Var2.f).get(0);
            nh5Var.getClass();
            yo5 a = nh5Var.a();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!((nh5) arrayList.get(i2)).a().equals(a)) {
                    throw bx7.b("The set of available pathway IDs of a rendition redundant group is inconsistent with variant redundant groups", null);
                }
            }
        }
        return mo5.q(arrayList);
    }

    public final mo5 c(int i) {
        gh5 gh5Var = (gh5) this.e;
        d();
        if (i == 1) {
            mo5 mo5Var = (mo5) this.g;
            if (mo5Var != null) {
                return mo5Var;
            }
            mo5 b = b(gh5Var.f, this.b);
            this.g = b;
            return b;
        }
        if (i == 2) {
            mo5 mo5Var2 = (mo5) this.h;
            if (mo5Var2 != null) {
                return mo5Var2;
            }
            mo5 b2 = b(gh5Var.g, this.c);
            this.h = b2;
            return b2;
        }
        if (i != 3) {
            u36.j("Invalid type for creating rendition redundant group list");
            return null;
        }
        mo5 mo5Var3 = (mo5) this.i;
        if (mo5Var3 != null) {
            return mo5Var3;
        }
        mo5 b3 = b(gh5Var.h, this.d);
        this.i = b3;
        return b3;
    }

    public final void d() {
        boolean z;
        gh5 gh5Var = (gh5) this.e;
        if (((mo5) this.f) == null) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i = 0;
            while (true) {
                int size = gh5Var.e.size();
                z = this.a;
                if (i >= size) {
                    break;
                }
                fh5 fh5Var = (fh5) gh5Var.e.get(i);
                r58 r58Var = this;
                String g = r58Var.g(fh5Var.a, fh5Var.g, i, arrayList, new mh5(fh5Var.b, fh5Var.h, null), hashMap, hashMap2);
                if (z) {
                    String str = fh5Var.c;
                    if (str != null) {
                        i(str, g, r58Var.b);
                    }
                    String str2 = fh5Var.d;
                    if (str2 != null) {
                        i(str2, g, r58Var.c);
                    }
                    String str3 = fh5Var.e;
                    if (str3 != null) {
                        i(str3, g, r58Var.d);
                    }
                }
                i++;
                this = r58Var;
            }
            r58 r58Var2 = this;
            mo5 q = mo5.q(arrayList);
            r58Var2.f = q;
            if (z) {
                nh5 nh5Var = (nh5) q.get(0);
                nh5Var.getClass();
                yo5 a = nh5Var.a();
                for (int i2 = 1; i2 < ((mo5) r58Var2.f).size(); i2++) {
                    if (!((nh5) ((mo5) r58Var2.f).get(i2)).a().equals(a)) {
                        throw bx7.b("The set of available pathway IDs is inconsistent among variant redundant groups", null);
                    }
                }
            }
        }
    }

    public final String e(String str) {
        String str2;
        if (this.a) {
            try {
                StringBuilder sb = new StringBuilder(str);
                for (int length = sb.length() - 1; length >= 0; length--) {
                    if (!"0123456789+*#".contains(sb.substring(length, length + 1))) {
                        sb.deleteCharAt(length);
                    }
                }
                String sb2 = sb.toString();
                wa1 wa1Var = null;
                if (sb2.startsWith("+")) {
                    String substring = sb2.substring(1);
                    int i = 0;
                    while (i < 3 && i < substring.length()) {
                        i++;
                        wa1Var = a(substring.substring(0, i));
                        if (wa1Var != null) {
                            break;
                        }
                    }
                    if (wa1Var != null) {
                        return "+" + wa1Var.a(substring);
                    }
                } else {
                    wa1 a = a((String) this.h);
                    if (a != null) {
                        ArrayList arrayList = a.c;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                str2 = null;
                                break;
                            }
                            Object obj = arrayList.get(i2);
                            i2++;
                            str2 = (String) obj;
                            if (sb2.startsWith(str2)) {
                                break;
                            }
                        }
                        if (str2 == null) {
                            return a.a(sb2);
                        }
                        String substring2 = sb2.substring(str2.length());
                        int i3 = 0;
                        while (i3 < 3 && i3 < substring2.length()) {
                            i3++;
                            wa1Var = a(substring2.substring(0, i3));
                            if (wa1Var != null) {
                                break;
                            }
                        }
                        if (wa1Var != null) {
                            substring2 = wa1Var.a(substring2);
                        }
                        if (substring2.length() == 0) {
                            return str2;
                        }
                        return str2 + " " + substring2;
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return str;
            }
        }
        return str;
    }

    public final String g(Uri uri, String str, int i, ArrayList arrayList, mh5 mh5Var, HashMap hashMap, HashMap hashMap2) {
        int i2;
        String str2;
        Integer num = (Integer) hashMap.get(mh5Var);
        int i3 = 1;
        if (num == null) {
            if (str == null) {
                hashMap2.put(mh5Var, 1);
                str = ".";
            } else {
                hashMap2.put(mh5Var, 0);
            }
            nh5 nh5Var = new nh5(mh5Var, str, uri, i);
            hashMap.put(mh5Var, Integer.valueOf(arrayList.size()));
            arrayList.add(nh5Var);
            return str;
        }
        if (str == null) {
            Integer num2 = (Integer) hashMap2.get(mh5Var);
            num2.getClass();
            int intValue = num2.intValue();
            if (this.a && intValue >= 1) {
                throw bx7.b("At most one playlist URL within an HlsRedundantGroup can have an undefined pathway when Content Steering is enabled", null);
            }
            int i4 = intValue + 1;
            if (i4 <= 1) {
                jte.c(i4, "invalid count: %s", i4 >= 0);
                str2 = i4 == 0 ? "" : ".";
            } else {
                long j2 = i4;
                int i5 = (int) j2;
                if (i5 != j2) {
                    throw new ArrayIndexOutOfBoundsException(kt6.n(j2, "Required array size too large: "));
                }
                char[] cArr = new char[i5];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i2 = i5 - i3;
                    if (i3 >= i2) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i3);
                    i3 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i3, i2);
                str2 = new String(cArr);
            }
            hashMap2.put(mh5Var, Integer.valueOf(i4));
            str = str2;
        }
        nh5 nh5Var2 = (nh5) arrayList.get(num.intValue());
        Uri uri2 = (Uri) nh5Var2.b.get(str);
        if (uri2 == null || uri.equals(uri2)) {
            nh5Var2.b.put(str, uri);
            if (i != -1) {
                nh5Var2.c.add(Integer.valueOf(i));
            }
            return str;
        }
        throw bx7.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
    }

    public final short j(int i) {
        if (i + 2 > ((byte[]) this.e).length) {
            return (short) 0;
        }
        ((ByteBuffer) this.f).position(i);
        return ((ByteBuffer) this.f).getShort();
    }

    public final int k(int i) {
        if (i + 4 > ((byte[]) this.e).length) {
            return 0;
        }
        ((ByteBuffer) this.f).position(i);
        return ((ByteBuffer) this.f).getInt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000f, code lost:
    
        if (r5 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        return new java.lang.String(r2, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
    
        r1 = r1 - r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String l(int i) {
        int i2 = i;
        while (true) {
            try {
                byte[] bArr = (byte[]) this.e;
                if (i2 >= bArr.length) {
                    return "";
                }
                if (bArr[i2] == 0) {
                    break;
                }
                i2++;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
    }

    public r58(gh5 gh5Var) {
        this.e = gh5Var;
        this.a = gh5Var.n != null;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }
}
