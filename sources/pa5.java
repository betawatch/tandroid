// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class pa5 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final oa5 e;
    public final jm3 f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ra5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa5(ra5 ra5Var, Context context, float f) {
        super(context);
        this.n = ra5Var;
        this.h = f;
        this.e = new oa5(this);
        this.f = new jm3((byte) 15);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Point point = hl.q;
        int i3 = point.x;
        ra5 ra5Var = this.n;
        if (i3 == ra5Var.K && ra5Var.L == point.y) {
            return;
        }
        ra5Var.K = i3;
        ra5Var.L = point.y;
        if (ra5Var.M < 0.0f) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("groupcallpipconfig", 0);
            this.n.M = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.N = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        ra5 ra5Var2 = ra5.f0;
        if (ra5Var2 != null) {
            ra5 ra5Var3 = this.n;
            float f = ra5Var3.M;
            float f2 = ra5Var3.N;
            float f3 = -hl.L(36.0f);
            ra5Var2.s.x = (int) qd4.A(point.x - (2.0f * f3), hl.L(105.0f), f, f3);
            ra5Var2.s.y = (int) ((point.y - hl.L(105.0f)) * f2);
            ra5Var2.i();
            pa5 pa5Var = ra5Var2.a;
            if (pa5Var.getParent() != null) {
                ra5Var2.n.updateViewLayout(pa5Var, ra5Var2.s);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r5 != 3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        ra5 ra5Var;
        ra5 ra5Var2;
        xa5 xa5Var;
        ValueAnimator valueAnimator;
        boolean z3 = false;
        if (ra5.f0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.I);
            ra5 ra5Var3 = this.n;
            int i = ra5Var3.I[0];
            WindowManager.LayoutParams layoutParams = ra5Var3.s;
            ra5Var3.S = i - layoutParams.x;
            ra5Var3.T = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            hl.d3(this.e, 300L);
            ra5 ra5Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = ra5Var4.s;
            ra5Var4.Q = layoutParams2.x;
            ra5Var4.R = layoutParams2.y;
            ra5Var4.Z = true;
            ra5Var4.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f2 = rawX - this.a;
                float f3 = rawY - this.b;
                if (!this.n.Y) {
                    float f4 = (f3 * f3) + (f2 * f2);
                    float f5 = this.h;
                    if (f4 > f5 * f5) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        hl.r(this.e);
                        ra5 ra5Var5 = this.n;
                        ra5Var5.Y = true;
                        ra5Var5.g(true);
                        this.n.f(false);
                        this.a = rawX;
                        this.b = rawY;
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                }
                ra5 ra5Var6 = this.n;
                if (ra5Var6.Y) {
                    ra5Var6.Q += f2;
                    ra5Var6.R += f3;
                    this.a = rawX;
                    this.b = rawY;
                    ra5Var6.j();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.Q;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.R;
                    float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.P - this.n.S);
                    float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.O - this.n.T);
                    float f6 = measuredWidth - measuredWidth2;
                    float f7 = measuredHeight - measuredHeight2;
                    float f8 = (f7 * f7) + (f6 * f6);
                    if (f8 < hl.L(80.0f) * hl.L(80.0f)) {
                        f = 0.0f;
                        this.n.W.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f6 / f7)));
                        if (f8 < hl.L(50.0f) * hl.L(50.0f)) {
                            z = true;
                        } else {
                            z = false;
                            z2 = true;
                            ra5Var = this.n;
                            if (!ra5Var.H && ra5Var.c0 != z) {
                                ra5Var.c0 = z;
                                valueAnimator = ra5Var.e0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    ra5Var.e0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(ra5Var.d0, !z ? 1.0f : f);
                                ra5Var.e0 = ofFloat;
                                ofFloat.addUpdateListener(new ch4(ra5Var, (byte) 8));
                                ra5Var.e0.addListener(new gf4((byte) 5, ra5Var, z));
                                ra5Var.e0.setDuration(250L);
                                ra5Var.e0.setInterpolator(k43.f);
                                ra5Var.e0.start();
                            }
                            ra5Var2 = this.n;
                            xa5Var = ra5Var2.W;
                            if (ra5Var2.F != z2) {
                                ra5Var2.F = z2;
                                ra5Var2.c.invalidate();
                                if (!ra5Var2.H) {
                                    ra5Var2.x.K(z2 ? 33 : 0);
                                    ra5Var2.X.d();
                                }
                                if (z2) {
                                    try {
                                        xa5Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (xa5Var.s != z2) {
                                xa5Var.invalidate();
                            }
                            xa5Var.s = z2;
                        }
                    } else {
                        f = 0.0f;
                        z = false;
                    }
                    z2 = z;
                    ra5Var = this.n;
                    if (!ra5Var.H) {
                        ra5Var.c0 = z;
                        valueAnimator = ra5Var.e0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ra5Var.d0, !z ? 1.0f : f);
                        ra5Var.e0 = ofFloat2;
                        ofFloat2.addUpdateListener(new ch4(ra5Var, (byte) 8));
                        ra5Var.e0.addListener(new gf4((byte) 5, ra5Var, z));
                        ra5Var.e0.setDuration(250L);
                        ra5Var.e0.setInterpolator(k43.f);
                        ra5Var.e0.start();
                    }
                    ra5Var2 = this.n;
                    xa5Var = ra5Var2.W;
                    if (ra5Var2.F != z2) {
                    }
                    if (xa5Var.s != z2) {
                    }
                    xa5Var.s = z2;
                }
            }
            return true;
        }
        hl.r(this.f);
        hl.r(this.e);
        ra5 ra5Var7 = this.n;
        if (!ra5Var7.F) {
            ra5Var7.Z = false;
            ra5Var7.a();
            if (this.c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.c = false;
            } else {
                if (motionEvent.getAction() == 1 && !this.n.Y) {
                    if (VoIPService.getSharedInstance() == null) {
                        return false;
                    }
                    this.n.f(!r0.y);
                    return false;
                }
                z3 = false;
            }
            if (parent != null && this.n.Y) {
                parent.requestDisallowInterceptTouchEvent(z3);
                Point point = hl.q;
                int i2 = point.x;
                int i3 = point.y;
                float f9 = this.n.s.x;
                float measuredWidth3 = getMeasuredWidth() + f9;
                float f10 = this.n.s.y;
                float measuredHeight3 = getMeasuredHeight() + f10;
                this.d = new AnimatorSet();
                float f11 = -hl.L(36.0f);
                if (f9 < f11) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.s.x, f11);
                    ofFloat3.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat3);
                    f9 = f11;
                } else if (measuredWidth3 > i2 - f11) {
                    float measuredWidth4 = (i2 - getMeasuredWidth()) - f11;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.n.s.x, measuredWidth4);
                    ofFloat4.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat4);
                    f9 = measuredWidth4;
                }
                int L = hl.L(36.0f) + i3;
                if (f10 < hl.m - hl.L(36.0f)) {
                    float f12 = this.n.s.y;
                    f10 = hl.m - hl.L(36.0f);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, f10);
                    ofFloat5.addUpdateListener(this.n.V);
                    this.d.playTogether(ofFloat5);
                } else if (measuredHeight3 > L) {
                    float f13 = this.n.s.y;
                    f10 = L - getMeasuredHeight();
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f13, f10);
                    ofFloat6.addUpdateListener(this.n.V);
                    this.d.playTogether(ofFloat6);
                }
                this.d.setDuration(150L).setInterpolator(k43.f);
                this.d.start();
                ra5 ra5Var8 = this.n;
                if (ra5Var8.M >= 0.0f) {
                    float[] fArr = ra5Var8.J;
                    float f14 = point.x;
                    float f15 = point.y;
                    float f16 = -hl.L(36.0f);
                    fArr[0] = (f9 - f16) / ((f14 - (f16 * 2.0f)) - hl.L(105.0f));
                    fArr[1] = f10 / (f15 - hl.L(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = a.b.getSharedPreferences("groupcallpipconfig", 0).edit();
                    ra5 ra5Var9 = this.n;
                    float f17 = ra5Var9.J[0];
                    ra5Var9.M = f17;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f17);
                    ra5 ra5Var10 = this.n;
                    float f18 = ra5Var10.J[1];
                    ra5Var10.N = f18;
                    putFloat.putFloat("relativeY", f18).apply();
                }
            }
            ra5 ra5Var11 = this.n;
            ra5Var11.Y = false;
            ra5Var11.g(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        ra5 ra5Var12 = this.n;
        e29 e29Var = ra5Var12.X;
        b29 b29Var = ra5Var12.x;
        zc zcVar = ra5Var12.b;
        pa5 pa5Var = ra5Var12.a;
        a81 a81Var = ra5Var12.c;
        ra5 ra5Var13 = ra5.f0;
        if (ra5Var13 == null) {
            return false;
        }
        ra5Var12.H = true;
        ra5.g0 = true;
        ra5Var12.W.I = true;
        ra5Var13.f(false);
        float measuredWidth5 = (pa5Var.getMeasuredWidth() / 2.0f) + ra5Var12.s.x;
        float measuredWidth6 = ((zcVar.getMeasuredWidth() / 2.0f) + (ra5Var12.P - ra5Var12.S)) - measuredWidth5;
        float measuredHeight4 = ((zcVar.getMeasuredHeight() / 2.0f) + (ra5Var12.O - ra5Var12.T)) - ((pa5Var.getMeasuredHeight() / 2.0f) + ra5Var12.s.y);
        ra5 ra5Var14 = ra5.f0;
        WindowManager windowManager = ra5Var14.n;
        pa5 pa5Var2 = ra5Var14.a;
        zc zcVar2 = ra5Var14.b;
        FrameLayout frameLayout = ra5Var14.d;
        z71 z71Var = ra5Var14.e;
        ra5Var12.e();
        ra5.f0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i4 = b29Var.b0;
        long m = i4 < 33 ? (long) (((1.0f - (i4 / 33.0f)) * b29Var.m()) / 2.0f) : 0L;
        float f19 = ra5Var12.s.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f19, measuredWidth6 + f19);
        ofFloat7.addUpdateListener(ra5Var12.U);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        k43 k43Var = k43.f;
        duration.setInterpolator(k43Var);
        animatorSet.playTogether(ofFloat7);
        float f20 = ra5Var12.s.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f20, (f20 + measuredHeight4) - hl.L(30.0f), ra5Var12.s.y + measuredHeight4);
        ofFloat8.addUpdateListener(ra5Var12.V);
        ofFloat8.setDuration(250L).setInterpolator(k43Var);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {pa5Var2.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(pa5Var2, (Property<pa5, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {pa5Var2.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(pa5Var2, (Property<pa5, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(pa5Var2, (Property<pa5, Float>) property3, 1.0f, 0.0f);
        ofFloat9.setStartDelay(245L);
        ofFloat9.setDuration(105L);
        animatorSet.playTogether(ofFloat9);
        hl.d3(new jm3((byte) 14), 370L);
        long j = m + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j);
        k43 k43Var2 = k43.j;
        ofFloat10.setInterpolator(k43Var2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j);
        ofFloat11.setInterpolator(k43Var2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j);
        ofFloat12.setDuration(350L);
        k43 k43Var3 = k43.h;
        ofFloat12.setInterpolator(k43Var3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(k43Var3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) View.TRANSLATION_Y, 0.0f, hl.L(60.0f));
        ofFloat14.setStartDelay(j);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(k43Var3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(a81Var, (Property<a81, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(k43Var3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new qa5(ra5Var12, pa5Var2, zcVar2, windowManager, frameLayout, z71Var));
        animatorSet.start();
        b29Var.K(66);
        e29Var.i();
        e29Var.d();
        return false;
    }
}
