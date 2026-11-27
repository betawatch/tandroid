// default package

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class w94 extends FrameLayout implements snb {
    public int E;
    public final vnb a;
    public int b;
    public final im7 c;
    public final FrameLayout d;
    public final ei2 e;
    public final oe7 f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public boolean w;
    public boolean x;
    public boolean y;

    public w94(Context context, im7 im7Var, vnb vnbVar, oe7 oe7Var) {
        super(context);
        int i;
        this.E = -1;
        this.c = im7Var;
        this.f = oe7Var;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        addView(im7Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        int L = hl.L(20.0f);
        int i2 = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        frameLayout.setBackground(b0);
        yob.j(frameLayout, b0, M, null, vnbVar);
        frameLayout.setElevation(hl.L(4.0f));
        addView(frameLayout, tre.e(40, 40, 49));
        ei2 ei2Var = new ei2(context);
        this.e = ei2Var;
        float f = ei2Var.c.getDisplayMetrics().density;
        float f2 = 2.5f * f;
        ci2 ci2Var = ei2Var.a;
        ci2Var.h = f2;
        ci2Var.b.setStrokeWidth(f2);
        ci2Var.q = 7.5f * f;
        ci2Var.a(0);
        ci2Var.r = (int) (10.0f * f);
        ci2Var.s = (int) (5.0f * f);
        ei2Var.invalidateSelf();
        float L2 = hl.L(2.25f);
        ci2Var.h = L2;
        ci2Var.b.setStrokeWidth(L2);
        ei2Var.invalidateSelf();
        this.a = vnbVar;
        int v0 = aob.v0(aob.Fi, vnbVar);
        this.b = v0;
        ci2Var.i = new int[]{v0};
        ci2Var.a(0);
        ci2Var.a(0);
        ei2Var.invalidateSelf();
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(ei2Var);
        frameLayout.addView(imageView, tre.e(32, 32, 17));
        frameLayout.setImportantForAccessibility(2);
        String M0 = ob6.M0(2131746067, null);
        u34 u34Var = new u34(this, oe7Var, (byte) 1);
        ArrayList f3 = ihc.f(im7Var);
        int i3 = 0;
        while (true) {
            if (i3 >= f3.size()) {
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    int[] iArr = ihc.d;
                    if (i5 >= 32 || i4 != -1) {
                        break;
                    }
                    int i6 = iArr[i5];
                    boolean z = true;
                    for (int i7 = 0; i7 < f3.size(); i7++) {
                        z &= ((s4) f3.get(i7)).a() != i6;
                    }
                    if (z) {
                        i4 = i6;
                    }
                    i5++;
                }
                i = i4;
            } else {
                if (TextUtils.equals(M0, ((AccessibilityNodeInfo.AccessibilityAction) ((s4) f3.get(i3)).a).getLabel())) {
                    i = ((s4) f3.get(i3)).a();
                    break;
                }
                i3++;
            }
        }
        if (i != -1) {
            s4 s4Var = new s4(null, i, M0, u34Var, null);
            View.AccessibilityDelegate e = ihc.e(im7Var);
            r4 r4Var = e != null ? e instanceof q4 ? ((q4) e).a : new r4(e) : null;
            ihc.l(im7Var, r4Var == null ? new r4() : r4Var);
            int a = s4Var.a();
            ArrayList f4 = ihc.f(im7Var);
            int i8 = 0;
            while (true) {
                if (i8 >= f4.size()) {
                    break;
                }
                if (((s4) f4.get(i8)).a() == a) {
                    f4.remove(i8);
                    break;
                }
                i8++;
            }
            ihc.f(im7Var).add(s4Var);
            ihc.h(0, im7Var);
        }
        b();
    }

    public final void a(boolean z) {
        this.w = false;
        this.x = false;
        this.E = -1;
        getParent().requestDisallowInterceptTouchEvent(false);
        if (!z) {
            setRefreshing(false);
        } else {
            setRefreshing(true);
            this.f.run();
        }
    }

    public final void b() {
        FrameLayout frameLayout = this.d;
        frameLayout.setVisibility(4);
        frameLayout.setTranslationY(-hl.L(48.0f));
        frameLayout.setAlpha(0.0f);
        this.e.stop();
        this.s = 0.0f;
        this.c.setTranslationY(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.y) {
            ei2 ei2Var = this.e;
            if (ei2Var.d.isRunning()) {
                return;
            }
            ei2Var.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.e.stop();
        this.d.animate().cancel();
        this.c.animate().cancel();
        this.w = false;
        this.x = false;
        this.E = -1;
        if (!this.y) {
            b();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r0 != 3) goto L35;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        im7 im7Var = this.c;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.E);
                    if (this.w && findPointerIndex >= 0) {
                        float x = motionEvent.getX(findPointerIndex) - this.n;
                        float y = motionEvent.getY(findPointerIndex) - this.r;
                        float abs = Math.abs(x);
                        float f = this.h;
                        if ((abs > f && Math.abs(x) > Math.abs(y)) || y < (-r6)) {
                            this.w = false;
                        } else if (y > f && y > Math.abs(x) && !im7Var.canScrollVertically(-1)) {
                            this.x = true;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                }
            }
            this.w = false;
            this.E = -1;
        } else {
            this.E = motionEvent.getPointerId(0);
            this.n = motionEvent.getX();
            this.r = motionEvent.getY();
            this.w = (this.y || im7Var.canScrollVertically(-1)) ? false : true;
            this.x = false;
        }
        return this.x;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.x) {
            return super.onTouchEvent(motionEvent);
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.E);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            a(this.s >= ((float) hl.L(72.0f)));
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3 && actionMasked != 5 && actionMasked != 6) {
                return true;
            }
            a(false);
            return true;
        }
        if (findPointerIndex < 0) {
            a(false);
            return true;
        }
        this.s = Math.min(hl.L(112.0f), Math.max(0.0f, ((motionEvent.getY(findPointerIndex) - this.r) - this.h) * 0.5f));
        FrameLayout frameLayout = this.d;
        frameLayout.animate().cancel();
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(Math.min(1.0f, this.s / hl.L(48.0f)));
        frameLayout.setTranslationY((this.s - hl.L(40.0f)) / 2.0f);
        im7 im7Var = this.c;
        im7Var.animate().cancel();
        im7Var.setTranslationY(this.s);
        float max = (Math.max(Math.min(1.0f, this.s / hl.L(72.0f)) - 0.4f, 0.0f) * 5.0f) / 3.0f;
        ei2 ei2Var = this.e;
        ci2 ci2Var = ei2Var.a;
        ci2 ci2Var2 = ei2Var.a;
        if (!ci2Var.n) {
            ci2Var.n = true;
        }
        ei2Var.invalidateSelf();
        if (max != ci2Var2.p) {
            ci2Var2.p = max;
        }
        ei2Var.invalidateSelf();
        ci2Var2.e = 0.0f;
        ci2Var2.f = 0.8f * max;
        ei2Var.invalidateSelf();
        ci2Var2.g = bp1.g(max, 0.4f, -0.25f, 0.5f, Math.max(0.0f, this.s - hl.L(72.0f)) / hl.L(80.0f));
        ei2Var.invalidateSelf();
        return true;
    }

    public void setIndicatorTop(int i) {
        FrameLayout frameLayout = this.d;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.topMargin == i) {
            return;
        }
        layoutParams.topMargin = i;
        frameLayout.requestLayout();
    }

    public void setRefreshing(boolean z) {
        boolean z2 = this.y;
        this.y = z;
        FrameLayout frameLayout = this.d;
        frameLayout.animate().cancel();
        im7 im7Var = this.c;
        im7Var.animate().cancel();
        if (!z) {
            im7Var.animate().translationY(0.0f).setDuration(180L).start();
            frameLayout.animate().translationY(-hl.L(20.0f)).alpha(0.0f).setDuration(180L).withEndAction(new lw3((Object) this, (byte) 14)).start();
            return;
        }
        frameLayout.setVisibility(0);
        if (!z2) {
            this.e.start();
        }
        frameLayout.animate().translationY(hl.L(16.0f)).alpha(1.0f).setDuration(180L).start();
        im7Var.animate().translationY(hl.L(72.0f)).setDuration(180L).start();
    }

    @Override // snb
    public final void updateColors() {
        ei2 ei2Var = this.e;
        if (ei2Var != null) {
            try {
                int v0 = aob.v0(aob.Fi, this.a);
                if (v0 != this.b) {
                    this.b = v0;
                    int[] iArr = {v0};
                    ci2 ci2Var = ei2Var.a;
                    ci2Var.i = iArr;
                    ci2Var.a(0);
                    ci2Var.a(0);
                    ei2Var.invalidateSelf();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
