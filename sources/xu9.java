// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class xu9 extends FrameLayout implements jm7 {
    public static he I;
    public final long E;
    public float F;
    public float G;
    public ValueAnimator H;
    public final int a;
    public final d b;
    public final ylb c;
    public final pu9 d;
    public final ny0 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public km0 w;
    public nm0 x;
    public final Paint y;

    public xu9(Context context, d dVar, int i, long j, ylb ylbVar) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.y = new Paint(1);
        this.a = i;
        this.b = dVar;
        this.c = ylbVar;
        this.E = j;
        l39.n(ylbVar);
        pu9 pu9Var = new pu9(this, context, ylbVar, (byte) 0);
        this.d = pu9Var;
        pu9Var.setPadding(gm.L(5.66f), 0, gm.L(5.66f), 0);
        pu9Var.setClipToPadding(false);
        u46 u46Var = new u46();
        u46Var.i1(0);
        pu9Var.setLayoutManager(u46Var);
        ny0 ny0Var = new ny0(this, (byte) 9);
        this.e = ny0Var;
        pu9Var.setAdapter(ny0Var);
        pu9Var.setOverScrollMode(2);
        addView(pu9Var, qoe.c(-1.0f, -1));
        pu9Var.setOnItemClickListener(new tj8(this, i, dVar, (byte) 1));
        pu9Var.setOnItemLongClickListener(new zn((Object) this, i, (Object) dVar, (Object) ylbVar, (byte) 9));
        qu9 qu9Var = new qu9();
        qu9Var.o(d53.h);
        qu9Var.n(320L);
        pu9Var.setItemAnimator(qu9Var);
        hs6.d0(i).a1(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.CharSequence] */
    public static void c(Context context, int i, TLRPC.Reaction reaction, ylb ylbVar) {
        SpannableString spannableString;
        d Q = LaunchActivity.Q();
        Activity W = gm.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        final byte b = 0;
        boolean z = Q != null && (Q.getFragmentView() instanceof ela) && ((ela) Q.getFragmentView()).Q() > gm.L(20.0f);
        he[] heVarArr = new he[1];
        ?? meVar = z ? new me(0, ylbVar, context) : new AlertDialog$Builder(0, ylbVar, context);
        String I1 = oc7.r1(i).I1(reaction);
        k39 d = k39.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(gm.L(20.0f));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString2 = new SpannableString("😀");
            spannableString2.setSpan(new gn(d.g, textPaint.getFontMetricsInt()), 0, spannableString2.length(), 17);
            spannableString = spannableString2;
        } else {
            spannableString = gw3.m(d.f, textPaint.getFontMetricsInt(), false, null, 0);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(spannableString).append((CharSequence) "  ").append((CharSequence) jb6.M0(TextUtils.isEmpty(I1) ? 2131745615 : 2131745603, null));
        he heVar = meVar.a;
        heVar.S = append;
        final ru9 ru9Var = new ru9(context, ylbVar);
        ru9Var.setOnEditorActionListener(new su9(ru9Var, i, reaction, heVarArr, currentFocus));
        hs6.d0(i).O(gm.F0(), true);
        ru9Var.setTextSize(1, 18.0f);
        if (I1 == null) {
            I1 = "";
        }
        ru9Var.setText(I1);
        int i2 = cmb.i5;
        anb.X(ru9Var, i2, ylbVar);
        anb.l(ru9Var, 34, cmb.Ni, ylbVar);
        ru9Var.setHintText(jb6.M0(2131745616, null));
        ru9Var.setSingleLine(true);
        ru9Var.setFocusable(true);
        ru9Var.setInputType(TLObject.FLAG_14);
        anb.F(ru9Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        ru9Var.setImeOptions(6);
        ru9Var.setBackgroundDrawable(null);
        ru9Var.setPadding(0, 0, gm.L(42.0f), 0);
        LinearLayout i3 = hg9.i(context, 1);
        TextView textView = new TextView(context);
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131745614, null));
        i3.addView(textView, qoe.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        i3.addView(ru9Var, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        meVar.n(i3);
        heVar.a = gm.L(292.0f);
        meVar.j(jb6.M0(2131745680, null), new yg((Object) ru9Var, i, (Object) reaction, (byte) 14));
        meVar.g(jb6.M0(2131752542, null), new dq9((byte) 4));
        if (z) {
            I = heVar;
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new i51(currentFocus, (byte) 3));
            I.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ou9
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b2 = b;
                    ru9 ru9Var2 = ru9Var;
                    switch (b2) {
                        case 0:
                            ru9Var2.requestFocus();
                            gm.E3(ru9Var2);
                            break;
                        default:
                            ru9Var2.requestFocus();
                            gm.E3(ru9Var2);
                            break;
                    }
                }
            });
            I.q(250L);
        } else {
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new qj8(ru9Var, (byte) 5));
            final byte b2 = 1;
            heVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: ou9
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b22 = b2;
                    ru9 ru9Var2 = ru9Var;
                    switch (b22) {
                        case 0:
                            ru9Var2.requestFocus();
                            gm.E3(ru9Var2);
                            break;
                        default:
                            ru9Var2.requestFocus();
                            gm.E3(ru9Var2);
                            break;
                    }
                }
            });
            heVarArr[0].show();
        }
        heVarArr[0].k0 = false;
        ru9Var.setSelection(ru9Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z);

    public final void d(km0 km0Var, nm0 nm0Var) {
        this.w = km0Var;
        this.x = nm0Var;
        float N = gm.N(1.0f);
        Paint paint = this.y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            im0 c = km0Var.c(linearLayout, null, false);
            c.p(qqd.o(this.c));
            c.s(gm.L(9.0f), gm.L(15.0f), gm.L(15.0f), gm.L(9.0f));
            c.u(gm.L(5.0f));
            c.q(gm.L(4.0f));
            linearLayout.setBackground(c);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.j3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.E) {
                h(true);
                return;
            }
            return;
        }
        if (i == nm7.m4) {
            invalidate();
            gm.d0(this.d, new bn0((byte) 12));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.F < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LinearLayout linearLayout;
        if (view != this.d || (linearLayout = this.f) == null) {
            return super.drawChild(canvas, view, j);
        }
        if (linearLayout.getAlpha() >= 1.0f) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f.getAlpha()) * 255.0f), 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e(k39 k39Var, boolean z) {
        ny0 ny0Var = this.e;
        if (k39Var == null) {
            this.h = 0L;
            if (z) {
                f(null);
            }
            ny0Var.f();
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i >= arrayList.size()) {
                return;
            }
            uu9 uu9Var = (uu9) arrayList.get(i);
            long j = k39Var.h;
            k39 k39Var2 = uu9Var.a;
            long j2 = k39Var2.h;
            if (j == j2) {
                this.h = j2;
                if (z) {
                    f(k39Var2);
                }
                ny0Var.f();
                this.d.w0(i);
                return;
            }
            i++;
        }
    }

    public abstract boolean f(k39 k39Var);

    public final void g(boolean z) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            this.H = null;
            valueAnimator.cancel();
        }
        if (z) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z ? 1.0f : 0.0f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new p29(this, (byte) 13));
        this.H.setInterpolator(d53.h);
        this.H.setDuration(320L);
        this.H.addListener(new jf4((byte) 29, this, z));
        this.H.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.F);
    }

    public void h(boolean z) {
        boolean z2;
        int i;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i2 = this.a;
        oc7 r1 = oc7.r1(i2);
        long j = this.E;
        TLRPC.TL_messages_savedReactionsTags G1 = r1.G1(j, false);
        if (G1 != null) {
            int i3 = 0;
            z2 = false;
            while (i3 < G1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = G1.tags.get(i3);
                k39 d = k39.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = G1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j != 0 && tL_savedReactionTag.count <= 0)) {
                    i = i3;
                } else {
                    int i4 = tL_savedReactionTag.count;
                    String I1 = j != 0 ? r1.I1(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    uu9 uu9Var = new uu9();
                    uu9Var.a = d;
                    uu9Var.b = i4;
                    uu9Var.c = I1;
                    uu9Var.d = I1 == null ? -233 : I1.hashCode();
                    i = i3;
                    if (uu9Var.a.h == this.h) {
                        z2 = true;
                    }
                    arrayList2.add(uu9Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i3 = i + 1;
                G1 = tL_messages_savedReactionsTags;
            }
        } else {
            z2 = false;
        }
        if (!z2 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        ny0 ny0Var = this.e;
        if (z) {
            ww7.a(new tu9(this), true).c(ny0Var);
        } else {
            ny0Var.f();
        }
        boolean p = z8c.h(i2).p();
        this.s = !p;
        byte b = 20;
        if (p) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new kf9(this, b)).start();
                    return;
                } else {
                    linearLayout.setAlpha(1.0f);
                    this.f.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (this.f == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.f = linearLayout2;
            linearLayout2.setOnClickListener(new wk8(this, b));
            this.f.setOrientation(0);
            rve.b(this.f, 0.03f, 1.25f);
            jb1 jb1Var = new jb1(this, getContext());
            int i5 = cmb.n6;
            ylb ylbVar = this.c;
            anb.X(jb1Var, i5, ylbVar);
            jb1Var.setTextSize(1, 12.0f);
            jb1Var.setTypeface(gm.o());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i6 = cmb.Wc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i6, mode));
            pn2 pn2Var = new pn2(0, mutate);
            pn2Var.s = 0.0f;
            pn2Var.r = 0.0f;
            pn2Var.I = 0.94f;
            pn2Var.J = 0.94f;
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(pn2Var, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131754378, null));
            jb1Var.setText(spannableStringBuilder);
            jb1Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(9.0f), gm.L(4.0f));
            TextView textView = new TextView(getContext());
            anb.X(textView, i5, ylbVar);
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(gm.o());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131754377, null));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i6, mode));
            pn2 pn2Var2 = new pn2(0, mutate2);
            pn2Var2.I = 0.76f;
            pn2Var2.J = 0.76f;
            pn2Var2.r = -gm.L(1.0f);
            pn2Var2.s = gm.L(1.0f);
            spannableString2.setSpan(pn2Var2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(gm.L(5.66f), gm.L(4.0f), gm.L(9.0f), gm.L(4.0f));
            this.f.addView(jb1Var, qoe.r(-2, -2, 16));
            this.f.addView(textView, qoe.r(-2, -2, 16));
            this.f.setPadding(gm.L(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, qoe.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
        }
        if (z) {
            return;
        }
        this.f.setVisibility(0);
        this.f.setAlpha(0.0f);
        this.f.animate().alpha(1.0f).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        nm7.f(i).b(this, nm7.j3);
        nm7.f(i).b(this, nm7.m4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        nm7.f(i).n(this, nm7.j3);
        nm7.f(i).n(this, nm7.m4);
    }

    public void setShown(float f) {
        this.F = f;
        pu9 pu9Var = this.d;
        pu9Var.setPivotX(pu9Var.getWidth() / 2.0f);
        pu9Var.setPivotY(0.0f);
        pu9Var.setScaleX(gm.R1(0.8f, 1.0f, f));
        pu9Var.setScaleY(gm.R1(0.8f, 1.0f, f));
        setAlpha(f);
        invalidate();
    }
}
