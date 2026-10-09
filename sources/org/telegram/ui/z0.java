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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements org.telegram.ui.Components.fp0, ei.n4, wh1, r0.n, org.telegram.ui.ActionBar.a2, rg.t, org.telegram.ui.Components.se0, org.telegram.ui.Components.fm0, org.telegram.ui.Components.vw0, ai.fc, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.rk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        r4 r4Var = (r4) mVar.d;
        if (r4Var == view && (k0Var = r4Var.b) != null) {
            k0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.wh1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(7, (m4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.fp0
    public void b(float f7) {
        a1 a1Var = (a1) this.b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.p61 G;
        Object obj;
        long j3;
        switch (this.a) {
            case 7:
                a6 a6Var = (a6) this.b;
                ArrayList arrayList = a6Var.c;
                if (((z5) arrayList.get(i10)).a != 1) {
                    if (((z5) arrayList.get(i10)).a != 2) {
                        if (((z5) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.N(a6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new nu0(a6Var, 13), null).a;
                            b2Var.show();
                            b2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).c;
                        p80 p80Var = new p80(view.getContext(), a6Var);
                        p80Var.g(false);
                        p80Var.setParentWindow(org.telegram.ui.Components.g5.P(a6Var, p80Var, view, f7, f10));
                        p80Var.setCallback(new x5(a6Var, keepMediaException, 0));
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = a6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    ty tyVar = new ty(bundle);
                    tyVar.C2 = new o(3, a6Var, tyVar);
                    a6Var.presentFragment(tyVar);
                    break;
                }
                break;
            case 28:
                bu buVar = (bu) this.b;
                HashSet hashSet = buVar.b0;
                if (!buVar.c0 && (G = buVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
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

    @Override // org.telegram.ui.Components.rk0
    public void e(ArrayList arrayList) {
        hi hiVar = (hi) this.b;
        zn znVar = hiVar.p;
        if (znVar.getParentActivity() == null || znVar.getParentActivity() == null) {
            return;
        }
        gi giVar = new gi(hiVar, znVar, znVar.getParentActivity(), znVar.ea, arrayList);
        giVar.setCalcMandatoryInsets(znVar.C9());
        giVar.setDimBehind(false);
        znVar.D7(false);
        znVar.showDialog(giVar);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 8:
                o6 o6Var = (o6) this.b;
                n6 n6Var = new n6(o6Var.getContext(), false);
                n6Var.fixNavigationBar();
                n6Var.setCanDismissWithSwipe(false);
                n6Var.setCancelable(false);
                Context context = o6Var.getContext();
                q6 q6Var = new q6(context);
                org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(context);
                fk0Var.setAutoRepeat(true);
                fk0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                q6Var.addView(fk0Var, w7.x5.a(150.0f, 0.0f, 16.0f, 0.0f, 0.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 49));
                fk0Var.d();
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
                q6Var.a = r6Var;
                org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.g;
                r6Var.b(0.35f, 120L, hsVar);
                r6Var.setGravity(1);
                int i14 = org.telegram.ui.ActionBar.i6.j5;
                r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                r6Var.setTextSize(AndroidUtilities.dp(24.0f));
                r6Var.setTypeface(AndroidUtilities.bold());
                q6Var.addView(r6Var, w7.x5.a(32.0f, 0.0f, 176.0f, 0.0f, 0.0f, -1, 49));
                p6 p6Var = new p6(context);
                Paint paint = new Paint(1);
                p6Var.b = paint;
                Paint paint2 = new Paint(1);
                p6Var.c = paint2;
                p6Var.e = new org.telegram.ui.Components.g6(p6Var, 350L, hsVar);
                int i15 = org.telegram.ui.ActionBar.i6.N6;
                paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
                paint2.setColor(org.telegram.ui.ActionBar.i6.m1(0.2f, org.telegram.ui.ActionBar.i6.x0(null, i15, false)));
                q6Var.b = p6Var;
                q6Var.addView(p6Var, w7.x5.a(5.0f, 0.0f, 226.0f, 0.0f, 0.0f, 240, 49));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.q.m(16.0f, org.telegram.ui.ActionBar.i6.x0(null, i14, false), 1, textView);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                q6Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 261.0f, 0.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                q6Var.addView(textView2, w7.x5.a(-2.0f, 0.0f, 289.0f, 0.0f, 0.0f, 240, 49));
                q6Var.a(0.0f);
                n6Var.setCustomView(q6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(o6Var, q6Var, fArr, zArr2, 2);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(o6Var, zArr, jArr, n6Var, 3), 150L);
                y6 y6Var = o6Var.d;
                l6 l6Var = new l6(fArr, zArr2, n5Var, i12);
                m6 m6Var = new m6(zArr, q6Var, jArr, n6Var, 0);
                zh.b bVar = y6Var.Y;
                if (bVar != null) {
                    bVar.d();
                }
                v6 v6Var = y6Var.N;
                if (v6Var != null) {
                    v6Var.d();
                    y6Var.N.e(false);
                }
                y6Var.getFileLoader().cancelLoadAllFiles();
                y6Var.getFileLoader().getFileLoaderQueue().postRunnable(new e6(y6Var, l6Var, m6Var, i12));
                y6Var.Y = null;
                v6 v6Var2 = y6Var.N;
                if (v6Var2 != null) {
                    v6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 12:
                md.U((md) this.b, b2Var);
                break;
            case 15:
                ((tg) this.b).run();
                break;
            case 17:
                zn znVar = ((oj) this.b).b;
                znVar.finishFragment();
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, znVar.P3);
                break;
            case 21:
                zn znVar2 = ((dm) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(znVar2.T5, true, true);
                break;
            case 22:
                up upVar = (up) this.b;
                boolean z10 = upVar.s;
                if (!z10 || upVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(upVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(upVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(upVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new kp(upVar, b2VarArr, upVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new oo(i13, upVar, b2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((xq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vw0
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // ai.fc
    public void h(Canvas canvas, RectF rectF, float f7) {
        g8 g8Var = (g8) ((g) this.b).b;
        Paint paint = g8Var.w;
        TextPaint textPaint = g8Var.e;
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
            canvas.drawText(Integer.toString(g8Var.h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.Components.se0
    public void i(org.telegram.ui.Components.te0 te0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, te0Var);
    }

    @Override // ei.n4
    public void j(boolean z10) {
        m3 m3Var = (m3) this.b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    public void k(String str) {
        zn znVar = ((mm) this.b).Q;
        if (str.startsWith("@")) {
            znVar.getMessagesController().openByUserName(str.substring(1), znVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            ty tyVar = new ty(null);
            tyVar.n2 = str;
            znVar.presentFragment(tyVar);
        } else {
            if (!str.startsWith("/")) {
                znVar.Ba(0, str, null, null, false);
                return;
            }
            znVar.Y.Y0(null, str, false, false);
            if (znVar.Y.getFieldText() == null) {
                znVar.j9(false);
            }
        }
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        v9 v9Var = (v9) this.b;
        HandlerThread handlerThread = v9Var.d;
        handlerThread.start();
        v9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(v9Var.e0, 0L);
        if (v9Var.a0()) {
            o1.k kVar = v9Var.y;
            if (kVar != null) {
                kVar.c();
                v9Var.y = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            v9Var.y = kVar2;
            int i10 = 0;
            kVar2.b(new l9(v9Var, i10));
            v9Var.y.a(new m9(v9Var, i10));
            v9Var.y.u = new o1.l(500.0f);
            v9Var.y.u.a(0.8f);
            v9Var.y.u.b(250.0f);
            v9Var.y.h();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                ee eeVar = (ee) this.b;
                org.telegram.ui.Components.p61 p61Var = (org.telegram.ui.Components.p61) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f;
                Object obj6 = p61Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        ke.h0(eeVar.getContext(), eeVar.c, (TL_stats.BroadcastRevenueTransaction) p61Var.G, geVar.d, eeVar.b);
                        break;
                    }
                } else {
                    yh.p7.i1(eeVar.getContext(), true, geVar.d, eeVar.c, (TL_stars.StarsTransaction) p61Var.G, eeVar.b);
                    break;
                }
                break;
            default:
                qs qsVar = (qs) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.p61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !qsVar.X;
                        qsVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
                    if (user != null && qsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qsVar.getParentActivity(), 0, qsVar.r);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y2(22, qsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z0(nj njVar, boolean z10) {
        this.a = 18;
        this.b = njVar;
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.ui.Components.vw0
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
                zn znVar = ((nj) this.b).b.b;
                znVar.va(znVar.d4, true);
                break;
            case 19:
                zn znVar2 = ((xl) this.b).b;
                if (z10) {
                    znVar2.T7();
                    UndoView undoView = znVar2.y3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                tr trVar = ((kr) this.b).b;
                if (z10) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) trVar).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) trVar).parentLayout;
                        List fragmentStack = d5Var2.getFragmentStack();
                        d5Var3 = ((org.telegram.ui.ActionBar.n2) trVar).parentLayout;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 2);
                        if (n2Var instanceof uo) {
                            n2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", trVar.N);
                            uo uoVar = new uo(bundle);
                            uoVar.l0(trVar.s);
                            d5Var4 = ((org.telegram.ui.ActionBar.n2) trVar).parentLayout;
                            d5Var5 = ((org.telegram.ui.ActionBar.n2) trVar).parentLayout;
                            ((ActionBarLayout) d5Var4).c(d5Var5.getFragmentStack().size() - 1, uoVar);
                            trVar.finishFragment();
                            uoVar.c.j(76, 0L, null);
                            break;
                        } else {
                            trVar.finishFragment();
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
