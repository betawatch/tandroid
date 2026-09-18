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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qt implements Runnable {
    public final /* synthetic */ ut a;

    public qt(ut utVar) {
        this.a = utVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0657, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r2) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0985, code lost:
    
        if (org.telegram.messenger.MessageObject.isStickerHasSet(r8) != false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0db5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        st stVar;
        st stVar2;
        int i13;
        st stVar3;
        int i14;
        st stVar4;
        TLRPC.Document document;
        TLRPC.Document document2;
        boolean z10;
        ci.n6 n6Var;
        i0.b bVar;
        i0.b bVar2;
        i0.b bVar3;
        ci.n6 n6Var2;
        ci.n6 n6Var3;
        float f7;
        ci.n6 n6Var4;
        float f10;
        ci.n6 n6Var5;
        ci.n6 n6Var6;
        float f11;
        float f12;
        ci.n6 n6Var7;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i15;
        TLRPC.Document document3;
        st stVar5;
        TLRPC.Document document4;
        st stVar6;
        st stVar7;
        st stVar8;
        st stVar9;
        int i16;
        st stVar10;
        TLRPC.Document document5;
        st stVar11;
        TLRPC.Document document6;
        st stVar12;
        TLRPC.Document document7;
        int i17;
        TLRPC.Document document8;
        TLRPC.Document document9;
        ci.n6 n6Var8;
        i0.b bVar4;
        i0.b bVar5;
        i0.b bVar6;
        ci.n6 n6Var9;
        ci.n6 n6Var10;
        float f13;
        ci.n6 n6Var11;
        float f14;
        ci.n6 n6Var12;
        ci.n6 n6Var13;
        float f15;
        float f16;
        ci.n6 n6Var14;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.Document document10;
        int i18;
        TLRPC.Document document11;
        TLRPC.Document document12;
        int i19;
        TLRPC.Document document13;
        st stVar13;
        TLRPC.Document document14;
        st stVar14;
        ci.n6 n6Var15;
        i0.b bVar7;
        i0.b bVar8;
        i0.b bVar9;
        int i20;
        ci.n6 n6Var16;
        ci.n6 n6Var17;
        float min;
        int i21;
        ci.n6 n6Var18;
        ci.n6 n6Var19;
        float f17;
        ci.n6 n6Var20;
        ci.n6 n6Var21;
        ci.n6 n6Var22;
        ci.n6 n6Var23;
        ci.n6 n6Var24;
        ci.n6 n6Var25;
        org.telegram.ui.ActionBar.f6 f6Var3;
        TLRPC.Document document15;
        int i22;
        st stVar15;
        st stVar16;
        st stVar17;
        st stVar18;
        TLRPC.InputStickerSet inputStickerSet;
        st stVar19;
        int i23;
        TLRPC.Document document16;
        st stVar20;
        int i24;
        st stVar21;
        int i25;
        st stVar22;
        st stVar23;
        st stVar24;
        st stVar25;
        int i26;
        ci.n6 n6Var26;
        ci.n6 n6Var27;
        int i27;
        fc1 fc1Var;
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        ci.n6 n6Var28;
        org.telegram.ui.Components.n70 i28;
        TLRPC.Document unused;
        ut utVar = this.a;
        ah.c cVar = utVar.t;
        if (utVar.w == null || utVar.m) {
            return;
        }
        utVar.R = true;
        st stVar26 = utVar.l;
        final int i29 = 0;
        if (stVar26 != null && (i28 = stVar26.i(utVar.z)) != null) {
            i28.Q(cVar, eh.b.k(utVar.c0), true);
            i28.t = false;
            i28.Y();
            i28.p = new ej(this, 16);
            ViewGroup viewGroup = i28.A;
            lt ltVar = new lt(this, viewGroup);
            utVar.k = ltVar;
            ltVar.e = true;
            ltVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
            ltVar.g = true;
            ltVar.setOutsideTouchable(true);
            utVar.k.setClippingEnabled(true);
            utVar.k.setAnimationStyle(R.style.PopupContextAnimation);
            utVar.k.setFocusable(true);
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            utVar.k.setInputMethodMode(2);
            utVar.k.getContentView().setFocusableInTouchMode(true);
            i0.b bVar10 = utVar.q;
            int min2 = (Math.min(utVar.z.getWidth(), utVar.z.getHeight() - (bVar10.d + bVar10.b)) - AndroidUtilities.dp(40.0f)) / 2;
            int dp = (int) ((AndroidUtilities.dp(24.0f) - utVar.e) + ((int) (utVar.e + Math.max(r2 + min2 + (utVar.G != null ? AndroidUtilities.dp(40.0f) : 0), ((utVar.z.getHeight() - r3) - utVar.I) / 2) + min2)));
            utVar.k.showAtLocation(utVar.z, 0, (int) ((r4.getMeasuredWidth() - viewGroup.getMeasuredWidth()) / 2.0f), dp);
            try {
                utVar.z.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            float f18 = utVar.e;
            if (f18 != 0.0f) {
                utVar.f = f18;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kt
                    public final /* synthetic */ qt b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i29) {
                            case 0:
                                ut utVar2 = this.b.a;
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                utVar2.g = floatValue;
                                float f19 = utVar2.f;
                                utVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                utVar2.z.invalidate();
                                break;
                            case 1:
                                ut utVar3 = this.b.a;
                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                utVar3.g = floatValue2;
                                float f20 = utVar3.f;
                                utVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                utVar3.z.invalidate();
                                break;
                            default:
                                ut utVar4 = this.b.a;
                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                utVar4.g = floatValue3;
                                float f21 = utVar4.f;
                                utVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                utVar4.z.invalidate();
                                break;
                        }
                    }
                });
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(org.telegram.ui.Components.qr.f);
                ofFloat.start();
            }
            utVar.K = true;
            return;
        }
        if (utVar.V != 3) {
            st stVar27 = utVar.l;
            if (stVar27 != null) {
                TLRPC.TL_messageMediaPoll d = stVar27.d();
                TLRPC.PollAnswer g10 = utVar.l.g();
                if (d != null && d.poll != null && g10 != null) {
                    TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
                    if (pollResult != null && pollResult.voters > 0) {
                        MessageObject.canShowVotersList(d);
                    }
                }
            }
            i10 = 0;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, utVar.z.getContext(), utVar.c0);
            org.telegram.ui.ActionBar.f6 f6Var4 = null;
            ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, null, true);
            c10.o(eh.b.k(utVar.c0));
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            c10.j.e = true;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackground(c10);
            if (utVar.V != 3) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (utVar.T == null) {
                    st stVar28 = utVar.l;
                    if (stVar28 == null || !stVar28.A()) {
                        if (utVar.l.x()) {
                            arrayList.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_send, arrayList3, arrayList2, 0);
                        }
                        arrayList.add(LocaleController.getString(R.string.AddToFavorites));
                        org.telegram.ui.Cells.p6.o(R.drawable.msg_fave, arrayList3, arrayList2, 1);
                    } else {
                        arrayList.add(LocaleController.getString(R.string.SetIntroSticker));
                        org.telegram.ui.Cells.p6.o(R.drawable.menu_sticker_add, arrayList3, arrayList2, 0);
                    }
                }
                st stVar29 = utVar.l;
                if (stVar29 == null || !stVar29.A()) {
                    st stVar30 = utVar.l;
                    arrayList.add(LocaleController.getString((stVar30 == null || !stVar30.J()) ? R.string.AddToStickerPack : R.string.StickersReplaceSticker));
                    st stVar31 = utVar.l;
                    org.telegram.ui.Cells.p6.o((stVar31 == null || !stVar31.J()) ? R.drawable.menu_sticker_add : R.drawable.msg_replace, arrayList3, arrayList2, 2);
                }
                int i30 = 7;
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, utVar.w, utVar.c0, true, false);
                g1Var.setItemHeight(44);
                g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                FrameLayout frameLayout = new FrameLayout(utVar.z.getContext());
                LinearLayout linearLayout = new LinearLayout(utVar.z.getContext());
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, utVar.c0));
                linearLayout.setOrientation(1);
                if (utVar.w == null) {
                    fc1Var = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new TLRPC.TL_stickerSetNoCovered());
                    TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = new TLRPC.TL_messages_getMyStickers();
                    tL_messages_getMyStickers.limit = 100;
                    ConnectionsManager.getInstance(utVar.r).sendRequest(tL_messages_getMyStickers, new ca(utVar, arrayList4, tL_messages_getMyStickers, i30));
                    fc1 fc1Var2 = new fc1(utVar.w, i30, f6Var4);
                    fc1Var2.setLayoutManager(new s4.c0());
                    fc1Var2.i(new ci.r1(arrayList4, 4));
                    fc1Var2.setAdapter(new rt(utVar, arrayList4));
                    fc1Var = fc1Var2;
                }
                fc1Var.setOnItemClickListener(new i(this, 5));
                frameLayout.addView(g1Var);
                linearLayout.addView(frameLayout);
                linearLayout.addView(new org.telegram.ui.ActionBar.l1(utVar.z.getContext(), utVar.c0), w7.x5.n(-1, 8));
                ai.s0 s0Var = new ai.s0(this, arrayList2, fc1Var, linearLayout, actionBarPopupWindow$ActionBarPopupWindowLayout2, 13);
                for (int i31 = 0; i31 < arrayList.size(); i31++) {
                    org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, ((Integer) arrayList3.get(i31)).intValue(), (CharSequence) arrayList.get(i31), false, utVar.c0);
                    c11.setTag(Integer.valueOf(i31));
                    c11.setOnClickListener(s0Var);
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                linearLayout.addView(fc1Var, new LinearLayout.LayoutParams(actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() - AndroidUtilities.dp(16.0f), (int) (actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredHeight() * 1.5f)));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.b(linearLayout);
                frameLayout.setOnClickListener(new vf(actionBarPopupWindow$ActionBarPopupWindowLayout2, 2));
                i0.b bVar11 = utVar.q;
                int i32 = bVar11.d + bVar11.b;
                int min3 = ((int) (Math.min(utVar.z.getWidth(), utVar.z.getHeight() - i32) / 1.8f)) / 2;
                utVar.z.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.d(-2, -2.0f, 49, 0.0f, (AndroidUtilities.dp(84.0f) + ((int) ((utVar.e + Math.max(r0 + min3, ((utVar.z.getHeight() - i32) - utVar.I) / 2)) + min3))) / AndroidUtilities.density, 0.0f, 0.0f));
                utVar.L = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.setTranslationY(-AndroidUtilities.dp(12.0f));
                utVar.L.setAlpha(0.0f);
                view = utVar.L;
                view.setScaleX(0.8f);
                view2 = utVar.L;
                view2.setScaleY(0.8f);
                view3 = utVar.L;
                view3.setPivotY(0.0f);
                view4 = utVar.L;
                view5 = utVar.L;
                view4.setPivotX(view5.getMeasuredWidth() / 2.0f);
                view6 = utVar.L;
                view6.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                if (utVar.P == null) {
                    org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(utVar, utVar.z.getContext(), UserConfig.selectedAccount, utVar.c0);
                    utVar.P = xbVar;
                    xbVar.N0 = true;
                    xbVar.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                    utVar.P.setClipChildren(false);
                    utVar.P.setClipToPadding(false);
                    utVar.P.setVisibility(0);
                    utVar.P.setHint(LocaleController.getString(R.string.StickersSetEmojiForSticker));
                    utVar.P.setBubbleOffset(-AndroidUtilities.dp(105.0f));
                    utVar.P.setMiniBubblesOffset(-AndroidUtilities.dp(14.0f));
                    FrameLayout frameLayout2 = new FrameLayout(utVar.z.getContext());
                    utVar.Q = frameLayout2;
                    frameLayout2.addView(utVar.P, w7.x5.d(-2, 116.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                    utVar.z.addView(utVar.Q, w7.x5.d(-2, -2.0f, 1, 0.0f, 100.0f, 0.0f, 0.0f));
                }
                utVar.P.setSelectedEmojis(utVar.o);
                utVar.P.setDelegate(new ht(utVar));
                utVar.P.p(null, null, false);
                utVar.Q.setScaleY(0.6f);
                utVar.Q.setScaleX(0.6f);
                utVar.Q.setAlpha(0.0f);
                AndroidUtilities.runOnUIThread(new gt(utVar, 2), 10L);
                utVar.K = true;
                n6Var28 = utVar.z;
                n6Var28.invalidate();
            } else {
                final int i33 = 1;
                int i34 = 0;
                i11 = utVar.V;
                if (i11 != 0) {
                    i12 = utVar.V;
                    if (i12 == 2) {
                        stVar8 = utVar.l;
                        if (stVar8 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            stVar9 = utVar.l;
                            i16 = utVar.V;
                            if (stVar9.l(i16)) {
                                arrayList5.add(LocaleController.getString(R.string.SendEmojiPreview));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_send, arrayList7, arrayList6, 0);
                            }
                            stVar10 = utVar.l;
                            document5 = utVar.W;
                            Boolean P = stVar10.P(document5);
                            if (P != null) {
                                if (P.booleanValue()) {
                                    arrayList5.add(LocaleController.getString(R.string.SetAsEmojiStatus));
                                    org.telegram.ui.Cells.p6.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 1);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.RemoveStatus));
                                    org.telegram.ui.Cells.p6.o(R.drawable.msg_smile_status, arrayList7, arrayList6, 2);
                                }
                            }
                            stVar11 = utVar.l;
                            document6 = utVar.W;
                            if (stVar11.D(document6)) {
                                arrayList5.add(LocaleController.getString(R.string.CopyEmojiPreview));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_copy, arrayList7, arrayList6, 3);
                            }
                            stVar12 = utVar.l;
                            document7 = utVar.W;
                            if (stVar12.N(document7)) {
                                arrayList5.add(LocaleController.getString(R.string.RemoveFromRecent));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_delete, arrayList7, arrayList6, 4);
                            }
                            i17 = utVar.r;
                            MediaDataController mediaDataController = MediaDataController.getInstance(i17);
                            document8 = utVar.W;
                            boolean isStickerInFavorites = mediaDataController.isStickerInFavorites(document8);
                            document9 = utVar.W;
                            if (!MessageObject.isAnimatedEmoji(document9)) {
                                document10 = utVar.W;
                                if (!MessageObject.isMaskDocument(document10)) {
                                    if (!isStickerInFavorites) {
                                        i18 = utVar.r;
                                        if (MediaDataController.getInstance(i18).canAddStickerToFavorites()) {
                                            document11 = utVar.W;
                                        }
                                    }
                                    arrayList5.add(LocaleController.getString(isStickerInFavorites ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                                    org.telegram.ui.Cells.p6.o(isStickerInFavorites ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList7, arrayList6, 5);
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                return;
                            }
                            utVar.K = true;
                            n6Var8 = utVar.z;
                            n6Var8.invalidate();
                            int[] iArr = new int[arrayList7.size()];
                            for (int i35 = 0; i35 < arrayList7.size(); i35++) {
                                iArr[i35] = ((Integer) arrayList7.get(i35)).intValue();
                            }
                            org.telegram.ui.Components.xb0 xb0Var = new org.telegram.ui.Components.xb0(this, arrayList6, isStickerInFavorites);
                            boolean h = ut.h(utVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            int i36 = 0;
                            while (i36 < arrayList5.size()) {
                                boolean z11 = !h && i36 == 0;
                                boolean z12 = i36 == arrayList5.size() + (-1);
                                int intValue = ((Integer) arrayList7.get(i36)).intValue();
                                CharSequence charSequence = (CharSequence) arrayList5.get(i36);
                                f6Var2 = utVar.c0;
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(z11, z12, actionBarPopupWindow$ActionBarPopupWindowLayout3, intValue, charSequence, false, f6Var2);
                                if (((Integer) arrayList6.get(i36)).intValue() == 4) {
                                    c12.setIconColor(ut.d(utVar, org.telegram.ui.ActionBar.j6.p7));
                                    c12.setTextColor(ut.d(utVar, org.telegram.ui.ActionBar.j6.q7));
                                }
                                c12.setTag(Integer.valueOf(i36));
                                c12.setOnClickListener(xb0Var);
                                i36++;
                                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout3;
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                            ot otVar = new ot(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            utVar.k = otVar;
                            otVar.e = true;
                            otVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                            otVar.g = true;
                            otVar.setOutsideTouchable(true);
                            utVar.k.setClippingEnabled(true);
                            utVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                            utVar.k.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                            utVar.k.setInputMethodMode(2);
                            utVar.k.getContentView().setFocusableInTouchMode(true);
                            bVar4 = utVar.q;
                            int i37 = bVar4.d;
                            bVar5 = utVar.q;
                            int i38 = i37 + bVar5.b;
                            bVar6 = utVar.q;
                            int i39 = bVar6.b;
                            n6Var9 = utVar.z;
                            int width = n6Var9.getWidth();
                            n6Var10 = utVar.z;
                            int min4 = Math.min(width, n6Var10.getHeight() - i38) - AndroidUtilities.dp(40.0f);
                            f13 = utVar.e;
                            int i40 = min4 / 2;
                            int i41 = i39 + i40;
                            int dp2 = utVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                            n6Var11 = utVar.z;
                            float max = (int) (f13 + Math.max(i41 + dp2, ((n6Var11.getHeight() - i38) - utVar.I) / 2) + i40);
                            float dp3 = AndroidUtilities.dp(24.0f);
                            f14 = utVar.e;
                            int i42 = (int) ((dp3 - f14) + max);
                            org.telegram.ui.ActionBar.o1 o1Var = utVar.k;
                            n6Var12 = utVar.z;
                            n6Var13 = utVar.z;
                            o1Var.showAtLocation(n6Var12, 0, (int) ((n6Var13.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i42);
                            org.telegram.ui.ActionBar.o1.i(actionBarPopupWindow$ActionBarPopupWindowLayout);
                            try {
                                n6Var14 = utVar.z;
                                n6Var14.performHapticFeedback(0);
                            } catch (Exception unused3) {
                            }
                            f15 = utVar.e;
                            if (f15 != 0.0f) {
                                f16 = utVar.e;
                                utVar.f = f16;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kt
                                    public final /* synthetic */ qt b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        switch (i33) {
                                            case 0:
                                                ut utVar2 = this.b.a;
                                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                utVar2.g = floatValue;
                                                float f19 = utVar2.f;
                                                utVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                                utVar2.z.invalidate();
                                                break;
                                            case 1:
                                                ut utVar3 = this.b.a;
                                                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                utVar3.g = floatValue2;
                                                float f20 = utVar3.f;
                                                utVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                                utVar3.z.invalidate();
                                                break;
                                            default:
                                                ut utVar4 = this.b.a;
                                                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                utVar4.g = floatValue3;
                                                float f21 = utVar4.f;
                                                utVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                                utVar4.z.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ofFloat2.setDuration(350L);
                                ofFloat2.setInterpolator(org.telegram.ui.Components.qr.f);
                                ofFloat2.start();
                            }
                            i27 = 0;
                            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i27);
                                if (childAt instanceof org.telegram.ui.ActionBar.g1) {
                                    ((org.telegram.ui.ActionBar.g1) childAt).k(i27 == 0, i27 == actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() + (-1));
                                }
                                i27++;
                            }
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                    stVar = utVar.l;
                    if (stVar != null) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        stVar2 = utVar.l;
                        i13 = utVar.V;
                        if (stVar2.l(i13)) {
                            stVar7 = utVar.l;
                            if (!stVar7.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendGifPreview));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_send, arrayList10, arrayList9, 0);
                            }
                        }
                        stVar3 = utVar.l;
                        i14 = utVar.V;
                        if (stVar3.l(i14)) {
                            stVar6 = utVar.l;
                            if (!stVar6.c()) {
                                arrayList8.add(LocaleController.getString(R.string.SendWithoutSound));
                                org.telegram.ui.Cells.p6.o(R.drawable.input_notify_off, arrayList10, arrayList9, 4);
                            }
                        }
                        stVar4 = utVar.l;
                        if (stVar4.b()) {
                            arrayList8.add(LocaleController.getString(R.string.Schedule));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_autodelete, arrayList10, arrayList9, 3);
                        }
                        document = utVar.W;
                        if (document != null) {
                            stVar5 = utVar.l;
                            document4 = utVar.W;
                            if (stVar5.e(document4)) {
                                arrayList8.add(LocaleController.getString(R.string.AddACaption));
                                org.telegram.ui.Cells.p6.n(R.drawable.outline_caption_24, 11, arrayList10, arrayList9);
                            }
                        }
                        document2 = utVar.W;
                        if (document2 != null) {
                            i15 = utVar.r;
                            MediaDataController mediaDataController2 = MediaDataController.getInstance(i15);
                            document3 = utVar.W;
                            z10 = mediaDataController2.hasRecentGif(document3);
                            if (z10) {
                                arrayList8.add(LocaleController.formatString("Delete", R.string.Delete, new Object[0]));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_delete, arrayList10, arrayList9, 1);
                            } else {
                                arrayList8.add(LocaleController.formatString("SaveToGIFs", R.string.SaveToGIFs, new Object[0]));
                                org.telegram.ui.Cells.p6.o(R.drawable.msg_gif_add, arrayList10, arrayList9, 2);
                            }
                        } else {
                            z10 = false;
                        }
                        if (arrayList8.isEmpty()) {
                            return;
                        }
                        utVar.K = true;
                        n6Var = utVar.z;
                        n6Var.invalidate();
                        int[] iArr2 = new int[arrayList10.size()];
                        for (int i43 = 0; i43 < arrayList10.size(); i43++) {
                            iArr2[i43] = ((Integer) arrayList10.get(i43)).intValue();
                        }
                        org.telegram.ui.Components.dt dtVar = new org.telegram.ui.Components.dt(28, this, arrayList9);
                        for (int i44 = 0; i44 < arrayList8.size(); i44++) {
                            int intValue2 = ((Integer) arrayList10.get(i44)).intValue();
                            CharSequence charSequence2 = (CharSequence) arrayList8.get(i44);
                            f6Var = utVar.c0;
                            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, intValue2, charSequence2, false, f6Var);
                            c13.setTag(Integer.valueOf(i44));
                            c13.setOnClickListener(dtVar);
                            if (z10 && i44 == arrayList8.size() - 1) {
                                c13.c(ut.d(utVar, org.telegram.ui.ActionBar.j6.q7), ut.d(utVar, org.telegram.ui.ActionBar.j6.p7));
                            }
                        }
                        pt ptVar = new pt(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        utVar.k = ptVar;
                        ptVar.e = true;
                        ptVar.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                        ptVar.g = true;
                        ptVar.setOutsideTouchable(true);
                        utVar.k.setClippingEnabled(true);
                        utVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                        utVar.k.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                        utVar.k.setInputMethodMode(2);
                        utVar.k.getContentView().setFocusableInTouchMode(true);
                        bVar = utVar.q;
                        int i45 = bVar.d;
                        bVar2 = utVar.q;
                        int i46 = i45 + bVar2.b;
                        bVar3 = utVar.q;
                        int i47 = bVar3.b;
                        n6Var2 = utVar.z;
                        int width2 = n6Var2.getWidth();
                        n6Var3 = utVar.z;
                        int min5 = Math.min(width2, n6Var3.getHeight() - i46) - AndroidUtilities.dp(40.0f);
                        f7 = utVar.e;
                        int i48 = min5 / 2;
                        int i49 = i47 + i48;
                        int dp4 = utVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                        n6Var4 = utVar.z;
                        float max2 = (int) (f7 + Math.max(i49 + dp4, ((n6Var4.getHeight() - i46) - utVar.I) / 2) + i48);
                        float dp5 = AndroidUtilities.dp(24.0f);
                        f10 = utVar.e;
                        int i50 = (int) ((dp5 - f10) + max2);
                        org.telegram.ui.ActionBar.o1 o1Var2 = utVar.k;
                        n6Var5 = utVar.z;
                        n6Var6 = utVar.z;
                        o1Var2.showAtLocation(n6Var5, 0, (int) ((n6Var6.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) / 2.0f), i50);
                        try {
                            n6Var7 = utVar.z;
                            n6Var7.performHapticFeedback(0);
                        } catch (Exception unused4) {
                        }
                        f11 = utVar.e;
                        if (f11 != 0.0f) {
                            f12 = utVar.e;
                            utVar.f = f12;
                            final int i51 = 2;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.kt
                                public final /* synthetic */ qt b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i51) {
                                        case 0:
                                            ut utVar2 = this.b.a;
                                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            utVar2.g = floatValue;
                                            float f19 = utVar2.f;
                                            utVar2.e = com.google.android.gms.internal.vision.e2.z(0.0f, f19, floatValue, f19);
                                            utVar2.z.invalidate();
                                            break;
                                        case 1:
                                            ut utVar3 = this.b.a;
                                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            utVar3.g = floatValue2;
                                            float f20 = utVar3.f;
                                            utVar3.e = com.google.android.gms.internal.vision.e2.z(0.0f, f20, floatValue2, f20);
                                            utVar3.z.invalidate();
                                            break;
                                        default:
                                            ut utVar4 = this.b.a;
                                            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                            utVar4.g = floatValue3;
                                            float f21 = utVar4.f;
                                            utVar4.e = com.google.android.gms.internal.vision.e2.z(0.0f, f21, floatValue3, f21);
                                            utVar4.z.invalidate();
                                            break;
                                    }
                                }
                            });
                            ofFloat3.setDuration(350L);
                            ofFloat3.setInterpolator(org.telegram.ui.Components.qr.f);
                            ofFloat3.start();
                        }
                        i27 = 0;
                        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                        }
                    }
                    i27 = 0;
                    while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
                    }
                }
                document12 = utVar.W;
                if (MessageObject.isPremiumSticker(document12)) {
                    i26 = utVar.r;
                    if (!AccountInstance.getInstance(i26).getUserConfig().isPremium()) {
                        if (utVar.O == null) {
                            jh1 jh1Var = new jh1(utVar.z.getContext(), utVar.c0);
                            utVar.O = jh1Var;
                            utVar.z.addView(jh1Var, w7.x5.c(-1.0f, -1));
                            utVar.O.setOnClickListener(new jt(utVar, i34));
                            utVar.O.a.r.setOnClickListener(new jt(utVar, i33));
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(utVar.O, false, 1.0f, false);
                        AndroidUtilities.updateViewVisibilityAnimated(utVar.O, true);
                        utVar.O.setTranslationY(0.0f);
                        utVar.K = true;
                        n6Var26 = utVar.z;
                        n6Var26.invalidate();
                        try {
                            n6Var27 = utVar.z;
                            n6Var27.performHapticFeedback(0);
                            return;
                        } catch (Exception unused5) {
                            return;
                        }
                    }
                }
                i19 = utVar.r;
                MediaDataController mediaDataController3 = MediaDataController.getInstance(i19);
                document13 = utVar.W;
                boolean isStickerInFavorites2 = mediaDataController3.isStickerInFavorites(document13);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                stVar13 = utVar.l;
                if (stVar13 != null) {
                    stVar20 = utVar.l;
                    i24 = utVar.V;
                    if (stVar20.l(i24)) {
                        stVar25 = utVar.l;
                        if (!stVar25.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendStickerPreview));
                            org.telegram.ui.Cells.p6.o(R.drawable.msg_send, arrayList13, arrayList12, 0);
                        }
                    }
                    stVar21 = utVar.l;
                    i25 = utVar.V;
                    if (stVar21.l(i25)) {
                        stVar24 = utVar.l;
                        if (!stVar24.c()) {
                            arrayList11.add(LocaleController.getString(R.string.SendWithoutSound));
                            org.telegram.ui.Cells.p6.n(R.drawable.input_notify_off, 6, arrayList13, arrayList12);
                        }
                    }
                    stVar22 = utVar.l;
                    if (stVar22.b()) {
                        arrayList11.add(LocaleController.getString(R.string.Schedule));
                        org.telegram.ui.Cells.p6.o(R.drawable.msg_autodelete, arrayList13, arrayList12, 3);
                    }
                    stVar23 = utVar.l;
                    if (stVar23.f()) {
                        arrayList11.add(LocaleController.getString(R.string.ImportStickersRemoveMenu));
                        org.telegram.ui.Cells.p6.o(R.drawable.msg_delete, arrayList13, arrayList12, 5);
                    }
                }
                document14 = utVar.W;
                if (!MessageObject.isMaskDocument(document14)) {
                    if (!isStickerInFavorites2) {
                        i23 = utVar.r;
                        if (MediaDataController.getInstance(i23).canAddStickerToFavorites()) {
                            document16 = utVar.W;
                        }
                    }
                    arrayList11.add(LocaleController.getString(isStickerInFavorites2 ? R.string.DeleteFromFavorites : R.string.AddToFavorites));
                    org.telegram.ui.Cells.p6.o(isStickerInFavorites2 ? R.drawable.msg_unfave : R.drawable.msg_fave, arrayList13, arrayList12, 2);
                }
                stVar14 = utVar.l;
                if (stVar14 != null && (inputStickerSet = utVar.a0) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    stVar19 = utVar.l;
                    if (stVar19.Q()) {
                        arrayList11.add(LocaleController.formatString(R.string.ViewPackPreview, new Object[0]));
                        org.telegram.ui.Cells.p6.o(R.drawable.msg_media, arrayList13, arrayList12, 1);
                    }
                }
                if (utVar.p) {
                    arrayList11.add(LocaleController.getString(R.string.DeleteFromRecent));
                    org.telegram.ui.Cells.p6.o(R.drawable.msg_delete, arrayList13, arrayList12, 4);
                }
                if (utVar.a0 != null) {
                    document15 = utVar.W;
                    if (document15 != null) {
                        i22 = utVar.r;
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet(utVar.a0, true);
                        if (stickerSet != null) {
                            stVar17 = utVar.l;
                            if (stVar17 != null) {
                                stVar18 = utVar.l;
                                if (stVar18.C()) {
                                    TLRPC.StickerSet stickerSet2 = stickerSet.set;
                                    if (!stickerSet2.emojis && !stickerSet2.masks) {
                                        arrayList11.add(LocaleController.getString(R.string.EditSticker));
                                        org.telegram.ui.Cells.p6.n(R.drawable.msg_edit, 7, arrayList13, arrayList12);
                                    }
                                }
                            }
                        }
                        if (stickerSet != null && stickerSet.set.creator) {
                            stVar15 = utVar.l;
                            if (stVar15 != null) {
                                stVar16 = utVar.l;
                                unused = utVar.W;
                                if (stVar16.I()) {
                                    arrayList11.add(LocaleController.getString(R.string.DeleteSticker));
                                    org.telegram.ui.Cells.p6.n(R.drawable.msg_delete, 8, arrayList13, arrayList12);
                                }
                            }
                        }
                    }
                }
                if (arrayList11.isEmpty()) {
                    return;
                }
                utVar.K = true;
                n6Var15 = utVar.z;
                n6Var15.invalidate();
                mt mtVar = new mt(this, arrayList12, isStickerInFavorites2);
                ut.h(utVar, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                for (int i52 = 0; i52 < arrayList11.size(); i52++) {
                    int intValue3 = ((Integer) arrayList13.get(i52)).intValue();
                    CharSequence charSequence3 = (CharSequence) arrayList11.get(i52);
                    f6Var3 = utVar.c0;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, intValue3, charSequence3, false, f6Var3);
                    c14.setTag(Integer.valueOf(i52));
                    c14.setOnClickListener(mtVar);
                    if (((Integer) arrayList12.get(i52)).intValue() == 8) {
                        int d10 = ut.d(utVar, org.telegram.ui.ActionBar.j6.q7);
                        c14.c(d10, d10);
                        c14.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, d10));
                    }
                }
                nt ntVar = new nt(this, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                utVar.k = ntVar;
                ntVar.e = true;
                ntVar.c = 100;
                ntVar.g = true;
                ntVar.setOutsideTouchable(true);
                utVar.k.setClippingEnabled(true);
                utVar.k.setAnimationStyle(R.style.PopupContextAnimation);
                utVar.k.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                utVar.k.setInputMethodMode(2);
                utVar.k.getContentView().setFocusableInTouchMode(true);
                bVar7 = utVar.q;
                int i53 = bVar7.d;
                bVar8 = utVar.q;
                int i54 = i53 + bVar8.b;
                bVar9 = utVar.q;
                int i55 = bVar9.b;
                i20 = utVar.V;
                if (i20 == 1) {
                    n6Var24 = utVar.z;
                    int width3 = n6Var24.getWidth();
                    n6Var25 = utVar.z;
                    i21 = Math.min(width3, n6Var25.getHeight() - i54) - AndroidUtilities.dp(40.0f);
                } else {
                    if (utVar.S) {
                        n6Var18 = utVar.z;
                        int width4 = n6Var18.getWidth();
                        n6Var19 = utVar.z;
                        min = Math.min(width4, n6Var19.getHeight() - i54) - AndroidUtilities.dpf2(40.0f);
                    } else {
                        n6Var16 = utVar.z;
                        int width5 = n6Var16.getWidth();
                        n6Var17 = utVar.z;
                        min = Math.min(width5, n6Var17.getHeight() - i54) / 1.8f;
                    }
                    i21 = (int) min;
                }
                f17 = utVar.e;
                int i56 = i21 / 2;
                int i57 = i55 + i56;
                int dp6 = utVar.G != null ? AndroidUtilities.dp(40.0f) : 0;
                n6Var20 = utVar.z;
                int dp7 = AndroidUtilities.dp(24.0f) + ((int) (f17 + Math.max(i57 + dp6, ((n6Var20.getHeight() - i54) - utVar.I) / 2) + i56));
                if (utVar.S) {
                    dp7 += AndroidUtilities.dp(24.0f);
                }
                org.telegram.ui.ActionBar.o1 o1Var3 = utVar.k;
                n6Var21 = utVar.z;
                n6Var22 = utVar.z;
                o1Var3.showAtLocation(n6Var21, 0, (int) ((n6Var22.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth()) / 2.0f), dp7);
                try {
                    n6Var23 = utVar.z;
                    n6Var23.performHapticFeedback(0);
                } catch (Exception unused6) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            i27 = 0;
            while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
            }
        }
        i10 = 1;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout22 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i10, utVar.z.getContext(), utVar.c0);
        org.telegram.ui.ActionBar.f6 f6Var42 = null;
        ch.d c102 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout22, null, true);
        c102.o(eh.b.k(utVar.c0));
        c102.q(AndroidUtilities.dp(12.0f));
        c102.p(AndroidUtilities.dp(8.0f));
        c102.j.e = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout22.setBackground(c102);
        if (utVar.V != 3) {
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout22;
        i27 = 0;
        while (i27 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount()) {
        }
    }
}
