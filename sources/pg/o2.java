package pg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import bi.ld;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class o2 extends j {
    public final TLRPC.Document q0;
    public final Object r0;
    public final int s0;
    public boolean t0;
    public final d6 u0;
    public final tv0 v0;
    public final ld w0;
    public final ImageReceiver x0;

    public o2(Context context, PointF pointF, float f7, float f10, tv0 tv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.s0 = -1;
        int i10 = 0;
        this.t0 = false;
        this.x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.q0 = document;
        this.v0 = tv0Var;
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
        ld ldVar = new ld(this, context);
        this.w0 = ldVar;
        addView(ldVar, a6.c(-1.0f, -1));
        this.u0 = new d6(ldVar, 0L, 500L, wr.h);
        this.x0.setAspectFit(true);
        this.x0.setInvalidateAll(true);
        this.x0.setParentView(ldVar);
        this.x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.x0.setDelegate(new org.telegram.tgnet.j(this, 15));
        k();
    }

    @Override // pg.j
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 2);
        z1Var.r = new RectF();
        return z1Var;
    }

    public int getAnchor() {
        return this.s0;
    }

    public tv0 getBaseSize() {
        return this.v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.x0;
        hj0 lottieAnimation = imageReceiver.getLottieAnimation();
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

    @Override // pg.j
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new rk0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new rk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.q0;
    }

    @Override // pg.j
    public final void k() {
        tv0 tv0Var = this.v0;
        float f7 = tv0Var.a / 2.0f;
        float f10 = tv0Var.b / 2.0f;
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
        tv0 tv0Var = this.v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) tv0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) tv0Var.b, TLObject.FLAG_30));
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

    public void q(hj0 hj0Var) {
    }
}
