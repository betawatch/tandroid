package zf;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import h7.z5;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class o2 extends j {
    public final TLRPC.Document m0;
    public final Object n0;
    public final int o0;
    public boolean p0;
    public final y5 q0;
    public final tu0 r0;
    public final qg.f s0;
    public final ImageReceiver t0;

    public o2(Context context, PointF pointF, float f10, float f11, tu0 tu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.o0 = -1;
        int i10 = 0;
        this.p0 = false;
        this.t0 = new ImageReceiver();
        setRotation(f10);
        setScale(f11);
        this.m0 = document;
        this.r0 = tu0Var;
        this.n0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.o0 = tL_maskCoords.n;
                }
            } else {
                i10++;
            }
        }
        qg.f fVar = new qg.f(this, context);
        this.s0 = fVar;
        addView(fVar, z5.c(-1.0f, -1));
        this.q0 = new y5(fVar, 0L, 500L, er.h);
        this.t0.setAspectFit(true);
        this.t0.setInvalidateAll(true);
        this.t0.setParentView(fVar);
        this.t0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.t0.setDelegate(new t0.c(this, 15));
        k();
    }

    @Override // zf.j
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.o0;
    }

    public tu0 getBaseSize() {
        return this.r0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.t0;
        oi0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.p();
        }
        if (imageReceiver.getAnimation() != null) {
            return r0.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.n0;
    }

    @Override // zf.j
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new yj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.m0;
    }

    @Override // zf.j
    public final void k() {
        tu0 tu0Var = this.r0;
        float f10 = tu0Var.a / 2.0f;
        float f11 = tu0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t0.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t0.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        tu0 tu0Var = this.r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) tu0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) tu0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.p0;
        this.p0 = z11;
        if (!z10) {
            this.q0.f(z11, true);
        }
        this.s0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.r0, o2Var.m0, o2Var.n0);
        if (o2Var.p0) {
            r(false);
        }
    }

    public void q(oi0 oi0Var) {
    }
}
