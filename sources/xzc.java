// default package

import android.view.View;
import android.view.Window;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class xzc extends m0f {
    public final Window a;
    public final x59 b;

    public xzc(Window window, x59 x59Var) {
        this.a = window;
        this.b = x59Var;
    }

    @Override // m0f
    public final void a() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    f(4);
                } else if (i == 2) {
                    f(2);
                } else if (i == 8) {
                    ((et8) this.b.b).o();
                }
            }
        }
    }

    @Override // m0f
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

    @Override // m0f
    public final void d() {
        this.a.getDecorView().setTag(356039078, 2);
        g(2048);
        f(TLObject.FLAG_12);
    }

    @Override // m0f
    public final void e() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    g(4);
                    this.a.clearFlags(1024);
                } else if (i == 2) {
                    g(2);
                } else if (i == 8) {
                    ((et8) this.b.b).r();
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
