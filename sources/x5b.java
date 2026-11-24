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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x5b extends FrameLayout implements tjb {
    public boolean E;
    public Path F;
    public Paint G;
    public final wjb a;
    public final pb0 b;
    public final be0 c;
    public final jia d;
    public final jia e;
    public final wf2 f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public x5b(Context context, wjb wjbVar) {
        super(context);
        pb0 pb0Var = new pb0((wjb) null);
        this.b = pb0Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = wjbVar;
        pb0Var.r = gl.L(40.0f);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(20.0f));
        addView(be0Var);
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(16);
        int i = bkb.i5;
        zkb.W(jiaVar, i, wjbVar);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        kk7.i(jiaVar);
        addView(jiaVar);
        jia jiaVar2 = new jia(context);
        this.e = jiaVar2;
        jiaVar2.setTextSize(14);
        zkb.W(jiaVar2, i, wjbVar);
        jiaVar2.setGravity(k96.a0 ? 5 : 3);
        kk7.i(jiaVar2);
        addView(jiaVar2);
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.f = wf2Var;
        int i2 = bkb.A5;
        int i3 = bkb.i7;
        wf2Var.b(i2, i3, bkb.B5);
        wf2Var.setDrawUnchecked(true);
        wf2Var.setDrawBackgroundAsArc(10);
        addView(wf2Var);
        wf2Var.a(false, false);
        wf2Var.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, i3, bkb.D5, wjbVar);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        jia jiaVar = this.e;
        jia jiaVar2 = this.d;
        if (charSequence == null) {
            jiaVar2.setTranslationY(0.0f);
            jiaVar.setVisibility(8);
        } else {
            jiaVar2.setTranslationY(gl.L(-9.0f));
            jiaVar.setTranslationY(gl.L(12.0f));
            jiaVar.l(charSequence, false);
            jiaVar.setVisibility(0);
        }
    }

    public final void a(int i, TLRPC.Chat chat) {
        String H;
        this.y = chat == null ? 0L : -chat.id;
        pb0 pb0Var = this.b;
        pb0Var.p(chat);
        int L = gl.L(hc2.c0(chat) ? 12.0f : 20.0f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(chat, pb0Var);
        String str = chat.title;
        jia jiaVar = this.d;
        jiaVar.l(b00.e(jiaVar, str, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        if (this.r) {
            if (i <= 0) {
                i = chat.participants_count;
            }
            boolean V = hc2.V(chat);
            if (i >= 1) {
                H = k96.G(i, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                H = k96.M0(V ? 2131751378 : 2131754876, null);
            }
        } else {
            H = (!hc2.T(chat) || chat.megagroup) ? i >= 1 ? k96.H(',', "Members", i - 1) : chat.has_geo ? k96.M0(2131748450, null) : !hc2.t0(chat) ? k96.M0(2131748449, null).toLowerCase() : k96.M0(2131748446, null).toLowerCase() : i >= 1 ? k96.H(',', "Subscribers", i - 1) : !hc2.t0(chat) ? k96.M0(2131752317, null).toLowerCase() : k96.M0(2131752306, null).toLowerCase();
        }
        setSubtitle(H);
        zkb.W(this.e, zArr[0] ? bkb.m5 : bkb.q5, this.a);
        this.f.setVisibility(this.s ? 0 : 8);
        this.h.setVisibility(8);
        b(false, i > 200 ? 0.3f : 1.0f);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    public final void b(boolean z, float f) {
        RadioButton radioButton = this.h;
        wf2 wf2Var = this.f;
        if (!z) {
            wf2Var.animate().cancel();
            wf2Var.setAlpha(f);
            radioButton.animate().cancel();
            radioButton.setAlpha(f);
            return;
        }
        if (Math.abs(wf2Var.getAlpha() - f) > 0.1d) {
            wf2Var.animate().cancel();
            wf2Var.animate().alpha(f).start();
        }
        if (Math.abs(radioButton.getAlpha() - f) > 0.1d) {
            radioButton.animate().cancel();
            radioButton.animate().alpha(f).start();
        }
    }

    public final void c(boolean z, boolean z2) {
        wf2 wf2Var = this.f;
        if (wf2Var.getVisibility() == 0) {
            wf2Var.a(z, z2);
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
        wjb wjbVar = this.a;
        jia jiaVar = this.d;
        jia jiaVar2 = this.e;
        pb0 pb0Var = this.b;
        if (i == 4) {
            jiaVar.l(k96.M0(2131744288, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b00.e(jiaVar2, k96.a0(null, null, 2131744284, l7c.q(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(k96.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(k96.M0(2131744289, null)));
            }
            zkb.W(jiaVar2, bkb.m5, wjbVar);
            pb0Var.f(7);
            pb0Var.h(-15292942, -15630089);
        } else if (i == 2) {
            jiaVar.l(k96.M0(2131744290, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b00.e(jiaVar2, k96.a0(null, null, 2131744284, l7c.q(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(k96.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(k96.M0(2131744289, null)));
            }
            zkb.W(jiaVar2, bkb.m5, wjbVar);
            pb0Var.f(4);
            pb0Var.h(-3905294, -6923014);
        } else if (i == 1) {
            jiaVar.l(k96.M0(2131744292, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b00.e(jiaVar2, l7c.q(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(k96.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(k96.M0(2131744291, null)));
            }
            zkb.W(jiaVar2, bkb.m5, wjbVar);
            pb0Var.f(15);
            pb0Var.h(-7808710, -13781445);
        } else if (i == 3) {
            jiaVar.l(k96.M0(2131744280, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(b00.e(jiaVar2, l7c.q(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(k96.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(k96.M0(2131744279, null)));
            }
            zkb.W(jiaVar2, bkb.m5, wjbVar);
            pb0Var.f(6);
            pb0Var.h(-18621, -618956);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(this.s ? 0 : 8);
        be0 be0Var = this.c;
        be0Var.setImageDrawable(pb0Var);
        be0Var.setRoundRadius(gl.L(20.0f));
    }

    public final void f() {
        float f;
        float f2;
        float f3;
        int i = (k96.a0 ? 5 : 3) | 16;
        boolean z = this.s;
        this.c.setLayoutParams(nme.d(40, 40.0f, i, z ? 53.0f : 16.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        boolean z2 = k96.a0;
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
        this.d.setLayoutParams(nme.d(-1, -2.0f, i2, f, 0.0f, f2, 0.0f));
        boolean z3 = k96.a0;
        int i3 = (z3 ? 5 : 3) | 16;
        if (z3) {
            f3 = 20.0f;
        } else {
            f3 = this.s ? 105 : 68;
        }
        if (z3) {
            f4 = this.s ? 105 : 68;
        }
        this.e.setLayoutParams(nme.d(-1, -2.0f, i3, f3, 0.0f, f4, 0.0f));
        this.f.setLayoutParams(nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        this.h.setLayoutParams(nme.d(22, 22.0f, (k96.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        cm2 cm2Var = new cm2(2, drawable);
        drawable.setBounds(0, gl.L(1.0f), gl.L(11.0f), gl.L(12.0f));
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
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
            int v0 = bkb.v0(bkb.c7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(v0);
            if (k96.a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - gl.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(gl.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
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
        wf2 wf2Var = this.f;
        if (wf2Var != null) {
            try {
                if (wf2Var.getVisibility() == 0) {
                    z = true;
                    radioButton = this.h;
                    if (radioButton != null && radioButton.getVisibility() == 0) {
                        z2 = true;
                    }
                    if (!z || z2) {
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(!z ? wf2Var.a.q : radioButton.f);
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
        accessibilityNodeInfo.setChecked(!z ? wf2Var.a.q : radioButton.f);
        accessibilityNodeInfo.setClassName(!z ? "android.widget.CheckBox" : "android.widget.RadioButton");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L((!this.r || this.s) ? 56.0f : 62.0f), TLObject.FLAG_30));
        if (this.s || !this.r) {
            return;
        }
        Path path = this.F;
        if (path == null) {
            this.F = new Path();
        } else {
            path.rewind();
        }
        float L = k96.a0 ? gl.L(31.0f) : getMeasuredWidth() - gl.L(31.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f = k96.a0 ? -1.0f : 1.0f;
        this.F.moveTo(L, measuredHeight - gl.L(6.0f));
        this.F.lineTo((f * gl.L(6.0f)) + L, measuredHeight);
        this.F.lineTo(L, measuredHeight + gl.L(6.0f));
        if (this.G == null) {
            Paint paint = new Paint(1);
            this.G = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.G.setStrokeCap(Paint.Cap.ROUND);
        }
        this.G.setStrokeWidth(gl.N(1.86f));
        this.G.setColor(bkb.p1(0.3f, bkb.v0(bkb.F6, this.a)));
    }

    public void set(Object obj) {
        boolean z = obj instanceof TLRPC.User;
        jia jiaVar = this.d;
        if (z) {
            jiaVar.setTypeface(gl.o());
            jiaVar.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            jiaVar.setTypeface(gl.o());
            jiaVar.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            jiaVar.setTypeface(null);
            jiaVar.setTranslationX((-gl.L(52.0f)) * (k96.a0 ? -1 : 1));
            jiaVar.l((String) obj, false);
        }
    }

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z && (this.s || !this.r));
    }

    public void setRedCheckbox(boolean z) {
        this.f.b(z ? bkb.mk : bkb.A5, bkb.i7, bkb.B5);
    }

    public void setUser(TLRPC.User user) {
        this.y = user == null ? 0L : user.id;
        pb0 pb0Var = this.b;
        pb0Var.q(user);
        int L = gl.L(20.0f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(user, pb0Var);
        String q = l7c.q(user);
        jia jiaVar = this.d;
        jiaVar.l(b00.e(jiaVar, q, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z = this.r;
        wjb wjbVar = this.a;
        jia jiaVar2 = this.e;
        if (z) {
            setSubtitle(k96.M0(2131743107, null));
            zkb.W(jiaVar2, bkb.q5, wjbVar);
        } else {
            setSubtitle(k96.d0(y6c.t0, user, zArr, null));
            zkb.W(jiaVar2, zArr[0] ? bkb.m5 : bkb.q5, wjbVar);
        }
        int i = this.s ? 0 : 8;
        wf2 wf2Var = this.f;
        wf2Var.setVisibility(i);
        wf2Var.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(bkb.p1(0.3f, bkb.v0(bkb.F6, this.a)));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
