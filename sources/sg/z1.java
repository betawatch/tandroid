package sg;

import a8.y9;
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
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import fi.w7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z1 extends j {
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
    public final h6 u0;
    public final qw0 v0;
    public final int w0;
    public boolean x0;
    public final h6 y0;
    public final p5 z0;

    public z1(Context context, PointF pointF, qw0 qw0Var, String str, int i10) {
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
        this.v0 = qw0Var;
        p5 p5Var = new p5(this, context);
        this.z0 = p5Var;
        addView(p5Var, gb1.g(-1.0f, -1));
        ds dsVar = ds.h;
        this.u0 = new h6(p5Var, 0L, 500L, dsVar);
        this.y0 = new h6(p5Var, 0L, 350L, dsVar);
        this.w0 = i10;
        Bitmap q5 = w7.q(new org.telegram.ui.Components.voip.j1(str, 14), 1920, 1920, 0, false);
        this.A0 = q5;
        if (q5 != null) {
            s(q5);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a1.g.k(round, round, "_");
    }

    @Override // sg.j
    public final i a() {
        return new q0(this, getContext());
    }

    public int getAnchor() {
        return this.s0;
    }

    public qw0 getBaseSize() {
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

    @Override // sg.j
    public hl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hl0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float dp3 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float y3 = vh.y(dp, 2.0f, getPositionX(), scaleX);
        return new hl0(y3, vh.y(dp2, 2.0f, getPositionY(), scaleX), ((dp3 * scaleX) + y3) - y3, dp2 * scaleX);
    }

    @Override // sg.j
    public final void k() {
        qw0 qw0Var = this.v0;
        float f7 = qw0Var.a / 2.0f;
        float f10 = qw0Var.b / 2.0f;
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
        qw0 qw0Var = this.v0;
        float f7 = qw0Var.a;
        float f10 = qw0Var.b;
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
        p5 p5Var = this.z0;
        if (p5Var != null) {
            p5Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.C0 || this.B0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        cc.d dVar = new cc.d();
        dVar.a = true;
        zzd a2 = y9.a(new cc.e(dVar));
        this.B0 = true;
        a2.g(xb.a.a(bitmap, this.w0)).addOnSuccessListener(new org.telegram.ui.Components.voip.j1(this, 15)).addOnFailureListener(new zg1(13, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.x0;
        this.x0 = z11;
        if (!z10) {
            this.y0.f(z11, true);
        }
        p5 p5Var = this.z0;
        if (p5Var != null) {
            p5Var.invalidate();
        }
    }

    public z1(Context context, PointF pointF, qw0 qw0Var, TLObject tLObject) {
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
        this.v0 = qw0Var;
        p5 p5Var = new p5(this, context);
        this.z0 = p5Var;
        addView(p5Var, gb1.g(-1.0f, -1));
        ds dsVar = ds.h;
        this.u0 = new h6(p5Var, 0L, 500L, dsVar);
        this.y0 = new h6(p5Var, 0L, 350L, dsVar);
        k();
    }
}
