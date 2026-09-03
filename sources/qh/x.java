package qh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ss0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class x {
    public int a;
    public final org.telegram.ui.Components.z5 b;
    public final ImageReceiver c;
    public fg.s2 d;
    public TextureView e;
    public boolean f;
    public q h;
    public boolean m;
    public r6 n;
    public ValueAnimator o;
    public final /* synthetic */ y p;
    public volatile long g = -1;
    public boolean i = false;
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public float l = 1.0f;

    public x(y yVar) {
        this.p = yVar;
        this.b = new org.telegram.ui.Components.z5(yVar, 0L, 1200L, pr.g);
        this.c = new ImageReceiver(yVar);
    }

    public final void a(r6 r6Var) {
        float f10;
        fg.s2 s2Var = this.d;
        if (s2Var != null) {
            s2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f = false;
        this.n = r6Var;
        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb.append("_");
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        String r10 = android.support.v4.media.a.r(sb, (r6Var == null || !r6Var.K) ? "" : "_g", "_exif");
        r6 r6Var2 = this.n;
        y yVar = this.p;
        ImageReceiver imageReceiver = this.c;
        if (r6Var2 == null) {
            imageReceiver.clearImage();
        } else if (r6Var2.K) {
            Bitmap bitmap = r6Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = r6Var2.b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str = r6Var2.N;
                    if (str != null) {
                        imageReceiver.setImage(str, r10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(yVar.getContext());
            this.e = textureView2;
            yVar.addView(textureView2);
            fg.s2 s2Var2 = new fg.s2(this, 1);
            this.d = s2Var2;
            s2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.n.L), false, 1.0f);
            fg.s2 s2Var3 = this.d;
            if (!yVar.s0) {
                r6 r6Var3 = this.n;
                if (!r6Var3.Y && yVar.k0) {
                    f10 = r6Var3.P;
                    s2Var3.setVolume(f10);
                    if (yVar.k0 || yVar.n0) {
                        this.d.play();
                    } else {
                        this.d.pause();
                    }
                }
            }
            f10 = 0.0f;
            s2Var3.setVolume(f10);
            if (yVar.k0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(r6Var2.L.getAbsolutePath(), r10, null, null, 0L);
        }
        yVar.invalidate();
    }

    public final void b(q qVar, boolean z4) {
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
        y yVar = this.p;
        if (z4) {
            boolean z10 = this.i;
            RectF rectF2 = this.j;
            if (z10) {
                AndroidUtilities.lerp(rectF2, rectF, this.l, rectF2);
            } else {
                y.c(yVar, rectF2, qVar);
            }
            if (qVar == null) {
                y.c(yVar, rectF, qVar2);
            } else {
                yVar.k(rectF, qVar);
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.addUpdateListener(new f2.d0(this, 10));
            this.o.addListener(new ss0(this, 29));
            this.o.setInterpolator(pr.h);
            this.o.setDuration(360L);
            this.o.start();
        } else {
            yVar.k(rectF, qVar);
            this.l = 1.0f;
        }
        yVar.invalidate();
        this.i = true;
    }
}
