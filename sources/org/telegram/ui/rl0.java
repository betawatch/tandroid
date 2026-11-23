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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class rl0 extends View implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public int F;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.xy0 f;
    public final org.telegram.ui.ActionBar.v2 h;
    public final Paint n;
    public org.telegram.ui.Components.xy0 r;
    public int s;
    public boolean w;
    public gm0 x;
    public gm0 y;

    public rl0(int i7, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i10;
        this.n = new Paint(1);
        this.s = -1;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        this.a = i7;
        boolean z10 = j3 < 0;
        this.b = z10;
        boolean z11 = z10 && !org.telegram.messenger.v3.V(O0);
        this.c = z11;
        this.d = h6Var;
        Drawable g10 = i5.c.g(context, R.drawable.menu_edit_appearance);
        this.e = g10;
        org.telegram.ui.ActionBar.t6.x(this, g10, org.telegram.ui.ActionBar.m6.q6, h6Var, PorterDuff.Mode.SRC_IN);
        String N0 = org.telegram.messenger.hd.N0(z10 ? z11 ? 2131752534 : 2131752539 : 2131752518, null);
        if (z10 && !z11 && org.telegram.messenger.np.u1(i7).h7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.dp dpVar = u12.t4;
            int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (dpVar != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, dpVar.e(false));
                int max = Math.max(0, u12.t4.e(false));
                int min2 = Math.min(min, u12.t4.f());
                int max2 = Math.max(max, u12.t4.f());
                i11 = min2;
                i10 = max2;
            } else {
                i10 = 0;
            }
            int min3 = Math.min(i11, u12.t5);
            int min4 = Math.min(i10, u12.t5);
            org.telegram.messenger.dp dpVar2 = u12.u4;
            if (dpVar2 != null) {
                int min5 = Math.min(min3, dpVar2.e(false));
                int max3 = Math.max(min4, u12.u4.e(false));
                min3 = Math.min(min5, u12.u4.f());
                min4 = Math.max(max3, u12.u4.f());
            }
            int min6 = Math.min(min3, u12.u5);
            int max4 = Math.max(min4, u12.u5);
            int min7 = Math.min(min6, u12.v5);
            int max5 = Math.max(max4, u12.v5);
            int min8 = Math.min(min7, u12.w5);
            int max6 = Math.max(max5, u12.w5);
            int min9 = Math.min(min8, u12.x5);
            int max7 = Math.max(max6, u12.x5);
            int i12 = O0 != null ? O0.level : 0;
            if (i12 < max7) {
                this.h = new org.telegram.ui.ActionBar.v2(Math.max(i12, min9), context, h6Var, true);
            }
        }
        setContentDescription(N0);
        this.f = new org.telegram.ui.Components.xy0(N0, 16.0f, null);
        updateColors();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(64.0f) / 2;
        if (org.telegram.messenger.hd.a0) {
            L = getMeasuredWidth() - L;
        }
        Drawable drawable = this.e;
        bg.t.d(drawable, L, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(171.0f);
        org.telegram.ui.ActionBar.v2 v2Var = this.h;
        int L2 = v2Var != null ? org.telegram.messenger.g0.L(8.0f) + v2Var.getIntrinsicWidth() : 0;
        org.telegram.ui.Components.xy0 xy0Var = this.f;
        xy0Var.p = measuredWidth - L2;
        float measuredWidth2 = org.telegram.messenger.hd.a0 ? (getMeasuredWidth() - xy0Var.k()) - org.telegram.messenger.g0.L(71.0f) : org.telegram.messenger.g0.L(71.0f);
        xy0Var.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (v2Var != null) {
            int k10 = (int) (xy0Var.k() + measuredWidth2 + org.telegram.messenger.g0.L(6.0f));
            v2Var.setBounds(k10, 0, k10, getHeight());
            v2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        boolean z10 = this.c;
        if (z10 && this.y != null) {
            int L3 = org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(58.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            this.y.setBounds(L3 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.o10.z(11.0f, getMeasuredHeight(), 2), L3, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            int L4 = org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(58.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            this.y.setBounds(L4 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.o10.z(11.0f, getMeasuredHeight(), 2), L4, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            gm0 gm0Var = this.y;
            float N = org.telegram.messenger.g0.N(3.0f);
            int i7 = org.telegram.ui.ActionBar.m6.d6;
            gm0Var.f(N, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            this.y.draw(canvas);
            int L5 = L4 - org.telegram.messenger.g0.L(18.0f);
            this.x.setBounds(L5 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.o10.z(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            this.x.draw(canvas);
        } else if (this.r != null && !z10) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f)) - Math.min(xy0Var.k() + (v2Var == null ? 0 : org.telegram.messenger.g0.L(12.0f) + v2Var.getIntrinsicWidth()), getMeasuredWidth() - org.telegram.messenger.g0.L(164.0f)));
            int min = (int) Math.min(this.r.k(), measuredWidth3);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(15.0f) : org.telegram.messenger.f3.z(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f)) / 2.0f, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(33.0f) + min : getMeasuredWidth() - org.telegram.messenger.g0.L(15.0f), (org.telegram.messenger.g0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.n);
            org.telegram.ui.Components.xy0 xy0Var2 = this.r;
            xy0Var2.p = measuredWidth3;
            xy0Var2.e(canvas, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.f3.z(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            Paint g10 = h6Var != null ? h6Var.g("paintDivider") : null;
            if (g10 == null) {
                g10 = org.telegram.ui.ActionBar.m6.k0;
            }
            canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getMeasuredHeight() - 1, g10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        gm0 gm0Var;
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
        this.r = new org.telegram.ui.Components.xy0(org.telegram.messenger.j6.m(trim, org.telegram.ui.ActionBar.m6.o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
        gm0 gm0Var2 = this.x;
        if (gm0Var2 != null) {
            gm0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i7 = this.a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i10 = gm0.j;
            int i11 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.x = new gm0(i11, i11, i11, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.p10.m(user) >= 0) {
                gm0Var = gm0.c(i7, org.telegram.messenger.p10.m(user));
                gm0Var.a = org.telegram.messenger.g0.L(11.0f);
                gm0Var.d();
            } else {
                gm0Var = null;
            }
            this.x = gm0Var;
        }
        gm0 gm0Var3 = this.x;
        if (gm0Var3 != null) {
            gm0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean d = h6Var != null ? h6Var.d() : org.telegram.ui.ActionBar.m6.I.q();
            int i12 = (!d || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!d || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.n(i12);
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, i12));
            gm0 gm0Var4 = new gm0(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
            gm0Var4.a = org.telegram.messenger.g0.L(11.0f);
            gm0Var4.d();
            this.y = gm0Var4;
            gm0Var4.e(this);
            return;
        }
        int f10 = org.telegram.messenger.p10.f(user);
        if (f10 < 7) {
            int i13 = org.telegram.ui.ActionBar.m6.r8[f10];
            this.s = i13;
            w02 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var);
        } else {
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).t4;
            org.telegram.messenger.cp d2 = dpVar != null ? dpVar.d(f10) : null;
            if (d2 != null) {
                this.s = -1;
                w02 = d2.f();
            } else {
                int i14 = org.telegram.ui.ActionBar.m6.r8[0];
                this.s = i14;
                w02 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
            }
        }
        this.r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
        gm0 a10 = gm0.a(i7, f10);
        a10.a = org.telegram.messenger.g0.L(11.0f);
        a10.d();
        this.y = a10;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        Paint paint;
        int i7;
        boolean z10 = this.b;
        int i10 = z10 ? org.telegram.ui.ActionBar.m6.m6 : org.telegram.ui.ActionBar.m6.q6;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        if (!this.E || this.F != w02) {
            this.E = true;
            this.F = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        this.f.n(org.telegram.ui.ActionBar.m6.w0(z10 ? org.telegram.ui.ActionBar.m6.G6 : org.telegram.ui.ActionBar.m6.q6, h6Var));
        if (this.r == null || (paint = this.n) == null || (i7 = this.s) == -1) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.r.n(w03);
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w03));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
