// default package

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1f implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lja b;

    public /* synthetic */ z1f(lja ljaVar, byte b) {
        this.a = b;
        this.b = ljaVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
