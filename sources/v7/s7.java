package v7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class s7 {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h0.h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h0.i iVar = new h0.i(resources, theme);
        synchronized (h0.j.c) {
            try {
                SparseArray sparseArray = (SparseArray) h0.j.b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (h0.h) sparseArray.get(i10)) != null) {
                    if (hVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.c != 0) {
                            }
                            colorStateList2 = hVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i10);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = h0.j.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateList = h0.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e7) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i10, theme);
        }
        h0.j.a(iVar, i10, colorStateList, theme);
        return colorStateList;
    }

    public static Drawable b(Context context, int i10) {
        return m.m2.d().g(context, i10);
    }
}
