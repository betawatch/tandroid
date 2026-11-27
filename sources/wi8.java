// default package

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wi8 extends jf0 implements qy9, jq3, snb {
    public byte E;
    public int F;
    public int G;
    public boolean H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f;
    public r47 h;
    public int n;
    public TextPaint r;
    public ry9 s;
    public vv8 w;
    public int x;
    public int y;

    public final void A() {
        int i;
        TextPaint textPaint = this.r;
        r47 r47Var = this.h;
        if (r47Var == null) {
            return;
        }
        ry9 ry9Var = this.s;
        if (!ry9Var.e) {
            ry9Var.g(r47Var.b0);
        }
        if (!MediaController.z().H(this.h)) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.h.F0().attributes.size()) {
                    i = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i2);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i = (int) documentAttribute.duration;
                    break;
                }
                i2++;
            }
        } else {
            i = this.h.i0;
        }
        String g0 = hl.g0(i, true, false);
        this.K = (int) Math.ceil(textPaint.measureText(g0));
        this.I = new StaticLayout(g0, textPaint, this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override // jq3
    public final void B(boolean z) {
        y();
    }

    @Override // jq3
    public final void N(String str) {
        y();
    }

    @Override // qy9
    public final void g(float f) {
        r47 r47Var = this.h;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
        MediaController.z().k0(this.h, f);
    }

    public final r47 getMessageObject() {
        return this.h;
    }

    @Override // jq3
    public int getObserverTag() {
        return this.L;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        this.w.a(Math.min(1.0f, j / j2));
        if (this.E != 3) {
            y();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lq3.q(this.n).v(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f) {
                requestLayout();
                return;
            }
            Point point = hl.q;
            int i = point.y;
            int i2 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i = view.getMeasuredHeight();
                i2 = measuredWidth;
            }
            aob.q3.o((int) getY(), i2, i);
            t37 t37Var = aob.q3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (t37Var != null) {
                t37Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            aob.q3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            byte b = this.E;
            if (b == 0 || b == 1) {
                canvas.translate(this.x, this.y);
                this.s.b(canvas);
            } else {
                canvas.translate(hl.L(12.0f) + this.x, this.y);
                vv8 vv8Var = this.w;
                float f = vv8Var.e / 2;
                float f2 = vv8Var.f / 2.0f;
                canvas.drawRect(0.0f, f - f2, vv8Var.d, f2 + f, vv8Var.a);
                float f3 = vv8Var.e / 2;
                canvas.drawRect(0.0f, f3 - f2, vv8Var.c * vv8Var.d, f2 + f3, vv8Var.b);
            }
            canvas.restore();
            byte b2 = this.E;
            this.r.setColor(-6182221);
            Drawable drawable = aob.U4[b2][this.H ? 1 : 0];
            int L = hl.L(36.0f);
            jf0.u(((L - drawable.getIntrinsicWidth()) / 2) + this.F, ((L - drawable.getIntrinsicHeight()) / 2) + this.G, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.J, hl.L(18.0f));
            this.I.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        vv8 vv8Var = this.w;
        if (this.h != null) {
            this.x = hl.L(54.0f);
            this.F = hl.L(10.0f);
            this.J = (getMeasuredWidth() - this.K) - hl.L(16.0f);
            this.s.h((getMeasuredWidth() - hl.L(70.0f)) - this.K, hl.L(30.0f));
            vv8Var.d = (getMeasuredWidth() - hl.L(94.0f)) - this.K;
            vv8Var.e = hl.L(30.0f);
            this.y = hl.L(13.0f);
            this.G = hl.L(10.0f);
            A();
            if (z || !this.f) {
                this.f = true;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(56.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
    
        if (r1 <= (r0 + r4)) goto L58;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean e = this.s.e(motionEvent.getX() - this.x, motionEvent.getY() - this.y, motionEvent.getAction());
        if (e) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return e;
        }
        int L = hl.L(36.0f);
        if (motionEvent.getAction() == 0) {
            if (x >= this.F && x <= r5 + L) {
                if (y >= this.G && y <= r0 + L) {
                    this.H = true;
                    invalidate();
                    e = true;
                }
            }
        } else if (this.H) {
            if (motionEvent.getAction() == 1) {
                this.H = false;
                playSoundEffect(0);
                byte b = this.E;
                if (b == 0) {
                    boolean V = MediaController.z().V(this.h);
                    if (!this.h.N3()) {
                        TLRPC.Message message = this.h.k;
                        if (message.media_unread && message.peer_id.channel_id == 0) {
                            uc7.s1(this.n).z3(this.h);
                            this.h.k.media_unread = false;
                        }
                    }
                    if (V) {
                        this.E = (byte) 1;
                        invalidate();
                    }
                } else if (b == 1) {
                    if (MediaController.z().U(this.h, true)) {
                        this.E = (byte) 0;
                        invalidate();
                    }
                } else if (b == 2) {
                    xb4.G(this.n).X(this.h.F0(), this.h, 1, 0);
                    this.E = (byte) 4;
                    invalidate();
                } else if (b == 3) {
                    xb4.G(this.n).f(this.h.F0());
                    this.E = (byte) 2;
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.H = false;
                invalidate();
            } else if (motionEvent.getAction() == 2) {
                if (x >= this.F && x <= r3 + L) {
                    if (y >= this.G) {
                    }
                }
                this.H = false;
                invalidate();
            }
        }
        return !e ? super.onTouchEvent(motionEvent) : e;
    }

    public void setMessageObject(r47 r47Var) {
        if (this.h != r47Var) {
            this.n = r47Var.K1;
            ry9 ry9Var = this.s;
            int i = aob.le;
            int w0 = aob.w0(null, i, false);
            int w02 = aob.w0(null, i, false);
            int i2 = aob.oe;
            ry9Var.f(w0, w02, aob.w0(null, i2, false), aob.w0(null, i2, false), aob.w0(null, aob.ne, false));
            vv8 vv8Var = this.w;
            vv8Var.a.setColor(-2497813);
            vv8Var.b.setColor(-7944712);
            this.h = r47Var;
            this.f = false;
            requestLayout();
        }
        y();
    }

    @Override // snb
    public final void updateColors() {
        try {
            ry9 ry9Var = this.s;
            if (ry9Var == null || this.h == null) {
                return;
            }
            int i = aob.le;
            int w0 = aob.w0(null, i, false);
            int w02 = aob.w0(null, i, false);
            int i2 = aob.oe;
            ry9Var.f(w0, w02, aob.w0(null, i2, false), aob.w0(null, i2, false), aob.w0(null, aob.ne, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void y() {
        vv8 vv8Var = this.w;
        String S0 = this.h.S0();
        xb4.G(this.n);
        boolean exists = xb4.M(this.h.k, false, true).exists();
        int i = this.n;
        if (exists) {
            lq3.q(i).v(this);
            boolean H = MediaController.z().H(this.h);
            if (!H || (H && MediaController.z().G())) {
                this.E = (byte) 0;
            } else {
                this.E = (byte) 1;
            }
            vv8Var.a(0.0f);
        } else {
            lq3.q(i).a(S0, null, this);
            if (xb4.G(this.n).S(S0)) {
                this.E = (byte) 3;
                Float s = in5.z().s(S0);
                if (s != null) {
                    vv8Var.a(s.floatValue());
                } else {
                    vv8Var.a(0.0f);
                }
            } else {
                this.E = (byte) 2;
                vv8Var.a(0.0f);
            }
        }
        A();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // qy9
    public final void h(float f) {
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
