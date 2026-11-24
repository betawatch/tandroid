// default package

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yx3 extends bhe {
    public final /* synthetic */ bhe a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public yx3(bhe bheVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = bheVar;
        this.b = threadPoolExecutor;
    }

    @Override // bhe
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // bhe
    public final void b(e7a e7aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(e7aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
