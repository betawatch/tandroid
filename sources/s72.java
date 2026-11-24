// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s72 extends gf0 implements tjb {
    public int E;
    public final ImageView s;
    public r72 w;
    public TLRPC.Chat x;
    public boolean y;

    public s72(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.d.setTypeface(gl.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w0 = bkb.w0(null, bkb.Li, false);
        this.E = w0;
        imageView.setBackground(bkb.f0(w0, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        zkb.s(imageView, bkb.l6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(k96.M0(2131751586, null));
        boolean z = k96.a0;
        addView(imageView, nme.d(48, 50.0f, (z ? 3 : 5) | 17, z ? 3.0f : 0.0f, 0.0f, z ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(gl.L(k96.a0 ? 24.0f : 0.0f), 0, gl.L(k96.a0 ? 0.0f : 24.0f), 0);
    }

    public final void f(TLRPC.Chat chat, int i, boolean z, int i2) {
        String M0;
        this.y = z;
        this.x = chat;
        pb0 pb0Var = this.b;
        pb0Var.p(chat);
        int L = gl.L(20.0f);
        be0 be0Var = this.c;
        be0Var.setRoundRadius(L);
        be0Var.f(chat, pb0Var);
        String str = chat.title;
        df0 df0Var = this.d;
        df0Var.k(vu3.m(str, df0Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = hc2.V(chat);
        if (z) {
            if (i2 >= 1) {
                M0 = k96.G(i2, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                M0 = k96.M0(V ? 2131751378 : 2131754876, null);
            }
            setSubtitle(M0);
        } else {
            setSubtitle(k96.G(i, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        zkb.W(this.e, bkb.q5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new kb1((Object) this, (Object) chat, (byte) 12));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override // gf0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(r72 r72Var) {
        this.w = r72Var;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int w0 = bkb.w0(null, bkb.Li, false);
            ImageView imageView = this.s;
            if (imageView == null || w0 == this.E) {
                return;
            }
            this.E = w0;
            bkb.F1(imageView.getBackground(), w0, true);
            imageView.invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
