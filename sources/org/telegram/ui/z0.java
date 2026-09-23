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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements org.telegram.ui.Components.ao0, ei.o4, nh1, r0.n, org.telegram.ui.ActionBar.a2, rg.t, org.telegram.ui.Components.rd0, org.telegram.ui.Components.bl0, org.telegram.ui.Components.sv0, ai.ec, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.nj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        s4 s4Var = (s4) mVar.d;
        if (s4Var == view && (k0Var = s4Var.b) != null) {
            k0Var.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.nh1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new m4(0, (n4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.ao0
    public void b(float f7) {
        a1 a1Var = (a1) this.b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.h51 G;
        Object obj;
        long j3;
        switch (this.a) {
            case 7:
                b6 b6Var = (b6) this.b;
                ArrayList arrayList = b6Var.c;
                if (((a6) arrayList.get(i10)).a != 1) {
                    if (((a6) arrayList.get(i10)).a != 2) {
                        if (((a6) arrayList.get(i10)).a == 4) {
                            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new fu0(b6Var, 13), null).a;
                            b2Var.show();
                            b2Var.h();
                            break;
                        }
                    } else {
                        CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).c;
                        m80 m80Var = new m80(view.getContext(), b6Var);
                        m80Var.g(false);
                        m80Var.setParentWindow(org.telegram.ui.Components.e5.Q(b6Var, m80Var, view, f7, f10));
                        m80Var.setCallback(new y5(b6Var, keepMediaException, 0));
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
                    ry ryVar = new ry(bundle);
                    ryVar.C2 = new u(2, b6Var, ryVar);
                    b6Var.presentFragment(ryVar);
                    break;
                }
                break;
            case 28:
                zt ztVar = (zt) this.b;
                HashSet hashSet = ztVar.b0;
                if (!ztVar.c0 && (G = ztVar.d0.G(i10 - 1)) != null && (obj = G.G) != null) {
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

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        switch (this.a) {
            case 7:
                break;
            case 28:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nj0
    public void e(ArrayList arrayList) {
        ei eiVar = (ei) this.b;
        xn xnVar = eiVar.p;
        if (xnVar.getParentActivity() == null || xnVar.getParentActivity() == null) {
            return;
        }
        di diVar = new di(eiVar, xnVar, xnVar.getParentActivity(), xnVar.ea, arrayList);
        diVar.setCalcMandatoryInsets(xnVar.x9());
        diVar.setDimBehind(false);
        xnVar.A7(false);
        xnVar.showDialog(diVar);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 4:
                i5 i5Var = (i5) this.b;
                i5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    i5Var.startActivity(intent);
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
                org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(context);
                bj0Var.setAutoRepeat(true);
                bj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                r6Var.addView(bj0Var, w7.x5.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                bj0Var.d();
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, true, true);
                r6Var.a = p6Var2;
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.g;
                p6Var2.b(0.35f, 120L, rrVar);
                p6Var2.setGravity(1);
                int i14 = org.telegram.ui.ActionBar.h6.j5;
                p6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                p6Var2.setTextSize(AndroidUtilities.dp(24.0f));
                p6Var2.setTypeface(AndroidUtilities.bold());
                r6Var.addView(p6Var2, w7.x5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                q6 q6Var = new q6(context);
                Paint paint = new Paint(1);
                q6Var.b = paint;
                Paint paint2 = new Paint(1);
                q6Var.c = paint2;
                q6Var.e = new org.telegram.ui.Components.e6(q6Var, 350L, rrVar);
                int i15 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.l1(0.2f, org.telegram.ui.ActionBar.h6.w0(null, i15, false)));
                r6Var.b = q6Var;
                r6Var.addView(q6Var, w7.x5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.z0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, i14, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                r6Var.addView(textView, w7.x5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                r6Var.addView(textView2, w7.x5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                r6Var.a(0.0f);
                o6Var.setCustomView(r6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(p6Var, r6Var, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(p6Var, zArr, jArr, o6Var, 2), 150L);
                z6 z6Var = p6Var.d;
                m6 m6Var = new m6(fArr, zArr2, m5Var, i12);
                n6 n6Var = new n6(zArr, r6Var, jArr, o6Var, 0);
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
                z6Var.getFileLoader().getFileLoaderQueue().postRunnable(new f6(z6Var, m6Var, n6Var, i12));
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
                ((sg) this.b).run();
                break;
            case 17:
                xn xnVar = ((kj) this.b).b;
                xnVar.finishFragment();
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, xnVar.P3);
                break;
            case 21:
                xn xnVar2 = ((bm) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) xnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(xnVar2.T5, true, true);
                break;
            case 22:
                sp spVar = (sp) this.b;
                boolean z10 = spVar.s;
                if (!z10 || spVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(spVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(spVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(spVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new ip(spVar, b2VarArr, spVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new mo(i13, spVar, b2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((vq) this.b).run(1);
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
        m3 m3Var = (m3) this.b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    public void k(String str) {
        xn xnVar = ((km) this.b).Q;
        if (str.startsWith("@")) {
            xnVar.getMessagesController().openByUserName(str.substring(1), xnVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            ry ryVar = new ry(null);
            ryVar.n2 = str;
            xnVar.presentFragment(ryVar);
        } else {
            if (!str.startsWith("/")) {
                xnVar.xa(0, str, null, null, false);
                return;
            }
            xnVar.Y.b1(null, str, false, false);
            if (xnVar.Y.getFieldText() == null) {
                xnVar.e9(false);
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

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                de deVar = (de) this.b;
                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                fe feVar = deVar.f;
                Object obj6 = h51Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        je.h0(deVar.getContext(), deVar.c, (TL_stats.BroadcastRevenueTransaction) h51Var.G, feVar.d, deVar.b);
                        break;
                    }
                } else {
                    yh.w7.h1(deVar.getContext(), true, feVar.d, deVar.c, (TL_stars.StarsTransaction) h51Var.G, deVar.b);
                    break;
                }
                break;
            default:
                ns nsVar = (ns) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.h51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !nsVar.X;
                        nsVar.X = z10;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H));
                    if (user != null && nsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nsVar.getParentActivity(), 0, nsVar.r);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.b3(21, nsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z0(jj jjVar, boolean z10) {
        this.a = 18;
        this.b = jjVar;
    }

    @Override // org.telegram.ui.Components.ao0
    public /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.c5 c5Var3;
        org.telegram.ui.ActionBar.c5 c5Var4;
        org.telegram.ui.ActionBar.c5 c5Var5;
        switch (this.a) {
            case 18:
                xn xnVar = ((jj) this.b).b.b;
                xnVar.qa(xnVar.d4, true);
                break;
            case 19:
                xn xnVar2 = ((ul) this.b).b;
                if (z10) {
                    xnVar2.Q7();
                    UndoView undoView = xnVar2.y3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                qr qrVar = ((ir) this.b).b;
                if (z10) {
                    c5Var = ((org.telegram.ui.ActionBar.n2) qrVar).parentLayout;
                    if (c5Var != null) {
                        c5Var2 = ((org.telegram.ui.ActionBar.n2) qrVar).parentLayout;
                        List fragmentStack = c5Var2.getFragmentStack();
                        c5Var3 = ((org.telegram.ui.ActionBar.n2) qrVar).parentLayout;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var3.getFragmentStack().size() - 2);
                        if (n2Var instanceof so) {
                            n2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qrVar.N);
                            so soVar = new so(bundle);
                            soVar.l0(qrVar.s);
                            c5Var4 = ((org.telegram.ui.ActionBar.n2) qrVar).parentLayout;
                            c5Var5 = ((org.telegram.ui.ActionBar.n2) qrVar).parentLayout;
                            ((ActionBarLayout) c5Var4).c(c5Var5.getFragmentStack().size() - 1, soVar);
                            qrVar.finishFragment();
                            soVar.c.j(76, 0L, null);
                            break;
                        } else {
                            qrVar.finishFragment();
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
