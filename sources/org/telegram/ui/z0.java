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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements org.telegram.ui.Components.to0, ei.p4, lh1, r0.n, org.telegram.ui.ActionBar.a2, rg.t, org.telegram.ui.Components.de0, org.telegram.ui.Components.nl0, org.telegram.ui.Components.zv0, org.telegram.ui.Components.pw0, ai.ec, org.telegram.ui.Components.al0, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.zj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
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

    @Override // org.telegram.ui.lh1
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(4, (n4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.to0
    public void b(float f7) {
        a1 a1Var = (a1) this.b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        b6 b6Var = (b6) this.b;
        ArrayList arrayList = b6Var.c;
        if (((a6) arrayList.get(i10)).a != 1) {
            if (((a6) arrayList.get(i10)).a == 2) {
                CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).c;
                o80 o80Var = new o80(view.getContext(), b6Var);
                o80Var.g(false);
                o80Var.setParentWindow(org.telegram.ui.Components.e5.Q(b6Var, o80Var, view, f7, f10));
                o80Var.setCallback(new y5(b6Var, keepMediaException, 0));
                return;
            }
            if (((a6) arrayList.get(i10)).a == 4) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new hu0(b6Var, 13), null).a;
                b2Var.show();
                b2Var.h();
                return;
            }
            return;
        }
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
        uyVar.C2 = new o(3, b6Var, uyVar);
        b6Var.presentFragment(uyVar);
    }

    @Override // org.telegram.ui.Components.al0
    public void e() {
        ((li.p) this.b).g();
    }

    @Override // org.telegram.ui.Components.zj0
    public void f(ArrayList arrayList) {
        fi fiVar = (fi) this.b;
        yn ynVar = fiVar.p;
        if (ynVar.getParentActivity() == null || ynVar.getParentActivity() == null) {
            return;
        }
        ei eiVar = new ei(fiVar, ynVar, ynVar.getParentActivity(), ynVar.ca, arrayList);
        eiVar.setCalcMandatoryInsets(ynVar.w9());
        eiVar.setDimBehind(false);
        ynVar.A7(false);
        ynVar.showDialog(eiVar);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 9:
                r6 r6Var = (r6) this.b;
                q6 q6Var = new q6(r6Var.getContext(), false);
                q6Var.fixNavigationBar();
                q6Var.setCanDismissWithSwipe(false);
                q6Var.setCancelable(false);
                Context context = r6Var.getContext();
                t6 t6Var = new t6(context);
                org.telegram.ui.Components.nj0 nj0Var = new org.telegram.ui.Components.nj0(context);
                nj0Var.setAutoRepeat(true);
                nj0Var.f(R.raw.utyan_cache, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, null);
                t6Var.addView(nj0Var, w7.z5.d(ImageReceiver.DEFAULT_CROSSFADE_DURATION, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                nj0Var.d();
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
                t6Var.a = p6Var;
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.g;
                p6Var.b(0.35f, 120L, trVar);
                p6Var.setGravity(1);
                int i14 = org.telegram.ui.ActionBar.i6.j5;
                p6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                p6Var.setTextSize(AndroidUtilities.dp(24.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                t6Var.addView(p6Var, w7.z5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                s6 s6Var = new s6(context);
                Paint paint = new Paint(1);
                s6Var.b = paint;
                Paint paint2 = new Paint(1);
                s6Var.c = paint2;
                s6Var.e = new org.telegram.ui.Components.e6(s6Var, 350L, trVar);
                int i15 = org.telegram.ui.ActionBar.i6.N6;
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(0.2f, org.telegram.ui.ActionBar.i6.w0(null, i15, false)));
                t6Var.b = s6Var;
                t6Var.addView(s6Var, w7.z5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.q.q(textView, org.telegram.ui.ActionBar.i6.w0(null, i14, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                t6Var.addView(textView, w7.z5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                t6Var.addView(textView2, w7.z5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                t6Var.a(0.0f);
                q6Var.setCustomView(t6Var);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(r6Var, t6Var, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(r6Var, zArr, jArr, q6Var, 2), 150L);
                a7 a7Var = r6Var.d;
                o6 o6Var = new o6(fArr, zArr2, m5Var, i12);
                p6 p6Var2 = new p6(zArr, t6Var, jArr, q6Var, 0);
                zh.b bVar = a7Var.e0;
                if (bVar != null) {
                    bVar.d();
                }
                k6 k6Var = a7Var.M;
                if (k6Var != null) {
                    k6Var.e();
                    a7Var.M.f(false);
                }
                a7Var.getFileLoader().cancelLoadAllFiles();
                a7Var.getFileLoader().getFileLoaderQueue().postRunnable(new h6(a7Var, o6Var, p6Var2, i12));
                a7Var.e0 = null;
                k6 k6Var2 = a7Var.M;
                if (k6Var2 != null) {
                    k6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 14:
                nd.S((nd) this.b, b2Var);
                break;
            case 17:
                ((ug) this.b).run();
                break;
            case 19:
                yn ynVar = ((lj) this.b).b;
                ynVar.finishFragment();
                ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, ynVar.N3);
                break;
            case 23:
                yn ynVar2 = ((am) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) ynVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(ynVar2.R5, true, true);
                break;
            case 24:
                tp tpVar = (tp) this.b;
                boolean z10 = tpVar.s;
                if (!z10 || tpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(tpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(tpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(tpVar.f);
                    }
                    AndroidUtilities.runOnUIThread(new jp(tpVar, b2VarArr, tpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new no(i13, tpVar, b2VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((wq) this.b).run(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zv0
    public /* synthetic */ float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c1.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.zv0
    public RecyclerView i(View view) {
        ((v7) this.b).getClass();
        return v7.c(view);
    }

    @Override // org.telegram.ui.Components.pw0
    public void j(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // ai.ec
    public void k(Canvas canvas, RectF rectF, float f7) {
        k8 k8Var = (k8) ((g) this.b).b;
        Paint paint = k8Var.w;
        TextPaint textPaint = k8Var.e;
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
            canvas.drawText(Integer.toString(k8Var.h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.Components.de0
    public void m(org.telegram.ui.Components.ee0 ee0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ee0Var);
    }

    @Override // org.telegram.ui.Components.zv0
    public /* synthetic */ void n(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c1.b(recyclerView);
    }

    @Override // ei.p4
    public void o(boolean z10) {
        m3 m3Var = (m3) this.b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        w9 w9Var = (w9) this.b;
        HandlerThread handlerThread = w9Var.d;
        handlerThread.start();
        w9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(w9Var.c0, 0L);
        if (w9Var.Z()) {
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

    public void p(String str) {
        yn ynVar = ((jm) this.b).Q;
        if (str.startsWith("@")) {
            ynVar.getMessagesController().openByUserName(str.substring(1), ynVar, 0);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            uy uyVar = new uy(null);
            uyVar.n2 = str;
            ynVar.presentFragment(uyVar);
        } else {
            if (!str.startsWith("/")) {
                ynVar.wa(0, str, null, null, false);
                return;
            }
            ynVar.W.Z0(null, str, false, false);
            if (ynVar.W.getFieldText() == null) {
                ynVar.f9(false);
            }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 15:
                ge geVar = (ge) this.b;
                org.telegram.ui.Components.h61 h61Var = (org.telegram.ui.Components.h61) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ie ieVar = geVar.f;
                Object obj6 = h61Var.G;
                if (!(obj6 instanceof TL_stars.StarsTransaction)) {
                    if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                        me.M(geVar.getContext(), geVar.c, (TL_stats.BroadcastRevenueTransaction) h61Var.G, ieVar.e, geVar.b);
                        break;
                    }
                } else {
                    yh.z7.n1(geVar.getContext(), true, ieVar.e, geVar.c, (TL_stars.StarsTransaction) h61Var.G, geVar.b);
                    break;
                }
                break;
            default:
                qs qsVar = (qs) this.b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.h61) obj).d;
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
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(23, qsVar, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z0(kj kjVar, boolean z10) {
        this.a = 20;
        this.b = kjVar;
    }

    @Override // org.telegram.ui.Components.to0
    public /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.ui.Components.pw0
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
            case 20:
                yn ynVar = ((kj) this.b).b.b;
                ynVar.pa(ynVar.b4, true);
                break;
            case 21:
                yn ynVar2 = ((tl) this.b).b;
                if (z10) {
                    ynVar2.Q7();
                    UndoView undoView = ynVar2.w3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                rr rrVar = ((jr) this.b).b;
                if (z10) {
                    c5Var = ((org.telegram.ui.ActionBar.n2) rrVar).parentLayout;
                    if (c5Var != null) {
                        c5Var2 = ((org.telegram.ui.ActionBar.n2) rrVar).parentLayout;
                        List fragmentStack = c5Var2.getFragmentStack();
                        c5Var3 = ((org.telegram.ui.ActionBar.n2) rrVar).parentLayout;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var3.getFragmentStack().size() - 2);
                        if (n2Var instanceof to) {
                            n2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rrVar.N);
                            to toVar = new to(bundle);
                            toVar.l0(rrVar.s);
                            c5Var4 = ((org.telegram.ui.ActionBar.n2) rrVar).parentLayout;
                            c5Var5 = ((org.telegram.ui.ActionBar.n2) rrVar).parentLayout;
                            ((ActionBarLayout) c5Var4).c(c5Var5.getFragmentStack().size() - 1, toVar);
                            rrVar.finishFragment();
                            toVar.c.j(76, 0L, null);
                            break;
                        } else {
                            rrVar.finishFragment();
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

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
