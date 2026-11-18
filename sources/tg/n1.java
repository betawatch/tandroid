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
import c8.ma;
import c8.ne;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.d7;
import org.telegram.messenger.n10;
import org.telegram.messenger.w7;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n1 extends j {
    public final w01 A0;
    public final Bitmap B0;
    public boolean C0;
    public boolean D0;
    public final Rect E0;
    public final Rect F0;
    public final Paint G0;
    public we H0;
    public final TLObject r0;
    public final String s0;
    public final int t0;
    public boolean u0;
    public final c6 v0;
    public final vt0 w0;
    public final int x0;
    public boolean y0;
    public final c6 z0;

    public n1(Context context, PointF pointF, vt0 vt0Var, String str, int i7) {
        super(context, pointF);
        this.t0 = -1;
        this.u0 = false;
        this.y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.s0 = str;
        this.w0 = vt0Var;
        w01 w01Var = new w01(this, context);
        this.A0 = w01Var;
        addView(w01Var, ma.c(-1.0f, -1));
        lr lrVar = lr.h;
        this.v0 = new c6(w01Var, 0L, 500L, lrVar);
        this.z0 = new c6(w01Var, 0L, 350L, lrVar);
        this.x0 = i7;
        Bitmap q10 = d7.q(new ab.t(str, 2), 1920, 1920, 0, false);
        this.B0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.g0.q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.g0.p);
        return com.google.android.gms.internal.vision.e2.j(round, "_", round);
    }

    @Override // tg.j
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAnchor() {
        return this.t0;
    }

    public vt0 getBaseSize() {
        return this.w0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.B0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.B0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.x0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override // tg.j
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yi0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float L3 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        org.telegram.messenger.g0.L(64.0f);
        float y10 = n10.y(L, 2.0f, getPositionX(), scaleX);
        return new yi0(y10, n10.y(L2, 2.0f, getPositionY(), scaleX), ((L3 * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override // tg.j
    public final void k() {
        vt0 vt0Var = this.w0;
        float f10 = vt0Var.a / 2.0f;
        float f11 = vt0Var.b / 2.0f;
        we weVar = this.H0;
        if (weVar != null) {
            f10 *= weVar.e;
            f11 *= weVar.f;
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
        vt0 vt0Var = this.w0;
        float f10 = vt0Var.a;
        float f11 = vt0Var.b;
        we weVar = this.H0;
        if (weVar != null) {
            f10 *= weVar.e;
            f11 *= weVar.f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f11, TLObject.FLAG_30));
    }

    public final String q(int i7) {
        TLObject tLObject = this.r0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i7);
                return w7.J(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.s0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.u0;
        this.u0 = z11;
        if (!z10) {
            this.v0.f(z11, true);
        }
        w01 w01Var = this.A0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.D0 || this.C0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        ia.a aVar = new ia.a();
        aVar.a = true;
        zzd a10 = ne.a(new zb.d(aVar));
        this.C0 = true;
        a10.h(ub.a.a(this.x0, bitmap)).addOnSuccessListener(new org.telegram.ui.ActionBar.p(this, 29)).addOnFailureListener(new wc1(13, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.y0;
        this.y0 = z11;
        if (!z10) {
            this.z0.f(z11, true);
        }
        w01 w01Var = this.A0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }

    public n1(Context context, PointF pointF, vt0 vt0Var, TLObject tLObject) {
        super(context, pointF);
        this.t0 = -1;
        this.u0 = false;
        this.y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.r0 = tLObject;
        this.w0 = vt0Var;
        w01 w01Var = new w01(this, context);
        this.A0 = w01Var;
        addView(w01Var, ma.c(-1.0f, -1));
        lr lrVar = lr.h;
        this.v0 = new c6(w01Var, 0L, 500L, lrVar);
        this.z0 = new c6(w01Var, 0L, 350L, lrVar);
        k();
    }
}
