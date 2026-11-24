// default package

import android.view.View;
import android.view.Window;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class wxc extends kye {
    public final Window a;
    public final u39 b;

    public wxc(Window window, u39 u39Var) {
        this.a = window;
        this.b = u39Var;
    }

    @Override // kye
    public final void a() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    f(4);
                } else if (i == 2) {
                    f(2);
                } else if (i == 8) {
                    ((g29) this.b.b).l();
                }
            }
        }
    }

    @Override // kye
    public final void c(boolean z) {
        if (!z) {
            g(TLObject.FLAG_13);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(TLObject.FLAG_31);
        f(TLObject.FLAG_13);
    }

    @Override // kye
    public final void d() {
        this.a.getDecorView().setTag(356039078, 2);
        g(2048);
        f(TLObject.FLAG_12);
    }

    @Override // kye
    public final void e() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    g(4);
                    this.a.clearFlags(1024);
                } else if (i == 2) {
                    g(2);
                } else if (i == 8) {
                    ((g29) this.b.b).n();
                }
            }
        }
    }

    public final void f(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i);
    }

    public final void g(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i));
    }
}
