package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.na;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class j2 extends n {
    public final TLRPC.Document s0;
    public final Object t0;
    public final int u0;
    public boolean v0;
    public final c6 w0;
    public final xt0 x0;
    public final w01 y0;
    public final ImageReceiver z0;

    public j2(Context context, PointF pointF, float f10, float f11, xt0 xt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.s0 = document;
        this.x0 = xt0Var;
        this.t0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.u0 = tL_maskCoords.n;
                }
            } else {
                i7++;
            }
        }
        w01 w01Var = new w01(this, context);
        this.y0 = w01Var;
        addView(w01Var, na.c(-1.0f, -1));
        this.w0 = new c6(w01Var, 0L, 500L, kr.h);
        ImageReceiver imageReceiver = this.z0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.I0(w01Var);
        this.z0.u0(fc.b(document), null, fc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.z0.h1 = new s(this, 5);
        k();
    }

    @Override // tg.n
    public final m a() {
        u1 u1Var = new u1(this, getContext(), 2);
        u1Var.r = new RectF();
        return u1Var;
    }

    public int getAnchor() {
        return this.u0;
    }

    public xt0 getBaseSize() {
        return this.x0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.z0;
        nh0 C = imageReceiver.C();
        if (C != null) {
            return C.r();
        }
        if (imageReceiver.m() != null) {
            return r0.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.t0;
    }

    @Override // tg.n
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new aj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new aj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.s0;
    }

    @Override // tg.n
    public final void k() {
        xt0 xt0Var = this.x0;
        float f10 = xt0Var.a / 2.0f;
        float f11 = xt0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0.Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.S();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        xt0 xt0Var = this.x0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) xt0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) xt0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.v0;
        this.v0 = z11;
        if (!z10) {
            this.w0.f(z11, true);
        }
        this.y0.invalidate();
    }

    public void q(nh0 nh0Var) {
    }

    public j2(Context context, j2 j2Var, PointF pointF) {
        this(context, pointF, j2Var.getRotation(), j2Var.getScale(), j2Var.x0, j2Var.s0, j2Var.t0);
        if (j2Var.v0) {
            r(false);
        }
    }
}
