package rc;

import java.security.SecureRandom;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class r {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            Class<?>[] clsArr = {String.class};
            SecureRandom secureRandom = k.a;
            try {
                Class.forName("javax.net.ssl.SNIHostName").getConstructor(clsArr);
            } catch (Exception unused) {
            }
            try {
                Class.forName("javax.net.ssl.SSLParameters").getMethod("setServerNames", List.class);
            } catch (Exception unused2) {
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
