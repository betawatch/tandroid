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
import c8.na;
import c8.oe;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.x7;
import org.telegram.messenger.m10;
import org.telegram.messenger.w7;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s1 extends n {
    public final c6 A0;
    public final w01 B0;
    public final Bitmap C0;
    public boolean D0;
    public boolean E0;
    public final Rect F0;
    public final Rect G0;
    public final Paint H0;
    public we I0;
    public final TLObject s0;
    public final String t0;
    public final int u0;
    public boolean v0;
    public final c6 w0;
    public final xt0 x0;
    public final int y0;
    public boolean z0;

    public s1(Context context, PointF pointF, xt0 xt0Var, String str, int i7) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.t0 = str;
        this.x0 = xt0Var;
        w01 w01Var = new w01(this, context);
        this.B0 = w01Var;
        addView(w01Var, na.c(-1.0f, -1));
        kr krVar = kr.h;
        this.w0 = new c6(w01Var, 0L, 500L, krVar);
        this.A0 = new c6(w01Var, 0L, 350L, krVar);
        this.y0 = i7;
        Bitmap q10 = x7.q(new ab.t(str, 2), 1920, 1920, 0, false);
        this.C0 = q10;
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

    @Override // tg.n
    public final m a() {
        return new o0(this, getContext());
    }

    public int getAnchor() {
        return this.u0;
    }

    public xt0 getBaseSize() {
        return this.x0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.C0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.C0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.y0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override // tg.n
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new aj0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float L3 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        org.telegram.messenger.g0.L(64.0f);
        float y10 = m10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, m10.y(L2, 2.0f, getPositionY(), scaleX), ((L3 * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override // tg.n
    public final void k() {
        xt0 xt0Var = this.x0;
        float f10 = xt0Var.a / 2.0f;
        float f11 = xt0Var.b / 2.0f;
        we weVar = this.I0;
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
        xt0 xt0Var = this.x0;
        float f10 = xt0Var.a;
        float f11 = xt0Var.b;
        we weVar = this.I0;
        if (weVar != null) {
            f10 *= weVar.e;
            f11 *= weVar.f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f11, TLObject.FLAG_30));
    }

    public final String q(int i7) {
        TLObject tLObject = this.s0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i7);
                return w7.J(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.t0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.v0;
        this.v0 = z11;
        if (!z10) {
            this.w0.f(z11, true);
        }
        w01 w01Var = this.B0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.E0 || this.D0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        ia.a aVar = new ia.a();
        aVar.a = true;
        zzd a10 = oe.a(new zb.d(aVar));
        this.D0 = true;
        a10.h(ub.a.a(this.y0, bitmap)).addOnSuccessListener(new s(this, 2)).addOnFailureListener(new uc1(13, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.z0;
        this.z0 = z11;
        if (!z10) {
            this.A0.f(z11, true);
        }
        w01 w01Var = this.B0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }

    public s1(Context context, PointF pointF, xt0 xt0Var, TLObject tLObject) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.s0 = tLObject;
        this.x0 = xt0Var;
        w01 w01Var = new w01(this, context);
        this.B0 = w01Var;
        addView(w01Var, na.c(-1.0f, -1));
        kr krVar = kr.h;
        this.w0 = new c6(w01Var, 0L, 500L, krVar);
        this.A0 = new c6(w01Var, 0L, 350L, krVar);
        k();
    }
}
