package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.ja;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class f2 extends j {
    public final TLRPC.Document r0;
    public final Object s0;
    public final int t0;
    public boolean u0;
    public final u5 v0;
    public final nt0 w0;
    public final m01 x0;
    public final ImageReceiver y0;

    public f2(Context context, PointF pointF, float f10, float f11, nt0 nt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.t0 = -1;
        this.u0 = false;
        this.y0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.r0 = document;
        this.w0 = nt0Var;
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
        m01 m01Var = new m01(this, context);
        this.x0 = m01Var;
        addView(m01Var, ja.c(-1.0f, -1));
        this.v0 = new u5(m01Var, 0L, 500L, er.h);
        ImageReceiver imageReceiver = this.y0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(m01Var);
        this.y0.t0(gc.b(document), null, gc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.y0.h1 = new z1(this, 1);
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

    public nt0 getBaseSize() {
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

    @Override // tg.j
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new pi0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new pi0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.r0;
    }

    @Override // tg.j
    public final void k() {
        nt0 nt0Var = this.w0;
        float f10 = nt0Var.a / 2.0f;
        float f11 = nt0Var.b / 2.0f;
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
        nt0 nt0Var = this.w0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) nt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) nt0Var.b, TLObject.FLAG_30));
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

    public f2(Context context, f2 f2Var, PointF pointF) {
        this(context, pointF, f2Var.getRotation(), f2Var.getScale(), f2Var.w0, f2Var.r0, f2Var.s0);
        if (f2Var.u0) {
            r(false);
        }
    }
}
