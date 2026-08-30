package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.l9, g3 {
    public final n70 a;
    public final j4 b;
    public d3 c;
    public org.telegram.ui.Components.el0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int v;
    public b4 w;
    public boolean x;
    public CheckBoxBase y;

    public z1(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.a = n70Var;
        this.b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b4 b4Var = this.w;
        if ((b4Var != null ? b4Var.i : null) == null) {
            return 0;
        }
        n70 n70Var = this.a;
        j4 j4Var = this.b;
        if (j4Var == null || !j4Var.D) {
            n70Var.getClass();
            return org.telegram.messenger.y3.D(12.0f, this.w.c.f, (AndroidUtilities.dp(15) + this.w.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        n70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(15);
        c4 c4Var = this.w.c;
        return b.z(12.0f, c4Var.f, dp - c4Var.c);
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            KeyEvent.Callback callback = el0Var.a;
            if (callback instanceof org.telegram.ui.Cells.l9) {
                ((org.telegram.ui.Cells.l9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override // org.telegram.ui.g3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        int min = this.y != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - AndroidUtilities.dp(26.0f)) - dp) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        b4 b4Var = this.w;
        if (b4Var != null && b4Var.i != null) {
            min = Math.min(min, (this.w.i.a() + a()) - dp);
        }
        d3 d3Var = this.c;
        if (d3Var != null) {
            min = Math.min(min, (d3Var.a() + d3Var.s) - dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            KeyEvent.Callback callback = el0Var.a;
            if ((callback instanceof g3) && (boundLeft = ((g3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.g3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.w;
        int max = (b4Var == null || b4Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        d3 d3Var = this.c;
        if (d3Var != null) {
            max = Math.max(max, d3Var.b() + d3Var.s + dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            KeyEvent.Callback callback = el0Var.a;
            if ((callback instanceof g3) && (boundRight = ((g3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.g3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        d3 d3Var = this.c;
        if (d3Var == null) {
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                KeyEvent.Callback callback = el0Var.a;
                if ((callback instanceof g3) && (lastLineBoundRight = ((g3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = d3Var.c() + d3Var.s;
        this.a.getClass();
        i10 = AndroidUtilities.dp(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return b.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.u9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            el0Var.a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        d3 d3Var = this.w.i;
        n70 n70Var = this.a;
        if (d3Var != null) {
            canvas.save();
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.D) {
                n70Var.getClass();
                int dp = AndroidUtilities.dp(15);
                b4 b4Var = this.w;
                canvas.translate(org.telegram.messenger.y3.D(12.0f, this.w.c.f, (dp + b4Var.c.c) - ((int) Math.ceil(b4Var.i.d.getLineWidth(0)))), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
            } else {
                n70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(15);
                c4 c4Var = this.w.c;
                canvas.translate(b.z(12.0f, c4Var.f, dp2 - c4Var.c), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
            }
            this.w.i.draw(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.y;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
            this.y.a(canvas);
        }
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            l4.v(n70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.a, this.b, d3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.a;
            int i14 = this.n;
            view.layout(i14, this.r, view.getMeasuredWidth() + i14, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        n70 n70Var;
        n70 n70Var2;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        d3 d3Var;
        d2 d2Var;
        d3 d3Var2;
        int i16;
        org.telegram.ui.Cells.m9 m9Var;
        int size = View.MeasureSpec.getSize(i10);
        b4 b4Var = this.w;
        int i17 = 1;
        if (b4Var != null) {
            this.c = null;
            int i18 = b4Var.j;
            n70 n70Var3 = this.a;
            int i19 = 0;
            if (i18 == 0 && b4Var.c.f == 0) {
                n70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f = i12;
            this.h = 0;
            c4 c4Var = this.w.c;
            if (c4Var.d == size && c4Var.e == SharedConfig.ivFontSize) {
                n70Var = n70Var3;
            } else {
                c4Var.d = size;
                c4Var.e = SharedConfig.ivFontSize;
                c4Var.c = 0;
                int size2 = c4Var.b.size();
                boolean z4 = true;
                int i20 = 0;
                while (i20 < size2) {
                    b4 b4Var2 = (b4) this.w.c.b.get(i20);
                    String str = b4Var2.f;
                    if (str != null) {
                        if (b4Var2.a && "•".equalsIgnoreCase(str)) {
                            b4Var2.i = null;
                        } else {
                            String str2 = b4Var2.f;
                            n70Var3.getClass();
                            n70 n70Var4 = n70Var3;
                            n70Var2 = n70Var4;
                            b4Var2.i = l4.q(n70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f, this.w, this.b);
                            c4 c4Var2 = this.w.c;
                            c4Var2.c = Math.max(c4Var2.c, (int) Math.ceil(r2.d.getLineWidth(0)));
                            z4 = false;
                            i20++;
                            n70Var3 = n70Var2;
                        }
                    }
                    n70Var2 = n70Var3;
                    i20++;
                    n70Var3 = n70Var2;
                }
                n70Var = n70Var3;
                if (l4.k1 != null && !z4) {
                    c4 c4Var3 = this.w.c;
                    c4Var3.c = Math.max(c4Var3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            b4 b4Var3 = this.w;
            this.x = !b4Var3.c.a.ordered;
            if (b4Var3.a) {
                if (this.y == null) {
                    n70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.z5, org.telegram.ui.ActionBar.j6.k7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(AndroidUtilities.dp(5.0f));
                }
                this.y.f(-1, this.w.b, false);
            } else {
                this.y = null;
            }
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.D) {
                n70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.y == null ? 0 : 26) + 24);
                c4 c4Var4 = this.w.c;
                this.e = org.telegram.messenger.y3.D(12.0f, c4Var4.f, dp3 + c4Var4.c);
            } else {
                n70Var.getClass();
                this.e = AndroidUtilities.dp((this.y == null ? 0 : 26) + 18);
            }
            n70Var.getClass();
            float f10 = 18;
            int dp4 = (size - AndroidUtilities.dp(f10)) - this.e;
            if (j4Var != null && j4Var.D) {
                int dp5 = AndroidUtilities.dp(6.0f);
                c4 c4Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(12.0f) * c4Var5.f) + (dp5 + c4Var5.c);
            }
            b4 b4Var4 = this.w;
            int i21 = dp4;
            TL_iv.RichText richText = b4Var4.e;
            if (richText != null) {
                d3 p10 = l4.p(this.a, this, null, richText, i21, 0, b4Var4, (j4Var == null || !j4Var.D) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), 0, this.b);
                this.c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    d3 d3Var3 = this.w.i;
                    if (d3Var3 != null && d3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    i13 = this.c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i16 = dp + i13;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = b4Var4.d;
                if (pageBlock != null) {
                    int i22 = this.e;
                    this.n = i22;
                    int i23 = this.f;
                    this.r = i23;
                    org.telegram.ui.Components.el0 el0Var = this.d;
                    if (el0Var != null) {
                        View view = el0Var.a;
                        if (view instanceof d2) {
                            float f11 = 8;
                            this.r = i23 - AndroidUtilities.dp(f11);
                            if (j4Var == null || !j4Var.D) {
                                this.n -= AndroidUtilities.dp(f10);
                            }
                            int dp6 = i21 + AndroidUtilities.dp(f10);
                            i15 = 0 - AndroidUtilities.dp(f11);
                            i14 = dp6;
                        } else {
                            if ((view instanceof x1) || (view instanceof t2) || (view instanceof x2) || (view instanceof u2)) {
                                if (j4Var == null || !j4Var.D) {
                                    this.n = i22 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            } else if (l4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                b4 b4Var5 = this.w;
                                i15 = ((b4Var5.j == 0 && b4Var5.c.f == 0) ? 0 - AndroidUtilities.dp(10) : 0) - AndroidUtilities.dp(8);
                                i14 = size;
                            } else if (this.d.a instanceof w2) {
                                this.n -= AndroidUtilities.dp(f10);
                                dp2 = AndroidUtilities.dp(36);
                            } else {
                                i14 = i21;
                                i15 = 0;
                            }
                            i14 = dp2 + i21;
                            i15 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof d2) && (d3Var = this.w.i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (d2Var = (d2) this.d.a).c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - d2Var.c.d.getLineAscent(0);
                        }
                        b4 b4Var6 = this.w;
                        if (b4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (b4Var6.j == 0 && b4Var6.c.f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof c2) {
                                this.s = ((c2) view2).v;
                            } else if (view2 instanceof z1) {
                                this.s = ((z1) view2).s;
                            }
                        }
                        if (this.s && this.w.i != null) {
                            this.f = ((this.d.a.getMeasuredHeight() - this.w.i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.x = false;
                        }
                        i13 = this.d.a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i16 = dp + i13;
                }
                i16 = 0;
            }
            if (kh.a2.i(1, this.w.c.b) == this.w) {
                i16 += AndroidUtilities.dp(8);
            }
            b4 b4Var7 = this.w;
            i17 = (b4Var7.j == 0 && b4Var7.c.f == 0) ? AndroidUtilities.dp(10) + i16 : i16;
            d3 d3Var4 = this.c;
            if (d3Var4 != null) {
                d3Var4.s = this.e;
                d3Var4.v = this.f;
            }
            org.telegram.ui.Components.el0 el0Var2 = this.d;
            if (el0Var2 != null && (el0Var2.a instanceof org.telegram.ui.Cells.l9) && (m9Var = ((l4) n70Var).L0) != null) {
                ArrayList arrayList = m9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.l9) this.d.a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) obj;
                    if (x9Var instanceof d3) {
                        d3 d3Var5 = (d3) x9Var;
                        d3Var5.s += this.n;
                        d3Var5.v += this.r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.w;
        j4 j4Var = this.b;
        if (b4Var2 != b4Var) {
            this.w = b4Var;
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                removeView(el0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.v = I;
                f2.l1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.el0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
