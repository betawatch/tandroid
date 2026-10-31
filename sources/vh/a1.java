package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a1 extends View {
    public eq a;
    public boolean b;
    public final int c;
    public org.telegram.ui.Components.f5 d;
    public final b1 e;
    public ImageReceiver f;
    public long h;
    public final jc[] n;
    public ImageReceiver r;
    public final dc s;
    public boolean w;

    public a1(Context context, b1 b1Var) {
        super(context);
        this.c = d20.s0;
        this.n = new jc[2];
        this.s = new dc(this);
        setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        this.e = b1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        if (this.h == (document == null ? 0L : document.id)) {
            return;
        }
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.n(this);
        }
        if (document == null) {
            this.b = false;
            this.h = 0L;
            this.d = null;
            return;
        }
        this.b = true;
        this.h = document.id;
        int i10 = u1.y1;
        org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(this.c, sc.e(z10 ? 1 : 16388) ? 3 : 13, document);
        this.d = l4;
        if (this.w) {
            l4.a(this);
        }
    }

    public float getScale() {
        return this.s.a(0.15f);
    }

    @Override // android.view.View
    public final void invalidate() {
        this.e.invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w = false;
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.b = false;
        if (this.f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f;
            imageReceiver2.R0 = true;
            if (this.w) {
                imageReceiver2.P();
            }
        }
        this.f.w0(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        this.b = false;
        if (document == null) {
            ImageReceiver imageReceiver = this.f;
            if (imageReceiver != null) {
                this.h = 0L;
                imageReceiver.f();
                return;
            }
            return;
        }
        long j10 = this.h;
        long j11 = document.id;
        if (j10 == j11) {
            return;
        }
        this.h = j11;
        if (this.f == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(null);
            this.f = imageReceiver2;
            imageReceiver2.E0(7);
            ImageReceiver imageReceiver3 = this.f;
            imageReceiver3.R0 = true;
            if (this.w) {
                imageReceiver3.P();
            }
        }
        this.f.H0(!this.b ? this : this.e);
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
        String str = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
        if (!sc.e(1)) {
            str = str.concat("_firstframe");
        }
        this.f.r0(ic.b(document), str, ic.c(w9, document), "80_80", null, 0L, null, document, 0);
    }
}
