package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t3 {
    public TextPaint a;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray i = new SparseArray();
    public final SparseArray j = new SparseArray();
    public final SparseArray k = new SparseArray();
    public final SparseArray l = new SparseArray();
    public final SparseArray m = new SparseArray();
    public final SparseArray n = new SparseArray();
    public final SparseArray o = new SparseArray();
    public final SparseArray p = new SparseArray();
    public final SparseArray q = new SparseArray();
    public final SparseArray r = new SparseArray();
    public final SparseArray s = new SparseArray();
    public final SparseArray t = new SparseArray();
    public final SparseArray u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray w = new SparseArray();
    public final SparseArray x = new SparseArray();
    public final SparseArray y = new SparseArray();
    public final SparseArray z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(l4 l4Var, SparseArray sparseArray) {
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            int keyAt = sparseArray.keyAt(i9);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i9);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(l4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
                }
            }
        }
    }

    public static void b(int i9, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i10 = i9 & 1;
        if (i10 != 0 && (i9 & 2) != 0) {
            textPaint.setTypeface(typeface2);
            return;
        }
        if (i10 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i9 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else {
            if ((i9 & 4) != 0) {
                return;
            }
            textPaint.setTypeface(typeface);
        }
    }
}
