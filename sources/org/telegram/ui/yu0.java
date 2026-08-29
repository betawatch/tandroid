package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yu0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        f2.n1 K;
        th.r a2;
        int i10 = this.a;
        int i11 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                iv0 iv0Var = (iv0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l10 = (Long) obj;
                iv0Var.getClass();
                Bundle bundle = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle.putLong("user_id", l10.longValue());
                } else {
                    bundle.putLong("chat_id", -l10.longValue());
                }
                o2Var.presentFragment(new ProfileActivity(bundle, null));
                iv0Var.c(false);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags = 1 | updatebirthday.flags;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new jr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                break;
            case 2:
                k01 k01Var = (k01) obj3;
                String str = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k9 = d61.k(str, tL_messages_stickerSet);
                if (k9 != null) {
                    m01 m01Var = new m01();
                    k01Var.c = m01Var;
                    k01Var.e.add(m01Var);
                    int f9 = ry.f();
                    k01Var.c.setAutoRepeat(0);
                    m01 m01Var2 = k01Var.c;
                    String str2 = f9 + "_" + f9 + "_precache";
                    ky0 ky0Var = new ky0(k01Var, 5);
                    m01Var2.getClass();
                    m01Var2.setDelegate(new l01(new Runnable[]{ky0Var}));
                    m01Var2.setImage(ImageLocation.getForDocument(k9), str2, null, null, tL_messages_stickerSet, 0);
                    k01Var.c.onAttachedToWindow();
                    k01Var.g[1] = true;
                    k01Var.a();
                    break;
                } else {
                    StringBuilder s10 = a4.w.s("couldn't find ", str, " sticker in EmojiAnimations");
                    String[] strArr = n01.s;
                    FileLog.e(s10.toString());
                    break;
                }
            case 3:
                ((eg.h) obj3).run((HashSet) obj2);
                break;
            case 4:
                f41 f41Var = (f41) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    f41Var.getClass();
                    view.setVisibility(0);
                }
                f41Var.f = bitmap;
                Paint paint = new Paint(1);
                f41Var.n = paint;
                Bitmap bitmap2 = f41Var.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                f41Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                f41Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                f41Var.r = new Matrix();
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.J0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.jl0 jl0Var = themeActivity.b;
                    if (jl0Var != null && jl0Var.C && (K = jl0Var.K(themeActivity.I)) != null) {
                        themeActivity.a.v(K, themeActivity.I);
                        break;
                    }
                }
                break;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                t31 t31Var = (t31) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.tc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                } else {
                    t31Var.run();
                    break;
                }
            case 7:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj3;
                String str3 = (String) obj2;
                Boolean bool = (Boolean) obj;
                z0Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str3) ? "removed" : "updated" : "failed");
                    z0Var.v("biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 8:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) obj3;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                w1Var.getClass();
                ((org.telegram.ui.web.d1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = w1Var.e;
                if (callback == null) {
                    ye.d.s(w1Var.getParentActivity(), a1Var.c);
                    break;
                } else {
                    w1Var.finishFragment();
                    callback.run(a1Var);
                    break;
                }
            case 9:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj3;
                f2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0(f2Var, (org.telegram.ui.web.e2) obj2, (Bitmap) obj, 15));
                break;
            case 10:
                ph.q0 q0Var = (ph.q0) obj3;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj2;
                int[] iArr = (int[]) obj;
                q0Var.getClass();
                boolean z10 = false;
                while (i11 < iArr.length) {
                    if (iArr[i11] == 0) {
                        z10 = true;
                    }
                    i11++;
                }
                q0Var.d = true;
                q0Var.e = true;
                q0Var.l();
                Iterator it = q0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                sVar.run(Boolean.TRUE, Boolean.valueOf(z10));
                break;
            case 11:
                ph.q0 q0Var2 = (ph.q0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                q0Var2.getClass();
                boolean z11 = false;
                while (i11 < iArr2.length) {
                    if (iArr2[i11] == 0) {
                        z11 = true;
                    }
                    i11++;
                }
                q0Var2.d = z11;
                q0Var2.e = z11;
                q0Var2.l();
                Iterator it2 = q0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 12:
                ((File[]) obj3)[0] = (File) obj;
                ((org.telegram.ui.Components.m70) obj2).run();
                break;
            case 13:
                ((ph.k2) obj3).d.x.C((String) obj2, (String) obj, false);
                break;
            case 14:
                qh.g gVar = (qh.g) obj3;
                gVar.getClass();
                gVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 15:
                qh.g gVar2 = (qh.g) obj3;
                gVar2.getClass();
                gVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 16:
                qh.i0 i0Var = (qh.i0) obj3;
                i0Var.V((TLRPC.Chat) obj2, i0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 17:
                View view2 = (View) obj3;
                sf.o oVar = (sf.o) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view2 != null) {
                    view2.requestFocus();
                }
                AndroidUtilities.hideKeyboard(oVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 18:
                sf.r1 r1Var = (sf.r1) obj2;
                sf.s1 f10 = sf.s1.f(UserConfig.selectedAccount);
                org.telegram.ui.Components.ni niVar = ((sf.d0) obj3).b;
                long n12 = niVar.n1();
                int i12 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i12).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = r1Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    messagesStorage.getStorageQueue().postRunnable(new lx0(f10, messagesStorage, r1Var, tL_messages_sendQuickReplyMessages, 24));
                }
                niVar.dismiss();
                break;
            case 19:
                sf.x0.W((sf.x0) obj3, (View) obj2, (String) obj);
                break;
            case 20:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                th.p3 p3Var = ((th.p) obj3).r;
                if (pageblockmath == null) {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str4;
                    p3Var.R1(pageblockmath2);
                    break;
                } else {
                    pageblockmath.source = str4;
                    p3Var.U2.N(false);
                    break;
                }
            case 21:
                th.d1 d1Var = (th.d1) obj3;
                th.r rVar = (th.r) obj2;
                String str5 = (String) obj;
                d1Var.getClass();
                if (!TextUtils.isEmpty(str5)) {
                    Editable text = d1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = th.r.a(str5, d1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z12 = d1Var.v;
                        if (z12) {
                            d1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, d1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, d1Var.length())), spannableString);
                        d1Var.setSelection(Math.min(max + 1, d1Var.length()));
                        if (z12) {
                            d1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 22:
                th.x1 x1Var = (th.x1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str6 = (String) obj;
                x1Var.getClass();
                if (pageblockmath3 == null) {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str6;
                    x1Var.L.R1(pageblockmath4);
                    break;
                } else {
                    pageblockmath3.source = str6;
                    x1Var.L.U2.N(false);
                    break;
                }
            default:
                th.p3 p3Var2 = (th.p3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str7 = (String) obj;
                p3Var2.getClass();
                if (!TextUtils.equals(str7, pageblockmath5.source)) {
                    th.b2 b2Var = p3Var2.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    pageblockmath5.source = str7;
                    p3Var2.U2.N(false);
                    th.b2 b2Var2 = p3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    p3Var2.d3.onContentChanged();
                    break;
                }
                break;
        }
    }
}
