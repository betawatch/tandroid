package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class z0 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final o50 a;
    public final e4 b;
    public z2 c;
    public z2 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public z0(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.a = o50Var;
        this.b = e4Var;
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        int i7;
        o50 o50Var = this.a;
        o50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        z2 z2Var = this.c;
        if (z2Var != null) {
            i7 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (z2Var.k() + z2Var.s) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.min(i7, (z2Var2.k() + z2Var2.s) - L);
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        o50Var.getClass();
        return i7 - org.telegram.messenger.g0.L(f10);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        int i7;
        o50 o50Var = this.a;
        o50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        z2 z2Var = this.c;
        if (z2Var != null) {
            i7 = Math.max(TLObject.FLAG_31, z2Var.l() + z2Var.s + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.max(i7, z2Var2.l() + z2Var2.s + L);
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        o50Var.getClass();
        return org.telegram.messenger.g0.L(f10) + i7;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        o50 o50Var = this.a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.s;
            o50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            z2 z2Var2 = this.c;
            if (z2Var2 == null) {
                return -1;
            }
            m10 = z2Var2.m() + z2Var2.s;
            o50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        }
        return L + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        z2 z2Var = this.c;
        o50 o50Var = this.a;
        int i7 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            g4.t(o50Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            g4.t(o50Var, canvas, this, i7);
            this.d.d(canvas, this);
            canvas.restore();
        }
        e4 e4Var = this.b;
        if (e4Var == null || !e4Var.G) {
            o50Var.getClass();
            float L = org.telegram.messenger.g0.L((this.n.level * 14) + 18);
            float L2 = org.telegram.messenger.g0.L(6.0f);
            o50Var.getClass();
            canvas.drawRect(L, L2, org.telegram.messenger.g0.L((this.n.level * 14) + 20), getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), g4.r1);
        } else {
            canvas.drawRect(getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + r2, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), g4.r1);
        }
        g4.s(canvas, o50Var, this.n, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.c;
        e4 e4Var = this.b;
        o50 o50Var = this.a;
        if (z2Var != null && (h7 = g4.h(o50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(o50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.id.M0(2131754873, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        o50 o50Var = this.a;
        o50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        if (this.n != null) {
            o50Var.getClass();
            int L = size - org.telegram.messenger.g0.L(50);
            if (this.n.level > 0) {
                L -= org.telegram.messenger.g0.L(r2 * 14);
            }
            int i13 = L;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            z2 o4 = g4.o(this.a, this, null, pageblockblockquote.text, i13, this.h, pageblockblockquote, this.b);
            this.c = o4;
            if (o4 != null) {
                o50Var.getClass();
                i12 = this.c.d.getHeight() + org.telegram.messenger.g0.L(f10);
            } else {
                i12 = 0;
            }
            i11 = i12;
            int i14 = this.n.level;
            e4 e4Var = this.b;
            if (i14 > 0) {
                if (e4Var == null || !e4Var.G) {
                    int L2 = org.telegram.messenger.g0.L(i14 * 14);
                    o50Var.getClass();
                    this.f = org.telegram.messenger.g0.L(32) + L2;
                } else {
                    this.f = org.telegram.messenger.g0.L((i14 * 14) + 14);
                }
            } else if (e4Var == null || !e4Var.G) {
                o50Var.getClass();
                this.f = org.telegram.messenger.g0.L(32);
            } else {
                this.f = org.telegram.messenger.g0.L(14.0f);
            }
            o50Var.getClass();
            int L3 = org.telegram.messenger.g0.L(f10) + i11;
            this.e = L3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.n;
            z2 o10 = g4.o(this.a, this, null, pageblockblockquote2.caption, i13, L3, pageblockblockquote2, this.b);
            this.d = o10;
            if (o10 != null) {
                o50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
            }
            if (i11 != 0) {
                o50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
            z2 z2Var = this.c;
            if (z2Var != null) {
                z2Var.s = this.f;
                z2Var.w = this.h;
            }
            z2 z2Var2 = this.d;
            if (z2Var2 != null) {
                z2Var2.s = this.f;
                z2Var2.w = this.e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return g4.j(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
