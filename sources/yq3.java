// default package

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yq3 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public wi2 f;
    public g8b h;
    public xq3 n;
    public g6b r;
    public vq3 s;
    public Uri w;
    public boolean x;
    public boolean y;

    public final void a() {
        g8b g8bVar = this.h;
        int i = Build.VERSION.SDK_INT;
        if ((i <= 28 || e21.b) && getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            Activity W = gm.W(getContext());
            if (W != null) {
                W.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, nm7.x1);
                return;
            }
            return;
        }
        if (this.c || this.r == null) {
            return;
        }
        if (this.w != null) {
            if (i >= 30) {
                getContext().getContentResolver().delete(this.w, null);
                this.w = null;
            } else if (i < 29) {
                try {
                    new File(this.w.toString()).delete();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                this.w = null;
            }
        }
        this.c = true;
        xq3 xq3Var = this.n;
        if (xq3Var != null) {
            xq3Var.a();
            this.n = null;
        }
        vq3 vq3Var = this.s;
        if (vq3Var != null) {
            vq3Var.a(true);
            this.s = null;
        }
        if (g8bVar != null) {
            this.e = true;
            g8bVar.a(new sq3(this, (byte) 0));
        }
        d();
        if (g8bVar == null) {
            b();
        }
    }

    public final void b() {
        g6b g6bVar;
        if (!this.e || (g6bVar = this.r) == null) {
            return;
        }
        byte b = 0;
        this.e = false;
        byte b2 = 1;
        if (g6bVar.D()) {
            this.d = true;
            xq3 xq3Var = new xq3(getContext());
            this.n = xq3Var;
            xq3Var.setOnCancelListener(new sq3(this, b2));
            this.b.addView(this.n);
            File s0 = gm.s0(false);
            this.s = new vq3(this.a, this.r, s0, new tq3(this, s0, b), new uq3(this, b), new sq3(this, (byte) 2));
        } else {
            this.d = false;
            File q0 = gm.q0("png", false);
            if (q0 == null) {
                this.n.b(R.raw.error, 3500, jb6.N0("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.i.c(new tq3(this, q0, b2));
        }
        d();
    }

    public final void c(String str) {
        xq3 xq3Var = this.n;
        if (xq3Var != null) {
            xq3Var.a();
            this.n = null;
        }
        xq3 xq3Var2 = new xq3(getContext());
        this.n = xq3Var2;
        xq3Var2.b(R.raw.error, 3500, str);
        this.b.addView(this.n);
    }

    public final void d() {
        boolean z = this.x;
        boolean z2 = this.c;
        boolean z3 = false;
        if (z != (z2 && !this.d)) {
            boolean z4 = z2 && !this.d;
            this.x = z4;
            if (z4) {
                gm.M3(this, this.f);
            } else {
                gm.L3(this, R.drawable.media_download);
            }
        }
        if (this.y != (this.c && this.d)) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.c && this.d) {
                z3 = true;
            }
            this.y = z3;
            animate.alpha(z3 ? 0.4f : 1.0f).start();
        }
    }

    public void setEntry(g6b g6bVar) {
        this.w = null;
        this.r = g6bVar;
        vq3 vq3Var = this.s;
        if (vq3Var != null) {
            vq3Var.a(true);
            this.s = null;
        }
        xq3 xq3Var = this.n;
        if (xq3Var != null) {
            xq3Var.a();
            this.n = null;
        }
        if (g6bVar == null) {
            this.c = false;
            d();
        }
    }
}
