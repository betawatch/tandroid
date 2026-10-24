package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class w40 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ u50 b;

    public w40(u50 u50Var, Activity activity) {
        this.b = u50Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        VoIPService sharedInstance;
        int x02;
        u50 u50Var = this.b;
        if (i10 == -1) {
            u50Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            u50Var.a1.call.join_muted = false;
            u50.F0(u50Var);
            return;
        }
        if (i10 == 2) {
            u50Var.a1.call.join_muted = true;
            u50.F0(u50Var);
            return;
        }
        if (i10 == 3) {
            u50Var.j1(false);
            return;
        }
        if (i10 == 12) {
            u50.G0(u50Var, true);
            return;
        }
        if (i10 == 13) {
            u50.G0(u50Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u50Var.getContext());
            if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.I = org.telegram.ui.ActionBar.k6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new q40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ug, false);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.j(x03);
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.vg, null);
            }
            c2Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hg, false));
            return;
        }
        if (i10 == 9) {
            u50Var.m1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = u50Var.a1;
            if (!call.recording) {
                s40 s40Var = new s40(this, u50Var.getContext(), u50Var.Z0, u50Var.I2);
                if (u50Var.r1()) {
                    s40Var.n(2);
                    return;
                } else {
                    s40Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(u50Var.getContext());
            alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.k6.pg;
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ci.f(11, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ug, false);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.j(x04);
            c2Var2.show();
            c2Var2.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ng, false));
            return;
        }
        if (i10 == 7) {
            u50Var.l0 = true;
            u50Var.u1.setVisibility(0);
            u50Var.v1.setVisibility(0);
            u50Var.n1.setVisibility(8);
            u50Var.x1.setVisibility(8);
            u50Var.y1.setVisibility(8);
            u50Var.w1.setVisibility(8);
            u50Var.r1.setVisibility(8);
            u50Var.o1.setVisibility(8);
            u50Var.s1.setVisibility(8);
            u50Var.t1.setVisibility(8);
            u50Var.k0.setVisibility(8);
            u50Var.p1.setVisibility(8);
            u50Var.q1.setVisibility(8);
            org.telegram.ui.ActionBar.u0 u0Var = u50Var.k1;
            org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
            if (m1Var == null || !m1Var.isShowing()) {
                return;
            }
            u0Var.b.measure(org.telegram.messenger.sl.c(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            u0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            u50Var.w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(u50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.T(u50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(u50Var.getContext());
            alertDialog$Builder3.a.I = org.telegram.ui.ActionBar.k6.pg;
            if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.A0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new iz(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(u50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.k6.ng;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i11, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = u50Var.Z0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            org.telegram.ui.ActionBar.r6.F(editTextBoldCursor, org.telegram.ui.ActionBar.k6.og, null);
            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i11, null);
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
            int i12 = 1;
            editTextBoldCursor.setOnEditorActionListener(new jz(alertDialog$Builder3, i12));
            editTextBoldCursor.addTextChangedListener(new lz(editTextBoldCursor, i12));
            if (!TextUtils.isEmpty(u50Var.a1.call.title)) {
                editTextBoldCursor.setText(u50Var.a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new e7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.fg, false);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
            c2Var3.j(x05);
            c2Var3.setOnShowListener(new r40(this, c2Var3, editTextBoldCursor, 0));
            c2Var3.setOnDismissListener(new kz(editTextBoldCursor, 1));
            c2Var3.show();
            c2Var3.p(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.s80.v(u50Var.getContext(), -u50Var.i1(), u50Var.d, null, 2, u50Var.A0, new q40(this));
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            return;
        }
        if (i10 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(LocaleController.getString(sharedInstance.isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
            org.telegram.ui.Cells.b1.n(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(str);
            org.telegram.ui.Cells.b1.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            charSequenceArr[i13] = (CharSequence) arrayList.get(i13);
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) this.a, (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        h3Var.bigTitle = true;
        mg.j jVar = new mg.j(8, this, arrayList3);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = jVar;
        int i14 = org.telegram.ui.ActionBar.k6.kg;
        h3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        int i15 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        h3Var.show();
        h3Var.setTitleColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ng, false));
        for (int i16 = 0; i16 < h3Var.getItemViews().size(); i16++) {
            org.telegram.ui.ActionBar.z2 z2Var = h3Var.getItemViews().get(i16);
            if (i16 == i15) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.pg, false);
                z2Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ng, false);
            }
            z2Var.setTextColor(x02);
            z2Var.setIconColor(x02);
            int i17 = org.telegram.ui.ActionBar.k6.hg;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 12), 2, -1);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i17, 12);
            z2Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(z2Var, g02, null, h, null);
        }
    }
}
