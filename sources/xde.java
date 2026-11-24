// default package

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xde {
    public static final File a(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }
}
