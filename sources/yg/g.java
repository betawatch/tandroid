package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import c8.ma;
import fi.u3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
import wg.y0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g extends c implements b6 {
    public int E;
    public final ImageView s;
    public f w;
    public TLRPC.Chat x;
    public boolean y;

    public g(Context context, h6 h6Var) {
        super(context, h6Var);
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = m6.x0(null, m6.Mi, false);
        this.E = x02;
        imageView.setBackground(m6.h0(x02, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        t6.s(imageView, m6.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(hd.N0(2131751586, null));
        boolean z10 = hd.a0;
        addView(imageView, ma.d(48, 50.0f, (z10 ? 3 : 5) | 17, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(g0.L(hd.a0 ? 24.0f : 0.0f), 0, g0.L(hd.a0 ? 0.0f : 24.0f), 0);
    }

    @Override // yg.c
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i7, boolean z10, int i10) {
        String N0;
        this.y = z10;
        this.x = chat;
        b9 b9Var = this.b;
        b9Var.q(chat);
        int L = g0.L(20.0f);
        q9 q9Var = this.c;
        q9Var.setRoundRadius(L);
        q9Var.f(chat, b9Var);
        String str = chat.title;
        u3 u3Var = this.d;
        u3Var.k(j6.m(str, u3Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = v3.V(chat);
        if (z10) {
            if (i10 >= 1) {
                N0 = hd.G(i10, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                N0 = hd.N0(V ? 2131751378 : 2131754876, null);
            }
            setSubtitle(N0);
        } else {
            setSubtitle(hd.G(i7, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        t6.X(this.e, m6.r5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new y0(3, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override // yg.c, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(f fVar) {
        this.w = fVar;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int x02 = m6.x0(null, m6.Mi, false);
            ImageView imageView = this.s;
            if (imageView == null || x02 == this.E) {
                return;
            }
            this.E = x02;
            m6.H1(imageView.getBackground(), x02, true);
            imageView.invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
