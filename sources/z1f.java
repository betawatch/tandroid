// default package

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
