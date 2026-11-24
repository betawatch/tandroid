// default package

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
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xw extends FrameLayout implements cr3, fkb {
    public static final /* synthetic */ int W = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public boolean K;
    public final int L;
    public TL_iv.pageBlockVideo M;
    public yw N;
    public TL_iv.PageBlock O;
    public TLRPC.Document P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public c47 U;
    public boolean V;
    public final ui5 a;
    public final ey b;
    public bx c;
    public bx d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final jy h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final ev s;
    public final byte w;
    public boolean x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public xw(Context context, ui5 ui5Var, ey eyVar, int i) {
        super(context);
        this.a = ui5Var;
        this.b = eyVar;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.G0 = true;
        imageReceiver.H0 = true;
        this.w = i;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.L = er3.q(((o) ui5Var).Y).k();
        ev evVar = new ev(context, ui5Var, eyVar, 1);
        this.s = evVar;
        jy jyVar = new jy(context);
        this.h = jyVar;
        jyVar.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        jyVar.addView(textureView, qoe.e(-1, -2, 1));
        frameLayout.addView(jyVar, qoe.e(-1, -1, 17));
        addView(frameLayout, qoe.c(-2.0f, -1));
        addView(evVar, qoe.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i = this.J;
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 8;
        }
        return i == 3 ? 0 : 4;
    }

    @Override // cr3
    public final void A(boolean z) {
        e(false);
    }

    @Override // cr3
    public final void N(String str) {
        this.r.o(true, 1.0f);
        if (!this.Q) {
            e(true);
        } else {
            this.J = 2;
            a();
        }
    }

    public final void a() {
        int i = ((o) this.a).Y;
        int i2 = this.J;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i2 == 0) {
            this.T = false;
            radialProgress2.o(false, 0.0f);
            boolean z = this.Q;
            ey eyVar = this.b;
            if (z) {
                imageReceiver.Z(gn5.b(this.P), null, gn5.c(bc4.w(this.P.thumbs, 40, false, null, false), this.P), "80_80_b", null, this.P.size, null, eyVar.F, 1);
            } else {
                bc4.G(i).X(this.P, eyVar.F, 1, 1);
            }
            this.J = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                imageReceiver.u0 = true;
                imageReceiver.w0(false);
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
            bc4.G(i).f(this.P);
        }
        this.J = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, yw ywVar, boolean z, boolean z2) {
        ui5 ui5Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (ui5Var = this.a).x) != null && ui5Var.y == this) {
            vh6 vh6Var = ui5Var.E;
            long j = pageblockvideo2.video_id;
            yw a = yw.a(videoPlayerHolderBase, this);
            this.N = a;
            vh6Var.k(a, j);
        }
        this.M = pageblockvideo;
        this.N = ywVar;
        TLRPC.Document document = null;
        this.O = null;
        this.R = z;
        ey eyVar = this.b;
        if (eyVar != null) {
            document = dy.a(eyVar.F, pageblockvideo.video_id);
            this.P = document;
        } else {
            this.P = null;
        }
        this.Q = k47.J4(document) || k47.s3(this.P, false);
        this.x = z2;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(yw ywVar) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        yw ywVar2 = this.N;
        if (ywVar2 != null && (bitmap2 = ywVar.b) != null && (bitmap3 = ywVar2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            ywVar2 = this.N;
            ywVar2.b = null;
        }
        if (ywVar2 != null && ywVar.b == null && (bitmap = ywVar2.b) != null) {
            ywVar.a = ywVar2.a;
            ywVar.b = bitmap;
        }
        this.N = ywVar;
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
            imageReceiver.I();
            e(false);
            return;
        }
        if (this.V) {
            this.V = false;
            TL_iv.pageBlockVideo pageblockvideo = this.M;
            ui5 ui5Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = ui5Var.x) != null && ui5Var.y == this) {
                vh6 vh6Var = ui5Var.E;
                long j = pageblockvideo.video_id;
                yw a = yw.a(videoPlayerHolderBase, this);
                c(a);
                vh6Var.k(a, j);
            }
            imageReceiver.K();
            er3.q(((o) ui5Var).Y).v(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(boolean z) {
        int i = ((o) this.a).Y;
        String r = bc4.r(null, this.P);
        bc4.G(i);
        File I = bc4.I(this.P);
        bc4.G(i);
        boolean z2 = true;
        boolean z3 = I.exists() || bc4.J(this.P, null, true, true).exists();
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z3) {
            er3.q(i).v(this);
            if (this.Q) {
                this.J = -1;
            } else {
                this.J = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            er3.q(i).a(r, null, this);
            yw ywVar = this.N;
            float f = 0.0f;
            if (ywVar == null || ywVar.b == null) {
                if (bc4.G(i).S(r)) {
                    this.J = 1;
                    Float s = fn5.z().s(r);
                    if (s != null) {
                        f = s.floatValue();
                    }
                } else if (!this.T && this.S && this.Q) {
                    this.J = 1;
                } else {
                    this.J = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z2, z);
                radialProgress2.o(false, f);
            } else {
                this.J = -1;
            }
            z2 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z2, z);
            radialProgress2.o(false, f);
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

    @Override // cr3
    public int getObserverTag() {
        return this.L;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override // cr3
    public final void i(long j, long j2) {
        this.r.o(true, Math.min(1.0f, j / j2));
        if (this.J != 1) {
            e(true);
        }
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.M != null) {
            ImageReceiver imageReceiver = this.e;
            if (!imageReceiver.B() || imageReceiver.i1 != 1.0f) {
                canvas.drawRect(imageReceiver.Q0, o.q1);
            }
            imageReceiver.h(canvas, null);
            bx bxVar = this.c;
            ui5 ui5Var = this.a;
            int i = 0;
            if (bxVar != null) {
                canvas.save();
                canvas.translate(this.y, this.E);
                o.s(ui5Var, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.y, this.E + this.F);
                o.s(ui5Var, canvas, this, i);
                this.d.d(canvas, this);
                canvas.restore();
            }
            o.r(canvas, ui5Var, this.M, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.R0) {
                this.r.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(jb6.M0(2131753898, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        TL_iv.pageBlockVideo pageblockvideo;
        int L;
        int i5;
        int i6;
        int i7;
        ey eyVar;
        boolean z;
        float f;
        int i8;
        int i9;
        int i10;
        Bitmap bitmap;
        boolean z2;
        float f2;
        float f3;
        float f4;
        int i11;
        int size = View.MeasureSpec.getSize(i);
        char c = 2;
        byte b = this.w;
        int i12 = 1;
        if (b == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i4 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (b != 2) {
                i3 = size;
                i4 = 0;
                int i13 = ((o) this.a).Y;
                pageblockvideo = this.M;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo != null) {
                    if (b != 0 || (i11 = pageblockvideo.level) <= 0) {
                        this.y = gm.L(18.0f);
                        L = i3 - gm.L(36.0f);
                        i5 = 0;
                        i6 = i3;
                    } else {
                        i5 = gm.L(18.0f) + gm.L(i11 * 14);
                        this.y = i5;
                        i6 = wi8.B(18.0f, i5, i3);
                        L = i6;
                    }
                    TLRPC.Document document = this.P;
                    ey eyVar2 = this.b;
                    if (document != null) {
                        int L2 = gm.L(48.0f);
                        TLRPC.PhotoSize w = bc4.w(this.P.thumbs, 48, false, null, false);
                        if (b == 0) {
                            int size2 = this.P.attributes.size();
                            int i14 = 0;
                            f = 2.0f;
                            while (true) {
                                if (i14 >= size2) {
                                    z2 = false;
                                    break;
                                }
                                char c2 = c;
                                if (this.P.attributes.get(i14) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i4 = (int) ((i6 / r13.w) * r13.h);
                                    z2 = true;
                                    break;
                                } else {
                                    i14++;
                                    c = c2;
                                }
                            }
                            if (w != null) {
                                f2 = w.w;
                                f3 = w.h;
                            } else {
                                f2 = 100.0f;
                                f3 = 100.0f;
                            }
                            if (!z2) {
                                i4 = (int) ((i6 / f2) * f3);
                            }
                            if (this.O instanceof TL_iv.pageBlockCover) {
                                i4 = Math.min(i4, i6);
                                f4 = 100.0f;
                            } else {
                                Point point = gm.q;
                                f4 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - gm.L(56.0f)) * 0.9f);
                                if (i4 > max) {
                                    i6 = (int) ((max / f3) * f2);
                                    i5 += ((i3 - i5) - i6) / 2;
                                    i4 = max;
                                }
                            }
                            if (i4 == 0) {
                                i4 = gm.L(f4);
                            } else if (i4 < L2) {
                                i4 = L2;
                            }
                        } else {
                            f = 2.0f;
                            if (b == 2) {
                                if ((this.U.l & 2) == 0) {
                                    i6 -= gm.L(2.0f);
                                }
                                if ((this.U.l & 8) == 0) {
                                    int i15 = i6;
                                    i8 = i4;
                                    i4 -= gm.L(2.0f);
                                    i9 = i5;
                                    i10 = i15;
                                    imageReceiver.I0 = this.P;
                                    imageReceiver.i0(i9, (!this.x || b == 1 || b == 2 || this.M.level > 0) ? 0 : gm.L(8.0f), i10, i4);
                                    if (!this.R) {
                                        if (this.Q) {
                                            yw ywVar = this.N;
                                            if (ywVar == null || (bitmap = ywVar.b) == null) {
                                                this.S = er3.q(i13).c(4, this.P.size);
                                                bc4.G(i13);
                                                File I = bc4.I(this.P);
                                                bc4.G(i13);
                                                File J = bc4.J(this.P, null, true, true);
                                                if (this.S || I.exists() || J.exists()) {
                                                    imageReceiver.O = null;
                                                    imageReceiver.Y(null, null, gn5.b(this.P), "200_200_pframe", gn5.c(w, this.P), "80_80_b", null, this.P.size, null, eyVar2.F, 1);
                                                } else {
                                                    imageReceiver.O = gn5.b(this.P);
                                                    imageReceiver.Y(null, null, null, null, gn5.c(w, this.P), "80_80_b", null, this.P.size, null, eyVar2.F, 1);
                                                }
                                            } else {
                                                imageReceiver.O = null;
                                                imageReceiver.f0(bitmap);
                                            }
                                        } else {
                                            imageReceiver.O = null;
                                            imageReceiver.Z(null, null, gn5.c(w, this.P), "80_80_b", null, 0L, null, eyVar2 != null ? eyVar2.F : null, 1);
                                        }
                                    }
                                    imageReceiver.S0 = true;
                                    float f5 = L2;
                                    float f6 = f;
                                    int z3 = (int) aq1.z(imageReceiver.N0, f5, f6, imageReceiver.L0);
                                    this.G = z3;
                                    int z4 = (int) aq1.z(imageReceiver.O0, f5, f6, imageReceiver.M0);
                                    this.H = z4;
                                    this.r.p(z3, z4, z3 + L2, L2 + z4);
                                    i7 = i8;
                                }
                            }
                        }
                        i9 = i5;
                        i10 = i6;
                        i8 = i4;
                        imageReceiver.I0 = this.P;
                        imageReceiver.i0(i9, (!this.x || b == 1 || b == 2 || this.M.level > 0) ? 0 : gm.L(8.0f), i10, i4);
                        if (!this.R) {
                        }
                        imageReceiver.S0 = true;
                        float f52 = L2;
                        float f62 = f;
                        int z32 = (int) aq1.z(imageReceiver.N0, f52, f62, imageReceiver.L0);
                        this.G = z32;
                        int z42 = (int) aq1.z(imageReceiver.O0, f52, f62, imageReceiver.M0);
                        this.H = z42;
                        this.r.p(z32, z42, z32 + L2, L2 + z42);
                        i7 = i8;
                    } else {
                        i7 = i4;
                    }
                    int L3 = (int) (imageReceiver.M0 + imageReceiver.O0 + gm.L(8.0f));
                    this.E = L3;
                    if (b == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
                        bx m = o.m(this.a, this, null, pageblockvideo2.caption.text, L, L3, pageblockvideo2, this.b);
                        this.c = m;
                        if (m != null) {
                            int height = this.c.d.getHeight() + gm.L(4.0f);
                            this.F = height;
                            i7 = hg9.v(4.0f, height, i7);
                            bx bxVar = this.c;
                            bxVar.s = this.y;
                            bxVar.w = this.E;
                        }
                        int i16 = i7;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.M;
                        eyVar = eyVar2;
                        bx n = o.n(this.a, this, null, pageblockvideo3.caption.credit, L, 0, pageblockvideo3, (eyVar2 == null || !eyVar2.H) ? Layout.Alignment.ALIGN_NORMAL : oya.a(), 0, this.b);
                        this.d = n;
                        if (n != null) {
                            i7 = this.d.d.getHeight() + gm.L(4.0f) + i16;
                            bx bxVar2 = this.d;
                            bxVar2.s = this.y;
                            bxVar2.w = this.E + this.F;
                        } else {
                            i7 = i16;
                        }
                    } else {
                        eyVar = eyVar2;
                    }
                    if (!this.x && b == 0 && this.M.level <= 0) {
                        i7 += gm.L(8.0f);
                    }
                    if ((this.O instanceof TL_iv.pageBlockCover) && eyVar != null) {
                        ArrayList arrayList = eyVar.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z = true;
                            i12 = (b != 2 || z) ? i7 : gm.L(8.0f) + i7;
                        }
                    }
                    z = false;
                    if (b != 2) {
                    }
                }
                ev evVar = this.s;
                evVar.measure(i, i2);
                evVar.setTranslationY(imageReceiver.O0 - gm.L(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.L0;
                layoutParams.topMargin = (int) imageReceiver.M0;
                layoutParams.width = (int) imageReceiver.N0;
                layoutParams.height = (int) imageReceiver.O0;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
            }
            float f7 = this.U.f;
            Point point2 = gm.q;
            i4 = (int) Math.ceil(f7 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i3 = size;
        int i132 = ((o) this.a).Y;
        pageblockvideo = this.M;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo != null) {
        }
        ev evVar2 = this.s;
        evVar2.measure(i, i2);
        evVar2.setTranslationY(imageReceiver2.O0 - gm.L(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.L0;
        layoutParams2.topMargin = (int) imageReceiver2.M0;
        layoutParams2.width = (int) imageReceiver2.N0;
        layoutParams2.height = (int) imageReceiver2.O0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 <= (gm.L(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ev evVar = this.s;
        int visibility = evVar.getVisibility();
        ey eyVar = this.b;
        if (visibility != 0 || y <= evVar.getTranslationY() || y >= evVar.getTranslationY() + gm.L(39.0f)) {
            if (motionEvent.getAction() == 0 && this.e.H(x, y)) {
                if (this.J != -1) {
                    if (x >= this.G && x <= gm.L(48.0f) + r2) {
                        if (y >= this.H) {
                        }
                    }
                }
                if (this.J != 0) {
                    this.I = true;
                }
                this.K = true;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.I) {
                    this.I = false;
                    this.a.b(eyVar, this.M);
                } else if (this.K) {
                    this.K = false;
                    playSoundEffect(0);
                    a();
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.I = false;
            }
            if (!this.I && !this.K) {
                if (!o.i(this.a, this.b, motionEvent, this, this.c, this.y, this.E)) {
                    if (!o.i(this.a, this.b, motionEvent, this, this.d, this.y, this.E + this.F) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (eyVar != null && eyVar.G != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }

    @Override // cr3
    public final void l(long j, long j2) {
    }
}
