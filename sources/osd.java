// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class osd {
    public static String a(String str) {
        List list = null;
        if (str != null) {
            return xab.r(new xab(str, list));
        }
        u36.j("applicationId cannot be null");
        return null;
    }
}
