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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements org.telegram.ui.Components.bo0, ei.o4, uh1, r0.n, org.telegram.ui.ActionBar.b2, rg.t, org.telegram.ui.Components.rd0, org.telegram.ui.Components.bl0, org.telegram.ui.Components.tv0, ai.ec, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.nj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
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

    @Override // org.telegram.ui.uh1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new l4(0, (m4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.bo0
    public void b(float f7) {
        z0 z0Var = (z0) this.b;
        MessageObject messageObject = z0Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(z0Var.M, f7);
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.j51 G;
        Object obj;
        long j3;
        switch (this.a) {
            case 7:
                b6 b6Var = (b6) this.b;
                ArrayList arrayList = b6Var.c;
                if (((a6) arrayList.get(i10)).a != 1) {
                    if (((a6) arrayList.get(i10)).a != 2) {
                        if (((a6) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ou0(b6Var, 13), null).a;
                            c2Var.show();
                            c2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).c;
                        r80 r80Var = new r80(view.getContext(), b6Var);
                        r80Var.g(false);
                        r80Var.setParentWindow(org.telegram.ui.Components.c5.Q(b6Var, r80Var, view, f7, f10));
                        r80Var.setCallback(new y5(b6Var, keepMediaException, 0));
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
                    wy wyVar = new wy(bundle);
                    wyVar.C2 = new x5(0, b6Var, wyVar);
                    b6Var.presentFragment(wyVar);
                    break;
                }
                break;
            default:
                eu euVar = (eu) this.b;
                HashSet hashSet = euVar.b0;
                if (!euVar.c0 && (G = euVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
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
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nj0
    public void e(ArrayList arrayList) {
        ii iiVar = (ii) this.b;
        bo boVar = iiVar.p;
        if (boVar.getParentActivity() == null || boVar.getParentActivity() == null) {
            return;
        }
        hi hiVar = new hi(iiVar, boVar, boVar.getParentActivity(), boVar.ea, arrayList);
        hiVar.setCalcMandatoryInsets(boVar.x9());
        hiVar.setDimBehind(false);
        boVar.A7(false);
        boVar.showDialog(hiVar);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
                q6 q6Var = (q6) this.b;
                p6 p6Var = new p6(q6Var.getContext(), false);
                p6Var.fixNavigationBar();
                p6Var.setCanDismissWithSwipe(false);
                p6Var.setCancelable(false);
                Context context = q6Var.getContext();
                s6 s6Var = new s6(context);
                org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(context);
                bj0Var.setAutoRepeat(true);
                bj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                s6Var.addView(bj0Var, w7.x5.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                bj0Var.d();
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
                s6Var.a = n6Var;
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.g;
                n6Var.b(0.35f, 120L, qrVar);
                n6Var.setGravity(1);
                int i14 = org.telegram.ui.ActionBar.j6.j5;
                n6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                n6Var.setTextSize(AndroidUtilities.dp(24.0f));
                n6Var.setTypeface(AndroidUtilities.bold());
                s6Var.addView(n6Var, w7.x5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                r6 r6Var = new r6(context);
                Paint paint = new Paint(1);
                r6Var.b = paint;
                Paint paint2 = new Paint(1);
                r6Var.c = paint2;
                r6Var.e = new org.telegram.ui.Components.c6(r6Var, 350L, qrVar);
                int i15 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, i15, false)));
                s6Var.b = r6Var;
                s6Var.addView(r6Var, w7.x5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i14, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                s6Var.addView(textView, w7.x5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                s6Var.addView(textView2, w7.x5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                s6Var.a(0.0f);
                p6Var.setCustomView(s6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.o5 o5Var = new org.telegram.ui.ActionBar.o5(q6Var, s6Var, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(q6Var, zArr, jArr, p6Var, 2), 150L);
                a7 a7Var = q6Var.d;
                n6 n6Var2 = new n6(fArr, zArr2, o5Var, i12);
                o6 o6Var = new o6(zArr, s6Var, jArr, p6Var, 0);
                zh.b bVar = a7Var.c0;
                if (bVar != null) {
                    bVar.d();
                }
                x6 x6Var = a7Var.M;
                if (x6Var != null) {
                    x6Var.e();
                    a7Var.M.f(false);
                }
                a7Var.getFileLoader().cancelLoadAllFiles();
                a7Var.getFileLoader().getFileLoaderQueue().postRunnable(new g6(a7Var, n6Var2, o6Var, i12));
                a7Var.c0 = null;
                x6 x6Var2 = a7Var.M;
                if (x6Var2 != null) {
                    x6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 13:
                nd.U((nd) this.b, c2Var);
                break;
            case 16:
                ((wg) this.b).run();
                break;
            case 18:
                bo boVar = ((oj) this.b).b;
                boVar.finishFragment();
                boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, boVar.P3);
                break;
            case 22:
                bo boVar2 = ((em) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.o2) boVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(boVar2.T5, true, true);
                break;
            case 23:
                wp wpVar = (wp) this.b;
                boolean z10 = wpVar.s;
                if (!z10 || wpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(wpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(wpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(wpVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new mp(wpVar, c2VarArr, wpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new qo(i13, wpVar, c2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((zq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // ai.ec
    public void h(Canvas canvas, RectF rectF, float f7) {
        j8 j8Var = (j8) ((g) this.b).b;
        Paint paint = j8Var.w;
        TextPaint textPaint = j8Var.e;
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
            canvas.drawText(Integer.toString(j8Var.h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
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
            wy wyVar = new wy(null);
            wyVar.n2 = str;
            boVar.presentFragment(wyVar);
        } else {
            if (!str.startsWith("/")) {
                boVar.xa(0, str, null, null, false);
                return;
            }
            boVar.Y.a1(null, str, false, false);
            if (boVar.Y.getFieldText() == null) {
                boVar.e9(false);
            }
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        w9 w9Var = (w9) this.b;
        HandlerThread handlerThread = w9Var.d;
        handlerThread.start();
        w9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(w9Var.c0, 0L);
        if (w9Var.a0()) {
            o1.k kVar = w9Var.x;
            if (kVar != null) {
                kVar.c();
                w9Var.x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            w9Var.x = kVar2;
            int i10 = 0;
            kVar2.b(new o9(w9Var, i10));
            w9Var.x.a(new p9(w9Var, i10));
            w9Var.x.u = new o1.l(500.0f);
            w9Var.x.u.a(0.8f);
            w9Var.x.u.b(250.0f);
            w9Var.x.f();
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 14:
                fe feVar = (fe) this.b;
                org.telegram.ui.Components.j51 j51Var = (org.telegram.ui.Components.j51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                he heVar = feVar.f;
                Object obj6 = j51Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        le.h0(feVar.getContext(), feVar.c, (TL_stats.BroadcastRevenueTransaction) j51Var.G, heVar.d, feVar.b);
                        break;
                    }
                } else {
                    yh.y7.h1(feVar.getContext(), true, heVar.d, feVar.c, (TL_stars.StarsTransaction) j51Var.G, feVar.b);
                    break;
                }
                break;
            default:
                us usVar = (us) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.j51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !usVar.X;
                        usVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = usVar.getMessagesController().getUser(Long.valueOf(usVar.H));
                    if (user != null && usVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(usVar.getParentActivity(), 0, usVar.r);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.mf(20, usVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ y0(nj njVar, boolean z10) {
        this.a = 19;
        this.b = njVar;
    }

    @Override // org.telegram.ui.Components.bo0
    public /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        org.telegram.ui.ActionBar.e5 e5Var4;
        org.telegram.ui.ActionBar.e5 e5Var5;
        switch (this.a) {
            case 19:
                bo boVar = ((nj) this.b).b.b;
                boVar.qa(boVar.d4, true);
                break;
            case 20:
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
                    e5Var = ((org.telegram.ui.ActionBar.o2) urVar).parentLayout;
                    if (e5Var != null) {
                        e5Var2 = ((org.telegram.ui.ActionBar.o2) urVar).parentLayout;
                        List fragmentStack = e5Var2.getFragmentStack();
                        e5Var3 = ((org.telegram.ui.ActionBar.o2) urVar).parentLayout;
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(e5Var3.getFragmentStack().size() - 2);
                        if (o2Var instanceof wo) {
                            o2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", urVar.N);
                            wo woVar = new wo(bundle);
                            woVar.l0(urVar.s);
                            e5Var4 = ((org.telegram.ui.ActionBar.o2) urVar).parentLayout;
                            e5Var5 = ((org.telegram.ui.ActionBar.o2) urVar).parentLayout;
                            ((ActionBarLayout) e5Var4).c(e5Var5.getFragmentStack().size() - 1, woVar);
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
}
