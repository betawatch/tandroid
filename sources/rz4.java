// default package

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rz4 implements mz4, kl0, wy4 {
    public final mz4 a;
    public ga9 c;
    public tq3 d;
    public int e;
    public mz4 f;
    public iy4 h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;
    public final r89 w = new r89(0, false);
    public final RenderNode b = vk1.k();

    public rz4(mz4 mz4Var) {
        this.a = mz4Var;
    }

    @Override // wy4
    public final int a() {
        iy4 iy4Var = this.h;
        if (iy4Var == null) {
            iy4Var = null;
        }
        if (iy4Var != null) {
            return iy4Var.a();
        }
        return 0;
    }

    @Override // kl0
    public final jl0 b() {
        jl0 jl0Var = new jl0(this, this, this);
        c(jl0Var);
        return jl0Var;
    }

    @Override // kl0
    public final void c(jl0 jl0Var) {
        this.w.add(jl0Var);
    }

    @Override // wy4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        tq3 tq3Var;
        iy4 iy4Var = this.h;
        if (iy4Var == null) {
            iy4Var = null;
        }
        if (this.f != null || iy4Var == null) {
            canvas.save();
            float f3 = 1.0f / i;
            canvas.scale(f3, f3);
            canvas.translate(-f, -f2);
            mz4 mz4Var = this.f;
            if (mz4Var != null) {
                float f4 = i << 1;
                mz4Var.e(rectF.left - f4, rectF.top - f4, rectF.right + f4, rectF.bottom + f4, canvas);
            }
            if (iy4Var == null && Build.VERSION.SDK_INT >= 31 && (tq3Var = this.d) != null) {
                tq3Var.c(canvas, this.e);
            }
            canvas.restore();
        }
        if (iy4Var != null) {
            iy4Var.d(f, f2, i, canvas, rectF);
        }
    }

    @Override // mz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        if (!canvas.isHardwareAccelerated()) {
            mz4 mz4Var = this.a;
            if (mz4Var != null) {
                mz4Var.e(f, f2, f3, f4, canvas);
                return;
            }
            return;
        }
        if (this.r) {
            grb.g();
            return;
        }
        mz4 mz4Var2 = this.f;
        if (mz4Var2 != null) {
            mz4Var2.e(f, f2, f3, f4, canvas);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f, f2, f3, f4);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            iy4 iy4Var = this.h;
            if (iy4Var != null) {
                iy4Var.e(f, f2, f3, f4, canvas);
            } else {
                tq3 tq3Var = this.d;
                if (tq3Var != null) {
                    tq3Var.c(canvas, this.e);
                }
            }
            canvas.restore();
        }
        canvas.drawRenderNode(this.b);
        canvas.restore();
    }

    @Override // wy4
    public final int f() {
        tq3 tq3Var;
        rq3 rq3Var;
        iy4 iy4Var = this.h;
        if (iy4Var == null) {
            iy4Var = null;
        }
        if (iy4Var != null) {
            return iy4Var.f();
        }
        if (Build.VERSION.SDK_INT < 31 || (tq3Var = this.d) == null) {
            return 1;
        }
        int i = this.e;
        if (!tq3Var.a || tq3Var.k == 0) {
            return 1;
        }
        sq3 sq3Var = (sq3) tq3Var.j.get(0);
        return ((i == -2 || i == -4) && (rq3Var = sq3Var.c) != null) ? rq3Var.e : sq3Var.b.e;
    }

    @Override // wy4
    public final int g() {
        iy4 iy4Var = this.h;
        if (iy4Var == null) {
            iy4Var = null;
        }
        if (iy4Var != null) {
            return iy4Var.g();
        }
        return 0;
    }

    @Override // wy4
    public final boolean h() {
        return f() > 1;
    }

    public final RecordingCanvas i(int i, int i2) {
        if (this.r) {
            grb.g();
            return null;
        }
        this.r = true;
        this.b.setPosition(0, 0, i, i2);
        RecordingCanvas beginRecording = this.b.beginRecording(i, i2);
        this.s = beginRecording;
        return beginRecording;
    }

    public final void j() {
        if (!this.r) {
            grb.g();
            return;
        }
        this.b.endRecording();
        this.r = false;
        this.s = null;
    }

    public final boolean k(int i, int i2) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i && this.b.getHeight() == i2) ? false : true;
    }

    public final void l(float f) {
        this.b.setRenderEffect(f > 0.0f ? RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP) : null);
    }

    public final void m(float f, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i, int i2) {
        this.b.setPosition(0, 0, i, i2);
    }
}
