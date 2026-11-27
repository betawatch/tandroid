// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xa5 extends FrameLayout implements fn7, VoIPService.StateListener {
    public float E;
    public final int F;
    public final e29 G;
    public final b29 H;
    public boolean I;
    public final wa5[] J;
    public boolean K;
    public float L;
    public float M;
    public final OvershootInterpolator N;
    public float O;
    public final Paint a;
    public final gk0 b;
    public final gk0 c;
    public float d;
    public float e;
    public float f;
    public wa5 h;
    public wa5 n;
    public float r;
    public boolean s;
    public float w;
    public final LinearGradient x;
    public final Matrix y;

    public xa5(Context context, int i) {
        super(context);
        this.a = new Paint(1);
        this.b = new gk0(8);
        this.c = new gk0(9);
        this.r = 1.0f;
        this.y = new Matrix();
        this.E = 0.0f;
        this.J = new wa5[4];
        this.N = new OvershootInterpolator();
        this.F = i;
        for (int i2 = 0; i2 < 4; i2++) {
            this.J[i2] = new wa5(i2);
        }
        this.b.b = hl.L(37.0f);
        this.b.a = hl.L(32.0f);
        this.c.b = hl.L(37.0f);
        this.c.a = hl.L(32.0f);
        this.b.b();
        this.c.b();
        b29 b29Var = new b29(R.raw.voice_outlined, hl.L(22.0f), hl.L(30.0f), true, null);
        this.H = b29Var;
        setWillNotDraw(false);
        e29 e29Var = new e29(context);
        this.G = e29Var;
        e29Var.setAnimation(b29Var);
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(e29Var);
        this.x = new LinearGradient(0.0f, 0.0f, hl.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.e = min;
        this.f = (min - this.d) / 265.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (callState == 1 || callState == 2 || callState == 6 || callState == 5) {
            setState(2);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || xc2.w(14, sharedInstance.getChat())) {
            setState(sharedInstance.isMicMute() ? 1 : 0);
            return;
        }
        if (!sharedInstance.isMicMute()) {
            sharedInstance.setMicMute(true, false, false);
        }
        setState(3);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        if (getParent() != null) {
            ((View) getParent()).dispatchTouchEvent(obtain);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.Q4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i == jn7.w2) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        jn7.e().b(this, jn7.Q4);
        jn7.f(this.F).b(this, jn7.w2);
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        int i = z ? 13 : 24;
        b29 b29Var = this.H;
        b29Var.K(i);
        b29Var.I(b29Var.f - 1, false, true);
        a();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i = z ? 13 : 24;
        b29 b29Var = this.H;
        if (b29Var.K(i)) {
            if (z) {
                b29Var.H(0);
            } else {
                b29Var.H(12);
            }
        }
        this.G.d();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.Q4);
        jn7.f(this.F).n(this, jn7.w2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e8  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.graphics.Shader, boolean[]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        float f2;
        int i2;
        float f3;
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i3 = 1;
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            boolean z = this.K;
            float f4 = this.L;
            if (z) {
                if (f4 != 1.0f) {
                    f4 += 0.10666667f;
                    this.L = f4;
                    if (f4 > 1.0f) {
                        this.L = 1.0f;
                        f4 = 1.0f;
                    }
                }
            } else if (f4 != 0.0f) {
                f4 -= 0.10666667f;
                this.L = f4;
                if (f4 < 0.0f) {
                    this.L = 0.0f;
                    f4 = 0.0f;
                }
            }
            float interpolation = k43.f.getInterpolation(f4) * 0.1f;
            float f5 = interpolation + 1.0f;
            e29 e29Var = this.G;
            e29Var.setScaleY(f5);
            e29Var.setScaleX(f5);
            float f6 = this.e;
            float f7 = this.d;
            if (f6 != f7) {
                float f8 = this.f;
                float f9 = (16.0f * f8) + f7;
                this.d = f9;
                if (f8 > 0.0f) {
                    if (f9 > f6) {
                        this.d = f6;
                    }
                } else if (f9 < f6) {
                    this.d = f6;
                }
            }
            ?? r10 = 0;
            if (this.n != null) {
                float f10 = this.r + 0.064f;
                this.r = f10;
                if (f10 > 1.0f) {
                    this.r = 1.0f;
                    this.n = null;
                }
            }
            boolean z2 = this.s;
            float f11 = this.w;
            if (z2) {
                if (f11 != 1.0f) {
                    float f12 = f11 + 0.045714285f;
                    this.w = f12;
                    if (f12 > 1.0f) {
                        this.w = 1.0f;
                    }
                    if (this.I) {
                        invalidate();
                    }
                }
            } else if (f11 != 0.0f) {
                float f13 = f11 - 0.045714285f;
                this.w = f13;
                if (f13 < 0.0f) {
                    this.w = 0.0f;
                }
            }
            int i4 = this.h.i;
            int i5 = 3;
            int i6 = 2;
            boolean z3 = (i4 == 3 || i4 == 2) ? false : true;
            float f14 = this.E;
            if (z3) {
                if (f14 != 1.0f) {
                    f14 += 0.045714285f;
                    this.E = f14;
                    if (f14 > 1.0f) {
                        this.E = 1.0f;
                        f14 = 1.0f;
                    }
                }
            } else if (f14 != 0.0f) {
                f14 -= 0.045714285f;
                this.E = f14;
                if (f14 < 0.0f) {
                    this.E = 0.0f;
                    f14 = 0.0f;
                }
            }
            float interpolation2 = (this.N.getInterpolation(f14) * 0.35f) + 0.65f;
            float f15 = this.d;
            gk0 gk0Var = this.b;
            float f16 = 1.0f;
            gk0Var.e(f15, 0.8f);
            float f17 = this.d;
            float f18 = 0.0f;
            gk0 gk0Var2 = this.c;
            gk0Var2.e(f17, 0.8f);
            int i7 = 0;
            while (i7 < i5) {
                Paint paint = this.a;
                if (i7 == 0) {
                    wa5 wa5Var = this.n;
                    if (wa5Var == null) {
                        i = i6;
                        f2 = f16;
                        i2 = i3;
                    } else {
                        if (this.w != f16) {
                            f = f16 - this.r;
                            wa5Var.a(this.d);
                            wa5 wa5Var2 = this.n;
                            if (wa5Var2.i == i6) {
                                paint.setShader(r10);
                                paint.setColor(aob.w0(r10, aob.Sh, false));
                            } else {
                                paint.setShader(wa5Var2.g);
                            }
                            gk0Var.b = hl.L(40.0f);
                            gk0Var.a = hl.L(32.0f);
                            gk0Var2.b = hl.L(38.0f);
                            gk0Var2.a = hl.L(33.0f);
                            float f19 = this.w;
                            float f20 = 76.0f * f;
                            if (i7 != i6) {
                                paint.setAlpha((int) ((f16 - f19) * f20));
                            } else {
                                paint.setAlpha((int) (f19 * f20));
                            }
                            if (this.E != 0.0f) {
                                f3 = 32.0f;
                                f2 = f16;
                                float min = Math.min((f2 - this.M) * bs2.i(this.d, 0.3f, f2, interpolation), 1.3f) * interpolation2;
                                canvas.save();
                                canvas.scale(min, min, measuredWidth, measuredHeight);
                                gk0Var.a(measuredWidth, measuredHeight, canvas, paint);
                                canvas.restore();
                                float min2 = Math.min((f2 - this.M) * bs2.i(this.d, 0.26f, f2, interpolation), 1.3f) * interpolation2;
                                canvas.save();
                                canvas.scale(min2, min2, measuredWidth, measuredHeight);
                                gk0Var2.a(measuredWidth, measuredHeight, canvas, paint);
                                canvas.restore();
                            } else {
                                f3 = 32.0f;
                                f2 = f16;
                            }
                            i = 2;
                            if (i7 == 2) {
                                paint.setAlpha((int) (this.w * 255.0f));
                                i2 = 1;
                            } else {
                                i2 = 1;
                                if (i7 == 1) {
                                    paint.setAlpha((int) (f * 255.0f));
                                } else {
                                    paint.setAlpha(jn7.d4);
                                }
                            }
                            canvas.save();
                            canvas.scale(f5, f5, measuredWidth, measuredHeight);
                            canvas.drawCircle(measuredWidth, measuredHeight, hl.L(f3), paint);
                            canvas.restore();
                        }
                        i = i6;
                        f2 = f16;
                        i2 = 1;
                    }
                } else if (i7 == i3) {
                    wa5 wa5Var3 = this.h;
                    if (wa5Var3 == null) {
                        return;
                    }
                    if (this.w != f16) {
                        float f21 = this.n != null ? this.r : f16;
                        wa5Var3.a(this.d);
                        wa5 wa5Var4 = this.h;
                        if (wa5Var4.i == i6) {
                            paint.setShader(r10);
                            paint.setColor(aob.w0(r10, aob.Sh, false));
                        } else {
                            paint.setShader(wa5Var4.g);
                        }
                        f = f21;
                        gk0Var.b = hl.L(40.0f);
                        gk0Var.a = hl.L(32.0f);
                        gk0Var2.b = hl.L(38.0f);
                        gk0Var2.a = hl.L(33.0f);
                        float f192 = this.w;
                        float f202 = 76.0f * f;
                        if (i7 != i6) {
                        }
                        if (this.E != 0.0f) {
                        }
                        i = 2;
                        if (i7 == 2) {
                        }
                        canvas.save();
                        canvas.scale(f5, f5, measuredWidth, measuredHeight);
                        canvas.drawCircle(measuredWidth, measuredHeight, hl.L(f3), paint);
                        canvas.restore();
                    }
                    i = i6;
                    f2 = f16;
                    i2 = 1;
                } else {
                    if (this.w != f18) {
                        paint.setColor(-65536);
                        Matrix matrix = this.y;
                        matrix.reset();
                        matrix.postTranslate((f16 - this.w) * (-hl.L(250.0f)), f18);
                        matrix.postRotate(this.O, measuredWidth, measuredHeight);
                        LinearGradient linearGradient = this.x;
                        linearGradient.setLocalMatrix(matrix);
                        paint.setShader(linearGradient);
                        f = f16;
                        gk0Var.b = hl.L(40.0f);
                        gk0Var.a = hl.L(32.0f);
                        gk0Var2.b = hl.L(38.0f);
                        gk0Var2.a = hl.L(33.0f);
                        float f1922 = this.w;
                        float f2022 = 76.0f * f;
                        if (i7 != i6) {
                        }
                        if (this.E != 0.0f) {
                        }
                        i = 2;
                        if (i7 == 2) {
                        }
                        canvas.save();
                        canvas.scale(f5, f5, measuredWidth, measuredHeight);
                        canvas.drawCircle(measuredWidth, measuredHeight, hl.L(f3), paint);
                        canvas.restore();
                    }
                    i = i6;
                    f2 = f16;
                    i2 = 1;
                }
                i7++;
                f16 = f2;
                i3 = i2;
                r10 = 0;
                i5 = 3;
                f18 = 0.0f;
                i6 = i;
            }
            if (this.I || this.E <= 0.0f) {
                return;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ra5 ra5Var = ra5.f0;
        if (ra5Var != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0(ra5Var.y ? 2131754897 : 2131754811, null)));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i) {
        a();
    }

    public void setPinnedProgress(float f) {
        this.M = f;
    }

    public void setPressedState(boolean z) {
        this.K = z;
    }

    public void setRemoveAngle(double d) {
        this.O = (float) d;
    }

    public void setState(int i) {
        wa5 wa5Var = this.h;
        if (wa5Var == null || wa5Var.i != i) {
            this.n = wa5Var;
            wa5 wa5Var2 = this.J[i];
            this.h = wa5Var2;
            float f = 0.0f;
            if (wa5Var != null) {
                this.r = 0.0f;
            } else {
                this.r = 1.0f;
                int i2 = wa5Var2.i;
                if (i2 != 3 && i2 != 2) {
                    f = 1.0f;
                }
                this.E = f;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String M0 = (sharedInstance == null || !xc2.W(sharedInstance.getChat())) ? ob6.M0(2131742958, null) : ob6.M0(2131743099, null);
            if (i == 0) {
                StringBuilder l = c00.l(M0, ", ");
                l.append(ob6.M0(2131742885, null));
                M0 = l.toString();
            } else if (i == 2) {
                StringBuilder l2 = c00.l(M0, ", ");
                l2.append(ob6.M0(2131751774, null));
                M0 = l2.toString();
            } else if (i == 3) {
                StringBuilder l3 = c00.l(M0, ", ");
                l3.append(ob6.M0(2131742944, null));
                M0 = l3.toString();
            }
            setContentDescription(M0);
            invalidate();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
