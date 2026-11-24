// default package

import java.util.function.IntFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class z77 implements IntFunction {
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
