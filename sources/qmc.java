// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.OrientationHelper;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class qmc extends FrameLayout {
    public Activity a;
    public boolean b;
    public pn c;
    public VelocityTracker d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public boolean r;

    public static WindowManager.LayoutParams a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.format = -2;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        layoutParams.screenOrientation = 1;
        hl.m(layoutParams);
        layoutParams.flags = -2144665216;
        return layoutParams;
    }

    public final void b() {
        c(330L);
    }

    public final void c(long j) {
        if (this.f) {
            return;
        }
        this.f = true;
        if (mkc.m1 != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = mkc.m1.u0.getMeasuredHeight();
                if (mkc.m1.D0 && !VoIPService.getSharedInstance().isConverting()) {
                    mkc mkcVar = mkc.m1;
                    dlc.f(mkcVar.b, mkcVar.a, mkcVar.u0.getMeasuredWidth(), measuredHeight, 0);
                    WindowInsets windowInsets = mkc.m1.r0;
                    if (windowInsets != null) {
                        dlc.W = windowInsets.getSystemWindowInsetTop();
                        mkc.m1.r0.getSystemWindowInsetBottom();
                    }
                }
            }
            mkc.m1.d0.d.e();
            mkc.m1.e0.d.e();
            mkc.m1.c0.e();
            mkc.m1.b();
        }
        mkc.m1 = null;
        elc.c();
        if (this.b) {
            try {
                ((WindowManager) this.a.getSystemService("window")).removeView(this);
            } catch (Exception unused) {
            }
        } else {
            this.c.d();
            animate().translationY(getMeasuredHeight()).alpha(0.0f).setListener(new omb(this, (byte) 21)).setDuration(j).setInterpolator(k43.f).start();
        }
    }

    public final void d() {
        if (getParent() != null) {
            hl.K3(this.a);
            WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
            setVisibility(8);
            windowManager.removeView(this);
            OrientationHelper.cameraRotationDisabled = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.b) {
            return;
        }
        setTranslationY(getMeasuredHeight());
        setAlpha(0.0f);
        animate().translationY(0.0f).alpha(1.0f).setDuration(330L).setInterpolator(k43.f).start();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            if (motionEvent.getAction() == 0) {
                this.h = motionEvent.getX();
                this.n = motionEvent.getY();
                VelocityTracker velocityTracker = this.d;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    this.d = velocityTracker;
                }
                velocityTracker.clear();
                return false;
            }
            if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX() - this.h;
                float y = motionEvent.getY() - this.n;
                if (!this.r && Math.abs(y) > hl.Z0(true, 0.4f) && Math.abs(y) / 3.0f > x) {
                    this.n = motionEvent.getY();
                    this.r = true;
                    y = 0.0f;
                }
                if (this.r) {
                    float f = y >= 0.0f ? y : 0.0f;
                    VelocityTracker velocityTracker2 = this.d;
                    if (velocityTracker2 == null) {
                        velocityTracker2 = VelocityTracker.obtain();
                        this.d = velocityTracker2;
                    }
                    velocityTracker2.addMovement(motionEvent);
                    setTranslationY(f);
                }
                return this.r;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                float translationY = getTranslationY();
                VelocityTracker velocityTracker3 = this.d;
                if (velocityTracker3 == null) {
                    velocityTracker3 = VelocityTracker.obtain();
                    this.d = velocityTracker3;
                }
                velocityTracker3.computeCurrentVelocity(1000);
                float xVelocity = this.d.getXVelocity();
                float yVelocity = this.d.getYVelocity();
                if (translationY >= getMeasuredHeight() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    c(Math.max((int) ((200.0f / getMeasuredHeight()) * (getMeasuredHeight() - getTranslationY())), 50));
                } else {
                    animate().translationY(0.0f).start();
                }
                this.r = false;
                return false;
            }
        }
        return false;
    }

    public void setLockOnScreen(boolean z) {
        this.b = z;
    }
}
