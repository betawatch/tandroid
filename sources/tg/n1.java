package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import c8.ha;
import c8.ke;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import fi.e7;
import org.telegram.messenger.w7;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public ye G0;
    public final TLObject q0;
    public final String r0;
    public final int s0;
    public boolean t0;
    public final v5 u0;
    public final nt0 v0;
    public final int w0;
    public boolean x0;
    public final v5 y0;
    public final w41 z0;

    public n1(Context context, PointF pointF, nt0 nt0Var, String str, int i7) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        this.x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.r0 = str;
        this.v0 = nt0Var;
        w41 w41Var = new w41(this, context);
        this.z0 = w41Var;
        addView(w41Var, ha.c(-1.0f, -1));
        wq wqVar = wq.h;
        this.u0 = new v5(w41Var, 0L, 500L, wqVar);
        this.y0 = new v5(w41Var, 0L, 350L, wqVar);
        this.w0 = i7;
        Bitmap q10 = e7.q(new ab.t(str, 2), 1920, 1920, 0, false);
        this.A0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.g0.q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.g0.p);
        return com.google.android.recaptcha.internal.a.j(round, "_", round);
    }

    @Override // tg.j
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAnchor() {
        return this.s0;
    }

    public nt0 getBaseSize() {
        return this.v0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override // tg.j
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ki0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float L3 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        org.telegram.messenger.g0.L(64.0f);
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ki0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L3 * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // tg.j
    public final void k() {
        nt0 nt0Var = this.v0;
        float f10 = nt0Var.a / 2.0f;
        float f11 = nt0Var.b / 2.0f;
        ye yeVar = this.G0;
        if (yeVar != null) {
            f10 *= yeVar.e;
            f11 *= yeVar.f;
        }
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        nt0 nt0Var = this.v0;
        float f10 = nt0Var.a;
        float f11 = nt0Var.b;
        ye yeVar = this.G0;
        if (yeVar != null) {
            f10 *= yeVar.e;
            f11 *= yeVar.f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f11, TLObject.FLAG_30));
    }

    public final String q(int i7) {
        TLObject tLObject = this.q0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i7);
                return w7.J(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.r0;
    }

    public final void r(boolean z9) {
        boolean z10 = !this.t0;
        this.t0 = z10;
        if (!z9) {
            this.u0.f(z10, true);
        }
        w41 w41Var = this.z0;
        if (w41Var != null) {
            w41Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.C0 || this.B0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        ia.a aVar = new ia.a();
        aVar.a = true;
        zzd a10 = ke.a(new zb.d(aVar));
        this.B0 = true;
        a10.g(ub.a.a(this.w0, bitmap)).addOnSuccessListener(new n3(this, 23)).addOnFailureListener(new org.telegram.ui.web.a0(9, this, bitmap));
    }

    public final void t(boolean z9) {
        boolean z10 = !this.x0;
        this.x0 = z10;
        if (!z9) {
            this.y0.f(z10, true);
        }
        w41 w41Var = this.z0;
        if (w41Var != null) {
            w41Var.invalidate();
        }
    }

    public n1(Context context, PointF pointF, nt0 nt0Var, TLObject tLObject) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        this.x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.q0 = tLObject;
        this.v0 = nt0Var;
        w41 w41Var = new w41(this, context);
        this.z0 = w41Var;
        addView(w41Var, ha.c(-1.0f, -1));
        wq wqVar = wq.h;
        this.u0 = new v5(w41Var, 0L, 500L, wqVar);
        this.y0 = new v5(w41Var, 0L, 350L, wqVar);
        k();
    }
}
