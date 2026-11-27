// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v98 extends h44 {
    public final mm A0;
    public final d26 B0;
    public final Bitmap C0;
    public boolean D0;
    public boolean E0;
    public final Rect F0;
    public final Rect G0;
    public final Paint H0;
    public fo6 I0;
    public final TLObject s0;
    public final String t0;
    public final int u0;
    public boolean v0;
    public final mm w0;
    public final qma x0;
    public final int y0;
    public boolean z0;

    public v98(Context context, PointF pointF, qma qmaVar, String str, int i) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = false;
        new Paint(3);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.t0 = str;
        this.x0 = qmaVar;
        d26 d26Var = new d26(this, context);
        this.B0 = d26Var;
        addView(d26Var, tre.c(-1.0f, -1));
        k43 k43Var = k43.h;
        this.w0 = new mm(d26Var, 0L, 500L, k43Var);
        this.A0 = new mm(d26Var, 0L, 350L, k43Var);
        this.y0 = i;
        Bitmap q = c8b.q(new y94(str, (byte) 4), 1920, 1920, 0, false);
        this.C0 = q;
        if (q != null) {
            s(q);
        }
        k();
    }

    private String getImageFilter() {
        Point point = hl.q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / hl.p);
        return qd4.m(round, round, "_");
    }

    @Override // h44
    public final g44 a() {
        return new r66(this, getContext());
    }

    public int getAnchor() {
        return this.u0;
    }

    public qma getBaseSize() {
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

    @Override // h44
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new a69();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (hl.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (hl.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float L3 = (hl.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        hl.L(64.0f);
        float e = uh9.e(L, 2.0f, getPositionX(), scaleX);
        return new a69(e, uh9.e(L2, 2.0f, getPositionY(), scaleX), ((L3 * scaleX) + e) - e, L2 * scaleX);
    }

    @Override // h44
    public final void k() {
        qma qmaVar = this.x0;
        float f = qmaVar.a / 2.0f;
        float f2 = qmaVar.b / 2.0f;
        fo6 fo6Var = this.I0;
        if (fo6Var != null) {
            f *= fo6Var.e;
            f2 *= fo6Var.f;
        }
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
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
    public final void onMeasure(int i, int i2) {
        qma qmaVar = this.x0;
        float f = qmaVar.a;
        float f2 = qmaVar.b;
        fo6 fo6Var = this.I0;
        if (fo6Var != null) {
            f *= fo6Var.e;
            f2 *= fo6Var.f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f2, TLObject.FLAG_30));
    }

    public final String q(int i) {
        TLObject tLObject = this.s0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w = xb4.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                xb4.G(i);
                return xb4.J(w, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.t0;
    }

    public final void r(boolean z) {
        boolean z2 = !this.v0;
        this.v0 = z2;
        if (!z) {
            this.w0.f(z2, true);
        }
        d26 d26Var = this.B0;
        if (d26Var != null) {
            d26Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.E0 || this.D0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        k00 k00Var = new k00();
        k00Var.a = true;
        bsd a = mze.a(new deb(k00Var));
        this.D0 = true;
        a.c(jq5.a(this.y0, bitmap)).addOnSuccessListener(new jz7((Object) this, (byte) 5)).addOnFailureListener(new m88((Object) this, (Object) bitmap, (byte) 1));
    }

    public final void t(boolean z) {
        boolean z2 = !this.z0;
        this.z0 = z2;
        if (!z) {
            this.A0.f(z2, true);
        }
        d26 d26Var = this.B0;
        if (d26Var != null) {
            d26Var.invalidate();
        }
    }

    public v98(Context context, PointF pointF, qma qmaVar, TLObject tLObject) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = false;
        new Paint(3);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.s0 = tLObject;
        this.x0 = qmaVar;
        d26 d26Var = new d26(this, context);
        this.B0 = d26Var;
        addView(d26Var, tre.c(-1.0f, -1));
        k43 k43Var = k43.h;
        this.w0 = new mm(d26Var, 0L, 500L, k43Var);
        this.A0 = new mm(d26Var, 0L, 350L, k43Var);
        k();
    }
}
