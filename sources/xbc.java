// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class xbc extends nx0 {
    public boolean A1;
    public boolean B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public final td4 L1;
    public final boolean M1;
    public TextView l1;
    public final FrameLayout m1;
    public final gw9 n1;
    public c79 o1;
    public c79 p1;
    public final Drawable q1;
    public final View r1;
    public AnimatorSet s1;
    public final z2b t1;
    public final tk4 u1;
    public final wbc v1;
    public final RectF w1;
    public int x1;
    public float y1;
    public int z1;

    static {
        new qm("colorProgress", (byte) 19);
    }

    public xbc(int i, vnb vnbVar, Context context) {
        super(1, vnbVar, context, false);
        this.w1 = new RectF();
        this.A1 = true;
        this.B1 = true;
        this.C1 = aob.zj;
        this.D1 = aob.i6;
        int i2 = aob.d6;
        this.E1 = i2;
        this.F1 = i2;
        this.G1 = aob.G6;
        int i3 = aob.y6;
        this.H1 = i3;
        this.I1 = i3;
        int i4 = aob.Q5;
        this.J1 = i4;
        this.K1 = i4;
        this.M1 = true;
        this.J0 = vnbVar;
        L0();
        this.q0 = (byte) 75;
        this.a = i;
        this.q1 = c00.e(context, R.drawable.sheet_shadow_round);
        vbc E0 = E0(context);
        this.b = E0;
        E0.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i5 = this.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m1 = frameLayout;
        wbc wbcVar = new wbc(this, context, vnbVar);
        this.v1 = wbcVar;
        wbcVar.y = true;
        wbcVar.updateColors();
        wbcVar.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        frameLayout.addView(wbcVar, tre.d(-1, 48.0f, 51, 7.0f, 7.0f, 7.0f, 7.0f));
        tk4 tk4Var = new tk4(context, null);
        this.u1 = tk4Var;
        byte b = 6;
        tk4Var.setViewType(6);
        tk4Var.x = false;
        tk4Var.setUseHeaderOffset(true);
        z2b z2bVar = new z2b(context, tk4Var, 1, null);
        this.t1 = z2bVar;
        z2bVar.addView(tk4Var, 0, tre.d(-1, -1.0f, 0, 0.0f, 2.0f, 0.0f, 0.0f));
        String M0 = ob6.M0(2131747898, null);
        tpa tpaVar = z2bVar.d;
        tpaVar.setText(M0);
        String M02 = ob6.M0(2131745535, null);
        p66 p66Var = z2bVar.e;
        p66Var.setText(M02);
        z2bVar.setVisibility(8);
        z2bVar.setAnimateLayoutChange(true);
        z2bVar.e(true, false);
        int i6 = this.G1;
        int i7 = this.H1;
        int i8 = this.E1;
        tpaVar.setTag(Integer.valueOf(i6));
        vnb vnbVar2 = z2bVar.n;
        yob.X(tpaVar, i6, vnbVar2);
        p66Var.setTag(Integer.valueOf(i7));
        yob.X(p66Var, i7, vnbVar2);
        z2bVar.H = i8;
        this.b.addView(z2bVar, tre.d(-1, -1.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        gw9 gw9Var = new gw9(this, context, vnbVar, b);
        this.n1 = gw9Var;
        gw9Var.setOverScrollMode(2);
        gw9Var.setTag(13);
        gw9Var.setPadding(0, 0, 0, hl.L(48.0f));
        gw9Var.setClipToPadding(false);
        gw9Var.setHideIfEmpty(false);
        yob.l(gw9Var, 20, this.D1, vnbVar);
        getContext();
        td4 td4Var = new td4(hl.L(8.0f), 0, gw9Var);
        this.L1 = td4Var;
        td4Var.P = false;
        gw9Var.setLayoutManager(td4Var);
        gw9Var.setHorizontalScrollBarEnabled(false);
        gw9Var.setVerticalScrollBarEnabled(false);
        this.b.addView(gw9Var, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        gw9Var.setOnScrollListener(new qhb(this, b));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1(), 51);
        layoutParams.topMargin = hl.L(58.0f);
        View view = new View(context);
        this.r1 = view;
        view.setAlpha(0.0f);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        this.b.addView(frameLayout, tre.e(-1, 58, 51));
        I0(0.0f);
        gw9Var.setEmptyView(z2bVar);
        gw9Var.X1 = true;
        gw9Var.Y1 = false;
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public vbc E0(Context context) {
        return new vbc(this, context);
    }

    public abstract void F0(MotionEvent motionEvent, m7 m7Var);

    public final void G0(boolean z) {
        Integer num;
        View view = this.r1;
        Object tag = view.getTag();
        if (z) {
            if (tag == null) {
                return;
            } else {
                num = null;
            }
        } else if (tag != null) {
            return;
        } else {
            num = 1;
        }
        view.setTag(num);
        if (z) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.s1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.s1.setDuration(150L);
        this.s1.addListener(new i1a((byte) 14, this, z));
        this.s1.start();
    }

    public abstract void H0(String str);

    public final void I0(float f) {
        this.y1 = f;
        this.z1 = hl.R0(f, 1.0f, aob.v0(this.E1, this.J0), aob.v0(this.F1, this.J0));
        this.q1.setColorFilter(new PorterDuffColorFilter(this.z1, PorterDuff.Mode.MULTIPLY));
        K(this.z1);
        int i = this.z1;
        this.H0 = i;
        gw9 gw9Var = this.n1;
        gw9Var.setGlowColor(i);
        int R0 = hl.R0(f, 1.0f, aob.w0(null, this.I1, false), aob.w0(null, this.H1, false));
        int R02 = hl.R0(f, 1.0f, aob.w0(null, this.K1, false), aob.w0(null, this.J1, false));
        int childCount = gw9Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = gw9Var.getChildAt(i2);
            if (childAt instanceof tb5) {
                ((tb5) childAt).a(R0, R0);
            } else if (childAt instanceof zb5) {
                ((zb5) childAt).f(this.r1.getTag() != null ? this.J1 : this.K1, R02);
            }
        }
        this.b.invalidate();
        gw9Var.invalidate();
        this.c.invalidate();
    }

    public void J0(int i) {
        this.n1.setTopGlowOffset(i);
        float f = i;
        this.m1.setTranslationY(f);
        this.t1.setTranslationY(f);
        this.b.invalidate();
    }

    public final void K0(int i) {
        if (isShowing()) {
            this.n1.getViewTreeObserver().addOnPreDrawListener(new hha(this, i, (byte) 1));
        }
    }

    public void M0() {
        gw9 gw9Var = this.n1;
        if (gw9Var.getChildCount() > 0) {
            f89 L = gw9Var.L(0);
            int top = L != null ? L.a.getTop() - hl.L(8.0f) : 0;
            int i = (top <= 0 || L == null || L.b() != 0) ? 0 : top;
            if (top < 0 || L == null || L.b() != 0) {
                G0(true);
                top = i;
            } else {
                G0(false);
            }
            if (this.x1 != top) {
                this.x1 = top;
                J0(top);
            }
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public void dismiss() {
        hl.t1(this.v1.L);
        super.dismiss();
    }

    @Override // nx0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        if (this.l1 == null) {
            TextView textView = new TextView(getContext());
            this.l1 = textView;
            yob.X(textView, aob.j5, this.J0);
            this.l1.setTextSize(1, 20.0f);
            this.l1.setTypeface(hl.o());
            this.l1.setLines(1);
            this.l1.setMaxLines(1);
            this.l1.setSingleLine(true);
            this.l1.setGravity((ob6.a0 ? 5 : 3) | 16);
            this.l1.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = this.l1;
            FrameLayout.LayoutParams d = tre.d(-1, 36.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f);
            FrameLayout frameLayout = this.m1;
            frameLayout.addView(textView2, d);
            ((FrameLayout.LayoutParams) this.v1.getLayoutParams()).topMargin = hl.L(30.0f);
            frameLayout.getLayoutParams().height = hl.L(94.0f);
        }
        this.l1.setText(charSequence);
    }

    public void L0() {
    }
}
