// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class p1f {
    public static go4 e(go4[] go4VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        go4 go4Var = null;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (go4 go4Var2 : go4VarArr) {
            int abs = (Math.abs(go4Var2.c - i2) << 1) + (go4Var2.d == z ? 0 : 1);
            if (go4Var == null || i3 > abs) {
                go4Var = go4Var2;
                i3 = abs;
            }
        }
        return go4Var;
    }

    public abstract Typeface a(Context context, co4 co4Var, Resources resources, int i);

    public abstract Typeface b(Context context, go4[] go4VarArr, int i);

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File c = r1f.c(context);
        Typeface typeface = null;
        if (c == null) {
            return null;
        }
        try {
            if (r1f.a(c, resources, i)) {
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
