package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.t9;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f6;
import rh.h8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d extends FrameLayout implements k6 {
    public final vh.d a;
    public final f6 b;
    public final f6 c;
    public final t9 d;
    public final Paint e;
    public final rf.m f;
    public final dq h;
    public final dq[] n;

    public d(Context context, t9 t9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new rf.m(new mg.l(this, 19));
        this.h = new dq(R.drawable.filled_gift_sell_24, 0);
        this.n = new dq[1];
        this.d = t9Var;
        setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, 0.0f, TLObject.FLAG_29);
        paint.setColor(t6.x0(null, t6.d6, false));
        vh.d dVar = new vh.d(context, null, true);
        this.a = dVar;
        e6 e6Var = dVar.d;
        e6Var.D = false;
        e6Var.E = true;
        e6Var.F = true;
        e6Var.G = true;
        e6Var.H = false;
        ei0 ei0Var = new ei0(context);
        f6 f6Var = new f6(context, false, false, false);
        this.b = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        a7.Z(f6Var, t6.G6, null);
        f6 f6Var2 = new f6(context, false, false, false);
        this.c = f6Var2;
        f6Var2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        TLRPC.Document document = t9Var.d.sticker;
        if (document != null) {
            ei0Var.g(44, 44, document);
        }
        addView(f6Var, b6.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(f6Var2, b6.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView(ei0Var, b6.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, b6.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j10, boolean z10) {
        String h02 = org.telegram.messenger.i0.h0((int) j10, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) cd.L0(2131750424, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.a.i(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        t9 t9Var = this.d;
        if (t9Var.f != null) {
            this.b.c(cd.a0(null, null, 2131750423, cd.E(r1.current_round, ','), cd.E(t9Var.f.total_rounds, ',')), z10, true);
        }
        String k10 = i0.a.k(t9Var.e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = t9Var.d();
        dq[] dqVarArr = this.n;
        f6 f6Var = this.c;
        if (d == 2 || d == 3) {
            f6Var.c(h8.Z0(false, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131750425, k10)), 0.66f, dqVarArr), z10, true);
            a7.Z(f6Var, t6.q7, null);
        } else {
            f6Var.c(h8.Z0(false, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131750426, k10, Integer.valueOf(t9Var.i))), 0.66f, dqVarArr), z10, true);
            a7.Z(f6Var, t6.G6, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(14.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(zs.c2), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.e.setColor(t6.x0(null, t6.d6, false));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
