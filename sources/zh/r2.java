package zh;

import android.content.Context;
import android.text.SpannableString;
import android.widget.LinearLayout;
import bi.dd;
import bi.ea;
import c8.ha;
import org.telegram.messenger.c20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r2 extends LinearLayout implements ls {
    public final int a;
    public final i6 b;
    public final i6 c;
    public final wp[] d;
    public final wp[] e;
    public SpannableString f;
    public c20 h;
    public long n;

    public r2(int i7, Context context, h6 h6Var) {
        super(context);
        this.d = new wp[1];
        this.e = new wp[1];
        this.n = -1L;
        this.a = i7;
        setOrientation(1);
        setGravity(21);
        int L = org.telegram.messenger.g0.L(6.0f);
        setPadding(org.telegram.messenger.g0.L(13.0f) + L, L, org.telegram.messenger.g0.L(14.0f) + L, L);
        i6 a10 = a(context, h6Var);
        this.b = a10;
        addView(a10, ha.r(-2, 18, 5));
        i6 a11 = a(context, h6Var);
        this.c = a11;
        addView(a11, ha.r(-2, 18, 5));
        b(false);
    }

    public static i6 a(Context context, h6 h6Var) {
        i6 i6Var = new i6(context, false, true, false);
        i6Var.n = true;
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setGravity(5);
        t6.Y(i6Var, m6.G6, h6Var);
        return i6Var;
    }

    public final void b(boolean z9) {
        int i7 = this.a;
        ea y10 = ea.y(i7, false);
        ea y11 = ea.y(i7, true);
        long j3 = y10.p().amount;
        cg.a s5 = y11.s();
        boolean z10 = y10.e;
        i6 i6Var = this.b;
        i6 i6Var2 = this.c;
        if (!z10 || !y11.e) {
            if (this.f == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f = spannableString;
                spannableString.setSpan(new b80(org.telegram.messenger.g0.L(48.0f), i6Var), 0, 1, 33);
            }
            i6Var.c(this.f, false, true);
            i6Var2.setVisibility(8);
            this.n = -1L;
            return;
        }
        i6Var.c(dd.a1(false, jg.g.m(j3, ' ', new StringBuilder("⭐️")), 0.7f, this.d), z9, true);
        if (s5.k()) {
            i6Var2.setVisibility(8);
        } else {
            i6Var2.setVisibility(0);
            String str = "⭐️" + s5.d();
            wp[] wpVarArr = this.e;
            i6Var2.c(dd.a1(true, str, 0.7f, wpVarArr), z9, true);
            wp wpVar = wpVarArr[0];
            if (wpVar != null) {
                wpVar.a(m6.Wl);
            }
        }
        this.n = j3;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.y3) {
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        qs.f(this.a).b(this, qs.y3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.a).n(this, qs.y3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        c20 c20Var = this.h;
        if (c20Var == null || i7 == i11) {
            return;
        }
        c20Var.a(Integer.valueOf(i7));
    }

    public void setOnWidthChanged(c20 c20Var) {
        this.h = c20Var;
    }
}
