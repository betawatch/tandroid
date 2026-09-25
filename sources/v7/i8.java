package v7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class i8 {
    public i8() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i10);

    public abstract Typeface b(Context context, o0.i[] iVarArr, int i10);

    public Typeface c(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = j8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (j8.c(inputStream, d)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File d = j8.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (j8.b(d, resources, i10)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.i f(o0.i[] iVarArr, int i10) {
        new ob.a(10);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        o0.i iVar = null;
        int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (o0.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.c - i11) * 2) + (iVar2.d == z10 ? 0 : 1);
            if (iVar == null || i12 > abs) {
                iVar = iVar2;
                i12 = abs;
            }
        }
        return iVar;
    }
}
