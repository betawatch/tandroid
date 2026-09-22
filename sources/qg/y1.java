package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import ci.o8;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.rv0;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public MediaController.CropState G0;
    public final TLObject q0;
    public final String r0;
    public final int s0;
    public boolean t0;
    public final d6 u0;
    public final wv0 v0;
    public final int w0;
    public boolean x0;
    public final d6 y0;
    public final ai.f0 z0;

    public y1(Context context, PointF pointF, wv0 wv0Var, String str, int i10) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        this.x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.r0 = str;
        this.v0 = wv0Var;
        ai.f0 f0Var = new ai.f0(this, context);
        this.z0 = f0Var;
        addView(f0Var, y5.c(-1.0f, -1));
        qr qrVar = qr.h;
        this.u0 = new d6(f0Var, 0L, 500L, qrVar);
        this.y0 = new d6(f0Var, 0L, 350L, qrVar);
        this.w0 = i10;
        Bitmap q6 = o8.q(new k2.v(str, 22), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a4.a.k(round, round, "_");
    }

    @Override // qg.j
    public final i a() {
        return new q0(this, getContext());
    }

    public int getAnchor() {
        return this.s0;
    }

    public wv0 getBaseSize() {
        return this.v0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override // qg.j
    public uk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new uk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float dp3 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float w10 = rk.w(dp, 2.0f, getPositionX(), scaleX);
        return new uk0(w10, rk.w(dp2, 2.0f, getPositionY(), scaleX), ((dp3 * scaleX) + w10) - w10, dp2 * scaleX);
    }

    @Override // qg.j
    public final void k() {
        wv0 wv0Var = this.v0;
        float f7 = wv0Var.a / 2.0f;
        float f10 = wv0Var.b / 2.0f;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        wv0 wv0Var = this.v0;
        float f7 = wv0Var.a;
        float f10 = wv0Var.b;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
    }

    public final String q(int i10) {
        TLObject tLObject = this.q0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.t0;
        this.t0 = z11;
        if (!z10) {
            this.u0.f(z11, true);
        }
        ai.f0 f0Var = this.z0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.C0 || this.B0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        ac.d dVar = new ac.d();
        dVar.a = true;
        zzd a2 = i8.d.a(new ac.e(dVar));
        this.B0 = true;
        a2.g(vb.a.a(bitmap, this.w0)).addOnSuccessListener(new k2.v(this, 23)).addOnFailureListener(new rv0(26, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.x0;
        this.x0 = z11;
        if (!z10) {
            this.y0.f(z11, true);
        }
        ai.f0 f0Var = this.z0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public y1(Context context, PointF pointF, wv0 wv0Var, TLObject tLObject) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        this.x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.q0 = tLObject;
        this.v0 = wv0Var;
        ai.f0 f0Var = new ai.f0(this, context);
        this.z0 = f0Var;
        addView(f0Var, y5.c(-1.0f, -1));
        qr qrVar = qr.h;
        this.u0 = new d6(f0Var, 0L, 500L, qrVar);
        this.y0 = new d6(f0Var, 0L, 350L, qrVar);
        k();
    }
}
