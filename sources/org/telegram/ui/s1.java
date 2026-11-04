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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s1 extends View implements org.telegram.ui.Cells.g9 {
    public TL_iv.pageBlockEmbedPost E;
    public final i50 a;
    public final g4 b;
    public final ImageReceiver c;
    public final org.telegram.ui.Components.u8 d;
    public a3 e;
    public a3 f;
    public a3 h;
    public a3 n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public s1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.a = i50Var;
        this.b = g4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(20.0f));
        imageReceiver.y0(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        this.d = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            arrayList.add(a3Var3);
        }
        a3 a3Var4 = this.n;
        if (a3Var4 != null) {
            arrayList.add(a3Var4);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            a3Var3.i(this);
        }
        a3 a3Var4 = this.n;
        if (a3Var4 != null) {
            a3Var4.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            a3Var3.f(this);
        }
        a3 a3Var4 = this.n;
        if (a3Var4 != null) {
            a3Var4.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        if (pageblockembedpost == null) {
            return;
        }
        boolean z10 = pageblockembedpost instanceof w3;
        i50 i50Var = this.a;
        if (z10) {
            canvas2 = canvas;
        } else {
            if (this.r) {
                this.c.h(canvas, null);
            }
            if (this.f != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L((this.r ? 54 : 0) + 32), org.telegram.messenger.g0.L(this.e != null ? 10.0f : 19.0f));
                i4.t(i50Var, canvas, this, 0);
                this.f.d(canvas, this);
                canvas.restore();
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L((this.r ? 54 : 0) + 32), org.telegram.messenger.g0.L(29.0f));
                i4.t(i50Var, canvas, this, i3);
                this.e.d(canvas, this);
                canvas.restore();
                i3++;
            }
            canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(20.0f), this.y - (this.E.level == 0 ? org.telegram.messenger.g0.L(6.0f) : 0), i4.s1);
            r2 = i3;
        }
        if (this.h != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            i4.t(i50Var, canvas2, this, r2);
            this.h.d(canvas2, this);
            canvas2.restore();
            r2++;
        }
        if (this.n != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            i4.t(i50Var, canvas2, this, r2);
            this.n.d(canvas2, this);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754867, null));
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
    public final void onMeasure(int i3, int i10) {
        a3 a3Var;
        a3 n4;
        a3 a3Var2;
        a3 a3Var3;
        a3 a3Var4;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        int i11 = 1;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof w3;
            g4 g4Var = this.b;
            if (z10) {
                this.s = org.telegram.messenger.g0.L(18.0f);
                this.w = org.telegram.messenger.g0.L(4.0f);
                int L = size - org.telegram.messenger.g0.L(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.E;
                a3 o10 = i4.o(this.a, this, null, pageblockembedpost2.caption.text, L, this.w, pageblockembedpost2, this.b);
                this.h = o10;
                if (o10 != null) {
                    int height = this.h.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                    this.x = height;
                    r14 = org.telegram.messenger.g0.L(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.E;
                a3 n10 = i4.n(this.a, this, null, pageblockembedpost3.caption.credit, L, 0, pageblockembedpost3, g4Var.H ? org.telegram.ui.Components.lu0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
                this.n = n10;
                if (n10 != null) {
                    r14 += this.n.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                }
                i11 = r14;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                boolean z11 = j10 != 0;
                this.r = z11;
                if (z11) {
                    TLRPC.Photo e10 = e4.e(g4Var.F, j10);
                    boolean z12 = e10 instanceof TLRPC.TL_photo;
                    this.r = z12;
                    if (z12) {
                        String str = this.E.author;
                        org.telegram.ui.Components.u8 u8Var = this.d;
                        u8Var.k(0L, str, null, null);
                        a3Var = null;
                        this.c.p0(org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(e10.sizes, org.telegram.messenger.g0.L(40.0f), true, null, false), e10), "40_40", u8Var, 0L, null, g4Var.F, 1);
                        String str2 = this.E.author;
                        int L2 = size - org.telegram.messenger.g0.L((!this.r ? 54 : 0) + 50);
                        TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.E;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        a3 a3Var5 = a3Var;
                        n4 = i4.n(this.a, this, str2, null, L2, 0, pageblockembedpost4, alignment, 1, this.b);
                        this.f = n4;
                        if (n4 != null) {
                            n4.s = org.telegram.messenger.g0.L((this.r ? 54 : 0) + 32);
                            this.f.w = org.telegram.messenger.g0.L(this.e != null ? 10.0f : 19.0f);
                        }
                        if (this.E.date == 0) {
                            this.e = i4.o(this.a, this, org.telegram.messenger.bd.E0().h0().format(this.E.date * 1000), null, size - org.telegram.messenger.g0.L((this.r ? 54 : 0) + 50), org.telegram.messenger.g0.L(29.0f), this.E, this.b);
                        } else {
                            this.e = a3Var5;
                        }
                        int L3 = org.telegram.messenger.g0.L(56.0f);
                        if (this.E.blocks.isEmpty()) {
                            this.h = a3Var5;
                            this.n = a3Var5;
                        } else {
                            this.s = org.telegram.messenger.g0.L(32.0f);
                            this.w = org.telegram.messenger.g0.L(56.0f);
                            int L4 = size - org.telegram.messenger.g0.L(50.0f);
                            TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.E;
                            a3 o11 = i4.o(this.a, this, null, pageblockembedpost5.caption.text, L4, this.w, pageblockembedpost5, this.b);
                            this.h = o11;
                            if (o11 != null) {
                                int height2 = this.h.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                                this.x = height2;
                                L3 = org.telegram.messenger.k5.C(4.0f, height2, L3);
                            }
                            int i12 = L3;
                            TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.E;
                            a3 n11 = i4.n(this.a, this, null, pageblockembedpost6.caption.credit, L4, 0, pageblockembedpost6, g4Var.H ? org.telegram.ui.Components.lu0.a() : alignment, 0, this.b);
                            this.n = n11;
                            L3 = n11 != null ? this.n.d.getHeight() + org.telegram.messenger.g0.L(4.0f) + i12 : i12;
                        }
                        a3Var2 = this.e;
                        if (a3Var2 != null) {
                            a3Var2.s = org.telegram.messenger.g0.L((this.r ? 54 : 0) + 32);
                            this.e.w = org.telegram.messenger.g0.L(29.0f);
                        }
                        a3Var3 = this.h;
                        if (a3Var3 != null) {
                            a3Var3.s = this.s;
                            a3Var3.w = this.w;
                        }
                        a3Var4 = this.n;
                        if (a3Var4 != null) {
                            a3Var4.s = this.s;
                            a3Var4.w = this.w;
                        }
                        i11 = L3;
                    }
                }
                a3Var = null;
                String str22 = this.E.author;
                int L22 = size - org.telegram.messenger.g0.L((!this.r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost42 = this.E;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                a3 a3Var52 = a3Var;
                n4 = i4.n(this.a, this, str22, null, L22, 0, pageblockembedpost42, alignment2, 1, this.b);
                this.f = n4;
                if (n4 != null) {
                }
                if (this.E.date == 0) {
                }
                int L32 = org.telegram.messenger.g0.L(56.0f);
                if (this.E.blocks.isEmpty()) {
                }
                a3Var2 = this.e;
                if (a3Var2 != null) {
                }
                a3Var3 = this.h;
                if (a3Var3 != null) {
                }
                a3Var4 = this.n;
                if (a3Var4 != null) {
                }
                i11 = L32;
            }
            this.y = i11;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.j(this.a, this.b, motionEvent, this, this.h, this.s, this.w)) {
            return true;
        }
        return i4.j(this.a, this.b, motionEvent, this, this.n, this.s, this.w + this.x) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.E = pageblockembedpost;
        requestLayout();
    }
}
