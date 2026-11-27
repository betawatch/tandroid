// default package

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class yd9 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(xd9 xd9Var, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            WeakHashMap weakHashMap = b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(xd9Var);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(xd9Var, sparseArray);
            }
            sparseArray.append(i, new wd9(colorStateList, xd9Var.a.getConfiguration(), theme));
        }
    }
}
