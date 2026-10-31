package vh;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public kp f;
    public z6 h;
    public m0 n;
    public n5 r;
    public k0 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public static void a(n0 n0Var) {
        z6 z6Var = n0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 <= 28 || org.telegram.messenger.v2.b) && n0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = org.telegram.messenger.i0.W(n0Var.getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, zs.y1);
                return;
            }
            return;
        }
        if (n0Var.c || n0Var.r == null) {
            return;
        }
        if (n0Var.w != null) {
            if (i10 >= 30) {
                n0Var.getContext().getContentResolver().delete(n0Var.w, null);
                n0Var.w = null;
            } else if (i10 < 29) {
                try {
                    new File(n0Var.w.toString()).delete();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                n0Var.w = null;
            }
        }
        n0Var.c = true;
        m0 m0Var = n0Var.n;
        if (m0Var != null) {
            m0Var.a();
            n0Var.n = null;
        }
        k0 k0Var = n0Var.s;
        if (k0Var != null) {
            k0Var.a(true);
            n0Var.s = null;
        }
        if (z6Var != null) {
            n0Var.e = true;
            z6Var.a(new h0(n0Var, 0));
        }
        n0Var.d();
        if (z6Var == null) {
            n0Var.b();
        }
    }

    public final void b() {
        n5 n5Var;
        if (!this.e || (n5Var = this.r) == null) {
            return;
        }
        int i10 = 0;
        this.e = false;
        int i11 = 1;
        if (n5Var.E()) {
            this.d = true;
            m0 m0Var = new m0(getContext());
            this.n = m0Var;
            m0Var.setOnCancelListener(new h0(this, i11));
            this.b.addView(this.n);
            File s02 = org.telegram.messenger.i0.s0(false);
            this.s = new k0(this.a, this.r, s02, new i0(this, s02, i10), new j0(this, i10), new h0(this, 2));
        } else {
            this.d = false;
            File q02 = org.telegram.messenger.i0.q0("png", false);
            if (q02 == null) {
                this.n.b(R.raw.error, 3500, cd.M0("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.i.c(new i0(this, q02, i11));
        }
        d();
    }

    public final void c(String str) {
        m0 m0Var = this.n;
        if (m0Var != null) {
            m0Var.a();
            this.n = null;
        }
        m0 m0Var2 = new m0(getContext());
        this.n = m0Var2;
        m0Var2.b(R.raw.error, 3500, str);
        this.b.addView(this.n);
    }

    public final void d() {
        boolean z10 = this.x;
        boolean z11 = this.c;
        boolean z12 = false;
        if (z10 != (z11 && !this.d)) {
            boolean z13 = z11 && !this.d;
            this.x = z13;
            if (z13) {
                org.telegram.messenger.i0.R3(this, this.f);
            } else {
                org.telegram.messenger.i0.Q3(this, R.drawable.media_download);
            }
        }
        if (this.y != (this.c && this.d)) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.c && this.d) {
                z12 = true;
            }
            this.y = z12;
            animate.alpha(z12 ? 0.4f : 1.0f).start();
        }
    }

    public void setEntry(n5 n5Var) {
        this.w = null;
        this.r = n5Var;
        k0 k0Var = this.s;
        if (k0Var != null) {
            k0Var.a(true);
            this.s = null;
        }
        m0 m0Var = this.n;
        if (m0Var != null) {
            m0Var.a();
            this.n = null;
        }
        if (n5Var == null) {
            this.c = false;
            d();
        }
    }
}
