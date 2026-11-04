package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.Cells.g9 {
    public static final /* synthetic */ int W = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public final int L;
    public TL_iv.pageBlockVideo M;
    public x2 N;
    public TL_iv.PageBlock O;
    public TLRPC.Document P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public org.telegram.messenger.ri U;
    public boolean V;
    public final i50 a;
    public final g4 b;
    public a3 c;
    public a3 d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final l4 h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final b1 s;
    public final int w;
    public boolean x;
    public int y;

    public w2(Context context, i50 i50Var, g4 g4Var, int i3) {
        super(context);
        this.a = i50Var;
        this.b = g4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.G0 = true;
        imageReceiver.H0 = true;
        this.w = i3;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.L = org.telegram.messenger.z5.q(((i4) i50Var).Y).k();
        b1 b1Var = new b1(context, i50Var, g4Var, 1);
        this.s = b1Var;
        l4 l4Var = new l4(context);
        this.h = l4Var;
        l4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        l4Var.addView(textureView, b8.mf.e(-1, -2, 1));
        frameLayout.addView(l4Var, b8.mf.e(-1, -1, 17));
        addView(frameLayout, b8.mf.c(-2.0f, -1));
        addView(b1Var, b8.mf.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i3 = this.J;
        if (i3 == 0) {
            return 2;
        }
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 2) {
            return 8;
        }
        return i3 == 3 ? 0 : 4;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        e(false);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.r.p(true, 1.0f);
        if (!this.Q) {
            e(true);
        } else {
            this.J = 2;
            a();
        }
    }

    public final void a() {
        int i3 = ((i4) this.a).Y;
        int i10 = this.J;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i10 == 0) {
            this.T = false;
            radialProgress2.p(false, 0.0f);
            boolean z10 = this.Q;
            g4 g4Var = this.b;
            if (z10) {
                imageReceiver.r0(org.telegram.messenger.ac.b(this.P), null, org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(this.P.thumbs, 40, false, null, false), this.P), "80_80_b", null, this.P.size, null, g4Var.F, 1);
            } else {
                org.telegram.messenger.w7.G(i3).X(this.P, g4Var.F, 1, 1);
            }
            this.J = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                imageReceiver.u0 = true;
                imageReceiver.P0(false);
                this.J = -1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                return;
            }
            return;
        }
        this.T = true;
        if (this.Q) {
            imageReceiver.c();
        } else {
            org.telegram.messenger.w7.G(i3).f(this.P);
        }
        this.J = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, x2 x2Var, boolean z10, boolean z11) {
        i50 i50Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (i50Var = this.a).x) != null && i50Var.y == this) {
            a0.h hVar = i50Var.E;
            long j10 = pageblockvideo2.video_id;
            x2 a10 = x2.a(videoPlayerHolderBase, this);
            this.N = a10;
            hVar.k(a10, j10);
        }
        this.M = pageblockvideo;
        this.N = x2Var;
        this.O = null;
        this.R = z10;
        g4 g4Var = this.b;
        if (g4Var != null) {
            this.P = e4.a(g4Var.F, pageblockvideo.video_id);
        } else {
            this.P = null;
        }
        this.Q = org.telegram.messenger.zi.L4(this.P) || org.telegram.messenger.zi.t3(this.P, false);
        this.x = z11;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(x2 x2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        x2 x2Var2 = this.N;
        if (x2Var2 != null && (bitmap2 = x2Var.b) != null && (bitmap3 = x2Var2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.N.b = null;
        }
        x2 x2Var3 = this.N;
        if (x2Var3 != null && x2Var.b == null && (bitmap = x2Var3.b) != null) {
            x2Var.a = x2Var3.a;
            x2Var.b = bitmap;
        }
        this.N = x2Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (this.V) {
                return;
            }
            this.V = true;
            imageReceiver.P();
            e(false);
            return;
        }
        if (this.V) {
            this.V = false;
            TL_iv.pageBlockVideo pageblockvideo = this.M;
            i50 i50Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = i50Var.x) != null && i50Var.y == this) {
                a0.h hVar = i50Var.E;
                long j10 = pageblockvideo.video_id;
                x2 a10 = x2.a(videoPlayerHolderBase, this);
                c(a10);
                hVar.k(a10, j10);
            }
            imageReceiver.R();
            org.telegram.messenger.z5.q(((i4) i50Var).Y).v(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        int i3 = ((i4) this.a).Y;
        String r5 = org.telegram.messenger.w7.r(null, this.P);
        org.telegram.messenger.w7.G(i3);
        File I = org.telegram.messenger.w7.I(this.P);
        org.telegram.messenger.w7.G(i3);
        boolean z11 = true;
        boolean z12 = I.exists() || org.telegram.messenger.w7.K(this.P, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r5);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.z5.q(i3).v(this);
            if (this.Q) {
                this.J = -1;
            } else {
                this.J = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.z5.q(i3).a(r5, null, this);
            x2 x2Var = this.N;
            float f10 = 0.0f;
            if (x2Var == null || x2Var.b == null) {
                if (org.telegram.messenger.w7.G(i3).T(r5)) {
                    this.J = 1;
                    Float w10 = org.telegram.messenger.zb.D().w(r5);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                } else if (!this.T && this.S && this.Q) {
                    this.J = 1;
                } else {
                    this.J = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
                radialProgress2.p(false, f10);
            } else {
                this.J = -1;
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
            radialProgress2.p(false, f10);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.M;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.L;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.r.p(true, Math.min(1.0f, j10 / j11));
        if (this.J != 1) {
            e(true);
        }
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.M == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (!imageReceiver.I() || imageReceiver.i1 != 1.0f) {
            canvas.drawRect(imageReceiver.Q0, i4.q1);
        }
        imageReceiver.h(canvas, null);
        a3 a3Var = this.c;
        i50 i50Var = this.a;
        int i3 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.y, this.E);
            i4.t(i50Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i3 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.y, this.E + this.F);
            i4.t(i50Var, canvas, this, i3);
            this.d.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.M, getMeasuredHeight());
        super.onDraw(canvas);
        if (imageReceiver.R0) {
            this.r.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131753933, null));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        TL_iv.pageBlockVideo pageblockvideo;
        int L;
        int i13;
        int i14;
        int i15;
        g4 g4Var;
        boolean z10;
        float f10;
        int i16;
        int i17;
        int i18;
        Bitmap bitmap;
        boolean z11;
        float f11;
        int i19;
        int size = View.MeasureSpec.getSize(i3);
        char c2 = 2;
        int i20 = this.w;
        int i21 = 1;
        if (i20 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i12 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i20 != 2) {
                i11 = size;
                i12 = 0;
                int i22 = ((i4) this.a).Y;
                pageblockvideo = this.M;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo != null) {
                    if (i20 != 0 || (i19 = pageblockvideo.level) <= 0) {
                        this.y = org.telegram.messenger.g0.L(18.0f);
                        L = i11 - org.telegram.messenger.g0.L(36.0f);
                        i13 = 0;
                        i14 = i11;
                    } else {
                        i13 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i19 * 14);
                        this.y = i13;
                        i14 = org.telegram.messenger.camera.q.w(18.0f, i13, i11);
                        L = i14;
                    }
                    TLRPC.Document document = this.P;
                    g4 g4Var2 = this.b;
                    if (document != null) {
                        int L2 = org.telegram.messenger.g0.L(48.0f);
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(this.P.thumbs, 48, false, null, false);
                        if (i20 == 0) {
                            int size2 = this.P.attributes.size();
                            int i23 = 0;
                            f10 = 2.0f;
                            while (true) {
                                if (i23 >= size2) {
                                    z11 = false;
                                    break;
                                }
                                char c10 = c2;
                                if (this.P.attributes.get(i23) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i12 = (int) ((i14 / r13.w) * r13.h);
                                    z11 = true;
                                    break;
                                } else {
                                    i23++;
                                    c2 = c10;
                                }
                            }
                            float f12 = w10 != null ? w10.w : 100.0f;
                            float f13 = w10 != null ? w10.h : 100.0f;
                            if (!z11) {
                                i12 = (int) ((i14 / f12) * f13);
                            }
                            if (this.O instanceof TL_iv.pageBlockCover) {
                                i12 = Math.min(i12, i14);
                                f11 = 100.0f;
                            } else {
                                Point point = org.telegram.messenger.g0.q;
                                f11 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.g0.L(56.0f)) * 0.9f);
                                if (i12 > max) {
                                    i14 = (int) ((max / f13) * f12);
                                    i13 += ((i11 - i13) - i14) / 2;
                                    i12 = max;
                                }
                            }
                            if (i12 == 0) {
                                i12 = org.telegram.messenger.g0.L(f11);
                            } else if (i12 < L2) {
                                i12 = L2;
                            }
                        } else {
                            f10 = 2.0f;
                            if (i20 == 2) {
                                if ((this.U.l & 2) == 0) {
                                    i14 -= org.telegram.messenger.g0.L(2.0f);
                                }
                                if ((this.U.l & 8) == 0) {
                                    int i24 = i14;
                                    i16 = i12;
                                    i12 -= org.telegram.messenger.g0.L(2.0f);
                                    i17 = i13;
                                    i18 = i24;
                                    imageReceiver.I0 = this.P;
                                    imageReceiver.y0(i17, (!this.x || i20 == 1 || i20 == 2 || this.M.level > 0) ? 0 : org.telegram.messenger.g0.L(8.0f), i18, i12);
                                    if (!this.R) {
                                        if (this.Q) {
                                            x2 x2Var = this.N;
                                            if (x2Var == null || (bitmap = x2Var.b) == null) {
                                                this.S = org.telegram.messenger.z5.q(i22).c(4, this.P.size);
                                                org.telegram.messenger.w7.G(i22);
                                                File I = org.telegram.messenger.w7.I(this.P);
                                                org.telegram.messenger.w7.G(i22);
                                                File K = org.telegram.messenger.w7.K(this.P, null, true, true);
                                                if (this.S || I.exists() || K.exists()) {
                                                    imageReceiver.O = null;
                                                    imageReceiver.u0(null, null, org.telegram.messenger.ac.b(this.P), "200_200_pframe", org.telegram.messenger.ac.c(w10, this.P), "80_80_b", null, this.P.size, null, g4Var2.F, 1);
                                                } else {
                                                    imageReceiver.O = org.telegram.messenger.ac.b(this.P);
                                                    imageReceiver.u0(null, null, null, null, org.telegram.messenger.ac.c(w10, this.P), "80_80_b", null, this.P.size, null, g4Var2.F, 1);
                                                }
                                            } else {
                                                imageReceiver.O = null;
                                                imageReceiver.v0(bitmap);
                                            }
                                        } else {
                                            imageReceiver.O = null;
                                            imageReceiver.r0(null, null, org.telegram.messenger.ac.c(w10, this.P), "80_80_b", null, 0L, null, g4Var2 != null ? g4Var2.F : null, 1);
                                        }
                                    }
                                    imageReceiver.S0 = true;
                                    float f14 = L2;
                                    float f15 = f10;
                                    int z12 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, f14, f15, imageReceiver.L0);
                                    this.G = z12;
                                    int z13 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.O0, f14, f15, imageReceiver.M0);
                                    this.H = z13;
                                    this.r.r(z12, z13, z12 + L2, L2 + z13);
                                    i15 = i16;
                                }
                            }
                        }
                        i17 = i13;
                        i18 = i14;
                        i16 = i12;
                        imageReceiver.I0 = this.P;
                        imageReceiver.y0(i17, (!this.x || i20 == 1 || i20 == 2 || this.M.level > 0) ? 0 : org.telegram.messenger.g0.L(8.0f), i18, i12);
                        if (!this.R) {
                        }
                        imageReceiver.S0 = true;
                        float f142 = L2;
                        float f152 = f10;
                        int z122 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, f142, f152, imageReceiver.L0);
                        this.G = z122;
                        int z132 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.O0, f142, f152, imageReceiver.M0);
                        this.H = z132;
                        this.r.r(z122, z132, z122 + L2, L2 + z132);
                        i15 = i16;
                    } else {
                        i15 = i12;
                    }
                    int L3 = (int) (imageReceiver.M0 + imageReceiver.O0 + org.telegram.messenger.g0.L(8.0f));
                    this.E = L3;
                    if (i20 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
                        a3 o10 = i4.o(this.a, this, null, pageblockvideo2.caption.text, L, L3, pageblockvideo2, this.b);
                        this.c = o10;
                        if (o10 != null) {
                            int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                            this.F = height;
                            i15 = org.telegram.messenger.k5.C(4.0f, height, i15);
                            a3 a3Var = this.c;
                            a3Var.s = this.y;
                            a3Var.w = this.E;
                        }
                        int i25 = i15;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.M;
                        g4Var = g4Var2;
                        a3 n4 = i4.n(this.a, this, null, pageblockvideo3.caption.credit, L, 0, pageblockvideo3, (g4Var2 == null || !g4Var2.H) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), 0, this.b);
                        this.d = n4;
                        if (n4 != null) {
                            i15 = this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f) + i25;
                            a3 a3Var2 = this.d;
                            a3Var2.s = this.y;
                            a3Var2.w = this.E + this.F;
                        } else {
                            i15 = i25;
                        }
                    } else {
                        g4Var = g4Var2;
                    }
                    if (!this.x && i20 == 0 && this.M.level <= 0) {
                        i15 += org.telegram.messenger.g0.L(8.0f);
                    }
                    if ((this.O instanceof TL_iv.pageBlockCover) && g4Var != null) {
                        ArrayList arrayList = g4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z10 = true;
                            i21 = (i20 != 2 || z10) ? i15 : org.telegram.messenger.g0.L(8.0f) + i15;
                        }
                    }
                    z10 = false;
                    if (i20 != 2) {
                    }
                }
                b1 b1Var = this.s;
                b1Var.measure(i3, i10);
                b1Var.setTranslationY(imageReceiver.O0 - org.telegram.messenger.g0.L(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.L0;
                layoutParams.topMargin = (int) imageReceiver.M0;
                layoutParams.width = (int) imageReceiver.N0;
                layoutParams.height = (int) imageReceiver.O0;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
            }
            float f16 = this.U.f;
            Point point2 = org.telegram.messenger.g0.q;
            i12 = (int) Math.ceil(f16 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i11 = size;
        int i222 = ((i4) this.a).Y;
        pageblockvideo = this.M;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo != null) {
        }
        b1 b1Var2 = this.s;
        b1Var2.measure(i3, i10);
        b1Var2.setTranslationY(imageReceiver2.O0 - org.telegram.messenger.g0.L(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.L0;
        layoutParams2.topMargin = (int) imageReceiver2.M0;
        layoutParams2.width = (int) imageReceiver2.N0;
        layoutParams2.height = (int) imageReceiver2.O0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i21, TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 <= (org.telegram.messenger.g0.L(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        b1 b1Var = this.s;
        int visibility = b1Var.getVisibility();
        g4 g4Var = this.b;
        if (visibility != 0 || y9 <= b1Var.getTranslationY() || y9 >= b1Var.getTranslationY() + org.telegram.messenger.g0.L(39.0f)) {
            if (motionEvent.getAction() == 0 && this.e.O(x10, y9)) {
                if (this.J != -1) {
                    if (x10 >= this.G && x10 <= org.telegram.messenger.g0.L(48.0f) + r2) {
                        if (y9 >= this.H) {
                        }
                    }
                }
                if (this.J != 0) {
                    this.I = true;
                }
                this.K = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.I) {
                    this.I = false;
                    this.a.b(this.M, g4Var);
                } else if (this.K == 1) {
                    this.K = 0;
                    playSoundEffect(0);
                    a();
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.I = false;
            }
            if (!this.I && this.K == 0) {
                if (!i4.j(this.a, this.b, motionEvent, this, this.c, this.y, this.E)) {
                    if (!i4.j(this.a, this.b, motionEvent, this, this.d, this.y, this.E + this.F) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (g4Var != null && g4Var.G != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        d();
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
