package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import c8.ha;
import di.e4;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
import wg.a1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g extends c implements c6 {
    public int D;
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
        int x02 = m6.x0(null, m6.Ji, false);
        this.D = x02;
        imageView.setBackground(m6.h0(x02, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        t6.s(imageView, m6.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(id.M0(2131751598, null));
        boolean z9 = id.a0;
        addView(imageView, ha.d(48, 50.0f, (z9 ? 3 : 5) | 17, z9 ? 3.0f : 0.0f, 0.0f, z9 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(g0.L(id.a0 ? 24.0f : 0.0f), 0, g0.L(id.a0 ? 0.0f : 24.0f), 0);
    }

    @Override // yg.c
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i7, boolean z9, int i10) {
        String M0;
        this.y = z9;
        this.x = chat;
        v8 v8Var = this.b;
        v8Var.q(chat);
        int L = g0.L(20.0f);
        k9 k9Var = this.c;
        k9Var.setRoundRadius(L);
        k9Var.e(chat, v8Var);
        String str = chat.title;
        e4 e4Var = this.d;
        e4Var.k(i6.m(str, e4Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = t3.V(chat);
        if (z9) {
            if (i10 >= 1) {
                M0 = id.G(i10, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                M0 = id.M0(V ? 2131751390 : 2131754876, null);
            }
            setSubtitle(M0);
        } else {
            setSubtitle(id.G(i7, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        t6.X(this.e, m6.r5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z9) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new a1(2, this, chat));
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int x02 = m6.x0(null, m6.Ji, false);
            ImageView imageView = this.s;
            if (imageView == null || x02 == this.D) {
                return;
            }
            this.D = x02;
            m6.H1(imageView.getBackground(), x02, true);
            imageView.invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
