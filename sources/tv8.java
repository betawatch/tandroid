// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.location.Location;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tv8 extends FrameLayout {
    public int E;
    public boolean F;
    public d53 G;
    public lp7 H;
    public lp7 I;
    public yb6 J;
    public rv8 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public qv8 Q;
    public sb6 R;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public Rect n;
    public boolean r;
    public AnimatorSet s;
    public pv8 w;
    public boolean x;
    public int y;

    public final void a() {
        pv8 pv8Var = this.w;
        if (this.r) {
            return;
        }
        this.r = true;
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(pv8Var, (Property<pv8, Float>) View.TRANSLATION_Y, gm.L(10.0f) + pv8Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = pv8Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - pv8Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(d53.f);
        this.s.addListener(new sv8(this, (byte) 2));
        nm7.e().k(nm7.j1, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z) {
        pv8 pv8Var = this.w;
        byte b = 0;
        if (!this.r) {
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.f || this.e || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (this.e && !this.f && y > 0.0f && y / 3.0f > Math.abs(abs) && Math.abs(y) >= this.E) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float translationY = pv8Var.getTranslationY() + y;
                        pv8Var.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker == null) {
                        velocityTracker = VelocityTracker.obtain();
                        this.a = velocityTracker;
                    }
                    velocityTracker.computeCurrentVelocity(1000);
                    float translationY2 = pv8Var.getTranslationY();
                    if (this.f || translationY2 != 0.0f) {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((pv8Var.getTranslationY() >= gm.Z0(false, 0.8f) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.F = true;
                            a();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.h = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(pv8Var, (Property<pv8, Float>) View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, r6) / gm.Z0(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(d53.g);
                            this.h.addListener(new sv8(this, b));
                            nm7.e().k(nm7.j1, 512);
                            this.h.start();
                        }
                        this.f = false;
                    } else {
                        this.e = false;
                        this.f = false;
                    }
                    VelocityTracker velocityTracker2 = this.a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.a = null;
                    }
                    this.d = -1;
                }
            } else {
                this.b = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                this.c = y2;
                if (y2 < pv8Var.getTop() || this.b < pv8Var.getLeft() || this.b > pv8Var.getRight()) {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
                this.d = motionEvent.getPointerId(0);
                this.e = true;
                AnimatorSet animatorSet2 = this.h;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.h = null;
                }
                VelocityTracker velocityTracker3 = this.a;
                if (velocityTracker3 != null) {
                    velocityTracker3.clear();
                }
            }
            if ((!z && this.e) || this.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z) {
        boolean z2;
        TextView textView = this.L;
        TLRPC.User user = this.N;
        rv8 rv8Var = this.K;
        float value = getValue();
        String y = jb6.y(value, 2, Boolean.valueOf(this.P));
        int i = (int) value;
        pc6 pc6Var = this.J.b;
        ArrayList arrayList = pc6Var.o0;
        mj4 mj4Var = pc6Var.L;
        if (mj4Var != null) {
            mj4Var.A(i);
            if (z) {
                lj4 lj4Var = (lj4) ((k1f) a.j()).onCreateLatLngBoundsBuilder();
                lj4Var.z(new xj5(pc6Var.z0.getLatitude(), pc6Var.z0.getLongitude()));
                try {
                    int max = Math.max(i, nm7.Y3);
                    xj5 a = lj4Var.c().a();
                    double d = max;
                    xj5 z0 = pc6.z0(a, d, d);
                    double d2 = -max;
                    lj4Var.z(pc6.z0(a, d2, d2));
                    lj4Var.z(z0);
                    q05 c = lj4Var.c();
                    try {
                        pc6Var.F.n(gm.L(70.0f), 0, gm.L(70.0f), ((int) ((pc6Var.O.getCustomView().getMeasuredHeight() - gm.L(40.0f)) + pc6Var.P.getTranslationY())) + pc6Var.h0 + pc6Var.c0);
                        pc6Var.F.c(((k1f) a.j()).newCameraUpdateLatLngBounds(c, 0));
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!pg3.y(pc6Var.m0)) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                kc6 kc6Var = (kc6) arrayList.get(i2);
                if (kc6Var.b != null && !m9c.D(kc6Var.c)) {
                    TLRPC.GeoPoint geoPoint = kc6Var.b.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (pc6Var.z0.distanceTo(location) > i) {
                    }
                }
            }
            z2 = false;
            if (z2 && user != null) {
                textView.setText(jb6.a0("LocationNotifiationCloser", null, 2131748510, y));
                if (rv8Var.getTag() == null) {
                    rv8Var.setTag(1);
                    rv8Var.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                    textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    return;
                }
                return;
            }
            if (user != null) {
                rv8Var.setText(jb6.a0("LocationNotifiationButtonGroup", null, 2131748512, y));
            } else {
                rv8Var.setText(jb6.a0("LocationNotifiationButtonUser", null, 2131748511, TextUtils.ellipsize(m9c.k(user, true), rv8Var.getPaint(), Math.max(gm.L(10.0f), (int) (((this.O - gm.L(94.0f)) * 1.5f) - ((int) Math.ceil(rv8Var.getPaint().measureText(jb6.M0(2131748511, null)))))), TextUtils.TruncateAt.END), y));
            }
            if (rv8Var.getTag() == null) {
                rv8Var.setTag(null);
                rv8Var.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                textView.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                return;
            }
            return;
        }
        z2 = true;
        if (z2) {
        }
        if (user != null) {
        }
        if (rv8Var.getTag() == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.Q;
    }

    public boolean getRadiusSet() {
        return this.M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r1 > 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 * 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r1 > 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getValue() {
        float f;
        float value = this.H.getValue() * 1000;
        int value2 = this.I.getValue();
        boolean z = this.P;
        if (z) {
            if (value2 == 1) {
                f = 47.349f;
            }
        } else if (value2 == 1) {
            f = 50.0f;
        }
        float f2 = value + f;
        return z ? f2 * 1.60934f : f2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i4 - i2;
        pv8 pv8Var = this.w;
        int measuredHeight = i11 - pv8Var.getMeasuredHeight();
        int i12 = i3 - i;
        int measuredWidth = (i12 - pv8Var.getMeasuredWidth()) / 2;
        pv8Var.layout(measuredWidth, measuredHeight, pv8Var.getMeasuredWidth() + measuredWidth, pv8Var.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && childAt != pv8Var) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i14 = layoutParams.gravity;
                if (i14 == -1) {
                    i14 = 51;
                }
                int i15 = i14 & nm7.w1;
                int i16 = i14 & 7;
                if (i16 == 1) {
                    i5 = ((i12 - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i16 != 5) {
                    i7 = layoutParams.leftMargin;
                    if (i15 != 16) {
                        i8 = ((i11 - measuredHeight2) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    } else if (i15 != 80) {
                        i10 = layoutParams.topMargin;
                        childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                    } else {
                        i8 = i11 - measuredHeight2;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                } else {
                    i5 = i3 - measuredWidth2;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i15 != 16) {
                }
                i10 = i8 - i9;
                childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        tv8 tv8Var;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        pv8 pv8Var = this.w;
        pv8Var.measure(View.MeasureSpec.makeMeasureSpec((this.y << 1) + size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.getChildAt(i3);
            if (childAt.getVisibility() == 8 || childAt == pv8Var) {
                tv8Var = this;
            } else {
                tv8Var = this;
                tv8Var.measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), 0);
            }
            i3++;
            this = tv8Var;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.e && !this.f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
