package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import bi.dd;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.messenger.s9;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout implements c6 {
    public final fi.d a;
    public final i6 b;
    public final i6 c;
    public final s9 d;
    public final Paint e;
    public final bg.q f;
    public final wp h;
    public final wp[] n;

    public e(Context context, s9 s9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new bg.q(new u5.e(this, 12));
        this.h = new wp(R.drawable.filled_gift_sell_24, 0);
        this.n = new wp[1];
        this.d = s9Var;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, 0.0f, TLObject.FLAG_29);
        paint.setColor(m6.x0(null, m6.d6, false));
        fi.d dVar = new fi.d(context, null, true);
        this.a = dVar;
        h6 h6Var = dVar.d;
        h6Var.D = false;
        h6Var.E = true;
        h6Var.F = true;
        h6Var.G = true;
        h6Var.H = false;
        ch0 ch0Var = new ch0(context);
        i6 i6Var = new i6(context, false, false, false);
        this.b = i6Var;
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        t6.Y(i6Var, m6.G6, null);
        i6 i6Var2 = new i6(context, false, false, false);
        this.c = i6Var2;
        i6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        TLRPC.Document document = s9Var.d.sticker;
        if (document != null) {
            ch0Var.g(44, 44, document);
        }
        addView(i6Var, ha.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(i6Var2, ha.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView(ch0Var, ha.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, ha.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j3, boolean z9) {
        String h02 = org.telegram.messenger.g0.h0((int) j3, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) id.M0(2131750415, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.a.i(spannableStringBuilder, z9, true);
    }

    public final void b(boolean z9) {
        s9 s9Var = this.d;
        if (s9Var.f != null) {
            this.b.c(id.a0(null, null, 2131750414, id.E(r1.current_round, ','), id.E(s9Var.f.total_rounds, ',')), z9, true);
        }
        String m10 = jg.g.m(s9Var.e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = s9Var.d();
        wp[] wpVarArr = this.n;
        i6 i6Var = this.c;
        if (d == 2 || d == 3) {
            i6Var.c(dd.a1(false, org.telegram.messenger.g0.X2(id.a0(null, null, 2131750416, m10)), 0.66f, wpVarArr), z9, true);
            t6.Y(i6Var, m6.q7, null);
        } else {
            i6Var.c(dd.a1(false, org.telegram.messenger.g0.X2(id.a0(null, null, 2131750417, m10, Integer.valueOf(s9Var.i))), 0.66f, wpVarArr), z9, true);
            t6.Y(i6Var, m6.G6, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(qs.c2), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.e.setColor(m6.x0(null, m6.d6, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
