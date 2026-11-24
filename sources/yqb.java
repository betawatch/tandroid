// default package

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class yqb extends ContextWrapper {
    public static final Object a = null;

    public static void a(Context context) {
        if (context.getResources() instanceof zqb) {
            return;
        }
        context.getResources();
        int i = tbc.a;
    }
}
