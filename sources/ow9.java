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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class ow9 extends FrameLayout implements fn7 {
    public static id I;
    public final long E;
    public float F;
    public float G;
    public ValueAnimator H;
    public final int a;
    public final e b;
    public final vnb c;
    public final gw9 d;
    public final ox0 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public ll0 w;
    public ol0 x;
    public final Paint y;

    public ow9(Context context, e eVar, int i, long j, vnb vnbVar) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.y = new Paint(1);
        this.a = i;
        this.b = eVar;
        this.c = vnbVar;
        this.E = j;
        x49.n(vnbVar);
        gw9 gw9Var = new gw9(this, context, vnbVar, (byte) 0);
        this.d = gw9Var;
        gw9Var.setPadding(hl.L(5.66f), 0, hl.L(5.66f), 0);
        gw9Var.setClipToPadding(false);
        x46 x46Var = new x46();
        x46Var.i1(0);
        gw9Var.setLayoutManager(x46Var);
        ox0 ox0Var = new ox0(this, (byte) 9);
        this.e = ox0Var;
        gw9Var.setAdapter(ox0Var);
        gw9Var.setOverScrollMode(2);
        addView(gw9Var, tre.c(-1.0f, -1));
        gw9Var.setOnItemClickListener(new fl8(this, i, eVar, (byte) 1));
        gw9Var.setOnItemLongClickListener(new an((Object) this, i, (Object) eVar, (Object) vnbVar, (byte) 9));
        hw9 hw9Var = new hw9();
        hw9Var.o(k43.h);
        hw9Var.n(320L);
        gw9Var.setItemAnimator(hw9Var);
        ls6.d0(i).a1(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.CharSequence] */
    public static void c(Context context, int i, TLRPC.Reaction reaction, vnb vnbVar) {
        SpannableString spannableString;
        e Q = LaunchActivity.Q();
        Activity W = hl.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        final byte b = 0;
        boolean z = Q != null && (Q.getFragmentView() instanceof wma) && ((wma) Q.getFragmentView()).Q() > hl.L(20.0f);
        id[] idVarArr = new id[1];
        ?? ndVar = z ? new nd(0, vnbVar, context) : new AlertDialog$Builder(0, vnbVar, context);
        String J1 = uc7.s1(i).J1(reaction);
        w49 d = w49.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(hl.L(20.0f));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString2 = new SpannableString("😀");
            spannableString2.setSpan(new hm(d.g, textPaint.getFontMetricsInt()), 0, spannableString2.length(), 17);
            spannableString = spannableString2;
        } else {
            spannableString = pv3.m(d.f, textPaint.getFontMetricsInt(), false, null, 0);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(spannableString).append((CharSequence) "  ").append((CharSequence) ob6.M0(TextUtils.isEmpty(J1) ? 2131745609 : 2131745597, null));
        id idVar = ndVar.a;
        idVar.S = append;
        final iw9 iw9Var = new iw9(context, vnbVar);
        iw9Var.setOnEditorActionListener(new jw9(iw9Var, i, reaction, idVarArr, currentFocus));
        ls6.d0(i).O(hl.F0(), true);
        iw9Var.setTextSize(1, 18.0f);
        if (J1 == null) {
            J1 = "";
        }
        iw9Var.setText(J1);
        int i2 = aob.j5;
        yob.X(iw9Var, i2, vnbVar);
        yob.l(iw9Var, 34, aob.Oi, vnbVar);
        iw9Var.setHintText(ob6.M0(2131745610, null));
        iw9Var.setSingleLine(true);
        iw9Var.setFocusable(true);
        iw9Var.setInputType(TLObject.FLAG_14);
        yob.F(iw9Var, aob.k6, aob.l6, aob.p7, vnbVar);
        iw9Var.setImeOptions(6);
        iw9Var.setBackgroundDrawable(null);
        iw9Var.setPadding(0, 0, hl.L(42.0f), 0);
        LinearLayout j = uh9.j(context, 1);
        TextView textView = new TextView(context);
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131745608, null));
        j.addView(textView, tre.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        j.addView(iw9Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        ndVar.n(j);
        idVar.a = hl.L(292.0f);
        ndVar.j(ob6.M0(2131745674, null), new bf((Object) iw9Var, i, (Object) reaction, (byte) 15));
        ndVar.g(ob6.M0(2131752570, null), new vr9((byte) 6));
        if (z) {
            I = idVar;
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new i41(currentFocus, (byte) 3));
            I.setOnShowListener(new DialogInterface.OnShowListener() { // from class: fw9
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b2 = b;
                    iw9 iw9Var2 = iw9Var;
                    switch (b2) {
                        case 0:
                            iw9Var2.requestFocus();
                            hl.E3(iw9Var2);
                            break;
                        default:
                            iw9Var2.requestFocus();
                            hl.E3(iw9Var2);
                            break;
                    }
                }
            });
            I.q(250L);
        } else {
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new dl8(iw9Var, (byte) 5));
            final byte b2 = 1;
            idVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: fw9
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b22 = b2;
                    iw9 iw9Var2 = iw9Var;
                    switch (b22) {
                        case 0:
                            iw9Var2.requestFocus();
                            hl.E3(iw9Var2);
                            break;
                        default:
                            iw9Var2.requestFocus();
                            hl.E3(iw9Var2);
                            break;
                    }
                }
            });
            idVarArr[0].show();
        }
        idVarArr[0].k0 = false;
        iw9Var.setSelection(iw9Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z);

    public final void d(ll0 ll0Var, ol0 ol0Var) {
        this.w = ll0Var;
        this.x = ol0Var;
        float N = hl.N(1.0f);
        Paint paint = this.y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            jl0 c = ll0Var.c(linearLayout, null, false);
            c.p(dtd.o(this.c));
            c.s(hl.L(9.0f), hl.L(15.0f), hl.L(15.0f), hl.L(9.0f));
            c.u(hl.L(5.0f));
            c.q(hl.L(4.0f));
            linearLayout.setBackground(c);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.j3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.E) {
                h(true);
                return;
            }
            return;
        }
        if (i == jn7.l4) {
            invalidate();
            hl.d0(this.d, new bm0((byte) 12));
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

    public final void e(w49 w49Var, boolean z) {
        ox0 ox0Var = this.e;
        if (w49Var == null) {
            this.h = 0L;
            if (z) {
                f(null);
            }
            ox0Var.f();
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i >= arrayList.size()) {
                return;
            }
            lw9 lw9Var = (lw9) arrayList.get(i);
            long j = w49Var.h;
            w49 w49Var2 = lw9Var.a;
            long j2 = w49Var2.h;
            if (j == j2) {
                this.h = j2;
                if (z) {
                    f(w49Var2);
                }
                ox0Var.f();
                this.d.x0(i);
                return;
            }
            i++;
        }
    }

    public abstract boolean f(w49 w49Var);

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
        ofFloat.addUpdateListener(new b49(this, (byte) 13));
        this.H.setInterpolator(k43.h);
        this.H.setDuration(320L);
        this.H.addListener(new gf4((byte) 28, this, z));
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
        uc7 s1 = uc7.s1(i2);
        long j = this.E;
        TLRPC.TL_messages_savedReactionsTags H1 = s1.H1(j, false);
        if (H1 != null) {
            int i3 = 0;
            z2 = false;
            while (i3 < H1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = H1.tags.get(i3);
                w49 d = w49.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = H1;
                if (hashSet.contains(Long.valueOf(d.h)) || (j != 0 && tL_savedReactionTag.count <= 0)) {
                    i = i3;
                } else {
                    int i4 = tL_savedReactionTag.count;
                    String J1 = j != 0 ? s1.J1(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    lw9 lw9Var = new lw9();
                    lw9Var.a = d;
                    lw9Var.b = i4;
                    lw9Var.c = J1;
                    lw9Var.d = J1 == null ? -233 : J1.hashCode();
                    i = i3;
                    if (lw9Var.a.h == this.h) {
                        z2 = true;
                    }
                    arrayList2.add(lw9Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i3 = i + 1;
                H1 = tL_messages_savedReactionsTags;
            }
        } else {
            z2 = false;
        }
        if (!z2 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        ox0 ox0Var = this.e;
        if (z) {
            cy7.a(new kw9(this), true).c(ox0Var);
        } else {
            ox0Var.f();
        }
        boolean p = yac.h(i2).p();
        this.s = !p;
        if (p) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new v59(this, (byte) 28)).start();
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
            linearLayout2.setOnClickListener(new jn8(this, (byte) 19));
            this.f.setOrientation(0);
            iye.b(this.f, 0.03f, 1.25f);
            ja1 ja1Var = new ja1(this, getContext());
            int i5 = aob.o6;
            vnb vnbVar = this.c;
            yob.X(ja1Var, i5, vnbVar);
            ja1Var.setTextSize(1, 12.0f);
            ja1Var.setTypeface(hl.o());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i6 = aob.Xc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i6, mode));
            wm2 wm2Var = new wm2(0, mutate);
            wm2Var.s = 0.0f;
            wm2Var.r = 0.0f;
            wm2Var.I = 0.94f;
            wm2Var.J = 0.94f;
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(wm2Var, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131754374, null));
            ja1Var.setText(spannableStringBuilder);
            ja1Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(9.0f), hl.L(4.0f));
            TextView textView = new TextView(getContext());
            yob.X(textView, i5, vnbVar);
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(hl.o());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131754373, null));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i6, mode));
            wm2 wm2Var2 = new wm2(0, mutate2);
            wm2Var2.I = 0.76f;
            wm2Var2.J = 0.76f;
            wm2Var2.r = -hl.L(1.0f);
            wm2Var2.s = hl.L(1.0f);
            spannableString2.setSpan(wm2Var2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(hl.L(5.66f), hl.L(4.0f), hl.L(9.0f), hl.L(4.0f));
            this.f.addView(ja1Var, tre.r(-2, -2, 16));
            this.f.addView(textView, tre.r(-2, -2, 16));
            this.f.setPadding(hl.L(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, tre.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
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
        jn7.f(i).b(this, jn7.j3);
        jn7.f(i).b(this, jn7.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        jn7.f(i).n(this, jn7.j3);
        jn7.f(i).n(this, jn7.l4);
    }

    public void setShown(float f) {
        this.F = f;
        gw9 gw9Var = this.d;
        gw9Var.setPivotX(gw9Var.getWidth() / 2.0f);
        gw9Var.setPivotY(0.0f);
        gw9Var.setScaleX(hl.R1(0.8f, 1.0f, f));
        gw9Var.setScaleY(hl.R1(0.8f, 1.0f, f));
        setAlpha(f);
        invalidate();
    }
}
