package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zm0 extends View implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public int E;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.qz0 f;
    public final org.telegram.ui.ActionBar.y2 h;
    public final Paint n;
    public org.telegram.ui.Components.qz0 r;
    public int s;
    public boolean w;
    public on0 x;
    public on0 y;

    public zm0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i11;
        this.n = new Paint(1);
        this.s = -1;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        this.a = i10;
        boolean z10 = j10 < 0;
        this.b = z10;
        boolean z11 = z10 && !org.telegram.messenger.w3.V(L0);
        this.c = z11;
        this.d = p6Var;
        Drawable f7 = i0.a.f(context, R.drawable.menu_edit_appearance);
        this.e = f7;
        org.telegram.ui.ActionBar.a7.y(this, f7, org.telegram.ui.ActionBar.t6.q6, p6Var, PorterDuff.Mode.SRC_IN);
        String L02 = org.telegram.messenger.cd.L0(z10 ? z11 ? 2131752546 : 2131752551 : 2131752530, null);
        if (z10 && !z11 && org.telegram.messenger.vp.r1(i10).f7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.lp lpVar = r12.r4;
            int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (lpVar != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, lpVar.e(false));
                int max = Math.max(0, r12.r4.e(false));
                int min2 = Math.min(min, r12.r4.f());
                int max2 = Math.max(max, r12.r4.f());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, r12.r5);
            int min4 = Math.min(i11, r12.r5);
            org.telegram.messenger.lp lpVar2 = r12.s4;
            if (lpVar2 != null) {
                int min5 = Math.min(min3, lpVar2.e(false));
                int max3 = Math.max(min4, r12.s4.e(false));
                min3 = Math.min(min5, r12.s4.f());
                min4 = Math.max(max3, r12.s4.f());
            }
            int min6 = Math.min(min3, r12.s5);
            int max4 = Math.max(min4, r12.s5);
            int min7 = Math.min(min6, r12.t5);
            int max5 = Math.max(max4, r12.t5);
            int min8 = Math.min(min7, r12.u5);
            int max6 = Math.max(max5, r12.u5);
            int min9 = Math.min(min8, r12.v5);
            int max7 = Math.max(max6, r12.v5);
            int i13 = L0 != null ? L0.level : 0;
            if (i13 < max7) {
                this.h = new org.telegram.ui.ActionBar.y2(Math.max(i13, min9), context, p6Var, true);
            }
        }
        setContentDescription(L02);
        this.f = new org.telegram.ui.Components.qz0(L02, 16.0f, null);
        updateColors();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(64.0f) / 2;
        if (org.telegram.messenger.cd.X) {
            L = getMeasuredWidth() - L;
        }
        Drawable drawable = this.e;
        rf.o.d(drawable, L, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(171.0f);
        org.telegram.ui.ActionBar.y2 y2Var = this.h;
        int L2 = y2Var != null ? org.telegram.messenger.i0.L(8.0f) + y2Var.getIntrinsicWidth() : 0;
        org.telegram.ui.Components.qz0 qz0Var = this.f;
        qz0Var.p = measuredWidth - L2;
        float measuredWidth2 = org.telegram.messenger.cd.X ? (getMeasuredWidth() - qz0Var.k()) - org.telegram.messenger.i0.L(71.0f) : org.telegram.messenger.i0.L(71.0f);
        qz0Var.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (y2Var != null) {
            int k10 = (int) (qz0Var.k() + measuredWidth2 + org.telegram.messenger.i0.L(6.0f));
            y2Var.setBounds(k10, 0, k10, getHeight());
            y2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        boolean z10 = this.c;
        if (z10 && this.y != null) {
            int L3 = org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(58.0f) : getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f);
            this.y.setBounds(L3 - org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.z20.y(11.0f, getMeasuredHeight(), 2), L3, (org.telegram.messenger.i0.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(org.telegram.messenger.i0.N(3.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            int L4 = org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(58.0f) : getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f);
            this.y.setBounds(L4 - org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.z20.y(11.0f, getMeasuredHeight(), 2), L4, (org.telegram.messenger.i0.L(11.0f) + getMeasuredHeight()) / 2);
            on0 on0Var = this.y;
            float N = org.telegram.messenger.i0.N(3.0f);
            int i10 = org.telegram.ui.ActionBar.t6.d6;
            on0Var.f(N, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            this.y.draw(canvas);
            int L5 = L4 - org.telegram.messenger.i0.L(18.0f);
            this.x.setBounds(L5 - org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.z20.y(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.i0.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(org.telegram.messenger.i0.N(3.0f), org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            this.x.draw(canvas);
        } else if (this.r != null && !z10) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - org.telegram.messenger.i0.L(116.0f)) - Math.min(qz0Var.k() + (y2Var == null ? 0 : org.telegram.messenger.i0.L(12.0f) + y2Var.getIntrinsicWidth()), getMeasuredWidth() - org.telegram.messenger.i0.L(164.0f)));
            int min = (int) Math.min(this.r.k(), measuredWidth3);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(15.0f) : org.telegram.messenger.m5.z(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - org.telegram.messenger.i0.L(22.0f)) / 2.0f, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(33.0f) + min : getMeasuredWidth() - org.telegram.messenger.i0.L(15.0f), (org.telegram.messenger.i0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.n);
            org.telegram.ui.Components.qz0 qz0Var2 = this.r;
            qz0Var2.p = measuredWidth3;
            qz0Var2.e(canvas, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(24.0f) : org.telegram.messenger.m5.z(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            Paint d = p6Var != null ? p6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(71.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(71.0f) : 0), getMeasuredHeight() - 1, d);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        on0 on0Var;
        int w02;
        ArrayList<Integer> arrayList;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        String trim = str == null ? "" : str.trim();
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        this.r = new org.telegram.ui.Components.qz0(org.telegram.messenger.k6.m(trim, org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.i0.o());
        on0 on0Var2 = this.x;
        if (on0Var2 != null) {
            on0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i10 = this.a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i11 = on0.j;
            int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.x = new on0(i12, i12, i12, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.h20.l(user) >= 0) {
                on0Var = on0.c(i10, org.telegram.messenger.h20.l(user));
                on0Var.a = org.telegram.messenger.i0.L(11.0f);
                on0Var.d();
            } else {
                on0Var = null;
            }
            this.x = on0Var;
        }
        on0 on0Var3 = this.x;
        if (on0Var3 != null) {
            on0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
            int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.n(i13);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, i13));
            on0 on0Var4 = new on0(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
            on0Var4.a = org.telegram.messenger.i0.L(11.0f);
            on0Var4.d();
            this.y = on0Var4;
            on0Var4.e(this);
            return;
        }
        int e = org.telegram.messenger.h20.e(user);
        if (e < 7) {
            int i14 = org.telegram.ui.ActionBar.t6.r8[e];
            this.s = i14;
            w02 = org.telegram.ui.ActionBar.t6.w0(i14, p6Var);
        } else {
            org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).r4;
            org.telegram.messenger.kp d = lpVar != null ? lpVar.d(e) : null;
            if (d != null) {
                this.s = -1;
                w02 = d.f();
            } else {
                int i15 = org.telegram.ui.ActionBar.t6.r8[0];
                this.s = i15;
                w02 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
            }
        }
        this.r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
        on0 a10 = on0.a(i10, e);
        a10.a = org.telegram.messenger.i0.L(11.0f);
        a10.d();
        this.y = a10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        Paint paint;
        int i10;
        boolean z10 = this.b;
        int i11 = z10 ? org.telegram.ui.ActionBar.t6.m6 : org.telegram.ui.ActionBar.t6.q6;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        if (!this.D || this.E != w02) {
            this.D = true;
            this.E = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        this.f.n(org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.G6 : org.telegram.ui.ActionBar.t6.q6, p6Var));
        if (this.r == null || (paint = this.n) == null || (i10 = this.s) == -1) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.r.n(w03);
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w03));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
