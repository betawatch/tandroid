package qh;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n0 extends ImageView {
    public int a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public tp f;
    public g8 h;
    public m0 n;
    public r6 r;
    public k0 s;
    public Uri v;
    public boolean w;
    public boolean x;

    public static void a(n0 n0Var) {
        g8 g8Var = n0Var.h;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && n0Var.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
            Activity findActivity = AndroidUtilities.findActivity(n0Var.getContext());
            if (findActivity != null) {
                findActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                return;
            }
            return;
        }
        if (n0Var.c || n0Var.r == null) {
            return;
        }
        if (n0Var.v != null) {
            if (i10 >= 30) {
                n0Var.getContext().getContentResolver().delete(n0Var.v, null);
                n0Var.v = null;
            } else if (i10 < 29) {
                try {
                    new File(n0Var.v.toString()).delete();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                n0Var.v = null;
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
        if (g8Var != null) {
            n0Var.e = true;
            g8Var.run(new h0(n0Var, 0));
        }
        n0Var.d();
        if (g8Var == null) {
            n0Var.b();
        }
    }

    public final void b() {
        r6 r6Var;
        if (!this.e || (r6Var = this.r) == null) {
            return;
        }
        this.e = false;
        if (r6Var.E()) {
            this.d = true;
            m0 m0Var = new m0(getContext());
            this.n = m0Var;
            m0Var.setOnCancelListener(new h0(this, 1));
            this.b.addView(this.n);
            File generateVideoPath = AndroidUtilities.generateVideoPath();
            this.s = new k0(this.a, this.r, generateVideoPath, new i0(this, generateVideoPath, 0), new j0(this, 0), new h0(this, 2));
        } else {
            this.d = false;
            File generatePicturePath = AndroidUtilities.generatePicturePath(false, "png");
            if (generatePicturePath == null) {
                this.n.b(R.raw.error, 3500, LocaleController.getString("UnknownError"));
                this.c = false;
                d();
                return;
            }
            Utilities.themeQueue.postRunnable(new i0(this, generatePicturePath, 1));
        }
        d();
    }

    public final void c(int i10, String str) {
        m0 m0Var = this.n;
        if (m0Var != null) {
            m0Var.a();
            this.n = null;
        }
        m0 m0Var2 = new m0(getContext());
        this.n = m0Var2;
        m0Var2.b(i10, 3500, str);
        this.b.addView(this.n);
    }

    public final void d() {
        boolean z4 = this.w;
        boolean z10 = this.c;
        boolean z11 = false;
        if (z4 != (z10 && !this.d)) {
            boolean z12 = z10 && !this.d;
            this.w = z12;
            if (z12) {
                AndroidUtilities.updateImageViewImageAnimated(this, this.f);
            } else {
                AndroidUtilities.updateImageViewImageAnimated(this, R.drawable.media_download);
            }
        }
        if (this.x != (this.c && this.d)) {
            clearAnimation();
            ViewPropertyAnimator animate = animate();
            if (this.c && this.d) {
                z11 = true;
            }
            this.x = z11;
            animate.alpha(z11 ? 0.4f : 1.0f).start();
        }
    }

    public void setEntry(r6 r6Var) {
        this.v = null;
        this.r = r6Var;
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
        if (r6Var == null) {
            this.c = false;
            d();
        }
    }
}
