package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements org.telegram.ui.Components.ao0, ei.o4, vh1, r0.n, org.telegram.ui.ActionBar.a2, rg.t, org.telegram.ui.Components.rd0, org.telegram.ui.Components.al0, org.telegram.ui.Components.sv0, ai.ec, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.mj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        j0 j0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        r4 r4Var = (r4) mVar.d;
        if (r4Var == view && (j0Var = r4Var.b) != null) {
            j0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.vh1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new l4(0, (m4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.ao0
    public void b(float f7) {
        z0 z0Var = (z0) this.b;
        MessageObject messageObject = z0Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(z0Var.M, f7);
    }

    @Override // org.telegram.ui.Components.al0
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.i51 G;
        Object obj;
        long j3;
        switch (this.a) {
            case 7:
                b6 b6Var = (b6) this.b;
                ArrayList arrayList = b6Var.c;
                if (((a6) arrayList.get(i10)).a != 1) {
                    if (((a6) arrayList.get(i10)).a != 2) {
                        if (((a6) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.c5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new mu0(b6Var, 13), null).a;
                            b2Var.show();
                            b2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).c;
                        p80 p80Var = new p80(view.getContext(), b6Var);
                        p80Var.g(false);
                        p80Var.setParentWindow(org.telegram.ui.Components.c5.Q(b6Var, p80Var, view, f7, f10));
                        p80Var.setCallback(new y5(b6Var, keepMediaException, 0));
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = b6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    uy uyVar = new uy(bundle);
                    uyVar.C2 = new x5(0, b6Var, uyVar);
                    b6Var.presentFragment(uyVar);
                    break;
                }
                break;
            case 28:
                cu cuVar = (cu) this.b;
                HashSet hashSet = cuVar.b0;
                if (!cuVar.c0 && (G = cuVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof xg.l) {
                        ((xg.l) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.b, view, i10, f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
    public void e(ArrayList arrayList) {
        hi hiVar = (hi) this.b;
        bo boVar = hiVar.p;
        if (boVar.getParentActivity() == null || boVar.getParentActivity() == null) {
            return;
        }
        gi giVar = new gi(hiVar, boVar, boVar.getParentActivity(), boVar.ea, arrayList);
        giVar.setCalcMandatoryInsets(boVar.x9());
        giVar.setDimBehind(false);
        boVar.A7(false);
        boVar.showDialog(giVar);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 4:
                h5 h5Var = (h5) this.b;
                h5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    h5Var.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                p6 p6Var = (p6) this.b;
                o6 o6Var = new o6(p6Var.getContext(), false);
                o6Var.fixNavigationBar();
                o6Var.setCanDismissWithSwipe(false);
                o6Var.setCancelable(false);
                Context context = p6Var.getContext();
                r6 r6Var = new r6(context);
                org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
                aj0Var.setAutoRepeat(true);
                aj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                r6Var.addView(aj0Var, w7.x5.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                aj0Var.d();
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
                r6Var.a = n6Var;
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.g;
                n6Var.b(0.35f, 120L, qrVar);
                n6Var.setGravity(1);
                int i14 = org.telegram.ui.ActionBar.i6.j5;
                n6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                n6Var.setTextSize(AndroidUtilities.dp(24.0f));
                n6Var.setTypeface(AndroidUtilities.bold());
                r6Var.addView(n6Var, w7.x5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                q6 q6Var = new q6(context);
                Paint paint = new Paint(1);
                q6Var.b = paint;
                Paint paint2 = new Paint(1);
                q6Var.c = paint2;
                q6Var.e = new org.telegram.ui.Components.c6(q6Var, 350L, qrVar);
                int i15 = org.telegram.ui.ActionBar.i6.N6;
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(0.2f, org.telegram.ui.ActionBar.i6.w0(null, i15, false)));
                r6Var.b = q6Var;
                r6Var.addView(q6Var, w7.x5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.y0.q(textView, org.telegram.ui.ActionBar.i6.w0(null, i14, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                r6Var.addView(textView, w7.x5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                r6Var.addView(textView2, w7.x5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                r6Var.a(0.0f);
                o6Var.setCustomView(r6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(p6Var, r6Var, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(p6Var, zArr, jArr, o6Var, 2), 150L);
                z6 z6Var = p6Var.d;
                m6 m6Var = new m6(fArr, zArr2, n5Var, i12);
                n6 n6Var2 = new n6(zArr, r6Var, jArr, o6Var, 0);
                zh.b bVar = z6Var.Y;
                if (bVar != null) {
                    bVar.d();
                }
                w6 w6Var = z6Var.N;
                if (w6Var != null) {
                    w6Var.d();
                    z6Var.N.e(false);
                }
                z6Var.getFileLoader().cancelLoadAllFiles();
                z6Var.getFileLoader().getFileLoaderQueue().postRunnable(new f6(z6Var, m6Var, n6Var2, i12));
                z6Var.Y = null;
                w6 w6Var2 = z6Var.N;
                if (w6Var2 != null) {
                    w6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                ld.U((ld) this.b, b2Var);
                break;
            case 15:
                ((ug) this.b).run();
                break;
            case 17:
                bo boVar = ((nj) this.b).b;
                boVar.finishFragment();
                boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, boVar.P3);
                break;
            case 21:
                bo boVar2 = ((em) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) boVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(boVar2.T5, true, true);
                break;
            case 22:
                wp wpVar = (wp) this.b;
                boolean z10 = wpVar.s;
                if (!z10 || wpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(wpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(wpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(wpVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new mp(wpVar, b2VarArr, wpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new qo(i13, wpVar, b2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((zq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // ai.ec
    public void h(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = (h8) ((g) this.b).b;
        Paint paint = h8Var.w;
        TextPaint textPaint = h8Var.e;
        paint.setAlpha((int) (80.0f * f7));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f7);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(h8Var.h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.Components.rd0
    public void i(org.telegram.ui.Components.sd0 sd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, sd0Var);
    }

    @Override // ei.o4
    public void j(boolean z10) {
        l3 l3Var = (l3) this.b;
        u3 u3Var = l3Var.K.K;
        if (u3Var != null) {
            l3Var.h = true;
            u3Var.dismiss(true);
        }
    }

    public void k(String str) {
        bo boVar = ((nm) this.b).Q;
        if (str.startsWith("@")) {
            boVar.getMessagesController().openByUserName(str.substring(1), boVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            uy uyVar = new uy(null);
            uyVar.n2 = str;
            boVar.presentFragment(uyVar);
        } else {
            if (!str.startsWith("/")) {
                boVar.xa(0, str, null, null, false);
                return;
            }
            boVar.Y.b1(null, str, false, false);
            if (boVar.Y.getFieldText() == null) {
                boVar.e9(false);
            }
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        u9 u9Var = (u9) this.b;
        HandlerThread handlerThread = u9Var.d;
        handlerThread.start();
        u9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(u9Var.c0, 0L);
        if (u9Var.a0()) {
            o1.k kVar = u9Var.x;
            if (kVar != null) {
                kVar.c();
                u9Var.x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            u9Var.x = kVar2;
            int i10 = 0;
            kVar2.b(new m9(u9Var, i10));
            u9Var.x.a(new n9(u9Var, i10));
            u9Var.x.u = new o1.l(500.0f);
            u9Var.x.u.a(0.8f);
            u9Var.x.u.b(250.0f);
            u9Var.x.f();
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                de deVar = (de) this.b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                fe feVar = deVar.f;
                Object obj6 = i51Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        je.h0(deVar.getContext(), deVar.c, (TL_stats.BroadcastRevenueTransaction) i51Var.G, feVar.d, deVar.b);
                        break;
                    }
                } else {
                    yh.x7.h1(deVar.getContext(), true, feVar.d, deVar.c, (TL_stars.StarsTransaction) i51Var.G, deVar.b);
                    break;
                }
                break;
            default:
                ss ssVar = (ss) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.i51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !ssVar.X;
                        ssVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
                    if (user != null && ssVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ssVar.getParentActivity(), 0, ssVar.r);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.mf(20, ssVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ y0(mj mjVar, boolean z10) {
        this.a = 18;
        this.b = mjVar;
    }

    @Override // org.telegram.ui.Components.ao0
    public /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        org.telegram.ui.ActionBar.d5 d5Var5;
        switch (this.a) {
            case 18:
                bo boVar = ((mj) this.b).b.b;
                boVar.qa(boVar.d4, true);
                break;
            case 19:
                bo boVar2 = ((xl) this.b).b;
                if (z10) {
                    boVar2.Q7();
                    UndoView undoView = boVar2.y3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                ur urVar = ((mr) this.b).b;
                if (z10) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) urVar).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) urVar).parentLayout;
                        List fragmentStack = d5Var2.getFragmentStack();
                        d5Var3 = ((org.telegram.ui.ActionBar.n2) urVar).parentLayout;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 2);
                        if (n2Var instanceof wo) {
                            n2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", urVar.N);
                            wo woVar = new wo(bundle);
                            woVar.l0(urVar.s);
                            d5Var4 = ((org.telegram.ui.ActionBar.n2) urVar).parentLayout;
                            d5Var5 = ((org.telegram.ui.ActionBar.n2) urVar).parentLayout;
                            ((ActionBarLayout) d5Var4).c(d5Var5.getFragmentStack().size() - 1, woVar);
                            urVar.finishFragment();
                            woVar.c.j(76, 0L, null);
                            break;
                        } else {
                            urVar.finishFragment();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.b).setClickable(false);
    }

    private final /* synthetic */ void m(View view, float f7, float f10) {
    }

    private final /* synthetic */ void n(View view, float f7, float f10) {
    }

    private final /* synthetic */ void o(View view, float f7, float f10) {
    }
}
