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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xb0 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Cells.l4 E;
    public tb0 F;
    public org.telegram.ui.Cells.e9 G;
    public FrameLayout H;
    public org.telegram.ui.Cells.ea I;
    public org.telegram.ui.Components.zn0 J;
    public tb0 K;
    public org.telegram.ui.Cells.e9 L;
    public TextView M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final int[] Q;
    public final ArrayList R;
    public final int[] S;
    public wb0 T;
    public org.telegram.ui.ActionBar.b2 U;
    public boolean V;
    public int W;
    public final int a;
    public final long b;
    public org.telegram.ui.Components.sv0 c;
    public org.telegram.ui.Components.sv0 d;
    public TLRPC.TL_chatInviteExported e;
    public ub0 f;
    public org.telegram.ui.Cells.e9 h;
    public org.telegram.ui.Cells.w8 n;
    public vb0 r;
    public TextView s;
    public org.telegram.ui.Cells.e9 v;
    public TextView w;
    public org.telegram.ui.Cells.l4 x;
    public org.telegram.ui.Cells.e9 y;

    public xb0(int i10, long j3) {
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
        ub0 ub0Var = this.f;
        if (ub0Var != null) {
            ub0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            this.f.setChecked(tL_chatInviteExported.request_needed);
        }
        Z(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.K.getPaint().getFontMetricsInt(), false);
            this.K.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.w8 w8Var = this.n;
        if (w8Var != null) {
            w8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            ub0 ub0Var2 = this.f;
            if (ub0Var2 != null) {
                ub0Var2.setChecked(false);
                this.f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.e9 e9Var = this.h;
            if (e9Var != null) {
                e9Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        vb0 vb0Var = this.r;
        if (vb0Var != null) {
            vb0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
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
        int i11 = 4;
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, i11));
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.h5(1));
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setGravity(17);
        final int i12 = 0;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qb0
            public final /* synthetic */ xb0 b;

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
                ub0 ub0Var;
                String obj;
                switch (i12) {
                    case 0:
                        final xb0 xb0Var = this.b;
                        long j10 = xb0Var.b;
                        ArrayList arrayList = xb0Var.R;
                        ArrayList arrayList2 = xb0Var.P;
                        if (!xb0Var.V) {
                            int selectedIndex = xb0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(xb0Var.w);
                                Vibrator vibrator = (Vibrator) xb0Var.w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                    break;
                                }
                            } else {
                                org.telegram.ui.Cells.w8 w8Var = xb0Var.n;
                                if (w8Var != null && w8Var.e.h) {
                                    try {
                                        j3 = Long.parseLong(xb0Var.r.b.getText().toString());
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    i13 = xb0Var.a;
                                    if (i13 != 0) {
                                        org.telegram.ui.ActionBar.b2 b2Var = xb0Var.U;
                                        if (b2Var != null) {
                                            b2Var.dismiss();
                                        }
                                        xb0Var.V = true;
                                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(xb0Var.getParentActivity(), 3, null);
                                        xb0Var.U = b2Var2;
                                        b2Var2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = xb0Var.getMessagesController().getInputPeer(-j10);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = xb0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = xb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = xb0Var.c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        ub0 ub0Var2 = xb0Var.f;
                                        boolean z12 = ub0Var2 != null && ub0Var2.e.h;
                                        tL_messages_exportChatInvite.request_needed = z12;
                                        if (z12) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String obj2 = xb0Var.K.getText().toString();
                                        tL_messages_exportChatInvite.title = obj2;
                                        if (!TextUtils.isEmpty(obj2)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j3 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = xb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j3;
                                        }
                                        final int i14 = 0;
                                        xb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ob0
                                            @Override // org.telegram.tgnet.RequestDelegate
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i14) {
                                                    case 0:
                                                        final int i15 = 0;
                                                        final xb0 xb0Var2 = xb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pb0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i15) {
                                                                    case 0:
                                                                        xb0 xb0Var3 = xb0Var2;
                                                                        xb0Var3.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var3 = xb0Var3.U;
                                                                        if (b2Var3 != null) {
                                                                            b2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.e5.u0(xb0Var3, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            wb0 wb0Var = xb0Var3.T;
                                                                            if (wb0Var != null) {
                                                                                wb0Var.c(tLObject);
                                                                            }
                                                                            xb0Var3.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        xb0 xb0Var4 = xb0Var2;
                                                                        xb0Var4.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var4 = xb0Var4.U;
                                                                        if (b2Var4 != null) {
                                                                            b2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.e5.u0(xb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                xb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            wb0 wb0Var2 = xb0Var4.T;
                                                                            if (wb0Var2 != null) {
                                                                                wb0Var2.b(xb0Var4.e, tLObject2);
                                                                            }
                                                                            xb0Var4.finishFragment();
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i16 = 1;
                                                        final xb0 xb0Var3 = xb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pb0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                switch (i16) {
                                                                    case 0:
                                                                        xb0 xb0Var32 = xb0Var3;
                                                                        xb0Var32.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var3 = xb0Var32.U;
                                                                        if (b2Var3 != null) {
                                                                            b2Var3.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.e5.u0(xb0Var32, null, tL_error2.text, null);
                                                                            break;
                                                                        } else {
                                                                            wb0 wb0Var = xb0Var32.T;
                                                                            if (wb0Var != null) {
                                                                                wb0Var.c(tLObject);
                                                                            }
                                                                            xb0Var32.finishFragment();
                                                                            break;
                                                                        }
                                                                    default:
                                                                        xb0 xb0Var4 = xb0Var3;
                                                                        xb0Var4.V = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var4 = xb0Var4.U;
                                                                        if (b2Var4 != null) {
                                                                            b2Var4.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.e5.u0(xb0Var4, null, tL_error3.text, null);
                                                                            break;
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                xb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            wb0 wb0Var2 = xb0Var4.T;
                                                                            if (wb0Var2 != null) {
                                                                                wb0Var2.b(xb0Var4.e, tLObject2);
                                                                            }
                                                                            xb0Var4.finishFragment();
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
                                        org.telegram.ui.ActionBar.b2 b2Var3 = xb0Var.U;
                                        if (b2Var3 != null) {
                                            b2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = xb0Var.e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = xb0Var.getMessagesController().getInputPeer(-j10);
                                        int selectedIndex4 = xb0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (xb0Var.W != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = xb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z10 = true;
                                            }
                                            z10 = false;
                                        } else {
                                            if (xb0Var.W != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = 0;
                                                z10 = true;
                                            }
                                            z10 = false;
                                        }
                                        int selectedIndex5 = xb0Var.c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList.size()) {
                                            int intValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                            if (xb0Var.e.usage_limit != intValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                z10 = true;
                                            }
                                            z11 = xb0Var.e.request_needed;
                                            ub0Var = xb0Var.f;
                                            if (z11 != (ub0Var == null && ub0Var.e.h)) {
                                                int i15 = tL_messages_editExportedChatInvite.flags;
                                                tL_messages_editExportedChatInvite.flags = i15 | 8;
                                                boolean z13 = ub0Var != null && ub0Var.e.h;
                                                tL_messages_editExportedChatInvite.request_needed = z13;
                                                if (z13) {
                                                    tL_messages_editExportedChatInvite.flags = i15 | 10;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                }
                                                z10 = true;
                                            }
                                            obj = xb0Var.K.getText().toString();
                                            if (!TextUtils.equals(xb0Var.e.title, obj)) {
                                                tL_messages_editExportedChatInvite.title = obj;
                                                tL_messages_editExportedChatInvite.flags |= 16;
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                xb0Var.V = true;
                                                org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(xb0Var.getParentActivity(), 3, null);
                                                xb0Var.U = b2Var4;
                                                b2Var4.q(500L);
                                                final int i16 = 1;
                                                xb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ob0
                                                    @Override // org.telegram.tgnet.RequestDelegate
                                                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                        switch (i16) {
                                                            case 0:
                                                                final int i152 = 0;
                                                                final xb0 xb0Var2 = xb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pb0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i152) {
                                                                            case 0:
                                                                                xb0 xb0Var32 = xb0Var2;
                                                                                xb0Var32.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var32 = xb0Var32.U;
                                                                                if (b2Var32 != null) {
                                                                                    b2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.e5.u0(xb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    wb0 wb0Var = xb0Var32.T;
                                                                                    if (wb0Var != null) {
                                                                                        wb0Var.c(tLObject);
                                                                                    }
                                                                                    xb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                xb0 xb0Var4 = xb0Var2;
                                                                                xb0Var4.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var42 = xb0Var4.U;
                                                                                if (b2Var42 != null) {
                                                                                    b2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.e5.u0(xb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        xb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    wb0 wb0Var2 = xb0Var4.T;
                                                                                    if (wb0Var2 != null) {
                                                                                        wb0Var2.b(xb0Var4.e, tLObject2);
                                                                                    }
                                                                                    xb0Var4.finishFragment();
                                                                                    break;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                break;
                                                            default:
                                                                final int i162 = 1;
                                                                final xb0 xb0Var3 = xb0Var;
                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pb0
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i162) {
                                                                            case 0:
                                                                                xb0 xb0Var32 = xb0Var3;
                                                                                xb0Var32.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var32 = xb0Var32.U;
                                                                                if (b2Var32 != null) {
                                                                                    b2Var32.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error2 = tL_error;
                                                                                if (tL_error2 != null) {
                                                                                    org.telegram.ui.Components.e5.u0(xb0Var32, null, tL_error2.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    wb0 wb0Var = xb0Var32.T;
                                                                                    if (wb0Var != null) {
                                                                                        wb0Var.c(tLObject);
                                                                                    }
                                                                                    xb0Var32.finishFragment();
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                xb0 xb0Var4 = xb0Var3;
                                                                                xb0Var4.V = false;
                                                                                org.telegram.ui.ActionBar.b2 b2Var42 = xb0Var4.U;
                                                                                if (b2Var42 != null) {
                                                                                    b2Var42.dismiss();
                                                                                }
                                                                                TLRPC.TL_error tL_error3 = tL_error;
                                                                                if (tL_error3 != null) {
                                                                                    org.telegram.ui.Components.e5.u0(xb0Var4, null, tL_error3.text, null);
                                                                                    break;
                                                                                } else {
                                                                                    TLObject tLObject2 = tLObject;
                                                                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                        xb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                    }
                                                                                    wb0 wb0Var2 = xb0Var4.T;
                                                                                    if (wb0Var2 != null) {
                                                                                        wb0Var2.b(xb0Var4.e, tLObject2);
                                                                                    }
                                                                                    xb0Var4.finishFragment();
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
                                                xb0Var.finishFragment();
                                                break;
                                            }
                                        } else {
                                            if (xb0Var.e.usage_limit != 0) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                                z10 = true;
                                            }
                                            z11 = xb0Var.e.request_needed;
                                            ub0Var = xb0Var.f;
                                            if (z11 != (ub0Var == null && ub0Var.e.h)) {
                                            }
                                            obj = xb0Var.K.getText().toString();
                                            if (!TextUtils.equals(xb0Var.e.title, obj)) {
                                            }
                                            if (!z10) {
                                            }
                                        }
                                    }
                                }
                                j3 = 0;
                                i13 = xb0Var.a;
                                if (i13 != 0) {
                                }
                            }
                        }
                        break;
                    default:
                        xb0 xb0Var2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xb0Var2.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new nb0(xb0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        xb0Var2.showDialog(alertDialog$Builder.a);
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
        this.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        w7.z5.a(this.M);
        this.actionBar.addView(this.M, w7.x5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        sb0 sb0Var = new sb0(this, context);
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0(context, sb0Var, this.resourceProvider, true);
        this.J = zn0Var;
        this.actionBar.setAdaptiveBackground(zn0Var);
        w8 w8Var = new w8(this, context, i11);
        this.fragmentView = w8Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        layoutTransition.setInterpolator(2, prVar);
        layoutTransition.setInterpolator(0, prVar);
        layoutTransition.setInterpolator(4, prVar);
        layoutTransition.setInterpolator(1, prVar);
        int i13 = 3;
        layoutTransition.setInterpolator(3, prVar);
        sb0Var.setLayoutTransition(layoutTransition);
        sb0Var.setOrientation(1);
        sb0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.J.addView(sb0Var);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.x = l4Var;
        l4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        sb0Var.addView(this.x);
        org.telegram.ui.Components.sv0 sv0Var = new org.telegram.ui.Components.sv0(context, null);
        this.d = sv0Var;
        sb0Var.addView(sv0Var);
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.w.setGravity(16);
        this.w.setTextSize(1, 16.0f);
        this.w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.w.setOnClickListener(new tv(14, this, context));
        this.d.setCallback(new nb0(this, 2));
        ArrayList arrayList = this.P;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            int[] iArr = this.Q;
            if (i14 >= iArr.length) {
                break;
            }
            i14 = com.google.android.gms.internal.vision.e2.e(iArr[i14], i14, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        sb0Var.addView(this.w, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.y = e9Var;
        e9Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        sb0Var.addView(this.y);
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
        this.E = l4Var2;
        l4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        sb0Var.addView(this.E);
        org.telegram.ui.Components.sv0 sv0Var2 = new org.telegram.ui.Components.sv0(context, null);
        this.c = sv0Var2;
        sv0Var2.setCallback(new nb0(this, i13));
        X();
        sb0Var.addView(this.c);
        tb0 tb0Var = new tb0(context, 0);
        this.F = tb0Var;
        tb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.F.setGravity(16);
        this.F.setTextSize(1, 16.0f);
        this.F.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.F.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.F.setInputType(2);
        this.F.addTextChangedListener(new rb0(this, 1));
        sb0Var.addView(this.F, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.G = e9Var2;
        e9Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        sb0Var.addView(this.G);
        MessagesController messagesController = getMessagesController();
        long j3 = this.b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        ub0 ub0Var = new ub0(context);
        this.f = ub0Var;
        int i15 = org.telegram.ui.ActionBar.j6.d6;
        ub0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f.setTag(Integer.valueOf(i15));
        this.f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f.setOnClickListener(new bi.w2(7, this, z10));
        sb0Var.addView(this.f, w7.x5.n(-1, 56));
        org.telegram.ui.Cells.e9 e9Var3 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.h = e9Var3;
        if (z10) {
            this.f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            e9Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        sb0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j3);
            if ((this.e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context);
                this.n = w8Var2;
                w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                this.n.setDrawCheckRipple(true);
                this.n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.e != null) {
                    this.n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.n.setEnabled(false);
                }
                this.n.setOnClickListener(new tv(15, this, new Runnable[1]));
                sb0Var.addView(this.n, w7.x5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
                vb0 vb0Var = new vb0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.r = vb0Var;
                vb0Var.b.setInputType(2);
                this.r.b.setRawInputType(2);
                this.r.setBackgroundColor(getThemedColor(i15));
                vb0 vb0Var2 = this.r;
                vb0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(vb0Var2, 4);
                org.telegram.ui.Cells.g3 g3Var = vb0Var2.b;
                g3Var.setImeOptions(6);
                g3Var.setOnEditorActionListener(new m.s2(gVar, 2));
                this.r.addView(this.s, w7.x5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                vb0 vb0Var3 = this.r;
                Drawable mutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                vb0Var3.getClass();
                ImageView imageView = new ImageView(vb0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(mutate);
                vb0Var3.addView(imageView, w7.x5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.g3 g3Var2 = vb0Var3.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                g3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                sb0Var.addView(this.r, w7.x5.n(-1, 48));
                this.r.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
                this.v = e9Var4;
                if (this.e != null) {
                    e9Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    e9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new mb0(this, 2)));
                }
                sb0Var.addView(this.v, w7.x5.n(-1, -2));
            }
        }
        tb0 tb0Var2 = new tb0(context, 1);
        this.K = tb0Var2;
        tb0Var2.addTextChangedListener(new rb0(this, 0));
        this.K.setCursorVisible(false);
        this.K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.K.setGravity(16);
        this.K.setHint(LocaleController.getString(R.string.LinkNameHint));
        tb0 tb0Var3 = this.K;
        int i16 = org.telegram.ui.ActionBar.j6.y6;
        tb0Var3.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.K.setLines(1);
        this.K.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.K.setSingleLine();
        tb0 tb0Var4 = this.K;
        int i17 = org.telegram.ui.ActionBar.j6.G6;
        tb0Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.K.setTextSize(1, 16.0f);
        sb0Var.addView(this.K, w7.x5.n(-1, 50));
        org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.L = e9Var5;
        e9Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        sb0Var.addView(this.L);
        if (i10 == 1) {
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            this.I = eaVar;
            eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.I.b(LocaleController.getString(R.string.RevokeLink), false);
            this.I.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
            final int i18 = 1;
            this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qb0
                public final /* synthetic */ xb0 b;

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
                    ub0 ub0Var2;
                    String obj;
                    switch (i18) {
                        case 0:
                            final xb0 xb0Var = this.b;
                            long j10 = xb0Var.b;
                            ArrayList arrayList2 = xb0Var.R;
                            ArrayList arrayList22 = xb0Var.P;
                            if (!xb0Var.V) {
                                int selectedIndex = xb0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList22.size() && ((Integer) arrayList22.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(xb0Var.w);
                                    Vibrator vibrator = (Vibrator) xb0Var.w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Cells.w8 w8Var3 = xb0Var.n;
                                    if (w8Var3 != null && w8Var3.e.h) {
                                        try {
                                            j32 = Long.parseLong(xb0Var.r.b.getText().toString());
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        i132 = xb0Var.a;
                                        if (i132 != 0) {
                                            org.telegram.ui.ActionBar.b2 b2Var = xb0Var.U;
                                            if (b2Var != null) {
                                                b2Var.dismiss();
                                            }
                                            xb0Var.V = true;
                                            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(xb0Var.getParentActivity(), 3, null);
                                            xb0Var.U = b2Var2;
                                            b2Var2.q(500L);
                                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                            tL_messages_exportChatInvite.peer = xb0Var.getMessagesController().getInputPeer(-j10);
                                            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                            int selectedIndex2 = xb0Var.d.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 1;
                                            if (selectedIndex2 < arrayList22.size()) {
                                                tL_messages_exportChatInvite.expire_date = xb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex2)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.expire_date = 0;
                                            }
                                            int selectedIndex3 = xb0Var.c.getSelectedIndex();
                                            tL_messages_exportChatInvite.flags |= 2;
                                            if (selectedIndex3 < arrayList2.size()) {
                                                tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                            } else {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            ub0 ub0Var22 = xb0Var.f;
                                            boolean z12 = ub0Var22 != null && ub0Var22.e.h;
                                            tL_messages_exportChatInvite.request_needed = z12;
                                            if (z12) {
                                                tL_messages_exportChatInvite.usage_limit = 0;
                                            }
                                            String obj2 = xb0Var.K.getText().toString();
                                            tL_messages_exportChatInvite.title = obj2;
                                            if (!TextUtils.isEmpty(obj2)) {
                                                tL_messages_exportChatInvite.flags |= 16;
                                            }
                                            if (j32 > 0) {
                                                tL_messages_exportChatInvite.flags |= 32;
                                                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                                tL_starsSubscriptionPricing.period = xb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                                tL_messages_exportChatInvite.subscription_pricing.amount = j32;
                                            }
                                            final int i142 = 0;
                                            xb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ob0
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i142) {
                                                        case 0:
                                                            final int i152 = 0;
                                                            final xb0 xb0Var2 = xb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pb0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i152) {
                                                                        case 0:
                                                                            xb0 xb0Var32 = xb0Var2;
                                                                            xb0Var32.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var32 = xb0Var32.U;
                                                                            if (b2Var32 != null) {
                                                                                b2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.e5.u0(xb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                wb0 wb0Var = xb0Var32.T;
                                                                                if (wb0Var != null) {
                                                                                    wb0Var.c(tLObject);
                                                                                }
                                                                                xb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            xb0 xb0Var4 = xb0Var2;
                                                                            xb0Var4.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var42 = xb0Var4.U;
                                                                            if (b2Var42 != null) {
                                                                                b2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.e5.u0(xb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    xb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                wb0 wb0Var2 = xb0Var4.T;
                                                                                if (wb0Var2 != null) {
                                                                                    wb0Var2.b(xb0Var4.e, tLObject2);
                                                                                }
                                                                                xb0Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i162 = 1;
                                                            final xb0 xb0Var3 = xb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pb0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i162) {
                                                                        case 0:
                                                                            xb0 xb0Var32 = xb0Var3;
                                                                            xb0Var32.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var32 = xb0Var32.U;
                                                                            if (b2Var32 != null) {
                                                                                b2Var32.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.e5.u0(xb0Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                wb0 wb0Var = xb0Var32.T;
                                                                                if (wb0Var != null) {
                                                                                    wb0Var.c(tLObject);
                                                                                }
                                                                                xb0Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            xb0 xb0Var4 = xb0Var3;
                                                                            xb0Var4.V = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var42 = xb0Var4.U;
                                                                            if (b2Var42 != null) {
                                                                                b2Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.e5.u0(xb0Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    xb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                wb0 wb0Var2 = xb0Var4.T;
                                                                                if (wb0Var2 != null) {
                                                                                    wb0Var2.b(xb0Var4.e, tLObject2);
                                                                                }
                                                                                xb0Var4.finishFragment();
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
                                            org.telegram.ui.ActionBar.b2 b2Var3 = xb0Var.U;
                                            if (b2Var3 != null) {
                                                b2Var3.dismiss();
                                            }
                                            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                            tL_messages_editExportedChatInvite.link = xb0Var.e.link;
                                            tL_messages_editExportedChatInvite.revoked = false;
                                            tL_messages_editExportedChatInvite.peer = xb0Var.getMessagesController().getInputPeer(-j10);
                                            int selectedIndex4 = xb0Var.d.getSelectedIndex();
                                            if (selectedIndex4 < arrayList22.size()) {
                                                if (xb0Var.W != ((Integer) arrayList22.get(selectedIndex4)).intValue()) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = xb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList22.get(selectedIndex4)).intValue();
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            } else {
                                                if (xb0Var.W != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 1;
                                                    tL_messages_editExportedChatInvite.expire_date = 0;
                                                    z102 = true;
                                                }
                                                z102 = false;
                                            }
                                            int selectedIndex5 = xb0Var.c.getSelectedIndex();
                                            if (selectedIndex5 < arrayList2.size()) {
                                                int intValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                                if (xb0Var.e.usage_limit != intValue) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = intValue;
                                                    z102 = true;
                                                }
                                                z11 = xb0Var.e.request_needed;
                                                ub0Var2 = xb0Var.f;
                                                if (z11 != (ub0Var2 == null && ub0Var2.e.h)) {
                                                    int i152 = tL_messages_editExportedChatInvite.flags;
                                                    tL_messages_editExportedChatInvite.flags = i152 | 8;
                                                    boolean z13 = ub0Var2 != null && ub0Var2.e.h;
                                                    tL_messages_editExportedChatInvite.request_needed = z13;
                                                    if (z13) {
                                                        tL_messages_editExportedChatInvite.flags = i152 | 10;
                                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    }
                                                    z102 = true;
                                                }
                                                obj = xb0Var.K.getText().toString();
                                                if (!TextUtils.equals(xb0Var.e.title, obj)) {
                                                    tL_messages_editExportedChatInvite.title = obj;
                                                    tL_messages_editExportedChatInvite.flags |= 16;
                                                    z102 = true;
                                                }
                                                if (!z102) {
                                                    xb0Var.V = true;
                                                    org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(xb0Var.getParentActivity(), 3, null);
                                                    xb0Var.U = b2Var4;
                                                    b2Var4.q(500L);
                                                    final int i162 = 1;
                                                    xb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.ob0
                                                        @Override // org.telegram.tgnet.RequestDelegate
                                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                            switch (i162) {
                                                                case 0:
                                                                    final int i1522 = 0;
                                                                    final xb0 xb0Var2 = xb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pb0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1522) {
                                                                                case 0:
                                                                                    xb0 xb0Var32 = xb0Var2;
                                                                                    xb0Var32.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var32 = xb0Var32.U;
                                                                                    if (b2Var32 != null) {
                                                                                        b2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.e5.u0(xb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        wb0 wb0Var = xb0Var32.T;
                                                                                        if (wb0Var != null) {
                                                                                            wb0Var.c(tLObject);
                                                                                        }
                                                                                        xb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    xb0 xb0Var4 = xb0Var2;
                                                                                    xb0Var4.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var42 = xb0Var4.U;
                                                                                    if (b2Var42 != null) {
                                                                                        b2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.e5.u0(xb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            xb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        wb0 wb0Var2 = xb0Var4.T;
                                                                                        if (wb0Var2 != null) {
                                                                                            wb0Var2.b(xb0Var4.e, tLObject2);
                                                                                        }
                                                                                        xb0Var4.finishFragment();
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    break;
                                                                default:
                                                                    final int i1622 = 1;
                                                                    final xb0 xb0Var3 = xb0Var;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pb0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i1622) {
                                                                                case 0:
                                                                                    xb0 xb0Var32 = xb0Var3;
                                                                                    xb0Var32.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var32 = xb0Var32.U;
                                                                                    if (b2Var32 != null) {
                                                                                        b2Var32.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                                    if (tL_error2 != null) {
                                                                                        org.telegram.ui.Components.e5.u0(xb0Var32, null, tL_error2.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        wb0 wb0Var = xb0Var32.T;
                                                                                        if (wb0Var != null) {
                                                                                            wb0Var.c(tLObject);
                                                                                        }
                                                                                        xb0Var32.finishFragment();
                                                                                        break;
                                                                                    }
                                                                                default:
                                                                                    xb0 xb0Var4 = xb0Var3;
                                                                                    xb0Var4.V = false;
                                                                                    org.telegram.ui.ActionBar.b2 b2Var42 = xb0Var4.U;
                                                                                    if (b2Var42 != null) {
                                                                                        b2Var42.dismiss();
                                                                                    }
                                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                                    if (tL_error3 != null) {
                                                                                        org.telegram.ui.Components.e5.u0(xb0Var4, null, tL_error3.text, null);
                                                                                        break;
                                                                                    } else {
                                                                                        TLObject tLObject2 = tLObject;
                                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                            xb0Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                        }
                                                                                        wb0 wb0Var2 = xb0Var4.T;
                                                                                        if (wb0Var2 != null) {
                                                                                            wb0Var2.b(xb0Var4.e, tLObject2);
                                                                                        }
                                                                                        xb0Var4.finishFragment();
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
                                                    xb0Var.finishFragment();
                                                    break;
                                                }
                                            } else {
                                                if (xb0Var.e.usage_limit != 0) {
                                                    tL_messages_editExportedChatInvite.flags |= 2;
                                                    tL_messages_editExportedChatInvite.usage_limit = 0;
                                                    z102 = true;
                                                }
                                                z11 = xb0Var.e.request_needed;
                                                ub0Var2 = xb0Var.f;
                                                if (z11 != (ub0Var2 == null && ub0Var2.e.h)) {
                                                }
                                                obj = xb0Var.K.getText().toString();
                                                if (!TextUtils.equals(xb0Var.e.title, obj)) {
                                                }
                                                if (!z102) {
                                                }
                                            }
                                        }
                                    }
                                    j32 = 0;
                                    i132 = xb0Var.a;
                                    if (i132 != 0) {
                                    }
                                }
                            }
                            break;
                        default:
                            xb0 xb0Var2 = this.b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xb0Var2.getParentActivity());
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new nb0(xb0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            xb0Var2.showDialog(alertDialog$Builder.a);
                            break;
                    }
                }
            });
            sb0Var.addView(this.I);
        }
        w8Var.addView(this.J, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        int i19 = org.telegram.ui.ActionBar.j6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i19));
        new di.j4(w8Var, false, new org.telegram.ui.ActionBar.j3(4));
        w8Var.addView(this.H, w7.x5.e(-1, -2, 80));
        this.x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.w.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.E.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.c.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.F.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.K.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.F.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        this.F.setCursorVisible(false);
        Y(this.e);
        w8Var.setClipChildren(false);
        this.J.setClipChildren(false);
        sb0Var.setClipChildren(false);
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
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.l4 l4Var = this.x;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(l4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.p7));
        return arrayList;
    }
}
