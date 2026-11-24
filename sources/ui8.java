// default package

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ui8 extends gu4 {
    private static final ui8 DEFAULT_INSTANCE;
    private static volatile ax7 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private lr5 strings_ = hv8.d;

    static {
        ui8 ui8Var = new ui8();
        DEFAULT_INSTANCE = ui8Var;
        gu4.j(ui8.class, ui8Var);
    }

    public static ui8 m() {
        return DEFAULT_INSTANCE;
    }

    public static ti8 o() {
        return (ti8) ((eu4) DEFAULT_INSTANCE.c(5));
    }

    @Override // gu4
    public final Object c(int i) {
        ax7 ax7Var;
        switch (wi8.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new j19(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new ui8();
            case 4:
                return new ti8(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ax7 ax7Var2 = PARSER;
                if (ax7Var2 != null) {
                    return ax7Var2;
                }
                synchronized (ui8.class) {
                    ax7Var = PARSER;
                    if (ax7Var == null) {
                        ax7Var = new fu4();
                        PARSER = ax7Var;
                    }
                }
                return ax7Var;
            default:
                gxc.b();
                return null;
        }
    }

    public final void l(Set set) {
        lr5 lr5Var = this.strings_;
        boolean z = ((s3) lr5Var).a;
        lr5 lr5Var2 = lr5Var;
        if (!z) {
            int size = lr5Var.size();
            hv8 j = ((hv8) lr5Var).j(size == 0 ? 10 : size << 1);
            this.strings_ = j;
            lr5Var2 = j;
        }
        Charset charset = mr5.a;
        if (lr5Var2 instanceof ArrayList) {
            ((ArrayList) lr5Var2).ensureCapacity(set.size() + lr5Var2.size());
        }
        int size2 = lr5Var2.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (lr5Var2.size() - size2) + " is null.";
                for (int size3 = lr5Var2.size() - 1; size3 >= size2; size3--) {
                    lr5Var2.remove(size3);
                }
                gxc.d(str);
                return;
            }
            lr5Var2.add(obj);
        }
    }

    public final lr5 n() {
        return this.strings_;
    }
}
