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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s1 extends View implements org.telegram.ui.Cells.j9 {
    public TL_iv.pageBlockEmbedPost D;
    public final m60 a;
    public final f4 b;
    public final ImageReceiver c;
    public final org.telegram.ui.Components.r8 d;
    public z2 e;
    public z2 f;
    public z2 h;
    public z2 n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public s1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.a = m60Var;
        this.b = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(20.0f));
        imageReceiver.y0(org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
        this.d = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
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
        int i10;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.D;
        if (pageblockembedpost == null) {
            return;
        }
        boolean z10 = pageblockembedpost instanceof w3;
        m60 m60Var = this.a;
        if (z10) {
            canvas2 = canvas;
        } else {
            if (this.r) {
                this.c.h(canvas, null);
            }
            if (this.f != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L((this.r ? 54 : 0) + 32), org.telegram.messenger.i0.L(this.e != null ? 10.0f : 19.0f));
                h4.t(m60Var, canvas, this, 0);
                this.f.d(canvas, this);
                canvas.restore();
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L((this.r ? 54 : 0) + 32), org.telegram.messenger.i0.L(29.0f));
                h4.t(m60Var, canvas, this, i10);
                this.e.d(canvas, this);
                canvas.restore();
                i10++;
            }
            canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(20.0f), this.y - (this.D.level == 0 ? org.telegram.messenger.i0.L(6.0f) : 0), h4.r1);
            r2 = i10;
        }
        if (this.h != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            h4.t(m60Var, canvas2, this, r2);
            this.h.d(canvas2, this);
            canvas2.restore();
            r2++;
        }
        if (this.n != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            h4.t(m60Var, canvas2, this, r2);
            this.n.d(canvas2, this);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754867, null));
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
    public final void onMeasure(int i10, int i11) {
        z2 z2Var;
        z2 n10;
        z2 z2Var2;
        z2 z2Var3;
        z2 z2Var4;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.D;
        int i12 = 1;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof w3;
            f4 f4Var = this.b;
            if (z10) {
                this.s = org.telegram.messenger.i0.L(18.0f);
                this.w = org.telegram.messenger.i0.L(4.0f);
                int L = size - org.telegram.messenger.i0.L(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.D;
                z2 o10 = h4.o(this.a, this, null, pageblockembedpost2.caption.text, L, this.w, pageblockembedpost2, this.b);
                this.h = o10;
                if (o10 != null) {
                    int height = this.h.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                    this.x = height;
                    r14 = org.telegram.messenger.i0.L(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.D;
                z2 n11 = h4.n(this.a, this, null, pageblockembedpost3.caption.credit, L, 0, pageblockembedpost3, f4Var.G ? org.telegram.ui.Components.ov0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
                this.n = n11;
                if (n11 != null) {
                    r14 += this.n.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                }
                i12 = r14;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                boolean z11 = j10 != 0;
                this.r = z11;
                if (z11) {
                    TLRPC.Photo e = e4.e(f4Var.E, j10);
                    boolean z12 = e instanceof TLRPC.TL_photo;
                    this.r = z12;
                    if (z12) {
                        String str = this.D.author;
                        org.telegram.ui.Components.r8 r8Var = this.d;
                        r8Var.k(0L, str, null, null);
                        z2Var = null;
                        this.c.p0(org.telegram.messenger.ic.i(org.telegram.messenger.b8.w(e.sizes, org.telegram.messenger.i0.L(40.0f), true, null, false), e), "40_40", r8Var, 0L, null, f4Var.E, 1);
                        String str2 = this.D.author;
                        int L2 = size - org.telegram.messenger.i0.L((!this.r ? 54 : 0) + 50);
                        TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.D;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        z2 z2Var5 = z2Var;
                        n10 = h4.n(this.a, this, str2, null, L2, 0, pageblockembedpost4, alignment, 1, this.b);
                        this.f = n10;
                        if (n10 != null) {
                            n10.s = org.telegram.messenger.i0.L((this.r ? 54 : 0) + 32);
                            this.f.w = org.telegram.messenger.i0.L(this.e != null ? 10.0f : 19.0f);
                        }
                        if (this.D.date == 0) {
                            this.e = h4.o(this.a, this, org.telegram.messenger.cd.D0().h0().format(this.D.date * 1000), null, size - org.telegram.messenger.i0.L((this.r ? 54 : 0) + 50), org.telegram.messenger.i0.L(29.0f), this.D, this.b);
                        } else {
                            this.e = z2Var5;
                        }
                        int L3 = org.telegram.messenger.i0.L(56.0f);
                        if (this.D.blocks.isEmpty()) {
                            this.h = z2Var5;
                            this.n = z2Var5;
                        } else {
                            this.s = org.telegram.messenger.i0.L(32.0f);
                            this.w = org.telegram.messenger.i0.L(56.0f);
                            int L4 = size - org.telegram.messenger.i0.L(50.0f);
                            TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.D;
                            z2 o11 = h4.o(this.a, this, null, pageblockembedpost5.caption.text, L4, this.w, pageblockembedpost5, this.b);
                            this.h = o11;
                            if (o11 != null) {
                                int height2 = this.h.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                                this.x = height2;
                                L3 = org.telegram.messenger.m5.C(4.0f, height2, L3);
                            }
                            int i13 = L3;
                            TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.D;
                            z2 n12 = h4.n(this.a, this, null, pageblockembedpost6.caption.credit, L4, 0, pageblockembedpost6, f4Var.G ? org.telegram.ui.Components.ov0.a() : alignment, 0, this.b);
                            this.n = n12;
                            L3 = n12 != null ? this.n.d.getHeight() + org.telegram.messenger.i0.L(4.0f) + i13 : i13;
                        }
                        z2Var2 = this.e;
                        if (z2Var2 != null) {
                            z2Var2.s = org.telegram.messenger.i0.L((this.r ? 54 : 0) + 32);
                            this.e.w = org.telegram.messenger.i0.L(29.0f);
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
                        i12 = L3;
                    }
                }
                z2Var = null;
                String str22 = this.D.author;
                int L22 = size - org.telegram.messenger.i0.L((!this.r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost42 = this.D;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                z2 z2Var52 = z2Var;
                n10 = h4.n(this.a, this, str22, null, L22, 0, pageblockembedpost42, alignment2, 1, this.b);
                this.f = n10;
                if (n10 != null) {
                }
                if (this.D.date == 0) {
                }
                int L32 = org.telegram.messenger.i0.L(56.0f);
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
                i12 = L32;
            }
            this.y = i12;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.j(this.a, this.b, motionEvent, this, this.h, this.s, this.w)) {
            return true;
        }
        return h4.j(this.a, this.b, motionEvent, this, this.n, this.s, this.w + this.x) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.D = pageblockembedpost;
        requestLayout();
    }
}
