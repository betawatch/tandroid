package t7;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb.k b;

    public /* synthetic */ p(jb.k kVar, int i10) {
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
