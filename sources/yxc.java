// default package

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class yxc extends kye {
    public final WindowInsetsController a;
    public final Window b;

    public yxc(Window window, u39 u39Var) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override // kye
    public final void a() {
        this.a.hide(519);
    }

    @Override // kye
    public final void b() {
        g(16);
        this.a.setSystemBarsAppearance(0, 16);
    }

    @Override // kye
    public final void c(boolean z) {
        if (z) {
            f(TLObject.FLAG_13);
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            g(TLObject.FLAG_13);
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // kye
    public void d() {
        this.b.getDecorView().setTag(356039078, 2);
        g(2048);
        f(TLObject.FLAG_12);
    }

    @Override // kye
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
