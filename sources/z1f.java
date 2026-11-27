// default package

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
