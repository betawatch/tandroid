// default package

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class zzc extends m0f {
    public final WindowInsetsController a;
    public final Window b;

    public zzc(Window window, x59 x59Var) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override // m0f
    public final void a() {
        this.a.hide(519);
    }

    @Override // m0f
    public final void b() {
        g(16);
        this.a.setSystemBarsAppearance(0, 16);
    }

    @Override // m0f
    public final void c(boolean z) {
        if (z) {
            f(TLObject.FLAG_13);
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            g(TLObject.FLAG_13);
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // m0f
    public void d() {
        this.b.getDecorView().setTag(356039078, 2);
        g(2048);
        f(TLObject.FLAG_12);
    }

    @Override // m0f
    public final void e() {
        this.a.show(519);
    }

    public final void f(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    public final void g(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }
}
