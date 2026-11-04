package ug;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class d2 extends j {
    public final TLRPC.Document r0;
    public final Object s0;
    public final int t0;
    public boolean u0;
    public final u5 v0;
    public final lt0 w0;
    public final kw0 x0;
    public final ImageReceiver y0;

    public d2(Context context, PointF pointF, float f10, float f11, lt0 lt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.t0 = -1;
        this.u0 = false;
        this.y0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.r0 = document;
        this.w0 = lt0Var;
        this.s0 = obj;
        int i3 = 0;
        while (true) {
            if (i3 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.t0 = tL_maskCoords.n;
                }
            } else {
                i3++;
            }
        }
        kw0 kw0Var = new kw0(this, context);
        this.x0 = kw0Var;
        addView(kw0Var, mf.c(-1.0f, -1));
        this.v0 = new u5(kw0Var, 0L, 500L, xq.h);
        ImageReceiver imageReceiver = this.y0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(kw0Var);
        this.y0.t0(ac.b(document), null, ac.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.y0.h1 = new e3(this, 24);
        k();
    }

    @Override // ug.j
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 2);
        p1Var.r = new RectF();
        return p1Var;
    }

    public int getAnchor() {
        return this.t0;
    }

    public lt0 getBaseSize() {
        return this.w0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.y0;
        ch0 B = imageReceiver.B();
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

    @Override // ug.j
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new ni0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new ni0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.r0;
    }

    @Override // ug.j
    public final void k() {
        lt0 lt0Var = this.w0;
        float f10 = lt0Var.a / 2.0f;
        float f11 = lt0Var.b / 2.0f;
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
    public final void onMeasure(int i3, int i10) {
        lt0 lt0Var = this.w0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) lt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) lt0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.u0;
        this.u0 = z11;
        if (!z10) {
            this.v0.f(z11, true);
        }
        this.x0.invalidate();
    }

    public void q(ch0 ch0Var) {
    }

    public d2(Context context, d2 d2Var, PointF pointF) {
        this(context, pointF, d2Var.getRotation(), d2Var.getScale(), d2Var.w0, d2Var.r0, d2Var.s0);
        if (d2Var.u0) {
            r(false);
        }
    }
}
