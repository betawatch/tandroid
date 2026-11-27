// default package

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class v3b extends h44 {
    public final TLRPC.Document s0;
    public final Object t0;
    public final int u0;
    public boolean v0;
    public final mm w0;
    public final qma x0;
    public final d26 y0;
    public final ImageReceiver z0;

    public v3b(Context context, PointF pointF, float f, float f2, qma qmaVar, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.u0 = -1;
        this.v0 = false;
        this.z0 = new ImageReceiver(null);
        setRotation(f);
        setScale(f2);
        this.s0 = document;
        this.x0 = qmaVar;
        this.t0 = obj;
        int i = 0;
        while (true) {
            if (i >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.u0 = tL_maskCoords.n;
                }
            } else {
                i++;
            }
        }
        d26 d26Var = new d26(this, context);
        this.y0 = d26Var;
        addView(d26Var, tre.c(-1.0f, -1));
        this.w0 = new mm(d26Var, 0L, 500L, k43.h);
        ImageReceiver imageReceiver = this.z0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(d26Var);
        this.z0.b0(jn5.b(document), null, jn5.c(xb4.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.z0.h1 = new hja(this, (byte) 14);
        k();
    }

    @Override // h44
    public final g44 a() {
        r39 r39Var = new r39(this, getContext(), (byte) 2);
        r39Var.r = new RectF();
        return r39Var;
    }

    public int getAnchor() {
        return this.u0;
    }

    public qma getBaseSize() {
        return this.x0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.z0;
        b29 y = imageReceiver.y();
        if (y != null) {
            return y.m();
        }
        if (imageReceiver.m() != null) {
            return r2.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.t0;
    }

    @Override // h44
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new a69();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new a69((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    public TLRPC.Document getSticker() {
        return this.s0;
    }

    @Override // h44
    public final void k() {
        qma qmaVar = this.x0;
        float f = qmaVar.a / 2.0f;
        float f2 = qmaVar.b / 2.0f;
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0.K();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        qma qmaVar = this.x0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qmaVar.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) qmaVar.b, TLObject.FLAG_30));
    }

    public final void r(boolean z) {
        boolean z2 = !this.v0;
        this.v0 = z2;
        if (!z) {
            this.w0.f(z2, true);
        }
        this.y0.invalidate();
    }

    public void q(b29 b29Var) {
    }

    public v3b(Context context, v3b v3bVar, PointF pointF) {
        this(context, pointF, v3bVar.getRotation(), v3bVar.getScale(), v3bVar.x0, v3bVar.s0, v3bVar.t0);
        if (v3bVar.v0) {
            r(false);
        }
    }
}
