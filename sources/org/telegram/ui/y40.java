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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y40 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ v50 b;

    public y40(v50 v50Var, Activity activity) {
        this.b = v50Var;
        this.a = activity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        VoIPService sharedInstance;
        int x02;
        v50 v50Var = this.b;
        if (i10 == -1) {
            v50Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            v50Var.a1.call.join_muted = false;
            v50.F0(v50Var);
            return;
        }
        if (i10 == 2) {
            v50Var.a1.call.join_muted = true;
            v50.F0(v50Var);
            return;
        }
        if (i10 == 3) {
            v50Var.j1(false);
            return;
        }
        if (i10 == 12) {
            v50.G0(v50Var, true);
            return;
        }
        if (i10 == 13) {
            v50.G0(v50Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v50Var.getContext());
            if (ChatObject.isChannelOrGiga(v50Var.Z0)) {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.a.I = org.telegram.ui.ActionBar.y6.pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new s40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ug, false);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.j(x03);
            e2Var.show();
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.vg, null);
            }
            e2Var.p(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hg, false));
            return;
        }
        if (i10 == 9) {
            v50Var.m1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = v50Var.a1;
            if (!call.recording) {
                u40 u40Var = new u40(this, v50Var.getContext(), v50Var.Z0, v50Var.I2);
                if (v50Var.r1()) {
                    u40Var.n(2);
                    return;
                } else {
                    u40Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(v50Var.getContext());
            alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.y6.pg;
            alertDialog$Builder2.a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(v50Var.Z0)) {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new di.f(11, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ug, false);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
            e2Var2.j(x04);
            e2Var2.show();
            e2Var2.p(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ng, false));
            return;
        }
        if (i10 == 7) {
            v50Var.l0 = true;
            v50Var.u1.setVisibility(0);
            v50Var.v1.setVisibility(0);
            v50Var.n1.setVisibility(8);
            v50Var.x1.setVisibility(8);
            v50Var.y1.setVisibility(8);
            v50Var.w1.setVisibility(8);
            v50Var.r1.setVisibility(8);
            v50Var.o1.setVisibility(8);
            v50Var.s1.setVisibility(8);
            v50Var.t1.setVisibility(8);
            v50Var.k0.setVisibility(8);
            v50Var.p1.setVisibility(8);
            v50Var.q1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = v50Var.k1;
            org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
            if (o1Var == null || !o1Var.isShowing()) {
                return;
            }
            w0Var.b.measure(org.telegram.messenger.vh.x(40.0f, AndroidUtilities.displaySize.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
            w0Var.W(true, true);
            return;
        }
        if (i10 == 6) {
            v50Var.w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(v50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.T(v50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(v50Var.getContext());
            alertDialog$Builder3.a.I = org.telegram.ui.ActionBar.y6.pg;
            if (ChatObject.isChannelOrGiga(v50Var.Z0)) {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.a.A0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new fz(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(v50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.y6.ng;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i11, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = v50Var.Z0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.og, null);
            org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i11, null);
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, org.telegram.ui.Components.gb1.x(-1, 36, 51, 24, 6, 24, 0));
            int i12 = 1;
            editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder3, i12));
            editTextBoldCursor.addTextChangedListener(new iz(editTextBoldCursor, i12));
            if (!TextUtils.isEmpty(v50Var.a1.call.title)) {
                editTextBoldCursor.setText(v50Var.a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new e7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.fg, false);
            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.a;
            e2Var3.j(x05);
            e2Var3.setOnShowListener(new t40(this, e2Var3, editTextBoldCursor, 0));
            e2Var3.setOnDismissListener(new hz(editTextBoldCursor, 1));
            e2Var3.show();
            e2Var3.p(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.t80.u(v50Var.getContext(), -v50Var.i1(), v50Var.d, null, 2, v50Var.A0, new s40(this));
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
            d3.n(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String str = sharedInstance.currentBluetoothDeviceName;
            if (str == null) {
                str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(str);
            d3.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            charSequenceArr[i13] = (CharSequence) arrayList.get(i13);
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) this.a, (org.telegram.ui.ActionBar.u6) null, false);
        k3Var.fixNavigationBar();
        k3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        k3Var.bigTitle = true;
        ng.j jVar = new ng.j(8, this, arrayList3);
        k3Var.items = charSequenceArr;
        k3Var.itemIcons = iArr;
        k3Var.onClickListener = jVar;
        int i14 = org.telegram.ui.ActionBar.y6.kg;
        k3Var.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i14, false));
        k3Var.fixNavigationBar(org.telegram.ui.ActionBar.y6.x0(null, i14, false));
        int i15 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        k3Var.show();
        k3Var.setTitleColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ng, false));
        for (int i16 = 0; i16 < k3Var.getItemViews().size(); i16++) {
            org.telegram.ui.ActionBar.c3 c3Var = k3Var.getItemViews().get(i16);
            if (i16 == i15) {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.pg, false);
                c3Var.f = true;
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ng, false);
            }
            c3Var.setTextColor(x02);
            c3Var.setIconColor(x02);
            int i17 = org.telegram.ui.ActionBar.y6.hg;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i17, false), 12), 2, -1);
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i17, 12);
            c3Var.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(c3Var, g02, null, h, null);
        }
    }
}
