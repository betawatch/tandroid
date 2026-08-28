package yf;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import g7.e6;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class n2 extends j {
    public final TLRPC.Document m0;
    public final Object n0;
    public final int o0;
    public boolean p0;
    public final y5 q0;
    public final qu0 r0;
    public final fh.d2 s0;
    public final ImageReceiver t0;

    public n2(Context context, PointF pointF, float f10, float f11, qu0 qu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.o0 = -1;
        int i9 = 0;
        this.p0 = false;
        this.t0 = new ImageReceiver();
        setRotation(f10);
        setScale(f11);
        this.m0 = document;
        this.r0 = qu0Var;
        this.n0 = obj;
        while (true) {
            if (i9 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.o0 = tL_maskCoords.n;
                }
            } else {
                i9++;
            }
        }
        fh.d2 d2Var = new fh.d2(this, context);
        this.s0 = d2Var;
        addView(d2Var, e6.c(-1.0f, -1));
        this.q0 = new y5(d2Var, 0L, 500L, gr.h);
        this.t0.setAspectFit(true);
        this.t0.setInvalidateAll(true);
        this.t0.setParentView(d2Var);
        this.t0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.t0.setDelegate(new t0.c(this, 15));
        k();
    }

    @Override // yf.j
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 2);
        z1Var.r = new RectF();
        return z1Var;
    }

    public int getAnchor() {
        return this.o0;
    }

    public qu0 getBaseSize() {
        return this.r0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.t0;
        mi0 lottieAnimation = imageReceiver.getLottieAnimation();
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

    @Override // yf.j
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new wj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new wj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.m0;
    }

    @Override // yf.j
    public final void k() {
        qu0 qu0Var = this.r0;
        float f10 = qu0Var.a / 2.0f;
        float f11 = qu0Var.b / 2.0f;
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
    public final void onMeasure(int i9, int i10) {
        qu0 qu0Var = this.r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qu0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) qu0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.p0;
        this.p0 = z11;
        if (!z10) {
            this.q0.f(z11, true);
        }
        this.s0.invalidate();
    }

    public n2(Context context, n2 n2Var, PointF pointF) {
        this(context, pointF, n2Var.getRotation(), n2Var.getScale(), n2Var.r0, n2Var.m0, n2Var.n0);
        if (n2Var.p0) {
            r(false);
        }
    }

    public void q(mi0 mi0Var) {
    }
}
