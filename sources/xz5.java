// default package

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xz5 implements OnBackAnimationCallback {
    public boolean b;
    public boolean e;
    public final /* synthetic */ LaunchActivity f;
    public final on a = new on(null);
    public boolean c = false;
    public boolean d = false;

    public xz5(LaunchActivity launchActivity) {
        this.f = launchActivity;
    }

    public final void onBackCancelled() {
        ActionBarLayout actionBarLayout;
        this.c = false;
        this.d = false;
        if (this.b) {
            this.a.e();
            this.b = false;
        }
        if (gl.O1() || (actionBarLayout = this.f.p0) == null || !actionBarLayout.j1) {
            return;
        }
        actionBarLayout.j1 = false;
        actionBarLayout.d(true);
    }

    public final void onBackInvoked() {
        this.d = true;
        if (this.b) {
            this.a.e();
            this.b = false;
        }
        boolean O1 = gl.O1();
        LaunchActivity launchActivity = this.f;
        if (O1) {
            launchActivity.onBackPressed();
            return;
        }
        if (launchActivity.d0(true)) {
            ActionBarLayout actionBarLayout = launchActivity.p0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.j1) {
                actionBarLayout.G();
            } else {
                actionBarLayout.j1 = false;
                actionBarLayout.d(false);
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (this.c && this.d) {
            return;
        }
        float progress = backEvent.getProgress();
        boolean z = this.e;
        LaunchActivity launchActivity = this.f;
        if (!z && progress > 0.015f) {
            this.e = true;
            if (!gl.O1() && launchActivity.d0(false) && (actionBarLayout2 = launchActivity.p0) != null && actionBarLayout2.H(backEvent.getTouchX(), backEvent.getTouchY()) && !this.b) {
                this.a.d();
                this.b = true;
            }
        }
        float max = Math.max(0.0f, progress - 0.015f) / 0.985f;
        if (gl.O1() || (actionBarLayout = launchActivity.p0) == null || !actionBarLayout.j1) {
            return;
        }
        float interpolation = s33.l.getInterpolation(max) * gl.L(56.0f);
        actionBarLayout.l1 = max > 0.0f;
        actionBarLayout.s.setTranslationX(interpolation);
        actionBarLayout.setInnerTranslationX(interpolation);
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.c = true;
        this.d = false;
        this.e = false;
    }
}
