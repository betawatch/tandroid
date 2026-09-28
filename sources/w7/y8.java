package w7;

import android.net.Uri;
import java.util.Iterator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class y8 {
    public static Uri a(Uri uri) {
        if (uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return buildUpon.build();
    }
}
