package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x81 extends org.telegram.ui.ActionBar.f2 {
    public cn D;
    public int E;
    public h2.f F;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.q8 d;
    public EditTextBoldCursor e;
    public w81 f;
    public org.telegram.ui.Components.k9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.xp s;
    public org.telegram.ui.Components.xj0 w;
    public TLRPC.TL_forumTopic x;
    public qg.a y;

    public static x81 f0(long j3, long j10) {
        Bundle j11 = a8.p0.j(j3, "chat_id");
        j11.putLong("topic_id", j10);
        x81 x81Var = new x81(j11);
        x81Var.h = new org.telegram.ui.Components.k9[2];
        x81Var.n = "";
        x81Var.F = new h2.f((int[]) null);
        return x81Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.Components.k9[] k9VarArr = this.h;
        if (this.x != null) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751216, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748251, null));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new s81(this));
        final int i7 = 1;
        if (this.x == null) {
            this.actionBar.s().e(1, org.telegram.messenger.id.M0(2131751753, null));
        } else {
            this.actionBar.s().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.m6.a7;
        org.telegram.ui.ActionBar.t6.h(i10, lVar, getResourceProvider());
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        t81 t81Var = new t81(context, null);
        this.fragmentView = t81Var;
        org.telegram.ui.ActionBar.t6.h(i10, t81Var, getResourceProvider());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        t81Var.addView(linearLayout);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.x;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            n4Var.setText(org.telegram.messenger.id.M0(2131751701, null));
        } else {
            n4Var.setText(org.telegram.messenger.id.M0(2131751749, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(org.telegram.messenger.id.M0(2131751113, null));
        org.telegram.ui.ActionBar.t6.A(this.e, org.telegram.ui.ActionBar.m6.Je, getResourceProvider());
        org.telegram.ui.ActionBar.t6.U(this.e, org.telegram.ui.ActionBar.m6.Ie, getResourceProvider());
        this.e.setPadding(org.telegram.messenger.g0.L(0.0f), this.e.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | TLObject.FLAG_14);
        frameLayout.addView(this.e, c8.ha.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new m0(this, 17));
        v81 v81Var = new v81(context, i11);
        v81Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.q81
            public final /* synthetic */ x81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                x81 x81Var = this.b;
                switch (i12) {
                    case 0:
                        if (x81Var.b == 0 && x81Var.x == null) {
                            qg.a aVar = x81Var.y;
                            int i13 = aVar.e + 1;
                            aVar.e = i13;
                            int[] iArr = qg.a.k;
                            if (i13 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i14 = iArr[aVar.e];
                            aVar.i = i14;
                            aVar.h = (int[]) qg.a.l.get(i14);
                            if (org.telegram.ui.ActionBar.m6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new bi.de(26, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            x81Var.E = iArr[aVar.e];
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.q8 q8Var = x81Var.d;
                        q8Var.setChecked(true ^ q8Var.d.h);
                        break;
                }
            }
        });
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9VarArr[i12] = k9Var;
            v81Var.addView(k9Var, c8.ha.e(28, 28, 17));
        }
        frameLayout.addView(v81Var, c8.ha.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(n4Var);
        linearLayout2.addView(frameLayout);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.m6.d6;
        Drawable f02 = org.telegram.ui.ActionBar.m6.f0(L, getThemedColor(i13));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        linearLayout2.setBackground(f02);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, f02, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, c8.ha.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.x;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            w81 w81Var = new w81(this, this, getParentActivity());
            this.f = w81Var;
            w81Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, c8.ha.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.xp d = qg.d.d(this.E, "");
            this.y = (qg.a) d.a;
            this.w = new org.telegram.ui.Components.xj0(context);
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(d, this.w, 0, 0);
            xpVar.x = true;
            this.f.setForumIconDrawable(xpVar);
            this.s = xpVar;
            org.telegram.ui.Components.xj0 xj0Var = this.w;
            org.telegram.ui.Components.k9 k9Var2 = k9VarArr[0];
            ArrayList arrayList = xj0Var.n;
            if (!arrayList.contains(k9Var2)) {
                arrayList.add(k9Var2);
            }
            org.telegram.ui.Components.xj0 xj0Var2 = this.w;
            org.telegram.ui.Components.k9 k9Var3 = k9VarArr[1];
            ArrayList arrayList2 = xj0Var2.n;
            if (!arrayList2.contains(k9Var3)) {
                arrayList2.add(k9Var3);
            }
            k9VarArr[0].setImageDrawable(this.s);
            org.telegram.messenger.g0.Z3(k9VarArr[0], true, 1.0f, true, false);
            org.telegram.messenger.g0.Z3(k9VarArr[1], false, 1.0f, true, false);
            this.y.d.add(k9VarArr[0]);
            this.y.d.add(k9VarArr[1]);
        } else {
            ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_filled_general);
            org.telegram.ui.ActionBar.t6.s(e10, org.telegram.ui.ActionBar.m6.od, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            v81Var.addView(e10, c8.ha.e(22, 22, 17));
            frameLayout2.addView(new View(context), c8.ha.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable f03 = org.telegram.ui.ActionBar.m6.f0(org.telegram.messenger.g0.L(16.0f), getThemedColor(i13));
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i13);
            org.telegram.ui.ActionBar.h6 resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(f03);
            org.telegram.ui.ActionBar.t6.j(frameLayout3, f03, M2, null, resourceProvider2);
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.d = q8Var;
            q8Var.getCheckBox().setDrawIconType(0);
            this.d.d(org.telegram.messenger.id.M0(2131751215, null), !this.x.hidden, false, false);
            org.telegram.ui.Cells.q8 q8Var2 = this.d;
            int themedColor = getThemedColor(i13);
            int i14 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.ActionBar.t6.Q(q8Var2, org.telegram.ui.ActionBar.m6.b0(themedColor, getThemedColor(i14), 16, 16), org.telegram.ui.ActionBar.t6.M(i13), org.telegram.ui.ActionBar.t6.M(i14), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.q81
                public final /* synthetic */ x81 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i7;
                    x81 x81Var = this.b;
                    switch (i122) {
                        case 0:
                            if (x81Var.b == 0 && x81Var.x == null) {
                                qg.a aVar = x81Var.y;
                                int i132 = aVar.e + 1;
                                aVar.e = i132;
                                int[] iArr = qg.a.k;
                                if (i132 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i142 = iArr[aVar.e];
                                aVar.i = i142;
                                aVar.h = (int[]) qg.a.l.get(i142);
                                if (org.telegram.ui.ActionBar.m6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new bi.de(26, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                x81Var.E = iArr[aVar.e];
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.q8 q8Var3 = x81Var.d;
                            q8Var3.setChecked(true ^ q8Var3.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, c8.ha.e(-1, 50, org.telegram.messenger.qs.E1));
            frameLayout2.addView(frameLayout3, c8.ha.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.id.M0(2131751214, null));
            frameLayout2.addView(z8Var, c8.ha.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, c8.ha.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.x;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            g0(Long.valueOf(this.x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l10, boolean z9) {
        org.telegram.ui.Components.k9[] k9VarArr = this.h;
        if (this.f == null || this.w == null) {
            return;
        }
        long longValue = l10 == null ? 0L : l10.longValue();
        this.f.setSelected(Long.valueOf(longValue));
        if (this.b == longValue) {
            return;
        }
        int i7 = 0;
        if (!z9 && longValue != 0 && !getUserConfig().q()) {
            TLRPC.Document e10 = org.telegram.ui.Components.h5.e(this.currentAccount, l10.longValue());
            if (e10 != null) {
                org.telegram.ui.Components.gc.a0(this).r(e10, org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743864, null)), org.telegram.messenger.id.M0(2131747033, null), new r81(this, i7)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.h5 h5Var = new org.telegram.ui.Components.h5(10, this.currentAccount, longValue);
            h5Var.setColorFilter(org.telegram.ui.ActionBar.m6.v3);
            k9VarArr[1].setAnimatedEmojiDrawable(h5Var);
            k9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.g70 g70Var = new org.telegram.ui.Components.g70(1, null);
            g70Var.a(this.n);
            this.w.b(g70Var, false);
            k9VarArr[1].setImageDrawable(this.s);
            k9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.k9 k9Var = k9VarArr[0];
        org.telegram.ui.Components.k9 k9Var2 = k9VarArr[1];
        k9VarArr[0] = k9Var2;
        k9VarArr[1] = k9Var;
        org.telegram.messenger.g0.Z3(k9Var2, true, 0.5f, true, true);
        org.telegram.messenger.g0.Z3(k9VarArr[1], false, 0.5f, true, true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        this.a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic f10 = getMessagesController().q7.f(-this.a, this.c);
            this.x = f10;
            if (f10 == null) {
                return false;
            }
            this.E = f10.icon_color;
        } else {
            this.E = qg.a.k[Math.abs(Utilities.b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        org.telegram.messenger.g0.K3(this.e);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 && this.r) {
            removeSelfFromStack();
        }
        this.F.e();
        w81 w81Var = this.f;
        if (w81Var != null) {
            w81Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        if (z9) {
            this.F.d();
        }
    }
}
