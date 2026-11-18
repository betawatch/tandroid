package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class f2 extends j {
    public final TLRPC.Document r0;
    public final Object s0;
    public final int t0;
    public boolean u0;
    public final c6 v0;
    public final vt0 w0;
    public final w01 x0;
    public final ImageReceiver y0;

    public f2(Context context, PointF pointF, float f10, float f11, vt0 vt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.t0 = -1;
        this.u0 = false;
        this.y0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.r0 = document;
        this.w0 = vt0Var;
        this.s0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.t0 = tL_maskCoords.n;
                }
            } else {
                i7++;
            }
        }
        w01 w01Var = new w01(this, context);
        this.x0 = w01Var;
        addView(w01Var, ma.c(-1.0f, -1));
        this.v0 = new c6(w01Var, 0L, 500L, lr.h);
        ImageReceiver imageReceiver = this.y0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(w01Var);
        this.y0.t0(fc.b(document), null, fc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.y0.h1 = new z1(this, 2);
        k();
    }

    @Override // tg.j
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 2);
        p1Var.r = new RectF();
        return p1Var;
    }

    public int getAnchor() {
        return this.t0;
    }

    public vt0 getBaseSize() {
        return this.w0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.y0;
        mh0 B = imageReceiver.B();
        if (B != null) {
            return B.r();
        }
        if (imageReceiver.m() != null) {
            return r0.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.s0;
    }

    @Override // tg.j
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yi0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new yi0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.r0;
    }

    @Override // tg.j
    public final void k() {
        vt0 vt0Var = this.w0;
        float f10 = vt0Var.a / 2.0f;
        float f11 = vt0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y0.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y0.R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        vt0 vt0Var = this.w0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) vt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) vt0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.u0;
        this.u0 = z11;
        if (!z10) {
            this.v0.f(z11, true);
        }
        this.x0.invalidate();
    }

    public void q(mh0 mh0Var) {
    }

    public f2(Context context, f2 f2Var, PointF pointF) {
        this(context, pointF, f2Var.getRotation(), f2Var.getScale(), f2Var.w0, f2Var.r0, f2Var.s0);
        if (f2Var.u0) {
            r(false);
        }
    }
}
