// default package

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class rd2 extends LinearLayout {
    public i49 a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public FrameLayout c;
    public int d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;

    public final void a() {
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.n + this.r);
        }
    }

    public final void b() {
        float f = (1.0f - this.f) * this.e;
        this.b.setTranslationX(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0379  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        i49 i49Var;
        float f;
        float f2;
        int i3 = i;
        int i4 = this.d;
        int makeMeasureSpec = i4 != 0 ? View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_31) : i2;
        if (this.b != null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            this.b.measure(0, makeMeasureSpec);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            if (this.b.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin > View.MeasureSpec.getSize(i3)) {
                z = true;
                i49Var = this.a;
                if (i49Var != null || this.b == null) {
                    super.onMeasure(i3, makeMeasureSpec);
                } else {
                    i49Var.getLayoutParams().width = -2;
                    ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = 0;
                    this.e = 0.0f;
                    super.onMeasure(i3, makeMeasureSpec);
                    int measuredWidth = this.a.getMeasuredWidth();
                    if (this.b.getSwipeBack() != null && this.b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                        measuredWidth = this.b.getSwipeBack().getMeasuredWidth();
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
                    int measuredWidth2 = this.b.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                    if (measuredWidth2 > measuredWidth) {
                        measuredWidth = measuredWidth2;
                    }
                    if (this.a.n()) {
                        i3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
                    }
                    i49 i49Var2 = this.a;
                    float f3 = 16.0f;
                    if (i49Var2.g1 || !i49Var2.R0 || i49Var2.getMeasuredWidth() <= 0) {
                        f = 16.0f;
                        f2 = 24.0f;
                    } else {
                        int y = c00.y(16.0f, i49Var2.getMeasuredWidth(), hl.L(320.0f));
                        StaticLayout staticLayout = new StaticLayout(i49Var2.S0.getText(), i49Var2.S0.getPaint(), y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        i49Var2.U0 = staticLayout.getHeight();
                        i49Var2.T0 = 0;
                        int i5 = 0;
                        while (i5 < staticLayout.getLineCount()) {
                            i49Var2.T0 = Math.max(i49Var2.T0, (int) Math.ceil(staticLayout.getLineWidth(i5)));
                            i5++;
                            f3 = f3;
                        }
                        f = f3;
                        f2 = 24.0f;
                        if (staticLayout.getLineCount() <= 1 || i49Var2.S0.getText().toString().contains("\n")) {
                            i49Var2.S0.setWidth(hl.L(f) + y);
                        } else {
                            int a = kg5.a(i49Var2.S0.getText(), i49Var2.S0.getPaint());
                            StaticLayout staticLayout2 = new StaticLayout(i49Var2.S0.getText(), i49Var2.S0.getPaint(), a, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            i49Var2.U0 = staticLayout2.getHeight();
                            i49Var2.T0 = 0;
                            for (int i6 = 0; i6 < staticLayout2.getLineCount(); i6++) {
                                i49Var2.T0 = Math.max(i49Var2.T0, (int) Math.ceil(staticLayout2.getLineWidth(i6)));
                            }
                            i49Var2.S0.setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
                            i49Var2.S0.setWidth(hl.L(48.0f) + a);
                        }
                        int max = Math.max(hl.L(20.0f), hl.L(7.0f) + i49Var2.U0);
                        byte b = i49Var2.N0;
                        if (b == 1 || b == 2) {
                            max = hl.L(20.0f);
                        } else {
                            i49Var2.getLayoutParams().height = hl.L(22.0f) + hl.L(52.0f) + max;
                        }
                        ((FrameLayout.LayoutParams) i49Var2.A0.getLayoutParams()).topMargin = max;
                        ((FrameLayout.LayoutParams) i49Var2.b.getLayoutParams()).topMargin = max;
                        i49Var2.g1 = true;
                    }
                    int totalWidth = this.a.getTotalWidth();
                    fj8 swipeBack = this.b.getSwipeBack();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
                    View childAt = swipeBack != null ? actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().getChildAt(0) : actionBarPopupWindow$ActionBarPopupWindowLayout.getChildAt(0);
                    int L = hl.L(36.0f) + hl.L(f) + hl.L(f) + childAt.getMeasuredWidth();
                    int hintTextWidth = this.a.getHintTextWidth();
                    if (hintTextWidth > L) {
                        L = hintTextWidth;
                    } else if (L > measuredWidth) {
                        L = measuredWidth;
                    }
                    this.a.H = hl.L(36.0f);
                    if (this.a.n()) {
                        this.a.getLayoutParams().width = totalWidth;
                        this.a.H = Math.max((totalWidth - childAt.getMeasuredWidth()) - hl.L(36.0f), hl.L(36.0f));
                    } else if (totalWidth > L) {
                        int L2 = ((L - hl.L(f)) / hl.L(36.0f)) + 1;
                        int L3 = hl.L(8.0f) + (hl.L(36.0f) * L2);
                        if (hl.L(f2) + hintTextWidth > L3) {
                            L3 = hl.L(f2) + hintTextWidth;
                        }
                        if (L3 <= totalWidth && L2 != this.a.getItemsCount()) {
                            totalWidth = L3;
                        }
                        this.a.getLayoutParams().width = totalWidth;
                    } else {
                        this.a.getLayoutParams().width = -2;
                    }
                    if (this.a.getMeasuredWidth() == measuredWidth && this.a.n()) {
                        float measuredWidth3 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                        this.e = measuredWidth3;
                        int i7 = (int) (r7.H - measuredWidth3);
                        this.a.H = i7;
                        if (i7 < hl.L(36.0f)) {
                            this.e = 0.0f;
                            this.a.H = hl.L(36.0f);
                        }
                        b();
                    } else {
                        int measuredWidth4 = this.b.getSwipeBack() != null ? this.b.getSwipeBack().getMeasuredWidth() - this.b.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                        if (this.a.getLayoutParams().width != -2 && this.a.getLayoutParams().width + measuredWidth4 > measuredWidth) {
                            measuredWidth4 = hl.L(8.0f) + (measuredWidth - this.a.getLayoutParams().width);
                        }
                        r6 = measuredWidth4 >= 0 ? measuredWidth4 : 0;
                        ((LinearLayout.LayoutParams) this.a.getLayoutParams()).rightMargin = r6;
                        this.e = 0.0f;
                        b();
                    }
                    if (this.c != null) {
                        boolean n = this.a.n();
                        FrameLayout frameLayout = this.c;
                        if (n) {
                            frameLayout.getLayoutParams().width = hl.L(f) + childAt.getMeasuredWidth();
                            b();
                        } else {
                            frameLayout.getLayoutParams().width = -1;
                        }
                        fj8 swipeBack2 = this.b.getSwipeBack();
                        FrameLayout frameLayout2 = this.c;
                        if (swipeBack2 != null) {
                            ((LinearLayout.LayoutParams) frameLayout2.getLayoutParams()).rightMargin = hl.L(36.0f) + r6;
                        } else {
                            ((LinearLayout.LayoutParams) frameLayout2.getLayoutParams()).rightMargin = hl.L(36.0f);
                        }
                    }
                    super.onMeasure(i3, makeMeasureSpec);
                }
                if (z) {
                    setMeasuredDimension(getMeasuredWidthAndState() | 16777216, getMeasuredHeightAndState());
                }
                this.d = getMeasuredHeight();
            }
        }
        z = false;
        i49Var = this.a;
        if (i49Var != null) {
        }
        super.onMeasure(i3, makeMeasureSpec);
        if (z) {
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f) {
        this.b.setTranslationY(f);
        this.n = f;
        a();
    }

    public void setMaxHeight(int i) {
        this.d = i;
    }

    public void setPopupAlpha(float f) {
        this.b.setAlpha(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new q72((Object) this, (Object) actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 6));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            fj8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.y.add(new qd2(this, (byte) 0));
        }
    }

    public void setReactionsLayout(i49 i49Var) {
        this.a = i49Var;
        if (i49Var != null) {
            i49Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f) {
        this.b.setReactionsTransitionProgress(f);
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f);
            float f2 = (f * 0.5f) + 0.5f;
            this.c.setPivotX(r0.getMeasuredWidth());
            this.c.setPivotY(0.0f);
            this.r = (1.0f - f) * (-this.b.getMeasuredHeight());
            a();
            this.c.setScaleX(f2);
            this.c.setScaleY(f2);
        }
    }
}
