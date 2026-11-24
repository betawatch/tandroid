// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class t96 extends FrameLayout implements RendererCommon.RendererEvents, jm7 {
    public long E;
    public c40 F;
    public boolean G;
    public float H;
    public boolean I;
    public int a;
    public final yj3 b;
    public TextureViewRenderer c;
    public TextureView d;
    public z96 e;
    public a91 f;
    public Bitmap h;
    public long n;
    public boolean r;
    public final bf0 s;
    public View w;
    public Runnable x;
    public boolean y;

    public t96(Context context, int i) {
        super(context);
        this.a = i;
        bf0 bf0Var = new bf0(context);
        this.s = bf0Var;
        bf0Var.setAlpha(0.75f);
        addView(bf0Var, qoe.e(-1, -1, nm7.D1));
        yj3 yj3Var = new yj3(context);
        this.b = yj3Var;
        yj3Var.setAlpha(0.0f);
        yj3Var.setVisibility(8);
        addView(yj3Var, qoe.e(-1, -1, nm7.D1));
    }

    private void setStreamMode(boolean z) {
        View view = this.b;
        if (z) {
            if (this.e == null) {
                int indexOfChild = indexOfChild(view);
                a91 a91Var = new a91(getContext());
                this.f = a91Var;
                addView(a91Var, indexOfChild, qoe.e(-1, -1, nm7.D1));
                z96 z96Var = new z96(getContext(), new lj4(this));
                this.e = z96Var;
                addView(z96Var, indexOfChild + 1, qoe.e(-1, -1, nm7.D1));
                this.e.setAlpha(0.0f);
            }
        } else if (this.d == null) {
            int indexOfChild2 = indexOfChild(view);
            TextureView textureView = new TextureView(getContext());
            this.d = textureView;
            addView(textureView, indexOfChild2, qoe.e(-1, -1, nm7.D1));
            TextureViewRenderer textureViewRenderer = new TextureViewRenderer(getContext());
            this.c = textureViewRenderer;
            textureViewRenderer.setOpaque(false);
            this.c.setEnableHardwareScaler(true);
            this.c.setIsCamera(true);
            this.c.setRotateTextureWithScreen(true);
            this.c.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(this.c, indexOfChild2 + 1, qoe.e(-1, -1, nm7.D1));
            this.c.setAlpha(1.0f);
            if (isAttachedToWindow()) {
                c();
            }
        }
        z96 z96Var2 = this.e;
        if (z96Var2 != null) {
            z96Var2.setVisibility(z ? 0 : 8);
            this.f.setVisibility(z ? 0 : 8);
        }
        TextureViewRenderer textureViewRenderer2 = this.c;
        if (textureViewRenderer2 == null) {
            textureViewRenderer2 = null;
        }
        if (textureViewRenderer2 != null) {
            textureViewRenderer2.setVisibility(z ? 8 : 0);
            this.d.setVisibility(z ? 8 : 0);
        }
        if (this.r != z) {
            this.r = z;
            this.y = false;
            f(false, false);
            requestLayout();
        }
    }

    public final void a(s96 s96Var) {
        if (s96Var instanceof vo9) {
            setStreamMode(true);
            ((vo9) s96Var).L(this.e);
        } else if (s96Var instanceof oo9) {
            setStreamMode(false);
            ((oo9) s96Var).L(getSink());
        }
    }

    public final void b(View view, int i, int i2) {
        float measuredWidth = view.getMeasuredWidth();
        float f = i;
        float measuredHeight = view.getMeasuredHeight();
        float f2 = i2;
        float max = Math.max(measuredWidth / f, measuredHeight / f2);
        view.setScaleX(max);
        view.setScaleY(max);
        view.setTranslationX((f - (measuredWidth * max)) / 2.0f);
        view.setTranslationY(((f2 - (measuredHeight * max)) / 2.0f) - (this.H / 2.0f));
    }

    public final void c() {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            this.c.setBackgroundRenderer(this.d);
        }
    }

    public final void d(Runnable runnable, boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        yj3 yj3Var = this.b;
        yj3Var.setVisibility(0);
        b61 b61Var = (b61) yj3Var.d;
        yj3Var.animate().alpha(this.I ? 1.0f : 0.0f).setInterpolator(d53.h).setDuration(320L).withEndAction(new y8c((byte) 23, this, z)).start();
        b61Var.setVisibility((!z || runnable == null) ? 8 : 0);
        b61Var.setOnClickListener(runnable == null ? null : new xl3(runnable, (byte) 5));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        s96 s96Var;
        q96 q96Var;
        if (i == nm7.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            c40 c40Var = this.F;
            if (c40Var == null || (s96Var = (s96) c40Var.b) == null || s96Var.j() != longValue) {
                return;
            }
            boolean p = ((s96) this.F.b).p();
            if (((s96) this.F.b).b()) {
                s96 s96Var2 = (s96) this.F.b;
                Objects.requireNonNull(s96Var2);
                q96Var = new q96(s96Var2, (byte) 9);
            } else {
                q96Var = null;
            }
            d(q96Var, p);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!gm.m0) {
            super.draw(canvas);
            return;
        }
        if (this.r) {
            if (this.f != null) {
                canvas.save();
                canvas.translate(this.f.getX(), this.f.getY());
                this.f.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        TextureView textureView = this.d;
        if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d.getX(), this.d.getY());
        canvas.scale((this.d.getScaleX() * this.d.getWidth()) / bitmap.getWidth(), (this.d.getScaleY() * this.d.getHeight()) / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!gm.m0 || !(view instanceof TextureView) || view.getVisibility() != 0) {
            return super.drawChild(canvas, view, j);
        }
        TextureView textureView = (TextureView) view;
        Bitmap bitmap = textureView.getBitmap();
        if (bitmap == null) {
            return true;
        }
        canvas.save();
        canvas.translate(textureView.getX(), textureView.getY());
        canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j, c40 c40Var) {
        int i;
        q96 q96Var;
        s96 s96Var;
        s96 s96Var2;
        int L;
        int width;
        TextureView videoTextureView = getVideoTextureView();
        if (c40Var == null) {
            long j2 = this.E;
            if (j2 != 0 && this.y && videoTextureView != null) {
                File file = new File(bc4.z(4), wi8.n(j2, "live", ".jpg"));
                Bitmap bitmap = videoTextureView.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = gm.L(100.0f);
                        i = 4;
                        L = (int) ((bitmap.getHeight() / bitmap.getWidth()) * gm.L(100.0f));
                    } else {
                        i = 4;
                        L = gm.L(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * gm.L(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, L, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, gm.L(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    if (this.E != j) {
                        bf0 bf0Var = this.s;
                        if (j == 0) {
                            bf0Var.b();
                        } else {
                            String absolutePath = new File(bc4.z(i), wi8.n(j, "live", ".jpg")).getAbsolutePath();
                            int i2 = this.a;
                            if (j > 0) {
                                TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
                                gn5 l = gn5.l(this.a, 1, W1);
                                int c = W1 != null ? pc0.c(W1.id) : on2.f(0.2f, -16777216, -1);
                                bf0Var.getImageReceiver().Y(gn5.g(absolutePath), "500_500_nocache", l, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{on2.f(0.2f, c, -16777216), on2.f(0.4f, c, -16777216)}), 0L, null, W1, 0);
                            } else {
                                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
                                gn5 a = gn5.a(1, L0);
                                int c2 = L0 != null ? pc0.c(L0.id) : on2.f(0.2f, -16777216, -1);
                                bf0Var.getImageReceiver().Y(gn5.g(absolutePath), "500_500_nocache", a, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{on2.f(0.2f, c2, -16777216), on2.f(0.4f, c2, -16777216)}), 0L, null, L0, 0);
                            }
                        }
                    }
                    this.E = j;
                    this.F = c40Var;
                    if (this.y && c40Var != null && !c40Var.a) {
                        c40Var.a = true;
                        c40Var.m();
                    }
                    boolean z = c40Var == null && (s96Var2 = (s96) c40Var.b) != null && s96Var2.p();
                    if (c40Var == null && (s96Var = (s96) c40Var.b) != null && s96Var.b()) {
                        s96 s96Var3 = (s96) c40Var.b;
                        Objects.requireNonNull(s96Var3);
                        q96Var = new q96(s96Var3, (byte) 9);
                    } else {
                        q96Var = null;
                    }
                    d(q96Var, z);
                }
            }
        }
        i = 4;
        if (this.E != j) {
        }
        this.E = j;
        this.F = c40Var;
        if (this.y) {
            c40Var.a = true;
            c40Var.m();
        }
        if (c40Var == null) {
        }
        if (c40Var == null) {
        }
        q96Var = null;
        d(q96Var, z);
    }

    public final void f(boolean z, boolean z2) {
        View textureView;
        if ((z || !z2) && (textureView = getTextureView()) != null) {
            if (z2) {
                wi8.t(textureView.animate().alpha(z ? 1.0f : 0.0f), d53.h, 320L);
            } else {
                textureView.animate().cancel();
                textureView.setAlpha(z ? 1.0f : 0.0f);
            }
        }
    }

    public final void g() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!isAttachedToWindow() || measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        if (this.r) {
            if (this.e != null) {
                this.f.setTranslationY((-this.H) / 2.0f);
                b(this.e, measuredWidth, measuredHeight);
                return;
            }
            return;
        }
        TextureView textureView = this.d;
        if (textureView != null) {
            TextureViewRenderer textureViewRenderer = this.c;
            if (textureViewRenderer == null) {
                textureViewRenderer = null;
            }
            int measuredWidth2 = textureView.getMeasuredWidth();
            int measuredHeight2 = this.d.getMeasuredHeight();
            this.d.setPivotX(0.0f);
            this.d.setPivotY(0.0f);
            float f = measuredWidth;
            float f2 = measuredWidth2;
            float f3 = measuredHeight;
            float f4 = measuredHeight2;
            float max = Math.max(f / f2, f3 / f4);
            this.d.setScaleX(max);
            this.d.setScaleY(max);
            this.d.setTranslationX((f - (f2 * max)) / 2.0f);
            this.d.setTranslationY(b10.b(f4, max, f3, 2.0f) - (this.H / 2.0f));
            b(textureViewRenderer, measuredWidth, measuredHeight);
        }
    }

    public Bitmap getBitmap() {
        TextureView videoTextureView = getVideoTextureView();
        if (videoTextureView != null) {
            return videoTextureView.getBitmap();
        }
        return null;
    }

    public View getPlaceholderView() {
        if (this.w == null) {
            View view = new View(getContext());
            this.w = view;
            addView(view, qoe.g());
        }
        return this.w;
    }

    public VideoSink getSink() {
        setStreamMode(false);
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        if (this.r) {
            return this.e;
        }
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        return null;
    }

    public TextureView getVideoTextureView() {
        return this.r ? this.e : this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        nm7.f(this.a).b(this, nm7.G2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        f(false, false);
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        nm7.f(this.a).n(this, nm7.G2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        if (!this.y) {
            c40 c40Var = this.F;
            if (c40Var != null && !c40Var.a) {
                c40Var.a = true;
                c40Var.m();
            }
            this.y = true;
        }
        f(true, true);
        Runnable runnable = this.x;
        if (runnable != null) {
            runnable.run();
            this.x = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.s.layout(0, 0, i5, i6);
        this.b.layout(0, 0, i5, i6);
        View view = this.w;
        if (view != null) {
            view.layout(0, 0, i5, i6);
        }
        TextureView textureView = this.d;
        if (textureView != null) {
            textureView.layout(0, 0, textureView.getMeasuredWidth(), this.d.getMeasuredHeight());
            TextureViewRenderer textureViewRenderer = this.c;
            if (textureViewRenderer == null) {
                textureViewRenderer = null;
            }
            textureViewRenderer.layout(0, 0, textureViewRenderer.getMeasuredWidth(), textureViewRenderer.getMeasuredHeight());
        }
        if (this.e != null) {
            this.f.layout(0, 0, i5, i6);
            z96 z96Var = this.e;
            z96Var.layout(0, 0, z96Var.getMeasuredWidth(), this.e.getMeasuredHeight());
        }
        g();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.r || this.d == null) {
            super.onMeasure(i, i2);
            return;
        }
        this.G = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.G = false;
        super.onMeasure(i, i2);
        TextureViewRenderer textureViewRenderer2 = this.c;
        if (textureViewRenderer2 == null) {
            textureViewRenderer2 = null;
        }
        this.d.getLayoutParams().width = textureViewRenderer2.getMeasuredWidth();
        this.d.getLayoutParams().height = textureViewRenderer2.getMeasuredHeight();
        super.onMeasure(i, i2);
        TextureViewRenderer textureViewRenderer3 = this.c;
        if (textureViewRenderer3 != null) {
            textureViewRenderer3.updateRotation();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i) {
        if (this.a == i) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.a = i;
            return;
        }
        nm7 f = nm7.f(this.a);
        int i2 = nm7.G2;
        f.n(this, i2);
        this.a = i;
        nm7.f(i).b(this, i2);
    }

    public void setKeyboardOffset(float f) {
        this.H = f;
        g();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.x = runnable;
    }

    public void setSecure(boolean z) {
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
