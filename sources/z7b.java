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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z7b extends FrameLayout implements vlb {
    public boolean E;
    public Path F;
    public Paint G;
    public final ylb a;
    public final pc0 b;
    public final bf0 c;
    public final lka d;
    public final lka e;
    public final jh2 f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public z7b(Context context, ylb ylbVar) {
        super(context);
        pc0 pc0Var = new pc0((ylb) null);
        this.b = pc0Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = ylbVar;
        pc0Var.r = gm.L(40.0f);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(20.0f));
        addView(bf0Var);
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(16);
        int i = cmb.i5;
        anb.W(lkaVar, i, ylbVar);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        nm7.i(lkaVar);
        addView(lkaVar);
        lka lkaVar2 = new lka(context);
        this.e = lkaVar2;
        lkaVar2.setTextSize(14);
        anb.W(lkaVar2, i, ylbVar);
        lkaVar2.setGravity(jb6.a0 ? 5 : 3);
        nm7.i(lkaVar2);
        addView(lkaVar2);
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.f = jh2Var;
        int i2 = cmb.A5;
        int i3 = cmb.i7;
        jh2Var.b(i2, i3, cmb.B5);
        jh2Var.setDrawUnchecked(true);
        jh2Var.setDrawBackgroundAsArc(10);
        addView(jh2Var);
        jh2Var.a(false, false);
        jh2Var.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(gm.L(20.0f));
        anb.O(radioButton, i3, cmb.D5, ylbVar);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        lka lkaVar = this.e;
        lka lkaVar2 = this.d;
        if (charSequence == null) {
            lkaVar2.setTranslationY(0.0f);
            lkaVar.setVisibility(8);
        } else {
            lkaVar2.setTranslationY(gm.L(-9.0f));
            lkaVar.setTranslationY(gm.L(12.0f));
            lkaVar.l(charSequence, false);
            lkaVar.setVisibility(0);
        }
    }

    public final void a(int i, TLRPC.Chat chat) {
        String H;
        this.y = chat == null ? 0L : -chat.id;
        pc0 pc0Var = this.b;
        pc0Var.p(chat);
        int L = gm.L(sd2.c0(chat) ? 12.0f : 20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(chat, pc0Var);
        String str = chat.title;
        lka lkaVar = this.d;
        lkaVar.l(b10.e(lkaVar, str, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        if (this.r) {
            if (i <= 0) {
                i = chat.participants_count;
            }
            boolean V = sd2.V(chat);
            if (i >= 1) {
                H = jb6.G(i, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                H = jb6.M0(V ? 2131751327 : 2131754876, null);
            }
        } else {
            H = (!sd2.T(chat) || chat.megagroup) ? i >= 1 ? jb6.H(',', "Members", i - 1) : chat.has_geo ? jb6.M0(2131748399, null) : !sd2.t0(chat) ? jb6.M0(2131748398, null).toLowerCase() : jb6.M0(2131748395, null).toLowerCase() : i >= 1 ? jb6.H(',', "Subscribers", i - 1) : !sd2.t0(chat) ? jb6.M0(2131752271, null).toLowerCase() : jb6.M0(2131752260, null).toLowerCase();
        }
        setSubtitle(H);
        anb.W(this.e, zArr[0] ? cmb.m5 : cmb.q5, this.a);
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(false, i > 200 ? 0.3f : 1.0f);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    public final void b(boolean z, float f) {
        RadioButton radioButton = this.h;
        jh2 jh2Var = this.f;
        if (!z) {
            jh2Var.animate().cancel();
            jh2Var.setAlpha(f);
            radioButton.animate().cancel();
            radioButton.setAlpha(f);
            return;
        }
        if (Math.abs(jh2Var.getAlpha() - f) > 0.1d) {
            jh2Var.animate().cancel();
            jh2Var.animate().alpha(f).start();
        }
        if (Math.abs(radioButton.getAlpha() - f) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f).start();
        }
    }

    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.f;
        if (jh2Var.getVisibility() == 0) {
            jh2Var.a(z, z2);
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
        ylb ylbVar = this.a;
        lka lkaVar = this.d;
        lka lkaVar2 = this.e;
        pc0 pc0Var = this.b;
        if (i == 4) {
            lkaVar.l(jb6.M0(2131744214, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b10.e(lkaVar2, jb6.a0(null, null, 2131744210, m9c.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(jb6.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(jb6.M0(2131744215, null)));
            }
            anb.W(lkaVar2, cmb.m5, ylbVar);
            pc0Var.f(7);
            pc0Var.h(-15292942, -15630089);
        } else if (i == 2) {
            lkaVar.l(jb6.M0(2131744216, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b10.e(lkaVar2, jb6.a0(null, null, 2131744210, m9c.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(jb6.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(jb6.M0(2131744215, null)));
            }
            anb.W(lkaVar2, cmb.m5, ylbVar);
            pc0Var.f(4);
            pc0Var.h(-3905294, -6923014);
        } else if (i == 1) {
            lkaVar.l(jb6.M0(2131744218, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b10.e(lkaVar2, m9c.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(jb6.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(jb6.M0(2131744217, null)));
            }
            anb.W(lkaVar2, cmb.m5, ylbVar);
            pc0Var.f(15);
            pc0Var.h(-7808710, -13781445);
        } else if (i == 3) {
            lkaVar.l(jb6.M0(2131744206, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b10.e(lkaVar2, m9c.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(jb6.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(jb6.M0(2131744205, null)));
            }
            anb.W(lkaVar2, cmb.m5, ylbVar);
            pc0Var.f(6);
            pc0Var.h(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        bf0 bf0Var = this.c;
        bf0Var.setImageDrawable(pc0Var);
        bf0Var.setRoundRadius(gm.L(20.0f));
    }

    public final void f() {
        float f;
        float f2;
        float f3;
        int i = (jb6.a0 ? 5 : 3) | 16;
        boolean z = this.s;
        this.c.setLayoutParams(qoe.d(40, 40.0f, i, z ? 53.0f : 16.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        boolean z2 = jb6.a0;
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
        this.d.setLayoutParams(qoe.d(-1, -2.0f, i2, f, 0.0f, f2, 0.0f));
        boolean z3 = jb6.a0;
        int i3 = (z3 ? 5 : 3) | 16;
        if (z3) {
            f3 = 20.0f;
        } else {
            f3 = this.s ? 105 : 68;
        }
        if (z3) {
            f4 = this.s ? 105 : 68;
        }
        this.e.setLayoutParams(qoe.d(-1, -2.0f, i3, f3, 0.0f, f4, 0.0f));
        this.f.setLayoutParams(qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(qoe.d(22, 22.0f, (jb6.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        pn2 pn2Var = new pn2(2, drawable);
        drawable.setBounds(0, gm.L(1.0f), gm.L(11.0f), gm.L(12.0f));
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
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
            int v0 = cmb.v0(cmb.c7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(v0);
            if (jb6.a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - gm.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(gm.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
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
        jh2 jh2Var = this.f;
        if (jh2Var != null) {
            try {
                if (jh2Var.getVisibility() == 0) {
                    z = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z2 = true;
                    }
                    if (!z || z2) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z ? jh2Var.a.q : radioButton.f);
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
        accessibilityNodeInfo.setChecked(!z ? jh2Var.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.F;
        if (path == null) {
            this.F = new Path();
        } else {
            path.rewind();
        }
        float L = jb6.a0 ? gm.L(31.0f) : getMeasuredWidth() - gm.L(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f = jb6.a0 ? -1.0f : 1.0f;
        this.F.moveTo(L, measuredHeight - gm.L(6.0f));
        this.F.lineTo((f * gm.L(6.0f)) + L, measuredHeight);
        this.F.lineTo(L, measuredHeight + gm.L(6.0f));
        if (this.G == null) {
            Paint paint = new Paint(1);
            this.G = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.G.setStrokeCap(Paint.Cap.ROUND);
        }
        this.G.setStrokeWidth(gm.N(1.86f));
        this.G.setColor(cmb.p1(0.3f, cmb.v0(cmb.F6, this.a)));
    }

    public void set(Object obj) {
        boolean z = obj instanceof TLRPC.User;
        lka lkaVar = this.d;
        if (z) {
            lkaVar.setTypeface(gm.o());
            lkaVar.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            lkaVar.setTypeface(gm.o());
            lkaVar.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            lkaVar.setTypeface(null);
            lkaVar.setTranslationX((-gm.L(52.0f)) * (jb6.a0 ? -1 : 1));
            lkaVar.l((String) obj, false);
        }
    }

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z) {
        this.f.b(z ? cmb.mk : cmb.A5, cmb.i7, cmb.B5);
    }

    public void setUser(TLRPC.User user) {
        this.y = user == null ? 0L : user.id;
        pc0 pc0Var = this.b;
        pc0Var.q(user);
        int L = gm.L(20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(user, pc0Var);
        String r = m9c.r(user);
        lka lkaVar = this.d;
        lkaVar.l(b10.e(lkaVar, r, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z = this.r;
        ylb ylbVar = this.a;
        lka lkaVar2 = this.e;
        if (z) {
            setSubtitle(jb6.M0(2131743033, null));
            anb.W(lkaVar2, cmb.q5, ylbVar);
        } else {
            setSubtitle(jb6.d0(z8c.t0, user, zArr, null));
            anb.W(lkaVar2, zArr[0] ? cmb.m5 : cmb.q5, ylbVar);
        }
        int i = this.s ? 0 : 8;
        jh2 jh2Var = this.f;
        jh2Var.setVisibility(i);
        jh2Var.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(cmb.p1(0.3f, cmb.v0(cmb.F6, this.a)));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
