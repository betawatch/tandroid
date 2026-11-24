// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tw3 extends View {
    public sn2 a;
    public boolean b;
    public final int c;
    public vm d;
    public final uw3 e;
    public ImageReceiver f;
    public long h;
    public final in5[] n;
    public ImageReceiver r;
    public final u51 s;
    public boolean w;

    public tw3(Context context, uw3 uw3Var) {
        super(context);
        this.c = z8c.t0;
        this.n = new in5[2];
        this.s = new u51(this);
        setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        this.e = uw3Var;
    }

    public final void a(TLRPC.Document document, boolean z) {
        if (this.h != (document == null ? 0L : document.id)) {
            vm vmVar = this.d;
            if (vmVar != null) {
                vmVar.o(this);
            }
            if (document == null) {
                this.b = false;
                this.h = 0L;
                this.d = null;
                return;
            }
            this.b = true;
            this.h = document.id;
            int i = px3.C1;
            vm l = vm.l(this.c, e86.e(z ? 1 : 16388) ? 3 : 13, document);
            this.d = l;
            if (this.w) {
                l.b(this);
            }
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
        vm vmVar = this.d;
        if (vmVar != null) {
            vmVar.b(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w = false;
        vm vmVar = this.d;
        if (vmVar != null) {
            vmVar.o(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.i0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f.h(canvas, null);
            return;
        }
        vm vmVar = this.d;
        if (vmVar != null) {
            vmVar.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        vm vmVar = this.d;
        if (vmVar != null) {
            vmVar.o(this);
        }
        this.d = null;
        this.h = 0L;
        this.b = false;
        if (this.f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f = imageReceiver;
            imageReceiver.m0(7);
            ImageReceiver imageReceiver2 = this.f;
            imageReceiver2.S0 = true;
            if (this.w) {
                imageReceiver2.I();
            }
        }
        this.f.g0(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.s.c(z);
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
        long j = this.h;
        long j2 = document.id;
        if (j != j2) {
            this.h = j2;
            if (this.f == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                this.f = imageReceiver2;
                imageReceiver2.m0(7);
                ImageReceiver imageReceiver3 = this.f;
                imageReceiver3.S0 = true;
                if (this.w) {
                    imageReceiver3.I();
                }
            }
            this.f.p0(!this.b ? this : this.e);
            TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
            String str = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
            if (!e86.e(1)) {
                str = str.concat("_firstframe");
            }
            this.f.Z(gn5.b(document), str, gn5.c(w, document), "80_80", null, 0L, null, document, 0);
        }
    }
}
