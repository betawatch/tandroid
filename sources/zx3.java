// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class zx3 extends ViewGroup implements tjb {
    public boolean E;
    public Boolean F;
    public float G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public int K;
    public int L;
    public int M;
    public float N;
    public final /* synthetic */ cy3 O;
    public Long a;
    public boolean b;
    public final boolean c;
    public final be0 d;
    public final oy8 e;
    public final oh8 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public h04 w;
    public vl x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx3(cy3 cy3Var, Context context, int i) {
        super(context);
        this.O = cy3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(bkb.N(cy3Var.k(), 0, 0));
        oy8 oy8Var = new oy8(i, gl.L(24.0f), gl.L(24.0f), false, null);
        this.e = oy8Var;
        oy8Var.setBounds(gl.L(3.0f), gl.L(3.0f), gl.L(27.0f), gl.L(27.0f));
        oy8Var.M(this);
        oy8Var.E(true);
        oy8Var.start();
        d();
    }

    private void setColor(int i) {
        cy3 cy3Var = this.O;
        int i2 = cy3Var.T;
        if (i2 == 5 || i2 == 7) {
            i = cy3Var.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        be0 be0Var = this.d;
        if (be0Var != null && !this.c) {
            be0Var.setColorFilter(porterDuffColorFilter);
            be0Var.invalidate();
        }
        oy8 oy8Var = this.e;
        if (oy8Var != null) {
            oy8Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        oh8 oh8Var = this.f;
        if (oh8Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            oh8Var.setImageResource(R.drawable.msg_mini_lockedemoji);
            return;
        }
        Drawable mutate = getResources().getDrawable(R.drawable.msg_mini_addemoji).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        oh8Var.setImageDrawable(mutate);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Df));
        hashSet.add(Integer.valueOf(bkb.Ff));
        hashSet.add(Integer.valueOf(bkb.Ml));
    }

    public final void b() {
        ml mlVar;
        vl vlVar = this.x;
        if (vlVar == null || (mlVar = vlVar.k) == null) {
            return;
        }
        if (mlVar.y() != null) {
            mlVar.y().H(0);
            mlVar.y().stop();
        } else if (mlVar.m() != null) {
            mlVar.m().stop();
        }
    }

    public final void c() {
        gl5 gl5Var;
        TLRPC.PhotoSize w;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        vl m;
        be0 be0Var = this.d;
        if (be0Var == null) {
            return;
        }
        if (this.y && this.E) {
            vl vlVar = this.x;
            if (vlVar != null) {
                vlVar.o(be0Var);
                this.x = null;
            } else if (this.s != null || this.r != null) {
                be0Var.b();
                TLRPC.Document document = this.s;
                int i = y6c.t0;
                cy3 cy3Var = this.O;
                if (document != null) {
                    m = vl.l(i, cy3Var.S, document);
                    this.x = m;
                } else {
                    m = vl.m(i, this.r.longValue(), null, cy3Var.S);
                    this.x = m;
                }
                m.b(be0Var);
                be0Var.setImageDrawable(this.x);
            }
            be0Var.b();
            h04 h04Var = this.w;
            if (h04Var != null) {
                TLRPC.StickerSet stickerSet = h04Var.b;
                if (stickerSet == null || (w = ba4.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                    gl5Var = null;
                } else {
                    if (stickerSet.access_hash != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSet.id;
                        tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    TLRPC.FileLocation fileLocation = w.location;
                    gl5Var = gl5.h(fileLocation, w.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w.type);
                }
                this.d.n(gl5Var, "24_24", null, null, this.w);
                if (this.w.d != null) {
                    hq6.d0(y6c.t0).n0(this.w.d, false);
                    this.w.d = null;
                }
            }
        } else {
            vl vlVar2 = this.x;
            if (vlVar2 != null) {
                vlVar2.o(be0Var);
                this.x = null;
            }
            be0Var.b();
        }
        if (this.y && this.E) {
            be0Var.onAttachedToWindow();
        } else {
            be0Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        cy3 cy3Var = this.O;
        int k = cy3Var.k();
        wjb wjbVar = cy3Var.s;
        bkb.F1(background, k, false);
        if (cy3Var.P) {
            setColor(bm2.o(bkb.v0(bkb.Ml, wjbVar), (int) (gl.R1(0.4f, 0.8f, this.H) * 255.0f)));
        } else {
            setColor(bm2.f(this.H, bkb.v0(bkb.Df, wjbVar), bkb.v0(bkb.Ff, wjbVar)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        oy8 oy8Var = this.e;
        if (oy8Var == null || !this.E) {
            return;
        }
        oy8Var.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.E) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    public final void e(boolean z) {
        if (Math.abs(this.G - (z ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        float f = z ? 1.0f : 0.0f;
        this.G = f;
        oh8 oh8Var = this.f;
        oh8Var.setScaleX(f);
        oh8Var.setScaleY(this.G);
        oh8Var.setAlpha(this.G);
        oh8Var.setVisibility(z ? 0 : 8);
    }

    public final void f() {
        oh8 oh8Var = this.f;
        if (oh8Var == null || oh8Var.h || !(getDrawable() instanceof vl)) {
            return;
        }
        if (((vl) getDrawable()).c()) {
            oh8Var.setImageReceiver(null);
            oh8Var.setColor(this.O.Q);
            return;
        }
        ml mlVar = ((vl) getDrawable()).k;
        if (mlVar != null) {
            oh8Var.setImageReceiver(mlVar);
            oh8Var.invalidate();
        }
    }

    public final void g(boolean z, boolean z2) {
        be0 be0Var = this.d;
        if ((be0Var == null || be0Var.getImageReceiver().T != null || this.O.P) && this.I != z) {
            this.I = z;
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.J = null;
            }
            if (!z) {
                b();
            }
            if (!z2) {
                this.H = z ? 1.0f : 0.0f;
                d();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, z ? 1.0f : 0.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new uz1(this, (byte) 21));
            this.J.addListener(new y7((byte) 29, (Object) this, z));
            this.J.setDuration(pg5.d() ? 0L : 350L);
            this.J.setInterpolator(s33.h);
            this.J.start();
        }
    }

    public Drawable getDrawable() {
        be0 be0Var = this.d;
        if (be0Var != null) {
            return be0Var.getImageReceiver().T;
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (pg5.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.E) {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document e;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            h04 h04Var = this.w;
            if (h04Var == null || (stickerSet = h04Var.b) == null || (str = stickerSet.title) == null) {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = k27.V(document, null, null);
                } else {
                    Long l = this.r;
                    if (l != null && (e = vl.e(y6c.t0, l.longValue())) != null) {
                        contentDescription = k27.V(e, null, null);
                    }
                }
            } else {
                contentDescription = str;
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = k96.M0(2131750819, null);
            if (contentDescription == null) {
                contentDescription = M0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + M0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.I);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        be0 be0Var = this.d;
        if (be0Var != null) {
            int i5 = (i3 - i) / 2;
            int i6 = (i4 - i2) / 2;
            be0Var.layout(i5 - (be0Var.getMeasuredWidth() / 2), i6 - (be0Var.getMeasuredHeight() / 2), (be0Var.getMeasuredWidth() / 2) + i5, (be0Var.getMeasuredHeight() / 2) + i6);
        }
        oh8 oh8Var = this.f;
        if (oh8Var != null) {
            int i7 = i3 - i;
            int i8 = i4 - i2;
            oh8Var.layout(i7 - oh8Var.getMeasuredWidth(), i8 - oh8Var.getMeasuredHeight(), i7, i8);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gl.L(30.0f), gl.L(30.0f));
        be0 be0Var = this.d;
        if (be0Var != null) {
            be0Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
        }
        oh8 oh8Var = this.f;
        if (oh8Var != null) {
            oh8Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(12.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(12.0f), TLObject.FLAG_30));
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        ml mlVar;
        vl vlVar = this.x;
        if (vlVar != null && (mlVar = vlVar.k) != null) {
            if (mlVar.m() != null) {
                mlVar.m().y(0L, true, false);
            }
            mlVar.w0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        TLRPC.Document document2 = this.s;
        if ((document2 != null || this.r != null) && document != null) {
            Long l = this.r;
            if ((l != null ? l.longValue() : document2.id) == document.id) {
                return;
            }
        }
        vl vlVar = this.x;
        be0 be0Var = this.d;
        if (vlVar != null) {
            vlVar.o(be0Var);
            this.x = null;
        }
        be0Var.b();
        this.s = document;
        this.r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j) {
        TLRPC.Document document = this.s;
        if ((document != null || this.r != null) && j != 0) {
            Long l = this.r;
            if ((l != null ? l.longValue() : document.id) == j) {
                return;
            }
        }
        vl vlVar = this.x;
        be0 be0Var = this.d;
        if (vlVar != null) {
            vlVar.o(be0Var);
            this.x = null;
        }
        be0Var.b();
        this.s = null;
        this.r = j != 0 ? Long.valueOf(j) : null;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(h04 h04Var) {
        if (h04Var != null && h04Var.b == null) {
            h04Var = null;
        }
        h04 h04Var2 = this.w;
        if (h04Var2 == null || h04Var == null || h04Var2.b.id != h04Var.b.id) {
            vl vlVar = this.x;
            be0 be0Var = this.d;
            if (vlVar != null && this.s == null && this.r == null) {
                vlVar.o(be0Var);
                this.x = null;
            }
            be0Var.b();
            this.w = h04Var;
            c();
        }
    }

    @Override // tjb
    public final void updateColors() {
        cy3 cy3Var = this.O;
        try {
            int v0 = bkb.v0(bkb.Df, cy3Var.s);
            int v02 = bkb.v0(bkb.Ff, cy3Var.s);
            int k = cy3Var.k();
            if (v0 == this.K && v02 == this.L && k == this.M && this.N == this.H) {
                return;
            }
            this.K = v0;
            this.L = v02;
            this.M = k;
            this.N = this.H;
            d();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (pg5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx3(cy3 cy3Var, Context context, int i, boolean z) {
        super(context);
        this.O = cy3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.n = z;
        if (z) {
            setBackground(bkb.Y(cy3Var.k(), 8, 8));
        }
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.x = false;
        be0Var.setImageDrawable(context.getResources().getDrawable(i).mutate());
        d();
        addView(be0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx3(cy3 cy3Var, Context context, TLRPC.Document document) {
        super(context);
        this.O = cy3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        wx3 wx3Var = new wx3(this, context);
        this.d = wx3Var;
        wx3Var.x = false;
        this.s = document;
        this.c = true;
        wx3Var.setColorFilter(cy3Var.getEmojiColorFilter());
        addView(wx3Var);
        int i = oh8.M;
        xx3 xx3Var = new xx3(1, cy3Var.s, context);
        this.f = xx3Var;
        xx3Var.setAlpha(0.0f);
        xx3Var.setScaleX(0.0f);
        xx3Var.setScaleY(0.0f);
        f();
        addView(xx3Var);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx3(cy3 cy3Var, Context context, long j) {
        super(context);
        this.O = cy3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        kb0 kb0Var = new kb0((byte) 4, context, this);
        this.d = kb0Var;
        kb0Var.x = false;
        this.r = Long.valueOf(j);
        this.c = true;
        kb0Var.setColorFilter(cy3Var.getEmojiColorFilter());
        addView(kb0Var);
        int i = oh8.M;
        yx3 yx3Var = new yx3(1, cy3Var.s, context);
        this.f = yx3Var;
        yx3Var.setAlpha(0.0f);
        yx3Var.setScaleX(0.0f);
        yx3Var.setScaleY(0.0f);
        f();
        addView(yx3Var);
        d();
    }
}
