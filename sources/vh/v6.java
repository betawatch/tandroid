package vh;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.p6 a;
    public final org.telegram.ui.Components.r8 b;
    public final org.telegram.ui.Components.g9 c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final ep f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public v6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.b = r8Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = p6Var;
        r8Var.r = org.telegram.messenger.i0.L(40.0f);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        addView(g9Var);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i10, p6Var);
        u5Var.setGravity(cd.X ? 5 : 3);
        zs.i(u5Var);
        addView(u5Var);
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var2;
        u5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i10, p6Var);
        u5Var2.setGravity(cd.X ? 5 : 3);
        zs.i(u5Var2);
        addView(u5Var2);
        ep epVar = new ep(21, context, p6Var);
        this.f = epVar;
        int i11 = org.telegram.ui.ActionBar.t6.B5;
        int i12 = org.telegram.ui.ActionBar.t6.j7;
        epVar.b(i11, i12, org.telegram.ui.ActionBar.t6.C5);
        epVar.setDrawUnchecked(true);
        epVar.setDrawBackgroundAsArc(10);
        addView(epVar);
        epVar.a(false, false);
        epVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.a7.P(radioButton, i12, org.telegram.ui.ActionBar.t6.E5, p6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.e;
        if (charSequence == null) {
            u5Var.setTranslationY(0.0f);
            u5Var2.setVisibility(8);
        } else {
            u5Var.setTranslationY(org.telegram.messenger.i0.L(-9.0f));
            u5Var2.setTranslationY(org.telegram.messenger.i0.L(12.0f));
            u5Var2.l(charSequence, false);
            u5Var2.setVisibility(0);
        }
    }

    public final void a(int i10, TLRPC.Chat chat) {
        String H;
        this.y = chat == null ? 0L : -chat.id;
        org.telegram.ui.Components.r8 r8Var = this.b;
        r8Var.q(chat);
        int L = org.telegram.messenger.i0.L(org.telegram.messenger.w3.c0(chat) ? 12.0f : 20.0f);
        org.telegram.ui.Components.g9 g9Var = this.c;
        g9Var.setRoundRadius(L);
        g9Var.e(chat, r8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.l(org.telegram.messenger.k6.m(str, u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        if (this.r) {
            if (i10 <= 0) {
                i10 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.w3.V(chat);
            if (i10 >= 1) {
                H = cd.G(i10, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                H = cd.L0(V ? 2131751391 : 2131754876, null);
            }
        } else {
            H = (!org.telegram.messenger.w3.T(chat) || chat.megagroup) ? i10 >= 1 ? cd.H(',', "Members", i10 - 1) : chat.has_geo ? cd.L0(2131748657, null) : !org.telegram.messenger.w3.t0(chat) ? cd.L0(2131748656, null).toLowerCase() : cd.L0(2131748653, null).toLowerCase() : i10 >= 1 ? cd.H(',', "Subscribers", i10 - 1) : !org.telegram.messenger.w3.t0(chat) ? cd.L0(2131752329, null).toLowerCase() : cd.L0(2131752318, null).toLowerCase();
        }
        setSubtitle(H);
        org.telegram.ui.ActionBar.a7.Y(this.e, zArr[0] ? org.telegram.ui.ActionBar.t6.n5 : org.telegram.ui.ActionBar.t6.r5, this.a);
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(false, i10 > 200 ? 0.3f : 1.0f);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
    }

    public final void b(boolean z10, float f7) {
        RadioButton radioButton = this.h;
        ep epVar = this.f;
        if (!z10) {
            epVar.animate().cancel();
            epVar.setAlpha(f7);
            radioButton.animate().cancel();
            radioButton.setAlpha(f7);
            return;
        }
        if (Math.abs(epVar.getAlpha() - f7) > 0.1d) {
            epVar.animate().cancel();
            epVar.animate().alpha(f7).start();
        }
        if (Math.abs(radioButton.getAlpha() - f7) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f7).start();
        }
    }

    public final void c(boolean z10, boolean z11) {
        ep epVar = this.f;
        if (epVar.getVisibility() == 0) {
            epVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        this.r = z10;
        if (z11 != this.s) {
            this.s = z11;
            f();
        }
        if (!this.s) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
        }
        setWillNotDraw(!this.D && (this.s || !this.r));
    }

    public final void e(int i10, int i11, TLRPC.User user) {
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.e;
        org.telegram.ui.Components.r8 r8Var = this.b;
        if (i10 == 4) {
            u5Var.l(cd.L0(2131744554, null), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.k6.m(cd.a0(null, null, 2131744550, h20.p(user)), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i11 > 0) {
                setSubtitle(g(cd.G(i11, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(cd.L0(2131744555, null)));
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.n5, p6Var);
            r8Var.g(7);
            r8Var.i(-15292942, -15630089);
        } else if (i10 == 2) {
            u5Var.l(cd.L0(2131744556, null), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.k6.m(cd.a0(null, null, 2131744550, h20.p(user)), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i11 > 0) {
                setSubtitle(g(cd.G(i11, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(cd.L0(2131744555, null)));
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.n5, p6Var);
            r8Var.g(4);
            r8Var.i(-3905294, -6923014);
        } else if (i10 == 1) {
            u5Var.l(cd.L0(2131744558, null), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.k6.m(h20.p(user), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i11 > 0) {
                setSubtitle(g(cd.G(i11, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(cd.L0(2131744557, null)));
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.n5, p6Var);
            r8Var.g(15);
            r8Var.i(-7808710, -13781445);
        } else if (i10 == 3) {
            u5Var.l(cd.L0(2131744546, null), false);
            if (i11 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.k6.m(h20.p(user), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i11 > 0) {
                setSubtitle(g(cd.G(i11, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(cd.L0(2131744545, null)));
            }
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.n5, p6Var);
            r8Var.g(6);
            r8Var.i(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        org.telegram.ui.Components.g9 g9Var = this.c;
        g9Var.setImageDrawable(r8Var);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
    }

    public final void f() {
        float f7;
        float f10;
        float f11;
        int i10 = (cd.X ? 5 : 3) | 16;
        boolean z10 = this.s;
        this.c.setLayoutParams(w7.b6.d(40, 40.0f, i10, z10 ? 53.0f : 16.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        boolean z11 = cd.X;
        int i11 = (z11 ? 5 : 3) | 16;
        float f12 = 20.0f;
        if (z11) {
            f7 = 20.0f;
        } else {
            f7 = this.s ? 105 : 68;
        }
        if (z11) {
            f10 = this.s ? 105 : 68;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(w7.b6.d(-1, -2.0f, i11, f7, 0.0f, f10, 0.0f));
        boolean z12 = cd.X;
        int i12 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f11 = 20.0f;
        } else {
            f11 = this.s ? 105 : 68;
        }
        if (z12) {
            f12 = this.s ? 105 : 68;
        }
        this.e.setLayoutParams(w7.b6.d(-1, -2.0f, i12, f11, 0.0f, f12, 0.0f));
        this.f.setLayoutParams(w7.b6.d(24, 24.0f, (cd.X ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(w7.b6.d(22, 22.0f, (cd.X ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        dq dqVar = new dq(2, drawable);
        drawable.setBounds(0, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(12.0f));
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(w02);
            if (cd.X) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(org.telegram.messenger.i0.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.E;
        if (path == null || (paint = this.F) == null || this.s || !this.r || !this.w) {
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
        boolean z10;
        RadioButton radioButton;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z11 = false;
        ep epVar = this.f;
        if (epVar != null) {
            try {
                if (epVar.getVisibility() == 0) {
                    z10 = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z11 = true;
                    }
                    if (!z10 || z11) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z10 ? epVar.a.q : radioButton.f);
                        accessibilityNodeInfo.setClassName(!z10 ? "android.widget.CheckBox" : "android.widget.RadioButton");
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        z10 = false;
        radioButton = this.h;
        if (radioButton != null) {
            z11 = true;
        }
        if (z10) {
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(!z10 ? epVar.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z10 ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.E;
        if (path == null) {
            this.E = new Path();
        } else {
            path.rewind();
        }
        float L = cd.X ? org.telegram.messenger.i0.L(31.0f) : getMeasuredWidth() - org.telegram.messenger.i0.L(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f7 = cd.X ? -1.0f : 1.0f;
        this.E.moveTo(L, measuredHeight - org.telegram.messenger.i0.L(6.0f));
        this.E.lineTo((f7 * org.telegram.messenger.i0.L(6.0f)) + L, measuredHeight);
        this.E.lineTo(L, measuredHeight + org.telegram.messenger.i0.L(6.0f));
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.F.setStrokeCap(Paint.Cap.ROUND);
        }
        this.F.setStrokeWidth(org.telegram.messenger.i0.N(1.86f));
        this.F.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.a)));
    }

    public void set(Object obj) {
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        if (z10) {
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            u5Var.setTypeface(org.telegram.messenger.i0.o());
            u5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            u5Var.setTypeface(null);
            u5Var.setTranslationX((-org.telegram.messenger.i0.L(52.0f)) * (cd.X ? -1 : 1));
            u5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        this.D = z10;
        setWillNotDraw(!z10 && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z10) {
        this.f.b(z10 ? org.telegram.ui.ActionBar.t6.kk : org.telegram.ui.ActionBar.t6.B5, org.telegram.ui.ActionBar.t6.j7, org.telegram.ui.ActionBar.t6.C5);
    }

    public void setUser(TLRPC.User user) {
        this.y = user == null ? 0L : user.id;
        org.telegram.ui.Components.r8 r8Var = this.b;
        r8Var.r(user);
        int L = org.telegram.messenger.i0.L(20.0f);
        org.telegram.ui.Components.g9 g9Var = this.c;
        g9Var.setRoundRadius(L);
        g9Var.e(user, r8Var);
        String p5 = h20.p(user);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.l(org.telegram.messenger.k6.m(p5, u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z10 = this.r;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.e;
        if (z10) {
            setSubtitle(cd.L0(2131743375, null));
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.r5, p6Var);
        } else {
            setSubtitle(cd.d0(d20.s0, user, zArr, null));
            org.telegram.ui.ActionBar.a7.Y(u5Var2, zArr[0] ? org.telegram.ui.ActionBar.t6.n5 : org.telegram.ui.ActionBar.t6.r5, p6Var);
        }
        int i10 = this.s ? 0 : 8;
        ep epVar = this.f;
        epVar.setVisibility(i10);
        epVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            Paint paint = this.F;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.a)));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
