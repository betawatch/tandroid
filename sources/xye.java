// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xye {
    public static co4 e(co4[] co4VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        co4 co4Var = null;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (co4 co4Var2 : co4VarArr) {
            int abs = (Math.abs(co4Var2.c - i2) << 1) + (co4Var2.d == z ? 0 : 1);
            if (co4Var == null || i3 > abs) {
                co4Var = co4Var2;
                i3 = abs;
            }
        }
        return co4Var;
    }

    public abstract Typeface a(Context context, yn4 yn4Var, Resources resources, int i);

    public abstract Typeface b(Context context, co4[] co4VarArr, int i);

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File c = aze.c(context);
        Typeface typeface = null;
        if (c == null) {
            return null;
        }
        try {
            if (aze.a(c, resources, i)) {
                typeface = Typeface.createFromFile(c.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            c.delete();
            throw th;
        }
        c.delete();
        return typeface;
    }
}
