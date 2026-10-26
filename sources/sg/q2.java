package sg;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Wallet.p5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class q2 extends j {
    public final TLRPC.Document q0;
    public final Object r0;
    public final int s0;
    public boolean t0;
    public final h6 u0;
    public final qw0 v0;
    public final p5 w0;
    public final ImageReceiver x0;

    public q2(Context context, PointF pointF, float f7, float f10, qw0 qw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.s0 = -1;
        int i10 = 0;
        this.t0 = false;
        this.x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.q0 = document;
        this.v0 = qw0Var;
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
        p5 p5Var = new p5(this, context);
        this.w0 = p5Var;
        addView(p5Var, gb1.g(-1.0f, -1));
        this.u0 = new h6(p5Var, 0L, 500L, ds.h);
        this.x0.setAspectFit(true);
        this.x0.setInvalidateAll(true);
        this.x0.setParentView(p5Var);
        this.x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.x0.setDelegate(new org.telegram.ui.Components.voip.j1(this, 18));
        k();
    }

    @Override // sg.j
    public final i a() {
        b2 b2Var = new b2(this, getContext(), 2);
        b2Var.r = new RectF();
        return b2Var;
    }

    public int getAnchor() {
        return this.s0;
    }

    public qw0 getBaseSize() {
        return this.v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.x0;
        xj0 lottieAnimation = imageReceiver.getLottieAnimation();
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

    @Override // sg.j
    public hl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hl0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new hl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.q0;
    }

    @Override // sg.j
    public final void k() {
        qw0 qw0Var = this.v0;
        float f7 = qw0Var.a / 2.0f;
        float f10 = qw0Var.b / 2.0f;
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
        qw0 qw0Var = this.v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qw0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) qw0Var.b, TLObject.FLAG_30));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.t0;
        this.t0 = z11;
        if (!z10) {
            this.u0.f(z11, true);
        }
        this.w0.invalidate();
    }

    public q2(Context context, q2 q2Var, PointF pointF) {
        this(context, pointF, q2Var.getRotation(), q2Var.getScale(), q2Var.v0, q2Var.q0, q2Var.r0);
        if (q2Var.t0) {
            r(false);
        }
    }

    public void q(xj0 xj0Var) {
    }
}
