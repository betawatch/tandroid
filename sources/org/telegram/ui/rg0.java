package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rg0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.u8 d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.zz n;
    public boolean r;
    public w71 s;
    public int w;

    public rg0(Context context, int i10, org.telegram.messenger.jj jjVar, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i10;
        boolean z10 = jjVar.h4() || org.telegram.messenger.jj.R4(jjVar.k);
        this.h = z10;
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.n = zzVar;
        zzVar.e(org.telegram.ui.ActionBar.t6.G8, org.telegram.ui.ActionBar.t6.i6, -1);
        zzVar.setViewType(13);
        zzVar.setIsSingleCell(false);
        addView(zzVar, w7.b6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var;
        u5Var.setTextSize(16);
        u5Var.setEllipsizeByGradient(true);
        u5Var.setRightPadding(org.telegram.messenger.i0.L(62.0f));
        addView(u5Var, w7.b6.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.d = u8Var;
        u8Var.setStyle(11);
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(22.0f));
        addView(u8Var, w7.b6.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = jjVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.vp.r1(i10).i1(org.telegram.messenger.jj.B0(jjVar.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z10 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        u8Var.setAlpha(0.0f);
        u5Var.setAlpha(0.0f);
        TLRPC.Peer peer = jjVar.k.from_id;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new org.telegram.ui.Components.o2(this, peer != null ? peer.user_id : 0L, i10, chat));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false);
        this.w = x02;
        setBackground(org.telegram.ui.ActionBar.t6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.tk0 a() {
        w71 w71Var = this.s;
        if (w71Var != null) {
            return w71Var;
        }
        w71 w71Var2 = new w71(8, getContext(), null);
        this.s = w71Var2;
        getContext();
        w71Var2.setLayoutManager(new s4.a0());
        int i10 = 6;
        this.s.i(new mg.u1(this, i10));
        this.s.setAdapter(new kg.f(this, i10));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.u8 u8Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i10 = 0;
        while (true) {
            u8Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f;
            if (i10 < size) {
                u8Var.b(i10, i11, (TLObject) arrayList.get(i10));
            } else {
                u8Var.b(i10, i11, null);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            u8Var.setTranslationX(org.telegram.messenger.i0.L(24.0f));
        } else if (arrayList.size() == 2) {
            u8Var.setTranslationX(org.telegram.messenger.i0.L(12.0f));
        } else {
            u8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.i0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        u5Var.setRightPadding(L);
        u8Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            u5Var.l(org.telegram.messenger.i5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            u5Var.l(org.telegram.messenger.cd.L0(2131748140, null), false);
        } else {
            u5Var.l(org.telegram.messenger.cd.G(arrayList2.size(), this.h ? "MessagePlayed" : "MessageSeen", new Object[0]), false);
        }
        u5Var.animate().alpha(1.0f).setDuration(220L).start();
        u8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.zz zzVar = this.n;
        zzVar.animate().alpha(0.0f).setDuration(220L).setListener(new eg.m(zzVar)).start();
        w71 w71Var = this.s;
        if (w71Var != null) {
            w71Var.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        org.telegram.ui.Components.zz zzVar = this.n;
        boolean z10 = zzVar.getVisibility() == 0;
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        u5Var.setVisibility(8);
        if (z10) {
            zzVar.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            zzVar.getLayoutParams().width = getMeasuredWidth();
            zzVar.setVisibility(0);
        }
        u5Var.setVisibility(0);
        u5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.i0.L(40.0f);
        this.r = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false);
            if (getBackground() != null && x02 != this.w) {
                this.w = x02;
                org.telegram.ui.ActionBar.t6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
