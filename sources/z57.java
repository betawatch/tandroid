// default package

import java.util.function.IntFunction;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class z57 implements IntFunction {
    public final /* synthetic */ byte a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new int[i][];
            default:
                return String.valueOf(i);
        }
    }
}
