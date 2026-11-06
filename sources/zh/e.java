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
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.messenger.s9;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout implements a6 {
    public final fi.d a;
    public final j6 b;
    public final j6 c;
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
        paint.setColor(k6.x0(null, k6.d6, false));
        fi.d dVar = new fi.d(context, null, true);
        this.a = dVar;
        i6 i6Var = dVar.d;
        i6Var.D = false;
        i6Var.E = true;
        i6Var.F = true;
        i6Var.G = true;
        i6Var.H = false;
        ch0 ch0Var = new ch0(context);
        j6 j6Var = new j6(context, false, false, false);
        this.b = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        r6.Z(j6Var, k6.G6, null);
        j6 j6Var2 = new j6(context, false, false, false);
        this.c = j6Var2;
        j6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        TLRPC.Document document = s9Var.d.sticker;
        if (document != null) {
            ch0Var.g(44, 44, document);
        }
        addView(j6Var, ha.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(j6Var2, ha.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView(ch0Var, ha.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, ha.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j3, boolean z9) {
        String h02 = org.telegram.messenger.g0.h0((int) j3, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) hd.M0(2131750414, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.a.i(spannableStringBuilder, z9, true);
    }

    public final void b(boolean z9) {
        s9 s9Var = this.d;
        if (s9Var.f != null) {
            this.b.c(hd.a0(null, null, 2131750413, hd.E(r1.current_round, ','), hd.E(s9Var.f.total_rounds, ',')), z9, true);
        }
        String m10 = jg.g.m(s9Var.e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = s9Var.d();
        wp[] wpVarArr = this.n;
        j6 j6Var = this.c;
        if (d == 2 || d == 3) {
            j6Var.c(dd.a1(false, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750415, m10)), 0.66f, wpVarArr), z9, true);
            r6.Z(j6Var, k6.q7, null);
        } else {
            j6Var.c(dd.a1(false, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750416, m10, Integer.valueOf(s9Var.i))), 0.66f, wpVarArr), z9, true);
            r6.Z(j6Var, k6.G6, null);
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.e.setColor(k6.x0(null, k6.d6, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
