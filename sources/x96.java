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
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class x96 extends FrameLayout implements RendererCommon.RendererEvents, fn7 {
    public long E;
    public d30 F;
    public boolean G;
    public float H;
    public boolean I;
    public int a;
    public final gj3 b;
    public bnb c;
    public TextureView d;
    public ea6 e;
    public a81 f;
    public Bitmap h;
    public long n;
    public boolean r;
    public final de0 s;
    public View w;
    public Runnable x;
    public boolean y;

    public x96(Context context, int i) {
        super(context);
        this.a = i;
        de0 de0Var = new de0(context);
        this.s = de0Var;
        de0Var.setAlpha(0.75f);
        addView(de0Var, tre.e(-1, -1, jn7.D1));
        gj3 gj3Var = new gj3(context);
        this.b = gj3Var;
        gj3Var.setAlpha(0.0f);
        gj3Var.setVisibility(8);
        addView(gj3Var, tre.e(-1, -1, jn7.D1));
    }

    private void setStreamMode(boolean z) {
        View view = this.b;
        if (z) {
            if (this.e == null) {
                int indexOfChild = indexOfChild(view);
                a81 a81Var = new a81(getContext());
                this.f = a81Var;
                addView(a81Var, indexOfChild, tre.e(-1, -1, jn7.D1));
                ea6 ea6Var = new ea6(getContext(), new kj4((Object) this, (byte) 12));
                this.e = ea6Var;
                addView(ea6Var, indexOfChild + 1, tre.e(-1, -1, jn7.D1));
                this.e.setAlpha(0.0f);
            }
        } else if (this.d == null) {
            int indexOfChild2 = indexOfChild(view);
            TextureView textureView = new TextureView(getContext());
            this.d = textureView;
            addView(textureView, indexOfChild2, tre.e(-1, -1, jn7.D1));
            bnb bnbVar = new bnb(getContext());
            this.c = bnbVar;
            bnbVar.setOpaque(false);
            this.c.setEnableHardwareScaler(true);
            this.c.setIsCamera(true);
            this.c.setRotateTextureWithScreen(true);
            this.c.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(this.c, indexOfChild2 + 1, tre.e(-1, -1, jn7.D1));
            this.c.setAlpha(1.0f);
            if (isAttachedToWindow()) {
                c();
            }
        }
        ea6 ea6Var2 = this.e;
        if (ea6Var2 != null) {
            ea6Var2.setVisibility(z ? 0 : 8);
            this.f.setVisibility(z ? 0 : 8);
        }
        bnb bnbVar2 = this.c;
        if (bnbVar2 == null) {
            bnbVar2 = null;
        }
        if (bnbVar2 != null) {
            bnbVar2.setVisibility(z ? 8 : 0);
            this.d.setVisibility(z ? 8 : 0);
        }
        if (this.r != z) {
            this.r = z;
            this.y = false;
            f(false, false);
            requestLayout();
        }
    }

    public final void a(w96 w96Var) {
        if (w96Var instanceof kq9) {
            setStreamMode(true);
            ((kq9) w96Var).L(this.e);
        } else if (w96Var instanceof dq9) {
            setStreamMode(false);
            ((dq9) w96Var).L(getSink());
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
        bnb bnbVar = this.c;
        if (bnbVar != null) {
            bnbVar.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            this.c.setBackgroundRenderer(this.d);
        }
    }

    public final void d(Runnable runnable, boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        gj3 gj3Var = this.b;
        gj3Var.setVisibility(0);
        c51 c51Var = (c51) gj3Var.d;
        gj3Var.animate().alpha(this.I ? 1.0f : 0.0f).setInterpolator(k43.h).setDuration(320L).withEndAction(new xac((byte) 23, this, z)).start();
        c51Var.setVisibility((!z || runnable == null) ? 8 : 0);
        c51Var.setOnClickListener(runnable == null ? null : new el3(runnable, (byte) 5));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        w96 w96Var;
        u96 u96Var;
        if (i == jn7.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            d30 d30Var = this.F;
            if (d30Var == null || (w96Var = (w96) d30Var.b) == null || w96Var.j() != longValue) {
                return;
            }
            boolean p = ((w96) this.F.b).p();
            if (((w96) this.F.b).b()) {
                w96 w96Var2 = (w96) this.F.b;
                Objects.requireNonNull(w96Var2);
                u96Var = new u96(w96Var2, (byte) 9);
            } else {
                u96Var = null;
            }
            d(u96Var, p);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!hl.m0) {
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
        if (!hl.m0 || !(view instanceof TextureView) || view.getVisibility() != 0) {
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
    public final void e(long j, d30 d30Var) {
        int i;
        u96 u96Var;
        w96 w96Var;
        w96 w96Var2;
        int L;
        int width;
        TextureView videoTextureView = getVideoTextureView();
        if (d30Var == null) {
            long j2 = this.E;
            if (j2 != 0 && this.y && videoTextureView != null) {
                File file = new File(xb4.z(4), ik8.n(j2, "live", ".jpg"));
                Bitmap bitmap = videoTextureView.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = hl.L(100.0f);
                        i = 4;
                        L = (int) ((bitmap.getHeight() / bitmap.getWidth()) * hl.L(100.0f));
                    } else {
                        i = 4;
                        L = hl.L(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * hl.L(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, L, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, hl.L(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    if (this.E != j) {
                        de0 de0Var = this.s;
                        if (j == 0) {
                            de0Var.b();
                        } else {
                            String absolutePath = new File(xb4.z(i), ik8.n(j, "live", ".jpg")).getAbsolutePath();
                            int i2 = this.a;
                            if (j > 0) {
                                TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
                                jn5 l = jn5.l(this.a, 1, X1);
                                int c = X1 != null ? rb0.c(X1.id) : vm2.f(0.2f, -16777216, -1);
                                de0Var.getImageReceiver().Y(jn5.g(absolutePath), "500_500_nocache", l, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{vm2.f(0.2f, c, -16777216), vm2.f(0.4f, c, -16777216)}), 0L, null, X1, 0);
                            } else {
                                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
                                jn5 a = jn5.a(1, M0);
                                int c2 = M0 != null ? rb0.c(M0.id) : vm2.f(0.2f, -16777216, -1);
                                de0Var.getImageReceiver().Y(jn5.g(absolutePath), "500_500_nocache", a, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{vm2.f(0.2f, c2, -16777216), vm2.f(0.4f, c2, -16777216)}), 0L, null, M0, 0);
                            }
                        }
                    }
                    this.E = j;
                    this.F = d30Var;
                    if (this.y && d30Var != null && !d30Var.a) {
                        d30Var.a = true;
                        d30Var.m();
                    }
                    boolean z = d30Var == null && (w96Var2 = (w96) d30Var.b) != null && w96Var2.p();
                    if (d30Var == null && (w96Var = (w96) d30Var.b) != null && w96Var.b()) {
                        w96 w96Var3 = (w96) d30Var.b;
                        Objects.requireNonNull(w96Var3);
                        u96Var = new u96(w96Var3, (byte) 9);
                    } else {
                        u96Var = null;
                    }
                    d(u96Var, z);
                }
            }
        }
        i = 4;
        if (this.E != j) {
        }
        this.E = j;
        this.F = d30Var;
        if (this.y) {
            d30Var.a = true;
            d30Var.m();
        }
        if (d30Var == null) {
        }
        if (d30Var == null) {
        }
        u96Var = null;
        d(u96Var, z);
    }

    public final void f(boolean z, boolean z2) {
        View textureView;
        if ((z || !z2) && (textureView = getTextureView()) != null) {
            if (z2) {
                ik8.t(textureView.animate().alpha(z ? 1.0f : 0.0f), k43.h, 320L);
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
            bnb bnbVar = this.c;
            if (bnbVar == null) {
                bnbVar = null;
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
            this.d.setTranslationY(c00.c(f4, max, f3, 2.0f) - (this.H / 2.0f));
            b(bnbVar, measuredWidth, measuredHeight);
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
            addView(view, tre.g());
        }
        return this.w;
    }

    public VideoSink getSink() {
        setStreamMode(false);
        bnb bnbVar = this.c;
        if (bnbVar != null) {
            return bnbVar;
        }
        return null;
    }

    public View getTextureView() {
        if (this.r) {
            return this.e;
        }
        bnb bnbVar = this.c;
        if (bnbVar != null) {
            return bnbVar;
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
        jn7.f(this.a).b(this, jn7.G2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        f(false, false);
        bnb bnbVar = this.c;
        if (bnbVar != null) {
            bnbVar.e();
        }
        jn7.f(this.a).n(this, jn7.G2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        if (!this.y) {
            d30 d30Var = this.F;
            if (d30Var != null && !d30Var.a) {
                d30Var.a = true;
                d30Var.m();
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
            bnb bnbVar = this.c;
            if (bnbVar == null) {
                bnbVar = null;
            }
            bnbVar.layout(0, 0, bnbVar.getMeasuredWidth(), bnbVar.getMeasuredHeight());
        }
        if (this.e != null) {
            this.f.layout(0, 0, i5, i6);
            ea6 ea6Var = this.e;
            ea6Var.layout(0, 0, ea6Var.getMeasuredWidth(), this.e.getMeasuredHeight());
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
        bnb bnbVar = this.c;
        if (bnbVar != null) {
            bnbVar.setScreenRotation(defaultDisplay.getRotation());
        }
        this.G = false;
        super.onMeasure(i, i2);
        bnb bnbVar2 = this.c;
        if (bnbVar2 == null) {
            bnbVar2 = null;
        }
        this.d.getLayoutParams().width = bnbVar2.getMeasuredWidth();
        this.d.getLayoutParams().height = bnbVar2.getMeasuredHeight();
        super.onMeasure(i, i2);
        bnb bnbVar3 = this.c;
        if (bnbVar3 != null) {
            bnbVar3.f();
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
        jn7 f = jn7.f(this.a);
        int i2 = jn7.G2;
        f.n(this, i2);
        this.a = i;
        jn7.f(i).b(this, i2);
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
