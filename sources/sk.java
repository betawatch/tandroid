// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sk implements View.OnLayoutChangeListener {
    public final /* synthetic */ o39 a;
    public final /* synthetic */ Runnable b;

    public sk(o39 o39Var, Runnable runnable) {
        this.a = o39Var;
        this.b = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
