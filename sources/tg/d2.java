package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class d2 extends j {
    public final TLRPC.Document q0;
    public final Object r0;
    public final int s0;
    public boolean t0;
    public final w5 u0;
    public final mt0 v0;
    public final v41 w0;
    public final ImageReceiver x0;

    public d2(Context context, PointF pointF, float f10, float f11, mt0 mt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        this.x0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.q0 = document;
        this.v0 = mt0Var;
        this.r0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.s0 = tL_maskCoords.n;
                }
            } else {
                i7++;
            }
        }
        v41 v41Var = new v41(this, context);
        this.w0 = v41Var;
        addView(v41Var, ha.c(-1.0f, -1));
        this.u0 = new w5(v41Var, 0L, 500L, xq.h);
        ImageReceiver imageReceiver = this.x0;
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(v41Var);
        this.x0.t0(hc.b(document), null, hc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.x0.g1 = new m3(this, 26);
        k();
    }

    @Override // tg.j
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 2);
        p1Var.r = new RectF();
        return p1Var;
    }

    public int getAnchor() {
        return this.s0;
    }

    public mt0 getBaseSize() {
        return this.v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.x0;
        zg0 B = imageReceiver.B();
        if (B != null) {
            return B.r();
        }
        if (imageReceiver.m() != null) {
            return r0.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.r0;
    }

    @Override // tg.j
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ki0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new ki0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.q0;
    }

    @Override // tg.j
    public final void k() {
        mt0 mt0Var = this.v0;
        float f10 = mt0Var.a / 2.0f;
        float f11 = mt0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x0.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x0.R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        mt0 mt0Var = this.v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) mt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) mt0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z9) {
        boolean z10 = !this.t0;
        this.t0 = z10;
        if (!z9) {
            this.u0.f(z10, true);
        }
        this.w0.invalidate();
    }

    public void q(zg0 zg0Var) {
    }

    public d2(Context context, d2 d2Var, PointF pointF) {
        this(context, pointF, d2Var.getRotation(), d2Var.getScale(), d2Var.v0, d2Var.q0, d2Var.r0);
        if (d2Var.t0) {
            r(false);
        }
    }
}
