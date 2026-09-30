package r0;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo d = gVar.a.d();
        Objects.requireNonNull(d);
        ContentInfo performReceiveContent = view.performReceiveContent(d);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == d ? gVar : new g(new j2.j(performReceiveContent));
    }
}
