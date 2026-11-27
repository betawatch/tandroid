// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v9b extends FrameLayout implements snb {
    public boolean E;
    public Path F;
    public Paint G;
    public final vnb a;
    public final rb0 b;
    public final de0 c;
    public final ema d;
    public final ema e;
    public final og2 f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public v9b(Context context, vnb vnbVar) {
        super(context);
        rb0 rb0Var = new rb0((vnb) null);
        this.b = rb0Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = vnbVar;
        rb0Var.r = hl.L(40.0f);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(20.0f));
        addView(de0Var);
        ema emaVar = new ema(context);
        this.d = emaVar;
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(16);
        int i = aob.j5;
        yob.W(emaVar, i, vnbVar);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        jn7.i(emaVar);
        addView(emaVar);
        ema emaVar2 = new ema(context);
        this.e = emaVar2;
        emaVar2.setTextSize(14);
        yob.W(emaVar2, i, vnbVar);
        emaVar2.setGravity(ob6.a0 ? 5 : 3);
        jn7.i(emaVar2);
        addView(emaVar2);
        og2 og2Var = new og2(21, vnbVar, context);
        this.f = og2Var;
        int i2 = aob.B5;
        int i3 = aob.j7;
        og2Var.b(i2, i3, aob.C5);
        og2Var.setDrawUnchecked(true);
        og2Var.setDrawBackgroundAsArc(10);
        addView(og2Var);
        og2Var.a(false, false);
        og2Var.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, i3, aob.E5, vnbVar);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        ema emaVar = this.e;
        ema emaVar2 = this.d;
        if (charSequence == null) {
            emaVar2.setTranslationY(0.0f);
            emaVar.setVisibility(8);
        } else {
            emaVar2.setTranslationY(hl.L(-9.0f));
            emaVar.setTranslationY(hl.L(12.0f));
            emaVar.l(charSequence, false);
            emaVar.setVisibility(0);
        }
    }

    public final void a(int i, TLRPC.Chat chat) {
        String H;
        this.y = chat == null ? 0L : -chat.id;
        rb0 rb0Var = this.b;
        rb0Var.p(chat);
        int L = hl.L(xc2.c0(chat) ? 12.0f : 20.0f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(chat, rb0Var);
        String str = chat.title;
        ema emaVar = this.d;
        emaVar.l(c00.f(emaVar, str, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        if (this.r) {
            if (i <= 0) {
                i = chat.participants_count;
            }
            boolean V = xc2.V(chat);
            if (i >= 1) {
                H = ob6.G(i, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                H = ob6.M0(V ? 2131751355 : 2131754872, null);
            }
        } else {
            H = (!xc2.T(chat) || chat.megagroup) ? i >= 1 ? ob6.H(',', "Members", i - 1) : chat.has_geo ? ob6.M0(2131748396, null) : !xc2.t0(chat) ? ob6.M0(2131748395, null).toLowerCase() : ob6.M0(2131748392, null).toLowerCase() : i >= 1 ? ob6.H(',', "Subscribers", i - 1) : !xc2.t0(chat) ? ob6.M0(2131752299, null).toLowerCase() : ob6.M0(2131752288, null).toLowerCase();
        }
        setSubtitle(H);
        yob.W(this.e, zArr[0] ? aob.n5 : aob.r5, this.a);
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(false, i > 200 ? 0.3f : 1.0f);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
    }

    public final void b(boolean z, float f) {
        RadioButton radioButton = this.h;
        og2 og2Var = this.f;
        if (!z) {
            og2Var.animate().cancel();
            og2Var.setAlpha(f);
            radioButton.animate().cancel();
            radioButton.setAlpha(f);
            return;
        }
        if (Math.abs(og2Var.getAlpha() - f) > 0.1d) {
            og2Var.animate().cancel();
            og2Var.animate().alpha(f).start();
        }
        if (Math.abs(radioButton.getAlpha() - f) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f).start();
        }
    }

    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.f;
        if (og2Var.getVisibility() == 0) {
            og2Var.a(z, z2);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z, z2);
        }
    }

    public final void d(boolean z, boolean z2) {
        this.r = z;
        if (z2 != this.s) {
            this.s = z2;
            f();
        }
        if (!this.s) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
        }
        setWillNotDraw(!this.E && (this.s || !this.r));
    }

    public final void e(int i, int i2, TLRPC.User user) {
        vnb vnbVar = this.a;
        ema emaVar = this.d;
        ema emaVar2 = this.e;
        rb0 rb0Var = this.b;
        if (i == 4) {
            emaVar.l(ob6.M0(2131744182, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(c00.f(emaVar2, ob6.a0(null, null, 2131744178, lbc.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(ob6.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(ob6.M0(2131744183, null)));
            }
            yob.W(emaVar2, aob.n5, vnbVar);
            rb0Var.f(7);
            rb0Var.h(-15292942, -15630089);
        } else if (i == 2) {
            emaVar.l(ob6.M0(2131744184, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(c00.f(emaVar2, ob6.a0(null, null, 2131744178, lbc.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(ob6.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(ob6.M0(2131744183, null)));
            }
            yob.W(emaVar2, aob.n5, vnbVar);
            rb0Var.f(4);
            rb0Var.h(-3905294, -6923014);
        } else if (i == 1) {
            emaVar.l(ob6.M0(2131744186, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(c00.f(emaVar2, lbc.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(ob6.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(ob6.M0(2131744185, null)));
            }
            yob.W(emaVar2, aob.n5, vnbVar);
            rb0Var.f(15);
            rb0Var.h(-7808710, -13781445);
        } else if (i == 3) {
            emaVar.l(ob6.M0(2131744174, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(c00.f(emaVar2, lbc.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(ob6.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(ob6.M0(2131744173, null)));
            }
            yob.W(emaVar2, aob.n5, vnbVar);
            rb0Var.f(6);
            rb0Var.h(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        de0 de0Var = this.c;
        de0Var.setImageDrawable(rb0Var);
        de0Var.setRoundRadius(hl.L(20.0f));
    }

    public final void f() {
        float f;
        float f2;
        float f3;
        int i = (ob6.a0 ? 5 : 3) | 16;
        boolean z = this.s;
        this.c.setLayoutParams(tre.d(40, 40.0f, i, z ? 53.0f : 16.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        boolean z2 = ob6.a0;
        int i2 = (z2 ? 5 : 3) | 16;
        float f4 = 20.0f;
        if (z2) {
            f = 20.0f;
        } else {
            f = this.s ? 105 : 68;
        }
        if (z2) {
            f2 = this.s ? 105 : 68;
        } else {
            f2 = 20.0f;
        }
        this.d.setLayoutParams(tre.d(-1, -2.0f, i2, f, 0.0f, f2, 0.0f));
        boolean z3 = ob6.a0;
        int i3 = (z3 ? 5 : 3) | 16;
        if (z3) {
            f3 = 20.0f;
        } else {
            f3 = this.s ? 105 : 68;
        }
        if (z3) {
            f4 = this.s ? 105 : 68;
        }
        this.e.setLayoutParams(tre.d(-1, -2.0f, i3, f3, 0.0f, f4, 0.0f));
        this.f.setLayoutParams(tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(tre.d(22, 22.0f, (ob6.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        wm2 wm2Var = new wm2(2, drawable);
        drawable.setBounds(0, hl.L(1.0f), hl.L(11.0f), hl.L(12.0f));
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.E) {
            int v0 = aob.v0(aob.d7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(v0);
            if (ob6.a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - hl.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(hl.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.F;
        if (path == null || (paint = this.G) == null || this.s || !this.r || !this.w) {
            return;
        }
        canvas2.drawPath(path, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:27:0x0009, B:6:0x0016, B:13:0x0021, B:15:0x0026, B:16:0x002d, B:19:0x0037, B:25:0x002b), top: B:26:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002b A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:27:0x0009, B:6:0x0016, B:13:0x0021, B:15:0x0026, B:16:0x002d, B:19:0x0037, B:25:0x002b), top: B:26:0x0009 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        RadioButton radioButton;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z2 = false;
        og2 og2Var = this.f;
        if (og2Var != null) {
            try {
                if (og2Var.getVisibility() == 0) {
                    z = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z2 = true;
                    }
                    if (!z || z2) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z ? og2Var.a.q : radioButton.f);
                        accessibilityNodeInfo.setClassName(!z ? "android.widget.CheckBox" : "android.widget.RadioButton");
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        z = false;
        radioButton = this.h;
        if (radioButton != null) {
            z2 = true;
        }
        if (z) {
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(!z ? og2Var.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.F;
        if (path == null) {
            this.F = new Path();
        } else {
            path.rewind();
        }
        float L = ob6.a0 ? hl.L(31.0f) : getMeasuredWidth() - hl.L(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f = ob6.a0 ? -1.0f : 1.0f;
        this.F.moveTo(L, measuredHeight - hl.L(6.0f));
        this.F.lineTo((f * hl.L(6.0f)) + L, measuredHeight);
        this.F.lineTo(L, measuredHeight + hl.L(6.0f));
        if (this.G == null) {
            Paint paint = new Paint(1);
            this.G = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.G.setStrokeCap(Paint.Cap.ROUND);
        }
        this.G.setStrokeWidth(hl.N(1.86f));
        this.G.setColor(aob.p1(0.3f, aob.v0(aob.G6, this.a)));
    }

    public void set(Object obj) {
        boolean z = obj instanceof TLRPC.User;
        ema emaVar = this.d;
        if (z) {
            emaVar.setTypeface(hl.o());
            emaVar.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            emaVar.setTypeface(hl.o());
            emaVar.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            emaVar.setTypeface(null);
            emaVar.setTranslationX((-hl.L(52.0f)) * (ob6.a0 ? -1 : 1));
            emaVar.l((String) obj, false);
        }
    }

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z) {
        this.f.b(z ? aob.nk : aob.B5, aob.j7, aob.C5);
    }

    public void setUser(TLRPC.User user) {
        this.y = user == null ? 0L : user.id;
        rb0 rb0Var = this.b;
        rb0Var.q(user);
        int L = hl.L(20.0f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(user, rb0Var);
        String r = lbc.r(user);
        ema emaVar = this.d;
        emaVar.l(c00.f(emaVar, r, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z = this.r;
        vnb vnbVar = this.a;
        ema emaVar2 = this.e;
        if (z) {
            setSubtitle(ob6.M0(2131743001, null));
            yob.W(emaVar2, aob.r5, vnbVar);
        } else {
            setSubtitle(ob6.d0(yac.t0, user, zArr, null));
            yob.W(emaVar2, zArr[0] ? aob.n5 : aob.r5, vnbVar);
        }
        int i = this.s ? 0 : 8;
        og2 og2Var = this.f;
        og2Var.setVisibility(i);
        og2Var.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override // snb
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(aob.p1(0.3f, aob.v0(aob.G6, this.a)));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
