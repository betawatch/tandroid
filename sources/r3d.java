// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class r3d extends View {
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public AnimatorSet L;
    public q3d M;
    public boolean N;
    public final w10 O;
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public r3d(Context context) {
        super(context);
        this.N = true;
        this.O = new w10(this);
        this.a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f = context.getResources().getDrawable(R.drawable.zoom_round_b);
    }

    public final boolean a(float f) {
        if (f < 0.0f || f > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.K = f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.O, f));
        this.L.setDuration(180L);
        this.L.addListener(new ztc(this, (byte) 3));
        this.L.start();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r4 > 1.0f) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z, float f) {
        q3d q3dVar;
        if (f == this.F) {
            return;
        }
        float f2 = f >= 0.0f ? 1.0f : 0.0f;
        f = f2;
        this.F = f;
        if (z && (q3dVar = this.M) != null) {
            q3dVar.b(f);
        }
        invalidate();
    }

    public float getZoom() {
        return this.L != null ? this.K : this.F;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        boolean z = getMeasuredWidth() > getMeasuredHeight();
        if (z) {
            this.h = hl.L(41.0f);
            this.n = measuredHeight;
            this.r = getMeasuredWidth() - hl.L(41.0f);
            this.s = measuredHeight;
            this.w = hl.L(18.0f) + this.h;
            this.x = measuredHeight;
            this.y = this.r - hl.L(18.0f);
            this.E = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.n = hl.L(41.0f);
            this.r = measuredWidth;
            this.s = getMeasuredHeight() - hl.L(41.0f);
            this.w = measuredWidth;
            this.x = hl.L(18.0f) + this.n;
            this.y = measuredWidth;
            this.E = this.s - hl.L(18.0f);
        }
        int L = this.h - hl.L(7.0f);
        int L2 = this.n - hl.L(7.0f);
        int L3 = hl.L(7.0f) + this.h;
        int L4 = hl.L(7.0f) + this.n;
        Drawable drawable = this.a;
        drawable.setBounds(L, L2, L3, L4);
        drawable.draw(canvas);
        int L5 = this.r - hl.L(7.0f);
        int L6 = this.s - hl.L(7.0f);
        int L7 = hl.L(7.0f) + this.r;
        int L8 = hl.L(7.0f) + this.s;
        Drawable drawable2 = this.b;
        drawable2.setBounds(L5, L6, L7, L8);
        drawable2.draw(canvas);
        int i = this.y;
        int i2 = this.w;
        int i3 = this.E;
        int i4 = this.x;
        float f = this.F;
        int i5 = (int) (((i - i2) * f) + i2);
        int i6 = (int) (((i3 - i4) * f) + i4);
        Drawable drawable3 = this.c;
        Drawable drawable4 = this.d;
        if (z) {
            drawable3.setBounds(i2, i4 - hl.L(3.0f), this.y, hl.L(3.0f) + this.x);
            drawable4.setBounds(this.w, this.x - hl.L(3.0f), i5, hl.L(3.0f) + this.x);
        } else {
            drawable3.setBounds(i4, 0, i3, hl.L(6.0f));
            drawable4.setBounds(this.x, 0, i6, hl.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.w) - hl.L(3.0f));
        }
        drawable3.draw(canvas);
        drawable4.draw(canvas);
        if (!z) {
            canvas.restore();
        }
        Drawable drawable5 = this.H ? this.f : this.e;
        int intrinsicWidth = drawable5.getIntrinsicWidth() / 2;
        drawable5.setBounds(i5 - intrinsicWidth, i6 - intrinsicWidth, i5 + intrinsicWidth, i6 + intrinsicWidth);
        drawable5.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        q3d q3dVar;
        if (!this.N) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z2 = getMeasuredWidth() > getMeasuredHeight();
        int i = this.w;
        float f2 = i;
        float f3 = this.y - i;
        float f4 = this.F;
        int i2 = (int) ((f3 * f4) + f2);
        int i3 = this.x;
        float f5 = i3;
        float f6 = this.E - i3;
        int i4 = (int) ((f4 * f6) + f5);
        if (action == 1 || action == 0) {
            if (x < i2 - hl.L(20.0f) || x > hl.L(20.0f) + i2 || y < i4 - hl.L(25.0f) || y > hl.L(25.0f) + i4) {
                try {
                    if (x >= this.h - hl.L(16.0f)) {
                        if (x <= hl.L(16.0f) + this.h && y >= this.n - hl.L(16.0f)) {
                            if (y <= hl.L(16.0f) + this.n) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) - 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.G = true;
                                }
                            }
                        }
                    }
                    if (x >= this.r - hl.L(16.0f)) {
                        if (x <= hl.L(16.0f) + this.r && y >= this.s - hl.L(16.0f)) {
                            if (y <= hl.L(16.0f) + this.s) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) + 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.G = true;
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (x >= this.w && x <= this.y) {
                            if (action == 0) {
                                this.I = x;
                                this.G = true;
                            } else if (Math.abs(this.I - x) <= hl.L(10.0f)) {
                                float f7 = (x - this.w) / (this.y - r2);
                                this.F = f7;
                                q3d q3dVar2 = this.M;
                                if (q3dVar2 != null) {
                                    q3dVar2.b(f7);
                                }
                                invalidate();
                            }
                        }
                    } else if (y >= this.x && y <= this.E) {
                        if (action == 1) {
                            this.J = y;
                            this.G = true;
                        } else if (Math.abs(this.J - y) <= hl.L(10.0f)) {
                            float f8 = (y - this.x) / (this.E - r0);
                            this.F = f8;
                            q3d q3dVar3 = this.M;
                            if (q3dVar3 != null) {
                                q3dVar3.b(f8);
                            }
                            invalidate();
                        }
                    }
                } catch (Exception unused) {
                }
            } else if (action == 0) {
                this.H = true;
                this.I = x - i2;
                this.J = y - i4;
                invalidate();
            }
            z = true;
            if (action == 1) {
                this.G = false;
                this.H = false;
                invalidate();
            }
            return !z || this.G || this.H || super.onTouchEvent(motionEvent);
        }
        if (action == 2 && this.H) {
            if (z2) {
                f = ((x + this.I) - f2) / f3;
                this.F = f;
            } else {
                f = ((y + this.J) - f5) / f6;
                this.F = f;
            }
            float f9 = 0.0f;
            if (f < 0.0f) {
                this.F = 0.0f;
            } else {
                f9 = 1.0f;
                if (f > 1.0f) {
                    this.F = 1.0f;
                }
                q3dVar = this.M;
                if (q3dVar != null) {
                    q3dVar.b(f);
                }
                invalidate();
            }
            f = f9;
            q3dVar = this.M;
            if (q3dVar != null) {
            }
            invalidate();
        }
        z = false;
        if (action == 1) {
        }
        if (z) {
        }
    }

    public void setDelegate(q3d q3dVar) {
        this.M = q3dVar;
    }
}
