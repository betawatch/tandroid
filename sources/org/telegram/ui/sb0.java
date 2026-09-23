package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sb0 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Cells.m4 E;
    public ob0 F;
    public org.telegram.ui.Cells.f9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.fa I;
    public org.telegram.ui.Components.zn0 J;
    public ob0 K;
    public org.telegram.ui.Cells.f9 L;
    public TextView M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public rb0 T;
    public org.telegram.ui.ActionBar.b2 U;
    public boolean V;
    public int W;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.tv0 c;
    public org.telegram.ui.Components.tv0 d;
    public TLRPC.TL_chatInviteExported e;
    public pb0 f;
    public org.telegram.ui.Cells.f9 h;
    public org.telegram.ui.Cells.x8 n;
    public qb0 r;
    public TextView s;
    public org.telegram.ui.Cells.f9 v;
    public TextView w;
    public org.telegram.ui.Cells.m4 x;
    public org.telegram.ui.Cells.f9 y;

    public sb0(int i10, long j3) {
        super(null);
        this.N = -3;
        this.P = new ArrayList();
        this.Q = new int[]{3600, 86400, 604800};
        this.R = new ArrayList();
        this.S = new int[]{1, 10, 100};
        this.a = i10;
        this.b = j3;
    }

    public final void V(int i10) {
        int[] iArr;
        long j3 = i10;
        this.w.setText(LocaleController.formatDateAudio(j3, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            iArr = this.Q;
            if (i11 >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[i11]) {
                arrayList.add(Integer.valueOf(currentTime));
                i12 = i11;
                z10 = true;
            }
            i11 = com.google.android.gms.internal.vision.e2.e(iArr[i11], i11, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            i12 = iArr.length;
        }
        int size = arrayList.size();
        int i13 = size + 1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 == size) {
                strArr[i14] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[0]) {
                strArr[i14] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[1]) {
                strArr[i14] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i14)).intValue() == iArr[2]) {
                strArr[i14] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j10 = currentTime;
                if (j10 < 86400) {
                    strArr[i14] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j10 < 31449600) {
                    strArr[i14] = LocaleController.getInstance().getFormatterScheduleDay().format(j3 * 1000);
                } else {
                    strArr[i14] = LocaleController.getInstance().getFormatterYear().format(j3 * 1000);
                }
            }
        }
        this.d.b(i12, null, strArr);
    }

    public final void W(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        while (true) {
            iArr = this.S;
            if (i12 >= iArr.length) {
                break;
            }
            if (!z10 && i10 <= (i11 = iArr[i12])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                i13 = i12;
                z10 = true;
            }
            i12 = com.google.android.gms.internal.vision.e2.e(iArr[i12], i12, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i10));
            i13 = iArr.length;
        }
        int size = arrayList.size();
        int i14 = size + 1;
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 == size) {
                strArr[i15] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i15] = ((Integer) arrayList.get(i15)).toString();
            }
        }
        this.c.b(i13, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.R;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr = this.S;
            if (i10 >= iArr.length) {
                this.c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
            i10 = com.google.android.gms.internal.vision.e2.e(iArr[i10], i10, 1, arrayList);
        }
    }

    public final void Y(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i10 = tL_chatInviteExported.expire_date;
        if (i10 > 0) {
            V(i10);
            this.W = ((Integer) this.P.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.W = 0;
        }
        int i11 = tL_chatInviteExported.usage_limit;
        if (i11 > 0) {
            W(i11);
            this.F.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        pb0 pb0Var = this.f;
        if (pb0Var != null) {
            pb0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        Z(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
            this.K.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.x8 x8Var = this.n;
        if (x8Var != null) {
            x8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            pb0 pb0Var2 = this.f;
            if (pb0Var2 != null) {
                pb0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.f9 f9Var = this.h;
            if (f9Var != null) {
                f9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        qb0 qb0Var = this.r;
        if (qb0Var != null) {
            qb0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.r.b.setClickable(false);
            this.r.b.setFocusable(false);
            this.r.b.setFocusableInTouchMode(false);
            this.r.b.setLongClickable(false);
        }
    }

    public final void Z(boolean z10) {
        this.E.setVisibility(z10 ? 0 : 8);
        this.c.setVisibility(z10 ? 0 : 8);
        this.F.setVisibility(z10 ? 0 : 8);
        this.G.setVisibility(z10 ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.a;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        int i11 = 3;
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, i11));
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.g5(1));
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(17);
        final int i12 = 0;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb0
            public final /* synthetic */ sb0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0232  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x028b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                long j3;
                int i13;
                boolean z10;
                boolean z11;
                pb0 pb0Var;
                String obj;
                switch (i12) {
                    case 0:
                        final sb0 sb0Var = this.b;
                        long j10 = sb0Var.b;
                        ArrayList arrayList = sb0Var.R;
                        ArrayList arrayList2 = sb0Var.P;
                        if (!sb0Var.V) {
                            int selectedIndex = sb0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(sb0Var.w);
                                Vibrator vibrator = (Vibrator) sb0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.x8 x8Var = sb0Var.n;
                                if (x8Var != null && x8Var.e.h) {
                                    try {
                                        j3 = Long.parseLong(sb0Var.r.b.getText().toString());
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    i13 = sb0Var.a;
                                    if (i13 != 0) {
                                        org.telegram.ui.ActionBar.b2 b2Var = sb0Var.U;
                                        if (b2Var != null) {
                                            b2Var.dismiss();
                                        }
                                        sb0Var.V = true;
                                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(sb0Var.getParentActivity(), 3, null);
                                        sb0Var.U = b2Var2;
                                        b2Var2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = sb0Var.getMessagesController().getInputPeer(-j10);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = sb0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = sb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = sb0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        pb0 pb0Var2 = sb0Var.f;
                                        boolean z12 = pb0Var2 != null && pb0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z12;
                                        if (z12) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj2 = sb0Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj2;
                                        if (!TextUtils.isEmpty(obj2)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j3 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = sb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j3;
                                        }
                                        final int i14 = 0;
                                        sb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.jb0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i14) {
                                                    case 0:
                                                        final int i15 = 0;
                                                        final sb0 sb0Var2 = sb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kb0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        sb0 sb0Var3 = sb0Var2;
                                                                        sb0Var3.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var3 = sb0Var3.U;
                                                                        if (b2Var3 != null) {
                                                                            b2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.e5.u0(sb0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            rb0 rb0Var = sb0Var3.T;
                                                                            if (rb0Var != null) {
                                                                                rb0Var.c(tLObject);
                                                                            }
                                                                            sb0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        sb0 sb0Var4 = sb0Var2;
                                                                        sb0Var4.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var4 = sb0Var4.U;
                                                                        if (b2Var4 != null) {
                                                                            b2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.e5.u0(sb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                sb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            rb0 rb0Var2 = sb0Var4.T;
                                                                            if (rb0Var2 != null) {
                                                                                rb0Var2.b(sb0Var4.e, tLObject2);
                                                                            }
                                                                            sb0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i16 = 1;
                                                        final sb0 sb0Var3 = sb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kb0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i16) {
                                                                    case 0:
                                                                        sb0 sb0Var32 = sb0Var3;
                                                                        sb0Var32.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var3 = sb0Var32.U;
                                                                        if (b2Var3 != null) {
                                                                            b2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.e5.u0(sb0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            rb0 rb0Var = sb0Var32.T;
                                                                            if (rb0Var != null) {
                                                                                rb0Var.c(tLObject);
                                                                            }
                                                                            sb0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        sb0 sb0Var4 = sb0Var3;
                                                                        sb0Var4.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var4 = sb0Var4.U;
                                                                        if (b2Var4 != null) {
                                                                            b2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.e5.u0(sb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                sb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            rb0 rb0Var2 = sb0Var4.T;
                                                                            if (rb0Var2 != null) {
                                                                                rb0Var2.b(sb0Var4.e, tLObject2);
                                                                            }
                                                                            sb0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    } else if (i13 == 1) {
                                        org.telegram.ui.ActionBar.b2 b2Var3 = sb0Var.U;
                                        if (b2Var3 != null) {
                                            b2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = sb0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = sb0Var.getMessagesController().getInputPeer(-j10);
                                        int selectedIndex4 = sb0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (sb0Var.W != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = sb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (sb0Var.W != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = sb0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            if (sb0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = sb0Var.e.request_needed;
                                            pb0Var = sb0Var.f;
                                            if (z11 != (pb0Var == null && pb0Var.e.h)) {
                                                int i15 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i15 | 8;
                                                boolean z13 = pb0Var != null && pb0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z13;
                                                if (z13) {
                                                    tL_messages_editExportedChatInvite.flags = i15 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = sb0Var.K.getText().toString();
                                            if (!TextUtils.equals(sb0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                sb0Var.V = true;
                                                org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(sb0Var.getParentActivity(), 3, null);
                                                sb0Var.U = b2Var4;
                                                b2Var4.q(500L);
                                                final int i16 = 1;
                                                sb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.jb0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i16) {
                                                            case 0:
                                                                final int i152 = 0;
                                                                final sb0 sb0Var2 = sb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kb0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                sb0 sb0Var32 = sb0Var2;
                                                                                sb0Var32.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var32 = sb0Var32.U;
                                                                                if (b2Var32 != null) {
                                                                                    b2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.e5.u0(sb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    rb0 rb0Var = sb0Var32.T;
                                                                                    if (rb0Var != null) {
                                                                                        rb0Var.c(tLObject);
                                                                                    }
                                                                                    sb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                sb0 sb0Var4 = sb0Var2;
                                                                                sb0Var4.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var42 = sb0Var4.U;
                                                                                if (b2Var42 != null) {
                                                                                    b2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.e5.u0(sb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        sb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    rb0 rb0Var2 = sb0Var4.T;
                                                                                    if (rb0Var2 != null) {
                                                                                        rb0Var2.b(sb0Var4.e, tLObject2);
                                                                                    }
                                                                                    sb0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i162 = 1;
                                                                final sb0 sb0Var3 = sb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kb0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i162) {
                                                                            case 0:
                                                                                sb0 sb0Var32 = sb0Var3;
                                                                                sb0Var32.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var32 = sb0Var32.U;
                                                                                if (b2Var32 != null) {
                                                                                    b2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.e5.u0(sb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    rb0 rb0Var = sb0Var32.T;
                                                                                    if (rb0Var != null) {
                                                                                        rb0Var.c(tLObject);
                                                                                    }
                                                                                    sb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                sb0 sb0Var4 = sb0Var3;
                                                                                sb0Var4.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var42 = sb0Var4.U;
                                                                                if (b2Var42 != null) {
                                                                                    b2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.e5.u0(sb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        sb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    rb0 rb0Var2 = sb0Var4.T;
                                                                                    if (rb0Var2 != null) {
                                                                                        rb0Var2.b(sb0Var4.e, tLObject2);
                                                                                    }
                                                                                    sb0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            } else {
                                                sb0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            if (sb0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = sb0Var.e.request_needed;
                                            pb0Var = sb0Var.f;
                                            if (z11 != (pb0Var == null && pb0Var.e.h)) {
                                            }
                                            obj = sb0Var.K.getText().toString();
                                            if (!TextUtils.equals(sb0Var.e.title, obj)) {
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    }
                                }
                                j3 = 0;
                                i13 = sb0Var.a;
                                if (i13 != 0) {
                                }
                            }
                        }
                        break;
                    default:
                        sb0 sb0Var2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sb0Var2.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ib0(sb0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        sb0Var2.showDialog(alertDialog$Builder.a);
                        break;
                }
            }
        });
        this.M.setSingleLine();
        if (i10 == 0) {
            this.M.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i10 == 1) {
            this.M.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.M.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        w7.z5.a(this.M);
        this.actionBar.addView(this.M, w7.x5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        nb0 nb0Var = new nb0(this, context);
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0(context, nb0Var, this.resourceProvider, true);
        this.J = zn0Var;
        this.actionBar.setAdaptiveBackground(zn0Var);
        w8 w8Var = new w8(this, context, 4);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        layoutTransition.setInterpolator(2, rrVar);
        layoutTransition.setInterpolator(0, rrVar);
        layoutTransition.setInterpolator(4, rrVar);
        layoutTransition.setInterpolator(1, rrVar);
        layoutTransition.setInterpolator(3, rrVar);
        nb0Var.setLayoutTransition(layoutTransition);
        nb0Var.setOrientation(1);
        nb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(nb0Var);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.x = m4Var;
        m4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        nb0Var.addView(this.x);
        org.telegram.ui.Components.tv0 tv0Var = new org.telegram.ui.Components.tv0(context, null);
        this.d = tv0Var;
        nb0Var.addView(tv0Var);
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new pv(14, this, context));
        this.d.setCallback(new ib0(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i13 >= iArr.length) {
                break;
            }
            i13 = com.google.android.gms.internal.vision.e2.e(iArr[i13], i13, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        nb0Var.addView(this.w, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.y = f9Var;
        f9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        nb0Var.addView(this.y);
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
        this.E = m4Var2;
        m4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        nb0Var.addView(this.E);
        org.telegram.ui.Components.tv0 tv0Var2 = new org.telegram.ui.Components.tv0(context, null);
        this.c = tv0Var2;
        tv0Var2.setCallback(new ib0(this, i11));
        X();
        nb0Var.addView(this.c);
        ob0 ob0Var = new ob0(context, 0);
        this.F = ob0Var;
        ob0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new mb0(this, 1));
        nb0Var.addView(this.F, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.G = f9Var2;
        f9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        nb0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j3 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        pb0 pb0Var = new pb0(context);
        this.f = pb0Var;
        int i14 = org.telegram.ui.ActionBar.h6.d6;
        pb0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.f.setTag(Integer.valueOf(i14));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new ai.j3(7, this, z10));
        nb0Var.addView(this.f, w7.x5.n(-1, 56));
        org.telegram.ui.Cells.f9 f9Var3 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.h = f9Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            f9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        nb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
                this.n = x8Var;
                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new pv(15, this, new Runnable[1]));
                nb0Var.addView(this.n, w7.x5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.s.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A6, false));
                qb0 qb0Var = new qb0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = qb0Var;
                qb0Var.b.setInputType(2);
                this.r.b.setRawInputType(2);
                this.r.setBackgroundColor(getThemedColor(i14));
                qb0 qb0Var2 = this.r;
                qb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(qb0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = qb0Var2.b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.s2(gVar, 2));
                this.r.addView(this.s, w7.x5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                qb0 qb0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                qb0Var3.getClass();
                ImageView imageView = new ImageView(qb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                qb0Var3.addView(imageView, w7.x5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = qb0Var3.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                nb0Var.addView(this.r, w7.x5.n(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.f9 f9Var4 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
                this.v = f9Var4;
                if (this.e != null) {
                    f9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    f9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new hb0(this, 2)));
                }
                nb0Var.addView(this.v, w7.x5.n(-1, -2));
            }
        }
        ob0 ob0Var2 = new ob0(context, 1);
        this.K = ob0Var2;
        ob0Var2.addTextChangedListener(new mb0(this, 0));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        ob0 ob0Var3 = this.K;
        int i15 = org.telegram.ui.ActionBar.h6.y6;
        ob0Var3.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        ob0 ob0Var4 = this.K;
        int i16 = org.telegram.ui.ActionBar.h6.G6;
        ob0Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
        this.K.setTextSize(1, 16.0f);
        nb0Var.addView(this.K, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.f9 f9Var5 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.L = f9Var5;
        f9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        nb0Var.addView(this.L);
        if (i10 == 1) {
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context);
            this.I = faVar;
            faVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            this.I.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.p7, false));
            final int i17 = 1;
            this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb0
                public final /* synthetic */ sb0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0232  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x028b  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    long j32;
                    int i132;
                    boolean z102;
                    boolean z11;
                    pb0 pb0Var2;
                    String obj;
                    switch (i17) {
                        case 0:
                            final sb0 sb0Var = this.b;
                            long j10 = sb0Var.b;
                            ArrayList arrayList2 = sb0Var.R;
                            ArrayList arrayList22 = sb0Var.P;
                            if (!sb0Var.V) {
                                int selectedIndex = sb0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList22.size() && ((Integer) arrayList22.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(sb0Var.w);
                                    Vibrator vibrator = (Vibrator) sb0Var.w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Cells.x8 x8Var2 = sb0Var.n;
                                    if (x8Var2 != null && x8Var2.e.h) {
                                        try {
                                            j32 = Long.parseLong(sb0Var.r.b.getText().toString());
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        i132 = sb0Var.a;
                                        if (i132 != 0) {
                                            org.telegram.ui.ActionBar.b2 b2Var = sb0Var.U;
                                            if (b2Var != null) {
                                                b2Var.dismiss();
                                            }
                                            sb0Var.V = true;
                                            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(sb0Var.getParentActivity(), 3, null);
                                            sb0Var.U = b2Var2;
                                            b2Var2.q(500L);
                                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                            tL_messages_exportChatInvite.peer = sb0Var.getMessagesController().getInputPeer(-j10);
                                            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                            int selectedIndex2 = sb0Var.d.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 1;
                                            if (selectedIndex2 < arrayList22.size()) {
                                                tL_messages_exportChatInvite.expire_date = sb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex2)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.expire_date = 0;
                                            }
                                            int selectedIndex3 = sb0Var.c.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 2;
                                            if (selectedIndex3 < arrayList2.size()) {
                                                tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            pb0 pb0Var22 = sb0Var.f;
                                            boolean z12 = pb0Var22 != null && pb0Var22.e.h;
                                            tL_messages_exportChatInvite.request_needed = z12;
                                            if (z12) {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            String obj2 = sb0Var.K.getText().toString();
                                            tL_messages_exportChatInvite.title = obj2;
                                            if (!TextUtils.isEmpty(obj2)) {
                                                tL_messages_exportChatInvite.flags |= 16;
                                            }
                                            if (j32 > 0) {
                                                tL_messages_exportChatInvite.flags |= 32;
                                                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                                tL_starsSubscriptionPricing.period = sb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                                tL_messages_exportChatInvite.subscription_pricing.amount = j32;
                                            }
                                            final int i142 = 0;
                                            sb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.jb0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i142) {
                                                        case 0:
                                                            final int i152 = 0;
                                                            final sb0 sb0Var2 = sb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kb0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i152) {
                                                                        case 0:
                                                                            sb0 sb0Var32 = sb0Var2;
                                                                            sb0Var32.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var32 = sb0Var32.U;
                                                                            if (b2Var32 != null) {
                                                                                b2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.e5.u0(sb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                rb0 rb0Var = sb0Var32.T;
                                                                                if (rb0Var != null) {
                                                                                    rb0Var.c(tLObject);
                                                                                }
                                                                                sb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            sb0 sb0Var4 = sb0Var2;
                                                                            sb0Var4.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var42 = sb0Var4.U;
                                                                            if (b2Var42 != null) {
                                                                                b2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.e5.u0(sb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    sb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                rb0 rb0Var2 = sb0Var4.T;
                                                                                if (rb0Var2 != null) {
                                                                                    rb0Var2.b(sb0Var4.e, tLObject2);
                                                                                }
                                                                                sb0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i162 = 1;
                                                            final sb0 sb0Var3 = sb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kb0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i162) {
                                                                        case 0:
                                                                            sb0 sb0Var32 = sb0Var3;
                                                                            sb0Var32.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var32 = sb0Var32.U;
                                                                            if (b2Var32 != null) {
                                                                                b2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.e5.u0(sb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                rb0 rb0Var = sb0Var32.T;
                                                                                if (rb0Var != null) {
                                                                                    rb0Var.c(tLObject);
                                                                                }
                                                                                sb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            sb0 sb0Var4 = sb0Var3;
                                                                            sb0Var4.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var42 = sb0Var4.U;
                                                                            if (b2Var42 != null) {
                                                                                b2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.e5.u0(sb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    sb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                rb0 rb0Var2 = sb0Var4.T;
                                                                                if (rb0Var2 != null) {
                                                                                    rb0Var2.b(sb0Var4.e, tLObject2);
                                                                                }
                                                                                sb0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else if (i132 == 1) {
                                            org.telegram.ui.ActionBar.b2 b2Var3 = sb0Var.U;
                                            if (b2Var3 != null) {
                                                b2Var3.dismiss();
                                            }
                                            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                            tL_messages_editExportedChatInvite.link = sb0Var.e.link;
                                            tL_messages_editExportedChatInvite.revoked = false;
                                            tL_messages_editExportedChatInvite.peer = sb0Var.getMessagesController().getInputPeer(-j10);
                                            int selectedIndex4 = sb0Var.d.getSelectedIndex();
                                            if (selectedIndex4 < arrayList22.size()) {
                                                if (sb0Var.W != ((Integer) arrayList22.get(selectedIndex4)).intValue()) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = sb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex4)).intValue();
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            } else {
                                                if (sb0Var.W != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = 0;
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            }
                                            int selectedIndex5 = sb0Var.c.getSelectedIndex();
                                            if (selectedIndex5 < arrayList2.size()) {
                                                int intValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                                if (sb0Var.e.usage_limit != intValue) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                    z102 = true;
                                                }
                                                z11 = sb0Var.e.request_needed;
                                                pb0Var2 = sb0Var.f;
                                                if (z11 != (pb0Var2 == null && pb0Var2.e.h)) {
                                                    int i152 = tL_messages_editExportedChatInvite.flags;
                                                    tL_messages_editExportedChatInvite.flags = i152 | 8;
                                                    boolean z13 = pb0Var2 != null && pb0Var2.e.h;
                                                    tL_messages_editExportedChatInvite.request_needed = z13;
                                                    if (z13) {
                                                        tL_messages_editExportedChatInvite.flags = i152 | 10;
                                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    }
                                                    z102 = true;
                                                }
                                                obj = sb0Var.K.getText().toString();
                                                if (!TextUtils.equals(sb0Var.e.title, obj)) {
                                                    tL_messages_editExportedChatInvite.title = obj;
                                                    tL_messages_editExportedChatInvite.flags |= 16;
                                                    z102 = true;
                                                }
                                                if (!z102) {
                                                    sb0Var.V = true;
                                                    org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(sb0Var.getParentActivity(), 3, null);
                                                    sb0Var.U = b2Var4;
                                                    b2Var4.q(500L);
                                                    final int i162 = 1;
                                                    sb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.jb0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            switch (i162) {
                                                                case 0:
                                                                    final int i1522 = 0;
                                                                    final sb0 sb0Var2 = sb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kb0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1522) {
                                                                                case 0:
                                                                                    sb0 sb0Var32 = sb0Var2;
                                                                                    sb0Var32.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var32 = sb0Var32.U;
                                                                                    if (b2Var32 != null) {
                                                                                        b2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.e5.u0(sb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        rb0 rb0Var = sb0Var32.T;
                                                                                        if (rb0Var != null) {
                                                                                            rb0Var.c(tLObject);
                                                                                        }
                                                                                        sb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    sb0 sb0Var4 = sb0Var2;
                                                                                    sb0Var4.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var42 = sb0Var4.U;
                                                                                    if (b2Var42 != null) {
                                                                                        b2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.e5.u0(sb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            sb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        rb0 rb0Var2 = sb0Var4.T;
                                                                                        if (rb0Var2 != null) {
                                                                                            rb0Var2.b(sb0Var4.e, tLObject2);
                                                                                        }
                                                                                        sb0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                default:
                                                                    final int i1622 = 1;
                                                                    final sb0 sb0Var3 = sb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kb0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1622) {
                                                                                case 0:
                                                                                    sb0 sb0Var32 = sb0Var3;
                                                                                    sb0Var32.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var32 = sb0Var32.U;
                                                                                    if (b2Var32 != null) {
                                                                                        b2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.e5.u0(sb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        rb0 rb0Var = sb0Var32.T;
                                                                                        if (rb0Var != null) {
                                                                                            rb0Var.c(tLObject);
                                                                                        }
                                                                                        sb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    sb0 sb0Var4 = sb0Var3;
                                                                                    sb0Var4.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var42 = sb0Var4.U;
                                                                                    if (b2Var42 != null) {
                                                                                        b2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.e5.u0(sb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            sb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        rb0 rb0Var2 = sb0Var4.T;
                                                                                        if (rb0Var2 != null) {
                                                                                            rb0Var2.b(sb0Var4.e, tLObject2);
                                                                                        }
                                                                                        sb0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    sb0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                if (sb0Var.e.usage_limit != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    z102 = true;
                                                }
                                                z11 = sb0Var.e.request_needed;
                                                pb0Var2 = sb0Var.f;
                                                if (z11 != (pb0Var2 == null && pb0Var2.e.h)) {
                                                }
                                                obj = sb0Var.K.getText().toString();
                                                if (!TextUtils.equals(sb0Var.e.title, obj)) {
                                                }
                                                if (!z102) {
                                                }
                                            }
                                        }
                                    }
                                    j32 = 0;
                                    i132 = sb0Var.a;
                                    if (i132 != 0) {
                                    }
                                }
                            }
                            break;
                        default:
                            sb0 sb0Var2 = this.b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sb0Var2.getParentActivity());
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ib0(sb0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            sb0Var2.showDialog(alertDialog$Builder.a);
                            break;
                    }
                }
            });
            nb0Var.addView(this.I);
        }
        w8Var.addView(this.J, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        int i18 = org.telegram.ui.ActionBar.h6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i18));
        new ci.i4(w8Var, false, new ai.i(17));
        w8Var.addView(this.H, w7.x5.e(-1, -2, 80));
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.w.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.c.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.K.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i18, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
        this.F.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
        this.w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.F.setCursorVisible(false);
        Y(this.e);
        w8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        nb0Var.setClipChildren(false);
        return w8Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        this.J.getLayoutParams().height = this.J.getHeight();
        super.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.x, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.m4 m4Var = this.x;
        int i11 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(m4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.y, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.p7));
        return arrayList;
    }
}
