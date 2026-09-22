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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x1 extends ViewGroup implements org.telegram.ui.Cells.p9, d3 {
    public final u70 a;
    public final f4 b;
    public a3 c;
    public org.telegram.ui.Components.vk0 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int v;
    public x3 w;
    public boolean x;
    public CheckBoxBase y;

    public x1(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.a = u70Var;
        this.b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        x3 x3Var = this.w;
        if ((x3Var != null ? x3Var.i : null) == null) {
            return 0;
        }
        u70 u70Var = this.a;
        f4 f4Var = this.b;
        if (f4Var == null || !f4Var.G) {
            u70Var.getClass();
            return org.telegram.messenger.y0.D(12.0f, this.w.c.f, (AndroidUtilities.dp(15) + this.w.c.c) - ((int) Math.ceil(r0.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        u70Var.getClass();
        int dp = measuredWidth - AndroidUtilities.dp(15);
        y3 y3Var = this.w.c;
        return org.telegram.messenger.vl.A(12.0f, y3Var.f, dp - y3Var.c);
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
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        int boundLeft;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        int min = this.y != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.e - AndroidUtilities.dp(26.0f)) - dp) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        x3 x3Var = this.w;
        if (x3Var != null && x3Var.i != null) {
            min = Math.min(min, (this.w.i.a() + a()) - dp);
        }
        a3 a3Var = this.c;
        if (a3Var != null) {
            min = Math.min(min, (a3Var.a() + a3Var.s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if ((callback instanceof d3) && (boundLeft = ((d3) callback).getBoundLeft()) != -1) {
                min = Math.min(min, this.n + boundLeft);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        int boundRight;
        this.a.getClass();
        int dp = AndroidUtilities.dp(18);
        x3 x3Var = this.w;
        int max = (x3Var == null || x3Var.i == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, this.w.i.b() + a() + dp);
        a3 a3Var = this.c;
        if (a3Var != null) {
            max = Math.max(max, a3Var.b() + a3Var.s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            KeyEvent.Callback callback = vk0Var.a;
            if ((callback instanceof d3) && (boundRight = ((d3) callback).getBoundRight()) != -1) {
                max = Math.max(max, this.n + boundRight);
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        a3 a3Var = this.c;
        if (a3Var == null) {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                KeyEvent.Callback callback = vk0Var.a;
                if ((callback instanceof d3) && (lastLineBoundRight = ((d3) callback).getLastLineBoundRight()) != -1) {
                    i10 = this.n;
                }
            }
            return -1;
        }
        lastLineBoundRight = a3Var.c() + a3Var.s;
        this.a.getClass();
        i10 = AndroidUtilities.dp(18);
        return i10 + lastLineBoundRight;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
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
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        a3 a3Var = this.w.i;
        u70 u70Var = this.a;
        if (a3Var != null) {
            canvas.save();
            f4 f4Var = this.b;
            if (f4Var == null || !f4Var.G) {
                u70Var.getClass();
                int dp = AndroidUtilities.dp(15);
                x3 x3Var = this.w;
                canvas.translate(org.telegram.messenger.y0.D(12.0f, this.w.c.f, (dp + x3Var.c.c) - ((int) Math.ceil(x3Var.i.d.getLineWidth(0)))), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
            } else {
                u70Var.getClass();
                int dp2 = measuredWidth - AndroidUtilities.dp(15);
                y3 y3Var = this.w.c;
                canvas.translate(org.telegram.messenger.vl.A(12.0f, y3Var.f, dp2 - y3Var.c), (this.f + this.h) - (this.x ? AndroidUtilities.dp(1.0f) : 0));
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
            h4.v(u70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.a, this.b, a3Var));
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
        u70 u70Var;
        u70 u70Var2;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        a3 a3Var;
        b2 b2Var;
        a3 a3Var2;
        int i16;
        org.telegram.ui.Cells.q9 q9Var;
        int size = View.MeasureSpec.getSize(i10);
        x3 x3Var = this.w;
        int i17 = 1;
        if (x3Var != null) {
            this.c = null;
            int i18 = x3Var.j;
            u70 u70Var3 = this.a;
            int i19 = 0;
            if (i18 == 0 && x3Var.c.f == 0) {
                u70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f = i12;
            this.h = 0;
            y3 y3Var = this.w.c;
            if (y3Var.d == size && y3Var.e == SharedConfig.ivFontSize) {
                u70Var = u70Var3;
            } else {
                y3Var.d = size;
                y3Var.e = SharedConfig.ivFontSize;
                y3Var.c = 0;
                int size2 = y3Var.b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    x3 x3Var2 = (x3) this.w.c.b.get(i20);
                    String str = x3Var2.f;
                    if (str != null) {
                        if (x3Var2.a && "•".equalsIgnoreCase(str)) {
                            x3Var2.i = null;
                        } else {
                            String str2 = x3Var2.f;
                            u70Var3.getClass();
                            u70 u70Var4 = u70Var3;
                            u70Var2 = u70Var4;
                            x3Var2.i = h4.q(u70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f, this.w, this.b);
                            y3 y3Var2 = this.w.c;
                            y3Var2.c = Math.max(y3Var2.c, (int) Math.ceil(r2.d.getLineWidth(0)));
                            z10 = false;
                            i20++;
                            u70Var3 = u70Var2;
                        }
                    }
                    u70Var2 = u70Var3;
                    i20++;
                    u70Var3 = u70Var2;
                }
                u70Var = u70Var3;
                if (h4.n1 != null && !z10) {
                    y3 y3Var3 = this.w.c;
                    y3Var3.c = Math.max(y3Var3.c, (int) Math.ceil(r2.measureText("00.")));
                }
            }
            x3 x3Var3 = this.w;
            this.x = !x3Var3.c.a.ordered;
            if (x3Var3.a) {
                if (this.y == null) {
                    u70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.z5, org.telegram.ui.ActionBar.i6.k7);
                    this.y.d(10);
                    this.y.k(true);
                    this.y.i(AndroidUtilities.dp(5.0f));
                }
                this.y.f(-1, this.w.b, false);
            } else {
                this.y = null;
            }
            f4 f4Var = this.b;
            if (f4Var == null || !f4Var.G) {
                u70Var.getClass();
                int dp3 = AndroidUtilities.dp((this.y == null ? 0 : 26) + 24);
                y3 y3Var4 = this.w.c;
                this.e = org.telegram.messenger.y0.D(12.0f, y3Var4.f, dp3 + y3Var4.c);
            } else {
                u70Var.getClass();
                this.e = AndroidUtilities.dp((this.y == null ? 0 : 26) + 18);
            }
            u70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (f4Var != null && f4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                y3 y3Var5 = this.w.c;
                dp4 -= (AndroidUtilities.dp(12.0f) * y3Var5.f) + (dp5 + y3Var5.c);
            }
            x3 x3Var4 = this.w;
            int i21 = dp4;
            TL_iv.RichText richText = x3Var4.e;
            if (richText != null) {
                a3 p5 = h4.p(this.a, this, null, richText, i21, 0, x3Var4, (f4Var == null || !f4Var.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.jw0.a(), 0, this.b);
                this.c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    a3 a3Var3 = this.w.i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - this.c.d.getLineAscent(0);
                    }
                    i13 = this.c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i16 = dp + i13;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i22 = this.e;
                    this.n = i22;
                    int i23 = this.f;
                    this.r = i23;
                    org.telegram.ui.Components.vk0 vk0Var = this.d;
                    if (vk0Var != null) {
                        View view = vk0Var.a;
                        if (view instanceof b2) {
                            float f10 = 8;
                            this.r = i23 - AndroidUtilities.dp(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i21 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if ((view instanceof v1) || (view instanceof q2) || (view instanceof u2) || (view instanceof r2)) {
                                if (f4Var == null || !f4Var.G) {
                                    this.n = i22 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            } else if (h4.L(pageBlock)) {
                                this.n = 0;
                                this.r = 0;
                                this.f = 0;
                                x3 x3Var5 = this.w;
                                i15 = ((x3Var5.j == 0 && x3Var5.c.f == 0) ? 0 - AndroidUtilities.dp(10) : 0) - AndroidUtilities.dp(8);
                                i14 = size;
                            } else if (this.d.a instanceof t2) {
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
                        if ((this.d.a instanceof b2) && (a3Var = this.w.i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (b2Var = (b2) this.d.a).c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.w.i.d.getLineAscent(0)) - b2Var.c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.w;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.s = true;
                            this.r = 0;
                            if (x3Var6.j == 0 && x3Var6.c.f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.a;
                            if (view2 instanceof a2) {
                                this.s = ((a2) view2).v;
                            } else if (view2 instanceof x1) {
                                this.s = ((x1) view2).s;
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
            if (hg.c.h(1, this.w.c.b) == this.w) {
                i16 += AndroidUtilities.dp(8);
            }
            x3 x3Var7 = this.w;
            i17 = (x3Var7.j == 0 && x3Var7.c.f == 0) ? AndroidUtilities.dp(10) + i16 : i16;
            a3 a3Var4 = this.c;
            if (a3Var4 != null) {
                a3Var4.s = this.e;
                a3Var4.v = this.f;
            }
            org.telegram.ui.Components.vk0 vk0Var2 = this.d;
            if (vk0Var2 != null && (vk0Var2.a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((h4) u70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof a3) {
                        a3 a3Var5 = (a3) baVar;
                        a3Var5.s += this.n;
                        a3Var5.v += this.r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.w;
        f4 f4Var = this.b;
        if (x3Var2 != x3Var) {
            this.w = x3Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
