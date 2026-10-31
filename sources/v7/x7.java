package v7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class x7 {
    public x7() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, h0.e eVar, Resources resources, int i10);

    public abstract Typeface b(Context context, o0.h[] hVarArr, int i10);

    public Typeface c(Context context, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File d = y7.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (y7.c(d, inputStream)) {
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
        File d = y7.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (y7.b(d, resources, i10)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public o0.h f(o0.h[] hVarArr, int i10) {
        new kb.a(8);
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        o0.h hVar = null;
        int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (o0.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.c - i11) * 2) + (hVar2.d == z10 ? 0 : 1);
            if (hVar == null || i12 > abs) {
                hVar = hVar2;
                i12 = abs;
            }
        }
        return hVar;
    }
}
