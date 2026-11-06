package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class r1 extends View implements org.telegram.ui.Cells.h9 {
    public TL_iv.pageBlockEmbedPost D;
    public final o50 a;
    public final e4 b;
    public final ImageReceiver c;
    public final org.telegram.ui.Components.w8 d;
    public z2 e;
    public z2 f;
    public z2 h;
    public z2 n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public r1(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.a = o50Var;
        this.b = e4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(20.0f));
        imageReceiver.y0(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        this.d = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            arrayList.add(z2Var3);
        }
        z2 z2Var4 = this.n;
        if (z2Var4 != null) {
            arrayList.add(z2Var4);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            z2Var3.i(this);
        }
        z2 z2Var4 = this.n;
        if (z2Var4 != null) {
            z2Var4.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
        z2 z2Var3 = this.h;
        if (z2Var3 != null) {
            z2Var3.f(this);
        }
        z2 z2Var4 = this.n;
        if (z2Var4 != null) {
            z2Var4.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.D;
        if (pageblockembedpost == null) {
            return;
        }
        boolean z9 = pageblockembedpost instanceof v3;
        o50 o50Var = this.a;
        if (z9) {
            canvas2 = canvas;
        } else {
            if (this.r) {
                this.c.h(canvas, null);
            }
            if (this.f != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L((this.r ? 54 : 0) + 32), org.telegram.messenger.g0.L(this.e != null ? 10.0f : 19.0f));
                g4.t(o50Var, canvas, this, 0);
                this.f.d(canvas, this);
                canvas.restore();
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L((this.r ? 54 : 0) + 32), org.telegram.messenger.g0.L(29.0f));
                g4.t(o50Var, canvas, this, i7);
                this.e.d(canvas, this);
                canvas.restore();
                i7++;
            }
            canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(20.0f), this.y - (this.D.level == 0 ? org.telegram.messenger.g0.L(6.0f) : 0), g4.r1);
            r2 = i7;
        }
        if (this.h != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            g4.t(o50Var, canvas2, this, r2);
            this.h.d(canvas2, this);
            canvas2.restore();
            r2++;
        }
        if (this.n != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            g4.t(o50Var, canvas2, this, r2);
            this.n.d(canvas2, this);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.M0(2131754867, null));
        if (this.f != null) {
            sb2.append(", ");
            sb2.append(this.f.d.getText());
        }
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.n != null) {
            sb2.append(", ");
            sb2.append(this.n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        z2 z2Var;
        z2 n10;
        z2 z2Var2;
        z2 z2Var3;
        z2 z2Var4;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.D;
        int i11 = 1;
        if (pageblockembedpost != null) {
            boolean z9 = pageblockembedpost instanceof v3;
            e4 e4Var = this.b;
            if (z9) {
                this.s = org.telegram.messenger.g0.L(18.0f);
                this.w = org.telegram.messenger.g0.L(4.0f);
                int L = size - org.telegram.messenger.g0.L(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.D;
                z2 o4 = g4.o(this.a, this, null, pageblockembedpost2.caption.text, L, this.w, pageblockembedpost2, this.b);
                this.h = o4;
                if (o4 != null) {
                    int height = this.h.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                    this.x = height;
                    r14 = org.telegram.messenger.g0.L(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.D;
                z2 n11 = g4.n(this.a, this, null, pageblockembedpost3.caption.credit, L, 0, pageblockembedpost3, e4Var.G ? org.telegram.ui.Components.mu0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
                this.n = n11;
                if (n11 != null) {
                    r14 += this.n.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                }
                i11 = r14;
            } else {
                long j3 = pageblockembedpost.author_photo_id;
                boolean z10 = j3 != 0;
                this.r = z10;
                if (z10) {
                    TLRPC.Photo e10 = d4.e(e4Var.E, j3);
                    boolean z11 = e10 instanceof TLRPC.TL_photo;
                    this.r = z11;
                    if (z11) {
                        String str = this.D.author;
                        org.telegram.ui.Components.w8 w8Var = this.d;
                        w8Var.k(0L, str, null, null);
                        z2Var = null;
                        this.c.p0(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(e10.sizes, org.telegram.messenger.g0.L(40.0f), true, null, false), e10), "40_40", w8Var, 0L, null, e4Var.E, 1);
                        String str2 = this.D.author;
                        int L2 = size - org.telegram.messenger.g0.L((!this.r ? 54 : 0) + 50);
                        TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.D;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        z2 z2Var5 = z2Var;
                        n10 = g4.n(this.a, this, str2, null, L2, 0, pageblockembedpost4, alignment, 1, this.b);
                        this.f = n10;
                        if (n10 != null) {
                            n10.s = org.telegram.messenger.g0.L((this.r ? 54 : 0) + 32);
                            this.f.w = org.telegram.messenger.g0.L(this.e != null ? 10.0f : 19.0f);
                        }
                        if (this.D.date == 0) {
                            this.e = g4.o(this.a, this, org.telegram.messenger.hd.E0().h0().format(this.D.date * 1000), null, size - org.telegram.messenger.g0.L((this.r ? 54 : 0) + 50), org.telegram.messenger.g0.L(29.0f), this.D, this.b);
                        } else {
                            this.e = z2Var5;
                        }
                        int L3 = org.telegram.messenger.g0.L(56.0f);
                        if (this.D.blocks.isEmpty()) {
                            this.h = z2Var5;
                            this.n = z2Var5;
                        } else {
                            this.s = org.telegram.messenger.g0.L(32.0f);
                            this.w = org.telegram.messenger.g0.L(56.0f);
                            int L4 = size - org.telegram.messenger.g0.L(50.0f);
                            TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.D;
                            z2 o10 = g4.o(this.a, this, null, pageblockembedpost5.caption.text, L4, this.w, pageblockembedpost5, this.b);
                            this.h = o10;
                            if (o10 != null) {
                                int height2 = this.h.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                                this.x = height2;
                                L3 = org.telegram.messenger.k5.C(4.0f, height2, L3);
                            }
                            int i12 = L3;
                            TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.D;
                            z2 n12 = g4.n(this.a, this, null, pageblockembedpost6.caption.credit, L4, 0, pageblockembedpost6, e4Var.G ? org.telegram.ui.Components.mu0.a() : alignment, 0, this.b);
                            this.n = n12;
                            L3 = n12 != null ? this.n.d.getHeight() + org.telegram.messenger.g0.L(4.0f) + i12 : i12;
                        }
                        z2Var2 = this.e;
                        if (z2Var2 != null) {
                            z2Var2.s = org.telegram.messenger.g0.L((this.r ? 54 : 0) + 32);
                            this.e.w = org.telegram.messenger.g0.L(29.0f);
                        }
                        z2Var3 = this.h;
                        if (z2Var3 != null) {
                            z2Var3.s = this.s;
                            z2Var3.w = this.w;
                        }
                        z2Var4 = this.n;
                        if (z2Var4 != null) {
                            z2Var4.s = this.s;
                            z2Var4.w = this.w;
                        }
                        i11 = L3;
                    }
                }
                z2Var = null;
                String str22 = this.D.author;
                int L22 = size - org.telegram.messenger.g0.L((!this.r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost42 = this.D;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                z2 z2Var52 = z2Var;
                n10 = g4.n(this.a, this, str22, null, L22, 0, pageblockembedpost42, alignment2, 1, this.b);
                this.f = n10;
                if (n10 != null) {
                }
                if (this.D.date == 0) {
                }
                int L32 = org.telegram.messenger.g0.L(56.0f);
                if (this.D.blocks.isEmpty()) {
                }
                z2Var2 = this.e;
                if (z2Var2 != null) {
                }
                z2Var3 = this.h;
                if (z2Var3 != null) {
                }
                z2Var4 = this.n;
                if (z2Var4 != null) {
                }
                i11 = L32;
            }
            this.y = i11;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.a, this.b, motionEvent, this, this.h, this.s, this.w)) {
            return true;
        }
        return g4.j(this.a, this.b, motionEvent, this, this.n, this.s, this.w + this.x) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.D = pageblockembedpost;
        requestLayout();
    }
}
