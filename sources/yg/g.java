package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import c8.ha;
import di.d4;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import wg.z0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g extends c implements a6 {
    public int D;
    public final ImageView s;
    public f w;
    public TLRPC.Chat x;
    public boolean y;

    public g(Context context, f6 f6Var) {
        super(context, f6Var);
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = k6.x0(null, k6.Ji, false);
        this.D = x02;
        imageView.setBackground(k6.h0(x02, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        r6.t(imageView, k6.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(hd.M0(2131751599, null));
        boolean z9 = hd.a0;
        addView(imageView, ha.d(48, 50.0f, (z9 ? 3 : 5) | 17, z9 ? 3.0f : 0.0f, 0.0f, z9 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(g0.L(hd.a0 ? 24.0f : 0.0f), 0, g0.L(hd.a0 ? 0.0f : 24.0f), 0);
    }

    @Override // yg.c
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i7, boolean z9, int i10) {
        String M0;
        this.y = z9;
        this.x = chat;
        w8 w8Var = this.b;
        w8Var.q(chat);
        int L = g0.L(20.0f);
        l9 l9Var = this.c;
        l9Var.setRoundRadius(L);
        l9Var.e(chat, w8Var);
        String str = chat.title;
        d4 d4Var = this.d;
        d4Var.k(i6.m(str, d4Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = t3.V(chat);
        if (z9) {
            if (i10 >= 1) {
                M0 = hd.G(i10, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                M0 = hd.M0(V ? 2131751391 : 2131754876, null);
            }
            setSubtitle(M0);
        } else {
            setSubtitle(hd.G(i7, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        r6.Y(this.e, k6.r5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z9) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new z0(3, this, chat));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            int x02 = k6.x0(null, k6.Ji, false);
            ImageView imageView = this.s;
            if (imageView == null || x02 == this.D) {
                return;
            }
            this.D = x02;
            k6.H1(imageView.getBackground(), x02, true);
            imageView.invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
