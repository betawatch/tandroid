// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tk implements View.OnLayoutChangeListener {
    public final /* synthetic */ d79 a;
    public final /* synthetic */ Runnable b;

    public tk(d79 d79Var, Runnable runnable) {
        this.a = d79Var;
        this.b = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
