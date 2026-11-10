package v3;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f extends b {
    public final List a;

    public f(ArrayList arrayList) {
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }
}
