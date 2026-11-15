package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import c8.ja;
import fi.w3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int x02 = j6.x0(null, j6.Mi, false);
        this.E = x02;
        imageView.setBackground(j6.h0(x02, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        q6.s(imageView, j6.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(hd.M0(2131751598, null));
        boolean z10 = hd.a0;
        addView(imageView, ja.d(48, 50.0f, (z10 ? 3 : 5) | 17, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(g0.L(hd.a0 ? 24.0f : 0.0f), 0, g0.L(hd.a0 ? 0.0f : 24.0f), 0);
    }

    @Override // yg.c
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i7, boolean z10, int i10) {
        String M0;
        this.y = z10;
        this.x = chat;
        t8 t8Var = this.b;
        t8Var.q(chat);
        int L = g0.L(20.0f);
        i9 i9Var = this.c;
        i9Var.setRoundRadius(L);
        i9Var.f(chat, t8Var);
        String str = chat.title;
        w3 w3Var = this.d;
        w3Var.k(org.telegram.messenger.j6.m(str, w3Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = t3.V(chat);
        if (z10) {
            if (i10 >= 1) {
                M0 = hd.G(i10, V ? "Subscribers" : "Members", new Object[0]);
            } else {
                M0 = hd.M0(V ? 2131751390 : 2131754876, null);
            }
            setSubtitle(M0);
        } else {
            setSubtitle(hd.G(i7, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
        }
        q6.X(this.e, j6.r5, this.a);
        setDivider(true);
        ImageView imageView = this.s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new sc1(10, this, chat));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = j6.x0(null, j6.Mi, false);
            ImageView imageView = this.s;
            if (imageView == null || x02 == this.E) {
                return;
            }
            this.E = x02;
            j6.H1(imageView.getBackground(), x02, true);
            imageView.invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
