package sf;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.net.IDN;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a {
    public static final a g = new a(a());
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public a(hj0 hj0Var) {
        int i10 = hj0Var.a;
        this.a = i10;
        this.b = hj0Var.b;
        if (i10 == 3) {
            this.f = (String) hj0Var.f;
            this.c = 0;
            this.d = "";
            this.e = "";
            return;
        }
        if (i10 == 2) {
            this.f = (String) hj0Var.f;
            this.c = hj0Var.c;
            this.d = "";
            this.e = "";
            return;
        }
        if (i10 != 1) {
            throw new IllegalArgumentException();
        }
        this.f = "";
        this.c = hj0Var.c;
        this.d = hj0Var.d;
        this.e = (String) hj0Var.e;
    }

    public static hj0 a() {
        hj0 hj0Var = new hj0();
        hj0Var.a = 1;
        hj0Var.b = "";
        hj0Var.d = "";
        hj0Var.e = "";
        hj0Var.f = "";
        return hj0Var;
    }

    public static a b(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i10 = sharedPreferences.getInt("proxy_port", 1080);
        int i11 = 2;
        int c3 = m1.j.c(TextUtils.isEmpty(string4) ? 1 : 2);
        if (c3 == 1) {
            i11 = 1;
        } else if (c3 != 2) {
            i11 = 0;
        }
        int d = d(sharedPreferences.getInt("proxy_type", i11));
        hj0 a2 = a();
        if (string == null) {
            string = "";
        }
        a2.b = string;
        if (string2 == null) {
            string2 = "";
        }
        a2.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a2.e = string3;
        a2.f = string4 != null ? string4 : "";
        a2.c = i10;
        a2.a = d != 0 ? d : 1;
        return new a(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[Catch: Exception -> 0x013a, TryCatch #0 {Exception -> 0x013a, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002c, B:18:0x0039, B:21:0x0043, B:23:0x004c, B:26:0x0056, B:28:0x005f, B:32:0x006b, B:36:0x0075, B:37:0x00d7, B:39:0x00e4, B:40:0x00e8, B:65:0x00f5, B:43:0x00fb, B:46:0x0102, B:50:0x010a, B:53:0x0119, B:56:0x0126, B:59:0x0132, B:70:0x008a, B:74:0x0092, B:76:0x009f, B:78:0x00a8, B:82:0x00b3, B:86:0x00bb, B:89:0x00c5, B:92:0x00ce), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[Catch: Exception -> 0x013a, TryCatch #0 {Exception -> 0x013a, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002c, B:18:0x0039, B:21:0x0043, B:23:0x004c, B:26:0x0056, B:28:0x005f, B:32:0x006b, B:36:0x0075, B:37:0x00d7, B:39:0x00e4, B:40:0x00e8, B:65:0x00f5, B:43:0x00fb, B:46:0x0102, B:50:0x010a, B:53:0x0119, B:56:0x0126, B:59:0x0132, B:70:0x008a, B:74:0x0092, B:76:0x009f, B:78:0x00a8, B:82:0x00b3, B:86:0x00bb, B:89:0x00c5, B:92:0x00ce), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a c(Uri uri) {
        String path;
        String queryParameter;
        String queryParameter2;
        int parseInt;
        String queryParameter3;
        String queryParameter4;
        int indexOf;
        if (uri == null) {
            return null;
        }
        try {
            String scheme = uri.getScheme();
            if (scheme == null) {
                return null;
            }
            int i10 = 2;
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
                        i10 = 3;
                    }
                    indexOf = uri2.indexOf(63);
                    if (indexOf >= 0) {
                        return null;
                    }
                    uri = Uri.parse("tg://telegram.org/" + uri2.substring(indexOf));
                    queryParameter = uri.getQueryParameter("server");
                    if (AndroidUtilities.checkHostForPunycode(queryParameter)) {
                        queryParameter = IDN.toASCII(queryParameter, 1);
                    }
                    queryParameter2 = uri.getQueryParameter("port");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        try {
                            parseInt = Integer.parseInt(queryParameter2);
                        } catch (NumberFormatException unused) {
                        }
                        hj0 a2 = a();
                        a2.a = i10 != 0 ? i10 : 1;
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        a2.b = queryParameter;
                        a2.c = parseInt;
                        queryParameter3 = uri.getQueryParameter("user");
                        if (queryParameter3 == null) {
                            queryParameter3 = "";
                        }
                        a2.d = queryParameter3;
                        queryParameter4 = uri.getQueryParameter("pass");
                        if (queryParameter4 == null) {
                            queryParameter4 = "";
                        }
                        a2.e = queryParameter4;
                        String queryParameter5 = uri.getQueryParameter("secret");
                        a2.f = queryParameter5 != null ? queryParameter5 : "";
                        return new a(a2);
                    }
                    parseInt = 0;
                    hj0 a22 = a();
                    a22.a = i10 != 0 ? i10 : 1;
                    if (queryParameter == null) {
                    }
                    a22.b = queryParameter;
                    a22.c = parseInt;
                    queryParameter3 = uri.getQueryParameter("user");
                    if (queryParameter3 == null) {
                    }
                    a22.d = queryParameter3;
                    queryParameter4 = uri.getQueryParameter("pass");
                    if (queryParameter4 == null) {
                    }
                    a22.e = queryParameter4;
                    String queryParameter52 = uri.getQueryParameter("secret");
                    a22.f = queryParameter52 != null ? queryParameter52 : "";
                    return new a(a22);
                }
                i10 = 1;
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
                    i10 = 1;
                } else if (!path.startsWith("/proxy")) {
                    if (!path.startsWith("/webproxy")) {
                        return null;
                    }
                    i10 = 3;
                }
                queryParameter = uri.getQueryParameter("server");
                if (AndroidUtilities.checkHostForPunycode(queryParameter)) {
                }
                queryParameter2 = uri.getQueryParameter("port");
                if (!TextUtils.isEmpty(queryParameter2)) {
                }
                parseInt = 0;
                hj0 a222 = a();
                a222.a = i10 != 0 ? i10 : 1;
                if (queryParameter == null) {
                }
                a222.b = queryParameter;
                a222.c = parseInt;
                queryParameter3 = uri.getQueryParameter("user");
                if (queryParameter3 == null) {
                }
                a222.d = queryParameter3;
                queryParameter4 = uri.getQueryParameter("pass");
                if (queryParameter4 == null) {
                }
                a222.e = queryParameter4;
                String queryParameter522 = uri.getQueryParameter("secret");
                a222.f = queryParameter522 != null ? queryParameter522 : "";
                return new a(a222);
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static int d(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public final boolean e() {
        if (TextUtils.isEmpty(this.b)) {
            return false;
        }
        return this.a == 3 || this.c > 0;
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

    public final void f(SharedPreferences.Editor editor) {
        int i10 = this.a;
        int c3 = m1.j.c(i10);
        editor.putInt("proxy_type", c3 != 1 ? c3 != 2 ? 0 : 2 : 1);
        editor.putString("proxy_ip", this.b);
        int c10 = m1.j.c(i10);
        int i11 = this.c;
        if (c10 == 0) {
            editor.putInt("proxy_port", i11);
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
        if (c10 == 1) {
            editor.putString("proxy_secret", str3);
            editor.putInt("proxy_port", i11);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        if (c10 != 2) {
            return;
        }
        editor.putString("proxy_secret", str3);
        editor.remove("proxy_port");
        editor.remove("proxy_pass");
        editor.remove("proxy_user");
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f);
    }
}
