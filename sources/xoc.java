// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class xoc extends FrameLayout {
    public final wjb a;
    public final FrameLayout b;
    public final pb0 c;
    public final be0 d;
    public ShapeDrawable e;
    public final TextView f;
    public final woc h;
    public final ImageView n;
    public TLRPC.User r;
    public String s;

    public xoc(wjb wjbVar, Context context, Runnable runnable, Runnable runnable2) {
        super(context);
        this.c = new pb0((wjb) null);
        this.a = wjbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setDuplicateParentStateEnabled(true);
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        addView(frameLayout, nme.c(-1.0f, -1));
        int i = bkb.Z6;
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(i, wjbVar);
        int i2 = bkb.h6;
        ff0 Z = bkb.Z(v0, bkb.v(v02, bkb.v0(i2, wjbVar)), gl.L(32.0f), gl.L(32.0f));
        vkb M = zkb.M(i);
        vkb p = zkb.p(i, i2);
        frameLayout.setBackground(Z);
        zkb.j(frameLayout, Z, M, p, wjbVar);
        ote.b(this, 0.02f, 1.2f);
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.setRoundRadius(gl.L(18.0f));
        frameLayout.addView(be0Var, nme.d(34, 34.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gl.o());
        frameLayout.addView(textView, nme.d(-1, -2.0f, 51, 60.0f, 7.0f, 52.0f, 0.0f));
        woc wocVar = new woc(this, context);
        this.h = wocVar;
        frameLayout.addView(wocVar, nme.d(-1, -2.0f, 51, 60.0f, 26.0f, 52.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg2_help);
        zkb.s(imageView, bkb.C6, wjbVar, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.9f);
        imageView.setScaleY(0.9f);
        frameLayout.addView(imageView, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        setOnClickListener(new ee((Object) this, (Object) wjbVar, (Object) runnable, (Object) runnable2, (byte) 19));
    }

    public final void a(String str, TLRPC.User user) {
        TLRPC.User user2 = this.r;
        boolean z = (user2 == null ? 0L : user2.id) != (user != null ? user.id : 0L);
        this.r = user;
        this.s = str;
        setClickable(!TextUtils.isEmpty(str));
        TLRPC.User user3 = this.r;
        TextView textView = this.f;
        ImageView imageView = this.n;
        woc wocVar = this.h;
        be0 be0Var = this.d;
        if (user3 != null) {
            setClickable(true);
            setVisibility(0);
            TLRPC.User user4 = this.r;
            pb0 pb0Var = this.c;
            pb0Var.q(user4);
            be0Var.f(this.r, pb0Var);
            textView.setText(l7c.q(this.r));
            if (TextUtils.isEmpty(str)) {
                wocVar.c(null, z);
                imageView.setVisibility(8);
                return;
            } else {
                wocVar.c(str, z);
                imageView.setVisibility(0);
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            setClickable(false);
            setVisibility(8);
            wocVar.c(null, true);
            return;
        }
        setClickable(false);
        setVisibility(0);
        if (this.e == null) {
            ShapeDrawable K = bkb.K(gl.L(34.0f), -1);
            this.e = K;
            zkb.x(be0Var, K, bkb.Ei, this.a, PorterDuff.Mode.SRC_IN);
        }
        be0Var.setImageDrawable(new fm2(this.e, getContext().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
        textView.setText(k96.M0(2131742855, null));
        wocVar.c(str, z);
        imageView.setVisibility(8);
    }

    public float getContentBottom() {
        FrameLayout frameLayout = this.b;
        return (frameLayout.getScaleY() * (frameLayout.getHeight() - frameLayout.getPivotY())) + frameLayout.getPivotY() + frameLayout.getY();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float measuredHeight = getMeasuredHeight();
        FrameLayout frameLayout = this.b;
        int round = Math.round((measuredHeight - (frameLayout.getScaleY() * frameLayout.getMeasuredHeight())) / 2.0f);
        frameLayout.layout(0, round, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight() + round);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        int ceil = ((int) Math.ceil(r5.a())) + 1 + layoutParams.leftMargin + layoutParams.rightMargin;
        setMeasuredDimension(View.resolveSize(Math.max(getMeasuredWidth(), ceil), i), getMeasuredHeight());
        int max = Math.max(getMeasuredWidth(), ceil);
        float measuredWidth = getMeasuredWidth() / max;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        FrameLayout frameLayout = this.b;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        frameLayout.setScaleX(measuredWidth);
        frameLayout.setScaleY(measuredWidth);
    }
}
