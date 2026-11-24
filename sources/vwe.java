// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class vwe {
    public static bm4 e(bm4[] bm4VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        bm4 bm4Var = null;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (bm4 bm4Var2 : bm4VarArr) {
            int abs = (Math.abs(bm4Var2.c - i2) << 1) + (bm4Var2.d == z ? 0 : 1);
            if (bm4Var == null || i3 > abs) {
                bm4Var = bm4Var2;
                i3 = abs;
            }
        }
        return bm4Var;
    }

    public abstract Typeface a(Context context, xl4 xl4Var, Resources resources, int i);

    public abstract Typeface b(Context context, bm4[] bm4VarArr, int i);

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File c = ywe.c(context);
        Typeface typeface = null;
        if (c == null) {
            return null;
        }
        try {
            if (ywe.a(c, resources, i)) {
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
