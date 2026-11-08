package rc;

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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class m implements HostnameVerifier {
    public static final m a = new m();
    public static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i7) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i7 && (str = (String) list.get(1)) != null) {
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
        boolean z9;
        boolean z10;
        String str2;
        int i7;
        char[] cArr;
        char c10;
        int i10;
        char c11;
        boolean z11 = false;
        boolean z12 = true;
        if (b.matcher(str).matches()) {
            List a10 = a(x509Certificate, 7);
            int size = a10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (str.equalsIgnoreCase((String) a10.get(i11))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c12 = 2;
        List a11 = a(x509Certificate, 2);
        int size2 = a11.size();
        int i12 = 0;
        Object[] objArr = false;
        while (i12 < size2) {
            if (c(lowerCase, (String) a11.get(i12))) {
                return true;
            }
            i12++;
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
                    int i13 = eVar.c;
                    int i14 = eVar.b;
                    if (i13 == i14) {
                        break;
                    }
                    char c14 = eVar.g[i13];
                    char c15 = c12;
                    z9 = z11;
                    if (c14 == '\"') {
                        z10 = z12;
                        int i15 = i13 + 1;
                        eVar.c = i15;
                        eVar.d = i15;
                        eVar.e = i15;
                        while (true) {
                            int i16 = eVar.c;
                            if (i16 == i14) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = eVar.g;
                            char c16 = cArr2[i16];
                            if (c16 == '\"') {
                                eVar.c = i16 + 1;
                                while (true) {
                                    int i17 = eVar.c;
                                    if (i17 >= i14 || eVar.g[i17] != ' ') {
                                        break;
                                    }
                                    eVar.c = i17 + 1;
                                }
                                char[] cArr3 = eVar.g;
                                int i18 = eVar.d;
                                str2 = new String(cArr3, i18, eVar.e - i18);
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
                        z10 = z12;
                        if (i13 + 4 >= i14) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        eVar.d = i13;
                        eVar.c = i13 + 1;
                        while (true) {
                            i7 = eVar.c;
                            if (i7 == i14 || (c10 = (cArr = eVar.g)[i7]) == '+' || c10 == ',' || c10 == ';') {
                                break;
                            }
                            if (c10 == ' ') {
                                eVar.e = i7;
                                eVar.c = i7 + 1;
                                while (true) {
                                    int i19 = eVar.c;
                                    if (i19 >= i14 || eVar.g[i19] != ' ') {
                                        break;
                                    }
                                    eVar.c = i19 + 1;
                                }
                            } else {
                                if (c10 >= 'A' && c10 <= 'F') {
                                    cArr[i7] = (char) (c10 + ' ');
                                }
                                eVar.c = i7 + 1;
                            }
                        }
                        eVar.e = i7;
                        int i20 = eVar.e;
                        int i21 = eVar.d;
                        int i22 = i20 - i21;
                        if (i22 < 5 || (i22 & 1) == 0) {
                            break;
                        }
                        int i23 = i22 / 2;
                        byte[] bArr = new byte[i23];
                        int i24 = i21 + 1;
                        for (int i25 = z9 ? 1 : 0; i25 < i23; i25++) {
                            bArr[i25] = (byte) eVar.a(i24);
                            i24 += 2;
                        }
                        str2 = new String(eVar.g, eVar.d, i22);
                    } else if (c14 == '+' || c14 == ',' || c14 == ';') {
                        z10 = z12;
                        str2 = "";
                    } else {
                        eVar.d = i13;
                        eVar.e = i13;
                        while (true) {
                            int i26 = eVar.c;
                            if (i26 >= i14) {
                                char[] cArr4 = eVar.g;
                                int i27 = eVar.d;
                                str2 = new String(cArr4, i27, eVar.e - i27);
                                z10 = z12;
                                break;
                            }
                            char[] cArr5 = eVar.g;
                            char c17 = cArr5[i26];
                            if (c17 == ' ') {
                                z10 = z12;
                                int i28 = eVar.e;
                                eVar.f = i28;
                                eVar.c = i26 + 1;
                                eVar.e = i28 + 1;
                                cArr5[i28] = ' ';
                                while (true) {
                                    i10 = eVar.c;
                                    if (i10 >= i14) {
                                        break;
                                    }
                                    char[] cArr6 = eVar.g;
                                    if (cArr6[i10] != ' ') {
                                        break;
                                    }
                                    int i29 = eVar.e;
                                    eVar.e = i29 + 1;
                                    cArr6[i29] = ' ';
                                    eVar.c = i10 + 1;
                                }
                                if (i10 == i14 || (c11 = eVar.g[i10]) == ',' || c11 == '+' || c11 == ';') {
                                    break;
                                }
                                z12 = z10;
                            } else {
                                if (c17 == ';') {
                                    break;
                                }
                                if (c17 == '\\') {
                                    z10 = z12;
                                    int i30 = eVar.e;
                                    eVar.e = i30 + 1;
                                    cArr5[i30] = eVar.b();
                                    eVar.c++;
                                } else {
                                    if (c17 == '+' || c17 == ',') {
                                        break;
                                    }
                                    int i31 = eVar.e;
                                    z10 = z12;
                                    eVar.e = i31 + 1;
                                    cArr5[i31] = c17;
                                    eVar.c = i26 + 1;
                                }
                                z12 = z10;
                            }
                        }
                        char[] cArr7 = eVar.g;
                        int i32 = eVar.d;
                        str2 = new String(cArr7, i32, eVar.f - i32);
                    }
                    if ("cn".equalsIgnoreCase(c13)) {
                        str4 = str2;
                        break;
                    }
                    int i33 = eVar.c;
                    if (i33 >= i14) {
                        break;
                    }
                    char c18 = eVar.g[i33];
                    if (c18 != ',' && c18 != ';' && c18 != '+') {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    eVar.c = i33 + 1;
                    c13 = eVar.c();
                    if (c13 == null) {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    c12 = c15;
                    z11 = z9 ? 1 : 0;
                    z12 = z10;
                }
            }
            z9 = z11;
            return str4 != null ? c(lowerCase, str4) : z9;
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
