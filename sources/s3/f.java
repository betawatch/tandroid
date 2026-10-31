package s3;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends b {
    public final List a;

    public f(ArrayList arrayList) {
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }
}
