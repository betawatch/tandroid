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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class xxa extends FrameLayout {
    public final vxa a;
    public final wxa b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final pb0 n;
    public final u2b r;
    public final wjb s;
    public rxa w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public xxa(Context context, TLRPC.ChatFull chatFull, wjb wjbVar) {
        super(context);
        this.h = new Paint(1);
        this.n = new pb0((wjb) null);
        this.r = new u2b(null, false);
        this.x = chatFull;
        this.s = wjbVar;
        vxa vxaVar = new vxa(this, context, wjbVar);
        this.a = vxaVar;
        setClipChildren(false);
        boolean z = k96.a0;
        addView(vxaVar, nme.d(46, 46.0f, (!z ? 8388611 : 8388613) | 16, !z ? 12.0f : 16.0f, 0.0f, !z ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout j = de9.j(context, 0);
        wxa wxaVar = new wxa(context);
        this.b = wxaVar;
        kk7.i(wxaVar);
        wxaVar.setTypeface(gl.o());
        wxaVar.setTextSize(16);
        wxaVar.setMaxLines(1);
        wxaVar.setTextColor(-16777216);
        wxaVar.setGravity(k96.a0 ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (k96.a0) {
            j.addView(textView, nme.r(-2, -2, 80));
            j.addView(wxaVar, nme.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            j.addView(wxaVar, nme.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            j.addView(textView, nme.r(-2, -2, 80));
        }
        linearLayout.addView(j, nme.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout j2 = de9.j(context, 0);
        if (k96.a0) {
            j2.addView(textView3, nme.t(-2, -2, 16, 0, 0, 10, 0));
            j2.addView(textView4, nme.r(-2, -2, 16));
            j2.addView(textView2, nme.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            j2.addView(textView2, nme.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            j2.addView(textView4, nme.r(-2, -2, 16));
            j2.addView(textView3, nme.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(j2, nme.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z2 = k96.a0;
        addView(linearLayout, nme.d(-1, -2.0f, 0, !z2 ? 72.0f : 18.0f, 0.0f, !z2 ? 18.0f : 72.0f, 0.0f));
        int i = bkb.i5;
        zkb.W(wxaVar, i, null);
        zkb.X(textView, i, null);
        int i2 = bkb.z6;
        zkb.X(textView2, i2, null);
        zkb.X(textView3, i2, null);
        zkb.X(textView4, i2, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.x(textView4, mutate, i2, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        zkb.x(textView3, mutate2, i2, null, mode);
        fm2 fm2Var = new fm2(null, mutate, 0, gl.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        fm2Var.h = intrinsicWidth;
        fm2Var.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(fm2Var, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(gl.L(2.0f));
        fm2 fm2Var2 = new fm2(null, mutate2, 0, gl.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        fm2Var2.h = intrinsicWidth2;
        fm2Var2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(fm2Var2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(gl.L(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            int v0 = bkb.v0(bkb.c7, this.s);
            Paint paint = this.h;
            paint.setColor(v0);
            if (k96.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gl.L(72.0f), getHeight(), paint);
            } else {
                canvas.drawRect(gl.L(72.0f), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public be0 getImageView() {
        return this.a;
    }

    public rxa getPostInfo() {
        return this.w;
    }

    public u2b getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(nxa nxaVar) {
        TLRPC.User user = nxaVar.a;
        pb0 pb0Var = this.n;
        pb0Var.q(user);
        TLRPC.User user2 = nxaVar.a;
        vxa vxaVar = this.a;
        vxaVar.f(user2, pb0Var);
        vxaVar.setRoundRadius(gl.L(46.0f) >> 1);
        this.b.k(nxaVar.a.first_name);
        this.e.setText(nxaVar.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
