package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class td1 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public AnimationNotificationsLocker B;
    public long a;
    public long b;
    public long c;
    public org.telegram.ui.Cells.p8 d;
    public EditTextBoldCursor e;
    public sd1 f;
    public org.telegram.ui.Components.t9[] h;
    public String n;
    public boolean r;
    public org.telegram.ui.Components.jq s;
    public org.telegram.ui.Components.ol0 v;
    public TLRPC.TL_forumTopic w;
    public yf.b x;
    public tn y;

    public static td1 a0(long j10, long j11) {
        Bundle g10 = j7.l1.g(j10, "chat_id");
        g10.putLong("topic_id", j11);
        td1 td1Var = new td1(g10);
        td1Var.h = new org.telegram.ui.Components.t9[2];
        td1Var.n = "";
        td1Var.B = new AnimationNotificationsLocker();
        return td1Var;
    }

    public final void b0(Long l10, boolean z10) {
        org.telegram.ui.Components.t9[] t9VarArr = this.h;
        if (this.f == null || this.v == null) {
            return;
        }
        long longValue = l10 == null ? 0L : l10.longValue();
        this.f.setSelected(Long.valueOf(longValue));
        if (this.b == longValue) {
            return;
        }
        if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
            TLRPC.Document f9 = org.telegram.ui.Components.p5.f(this.currentAccount, l10.longValue());
            if (f9 != null) {
                org.telegram.ui.Components.tc.a0(this).q(f9, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new od1(this, 0)).j();
                return;
            }
            return;
        }
        this.b = longValue;
        if (longValue != 0) {
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(10, this.currentAccount, longValue);
            p5Var.setColorFilter(org.telegram.ui.ActionBar.g6.v3);
            t9VarArr[1].setAnimatedEmojiDrawable(p5Var);
            t9VarArr[1].setImageDrawable(null);
        } else {
            org.telegram.ui.Components.h80 h80Var = new org.telegram.ui.Components.h80(1, null);
            h80Var.a(this.n);
            this.v.b(h80Var, false);
            t9VarArr[1].setImageDrawable(this.s);
            t9VarArr[1].setAnimatedEmojiDrawable(null);
        }
        org.telegram.ui.Components.t9 t9Var = t9VarArr[0];
        org.telegram.ui.Components.t9 t9Var2 = t9VarArr[1];
        t9VarArr[0] = t9Var2;
        t9VarArr[1] = t9Var;
        AndroidUtilities.updateViewVisibilityAnimated(t9Var2, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(t9VarArr[1], false, 0.5f, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.Components.t9[] t9VarArr = this.h;
        if (this.w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new pd1(this));
        if (this.w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        lVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        qd1 qd1Var = new qd1(context, null);
        this.fragmentView = qd1Var;
        qd1Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        qd1Var.addView(linearLayout);
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.w;
        if (tL_forumTopic == null || tL_forumTopic.id != 1) {
            k4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        } else {
            k4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, i7.f6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new p0(this, 16));
        rd1 rd1Var = new rd1(context);
        final int i11 = 0;
        rd1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nd1
            public final /* synthetic */ td1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                td1 td1Var = this.b;
                switch (i12) {
                    case 0:
                        if (td1Var.b == 0 && td1Var.w == null) {
                            yf.b bVar = td1Var.x;
                            int i13 = bVar.e + 1;
                            bVar.e = i13;
                            int[] iArr = yf.b.k;
                            if (i13 > 5) {
                                bVar.e = 0;
                            }
                            int[] iArr2 = bVar.h;
                            int i14 = iArr[bVar.e];
                            bVar.i = i14;
                            bVar.h = (int[]) yf.b.l.get(i14);
                            if (org.telegram.ui.ActionBar.g6.I.q()) {
                                bVar.h = new int[]{i0.a.d(0.2f, bVar.h[0], -1), i0.a.d(0.2f, bVar.h[1], -1)};
                            }
                            bVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new yf.a(0, bVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            td1Var.A = iArr[bVar.e];
                            break;
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.p8 p8Var = td1Var.d;
                        p8Var.setChecked(true ^ p8Var.d.h);
                        break;
                }
            }
        });
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            t9VarArr[i12] = t9Var;
            rd1Var.addView(t9Var, i7.f6.e(28, 28, 17));
        }
        frameLayout.addView(rd1Var, i7.f6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(k4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.g6.d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.d0(dp, getThemedColor(i13)));
        linearLayout.addView(linearLayout2, i7.f6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.w;
        if (tL_forumTopic2 == null || tL_forumTopic2.id != 1) {
            sd1 sd1Var = new sd1(this, this, getParentActivity());
            this.f = sd1Var;
            sd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, i7.f6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.jq d = yf.d.d(this.A, "");
            this.x = (yf.b) d.a;
            this.v = new org.telegram.ui.Components.ol0(context);
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(d, this.v, 0, 0);
            jqVar.w = true;
            this.f.setForumIconDrawable(jqVar);
            this.s = jqVar;
            org.telegram.ui.Components.ol0 ol0Var = this.v;
            org.telegram.ui.Components.t9 t9Var2 = t9VarArr[0];
            ArrayList arrayList = ol0Var.n;
            if (!arrayList.contains(t9Var2)) {
                arrayList.add(t9Var2);
            }
            org.telegram.ui.Components.ol0 ol0Var2 = this.v;
            org.telegram.ui.Components.t9 t9Var3 = t9VarArr[1];
            ArrayList arrayList2 = ol0Var2.n;
            if (!arrayList2.contains(t9Var3)) {
                arrayList2.add(t9Var3);
            }
            t9VarArr[0].setImageDrawable(this.s);
            AndroidUtilities.updateViewVisibilityAnimated(t9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(t9VarArr[1], false, 1.0f, false);
            this.x.d.add(t9VarArr[0]);
            this.x.d.add(t9VarArr[1]);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ac), PorterDuff.Mode.MULTIPLY));
            rd1Var.addView(imageView, i7.f6.e(22, 22, 17));
            frameLayout2.addView(new View(context), i7.f6.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i13)));
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.d = p8Var;
            p8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(i13), getThemedColor(org.telegram.ui.ActionBar.g6.i6), 16, 16));
            final int i14 = 1;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.nd1
                public final /* synthetic */ td1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i14;
                    td1 td1Var = this.b;
                    switch (i122) {
                        case 0:
                            if (td1Var.b == 0 && td1Var.w == null) {
                                yf.b bVar = td1Var.x;
                                int i132 = bVar.e + 1;
                                bVar.e = i132;
                                int[] iArr = yf.b.k;
                                if (i132 > 5) {
                                    bVar.e = 0;
                                }
                                int[] iArr2 = bVar.h;
                                int i142 = iArr[bVar.e];
                                bVar.i = i142;
                                bVar.h = (int[]) yf.b.l.get(i142);
                                if (org.telegram.ui.ActionBar.g6.I.q()) {
                                    bVar.h = new int[]{i0.a.d(0.2f, bVar.h[0], -1), i0.a.d(0.2f, bVar.h[1], -1)};
                                }
                                bVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new yf.a(0, bVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                td1Var.A = iArr[bVar.e];
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.p8 p8Var2 = td1Var.d;
                            p8Var2.setChecked(true ^ p8Var2.d.h);
                            break;
                    }
                }
            });
            frameLayout3.addView(this.d, i7.f6.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, i7.f6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout2.addView(y8Var, i7.f6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        }
        linearLayout.addView(frameLayout2, i7.f6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.a, this.c);
            this.w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.A = findTopic.icon_color;
        } else {
            this.A = yf.b.k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        AndroidUtilities.showKeyboard(this.e);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.r) {
            removeSelfFromStack();
        }
        this.B.unlock();
        sd1 sd1Var = this.f;
        if (sd1Var != null) {
            sd1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.B.lock();
        }
    }
}
