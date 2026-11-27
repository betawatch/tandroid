// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class z1b extends FrameLayout {
    public final x1b a;
    public final y1b b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final rb0 n;
    public final q6b r;
    public final vnb s;
    public t1b w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public z1b(Context context, TLRPC.ChatFull chatFull, vnb vnbVar) {
        super(context);
        this.h = new Paint(1);
        this.n = new rb0((vnb) null);
        this.r = new q6b(null, false);
        this.x = chatFull;
        this.s = vnbVar;
        x1b x1bVar = new x1b(this, context, vnbVar);
        this.a = x1bVar;
        setClipChildren(false);
        boolean z = ob6.a0;
        addView(x1bVar, tre.d(46, 46.0f, (!z ? 8388611 : 8388613) | 16, !z ? 12.0f : 16.0f, 0.0f, !z ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout j = uh9.j(context, 0);
        y1b y1bVar = new y1b(context);
        this.b = y1bVar;
        jn7.i(y1bVar);
        y1bVar.setTypeface(hl.o());
        y1bVar.setTextSize(16);
        y1bVar.setMaxLines(1);
        y1bVar.setTextColor(-16777216);
        y1bVar.setGravity(ob6.a0 ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (ob6.a0) {
            j.addView(textView, tre.r(-2, -2, 80));
            j.addView(y1bVar, tre.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            j.addView(y1bVar, tre.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            j.addView(textView, tre.r(-2, -2, 80));
        }
        linearLayout.addView(j, tre.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-16777216);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(-16777216);
        textView3.setGravity(16);
        TextView textView4 = new TextView(context);
        this.f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout j2 = uh9.j(context, 0);
        if (ob6.a0) {
            j2.addView(textView3, tre.t(-2, -2, 16, 0, 0, 10, 0));
            j2.addView(textView4, tre.r(-2, -2, 16));
            j2.addView(textView2, tre.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            j2.addView(textView2, tre.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            j2.addView(textView4, tre.r(-2, -2, 16));
            j2.addView(textView3, tre.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(j2, tre.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z2 = ob6.a0;
        addView(linearLayout, tre.d(-1, -2.0f, 0, !z2 ? 72.0f : 18.0f, 0.0f, !z2 ? 18.0f : 72.0f, 0.0f));
        int i = aob.j5;
        yob.W(y1bVar, i, null);
        yob.X(textView, i, null);
        int i2 = aob.A6;
        yob.X(textView2, i2, null);
        yob.X(textView3, i2, null);
        yob.X(textView4, i2, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.x(textView4, mutate, i2, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        yob.x(textView3, mutate2, i2, null, mode);
        zm2 zm2Var = new zm2(null, mutate, 0, hl.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        zm2Var.h = intrinsicWidth;
        zm2Var.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(zm2Var, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(hl.L(2.0f));
        zm2 zm2Var2 = new zm2(null, mutate2, 0, hl.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        zm2Var2.h = intrinsicWidth2;
        zm2Var2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(zm2Var2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(hl.L(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            int v0 = aob.v0(aob.d7, this.s);
            Paint paint = this.h;
            paint.setColor(v0);
            if (ob6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - hl.L(72.0f), getHeight(), paint);
            } else {
                canvas.drawRect(hl.L(72.0f), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public de0 getImageView() {
        return this.a;
    }

    public t1b getPostInfo() {
        return this.w;
    }

    public q6b getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(p1b p1bVar) {
        TLRPC.User user = p1bVar.a;
        rb0 rb0Var = this.n;
        rb0Var.q(user);
        TLRPC.User user2 = p1bVar.a;
        x1b x1bVar = this.a;
        x1bVar.f(user2, rb0Var);
        x1bVar.setRoundRadius(hl.L(46.0f) >> 1);
        this.b.k(p1bVar.a.first_name);
        this.e.setText(p1bVar.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
