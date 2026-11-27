// default package

import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rc1 {
    public static final rc1 b = new rc1(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet a = new HashSet();

    static {
        new rc1(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public rc1(int[] iArr) {
        for (int i : iArr) {
            this.a.add(Integer.valueOf(i));
        }
    }
}
