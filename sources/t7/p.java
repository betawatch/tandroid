package t7;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb.k b;

    public /* synthetic */ p(qb.k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
