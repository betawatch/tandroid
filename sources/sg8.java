// default package

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sg8 extends fs4 {
    private static final sg8 DEFAULT_INSTANCE;
    private static volatile zu7 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private lp5 strings_ = gt8.d;

    static {
        sg8 sg8Var = new sg8();
        DEFAULT_INSTANCE = sg8Var;
        fs4.j(sg8.class, sg8Var);
    }

    public static sg8 m() {
        return DEFAULT_INSTANCE;
    }

    public static rg8 o() {
        return (rg8) ((ds4) DEFAULT_INSTANCE.c(5));
    }

    @Override // fs4
    public final Object c(int i) {
        zu7 zu7Var;
        switch (ug8.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new iz8(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new sg8();
            case 4:
                return new rg8(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                zu7 zu7Var2 = PARSER;
                if (zu7Var2 != null) {
                    return zu7Var2;
                }
                synchronized (sg8.class) {
                    zu7Var = PARSER;
                    if (zu7Var == null) {
                        zu7Var = new es4();
                        PARSER = zu7Var;
                    }
                }
                return zu7Var;
            default:
                fvc.b();
                return null;
        }
    }

    public final void l(Set set) {
        lp5 lp5Var = this.strings_;
        boolean z = ((s3) lp5Var).a;
        lp5 lp5Var2 = lp5Var;
        if (!z) {
            int size = lp5Var.size();
            gt8 j = ((gt8) lp5Var).j(size == 0 ? 10 : size << 1);
            this.strings_ = j;
            lp5Var2 = j;
        }
        Charset charset = mp5.a;
        if (lp5Var2 instanceof ArrayList) {
            ((ArrayList) lp5Var2).ensureCapacity(set.size() + lp5Var2.size());
        }
        int size2 = lp5Var2.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (lp5Var2.size() - size2) + " is null.";
                for (int size3 = lp5Var2.size() - 1; size3 >= size2; size3--) {
                    lp5Var2.remove(size3);
                }
                fvc.f(str);
                return;
            }
            lp5Var2.add(obj);
        }
    }

    public final lp5 n() {
        return this.strings_;
    }
}
