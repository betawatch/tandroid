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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class y1 extends ViewGroup implements org.telegram.ui.Cells.p9, e3 {
    public final v70 a;
    public final g4 b;
    public b3 c;
    public org.telegram.ui.Components.vk0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int v;
    public y3 w;
    public boolean x;
    public CheckBoxBase y;

    public y1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.a = v70Var;
        this.b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        y3 y3Var = this.w;
        if ((y3Var != null ? y3Var.i : null) == null) {
            return 0;
        }
        v70 v70Var = this.a;
        g4 g4Var = this.b;
        if (g4Var == null || !g4Var.G) {
            v70Var.getClass();
            return org.telegram.messenger.w1.D(12.0f, this.w.c.f, (AndroidUtilities.dp(15) + this.w.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        v70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(15);
        z3 z3Var = this.w.c;
        return org.telegram.messenger.wl.A(12.0f, z3Var.f, dp - z3Var.c);
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if (callback instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        int min = this.y != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - AndroidUtilities.dp(26.0f)) - dp) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        y3 y3Var = this.w;
        if (y3Var != null && y3Var.i != null) {
            min = Math.min(min, (this.w.i.a() + a()) - dp);
        }
        b3 b3Var = this.c;
        if (b3Var != null) {
            min = Math.min(min, (b3Var.a() + b3Var.s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if ((callback instanceof e3) && (boundLeft = ((e3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.e3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.w;
        int max = (y3Var == null || y3Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        b3 b3Var = this.c;
        if (b3Var != null) {
            max = Math.max(max, b3Var.b() + b3Var.s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if ((callback instanceof e3) && (boundRight = ((e3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.e3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        b3 b3Var = this.c;
        if (b3Var == null) {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                KeyEvent.Callback callback = vk0Var.a;
                if ((callback instanceof e3) && (lastLineBoundRight = ((e3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = b3Var.c() + b3Var.s;
        this.a.getClass();
        i10 = AndroidUtilities.dp(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.y9
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.a.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        b3 b3Var = this.w.i;
        v70 v70Var = this.a;
        if (b3Var != null) {
            canvas.save();
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.G) {
                v70Var.getClass();
                int dp = AndroidUtilities.dp(15);
                y3 y3Var = this.w;
                canvas.translate(org.telegram.messenger.w1.D(12.0f, this.w.c.f, (dp + y3Var.c.c) - ((int) Math.ceil(y3Var.i.d.getLineWidth(0)))), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
            } else {
                v70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(15);
                z3 z3Var = this.w.c;
                canvas.translate(org.telegram.messenger.wl.A(12.0f, z3Var.f, dp2 - z3Var.c), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
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
            i4.v(v70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.a, this.b, b3Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.a;
            int i14 = this.n;
            view.layout(i14, this.r, view.getMeasuredWidth() + i14, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        v70 v70Var;
        v70 v70Var2;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        b3 b3Var;
        c2 c2Var;
        b3 b3Var2;
        int i16;
        org.telegram.ui.Cells.q9 q9Var;
        int size = View.MeasureSpec.getSize(i10);
        y3 y3Var = this.w;
        int i17 = 1;
        if (y3Var != null) {
            this.c = null;
            int i18 = y3Var.j;
            v70 v70Var3 = this.a;
            int i19 = 0;
            if (i18 == 0 && y3Var.c.f == 0) {
                v70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f = i12;
            this.h = 0;
            z3 z3Var = this.w.c;
            if (z3Var.d == size && z3Var.e == SharedConfig.ivFontSize) {
                v70Var = v70Var3;
            } else {
                z3Var.d = size;
                z3Var.e = SharedConfig.ivFontSize;
                z3Var.c = 0;
                int size2 = z3Var.b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    y3 y3Var2 = (y3) this.w.c.b.get(i20);
                    String str = y3Var2.f;
                    if (str != null) {
                        if (y3Var2.a && "•".equalsIgnoreCase(str)) {
                            y3Var2.i = null;
                        } else {
                            String str2 = y3Var2.f;
                            v70Var3.getClass();
                            v70 v70Var4 = v70Var3;
                            v70Var2 = v70Var4;
                            y3Var2.i = i4.q(v70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f, this.w, this.b);
                            z3 z3Var2 = this.w.c;
                            z3Var2.c = Math.max(z3Var2.c, (int) Math.ceil(r2.d.getLineWidth(0)));
                            z10 = false;
                            i20++;
                            v70Var3 = v70Var2;
                        }
                    }
                    v70Var2 = v70Var3;
                    i20++;
                    v70Var3 = v70Var2;
                }
                v70Var = v70Var3;
                if (i4.n1 != null && !z10) {
                    z3 z3Var3 = this.w.c;
                    z3Var3.c = Math.max(z3Var3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            y3 y3Var3 = this.w;
            this.x = !y3Var3.c.a.ordered;
            if (y3Var3.a) {
                if (this.y == null) {
                    v70Var.getClass();
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
            g4 g4Var = this.b;
            if (g4Var == null || !g4Var.G) {
                v70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.y == null ? 0 : 26) + 24);
                z3 z3Var4 = this.w.c;
                this.e = org.telegram.messenger.w1.D(12.0f, z3Var4.f, dp3 + z3Var4.c);
            } else {
                v70Var.getClass();
                this.e = AndroidUtilities.dp((this.y == null ? 0 : 26) + 18);
            }
            v70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f) + (dp5 + z3Var5.c);
            }
            y3 y3Var4 = this.w;
            int i21 = dp4;
            TL_iv.RichText richText = y3Var4.e;
            if (richText != null) {
                b3 p5 = i4.p(this.a, this, null, richText, i21, 0, y3Var4, (g4Var == null || !g4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.iw0.a(), 0, this.b);
                this.c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.w.i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    i13 = this.c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i16 = dp + i13;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i22 = this.e;
                    this.n = i22;
                    int i23 = this.f;
                    this.r = i23;
                    org.telegram.ui.Components.vk0 vk0Var = this.d;
                    if (vk0Var != null) {
                        View view = vk0Var.a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.r = i23 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i21 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if ((view instanceof w1) || (view instanceof r2) || (view instanceof v2) || (view instanceof s2)) {
                                if (g4Var == null || !g4Var.G) {
                                    this.n = i22 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            } else if (i4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                y3 y3Var5 = this.w;
                                i15 = ((y3Var5.j == 0 && y3Var5.c.f == 0) ? 0 - AndroidUtilities.dp(10) : 0) - AndroidUtilities.dp(8);
                                i14 = size;
                            } else if (this.d.a instanceof u2) {
                                this.n -= AndroidUtilities.dp(f7);
                                dp2 = AndroidUtilities.dp(36);
                            } else {
                                i14 = i21;
                                i15 = 0;
                            }
                            i14 = dp2 + i21;
                            i15 = 0;
                        }
                        this.d.a.measure(View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.a instanceof c2) && (b3Var = this.w.i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.a).c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - c2Var.c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (y3Var6.j == 0 && y3Var6.c.f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof b2) {
                                this.s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.s = ((y1) view2).s;
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
            if (i2.g.h(1, this.w.c.b) == this.w) {
                i16 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.w;
            i17 = (y3Var7.j == 0 && y3Var7.c.f == 0) ? AndroidUtilities.dp(10) + i16 : i16;
            b3 b3Var4 = this.c;
            if (b3Var4 != null) {
                b3Var4.s = this.e;
                b3Var4.v = this.f;
            }
            org.telegram.ui.Components.vk0 vk0Var2 = this.d;
            if (vk0Var2 != null && (vk0Var2.a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((i4) v70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof b3) {
                        b3 b3Var5 = (b3) baVar;
                        b3Var5.s += this.n;
                        b3Var5.v += this.r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.w;
        g4 g4Var = this.b;
        if (y3Var2 != y3Var) {
            this.w = y3Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
