package vh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w {
    public int a;
    public final org.telegram.ui.Components.t5 b;
    public final ImageReceiver c;
    public kg.j2 d;
    public TextureView e;
    public boolean f;
    public q h;
    public boolean m;
    public n5 n;
    public ValueAnimator o;
    public final /* synthetic */ x p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public w(x xVar) {
        this.p = xVar;
        this.b = new org.telegram.ui.Components.t5(xVar, 0L, 1200L, gr.g);
        this.c = new ImageReceiver(xVar);
    }

    public final void a(n5 n5Var) {
        float f7;
        kg.j2 j2Var = this.d;
        if (j2Var != null) {
            j2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            org.telegram.messenger.i0.E2(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = n5Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.i0.q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.i0.p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.i0.p));
        String r10 = a1.g.r(sb2, (n5Var == null || !n5Var.K) ? "" : "_g", "_exif");
        n5 n5Var2 = this.n;
        x xVar = this.p;
        ImageReceiver imageReceiver = this.c;
        if (n5Var2 == null) {
            imageReceiver.f();
        } else if (n5Var2.K) {
            Bitmap bitmap = n5Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = n5Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str = n5Var2.N;
                    if (str != null) {
                        imageReceiver.o0(str, r10, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(xVar.getContext());
            this.e = textureView2;
            xVar.addView(textureView2);
            kg.j2 j2Var2 = new kg.j2(this, 1);
            this.d = j2Var2;
            j2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            kg.j2 j2Var3 = this.d;
            if (!xVar.v0) {
                n5 n5Var3 = this.n;
                if (!n5Var3.Y && xVar.n0) {
                    f7 = n5Var3.P;
                    j2Var3.setVolume(f7);
                    if (xVar.n0 || xVar.q0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f7 = 0.0f;
            j2Var3.setVolume(f7);
            if (xVar.n0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(n5Var2.L.getAbsolutePath(), r10, null, null, 0L);
        }
        xVar.invalidate();
    }

    public final void b(q qVar, boolean z10) {
        q qVar2 = this.h;
        if (qVar != null) {
            this.h = qVar;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o = null;
        }
        RectF rectF = this.k;
        x xVar = this.p;
        if (z10) {
            boolean z11 = this.i;
            RectF rectF2 = this.j;
            if (z11) {
                org.telegram.messenger.i0.Z1(rectF2, rectF, this.l, rectF2);
            } else {
                x.c(xVar, rectF2, qVar);
            }
            if (qVar == null) {
                x.c(xVar, rectF, qVar2);
            } else {
                xVar.k(rectF, qVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new bg.o(this, 13));
            this.o.addListener(new sg.r(this, 14));
            this.o.setInterpolator(gr.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            xVar.k(rectF, qVar);
            this.l = 1.0f;
        }
        xVar.invalidate();
        this.i = true;
    }
}
