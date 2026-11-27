// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class py8 {
    public static final py8 a;
    public static final /* synthetic */ py8[] b;

    static {
        py8 py8Var = new py8("DEFAULT", 0);
        a = py8Var;
        py8 py8Var2 = new py8("UNMETERED_ONLY", 1);
        py8 py8Var3 = new py8("UNMETERED_OR_DAILY", 2);
        py8 py8Var4 = new py8("FAST_IF_RADIO_AWAKE", 3);
        py8 py8Var5 = new py8("NEVER", 4);
        py8 py8Var6 = new py8("UNRECOGNIZED", 5);
        b = new py8[]{py8Var, py8Var2, py8Var3, py8Var4, py8Var5, py8Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, py8Var);
        sparseArray.put(1, py8Var2);
        sparseArray.put(2, py8Var3);
        sparseArray.put(3, py8Var4);
        sparseArray.put(4, py8Var5);
        sparseArray.put(-1, py8Var6);
    }

    public static py8 valueOf(String str) {
        return (py8) Enum.valueOf(py8.class, str);
    }

    public static py8[] values() {
        return (py8[]) b.clone();
    }
}
