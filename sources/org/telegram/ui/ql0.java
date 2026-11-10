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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ql0 extends View implements org.telegram.ui.ActionBar.c6 {
    public boolean D;
    public int E;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.my0 f;
    public final org.telegram.ui.ActionBar.v2 h;
    public final Paint n;
    public org.telegram.ui.Components.my0 r;
    public int s;
    public boolean w;
    public fm0 x;
    public fm0 y;

    public ql0(int i7, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i10;
        this.n = new Paint(1);
        this.s = -1;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        this.a = i7;
        boolean z9 = j3 < 0;
        this.b = z9;
        boolean z10 = z9 && !org.telegram.messenger.t3.V(M0);
        this.c = z10;
        this.d = h6Var;
        Drawable h = jg.g.h(context, R.drawable.menu_edit_appearance);
        this.e = h;
        org.telegram.ui.ActionBar.t6.x(this, h, org.telegram.ui.ActionBar.m6.q6, h6Var, PorterDuff.Mode.SRC_IN);
        String M02 = org.telegram.messenger.id.M0(z9 ? z10 ? 2131752546 : 2131752551 : 2131752530, null);
        if (z9 && !z10 && org.telegram.messenger.qp.s1(i7).e7.getInt("boostingappearance", 0) < 3) {
            org.telegram.messenger.gp gpVar = s12.q4;
            int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (gpVar != null) {
                int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, gpVar.e(false));
                int max = Math.max(0, s12.q4.e(false));
                int min2 = Math.min(min, s12.q4.f());
                int max2 = Math.max(max, s12.q4.f());
                i11 = min2;
                i10 = max2;
            } else {
                i10 = 0;
            }
            int min3 = Math.min(i11, s12.q5);
            int min4 = Math.min(i10, s12.q5);
            org.telegram.messenger.gp gpVar2 = s12.r4;
            if (gpVar2 != null) {
                int min5 = Math.min(min3, gpVar2.e(false));
                int max3 = Math.max(min4, s12.r4.e(false));
                min3 = Math.min(min5, s12.r4.f());
                min4 = Math.max(max3, s12.r4.f());
            }
            int min6 = Math.min(min3, s12.r5);
            int max4 = Math.max(min4, s12.r5);
            int min7 = Math.min(min6, s12.s5);
            int max5 = Math.max(max4, s12.s5);
            int min8 = Math.min(min7, s12.t5);
            int max6 = Math.max(max5, s12.t5);
            int min9 = Math.min(min8, s12.u5);
            int max7 = Math.max(max6, s12.u5);
            int i12 = M0 != null ? M0.level : 0;
            if (i12 < max7) {
                this.h = new org.telegram.ui.ActionBar.v2(Math.max(i12, min9), context, h6Var, true);
            }
        }
        setContentDescription(M02);
        this.f = new org.telegram.ui.Components.my0(M02, 16.0f, null);
        updateColors();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(64.0f) / 2;
        if (org.telegram.messenger.id.a0) {
            L = getMeasuredWidth() - L;
        }
        Drawable drawable = this.e;
        bg.s.d(drawable, L, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(171.0f);
        org.telegram.ui.ActionBar.v2 v2Var = this.h;
        int L2 = v2Var != null ? org.telegram.messenger.g0.L(8.0f) + v2Var.getIntrinsicWidth() : 0;
        org.telegram.ui.Components.my0 my0Var = this.f;
        my0Var.p = measuredWidth - L2;
        float measuredWidth2 = org.telegram.messenger.id.a0 ? (getMeasuredWidth() - my0Var.k()) - org.telegram.messenger.g0.L(71.0f) : org.telegram.messenger.g0.L(71.0f);
        my0Var.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (v2Var != null) {
            int k10 = (int) (my0Var.k() + measuredWidth2 + org.telegram.messenger.g0.L(6.0f));
            v2Var.setBounds(k10, 0, k10, getHeight());
            v2Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        boolean z9 = this.c;
        if (z9 && this.y != null) {
            int L3 = org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(58.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            this.y.setBounds(L3 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), L3, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.y.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var));
            this.y.draw(canvas);
        } else if (this.x != null && this.y != null) {
            int L4 = org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(58.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            this.y.setBounds(L4 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), L4, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            fm0 fm0Var = this.y;
            float N = org.telegram.messenger.g0.N(3.0f);
            int i7 = org.telegram.ui.ActionBar.m6.d6;
            fm0Var.f(N, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            this.y.draw(canvas);
            int L5 = L4 - org.telegram.messenger.g0.L(18.0f);
            this.x.setBounds(L5 - org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.camera.q.y(11.0f, getMeasuredHeight(), 2), L5, (org.telegram.messenger.g0.L(11.0f) + getMeasuredHeight()) / 2);
            this.x.f(org.telegram.messenger.g0.N(3.0f), org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            this.x.draw(canvas);
        } else if (this.r != null && !z9) {
            float measuredWidth3 = (int) ((getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f)) - Math.min(my0Var.k() + (v2Var == null ? 0 : org.telegram.messenger.g0.L(12.0f) + v2Var.getIntrinsicWidth()), getMeasuredWidth() - org.telegram.messenger.g0.L(164.0f)));
            int min = (int) Math.min(this.r.k(), measuredWidth3);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(15.0f) : org.telegram.messenger.k5.z(33.0f, getMeasuredWidth(), min), (getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f)) / 2.0f, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(33.0f) + min : getMeasuredWidth() - org.telegram.messenger.g0.L(15.0f), (org.telegram.messenger.g0.L(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.n);
            org.telegram.ui.Components.my0 my0Var2 = this.r;
            my0Var2.p = measuredWidth3;
            my0Var2.e(canvas, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.k5.z(24.0f, getMeasuredWidth(), min), getMeasuredHeight() / 2.0f);
        }
        if (this.w) {
            Paint d = h6Var != null ? h6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.m6.k0;
            }
            canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getMeasuredHeight() - 1, d);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.w ? 1 : 0), TLObject.FLAG_30));
    }

    public void set(TLRPC.User user) {
        fm0 fm0Var;
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
        this.r = new org.telegram.ui.Components.my0(org.telegram.messenger.i6.m(trim, org.telegram.ui.ActionBar.m6.o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
        fm0 fm0Var2 = this.x;
        if (fm0Var2 != null) {
            fm0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z9 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i7 = this.a;
        if (z9) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i10 = fm0.j;
            int i11 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.x = new fm0(i11, i11, i11, tL_emojiStatusCollectible.document_id);
        } else {
            if (org.telegram.messenger.t10.l(user) >= 0) {
                fm0Var = fm0.c(i7, org.telegram.messenger.t10.l(user));
                fm0Var.a = org.telegram.messenger.g0.L(11.0f);
                fm0Var.d();
            } else {
                fm0Var = null;
            }
            this.x = fm0Var;
        }
        fm0 fm0Var3 = this.x;
        if (fm0Var3 != null) {
            fm0Var3.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z10 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.n;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (z10) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean a10 = h6Var != null ? h6Var.a() : org.telegram.ui.ActionBar.m6.I.q();
            int i12 = (!a10 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!a10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
            int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
            this.r.n(i12);
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, i12));
            fm0 fm0Var4 = new fm0(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
            fm0Var4.a = org.telegram.messenger.g0.L(11.0f);
            fm0Var4.d();
            this.y = fm0Var4;
            fm0Var4.e(this);
            return;
        }
        int e10 = org.telegram.messenger.t10.e(user);
        if (e10 < 7) {
            int i13 = org.telegram.ui.ActionBar.m6.r8[e10];
            this.s = i13;
            w02 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var);
        } else {
            org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).q4;
            org.telegram.messenger.fp d = gpVar != null ? gpVar.d(e10) : null;
            if (d != null) {
                this.s = -1;
                w02 = d.f();
            } else {
                int i14 = org.telegram.ui.ActionBar.m6.r8[0];
                this.s = i14;
                w02 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
            }
        }
        this.r.n(w02);
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
        fm0 a11 = fm0.a(i7, e10);
        a11.a = org.telegram.messenger.g0.L(11.0f);
        a11.d();
        this.y = a11;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        Paint paint;
        int i7;
        boolean z9 = this.b;
        int i10 = z9 ? org.telegram.ui.ActionBar.m6.m6 : org.telegram.ui.ActionBar.m6.q6;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        if (!this.D || this.E != w02) {
            this.D = true;
            this.E = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        this.f.n(org.telegram.ui.ActionBar.m6.w0(z9 ? org.telegram.ui.ActionBar.m6.G6 : org.telegram.ui.ActionBar.m6.q6, h6Var));
        if (this.r == null || (paint = this.n) == null || (i7 = this.s) == -1) {
            return;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.r.n(w03);
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w03));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
