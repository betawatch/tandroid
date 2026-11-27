// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zj9 extends View implements zlb {
    public boolean E;
    public v59 F;
    public final int a;
    public vnb b;
    public r47 c;
    public TL_iv.RichMessage d;
    public hl9 e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public amb w;
    public int x;
    public int y;

    public zj9(int i, vnb vnbVar, Context context) {
        super(context);
        this.x = -1;
        this.y = -1;
        this.E = true;
        this.a = i;
        this.b = vnbVar;
        jn7.i(this);
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        if (this.e != null) {
            int i = this.f;
            int i2 = this.h;
            for (int i3 = 0; i3 < this.e.n.size(); i3++) {
                arrayList.add(new ml9((kmb) this.e.n.get(i3), i, i2, (byte) 3));
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hl9 hl9Var = this.e;
        if (hl9Var != null) {
            hl9Var.b(this);
            this.e.a0(0);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hl9 hl9Var = this.e;
        if (hl9Var != null) {
            hl9Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e != null) {
            float height = (getHeight() - this.h) - this.r;
            boolean z = this.e.t() > (getHeight() - this.h) - this.r;
            canvas.save();
            if (z) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
            }
            canvas.translate(this.f, this.h);
            hl9 hl9Var = this.e;
            hl9Var.R(this.f, Math.max(0, (getWidth() - this.e.C) - this.f));
            hl9Var.w.linkColor = aob.v0(hl9Var.D() ? aob.Yc : aob.Xc, hl9Var.D);
            hl9Var.h(canvas, null, height > 0.0f, 0.0f, height);
            if (this.e.B()) {
                this.e.i(canvas, null);
            }
            if (z) {
                canvas.translate(-this.f, -this.h);
                canvas.save();
                RectF rectF = hl.P;
                rectF.set(0.0f, getHeight() - hl.L(24.0f), getWidth(), getHeight());
                this.e.z.r(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            amb ambVar = this.w;
            if (ambVar == null || !ambVar.w()) {
                return;
            }
            int i = this.f;
            int i2 = this.h;
            for (int i3 = 0; i3 < this.e.n.size(); i3++) {
                kmb kmbVar = (kmb) this.e.n.get(i3);
                canvas.save();
                canvas.translate(kmbVar.getX() + i, kmbVar.getY() + i2);
                this.w.Y(canvas, this, i3);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TL_iv.RichMessage richMessage;
        int size = View.MeasureSpec.getSize(i);
        int i3 = (size - this.f) - this.n;
        if (i3 <= 0 || (richMessage = this.d) == null) {
            this.e = null;
        } else {
            hl9 hl9Var = this.e;
            if (hl9Var == null || hl9Var.K(richMessage, i3)) {
                hl9 hl9Var2 = this.e;
                if (hl9Var2 != null) {
                    hl9Var2.f(this);
                }
                hl9 hl9Var3 = new hl9(this.c, i3, (hl9) null);
                this.e = hl9Var3;
                hl9Var3.O = this.s;
                hl9Var3.D = this.b;
                hl9Var3.v = true;
                hl9Var3.c(null, null);
                if (isAttachedToWindow()) {
                    this.e.b(this);
                    this.e.a0(0);
                }
            }
        }
        hl9 hl9Var4 = this.e;
        int t = (hl9Var4 != null ? hl9Var4.t() : 0) + this.h + this.r;
        int i4 = this.y;
        if (i4 > 0 && t > i4) {
            t = i4;
        }
        int i5 = this.x;
        if (i5 > 0 && t < i5) {
            t = i5;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            t = Math.min(t, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            t = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, t);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        if (!this.E) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.w != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.w.j0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                v59 v59Var = this.F;
                if (v59Var == null) {
                    v59Var = new v59(this, (byte) 9);
                    this.F = v59Var;
                }
                removeCallbacks(v59Var);
                postDelayed(this.F, ViewConfiguration.getLongPressTimeout());
            } else if ((action == 1 || action == 2 || action == 3) && (runnable = this.F) != null) {
                removeCallbacks(runnable);
            }
        }
        if (this.e != null) {
            motionEvent.offsetLocation(-this.f, -this.h);
            boolean L = this.e.L(motionEvent);
            motionEvent.offsetLocation(this.f, this.h);
            if (L) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void set(TL_iv.RichMessage richMessage) {
        if (this.d == richMessage) {
            return;
        }
        this.d = richMessage;
        r47 r47Var = this.c;
        if (r47Var == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            r47 r47Var2 = new r47(this.a, tL_message, false, false);
            this.c = r47Var2;
            r47Var = r47Var2;
        }
        r47Var.k.rich_message = richMessage;
        hl9 hl9Var = this.e;
        if (hl9Var != null) {
            hl9Var.f(this);
        }
        this.e = null;
        requestLayout();
        invalidate();
    }

    public void setAllowActions(boolean z) {
        this.E = z;
    }

    public void setMaxHeight(int i) {
        this.y = i;
    }

    public void setMinHeight(int i) {
        this.x = i;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (this.f == i && this.h == i2 && this.n == i3 && this.r == i4) {
            return;
        }
        this.f = i;
        this.h = i2;
        this.n = i3;
        this.r = i4;
        requestLayout();
        invalidate();
    }

    public void setResourcesProvider(vnb vnbVar) {
        this.b = vnbVar;
        hl9 hl9Var = this.e;
        if (hl9Var != null) {
            hl9Var.D = vnbVar;
        }
    }

    public void setTextSelectionHelper(amb ambVar) {
        this.w = ambVar;
    }

    public void setTranslationLoading(boolean z) {
        this.s = z;
        hl9 hl9Var = this.e;
        if (hl9Var != null) {
            hl9Var.O = z;
        }
        invalidate();
    }
}
