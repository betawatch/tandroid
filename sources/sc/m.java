package sc;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class m implements HostnameVerifier {
    public static final m a = new m();
    public static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c2, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        r4 = r5.d;
        r8 = new java.lang.String(r10, r4, r5.e - r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        char[] cArr;
        char c10;
        int i11;
        char c11;
        boolean z12 = false;
        boolean z13 = true;
        if (b.matcher(str).matches()) {
            List a2 = a(x509Certificate, 7);
            int size = a2.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (str.equalsIgnoreCase((String) a2.get(i12))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c12 = 2;
        List a10 = a(x509Certificate, 2);
        int size2 = a10.size();
        int i13 = 0;
        Object[] objArr = false;
        while (i13 < size2) {
            if (c(lowerCase, (String) a10.get(i13))) {
                return true;
            }
            i13++;
            objArr = true;
        }
        if (objArr == false) {
            e eVar = new e(x509Certificate.getSubjectX500Principal());
            eVar.c = 0;
            eVar.d = 0;
            eVar.e = 0;
            eVar.f = 0;
            String str3 = eVar.a;
            eVar.g = str3.toCharArray();
            String c13 = eVar.c();
            String str4 = null;
            if (c13 != null) {
                while (true) {
                    int i14 = eVar.c;
                    int i15 = eVar.b;
                    if (i14 == i15) {
                        break;
                    }
                    char c14 = eVar.g[i14];
                    char c15 = c12;
                    z10 = z12;
                    if (c14 == '\"') {
                        z11 = z13;
                        int i16 = i14 + 1;
                        eVar.c = i16;
                        eVar.d = i16;
                        eVar.e = i16;
                        while (true) {
                            int i17 = eVar.c;
                            if (i17 == i15) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = eVar.g;
                            char c16 = cArr2[i17];
                            if (c16 == '\"') {
                                eVar.c = i17 + 1;
                                while (true) {
                                    int i18 = eVar.c;
                                    if (i18 >= i15 || eVar.g[i18] != ' ') {
                                        break;
                                    }
                                    eVar.c = i18 + 1;
                                }
                                char[] cArr3 = eVar.g;
                                int i19 = eVar.d;
                                str2 = new String(cArr3, i19, eVar.e - i19);
                            } else {
                                if (c16 == '\\') {
                                    cArr2[eVar.e] = eVar.b();
                                } else {
                                    cArr2[eVar.e] = c16;
                                }
                                eVar.c++;
                                eVar.e++;
                            }
                        }
                    } else if (c14 == '#') {
                        z11 = z13;
                        if (i14 + 4 >= i15) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        eVar.d = i14;
                        eVar.c = i14 + 1;
                        while (true) {
                            i10 = eVar.c;
                            if (i10 == i15 || (c10 = (cArr = eVar.g)[i10]) == '+' || c10 == ',' || c10 == ';') {
                                break;
                            }
                            if (c10 == ' ') {
                                eVar.e = i10;
                                eVar.c = i10 + 1;
                                while (true) {
                                    int i20 = eVar.c;
                                    if (i20 >= i15 || eVar.g[i20] != ' ') {
                                        break;
                                    }
                                    eVar.c = i20 + 1;
                                }
                            } else {
                                if (c10 >= 'A' && c10 <= 'F') {
                                    cArr[i10] = (char) (c10 + ' ');
                                }
                                eVar.c = i10 + 1;
                            }
                        }
                        eVar.e = i10;
                        int i21 = eVar.e;
                        int i22 = eVar.d;
                        int i23 = i21 - i22;
                        if (i23 < 5 || (i23 & 1) == 0) {
                            break;
                        }
                        int i24 = i23 / 2;
                        byte[] bArr = new byte[i24];
                        int i25 = i22 + 1;
                        for (int i26 = z10 ? 1 : 0; i26 < i24; i26++) {
                            bArr[i26] = (byte) eVar.a(i25);
                            i25 += 2;
                        }
                        str2 = new String(eVar.g, eVar.d, i23);
                    } else if (c14 == '+' || c14 == ',' || c14 == ';') {
                        z11 = z13;
                        str2 = "";
                    } else {
                        eVar.d = i14;
                        eVar.e = i14;
                        while (true) {
                            int i27 = eVar.c;
                            if (i27 >= i15) {
                                char[] cArr4 = eVar.g;
                                int i28 = eVar.d;
                                str2 = new String(cArr4, i28, eVar.e - i28);
                                z11 = z13;
                                break;
                            }
                            char[] cArr5 = eVar.g;
                            char c17 = cArr5[i27];
                            if (c17 == ' ') {
                                z11 = z13;
                                int i29 = eVar.e;
                                eVar.f = i29;
                                eVar.c = i27 + 1;
                                eVar.e = i29 + 1;
                                cArr5[i29] = ' ';
                                while (true) {
                                    i11 = eVar.c;
                                    if (i11 >= i15) {
                                        break;
                                    }
                                    char[] cArr6 = eVar.g;
                                    if (cArr6[i11] != ' ') {
                                        break;
                                    }
                                    int i30 = eVar.e;
                                    eVar.e = i30 + 1;
                                    cArr6[i30] = ' ';
                                    eVar.c = i11 + 1;
                                }
                                if (i11 == i15 || (c11 = eVar.g[i11]) == ',' || c11 == '+' || c11 == ';') {
                                    break;
                                }
                                z13 = z11;
                            } else {
                                if (c17 == ';') {
                                    break;
                                }
                                if (c17 == '\\') {
                                    z11 = z13;
                                    int i31 = eVar.e;
                                    eVar.e = i31 + 1;
                                    cArr5[i31] = eVar.b();
                                    eVar.c++;
                                } else {
                                    if (c17 == '+' || c17 == ',') {
                                        break;
                                    }
                                    int i32 = eVar.e;
                                    z11 = z13;
                                    eVar.e = i32 + 1;
                                    cArr5[i32] = c17;
                                    eVar.c = i27 + 1;
                                }
                                z13 = z11;
                            }
                        }
                        char[] cArr7 = eVar.g;
                        int i33 = eVar.d;
                        str2 = new String(cArr7, i33, eVar.f - i33);
                    }
                    if ("cn".equalsIgnoreCase(c13)) {
                        str4 = str2;
                        break;
                    }
                    int i34 = eVar.c;
                    if (i34 >= i15) {
                        break;
                    }
                    char c18 = eVar.g[i34];
                    if (c18 != ',' && c18 != ';' && c18 != '+') {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    eVar.c = i34 + 1;
                    c13 = eVar.c();
                    if (c13 == null) {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    c12 = c15;
                    z12 = z10 ? 1 : 0;
                    z13 = z11;
                }
            }
            z10 = z12;
            return str4 != null ? c(lowerCase, str4) : z10;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (!str.endsWith(substring)) {
            return false;
        }
        int length = str.length() - substring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
