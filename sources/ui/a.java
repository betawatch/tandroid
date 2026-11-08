package ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Pattern;
import n2.n0;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class a {
    public static final Pattern g = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_-]*(/[A-Za-z0-9][A-Za-z0-9_-]*)*");
    public static final Pattern h = Pattern.compile("[A-Za-z0-9_-]+");
    public static final a i = a().d();
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public a(n0 n0Var) {
        int i7 = n0Var.a;
        this.a = i7;
        this.b = (String) n0Var.c;
        if (i7 == 3) {
            this.f = (String) n0Var.f;
            this.c = 0;
            this.d = "";
            this.e = "";
            return;
        }
        if (i7 == 2) {
            this.f = (String) n0Var.f;
            this.c = n0Var.b;
            this.d = "";
            this.e = "";
            return;
        }
        if (i7 != 1) {
            throw new IllegalArgumentException();
        }
        this.f = "";
        this.c = n0Var.b;
        this.d = (String) n0Var.d;
        this.e = (String) n0Var.e;
    }

    public static n0 a() {
        n0 n0Var = new n0();
        n0Var.a = 1;
        n0Var.c = "";
        n0Var.d = "";
        n0Var.e = "";
        n0Var.f = "";
        return n0Var;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str) && h.matcher(str).matches()) {
            try {
                byte[] decode = Base64.decode(str, 11);
                if (decode.length >= 17 && (decode[0] & 255) == 112) {
                    char[] cArr = new char[(decode.length - 1) * 2];
                    char[] charArray = "0123456789abcdef".toCharArray();
                    for (int i7 = 1; i7 < decode.length; i7++) {
                        byte b10 = decode[i7];
                        int i10 = (i7 - 1) * 2;
                        cArr[i10] = charArray[(b10 & 255) >>> 4];
                        cArr[i10 + 1] = charArray[b10 & 15];
                    }
                    String str2 = new String(cArr);
                    if (!h(str2)) {
                        return null;
                    }
                    if (Base64.encodeToString(decode, 11).equals(str)) {
                        return str2;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static a c(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i7 = sharedPreferences.getInt("proxy_port", 1080);
        int i10 = 2;
        int c10 = p1.g.c(TextUtils.isEmpty(string4) ? 1 : 2);
        if (c10 == 1) {
            i10 = 1;
        } else if (c10 != 2) {
            i10 = 0;
        }
        int f10 = f(sharedPreferences.getInt("proxy_type", i10));
        n0 a10 = a();
        if (string == null) {
            string = "";
        }
        a10.c = string;
        if (string2 == null) {
            string2 = "";
        }
        a10.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a10.e = string3;
        a10.f = string4 != null ? string4 : "";
        a10.b = i7;
        a10.p(f10);
        return a10.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002b, B:18:0x0037, B:21:0x0040, B:23:0x0048, B:26:0x0051, B:28:0x0059, B:32:0x0064, B:36:0x006e, B:37:0x00cd, B:39:0x00d5, B:41:0x00dd, B:43:0x00e3, B:44:0x00e7, B:89:0x00f4, B:48:0x00fa, B:51:0x0104, B:55:0x0110, B:59:0x0117, B:64:0x011e, B:68:0x012b, B:71:0x0139, B:74:0x0145, B:77:0x014b, B:79:0x0153, B:94:0x0083, B:98:0x008b, B:100:0x0097, B:102:0x009f, B:106:0x00a9, B:110:0x00b1, B:113:0x00bb, B:116:0x00c4), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5 A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002b, B:18:0x0037, B:21:0x0040, B:23:0x0048, B:26:0x0051, B:28:0x0059, B:32:0x0064, B:36:0x006e, B:37:0x00cd, B:39:0x00d5, B:41:0x00dd, B:43:0x00e3, B:44:0x00e7, B:89:0x00f4, B:48:0x00fa, B:51:0x0104, B:55:0x0110, B:59:0x0117, B:64:0x011e, B:68:0x012b, B:71:0x0139, B:74:0x0145, B:77:0x014b, B:79:0x0153, B:94:0x0083, B:98:0x008b, B:100:0x0097, B:102:0x009f, B:106:0x00a9, B:110:0x00b1, B:113:0x00bb, B:116:0x00c4), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0153 A[Catch: Exception -> 0x015a, TRY_LEAVE, TryCatch #0 {Exception -> 0x015a, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002b, B:18:0x0037, B:21:0x0040, B:23:0x0048, B:26:0x0051, B:28:0x0059, B:32:0x0064, B:36:0x006e, B:37:0x00cd, B:39:0x00d5, B:41:0x00dd, B:43:0x00e3, B:44:0x00e7, B:89:0x00f4, B:48:0x00fa, B:51:0x0104, B:55:0x0110, B:59:0x0117, B:64:0x011e, B:68:0x012b, B:71:0x0139, B:74:0x0145, B:77:0x014b, B:79:0x0153, B:94:0x0083, B:98:0x008b, B:100:0x0097, B:102:0x009f, B:106:0x00a9, B:110:0x00b1, B:113:0x00bb, B:116:0x00c4), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a d(Uri uri) {
        String path;
        String queryParameter;
        String queryParameter2;
        int parseInt;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        int indexOf;
        if (uri == null) {
            return null;
        }
        try {
            String scheme = uri.getScheme();
            if (scheme == null) {
                return null;
            }
            boolean z9 = true;
            int i7 = 2;
            if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) {
                if (!scheme.equalsIgnoreCase("tg")) {
                    return null;
                }
                String uri2 = uri.toString();
                if (!uri2.startsWith("tg://socks") && !uri2.startsWith("tg:socks")) {
                    if (!uri2.startsWith("tg://proxy") && !uri2.startsWith("tg:proxy")) {
                        if (!uri2.startsWith("tg://webproxy") && !uri2.startsWith("tg:webproxy")) {
                            return null;
                        }
                        i7 = 3;
                    }
                    indexOf = uri2.indexOf(63);
                    if (indexOf >= 0) {
                        return null;
                    }
                    uri = Uri.parse("tg://telegram.org/" + uri2.substring(indexOf));
                    queryParameter = uri.getQueryParameter("server");
                    if (queryParameter == null) {
                        queryParameter = uri.getQueryParameter("host");
                    }
                    if (i7 != 3 && g0.w(queryParameter)) {
                        queryParameter = IDN.toASCII(queryParameter, 1);
                    }
                    queryParameter2 = uri.getQueryParameter("port");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        try {
                            parseInt = Integer.parseInt(queryParameter2);
                        } catch (NumberFormatException unused) {
                        }
                        queryParameter3 = uri.getQueryParameter("secret");
                        if (i7 == 3) {
                            if (queryParameter == null || queryParameter.indexOf(47) < 0) {
                                z9 = false;
                            }
                            if (z9) {
                                queryParameter3 = b(queryParameter3);
                                if (queryParameter3 == null) {
                                    return null;
                                }
                            } else if (!h(queryParameter3)) {
                                return null;
                            }
                        }
                        n0 a10 = a();
                        a10.p(i7);
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        a10.c = queryParameter;
                        a10.b = parseInt;
                        queryParameter4 = uri.getQueryParameter("user");
                        if (queryParameter4 == null) {
                            queryParameter4 = "";
                        }
                        a10.d = queryParameter4;
                        queryParameter5 = uri.getQueryParameter("pass");
                        if (queryParameter5 == null) {
                            queryParameter5 = "";
                        }
                        a10.e = queryParameter5;
                        if (queryParameter3 == null) {
                            queryParameter3 = "";
                        }
                        a10.f = queryParameter3;
                        a d = a10.d();
                        if (i7 == 3) {
                            if (!d.g()) {
                                return null;
                            }
                        }
                        return d;
                    }
                    parseInt = 0;
                    queryParameter3 = uri.getQueryParameter("secret");
                    if (i7 == 3) {
                    }
                    n0 a102 = a();
                    a102.p(i7);
                    if (queryParameter == null) {
                    }
                    a102.c = queryParameter;
                    a102.b = parseInt;
                    queryParameter4 = uri.getQueryParameter("user");
                    if (queryParameter4 == null) {
                    }
                    a102.d = queryParameter4;
                    queryParameter5 = uri.getQueryParameter("pass");
                    if (queryParameter5 == null) {
                    }
                    a102.e = queryParameter5;
                    if (queryParameter3 == null) {
                    }
                    a102.f = queryParameter3;
                    a d2 = a102.d();
                    if (i7 == 3) {
                    }
                    return d2;
                }
                i7 = 1;
                indexOf = uri2.indexOf(63);
                if (indexOf >= 0) {
                }
            }
            String host = uri.getHost();
            if (host == null) {
                return null;
            }
            String lowerCase = host.toLowerCase();
            if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = uri.getPath()) != null) {
                if (path.startsWith("/socks")) {
                    i7 = 1;
                } else if (!path.startsWith("/proxy")) {
                    if (!path.startsWith("/webproxy")) {
                        return null;
                    }
                    i7 = 3;
                }
                queryParameter = uri.getQueryParameter("server");
                if (queryParameter == null) {
                }
                if (i7 != 3) {
                    queryParameter = IDN.toASCII(queryParameter, 1);
                }
                queryParameter2 = uri.getQueryParameter("port");
                if (!TextUtils.isEmpty(queryParameter2)) {
                }
                parseInt = 0;
                queryParameter3 = uri.getQueryParameter("secret");
                if (i7 == 3) {
                }
                n0 a1022 = a();
                a1022.p(i7);
                if (queryParameter == null) {
                }
                a1022.c = queryParameter;
                a1022.b = parseInt;
                queryParameter4 = uri.getQueryParameter("user");
                if (queryParameter4 == null) {
                }
                a1022.d = queryParameter4;
                queryParameter5 = uri.getQueryParameter("pass");
                if (queryParameter5 == null) {
                }
                a1022.e = queryParameter5;
                if (queryParameter3 == null) {
                }
                a1022.f = queryParameter3;
                a d22 = a1022.d();
                if (i7 == 3) {
                }
                return d22;
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static int f(int i7) {
        if (i7 != 0) {
            if (i7 == 1) {
                return 2;
            }
            if (i7 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public static boolean h(String str) {
        if (str != null) {
            if (str.length() == 32) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    if (Character.digit(str.charAt(i7), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
            if (str.length() == 34 && str.regionMatches(true, 0, "dd", 0, 2)) {
                for (int i10 = 2; i10 < str.length(); i10++) {
                    if (Character.digit(str.charAt(i10), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String e() {
        String str = this.e;
        String str2 = this.d;
        String str3 = this.b;
        String str4 = this.f;
        int i7 = this.a;
        int c10 = p1.g.c(i7);
        StringBuilder sb2 = c10 != 1 ? c10 != 2 ? new StringBuilder("https://t.me/socks?") : new StringBuilder("https://t.me/webproxy?") : new StringBuilder("https://t.me/proxy?");
        try {
            sb2.append("server=");
            sb2.append(URLEncoder.encode(str3, "UTF-8"));
            if (i7 != 3) {
                sb2.append("&port=");
                sb2.append(this.c);
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append("&user=");
                sb2.append(URLEncoder.encode(str2, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append("&pass=");
                sb2.append(URLEncoder.encode(str, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str4)) {
                if (i7 == 3) {
                    if ((str3 != null && str3.indexOf(47) >= 0) && h(str4)) {
                        int length = str4.length() / 2;
                        byte[] bArr = new byte[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            int i11 = i10 * 2;
                            bArr[i10] = (byte) (Character.digit(str4.charAt(i11 + 1), 16) | (Character.digit(str4.charAt(i11), 16) << 4));
                        }
                        byte[] bArr2 = new byte[length + 1];
                        bArr2[0] = 112;
                        System.arraycopy(bArr, 0, bArr2, 1, length);
                        str4 = Base64.encodeToString(bArr2, 11);
                    }
                }
                sb2.append("&secret=");
                sb2.append(URLEncoder.encode(str4, "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && this.a == aVar.a && Objects.equals(this.b, aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.e, aVar.e) && Objects.equals(this.f, aVar.f);
    }

    public final boolean g() {
        boolean equals;
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            if (this.a == 3) {
                if (!TextUtils.isEmpty(str)) {
                    int indexOf = str.indexOf(47);
                    String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                    String substring2 = indexOf >= 0 ? str.substring(indexOf + 1) : null;
                    if (!TextUtils.isEmpty(substring) && substring.indexOf(58) < 0 && substring.indexOf(63) < 0 && substring.indexOf(35) < 0 && (substring2 == null || (substring2.length() <= 128 && g.matcher(substring2).matches()))) {
                        try {
                            equals = substring.equals(IDN.toASCII(substring, 3).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                        }
                        return equals && h(this.f);
                    }
                }
                equals = false;
                if (equals) {
                    return false;
                }
            }
            if (this.c > 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(p1.g.a(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f);
    }

    public final void i(SharedPreferences.Editor editor) {
        int i7 = this.a;
        int c10 = p1.g.c(i7);
        editor.putInt("proxy_type", c10 != 1 ? c10 != 2 ? 0 : 2 : 1);
        editor.putString("proxy_ip", this.b);
        int c11 = p1.g.c(i7);
        int i10 = this.c;
        if (c11 == 0) {
            editor.putInt("proxy_port", i10);
            editor.remove("proxy_secret");
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                editor.remove("proxy_pass");
            } else {
                editor.putString("proxy_pass", str);
            }
            String str2 = this.d;
            if (TextUtils.isEmpty(str2)) {
                editor.remove("proxy_user");
                return;
            } else {
                editor.putString("proxy_user", str2);
                return;
            }
        }
        String str3 = this.f;
        if (c11 == 1) {
            editor.putString("proxy_secret", str3);
            editor.putInt("proxy_port", i10);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        if (c11 != 2) {
            return;
        }
        editor.putString("proxy_secret", str3);
        editor.remove("proxy_port");
        editor.remove("proxy_pass");
        editor.remove("proxy_user");
    }
}
