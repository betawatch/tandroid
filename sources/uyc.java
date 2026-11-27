// default package

import java.net.URI;
import java.security.SecureRandom;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class uyc {
    public final sae a;
    public short b;

    public uyc() {
        sae saeVar = new sae();
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
        this.a = saeVar;
    }

    public final ryc a(String str) {
        String str2;
        boolean z;
        String str3;
        Matcher matcher;
        Matcher matcher2;
        short s = this.b;
        if (str == null) {
            lq5.j("The given URI is null.");
            return null;
        }
        if (s < 0) {
            lq5.j("The given timeout value is negative.");
            return null;
        }
        URI create = URI.create(str);
        if (create == null) {
            lq5.j("The given URI is null.");
            return null;
        }
        if (s < 0) {
            lq5.j("The given timeout value is negative.");
            return null;
        }
        String scheme = create.getScheme();
        String userInfo = create.getUserInfo();
        SecureRandom secureRandom = ig7.a;
        String host = create.getHost();
        if (host == null) {
            String rawAuthority = create.getRawAuthority();
            host = (rawAuthority == null || (matcher2 = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(rawAuthority)) == null || !matcher2.matches()) ? null : matcher2.group(2);
            if (host == null) {
                String uri = create.toString();
                if (uri == null || (matcher = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(uri)) == null || !matcher.matches()) {
                    str2 = null;
                    int port = create.getPort();
                    String rawPath = create.getRawPath();
                    String rawQuery = create.getRawQuery();
                    if (scheme != null || scheme.length() == 0) {
                        lq5.j("The scheme part is empty.");
                        return null;
                    }
                    if ("wss".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                        z = true;
                    } else {
                        if (!"ws".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
                            lq5.j("Bad scheme: ".concat(scheme));
                            return null;
                        }
                        z = false;
                    }
                    if (str2 == null || str2.length() == 0) {
                        lq5.j("The host part is empty.");
                        return null;
                    }
                    if (rawPath == null || rawPath.length() == 0) {
                        str3 = "/";
                    } else {
                        if (!rawPath.startsWith("/")) {
                            rawPath = "/".concat(rawPath);
                        }
                        str3 = rawPath;
                    }
                    int i = port >= 0 ? port : z ? 443 : 80;
                    this.a.getClass();
                    xna xnaVar = new xna(z ? SSLSocketFactory.getDefault() : SocketFactory.getDefault(), new ra(str2, i), s, null, null);
                    xnaVar.d = 1;
                    xnaVar.e = (short) 250;
                    xnaVar.f = true;
                    if (port >= 0) {
                        str2 = str2 + ":" + port;
                    }
                    if (rawQuery != null) {
                        str3 = qd4.y(str3, "?", rawQuery);
                    }
                    return new ryc(z, userInfo, str2, str3, xnaVar);
                }
                host = matcher.group(2);
            }
        }
        str2 = host;
        int port2 = create.getPort();
        String rawPath2 = create.getRawPath();
        String rawQuery2 = create.getRawQuery();
        if (scheme != null) {
        }
        lq5.j("The scheme part is empty.");
        return null;
    }
}
