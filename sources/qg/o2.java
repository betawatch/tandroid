package qg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.uv0;
import w7.y5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class o2 extends j {
    public final TLRPC.Document q0;
    public final Object r0;
    public final int s0;
    public boolean t0;
    public final e6 u0;
    public final uv0 v0;
    public final ai.f0 w0;
    public final ImageReceiver x0;

    public o2(Context context, PointF pointF, float f7, float f10, uv0 uv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.s0 = -1;
        int i10 = 0;
        this.t0 = false;
        this.x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.q0 = document;
        this.v0 = uv0Var;
        this.r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.s0 = tL_maskCoords.n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.w0 = f0Var;
        addView(f0Var, y5.c(-1.0f, -1));
        this.u0 = new e6(f0Var, 0L, 500L, rr.h);
        this.x0.setAspectFit(true);
        this.x0.setInvalidateAll(true);
        this.x0.setParentView(f0Var);
        this.x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.x0.setDelegate(new le.b(this, 26));
        k();
    }

    @Override // qg.j
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.s0;
    }

    public uv0 getBaseSize() {
        return this.v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.x0;
        ij0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.r();
        }
        if (imageReceiver.getAnimation() != null) {
            return r0.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.r0;
    }

    @Override // qg.j
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new sk0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new sk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.q0;
    }

    @Override // qg.j
    public final void k() {
        uv0 uv0Var = this.v0;
        float f7 = uv0Var.a / 2.0f;
        float f10 = uv0Var.b / 2.0f;
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x0.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x0.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        uv0 uv0Var = this.v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) uv0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) uv0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.t0;
        this.t0 = z11;
        if (!z10) {
            this.u0.f(z11, true);
        }
        this.w0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.v0, o2Var.q0, o2Var.r0);
        if (o2Var.t0) {
            r(false);
        }
    }

    public void q(ij0 ij0Var) {
    }
}
