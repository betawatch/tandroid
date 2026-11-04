package zg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import b8.mf;
import ei.e4;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends c implements z5 {
    public int E;
    public final ImageView s;
    public f w;
    public TLRPC.Chat x;
    public boolean y;

    public g(Context context, e6 e6Var) {
        super(context, e6Var);
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = k6.x0(null, k6.Ji, false);
        this.E = x02;
        imageView.setBackground(k6.h0(x02, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        r6.t(imageView, k6.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(bd.M0(2131751599, null));
        boolean z10 = bd.a0;
        addView(imageView, mf.d(48, 50.0f, (z10 ? 3 : 5) | 17, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(g0.L(bd.a0 ? 24.0f : 0.0f), 0, g0.L(bd.a0 ? 0.0f : 24.0f), 0);
    }

    @Override // zg.c
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i3, boolean z10, int i10) {
        String M0;
        this.y = z10;
        this.x = chat;
        u8 u8Var = this.b;
        u8Var.q(chat);
        int L = g0.L(20.0f);
        k9 k9Var = this.c;
        k9Var.setRoundRadius(L);
        k9Var.e(chat, u8Var);
        String str = chat.title;
        e4 e4Var = this.d;
        e4Var.k(i6.m(str, e4Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = t3.V(chat);
        if (z10) {
            if (i10 >= 1) {
                M0 = bd.G(i10, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                M0 = bd.M0(V ? 2131751391 : 2131754876, null);
            }
            setSubtitle(M0);
        } else {
            setSubtitle(bd.G(i3, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        r6.Y(this.e, k6.r5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new org.telegram.ui.web.d(9, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.x;
    }

    @Override // zg.c, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.s.measure(View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(f fVar) {
        this.w = fVar;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = k6.x0(null, k6.Ji, false);
            ImageView imageView = this.s;
            if (imageView == null || x02 == this.E) {
                return;
            }
            this.E = x02;
            k6.H1(imageView.getBackground(), x02, true);
            imageView.invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
