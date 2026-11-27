// default package

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class zl1 implements Supplier {
    public final /* synthetic */ byte a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ArrayList();
            default:
                return new HashSet();
        }
    }
}
