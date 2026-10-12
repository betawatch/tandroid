package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tt implements Runnable {
    public final /* synthetic */ xt a;

    public tt(xt xtVar) {
        this.a = xtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x065d, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r0) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0987, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r6) != false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0dba  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        vt vtVar;
        vt vtVar2;
        int i13;
        vt vtVar3;
        int i14;
        vt vtVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        ah.v vVar;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ah.v vVar2;
        ah.v vVar3;
        float f7;
        ah.v vVar4;
        float f10;
        ah.v vVar5;
        ah.v vVar6;
        int i15;
        float f11;
        float f12;
        ah.v vVar7;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i16;
        TLRPC.Document document3;
        vt vtVar5;
        TLRPC.Document document4;
        vt vtVar6;
        vt vtVar7;
        vt vtVar8;
        vt vtVar9;
        int i17;
        vt vtVar10;
        TLRPC.Document document5;
        vt vtVar11;
        TLRPC.Document document6;
        vt vtVar12;
        TLRPC.Document document7;
        int i18;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ah.v vVar8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ah.v vVar9;
        ah.v vVar10;
        float f13;
        ah.v vVar11;
        float f14;
        ah.v vVar12;
        ah.v vVar13;
        float f15;
        float f16;
        ah.v vVar14;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.Document document10;
        int i19;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i20;
        TLRPC.Document document13;
        vt vtVar13;
        TLRPC.Document document14;
        vt vtVar14;
        ah.v vVar15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i21;
        ah.v vVar16;
        ah.v vVar17;
        float min;
        int i22;
        ah.v vVar18;
        ah.v vVar19;
        float f17;
        ah.v vVar20;
        ah.v vVar21;
        ah.v vVar22;
        ah.v vVar23;
        ah.v vVar24;
        ah.v vVar25;
        org.telegram.ui.ActionBar.c6 c6Var3;
        TLRPC.Document document15;
        int i23;
        vt vtVar15;
        vt vtVar16;
        vt vtVar17;
        vt vtVar18;
        TLRPC.InputStickerSet inputStickerSet;
        vt vtVar19;
        int i24;
        TLRPC.Document document16;
        vt vtVar20;
        int i25;
        vt vtVar21;
        int i26;
        vt vtVar22;
        vt vtVar23;
        vt vtVar24;
        vt vtVar25;
        int i27;
        boolean z11;
        ah.v vVar26;
        ah.v vVar27;
        int i28;
        kc1 kc1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ah.v vVar28;
        org.telegram.ui.Components.m80 u10;
        TLRPC.Document unused;
        xt xtVar = this.a;
        bh.b bVar10 = xtVar.t;
        if (xtVar.w == null || xtVar.m) {
            return;
        }
        xtVar.R = true;
        vt vtVar26 = xtVar.l;
        final int i29 = 0;
        if (vtVar26 != null && (u10 = vtVar26.u(xtVar.z)) != null) {
            u10.Q(bVar10, fh.b.k(xtVar.c0), true);
            u10.t = false;
            u10.Y();
            u10.p = new gj(this, 17);
            ViewGroup viewGroup = u10.A;
            ot otVar = new ot(this, viewGroup);
            xtVar.k = otVar;
            otVar.e = true;
            otVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            otVar.g = true;
            otVar.setOutsideTouchable(true);
            xtVar.k.setClippingEnabled(true);
            xtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            xtVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            xtVar.k.setInputMethodMode(2);
            xtVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar11 = xtVar.q;
            int min2 = (Math.min(xtVar.z.getWidth(), xtVar.z.getHeight() - (bVar11.d + bVar11.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - xtVar.e) + ((int) (xtVar.e + Math.max(r3 + min2 + (xtVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((xtVar.z.getHeight() - r4) - xtVar.I) / 2) + min2)));
            xtVar.k.showAtLocation(xtVar.z, 0, (int) ((r5.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                xtVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = xtVar.e;
            if (f18 != 0.0f) {
                xtVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.nt
                    public final /* synthetic */ tt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i29) {
                            case 0:
                                xt xtVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xtVar2.g = floatValue;
                                float f19 = xtVar2.f;
                                xtVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                xtVar2.z.invalidate();
                                break;
                            case 1:
                                xt xtVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xtVar3.g = floatValue2;
                                float f20 = xtVar3.f;
                                xtVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                xtVar3.z.invalidate();
                                break;
                            default:
                                xt xtVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xtVar4.g = floatValue3;
                                float f21 = xtVar4.f;
                                xtVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                xtVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.es.f);
                ofFloat.start();
            }
            xtVar.K = true;
            return;
        }
        if (xtVar.V != 3) {
            vt vtVar27 = xtVar.l;
            if (vtVar27 != null) {
                TLRPC.TL_messageMediaPoll d = vtVar27.d();
                TLRPC.PollAnswer h = xtVar.l.h();
                if (d != null && d.poll != null && h != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, xtVar.z.getContext(), xtVar.c0);
            org.telegram.ui.ActionBar.c6 c6Var4 = null;
            dh.d c10 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(fh.b.k(xtVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            int i30 = 6;
            int i31 = 7;
            if (xtVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (xtVar.T == null) {
                    vt vtVar28 = xtVar.l;
                    if (vtVar28 == null || !vtVar28.B()) {
                        if (xtVar.l.y()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.d0.o(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.d0.o(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.d0.o(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                vt vtVar29 = xtVar.l;
                if (vtVar29 == null || !vtVar29.B()) {
                    vt vtVar30 = xtVar.l;
                    arrayList.add(LocaleController.getString((vtVar30 == null || !vtVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    vt vtVar31 = xtVar.l;
                    org.telegram.ui.Cells.d0.o((vtVar31 == null || !vtVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, xtVar.w, xtVar.c0, true, false);
                e1Var.setItemHeight(44);
                e1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                e1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(xtVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(xtVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, xtVar.c0));
                linearLayout.setOrientation(1);
                if (xtVar.w == null) {
                    kc1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(xtVar.r).sendRequest(tL_messages_getMyStickers, new fa(xtVar, arrayList4, tL_messages_getMyStickers, i31));
                    kc1Var = new kc1(xtVar.w, i31, c6Var4);
                    kc1Var.setLayoutManager(new s4.b0());
                    kc1Var.i(new di.q1(arrayList4, 4));
                    kc1Var.setAdapter(new ut(xtVar, arrayList4));
                }
                kc1Var.setOnItemClickListener(new i(this, i30));
                frameLayout.addView(e1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.j1(xtVar.z.getContext(), xtVar.c0), w7.a6.n(-1, 8));
                kc1 kc1Var2 = kc1Var;
                bi.l0 l0Var = new bi.l0(this, arrayList2, kc1Var2, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i32 = 0; i32 < arrayList.size(); i32++) {
                    org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i32)).intValue(), (CharSequence) arrayList.get(i32), false, xtVar.c0);
                    c11.setTag(Integer.valueOf(i32));
                    c11.setOnClickListener(l0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(kc1Var2, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new zf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar12 = xtVar.q;
                int i33 = bVar12.d + bVar12.b;
                int min3 = ((int) (Math.min(xtVar.z.getWidth(), xtVar.z.getHeight() - i33) / 1.8f)) / 2;
                xtVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.a6.a(-2.0f, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((xtVar.e + Math.max(r0 + min3, ((xtVar.z.getHeight() - i33) - xtVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f, -2, 49));
                xtVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                xtVar.L.setAlpha(0.0f);
                view = xtVar.L;
                view.setScaleX(0.8f);
                view2 = xtVar.L;
                view2.setScaleY(0.8f);
                view3 = xtVar.L;
                view3.setPivotY(0.0f);
                view4 = xtVar.L;
                view5 = xtVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = xtVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.es.h).start();
                if (xtVar.P == null) {
                    org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(xtVar, xtVar.z.getContext(), UserConfig.selectedAccount, xtVar.c0);
                    xtVar.P = bcVar;
                    bcVar.N0 = true;
                    bcVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    xtVar.P.setClipChildren(false);
                    xtVar.P.setClipToPadding(false);
                    xtVar.P.setVisibility(0);
                    xtVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    xtVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    xtVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(xtVar.z.getContext());
                    xtVar.Q = frameLayout2;
                    frameLayout2.addView(xtVar.P, w7.a6.a(116.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                    xtVar.z.addView(xtVar.Q, w7.a6.a(-2.0f, 0.0f, 100.0f, 0.0f, 0.0f, -2, 1));
                }
                xtVar.P.setSelectedEmojis(xtVar.o);
                xtVar.P.setDelegate(new kt(xtVar));
                xtVar.P.p(null, null, false);
                xtVar.Q.setScaleY(0.6f);
                xtVar.Q.setScaleX(0.6f);
                xtVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new jt(xtVar, 2), 10L);
                xtVar.K = true;
                vVar28 = xtVar.z;
                vVar28.invalidate();
            } else {
                int i34 = 0;
                i11 = xtVar.V;
                if (i11 != 0) {
                    i12 = xtVar.V;
                    if (i12 == 2) {
                        vtVar8 = xtVar.l;
                        if (vtVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            vtVar9 = xtVar.l;
                            i17 = xtVar.V;
                            if (vtVar9.l(i17)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.d0.o(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            vtVar10 = xtVar.l;
                            document5 = xtVar.W;
                            Boolean P = vtVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.d0.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.d0.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            vtVar11 = xtVar.l;
                            document6 = xtVar.W;
                            if (vtVar11.E(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.d0.o(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            vtVar12 = xtVar.l;
                            document7 = xtVar.W;
                            if (vtVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.d0.o(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i18 = xtVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i18);
                            document8 = xtVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = xtVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = xtVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i19 = xtVar.r;
                                        if (MediaDataController.getInstance(i19).canAddStickerToFavorites()) {
                                            document11 = xtVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.d0.o(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            xtVar.K = true;
                            vVar8 = xtVar.z;
                            vVar8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(this, arrayList6, isStickerInFavorites);
                            boolean h10 = xt.h(xtVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z12 = !h10 && i36 == 0;
                                boolean z13 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                c6Var2 = xtVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(z12, z13, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, c6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c12.setIconColor(xt.d(xtVar, org.telegram.ui.ActionBar.g6.p7));
                                    c12.setTextColor(xt.d(xtVar, org.telegram.ui.ActionBar.g6.q7));
                                }
                                c12.setTag(Integer.valueOf(i36));
                                c12.setOnClickListener(xc0Var);
                                i36++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            rt rtVar = new rt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            xtVar.k = rtVar;
                            rtVar.e = true;
                            rtVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            rtVar.g = true;
                            rtVar.setOutsideTouchable(true);
                            xtVar.k.setClippingEnabled(true);
                            xtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            xtVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            xtVar.k.setInputMethodMode(2);
                            xtVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = xtVar.q;
                            int i37 = bVar4.d;
                            bVar5 = xtVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = xtVar.q;
                            int i39 = bVar6.b;
                            vVar9 = xtVar.z;
                            int width = vVar9.getWidth();
                            vVar10 = xtVar.z;
                            int min4 = Math.min(width, vVar10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f13 = xtVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = xtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            vVar11 = xtVar.z;
                            float max = (int) (f13 + Math.max(i41 + dp2, ((vVar11.getHeight() - i38) - xtVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = xtVar.e;
                            int i42 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.m1 m1Var = xtVar.k;
                            vVar12 = xtVar.z;
                            vVar13 = xtVar.z;
                            m1Var.showAtLocation(vVar12, 0, (int) ((vVar13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.m1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                vVar14 = xtVar.z;
                                vVar14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = xtVar.e;
                            if (f15 != 0.0f) {
                                f16 = xtVar.e;
                                xtVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final int i43 = 1;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.nt
                                    public final /* synthetic */ tt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i43) {
                                            case 0:
                                                xt xtVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                xtVar2.g = floatValue;
                                                float f19 = xtVar2.f;
                                                xtVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                                xtVar2.z.invalidate();
                                                break;
                                            case 1:
                                                xt xtVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                xtVar3.g = floatValue2;
                                                float f20 = xtVar3.f;
                                                xtVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                                xtVar3.z.invalidate();
                                                break;
                                            default:
                                                xt xtVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                xtVar4.g = floatValue3;
                                                float f21 = xtVar4.f;
                                                xtVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                                xtVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.es.f);
                                ofFloat2.start();
                            }
                            i15 = 0;
                            i28 = i15;
                            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i28);
                                if (childAt instanceof org.telegram.ui.ActionBar.e1) {
                                    ((org.telegram.ui.ActionBar.e1) childAt).k(i28 == 0 ? 1 : i15, i28 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1) ? 1 : i15);
                                }
                                i28++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    vtVar = xtVar.l;
                    if (vtVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        vtVar2 = xtVar.l;
                        i13 = xtVar.V;
                        if (vtVar2.l(i13)) {
                            vtVar7 = xtVar.l;
                            if (!vtVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.d0.o(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        vtVar3 = xtVar.l;
                        i14 = xtVar.V;
                        if (vtVar3.l(i14)) {
                            vtVar6 = xtVar.l;
                            if (!vtVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.d0.o(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        vtVar4 = xtVar.l;
                        if (vtVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.d0.o(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = xtVar.W;
                        if (document != null) {
                            vtVar5 = xtVar.l;
                            document4 = xtVar.W;
                            if (vtVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.d0.m(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = xtVar.W;
                        if (document2 != null) {
                            i16 = xtVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i16);
                            document3 = xtVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.d0.o(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.d0.o(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        xtVar.K = true;
                        vVar = xtVar.z;
                        vVar.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i44 = 0; i44 < arrayList10.size(); i44++) {
                            iArr2[i44] = ((Integer) arrayList10.get(i44)).intValue();
                        }
                        org.telegram.ui.Components.rt rtVar2 = new org.telegram.ui.Components.rt(28, this, arrayList9);
                        for (int i45 = 0; i45 < arrayList8.size(); i45++) {
                            int intValue2 = ((Integer) arrayList10.get(i45)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i45);
                            c6Var = xtVar.c0;
                            org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, c6Var);
                            c13.setTag(Integer.valueOf(i45));
                            c13.setOnClickListener(rtVar2);
                            if (z10 && i45 == arrayList8.size() - 1) {
                                c13.c(xt.d(xtVar, org.telegram.ui.ActionBar.g6.q7), xt.d(xtVar, org.telegram.ui.ActionBar.g6.p7));
                            }
                        }
                        st stVar = new st(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        xtVar.k = stVar;
                        stVar.e = true;
                        stVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        stVar.g = true;
                        stVar.setOutsideTouchable(true);
                        xtVar.k.setClippingEnabled(true);
                        xtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        xtVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        xtVar.k.setInputMethodMode(2);
                        xtVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = xtVar.q;
                        int i46 = bVar.d;
                        bVar2 = xtVar.q;
                        int i47 = i46 + bVar2.b;
                        bVar3 = xtVar.q;
                        int i48 = bVar3.b;
                        vVar2 = xtVar.z;
                        int width2 = vVar2.getWidth();
                        vVar3 = xtVar.z;
                        int min5 = Math.min(width2, vVar3.getHeight() - i47) - AndroidUtilities.dp(40.0f);
                        f7 = xtVar.e;
                        int i49 = min5 / 2;
                        int i50 = i48 + i49;
                        int dp4 = xtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        vVar4 = xtVar.z;
                        float max2 = (int) (f7 + Math.max(i50 + dp4, ((vVar4.getHeight() - i47) - xtVar.I) / 2) + i49);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = xtVar.e;
                        int i51 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.m1 m1Var2 = xtVar.k;
                        vVar5 = xtVar.z;
                        vVar6 = xtVar.z;
                        i15 = 0;
                        m1Var2.showAtLocation(vVar5, 0, (int) ((vVar6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i51);
                        try {
                            vVar7 = xtVar.z;
                            vVar7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = xtVar.e;
                        if (f11 != 0.0f) {
                            f12 = xtVar.e;
                            xtVar.f = f12;
                            final int i52 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.nt
                                public final /* synthetic */ tt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i52) {
                                        case 0:
                                            xt xtVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            xtVar2.g = floatValue;
                                            float f19 = xtVar2.f;
                                            xtVar2.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f19, floatValue, f19);
                                            xtVar2.z.invalidate();
                                            break;
                                        case 1:
                                            xt xtVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            xtVar3.g = floatValue2;
                                            float f20 = xtVar3.f;
                                            xtVar3.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f20, floatValue2, f20);
                                            xtVar3.z.invalidate();
                                            break;
                                        default:
                                            xt xtVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            xtVar4.g = floatValue3;
                                            float f21 = xtVar4.f;
                                            xtVar4.e = com.google.android.gms.internal.play_billing.k3.y(0.0f, f21, floatValue3, f21);
                                            xtVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.es.f);
                            ofFloat3.start();
                        }
                        i28 = i15;
                        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                        }
                    }
                    i15 = 0;
                    i28 = i15;
                    while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                    }
                }
                document12 = xtVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i27 = xtVar.r;
                    if (!AccountInstance.getInstance(i27).getUserConfig().isPremium()) {
                        if (xtVar.O == null) {
                            ph1 ph1Var = new ph1(xtVar.z.getContext(), xtVar.c0);
                            xtVar.O = ph1Var;
                            xtVar.z.addView(ph1Var, w7.a6.d(-1.0f, -1));
                            xtVar.O.setOnClickListener(new lt(xtVar, i34));
                            z11 = true;
                            xtVar.O.a.r.setOnClickListener(new lt(xtVar, 1 == true ? 1 : 0));
                        } else {
                            z11 = true;
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(xtVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(xtVar.O, z11);
                        xtVar.O.setTranslationY(0.0f);
                        xtVar.K = true;
                        vVar26 = xtVar.z;
                        vVar26.invalidate();
                        try {
                            vVar27 = xtVar.z;
                            vVar27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i20 = xtVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i20);
                document13 = xtVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                vtVar13 = xtVar.l;
                if (vtVar13 != null) {
                    vtVar20 = xtVar.l;
                    i25 = xtVar.V;
                    if (vtVar20.l(i25)) {
                        vtVar25 = xtVar.l;
                        if (!vtVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.d0.o(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    vtVar21 = xtVar.l;
                    i26 = xtVar.V;
                    if (vtVar21.l(i26)) {
                        vtVar24 = xtVar.l;
                        if (!vtVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.d0.m(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    vtVar22 = xtVar.l;
                    if (vtVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.d0.o(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    vtVar23 = xtVar.l;
                    if (vtVar23.g()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.d0.o(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = xtVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i24 = xtVar.r;
                        if (MediaDataController.getInstance(i24).canAddStickerToFavorites()) {
                            document16 = xtVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.d0.o(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                vtVar14 = xtVar.l;
                if (vtVar14 != null && (inputStickerSet = xtVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    vtVar19 = xtVar.l;
                    if (vtVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.d0.o(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (xtVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.d0.o(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (xtVar.a0 != null) {
                    document15 = xtVar.W;
                    if (document15 != null) {
                        i23 = xtVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet(xtVar.a0, true);
                        if (stickerSet != null) {
                            vtVar17 = xtVar.l;
                            if (vtVar17 != null) {
                                vtVar18 = xtVar.l;
                                if (vtVar18.D()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.d0.m(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            vtVar15 = xtVar.l;
                            if (vtVar15 != null) {
                                vtVar16 = xtVar.l;
                                unused = xtVar.W;
                                if (vtVar16.I()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    org.telegram.ui.Cells.d0.m(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                xtVar.K = true;
                vVar15 = xtVar.z;
                vVar15.invalidate();
                pt ptVar = new pt(this, arrayList12, isStickerInFavorites2);
                xt.h(xtVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i53 = 0; i53 < arrayList11.size(); i53++) {
                    int intValue3 = ((Integer) arrayList13.get(i53)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i53);
                    c6Var3 = xtVar.c0;
                    org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, c6Var3);
                    c14.setTag(Integer.valueOf(i53));
                    c14.setOnClickListener(ptVar);
                    if (((Integer) arrayList12.get(i53)).intValue() == 8) {
                        int d10 = xt.d(xtVar, org.telegram.ui.ActionBar.g6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.1f, d10));
                    }
                }
                qt qtVar = new qt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                xtVar.k = qtVar;
                qtVar.e = true;
                qtVar.c = 100;
                qtVar.g = true;
                qtVar.setOutsideTouchable(true);
                xtVar.k.setClippingEnabled(true);
                xtVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                xtVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                xtVar.k.setInputMethodMode(2);
                xtVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = xtVar.q;
                int i54 = bVar7.d;
                bVar8 = xtVar.q;
                int i55 = i54 + bVar8.b;
                bVar9 = xtVar.q;
                int i56 = bVar9.b;
                i21 = xtVar.V;
                if (i21 == 1) {
                    vVar24 = xtVar.z;
                    int width3 = vVar24.getWidth();
                    vVar25 = xtVar.z;
                    i22 = Math.min(width3, vVar25.getHeight() - i55) - AndroidUtilities.dp(40.0f);
                } else {
                    if (xtVar.S) {
                        vVar18 = xtVar.z;
                        int width4 = vVar18.getWidth();
                        vVar19 = xtVar.z;
                        min = Math.min(width4, vVar19.getHeight() - i55) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        vVar16 = xtVar.z;
                        int width5 = vVar16.getWidth();
                        vVar17 = xtVar.z;
                        min = Math.min(width5, vVar17.getHeight() - i55) / 1.8f;
                    }
                    i22 = (int) min;
                }
                f17 = xtVar.e;
                int i57 = i22 / 2;
                int i58 = i56 + i57;
                int dp6 = xtVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                vVar20 = xtVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i58 + dp6, ((vVar20.getHeight() - i55) - xtVar.I) / 2) + i57));
                if (xtVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.m1 m1Var3 = xtVar.k;
                vVar21 = xtVar.z;
                vVar22 = xtVar.z;
                m1Var3.showAtLocation(vVar21, 0, (int) ((vVar22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    vVar23 = xtVar.z;
                    vVar23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            i15 = 0;
            i28 = i15;
            while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, xtVar.z.getContext(), xtVar.c0);
        org.telegram.ui.ActionBar.c6 c6Var42 = null;
        dh.d c102 = bVar10.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(fh.b.k(xtVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.j.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        int i302 = 6;
        int i312 = 7;
        if (xtVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i15 = 0;
        i28 = i15;
        while (i28 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
